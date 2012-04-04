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
public class SlotPopulator implements IElementPopulator {

	@Override
	public void populate(fUML.Syntax.Classes.Kernel.Element fumlElement,
		org.eclipse.uml2.uml.Element uml2Element, ConversionResultImpl result) {
		
		fUML.Syntax.Classes.Kernel.Slot fumlNamedElement = (fUML.Syntax.Classes.Kernel.Slot) fumlElement;
		org.eclipse.uml2.uml.Slot uml2NamedElement = (org.eclipse.uml2.uml.Slot) uml2Element;
		
		fumlNamedElement.definingFeature = (fUML.Syntax.Classes.Kernel.StructuralFeature) result
							.getFUMLElement(uml2NamedElement.getDefiningFeature());
		
		for (org.eclipse.uml2.uml.ValueSpecification value : uml2NamedElement.getValues()) {
					fumlNamedElement.value.add((fUML.Syntax.Classes.Kernel.ValueSpecification) result.getFUMLElement(value));
		}
		
		fumlNamedElement.owningInstance = (fUML.Syntax.Classes.Kernel.InstanceSpecification) result
							.getFUMLElement(uml2NamedElement.getOwningInstance());
		
	}
	
}
