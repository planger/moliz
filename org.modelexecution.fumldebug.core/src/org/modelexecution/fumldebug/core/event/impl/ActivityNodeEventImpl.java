/*
 * Copyright (c) 2012 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tanja Mayerhofer - initial API and implementation
 */
package org.modelexecution.fumldebug.core.event.impl;

import org.modelexecution.fumldebug.core.event.ActivityNodeEvent;
import org.modelexecution.fumldebug.core.event.Event;

import fUML.Syntax.Activities.IntermediateActivities.ActivityNode;

/**
 * 
 * @author Tanja Mayerhofer
 *
 */
public abstract class ActivityNodeEventImpl extends TraceEventImpl implements ActivityNodeEvent{	

	private ActivityNode node;
	
	public ActivityNodeEventImpl(int activityExecutionID, ActivityNode node, Event parent) {
		super(activityExecutionID, parent);
		this.node = node;
	}	
	
	public ActivityNode getNode() {
		return node;
	}
		
}
