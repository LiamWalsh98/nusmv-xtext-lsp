/**
 * generated by Xtext 2.21.0
 */
package org.xtext.nusmv.language.nuSMV;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Define Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.DefineDeclaration#getDefine <em>Define</em>}</li>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.DefineDeclaration#getDefineBodies <em>Define Bodies</em>}</li>
 * </ul>
 *
 * @see org.xtext.nusmv.language.nuSMV.NuSMVPackage#getDefineDeclaration()
 * @model
 * @generated
 */
public interface DefineDeclaration extends ModuleElement
{
  /**
   * Returns the value of the '<em><b>Define</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Define</em>' attribute.
   * @see #setDefine(String)
   * @see org.xtext.nusmv.language.nuSMV.NuSMVPackage#getDefineDeclaration_Define()
   * @model
   * @generated
   */
  String getDefine();

  /**
   * Sets the value of the '{@link org.xtext.nusmv.language.nuSMV.DefineDeclaration#getDefine <em>Define</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Define</em>' attribute.
   * @see #getDefine()
   * @generated
   */
  void setDefine(String value);

  /**
   * Returns the value of the '<em><b>Define Bodies</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nusmv.language.nuSMV.DefineBody}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Define Bodies</em>' containment reference list.
   * @see org.xtext.nusmv.language.nuSMV.NuSMVPackage#getDefineDeclaration_DefineBodies()
   * @model containment="true"
   * @generated
   */
  EList<DefineBody> getDefineBodies();

} // DefineDeclaration
