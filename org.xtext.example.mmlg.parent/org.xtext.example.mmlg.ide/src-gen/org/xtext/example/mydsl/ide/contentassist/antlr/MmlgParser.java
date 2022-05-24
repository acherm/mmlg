/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMmlgParser;
import org.xtext.example.mydsl.services.MmlgGrammarAccess;

public class MmlgParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MmlgGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MmlgGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getMLAlgorithmAccess().getAlternatives(), "rule__MLAlgorithm__Alternatives");
			builder.put(grammarAccess.getDTAccess().getAlternatives_1(), "rule__DT__Alternatives_1");
			builder.put(grammarAccess.getRandomForestAccess().getAlternatives_1(), "rule__RandomForest__Alternatives_1");
			builder.put(grammarAccess.getXFormulaAccess().getAlternatives(), "rule__XFormula__Alternatives");
			builder.put(grammarAccess.getFormulaItemAccess().getAlternatives(), "rule__FormulaItem__Alternatives");
			builder.put(grammarAccess.getStratificationMethodAccess().getAlternatives(), "rule__StratificationMethod__Alternatives");
			builder.put(grammarAccess.getCSVSeparatorAccess().getAlternatives(), "rule__CSVSeparator__Alternatives");
			builder.put(grammarAccess.getFrameworkLangAccess().getAlternatives(), "rule__FrameworkLang__Alternatives");
			builder.put(grammarAccess.getSVMKernelAccess().getAlternatives(), "rule__SVMKernel__Alternatives");
			builder.put(grammarAccess.getSVMClassificationAccess().getAlternatives(), "rule__SVMClassification__Alternatives");
			builder.put(grammarAccess.getValidationMetricAccess().getAlternatives(), "rule__ValidationMetric__Alternatives");
			builder.put(grammarAccess.getMMLModelAccess().getGroup(), "rule__MMLModel__Group__0");
			builder.put(grammarAccess.getDataInputAccess().getGroup(), "rule__DataInput__Group__0");
			builder.put(grammarAccess.getCSVParsingConfigurationAccess().getGroup(), "rule__CSVParsingConfiguration__Group__0");
			builder.put(grammarAccess.getMLChoiceAlgorithmAccess().getGroup(), "rule__MLChoiceAlgorithm__Group__0");
			builder.put(grammarAccess.getSVMAccess().getGroup(), "rule__SVM__Group__0");
			builder.put(grammarAccess.getSVMAccess().getGroup_2(), "rule__SVM__Group_2__0");
			builder.put(grammarAccess.getSVMAccess().getGroup_3(), "rule__SVM__Group_3__0");
			builder.put(grammarAccess.getSVMAccess().getGroup_4(), "rule__SVM__Group_4__0");
			builder.put(grammarAccess.getSVMAccess().getGroup_5(), "rule__SVM__Group_5__0");
			builder.put(grammarAccess.getDTAccess().getGroup(), "rule__DT__Group__0");
			builder.put(grammarAccess.getRandomForestAccess().getGroup(), "rule__RandomForest__Group__0");
			builder.put(grammarAccess.getLogisticRegressionAccess().getGroup(), "rule__LogisticRegression__Group__0");
			builder.put(grammarAccess.getFLOATAccess().getGroup(), "rule__FLOAT__Group__0");
			builder.put(grammarAccess.getRFormulaAccess().getGroup(), "rule__RFormula__Group__0");
			builder.put(grammarAccess.getRFormulaAccess().getGroup_1(), "rule__RFormula__Group_1__0");
			builder.put(grammarAccess.getPredictorVariablesAccess().getGroup(), "rule__PredictorVariables__Group__0");
			builder.put(grammarAccess.getPredictorVariablesAccess().getGroup_1(), "rule__PredictorVariables__Group_1__0");
			builder.put(grammarAccess.getValidationAccess().getGroup(), "rule__Validation__Group__0");
			builder.put(grammarAccess.getCrossValidationAccess().getGroup(), "rule__CrossValidation__Group__0");
			builder.put(grammarAccess.getTrainingTestAccess().getGroup(), "rule__TrainingTest__Group__0");
			builder.put(grammarAccess.getMMLModelAccess().getInputAssignment_0(), "rule__MMLModel__InputAssignment_0");
			builder.put(grammarAccess.getMMLModelAccess().getAlgorithmAssignment_1(), "rule__MMLModel__AlgorithmAssignment_1");
			builder.put(grammarAccess.getMMLModelAccess().getFormulaAssignment_2(), "rule__MMLModel__FormulaAssignment_2");
			builder.put(grammarAccess.getMMLModelAccess().getValidationAssignment_3(), "rule__MMLModel__ValidationAssignment_3");
			builder.put(grammarAccess.getDataInputAccess().getFilelocationAssignment_1(), "rule__DataInput__FilelocationAssignment_1");
			builder.put(grammarAccess.getDataInputAccess().getParsingInstructionAssignment_2(), "rule__DataInput__ParsingInstructionAssignment_2");
			builder.put(grammarAccess.getCSVParsingConfigurationAccess().getSepAssignment_1(), "rule__CSVParsingConfiguration__SepAssignment_1");
			builder.put(grammarAccess.getMLChoiceAlgorithmAccess().getFrameworkAssignment_1(), "rule__MLChoiceAlgorithm__FrameworkAssignment_1");
			builder.put(grammarAccess.getMLChoiceAlgorithmAccess().getAlgorithmAssignment_3(), "rule__MLChoiceAlgorithm__AlgorithmAssignment_3");
			builder.put(grammarAccess.getSVMAccess().getGammaAssignment_2_1(), "rule__SVM__GammaAssignment_2_1");
			builder.put(grammarAccess.getSVMAccess().getCAssignment_3_1(), "rule__SVM__CAssignment_3_1");
			builder.put(grammarAccess.getSVMAccess().getKernelAssignment_4_1(), "rule__SVM__KernelAssignment_4_1");
			builder.put(grammarAccess.getSVMAccess().getSvmclassificationAssignment_5_1(), "rule__SVM__SvmclassificationAssignment_5_1");
			builder.put(grammarAccess.getDTAccess().getMax_depthAssignment_2(), "rule__DT__Max_depthAssignment_2");
			builder.put(grammarAccess.getRFormulaAccess().getPredictiveAssignment_1_0(), "rule__RFormula__PredictiveAssignment_1_0");
			builder.put(grammarAccess.getRFormulaAccess().getPredictorsAssignment_2(), "rule__RFormula__PredictorsAssignment_2");
			builder.put(grammarAccess.getAllVariablesAccess().getAllAssignment(), "rule__AllVariables__AllAssignment");
			builder.put(grammarAccess.getPredictorVariablesAccess().getVarsAssignment_0(), "rule__PredictorVariables__VarsAssignment_0");
			builder.put(grammarAccess.getPredictorVariablesAccess().getVarsAssignment_1_1(), "rule__PredictorVariables__VarsAssignment_1_1");
			builder.put(grammarAccess.getFormulaItemAccess().getColumnAssignment_0(), "rule__FormulaItem__ColumnAssignment_0");
			builder.put(grammarAccess.getFormulaItemAccess().getColNameAssignment_1(), "rule__FormulaItem__ColNameAssignment_1");
			builder.put(grammarAccess.getValidationAccess().getStratificationAssignment_0(), "rule__Validation__StratificationAssignment_0");
			builder.put(grammarAccess.getValidationAccess().getMetricAssignment_1(), "rule__Validation__MetricAssignment_1");
			builder.put(grammarAccess.getCrossValidationAccess().getNumberAssignment_3(), "rule__CrossValidation__NumberAssignment_3");
			builder.put(grammarAccess.getTrainingTestAccess().getNumberAssignment_3(), "rule__TrainingTest__NumberAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MmlgGrammarAccess grammarAccess;

	@Override
	protected InternalMmlgParser createParser() {
		InternalMmlgParser result = new InternalMmlgParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MmlgGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MmlgGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
