/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tanja Mayerhofer - initial API and implementation
 */
package org.modelexecution.fumldebug.debugger.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.core.model.IVariable;
import org.modelexecution.fumldebug.core.event.Event;

import fUML.Semantics.Classes.Kernel.FeatureValue;
import fUML.Semantics.Classes.Kernel.PrimitiveValue;
import fUML.Semantics.Classes.Kernel.Value;

public class FeatureValueValue extends ActivityDebugElement implements IValue {

	private static final String FEATURE_VALUE_REFERENCED_TYPE_NAME = "feature value";
	private FeatureValue value = null;	
	private HashMap<PrimitiveValueVariable, Value> primitiveValueVariables = new HashMap<PrimitiveValueVariable, Value>();
	
	public FeatureValueValue(ActivityDebugTarget target, FeatureValue value) {
		super(target);
		this.value = value;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValue#getReferenceTypeName()
	 */
	@Override
	public String getReferenceTypeName() throws DebugException {
		return FEATURE_VALUE_REFERENCED_TYPE_NAME;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValue#getValueString()
	 */
	@Override
	public String getValueString() throws DebugException {
		String typeName = "";
		if(value.feature.typedElement != null) 
			if(value.feature.typedElement.type != null)
				typeName = value.feature.typedElement.type.name + " ";
		return typeName + "(id=" + value.hashCode() + ")";
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValue#isAllocated()
	 */
	@Override
	public boolean isAllocated() throws DebugException {
		return true;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValue#getVariables()
	 */
	@Override
	public IVariable[] getVariables() throws DebugException{		
		List<PrimitiveValue> primitiveValues = getPrimitiveValues();
		for (int i=0; i<primitiveValues.size(); ++i) {
			PrimitiveValue v = primitiveValues.get(i);
			PrimitiveValueVariable variable = new PrimitiveValueVariable(getActivityDebugTarget(), "[" + i + "]", this);
			primitiveValueVariables.put(variable, v);
		}				
		Set<PrimitiveValueVariable> variables = primitiveValueVariables.keySet(); 
		return variables.toArray(new IVariable[variables.size()]);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValue#hasVariables()
	 */
	@Override
	public boolean hasVariables() throws DebugException {
		return getPrimitiveValues().size() > 0;
	}
	
	private List<PrimitiveValue> getPrimitiveValues() {
		List<PrimitiveValue> primitiveValues = new ArrayList<PrimitiveValue>();
		for (Value v : value.values) {
			if(v instanceof PrimitiveValue) {
				primitiveValues.add((PrimitiveValue)v);
			}			
		}
		return primitiveValues;
	}

	/* (non-Javadoc)
	 * @see org.modelexecution.fumldebug.core.ExecutionEventListener#notify(org.modelexecution.fumldebug.core.event.Event)
	 */
	@Override
	public void notify(Event event) {		
	}
	
	public Value getValue(PrimitiveValueVariable variable) {
		return primitiveValueVariables.get(variable);
	}

}