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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.nusmv.language.nuSMV.AssignBody;
import org.xtext.nusmv.language.nuSMV.AssignConstraintElement;
import org.xtext.nusmv.language.nuSMV.NuSMVPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assign Constraint Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.impl.AssignConstraintElementImpl#getAssign <em>Assign</em>}</li>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.impl.AssignConstraintElementImpl#getBodies <em>Bodies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignConstraintElementImpl extends ModuleElementImpl implements AssignConstraintElement
{
  /**
   * The default value of the '{@link #getAssign() <em>Assign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssign()
   * @generated
   * @ordered
   */
  protected static final String ASSIGN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAssign() <em>Assign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssign()
   * @generated
   * @ordered
   */
  protected String assign = ASSIGN_EDEFAULT;

  /**
   * The cached value of the '{@link #getBodies() <em>Bodies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodies()
   * @generated
   * @ordered
   */
  protected EList<AssignBody> bodies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssignConstraintElementImpl()
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
    return NuSMVPackage.Literals.ASSIGN_CONSTRAINT_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAssign()
  {
    return assign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAssign(String newAssign)
  {
    String oldAssign = assign;
    assign = newAssign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NuSMVPackage.ASSIGN_CONSTRAINT_ELEMENT__ASSIGN, oldAssign, assign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<AssignBody> getBodies()
  {
    if (bodies == null)
    {
      bodies = new EObjectContainmentEList<AssignBody>(AssignBody.class, this, NuSMVPackage.ASSIGN_CONSTRAINT_ELEMENT__BODIES);
    }
    return bodies;
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
      case NuSMVPackage.ASSIGN_CONSTRAINT_ELEMENT__BODIES:
        return ((InternalEList<?>)getBodies()).basicRemove(otherEnd, msgs);
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
      case NuSMVPackage.ASSIGN_CONSTRAINT_ELEMENT__ASSIGN:
        return getAssign();
      case NuSMVPackage.ASSIGN_CONSTRAINT_ELEMENT__BODIES:
        return getBodies();
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
      case NuSMVPackage.ASSIGN_CONSTRAINT_ELEMENT__ASSIGN:
        setAssign((String)newValue);
        return;
      case NuSMVPackage.ASSIGN_CONSTRAINT_ELEMENT__BODIES:
        getBodies().clear();
        getBodies().addAll((Collection<? extends AssignBody>)newValue);
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
      case NuSMVPackage.ASSIGN_CONSTRAINT_ELEMENT__ASSIGN:
        setAssign(ASSIGN_EDEFAULT);
        return;
      case NuSMVPackage.ASSIGN_CONSTRAINT_ELEMENT__BODIES:
        getBodies().clear();
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
      case NuSMVPackage.ASSIGN_CONSTRAINT_ELEMENT__ASSIGN:
        return ASSIGN_EDEFAULT == null ? assign != null : !ASSIGN_EDEFAULT.equals(assign);
      case NuSMVPackage.ASSIGN_CONSTRAINT_ELEMENT__BODIES:
        return bodies != null && !bodies.isEmpty();
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
    result.append(" (assign: ");
    result.append(assign);
    result.append(')');
    return result.toString();
  }

} //AssignConstraintElementImpl
