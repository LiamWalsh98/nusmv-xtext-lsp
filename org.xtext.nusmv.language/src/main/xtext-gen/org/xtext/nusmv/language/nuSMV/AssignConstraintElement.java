/**
 * generated by Xtext 2.21.0
 */
package org.xtext.nusmv.language.nuSMV;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign Constraint Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.AssignConstraintElement#getAssign <em>Assign</em>}</li>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.AssignConstraintElement#getBodies <em>Bodies</em>}</li>
 * </ul>
 *
 * @see org.xtext.nusmv.language.nuSMV.NuSMVPackage#getAssignConstraintElement()
 * @model
 * @generated
 */
public interface AssignConstraintElement extends ModuleElement
{
  /**
   * Returns the value of the '<em><b>Assign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assign</em>' attribute.
   * @see #setAssign(String)
   * @see org.xtext.nusmv.language.nuSMV.NuSMVPackage#getAssignConstraintElement_Assign()
   * @model
   * @generated
   */
  String getAssign();

  /**
   * Sets the value of the '{@link org.xtext.nusmv.language.nuSMV.AssignConstraintElement#getAssign <em>Assign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assign</em>' attribute.
   * @see #getAssign()
   * @generated
   */
  void setAssign(String value);

  /**
   * Returns the value of the '<em><b>Bodies</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nusmv.language.nuSMV.AssignBody}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bodies</em>' containment reference list.
   * @see org.xtext.nusmv.language.nuSMV.NuSMVPackage#getAssignConstraintElement_Bodies()
   * @model containment="true"
   * @generated
   */
  EList<AssignBody> getBodies();

} // AssignConstraintElement
