/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.mmlg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.mmlg.DataInput#getFilelocation <em>Filelocation</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mmlg.DataInput#getParsingInstruction <em>Parsing Instruction</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.mmlg.MmlgPackage#getDataInput()
 * @model
 * @generated
 */
public interface DataInput extends EObject
{
  /**
   * Returns the value of the '<em><b>Filelocation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filelocation</em>' attribute.
   * @see #setFilelocation(String)
   * @see org.xtext.example.mydsl.mmlg.MmlgPackage#getDataInput_Filelocation()
   * @model
   * @generated
   */
  String getFilelocation();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mmlg.DataInput#getFilelocation <em>Filelocation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filelocation</em>' attribute.
   * @see #getFilelocation()
   * @generated
   */
  void setFilelocation(String value);

  /**
   * Returns the value of the '<em><b>Parsing Instruction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parsing Instruction</em>' containment reference.
   * @see #setParsingInstruction(CSVParsingConfiguration)
   * @see org.xtext.example.mydsl.mmlg.MmlgPackage#getDataInput_ParsingInstruction()
   * @model containment="true"
   * @generated
   */
  CSVParsingConfiguration getParsingInstruction();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mmlg.DataInput#getParsingInstruction <em>Parsing Instruction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parsing Instruction</em>' containment reference.
   * @see #getParsingInstruction()
   * @generated
   */
  void setParsingInstruction(CSVParsingConfiguration value);

} // DataInput
