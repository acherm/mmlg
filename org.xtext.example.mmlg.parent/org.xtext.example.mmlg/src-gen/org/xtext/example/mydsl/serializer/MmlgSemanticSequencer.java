/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.mmlg.AllVariables;
import org.xtext.example.mydsl.mmlg.CSVParsingConfiguration;
import org.xtext.example.mydsl.mmlg.CrossValidation;
import org.xtext.example.mydsl.mmlg.DT;
import org.xtext.example.mydsl.mmlg.DataInput;
import org.xtext.example.mydsl.mmlg.FormulaItem;
import org.xtext.example.mydsl.mmlg.LogisticRegression;
import org.xtext.example.mydsl.mmlg.MLChoiceAlgorithm;
import org.xtext.example.mydsl.mmlg.MMLModel;
import org.xtext.example.mydsl.mmlg.MmlgPackage;
import org.xtext.example.mydsl.mmlg.PredictorVariables;
import org.xtext.example.mydsl.mmlg.RFormula;
import org.xtext.example.mydsl.mmlg.RandomForest;
import org.xtext.example.mydsl.mmlg.SVM;
import org.xtext.example.mydsl.mmlg.TrainingTest;
import org.xtext.example.mydsl.mmlg.Validation;
import org.xtext.example.mydsl.services.MmlgGrammarAccess;

@SuppressWarnings("all")
public class MmlgSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MmlgGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MmlgPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MmlgPackage.ALL_VARIABLES:
				sequence_AllVariables(context, (AllVariables) semanticObject); 
				return; 
			case MmlgPackage.CSV_PARSING_CONFIGURATION:
				sequence_CSVParsingConfiguration(context, (CSVParsingConfiguration) semanticObject); 
				return; 
			case MmlgPackage.CROSS_VALIDATION:
				sequence_CrossValidation(context, (CrossValidation) semanticObject); 
				return; 
			case MmlgPackage.DT:
				sequence_DT(context, (DT) semanticObject); 
				return; 
			case MmlgPackage.DATA_INPUT:
				sequence_DataInput(context, (DataInput) semanticObject); 
				return; 
			case MmlgPackage.FORMULA_ITEM:
				sequence_FormulaItem(context, (FormulaItem) semanticObject); 
				return; 
			case MmlgPackage.LOGISTIC_REGRESSION:
				sequence_LogisticRegression(context, (LogisticRegression) semanticObject); 
				return; 
			case MmlgPackage.ML_CHOICE_ALGORITHM:
				sequence_MLChoiceAlgorithm(context, (MLChoiceAlgorithm) semanticObject); 
				return; 
			case MmlgPackage.MML_MODEL:
				sequence_MMLModel(context, (MMLModel) semanticObject); 
				return; 
			case MmlgPackage.PREDICTOR_VARIABLES:
				sequence_PredictorVariables(context, (PredictorVariables) semanticObject); 
				return; 
			case MmlgPackage.RFORMULA:
				sequence_RFormula(context, (RFormula) semanticObject); 
				return; 
			case MmlgPackage.RANDOM_FOREST:
				sequence_RandomForest(context, (RandomForest) semanticObject); 
				return; 
			case MmlgPackage.SVM:
				sequence_SVM(context, (SVM) semanticObject); 
				return; 
			case MmlgPackage.TRAINING_TEST:
				sequence_TrainingTest(context, (TrainingTest) semanticObject); 
				return; 
			case MmlgPackage.VALIDATION:
				sequence_Validation(context, (Validation) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     XFormula returns AllVariables
	 *     AllVariables returns AllVariables
	 *
	 * Constraint:
	 *     all='.'
	 */
	protected void sequence_AllVariables(ISerializationContext context, AllVariables semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MmlgPackage.Literals.ALL_VARIABLES__ALL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MmlgPackage.Literals.ALL_VARIABLES__ALL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAllVariablesAccess().getAllFullStopKeyword_0(), semanticObject.getAll());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CSVParsingConfiguration returns CSVParsingConfiguration
	 *
	 * Constraint:
	 *     sep=CSVSeparator
	 */
	protected void sequence_CSVParsingConfiguration(ISerializationContext context, CSVParsingConfiguration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MmlgPackage.Literals.CSV_PARSING_CONFIGURATION__SEP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MmlgPackage.Literals.CSV_PARSING_CONFIGURATION__SEP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCSVParsingConfigurationAccess().getSepCSVSeparatorEnumRuleCall_1_0(), semanticObject.getSep());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     StratificationMethod returns CrossValidation
	 *     CrossValidation returns CrossValidation
	 *
	 * Constraint:
	 *     number=INT
	 */
	protected void sequence_CrossValidation(ISerializationContext context, CrossValidation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MmlgPackage.Literals.STRATIFICATION_METHOD__NUMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MmlgPackage.Literals.STRATIFICATION_METHOD__NUMBER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCrossValidationAccess().getNumberINTTerminalRuleCall_3_0(), semanticObject.getNumber());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MLAlgorithm returns DT
	 *     DT returns DT
	 *
	 * Constraint:
	 *     max_depth=INT?
	 */
	protected void sequence_DT(ISerializationContext context, DT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataInput returns DataInput
	 *
	 * Constraint:
	 *     (filelocation=STRING parsingInstruction=CSVParsingConfiguration?)
	 */
	protected void sequence_DataInput(ISerializationContext context, DataInput semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FormulaItem returns FormulaItem
	 *
	 * Constraint:
	 *     (column=INT | colName=STRING)
	 */
	protected void sequence_FormulaItem(ISerializationContext context, FormulaItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MLAlgorithm returns LogisticRegression
	 *     LogisticRegression returns LogisticRegression
	 *
	 * Constraint:
	 *     {LogisticRegression}
	 */
	protected void sequence_LogisticRegression(ISerializationContext context, LogisticRegression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MLChoiceAlgorithm returns MLChoiceAlgorithm
	 *
	 * Constraint:
	 *     (framework=FrameworkLang algorithm=MLAlgorithm)
	 */
	protected void sequence_MLChoiceAlgorithm(ISerializationContext context, MLChoiceAlgorithm semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MmlgPackage.Literals.ML_CHOICE_ALGORITHM__FRAMEWORK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MmlgPackage.Literals.ML_CHOICE_ALGORITHM__FRAMEWORK));
			if (transientValues.isValueTransient(semanticObject, MmlgPackage.Literals.ML_CHOICE_ALGORITHM__ALGORITHM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MmlgPackage.Literals.ML_CHOICE_ALGORITHM__ALGORITHM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMLChoiceAlgorithmAccess().getFrameworkFrameworkLangEnumRuleCall_1_0(), semanticObject.getFramework());
		feeder.accept(grammarAccess.getMLChoiceAlgorithmAccess().getAlgorithmMLAlgorithmParserRuleCall_3_0(), semanticObject.getAlgorithm());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MMLModel returns MMLModel
	 *
	 * Constraint:
	 *     (input=DataInput algorithm=MLChoiceAlgorithm? formula=RFormula? validation=Validation?)
	 */
	protected void sequence_MMLModel(ISerializationContext context, MMLModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XFormula returns PredictorVariables
	 *     PredictorVariables returns PredictorVariables
	 *
	 * Constraint:
	 *     (vars+=FormulaItem vars+=FormulaItem*)
	 */
	protected void sequence_PredictorVariables(ISerializationContext context, PredictorVariables semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RFormula returns RFormula
	 *
	 * Constraint:
	 *     (predictive=FormulaItem? predictors=XFormula)
	 */
	protected void sequence_RFormula(ISerializationContext context, RFormula semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MLAlgorithm returns RandomForest
	 *     RandomForest returns RandomForest
	 *
	 * Constraint:
	 *     {RandomForest}
	 */
	protected void sequence_RandomForest(ISerializationContext context, RandomForest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MLAlgorithm returns SVM
	 *     SVM returns SVM
	 *
	 * Constraint:
	 *     (gamma=FLOAT? C=FLOAT? kernel=SVMKernel? svmclassification=SVMClassification?)
	 */
	protected void sequence_SVM(ISerializationContext context, SVM semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StratificationMethod returns TrainingTest
	 *     TrainingTest returns TrainingTest
	 *
	 * Constraint:
	 *     number=INT
	 */
	protected void sequence_TrainingTest(ISerializationContext context, TrainingTest semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MmlgPackage.Literals.STRATIFICATION_METHOD__NUMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MmlgPackage.Literals.STRATIFICATION_METHOD__NUMBER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTrainingTestAccess().getNumberINTTerminalRuleCall_3_0(), semanticObject.getNumber());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Validation returns Validation
	 *
	 * Constraint:
	 *     (stratification=StratificationMethod metric+=ValidationMetric+)
	 */
	protected void sequence_Validation(ISerializationContext context, Validation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}