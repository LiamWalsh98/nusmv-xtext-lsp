/**
 * generated by Xtext 2.21.0
 */
package org.xtext.nusmv.language.nuSMV.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.nusmv.language.nuSMV.NuSMVPackage;
import org.xtext.nusmv.language.nuSMV.WordType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Word Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.impl.WordTypeImpl#getWordNumber <em>Word Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WordTypeImpl extends SimpleTypeImpl implements WordType
{
  /**
   * The default value of the '{@link #getWordNumber() <em>Word Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWordNumber()
   * @generated
   * @ordered
   */
  protected static final String WORD_NUMBER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWordNumber() <em>Word Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWordNumber()
   * @generated
   * @ordered
   */
  protected String wordNumber = WORD_NUMBER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WordTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return NuSMVPackage.Literals.WORD_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getWordNumber()
  {
    return wordNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setWordNumber(String newWordNumber)
  {
    String oldWordNumber = wordNumber;
    wordNumber = newWordNumber;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NuSMVPackage.WORD_TYPE__WORD_NUMBER, oldWordNumber, wordNumber));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case NuSMVPackage.WORD_TYPE__WORD_NUMBER:
        return getWordNumber();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case NuSMVPackage.WORD_TYPE__WORD_NUMBER:
        setWordNumber((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case NuSMVPackage.WORD_TYPE__WORD_NUMBER:
        setWordNumber(WORD_NUMBER_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case NuSMVPackage.WORD_TYPE__WORD_NUMBER:
        return WORD_NUMBER_EDEFAULT == null ? wordNumber != null : !WORD_NUMBER_EDEFAULT.equals(wordNumber);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (wordNumber: ");
    result.append(wordNumber);
    result.append(')');
    return result.toString();
  }

} //WordTypeImpl
