/**
 * generated by Xtext 2.21.0
 */
package org.xtext.nusmv.language.nuSMV.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.nusmv.language.nuSMV.NuSMVPackage;
import org.xtext.nusmv.language.nuSMV.SimpleExpression;
import org.xtext.nusmv.language.nuSMV.Var;
import org.xtext.nusmv.language.nuSMV.VarBody;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.impl.VarImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.impl.VarImpl#getDotted <em>Dotted</em>}</li>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.impl.VarImpl#getArray <em>Array</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VarImpl extends SimpleExpressionImpl implements Var
{
  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected VarBody value;

  /**
   * The cached value of the '{@link #getDotted() <em>Dotted</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDotted()
   * @generated
   * @ordered
   */
  protected SimpleExpression dotted;

  /**
   * The cached value of the '{@link #getArray() <em>Array</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArray()
   * @generated
   * @ordered
   */
  protected EList<String> array;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VarImpl()
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
    return NuSMVPackage.Literals.VAR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VarBody getValue()
  {
    if (value != null && value.eIsProxy())
    {
      InternalEObject oldValue = (InternalEObject)value;
      value = (VarBody)eResolveProxy(oldValue);
      if (value != oldValue)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, NuSMVPackage.VAR__VALUE, oldValue, value));
      }
    }
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarBody basicGetValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValue(VarBody newValue)
  {
    VarBody oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NuSMVPackage.VAR__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SimpleExpression getDotted()
  {
    return dotted;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDotted(SimpleExpression newDotted, NotificationChain msgs)
  {
    SimpleExpression oldDotted = dotted;
    dotted = newDotted;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NuSMVPackage.VAR__DOTTED, oldDotted, newDotted);
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
  public void setDotted(SimpleExpression newDotted)
  {
    if (newDotted != dotted)
    {
      NotificationChain msgs = null;
      if (dotted != null)
        msgs = ((InternalEObject)dotted).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NuSMVPackage.VAR__DOTTED, null, msgs);
      if (newDotted != null)
        msgs = ((InternalEObject)newDotted).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NuSMVPackage.VAR__DOTTED, null, msgs);
      msgs = basicSetDotted(newDotted, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NuSMVPackage.VAR__DOTTED, newDotted, newDotted));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getArray()
  {
    if (array == null)
    {
      array = new EDataTypeEList<String>(String.class, this, NuSMVPackage.VAR__ARRAY);
    }
    return array;
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
      case NuSMVPackage.VAR__DOTTED:
        return basicSetDotted(null, msgs);
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
      case NuSMVPackage.VAR__VALUE:
        if (resolve) return getValue();
        return basicGetValue();
      case NuSMVPackage.VAR__DOTTED:
        return getDotted();
      case NuSMVPackage.VAR__ARRAY:
        return getArray();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case NuSMVPackage.VAR__VALUE:
        setValue((VarBody)newValue);
        return;
      case NuSMVPackage.VAR__DOTTED:
        setDotted((SimpleExpression)newValue);
        return;
      case NuSMVPackage.VAR__ARRAY:
        getArray().clear();
        getArray().addAll((Collection<? extends String>)newValue);
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
      case NuSMVPackage.VAR__VALUE:
        setValue((VarBody)null);
        return;
      case NuSMVPackage.VAR__DOTTED:
        setDotted((SimpleExpression)null);
        return;
      case NuSMVPackage.VAR__ARRAY:
        getArray().clear();
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
      case NuSMVPackage.VAR__VALUE:
        return value != null;
      case NuSMVPackage.VAR__DOTTED:
        return dotted != null;
      case NuSMVPackage.VAR__ARRAY:
        return array != null && !array.isEmpty();
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
    result.append(" (array: ");
    result.append(array);
    result.append(')');
    return result.toString();
  }

} //VarImpl
