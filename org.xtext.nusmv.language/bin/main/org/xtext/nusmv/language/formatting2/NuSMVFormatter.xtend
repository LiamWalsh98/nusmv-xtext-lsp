/*
 * generated by Xtext 2.21.0
 */
package org.xtext.nusmv.language.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.nusmv.language.nuSMV.NuSmvModel
import org.xtext.nusmv.language.services.NuSMVGrammarAccess

class NuSMVFormatter extends AbstractFormatter2 {
	
	@Inject extension NuSMVGrammarAccess

	def dispatch void format(NuSmvModel nuSmvModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (module : nuSmvModel.modules) {
			module.format
		}
	}

	def dispatch void format(org.xtext.nusmv.language.nuSMV.Module module, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (formalParameter : module.params) {
			formalParameter.format
		}
		for (moduleElement : module.moduleElement) {
			moduleElement.format
		}
	}
	
	// TODO: implement for VariableDeclaration, IVariableDeclaration, FrozenVariableDeclaration, VarBody, DefineDeclaration, DefineBody, AssignConstraintElement, VarBodyAssign, InitBody, NextBody, TransConstraint, InitConstraint, InvarConstraint, FairnessExpression, JusticeExpression, CompassionExpression, CtlSpecification, PslSpecification, InvarSpecification, LtlSpecification, EnumType, ArrayType, AsyncrProcessType, SyncrProcessType, NextExpression, BinaryExpression, Not, ParsExpression, UnaryExpression, Var, SetExpression, UntilCTLexpression, UnaryFunctionExpression, ToInt, CaseSimpleExpression, CaseSimpleAssignementExpression, CTLExpression, PSLExpression, LTLExpression, SingleRTCTLExpression, UnaryRTCTLExpression, ComputeSpecification
}
