/*
 * generated by Xtext 2.21.0
 */
package org.xtext.nusmv.language.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.nusmv.language.services.NuSMVGrammarAccess;

@SuppressWarnings("all")
public class NuSMVSyntacticSequencer extends AbstractSyntacticSequencer {

	protected NuSMVGrammarAccess grammarAccess;
	protected AbstractElementAlias match_FormalParameter___FullStopKeyword_1_0_q_IDTerminalRuleCall_1_1__a;
	protected AbstractElementAlias match_Val_FALSEKeyword_1_3_or_TRUEKeyword_1_2;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (NuSMVGrammarAccess) access;
		match_FormalParameter___FullStopKeyword_1_0_q_IDTerminalRuleCall_1_1__a = new GroupAlias(true, true, new TokenAlias(false, true, grammarAccess.getFormalParameterAccess().getFullStopKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getFormalParameterAccess().getIDTerminalRuleCall_1_1()));
		match_Val_FALSEKeyword_1_3_or_TRUEKeyword_1_2 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getValAccess().getFALSEKeyword_1_3()), new TokenAlias(false, false, grammarAccess.getValAccess().getTRUEKeyword_1_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ID:
	 * 	('A'..'Z' | 'a'..'z' | '_') ('A'..'Z' | 'a'..'z' | '_' | INT | '$' | '#' | '-' | ".")*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_FormalParameter___FullStopKeyword_1_0_q_IDTerminalRuleCall_1_1__a.equals(syntax))
				emit_FormalParameter___FullStopKeyword_1_0_q_IDTerminalRuleCall_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Val_FALSEKeyword_1_3_or_TRUEKeyword_1_2.equals(syntax))
				emit_Val_FALSEKeyword_1_3_or_TRUEKeyword_1_2(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('.'? ID)*
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) (rule end)
	 */
	protected void emit_FormalParameter___FullStopKeyword_1_0_q_IDTerminalRuleCall_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'TRUE' | 'FALSE'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Val_FALSEKeyword_1_3_or_TRUEKeyword_1_2(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
