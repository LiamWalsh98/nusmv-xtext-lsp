/**
 * generated by Xtext 2.21.0
 */
package org.xtext.nusmv.language.nuSMV;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.VarBody#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.VarBody#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.VarBody#isSemicolon <em>Semicolon</em>}</li>
 * </ul>
 *
 * @see org.xtext.nusmv.language.nuSMV.NuSMVPackage#getVarBody()
 * @model
 * @generated
 */
public interface VarBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.nusmv.language.nuSMV.NuSMVPackage#getVarBody_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.nusmv.language.nuSMV.VarBody#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see org.xtext.nusmv.language.nuSMV.NuSMVPackage#getVarBody_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link org.xtext.nusmv.language.nuSMV.VarBody#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Semicolon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Semicolon</em>' attribute.
   * @see #setSemicolon(boolean)
   * @see org.xtext.nusmv.language.nuSMV.NuSMVPackage#getVarBody_Semicolon()
   * @model
   * @generated
   */
  boolean isSemicolon();

  /**
   * Sets the value of the '{@link org.xtext.nusmv.language.nuSMV.VarBody#isSemicolon <em>Semicolon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Semicolon</em>' attribute.
   * @see #isSemicolon()
   * @generated
   */
  void setSemicolon(boolean value);

} // VarBody
