/*
 * generated by Xtext 2.21.0
 */
package org.xtext.nusmv.language.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.nusmv.language.parser.antlr.internal.InternalNuSMVParser;
import org.xtext.nusmv.language.services.NuSMVGrammarAccess;

public class NuSMVParser extends AbstractAntlrParser {

	@Inject
	private NuSMVGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens();
	}
	

	@Override
	protected InternalNuSMVParser createParser(XtextTokenStream stream) {
		return new InternalNuSMVParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "NuSmvModel";
	}

	public NuSMVGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(NuSMVGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
