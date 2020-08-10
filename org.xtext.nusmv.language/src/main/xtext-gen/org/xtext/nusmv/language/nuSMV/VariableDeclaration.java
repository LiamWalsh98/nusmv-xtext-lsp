/**
 * generated by Xtext 2.21.0
 */
package org.xtext.nusmv.language.nuSMV;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.VariableDeclaration#getVars <em>Vars</em>}</li>
 * </ul>
 *
 * @see org.xtext.nusmv.language.nuSMV.NuSMVPackage#getVariableDeclaration()
 * @model
 * @generated
 */
public interface VariableDeclaration extends ModuleElement
{
  /**
   * Returns the value of the '<em><b>Vars</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nusmv.language.nuSMV.VarBody}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' containment reference list.
   * @see org.xtext.nusmv.language.nuSMV.NuSMVPackage#getVariableDeclaration_Vars()
   * @model containment="true"
   * @generated
   */
  EList<VarBody> getVars();

} // VariableDeclaration
