/*
* Copyright (c) 2012 Vienna University of Technology.
* All rights reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License v1.0 which accompanies 
* this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
* 
* Contributors:
* Philip Langer - initial API and generator
*/
package org.modelexecution.fuml.convert.uml2.internal.gen;
    	
import javax.annotation.Generated;
import org.modelexecution.fuml.convert.impl.ConversionResultImpl;
import org.modelexecution.fuml.convert.uml2.internal.IElementPopulator;

@Generated(value="Generated by org.modelexecution.fuml.convert.uml2.gen.ElementPopulatorGenerator.xtend")
public class PropertyPopulator implements IElementPopulator {

	@Override
	public void populate(fUML.Syntax.Classes.Kernel.Element fumlElement,
		org.eclipse.uml2.uml.Element uml2Element, ConversionResultImpl result) {
		
		fUML.Syntax.Classes.Kernel.Property fumlNamedElement = (fUML.Syntax.Classes.Kernel.Property) fumlElement;
		org.eclipse.uml2.uml.Property uml2NamedElement = (org.eclipse.uml2.uml.Property) uml2Element;
		
		fumlNamedElement.isDerived = uml2NamedElement.isDerived();
		fumlNamedElement.isDerivedUnion = uml2NamedElement.isDerivedUnion();
		fumlNamedElement.aggregation = castAggregationKind(uml2NamedElement.getAggregation());
		fumlNamedElement.isComposite = uml2NamedElement.isComposite();
		fumlNamedElement.owningAssociation = (fUML.Syntax.Classes.Kernel.Association) result
							.getFUMLElement(uml2NamedElement.getOwningAssociation());
		fumlNamedElement.association = (fUML.Syntax.Classes.Kernel.Association) result
							.getFUMLElement(uml2NamedElement.getAssociation());
		fumlNamedElement.datatype = (fUML.Syntax.Classes.Kernel.DataType) result
							.getFUMLElement(uml2NamedElement.getDatatype());
		fumlNamedElement.class_ = (fUML.Syntax.Classes.Kernel.Class_) result
							.getFUMLElement(uml2NamedElement.getClass());
		fumlNamedElement.opposite = (fUML.Syntax.Classes.Kernel.Property) result
							.getFUMLElement(uml2NamedElement.getOpposite());
		
	}
	
	private fUML.Syntax.Classes.Kernel.AggregationKind castAggregationKind(org.eclipse.uml2.uml.AggregationKind enumVal) {
		switch (enumVal.getValue()) {
			case org.eclipse.uml2.uml.AggregationKind.NONE:
				return fUML.Syntax.Classes.Kernel.AggregationKind.none;
			case org.eclipse.uml2.uml.AggregationKind.SHARED:
				return fUML.Syntax.Classes.Kernel.AggregationKind.shared;
			case org.eclipse.uml2.uml.AggregationKind.COMPOSITE:
				return fUML.Syntax.Classes.Kernel.AggregationKind.composite;
		}
		return null;
	}
}
