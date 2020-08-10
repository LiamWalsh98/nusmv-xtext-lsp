/**
 * generated by Xtext 2.21.0
 */
package org.xtext.nusmv.language.nuSMV.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.nusmv.language.nuSMV.NuSMVPackage;
import org.xtext.nusmv.language.nuSMV.SetElementExpression;
import org.xtext.nusmv.language.nuSMV.Val;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Element Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.impl.SetElementExpressionImpl#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetElementExpressionImpl extends SimpleExpressionImpl implements SetElementExpression
{
  /**
   * The cached value of the '{@link #getVal() <em>Val</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected Val val;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SetElementExpressionImpl()
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
    return NuSMVPackage.Literals.SET_ELEMENT_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Val getVal()
  {
    if (val != null && val.eIsProxy())
    {
      InternalEObject oldVal = (InternalEObject)val;
      val = (Val)eResolveProxy(oldVal);
      if (val != oldVal)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, NuSMVPackage.SET_ELEMENT_EXPRESSION__VAL, oldVal, val));
      }
    }
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Val basicGetVal()
  {
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVal(Val newVal)
  {
    Val oldVal = val;
    val = newVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NuSMVPackage.SET_ELEMENT_EXPRESSION__VAL, oldVal, val));
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
      case NuSMVPackage.SET_ELEMENT_EXPRESSION__VAL:
        if (resolve) return getVal();
        return basicGetVal();
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
      case NuSMVPackage.SET_ELEMENT_EXPRESSION__VAL:
        setVal((Val)newValue);
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
      case NuSMVPackage.SET_ELEMENT_EXPRESSION__VAL:
        setVal((Val)null);
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
      case NuSMVPackage.SET_ELEMENT_EXPRESSION__VAL:
        return val != null;
    }
    return super.eIsSet(featureID);
  }

} //SetElementExpressionImpl
