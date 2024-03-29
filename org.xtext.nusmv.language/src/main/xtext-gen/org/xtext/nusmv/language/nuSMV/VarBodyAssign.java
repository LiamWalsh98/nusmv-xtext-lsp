/**
 * generated by Xtext 2.21.0
 */
package org.xtext.nusmv.language.nuSMV;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Body Assign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.VarBodyAssign#getAssignment <em>Assignment</em>}</li>
 * </ul>
 *
 * @see org.xtext.nusmv.language.nuSMV.NuSMVPackage#getVarBodyAssign()
 * @model
 * @generated
 */
public interface VarBodyAssign extends AssignBody
{
  /**
   * Returns the value of the '<em><b>Assignment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignment</em>' containment reference.
   * @see #setAssignment(SimpleExpression)
   * @see org.xtext.nusmv.language.nuSMV.NuSMVPackage#getVarBodyAssign_Assignment()
   * @model containment="true"
   * @generated
   */
  SimpleExpression getAssignment();

  /**
   * Sets the value of the '{@link org.xtext.nusmv.language.nuSMV.VarBodyAssign#getAssignment <em>Assignment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignment</em>' containment reference.
   * @see #getAssignment()
   * @generated
   */
  void setAssignment(SimpleExpression value);

} // VarBodyAssign
