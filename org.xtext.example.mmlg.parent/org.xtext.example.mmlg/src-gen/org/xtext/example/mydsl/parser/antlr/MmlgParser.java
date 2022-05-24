/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mydsl.parser.antlr.internal.InternalMmlgParser;
import org.xtext.example.mydsl.services.MmlgGrammarAccess;

public class MmlgParser extends AbstractAntlrParser {

	@Inject
	private MmlgGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMmlgParser createParser(XtextTokenStream stream) {
		return new InternalMmlgParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "MMLModel";
	}

	public MmlgGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MmlgGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}