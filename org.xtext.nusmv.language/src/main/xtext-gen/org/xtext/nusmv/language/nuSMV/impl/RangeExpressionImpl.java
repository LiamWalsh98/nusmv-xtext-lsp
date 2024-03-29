/**
 * generated by Xtext 2.21.0
 */
package org.xtext.nusmv.language.nuSMV.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nusmv.language.nuSMV.NuSMVPackage;
import org.xtext.nusmv.language.nuSMV.RangeExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.impl.RangeExpressionImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.impl.RangeExpressionImpl#getUpper <em>Upper</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RangeExpressionImpl extends MinimalEObjectImpl.Container implements RangeExpression
{
  /**
   * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLower()
   * @generated
   * @ordered
   */
  protected static final String LOWER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLower()
   * @generated
   * @ordered
   */
  protected String lower = LOWER_EDEFAULT;

  /**
   * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpper()
   * @generated
   * @ordered
   */
  protected static final String UPPER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpper()
   * @generated
   * @ordered
   */
  protected String upper = UPPER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RangeExpressionImpl()
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
    return NuSMVPackage.Literals.RANGE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLower()
  {
    return lower;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLower(String newLower)
  {
    String oldLower = lower;
    lower = newLower;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NuSMVPackage.RANGE_EXPRESSION__LOWER, oldLower, lower));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getUpper()
  {
    return upper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUpper(String newUpper)
  {
    String oldUpper = upper;
    upper = newUpper;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NuSMVPackage.RANGE_EXPRESSION__UPPER, oldUpper, upper));
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
      case NuSMVPackage.RANGE_EXPRESSION__LOWER:
        return getLower();
      case NuSMVPackage.RANGE_EXPRESSION__UPPER:
        return getUpper();
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
      case NuSMVPackage.RANGE_EXPRESSION__LOWER:
        setLower((String)newValue);
        return;
      case NuSMVPackage.RANGE_EXPRESSION__UPPER:
        setUpper((String)newValue);
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
      case NuSMVPackage.RANGE_EXPRESSION__LOWER:
        setLower(LOWER_EDEFAULT);
        return;
      case NuSMVPackage.RANGE_EXPRESSION__UPPER:
        setUpper(UPPER_EDEFAULT);
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
      case NuSMVPackage.RANGE_EXPRESSION__LOWER:
        return LOWER_EDEFAULT == null ? lower != null : !LOWER_EDEFAULT.equals(lower);
      case NuSMVPackage.RANGE_EXPRESSION__UPPER:
        return UPPER_EDEFAULT == null ? upper != null : !UPPER_EDEFAULT.equals(upper);
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
    result.append(" (lower: ");
    result.append(lower);
    result.append(", upper: ");
    result.append(upper);
    result.append(')');
    return result.toString();
  }

} //RangeExpressionImpl
