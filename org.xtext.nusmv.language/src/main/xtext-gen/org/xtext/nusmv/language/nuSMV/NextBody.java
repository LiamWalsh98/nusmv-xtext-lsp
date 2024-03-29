/**
 * generated by Xtext 2.21.0
 */
package org.xtext.nusmv.language.nuSMV;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Next Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.NextBody#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see org.xtext.nusmv.language.nuSMV.NuSMVPackage#getNextBody()
 * @model
 * @generated
 */
public interface NextBody extends AssignBody
{
  /**
   * Returns the value of the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next</em>' containment reference.
   * @see #setNext(NextExpression)
   * @see org.xtext.nusmv.language.nuSMV.NuSMVPackage#getNextBody_Next()
   * @model containment="true"
   * @generated
   */
  NextExpression getNext();

  /**
   * Sets the value of the '{@link org.xtext.nusmv.language.nuSMV.NextBody#getNext <em>Next</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next</em>' containment reference.
   * @see #getNext()
   * @generated
   */
  void setNext(NextExpression value);

} // NextBody
