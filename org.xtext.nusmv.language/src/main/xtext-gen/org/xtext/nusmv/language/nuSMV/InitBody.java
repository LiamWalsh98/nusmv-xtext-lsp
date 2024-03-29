/**
 * generated by Xtext 2.21.0
 */
package org.xtext.nusmv.language.nuSMV;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Init Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.InitBody#getInitial <em>Initial</em>}</li>
 * </ul>
 *
 * @see org.xtext.nusmv.language.nuSMV.NuSMVPackage#getInitBody()
 * @model
 * @generated
 */
public interface InitBody extends AssignBody
{
  /**
   * Returns the value of the '<em><b>Initial</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial</em>' containment reference.
   * @see #setInitial(SimpleExpression)
   * @see org.xtext.nusmv.language.nuSMV.NuSMVPackage#getInitBody_Initial()
   * @model containment="true"
   * @generated
   */
  SimpleExpression getInitial();

  /**
   * Sets the value of the '{@link org.xtext.nusmv.language.nuSMV.InitBody#getInitial <em>Initial</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initial</em>' containment reference.
   * @see #getInitial()
   * @generated
   */
  void setInitial(SimpleExpression value);

} // InitBody
