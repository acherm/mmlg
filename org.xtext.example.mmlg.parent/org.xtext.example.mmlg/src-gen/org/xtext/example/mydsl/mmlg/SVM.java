/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.mmlg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SVM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.mmlg.SVM#getGamma <em>Gamma</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mmlg.SVM#getC <em>C</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mmlg.SVM#getKernel <em>Kernel</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mmlg.SVM#getSvmclassification <em>Svmclassification</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.mmlg.MmlgPackage#getSVM()
 * @model
 * @generated
 */
public interface SVM extends MLAlgorithm
{
  /**
   * Returns the value of the '<em><b>Gamma</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gamma</em>' attribute.
   * @see #setGamma(String)
   * @see org.xtext.example.mydsl.mmlg.MmlgPackage#getSVM_Gamma()
   * @model
   * @generated
   */
  String getGamma();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mmlg.SVM#getGamma <em>Gamma</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gamma</em>' attribute.
   * @see #getGamma()
   * @generated
   */
  void setGamma(String value);

  /**
   * Returns the value of the '<em><b>C</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>C</em>' attribute.
   * @see #setC(String)
   * @see org.xtext.example.mydsl.mmlg.MmlgPackage#getSVM_C()
   * @model
   * @generated
   */
  String getC();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mmlg.SVM#getC <em>C</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C</em>' attribute.
   * @see #getC()
   * @generated
   */
  void setC(String value);

  /**
   * Returns the value of the '<em><b>Kernel</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.mmlg.SVMKernel}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kernel</em>' attribute.
   * @see org.xtext.example.mydsl.mmlg.SVMKernel
   * @see #setKernel(SVMKernel)
   * @see org.xtext.example.mydsl.mmlg.MmlgPackage#getSVM_Kernel()
   * @model
   * @generated
   */
  SVMKernel getKernel();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mmlg.SVM#getKernel <em>Kernel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kernel</em>' attribute.
   * @see org.xtext.example.mydsl.mmlg.SVMKernel
   * @see #getKernel()
   * @generated
   */
  void setKernel(SVMKernel value);

  /**
   * Returns the value of the '<em><b>Svmclassification</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.mmlg.SVMClassification}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Svmclassification</em>' attribute.
   * @see org.xtext.example.mydsl.mmlg.SVMClassification
   * @see #setSvmclassification(SVMClassification)
   * @see org.xtext.example.mydsl.mmlg.MmlgPackage#getSVM_Svmclassification()
   * @model
   * @generated
   */
  SVMClassification getSvmclassification();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mmlg.SVM#getSvmclassification <em>Svmclassification</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Svmclassification</em>' attribute.
   * @see org.xtext.example.mydsl.mmlg.SVMClassification
   * @see #getSvmclassification()
   * @generated
   */
  void setSvmclassification(SVMClassification value);

} // SVM
