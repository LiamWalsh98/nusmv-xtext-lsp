/**
 * generated by Xtext 2.21.0
 */
package org.xtext.nusmv.language.nuSMV;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary RTCTL Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.UnaryRTCTLExpression#getUnary <em>Unary</em>}</li>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.UnaryRTCTLExpression#getRange <em>Range</em>}</li>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.UnaryRTCTLExpression#getRctl <em>Rctl</em>}</li>
 * </ul>
 *
 * @see org.xtext.nusmv.language.nuSMV.NuSMVPackage#getUnaryRTCTLExpression()
 * @model
 * @generated
 */
public interface UnaryRTCTLExpression extends RTCTLExpression
{
  /**
   * Returns the value of the '<em><b>Unary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unary</em>' attribute.
   * @see #setUnary(String)
   * @see org.xtext.nusmv.language.nuSMV.NuSMVPackage#getUnaryRTCTLExpression_Unary()
   * @model
   * @generated
   */
  String getUnary();

  /**
   * Sets the value of the '{@link org.xtext.nusmv.language.nuSMV.UnaryRTCTLExpression#getUnary <em>Unary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unary</em>' attribute.
   * @see #getUnary()
   * @generated
   */
  void setUnary(String value);

  /**
   * Returns the value of the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' containment reference.
   * @see #setRange(RangeExpression)
   * @see org.xtext.nusmv.language.nuSMV.NuSMVPackage#getUnaryRTCTLExpression_Range()
   * @model containment="true"
   * @generated
   */
  RangeExpression getRange();

  /**
   * Sets the value of the '{@link org.xtext.nusmv.language.nuSMV.UnaryRTCTLExpression#getRange <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' containment reference.
   * @see #getRange()
   * @generated
   */
  void setRange(RangeExpression value);

  /**
   * Returns the value of the '<em><b>Rctl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rctl</em>' containment reference.
   * @see #setRctl(RTCTLExpression)
   * @see org.xtext.nusmv.language.nuSMV.NuSMVPackage#getUnaryRTCTLExpression_Rctl()
   * @model containment="true"
   * @generated
   */
  RTCTLExpression getRctl();

  /**
   * Sets the value of the '{@link org.xtext.nusmv.language.nuSMV.UnaryRTCTLExpression#getRctl <em>Rctl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rctl</em>' containment reference.
   * @see #getRctl()
   * @generated
   */
  void setRctl(RTCTLExpression value);

} // UnaryRTCTLExpression
