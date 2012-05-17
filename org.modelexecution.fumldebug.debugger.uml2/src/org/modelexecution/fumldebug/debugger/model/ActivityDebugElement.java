/*
 * Copyright (c) 2012 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 */
package org.modelexecution.fumldebug.debugger.model;

import org.eclipse.debug.core.model.DebugElement;
import org.modelexecution.fumldebug.core.ExecutionEventListener;
import org.modelexecution.fumldebug.core.event.Event;
import org.modelexecution.fumldebug.debugger.FUMLDebuggerPlugin;
import org.modelexecution.fumldebug.debugger.process.ActivityProcess;

public abstract class ActivityDebugElement extends DebugElement implements
		ExecutionEventListener {

	public ActivityDebugElement(ActivityDebugTarget target) {
		super(target);
	}

	@Override
	public String getModelIdentifier() {
		return FUMLDebuggerPlugin.ID;
	}

	public ActivityDebugTarget getActivityDebugTarget() {
		return getDebugTarget() != null ? (ActivityDebugTarget) getDebugTarget()
				: null;
	}

	protected ActivityProcess getActivityProcess() {
		return getActivityDebugTarget() != null ? getActivityDebugTarget()
				.getActivityProcess() : null;
	}

	protected void processMissedEvents() {
		for (Event event : getActivityProcess().getAllEvents()) {
			notify(event);
		}
	}
}