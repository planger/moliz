/*
 * Copyright (c) 2012 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 */
package org.modelexecution.xmof.diagram.features;

import static org.modelexecution.xmof.diagram.XMOFDiagramDimensions.ACTION_MIN_HEIGHT;
import static org.modelexecution.xmof.diagram.XMOFDiagramDimensions.ACTION_MIN_WIDTH;
import static org.modelexecution.xmof.diagram.XMOFDiagramDimensions.ACTION_LINE_WIDTH;
import static org.modelexecution.xmof.diagram.XMOFDiagramDimensions.PIN_WIDTH;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.modelexecution.xmof.Syntax.Actions.IntermediateActions.ValueSpecificationAction;

public class LayoutValueSpecificationActionFeature extends
		AbstractLayoutFeature {

	public LayoutValueSpecificationActionFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canLayout(ILayoutContext context) {
		// return true, if pictogram element is linked to an
		// ValueSpecificationAction
		PictogramElement pe = context.getPictogramElement();
		if (!(pe instanceof ContainerShape))
			return false;
		EList<EObject> businessObjects = pe.getLink().getBusinessObjects();
		return businessObjects.size() == 1
				&& businessObjects.get(0) instanceof ValueSpecificationAction;
	}

	@Override
	public boolean layout(ILayoutContext context) {
		boolean anythingChanged = false;
		ContainerShape containerShape = (ContainerShape) context
				.getPictogramElement();
		GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();

		GraphicsAlgorithm actionRectangle = containerGa
				.getGraphicsAlgorithmChildren().get(0);

		int longestPinNameWidth = 40; // TODO compute text width

		// height of invisible rectangle
		// TODO also regard height of pins to display
		if (containerGa.getHeight() < ACTION_MIN_HEIGHT) {
			containerGa.setHeight(ACTION_MIN_HEIGHT);
			anythingChanged = true;
		}

		// width of invisible rectangle
		// TODO also regard width of pins
		if (containerGa.getWidth() < ACTION_MIN_WIDTH) {
			containerGa.setWidth(ACTION_MIN_WIDTH);
			anythingChanged = true;
		}

		// height of visible rectangle (same as invisible rectangle)
		int rectangleHeight = containerGa.getHeight();
		if (actionRectangle.getHeight() != rectangleHeight) {
			actionRectangle.setHeight(rectangleHeight);
			anythingChanged = true;
		}

		// width of visible rectangle (smaller than invisible rectangle)
		int rectangleWidth = containerGa.getWidth() - PIN_WIDTH
				- longestPinNameWidth;
		if (actionRectangle.getWidth() != rectangleWidth) {
			actionRectangle.setWidth(rectangleWidth);
			anythingChanged = true;
		}

		Iterator<Shape> iter = containerShape.getChildren().iterator();
		while (iter.hasNext()) {
			Shape shape = iter.next();
			GraphicsAlgorithm graphicsAlgorithm = shape.getGraphicsAlgorithm();
			IGaService gaService = Graphiti.getGaService();
			IDimension size = gaService.calculateSize(graphicsAlgorithm);
			if (rectangleWidth != size.getWidth()) {
				if (graphicsAlgorithm instanceof Polyline) {
					Polyline polyline = (Polyline) graphicsAlgorithm;
					Point secondPoint = polyline.getPoints().get(1);
					Point newSecondPoint = gaService.createPoint(
							rectangleWidth, secondPoint.getY());
					polyline.getPoints().set(1, newSecondPoint);
					anythingChanged = true;
				} else {
					gaService.setWidth(graphicsAlgorithm, rectangleWidth);
					anythingChanged = true;
				}
			}

			if (rectangleHeight != size.getHeight()) {
				if (graphicsAlgorithm instanceof Polyline) {
					Polyline polyline = (Polyline) graphicsAlgorithm;
					Point secondPoint = polyline.getPoints().get(0);
					Point newSecondPoint = gaService.createPoint(
							rectangleHeight, secondPoint.getY());
					polyline.getPoints().set(0, newSecondPoint);
					anythingChanged = true;
				} else {
					gaService.setHeight(graphicsAlgorithm, rectangleHeight);
					anythingChanged = true;
				}
			}
		}

		// reposition pin anchors
		// TODO differentiate between input and output pins (this only works for
		// output pins)
		for (Anchor anchor : containerShape.getAnchors()) {
			if (actionRectangle.equals(anchor.getReferencedGraphicsAlgorithm())) {
				anchor.getGraphicsAlgorithm().setX(
						rectangleWidth - ACTION_LINE_WIDTH);
			}
		}

		return anythingChanged;
	}

}
