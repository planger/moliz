/**
 */
package org.modelexecution.fuml.Syntax.Classes.Kernel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * not self.isDerived and not self.isDerivedUnion
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Property#getIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Property#getIsDerivedUnion <em>Is Derived Union</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Property#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Property#getIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Property#getOwningAssociation <em>Owning Association</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Property#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Property#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Property#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Property#getOpposite <em>Opposite</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends StructuralFeature {
	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Derived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Derived</em>' attribute.
	 * @see #setIsDerived(Object)
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getProperty_IsDerived()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getIsDerived();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Property#getIsDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #getIsDerived()
	 * @generated
	 */
	void setIsDerived(Object value);

	/**
	 * Returns the value of the '<em><b>Is Derived Union</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Derived Union</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Derived Union</em>' attribute.
	 * @see #setIsDerivedUnion(Object)
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getProperty_IsDerivedUnion()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getIsDerivedUnion();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Property#getIsDerivedUnion <em>Is Derived Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived Union</em>' attribute.
	 * @see #getIsDerivedUnion()
	 * @generated
	 */
	void setIsDerivedUnion(Object value);

	/**
	 * Returns the value of the '<em><b>Aggregation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.modelexecution.fuml.Syntax.Classes.Kernel.AggregationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation</em>' attribute.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.AggregationKind
	 * @see #setAggregation(AggregationKind)
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getProperty_Aggregation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AggregationKind getAggregation();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Property#getAggregation <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation</em>' attribute.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.AggregationKind
	 * @see #getAggregation()
	 * @generated
	 */
	void setAggregation(AggregationKind value);

	/**
	 * Returns the value of the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Composite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Composite</em>' attribute.
	 * @see #setIsComposite(Object)
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getProperty_IsComposite()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Object getIsComposite();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Property#getIsComposite <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Composite</em>' attribute.
	 * @see #getIsComposite()
	 * @generated
	 */
	void setIsComposite(Object value);

	/**
	 * Returns the value of the '<em><b>Owning Association</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Association#getOwnedEnd <em>Owned End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Association</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Association</em>' container reference.
	 * @see #setOwningAssociation(Association)
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getProperty_OwningAssociation()
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Association#getOwnedEnd
	 * @model opposite="ownedEnd" transient="false" ordered="false"
	 * @generated
	 */
	Association getOwningAssociation();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Property#getOwningAssociation <em>Owning Association</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Association</em>' container reference.
	 * @see #getOwningAssociation()
	 * @generated
	 */
	void setOwningAssociation(Association value);

	/**
	 * Returns the value of the '<em><b>Association</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Association#getMemberEnd <em>Member End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' reference.
	 * @see #setAssociation(Association)
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getProperty_Association()
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Association#getMemberEnd
	 * @model opposite="memberEnd" ordered="false"
	 * @generated
	 */
	Association getAssociation();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Property#getAssociation <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' reference.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(Association value);

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.DataType#getOwnedAttribute <em>Owned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' container reference.
	 * @see #setDatatype(DataType)
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getProperty_Datatype()
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.DataType#getOwnedAttribute
	 * @model opposite="ownedAttribute" transient="false" ordered="false"
	 * @generated
	 */
	DataType getDatatype();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Property#getDatatype <em>Datatype</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' container reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(DataType value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Class#getOwnedAttribute <em>Owned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' container reference.
	 * @see #setClass_(org.modelexecution.fuml.Syntax.Classes.Kernel.Class)
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getProperty_Class()
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Class#getOwnedAttribute
	 * @model opposite="ownedAttribute" transient="false" ordered="false"
	 * @generated
	 */
	org.modelexecution.fuml.Syntax.Classes.Kernel.Class getClass_();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Property#getClass_ <em>Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' container reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass_(org.modelexecution.fuml.Syntax.Classes.Kernel.Class value);

	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(Property)
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getProperty_Opposite()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Property getOpposite();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Property#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(Property value);

} // Property
