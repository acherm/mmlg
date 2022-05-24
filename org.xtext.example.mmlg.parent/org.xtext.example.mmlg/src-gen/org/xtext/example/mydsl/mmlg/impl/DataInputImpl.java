/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.mmlg.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.mmlg.CSVParsingConfiguration;
import org.xtext.example.mydsl.mmlg.DataInput;
import org.xtext.example.mydsl.mmlg.MmlgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.mmlg.impl.DataInputImpl#getFilelocation <em>Filelocation</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mmlg.impl.DataInputImpl#getParsingInstruction <em>Parsing Instruction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataInputImpl extends MinimalEObjectImpl.Container implements DataInput
{
  /**
   * The default value of the '{@link #getFilelocation() <em>Filelocation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilelocation()
   * @generated
   * @ordered
   */
  protected static final String FILELOCATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFilelocation() <em>Filelocation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilelocation()
   * @generated
   * @ordered
   */
  protected String filelocation = FILELOCATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getParsingInstruction() <em>Parsing Instruction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParsingInstruction()
   * @generated
   * @ordered
   */
  protected CSVParsingConfiguration parsingInstruction;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataInputImpl()
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
    return MmlgPackage.Literals.DATA_INPUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFilelocation()
  {
    return filelocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFilelocation(String newFilelocation)
  {
    String oldFilelocation = filelocation;
    filelocation = newFilelocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MmlgPackage.DATA_INPUT__FILELOCATION, oldFilelocation, filelocation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CSVParsingConfiguration getParsingInstruction()
  {
    return parsingInstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParsingInstruction(CSVParsingConfiguration newParsingInstruction, NotificationChain msgs)
  {
    CSVParsingConfiguration oldParsingInstruction = parsingInstruction;
    parsingInstruction = newParsingInstruction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MmlgPackage.DATA_INPUT__PARSING_INSTRUCTION, oldParsingInstruction, newParsingInstruction);
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
  public void setParsingInstruction(CSVParsingConfiguration newParsingInstruction)
  {
    if (newParsingInstruction != parsingInstruction)
    {
      NotificationChain msgs = null;
      if (parsingInstruction != null)
        msgs = ((InternalEObject)parsingInstruction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MmlgPackage.DATA_INPUT__PARSING_INSTRUCTION, null, msgs);
      if (newParsingInstruction != null)
        msgs = ((InternalEObject)newParsingInstruction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MmlgPackage.DATA_INPUT__PARSING_INSTRUCTION, null, msgs);
      msgs = basicSetParsingInstruction(newParsingInstruction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MmlgPackage.DATA_INPUT__PARSING_INSTRUCTION, newParsingInstruction, newParsingInstruction));
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
      case MmlgPackage.DATA_INPUT__PARSING_INSTRUCTION:
        return basicSetParsingInstruction(null, msgs);
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
      case MmlgPackage.DATA_INPUT__FILELOCATION:
        return getFilelocation();
      case MmlgPackage.DATA_INPUT__PARSING_INSTRUCTION:
        return getParsingInstruction();
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
      case MmlgPackage.DATA_INPUT__FILELOCATION:
        setFilelocation((String)newValue);
        return;
      case MmlgPackage.DATA_INPUT__PARSING_INSTRUCTION:
        setParsingInstruction((CSVParsingConfiguration)newValue);
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
      case MmlgPackage.DATA_INPUT__FILELOCATION:
        setFilelocation(FILELOCATION_EDEFAULT);
        return;
      case MmlgPackage.DATA_INPUT__PARSING_INSTRUCTION:
        setParsingInstruction((CSVParsingConfiguration)null);
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
      case MmlgPackage.DATA_INPUT__FILELOCATION:
        return FILELOCATION_EDEFAULT == null ? filelocation != null : !FILELOCATION_EDEFAULT.equals(filelocation);
      case MmlgPackage.DATA_INPUT__PARSING_INSTRUCTION:
        return parsingInstruction != null;
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
    result.append(" (filelocation: ");
    result.append(filelocation);
    result.append(')');
    return result.toString();
  }

} //DataInputImpl