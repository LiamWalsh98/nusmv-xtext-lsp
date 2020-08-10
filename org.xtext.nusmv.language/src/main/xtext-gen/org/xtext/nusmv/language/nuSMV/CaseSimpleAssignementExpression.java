/**
 * generated by Xtext 2.21.0
 */
package org.xtext.nusmv.language.nuSMV;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Simple Assignement Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.CaseSimpleAssignementExpression#getCase <em>Case</em>}</li>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.CaseSimpleAssignementExpression#getAssignment <em>Assignment</em>}</li>
 * </ul>
 *
 * @see org.xtext.nusmv.language.nuSMV.NuSMVPackage#getCaseSimpleAssignementExpression()
 * @model
 * @generated
 */
public interface CaseSimpleAssignementExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Case</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case</em>' containment reference.
   * @see #setCase(SimpleExpression)
   * @see org.xtext.nusmv.language.nuSMV.NuSMVPackage#getCaseSimpleAssignementExpression_Case()
   * @model containment="true"
   * @generated
   */
  SimpleExpression getCase();

  /**
   * Sets the value of the '{@link org.xtext.nusmv.language.nuSMV.CaseSimpleAssignementExpression#getCase <em>Case</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case</em>' containment reference.
   * @see #getCase()
   * @generated
   */
  void setCase(SimpleExpression value);

  /**
   * Returns the value of the '<em><b>Assignment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignment</em>' containment reference.
   * @see #setAssignment(SimpleExpression)
   * @see org.xtext.nusmv.language.nuSMV.NuSMVPackage#getCaseSimpleAssignementExpression_Assignment()
   * @model containment="true"
   * @generated
   */
  SimpleExpression getAssignment();

  /**
   * Sets the value of the '{@link org.xtext.nusmv.language.nuSMV.CaseSimpleAssignementExpression#getAssignment <em>Assignment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignment</em>' containment reference.
   * @see #getAssignment()
   * @generated
   */
  void setAssignment(SimpleExpression value);

} // CaseSimpleAssignementExpression
