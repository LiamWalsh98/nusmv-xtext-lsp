/**
 * generated by Xtext 2.21.0
 */
package org.xtext.nusmv.language.nuSMV;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compassion Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.CompassionExpression#getFirstExpr <em>First Expr</em>}</li>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.CompassionExpression#getSecondExpr <em>Second Expr</em>}</li>
 * </ul>
 *
 * @see org.xtext.nusmv.language.nuSMV.NuSMVPackage#getCompassionExpression()
 * @model
 * @generated
 */
public interface CompassionExpression extends FairnessConstraint
{
  /**
   * Returns the value of the '<em><b>First Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Expr</em>' containment reference.
   * @see #setFirstExpr(SimpleExpression)
   * @see org.xtext.nusmv.language.nuSMV.NuSMVPackage#getCompassionExpression_FirstExpr()
   * @model containment="true"
   * @generated
   */
  SimpleExpression getFirstExpr();

  /**
   * Sets the value of the '{@link org.xtext.nusmv.language.nuSMV.CompassionExpression#getFirstExpr <em>First Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Expr</em>' containment reference.
   * @see #getFirstExpr()
   * @generated
   */
  void setFirstExpr(SimpleExpression value);

  /**
   * Returns the value of the '<em><b>Second Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second Expr</em>' containment reference.
   * @see #setSecondExpr(SimpleExpression)
   * @see org.xtext.nusmv.language.nuSMV.NuSMVPackage#getCompassionExpression_SecondExpr()
   * @model containment="true"
   * @generated
   */
  SimpleExpression getSecondExpr();

  /**
   * Sets the value of the '{@link org.xtext.nusmv.language.nuSMV.CompassionExpression#getSecondExpr <em>Second Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Second Expr</em>' containment reference.
   * @see #getSecondExpr()
   * @generated
   */
  void setSecondExpr(SimpleExpression value);

} // CompassionExpression
