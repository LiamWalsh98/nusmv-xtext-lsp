/**
 * generated by Xtext 2.21.0
 */
package org.xtext.nusmv.language.nuSMV.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.nusmv.language.nuSMV.NuSMVPackage;
import org.xtext.nusmv.language.nuSMV.RTCTLExpression;
import org.xtext.nusmv.language.nuSMV.RangeExpression;
import org.xtext.nusmv.language.nuSMV.UnaryRTCTLExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary RTCTL Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.impl.UnaryRTCTLExpressionImpl#getUnary <em>Unary</em>}</li>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.impl.UnaryRTCTLExpressionImpl#getRange <em>Range</em>}</li>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.impl.UnaryRTCTLExpressionImpl#getRctl <em>Rctl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnaryRTCTLExpressionImpl extends RTCTLExpressionImpl implements UnaryRTCTLExpression
{
  /**
   * The default value of the '{@link #getUnary() <em>Unary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnary()
   * @generated
   * @ordered
   */
  protected static final String UNARY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUnary() <em>Unary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnary()
   * @generated
   * @ordered
   */
  protected String unary = UNARY_EDEFAULT;

  /**
   * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange()
   * @generated
   * @ordered
   */
  protected RangeExpression range;

  /**
   * The cached value of the '{@link #getRctl() <em>Rctl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRctl()
   * @generated
   * @ordered
   */
  protected RTCTLExpression rctl;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnaryRTCTLExpressionImpl()
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
    return NuSMVPackage.Literals.UNARY_RTCTL_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getUnary()
  {
    return unary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUnary(String newUnary)
  {
    String oldUnary = unary;
    unary = newUnary;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NuSMVPackage.UNARY_RTCTL_EXPRESSION__UNARY, oldUnary, unary));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RangeExpression getRange()
  {
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRange(RangeExpression newRange, NotificationChain msgs)
  {
    RangeExpression oldRange = range;
    range = newRange;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NuSMVPackage.UNARY_RTCTL_EXPRESSION__RANGE, oldRange, newRange);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRange(RangeExpression newRange)
  {
    if (newRange != range)
    {
      NotificationChain msgs = null;
      if (range != null)
        msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NuSMVPackage.UNARY_RTCTL_EXPRESSION__RANGE, null, msgs);
      if (newRange != null)
        msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NuSMVPackage.UNARY_RTCTL_EXPRESSION__RANGE, null, msgs);
      msgs = basicSetRange(newRange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NuSMVPackage.UNARY_RTCTL_EXPRESSION__RANGE, newRange, newRange));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RTCTLExpression getRctl()
  {
    return rctl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRctl(RTCTLExpression newRctl, NotificationChain msgs)
  {
    RTCTLExpression oldRctl = rctl;
    rctl = newRctl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NuSMVPackage.UNARY_RTCTL_EXPRESSION__RCTL, oldRctl, newRctl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRctl(RTCTLExpression newRctl)
  {
    if (newRctl != rctl)
    {
      NotificationChain msgs = null;
      if (rctl != null)
        msgs = ((InternalEObject)rctl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NuSMVPackage.UNARY_RTCTL_EXPRESSION__RCTL, null, msgs);
      if (newRctl != null)
        msgs = ((InternalEObject)newRctl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NuSMVPackage.UNARY_RTCTL_EXPRESSION__RCTL, null, msgs);
      msgs = basicSetRctl(newRctl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NuSMVPackage.UNARY_RTCTL_EXPRESSION__RCTL, newRctl, newRctl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case NuSMVPackage.UNARY_RTCTL_EXPRESSION__RANGE:
        return basicSetRange(null, msgs);
      case NuSMVPackage.UNARY_RTCTL_EXPRESSION__RCTL:
        return basicSetRctl(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case NuSMVPackage.UNARY_RTCTL_EXPRESSION__UNARY:
        return getUnary();
      case NuSMVPackage.UNARY_RTCTL_EXPRESSION__RANGE:
        return getRange();
      case NuSMVPackage.UNARY_RTCTL_EXPRESSION__RCTL:
        return getRctl();
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
      case NuSMVPackage.UNARY_RTCTL_EXPRESSION__UNARY:
        setUnary((String)newValue);
        return;
      case NuSMVPackage.UNARY_RTCTL_EXPRESSION__RANGE:
        setRange((RangeExpression)newValue);
        return;
      case NuSMVPackage.UNARY_RTCTL_EXPRESSION__RCTL:
        setRctl((RTCTLExpression)newValue);
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
      case NuSMVPackage.UNARY_RTCTL_EXPRESSION__UNARY:
        setUnary(UNARY_EDEFAULT);
        return;
      case NuSMVPackage.UNARY_RTCTL_EXPRESSION__RANGE:
        setRange((RangeExpression)null);
        return;
      case NuSMVPackage.UNARY_RTCTL_EXPRESSION__RCTL:
        setRctl((RTCTLExpression)null);
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
      case NuSMVPackage.UNARY_RTCTL_EXPRESSION__UNARY:
        return UNARY_EDEFAULT == null ? unary != null : !UNARY_EDEFAULT.equals(unary);
      case NuSMVPackage.UNARY_RTCTL_EXPRESSION__RANGE:
        return range != null;
      case NuSMVPackage.UNARY_RTCTL_EXPRESSION__RCTL:
        return rctl != null;
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
    result.append(" (unary: ");
    result.append(unary);
    result.append(')');
    return result.toString();
  }

} //UnaryRTCTLExpressionImpl
