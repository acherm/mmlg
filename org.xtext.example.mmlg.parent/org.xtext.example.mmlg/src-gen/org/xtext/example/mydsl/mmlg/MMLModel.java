/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.mmlg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MML Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.mmlg.MMLModel#getInput <em>Input</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mmlg.MMLModel#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mmlg.MMLModel#getFormula <em>Formula</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mmlg.MMLModel#getValidation <em>Validation</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.mmlg.MmlgPackage#getMMLModel()
 * @model
 * @generated
 */
public interface MMLModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' containment reference.
   * @see #setInput(DataInput)
   * @see org.xtext.example.mydsl.mmlg.MmlgPackage#getMMLModel_Input()
   * @model containment="true"
   * @generated
   */
  DataInput getInput();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mmlg.MMLModel#getInput <em>Input</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' containment reference.
   * @see #getInput()
   * @generated
   */
  void setInput(DataInput value);

  /**
   * Returns the value of the '<em><b>Algorithm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Algorithm</em>' containment reference.
   * @see #setAlgorithm(MLChoiceAlgorithm)
   * @see org.xtext.example.mydsl.mmlg.MmlgPackage#getMMLModel_Algorithm()
   * @model containment="true"
   * @generated
   */
  MLChoiceAlgorithm getAlgorithm();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mmlg.MMLModel#getAlgorithm <em>Algorithm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Algorithm</em>' containment reference.
   * @see #getAlgorithm()
   * @generated
   */
  void setAlgorithm(MLChoiceAlgorithm value);

  /**
   * Returns the value of the '<em><b>Formula</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formula</em>' containment reference.
   * @see #setFormula(RFormula)
   * @see org.xtext.example.mydsl.mmlg.MmlgPackage#getMMLModel_Formula()
   * @model containment="true"
   * @generated
   */
  RFormula getFormula();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mmlg.MMLModel#getFormula <em>Formula</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formula</em>' containment reference.
   * @see #getFormula()
   * @generated
   */
  void setFormula(RFormula value);

  /**
   * Returns the value of the '<em><b>Validation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Validation</em>' containment reference.
   * @see #setValidation(Validation)
   * @see org.xtext.example.mydsl.mmlg.MmlgPackage#getMMLModel_Validation()
   * @model containment="true"
   * @generated
   */
  Validation getValidation();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mmlg.MMLModel#getValidation <em>Validation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Validation</em>' containment reference.
   * @see #getValidation()
   * @generated
   */
  void setValidation(Validation value);

} // MMLModel
