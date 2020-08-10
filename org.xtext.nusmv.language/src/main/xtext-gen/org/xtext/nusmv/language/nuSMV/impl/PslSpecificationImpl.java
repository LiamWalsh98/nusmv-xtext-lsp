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
import org.xtext.nusmv.language.nuSMV.PSLExpression;
import org.xtext.nusmv.language.nuSMV.PslSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Psl Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.impl.PslSpecificationImpl#isNameKeyWord <em>Name Key Word</em>}</li>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.impl.PslSpecificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.impl.PslSpecificationImpl#getPslExpression <em>Psl Expression</em>}</li>
 *   <li>{@link org.xtext.nusmv.language.nuSMV.impl.PslSpecificationImpl#isSemicolon <em>Semicolon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PslSpecificationImpl extends ModuleElementImpl implements PslSpecification
{
  /**
   * The default value of the '{@link #isNameKeyWord() <em>Name Key Word</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNameKeyWord()
   * @generated
   * @ordered
   */
  protected static final boolean NAME_KEY_WORD_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNameKeyWord() <em>Name Key Word</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNameKeyWord()
   * @generated
   * @ordered
   */
  protected boolean nameKeyWord = NAME_KEY_WORD_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPslExpression() <em>Psl Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPslExpression()
   * @generated
   * @ordered
   */
  protected PSLExpression pslExpression;

  /**
   * The default value of the '{@link #isSemicolon() <em>Semicolon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSemicolon()
   * @generated
   * @ordered
   */
  protected static final boolean SEMICOLON_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSemicolon() <em>Semicolon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSemicolon()
   * @generated
   * @ordered
   */
  protected boolean semicolon = SEMICOLON_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PslSpecificationImpl()
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
    return NuSMVPackage.Literals.PSL_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isNameKeyWord()
  {
    return nameKeyWord;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNameKeyWord(boolean newNameKeyWord)
  {
    boolean oldNameKeyWord = nameKeyWord;
    nameKeyWord = newNameKeyWord;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NuSMVPackage.PSL_SPECIFICATION__NAME_KEY_WORD, oldNameKeyWord, nameKeyWord));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NuSMVPackage.PSL_SPECIFICATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PSLExpression getPslExpression()
  {
    return pslExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPslExpression(PSLExpression newPslExpression, NotificationChain msgs)
  {
    PSLExpression oldPslExpression = pslExpression;
    pslExpression = newPslExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NuSMVPackage.PSL_SPECIFICATION__PSL_EXPRESSION, oldPslExpression, newPslExpression);
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
  public void setPslExpression(PSLExpression newPslExpression)
  {
    if (newPslExpression != pslExpression)
    {
      NotificationChain msgs = null;
      if (pslExpression != null)
        msgs = ((InternalEObject)pslExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NuSMVPackage.PSL_SPECIFICATION__PSL_EXPRESSION, null, msgs);
      if (newPslExpression != null)
        msgs = ((InternalEObject)newPslExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NuSMVPackage.PSL_SPECIFICATION__PSL_EXPRESSION, null, msgs);
      msgs = basicSetPslExpression(newPslExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NuSMVPackage.PSL_SPECIFICATION__PSL_EXPRESSION, newPslExpression, newPslExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isSemicolon()
  {
    return semicolon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSemicolon(boolean newSemicolon)
  {
    boolean oldSemicolon = semicolon;
    semicolon = newSemicolon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NuSMVPackage.PSL_SPECIFICATION__SEMICOLON, oldSemicolon, semicolon));
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
      case NuSMVPackage.PSL_SPECIFICATION__PSL_EXPRESSION:
        return basicSetPslExpression(null, msgs);
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
      case NuSMVPackage.PSL_SPECIFICATION__NAME_KEY_WORD:
        return isNameKeyWord();
      case NuSMVPackage.PSL_SPECIFICATION__NAME:
        return getName();
      case NuSMVPackage.PSL_SPECIFICATION__PSL_EXPRESSION:
        return getPslExpression();
      case NuSMVPackage.PSL_SPECIFICATION__SEMICOLON:
        return isSemicolon();
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
      case NuSMVPackage.PSL_SPECIFICATION__NAME_KEY_WORD:
        setNameKeyWord((Boolean)newValue);
        return;
      case NuSMVPackage.PSL_SPECIFICATION__NAME:
        setName((String)newValue);
        return;
      case NuSMVPackage.PSL_SPECIFICATION__PSL_EXPRESSION:
        setPslExpression((PSLExpression)newValue);
        return;
      case NuSMVPackage.PSL_SPECIFICATION__SEMICOLON:
        setSemicolon((Boolean)newValue);
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
      case NuSMVPackage.PSL_SPECIFICATION__NAME_KEY_WORD:
        setNameKeyWord(NAME_KEY_WORD_EDEFAULT);
        return;
      case NuSMVPackage.PSL_SPECIFICATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case NuSMVPackage.PSL_SPECIFICATION__PSL_EXPRESSION:
        setPslExpression((PSLExpression)null);
        return;
      case NuSMVPackage.PSL_SPECIFICATION__SEMICOLON:
        setSemicolon(SEMICOLON_EDEFAULT);
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
      case NuSMVPackage.PSL_SPECIFICATION__NAME_KEY_WORD:
        return nameKeyWord != NAME_KEY_WORD_EDEFAULT;
      case NuSMVPackage.PSL_SPECIFICATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case NuSMVPackage.PSL_SPECIFICATION__PSL_EXPRESSION:
        return pslExpression != null;
      case NuSMVPackage.PSL_SPECIFICATION__SEMICOLON:
        return semicolon != SEMICOLON_EDEFAULT;
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
    result.append(" (nameKeyWord: ");
    result.append(nameKeyWord);
    result.append(", name: ");
    result.append(name);
    result.append(", semicolon: ");
    result.append(semicolon);
    result.append(')');
    return result.toString();
  }

} //PslSpecificationImpl
