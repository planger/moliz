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
public class TriggerPopulator implements IElementPopulator {

	@Override
	public void populate(fUML.Syntax.Classes.Kernel.Element fumlElement,
		org.eclipse.uml2.uml.Element uml2Element, ConversionResultImpl result) {
		
		fUML.Syntax.CommonBehaviors.Communications.Trigger fumlNamedElement = (fUML.Syntax.CommonBehaviors.Communications.Trigger) fumlElement;
		org.eclipse.uml2.uml.Trigger uml2NamedElement = (org.eclipse.uml2.uml.Trigger) uml2Element;
		
		fumlNamedElement.event = (fUML.Syntax.CommonBehaviors.Communications.Event) result
							.getFUMLElement(uml2NamedElement.getEvent());
		
	}
	
}
