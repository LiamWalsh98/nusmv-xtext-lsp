/**
 * generated by Xtext 2.21.0
 */
package org.xtext.nusmv.language.nuSMV;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Function Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.UnaryFunctionExpression#getFunction <em>Function</em>}</li>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.UnaryFunctionExpression#getArg <em>Arg</em>}</li>
 * </ul>
 *
 * @see org.xtext.nusmv.language.nuSMV.NuSMVPackage#getUnaryFunctionExpression()
 * @model
 * @generated
 */
public interface UnaryFunctionExpression extends SimpleExpression
{
  /**
   * Returns the value of the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' attribute.
   * @see #setFunction(String)
   * @see org.xtext.nusmv.language.nuSMV.NuSMVPackage#getUnaryFunctionExpression_Function()
   * @model
   * @generated
   */
  String getFunction();

  /**
   * Sets the value of the '{@link org.xtext.nusmv.language.nuSMV.UnaryFunctionExpression#getFunction <em>Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' attribute.
   * @see #getFunction()
   * @generated
   */
  void setFunction(String value);

  /**
   * Returns the value of the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg</em>' containment reference.
   * @see #setArg(SimpleExpression)
   * @see org.xtext.nusmv.language.nuSMV.NuSMVPackage#getUnaryFunctionExpression_Arg()
   * @model containment="true"
   * @generated
   */
  SimpleExpression getArg();

  /**
   * Sets the value of the '{@link org.xtext.nusmv.language.nuSMV.UnaryFunctionExpression#getArg <em>Arg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg</em>' containment reference.
   * @see #getArg()
   * @generated
   */
  void setArg(SimpleExpression value);

} // UnaryFunctionExpression
