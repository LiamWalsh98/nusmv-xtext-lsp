package org.xtext.nusmv.language.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.nusmv.language.services.NuSMVGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalNuSMVParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WORD", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "'MODULE'", "'('", "','", "')'", "'VAR'", "'IVAR'", "'FROZENVAR'", "':'", "';'", "'DEFINE'", "':='", "'CONSTANTS'", "'ASSIGN'", "'init'", "'next'", "'TRANS'", "'INIT'", "'INVAR'", "'FAIRNESS'", "'JUSTICE'", "'COMPASSION ('", "'CTLSPEC'", "'SPEC'", "'NAME'", "'PSLSPEC'", "'INVARSPEC'", "'ISA'", "'LTLSPEC'", "'boolean'", "'word'", "'['", "']'", "'unsigned'", "'signed word'", "'{'", "'}'", "'..'", "'array'", "'of'", "'process'", "'TRUE'", "'FALSE'", "'in'", "'union'", "'>>'", "'<<'", "'-'", "'+'", "'*'", "'mod'", "'::'", "'/'", "'!'", "'EG'", "'EX'", "'EF'", "'AG'", "'AX'", "'AF'", "'X'", "'G'", "'F'", "'Y'", "'Z'", "'H'", "'O'", "'.'", "'self'", "'E'", "'A'", "'word1'", "'bool'", "'toint'", "'case'", "'esac'", "'EBF'", "'ABF'", "'EBG'", "'ABG'", "'COMPUTE'", "'MIN'", "'MAX'", "'='", "'!='", "'<'", "'>'", "'<='", "'>='", "'|'", "'xor'", "'xnor'", "'->'", "'<->'", "'&'", "'U'", "'V'", "'S'", "'T'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_WORD=5;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__10=10;
    public static final int T__98=98;
    public static final int T__9=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_SL_COMMENT=7;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=8;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalNuSMVParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalNuSMVParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalNuSMVParser.tokenNames; }
    public String getGrammarFileName() { return "InternalNuSMV.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private NuSMVGrammarAccess grammarAccess;

        public InternalNuSMVParser(TokenStream input, NuSMVGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "NuSmvModel";
       	}

       	@Override
       	protected NuSMVGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleNuSmvModel"
    // InternalNuSMV.g:71:1: entryRuleNuSmvModel returns [EObject current=null] : iv_ruleNuSmvModel= ruleNuSmvModel EOF ;
    public final EObject entryRuleNuSmvModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNuSmvModel = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:73:2: (iv_ruleNuSmvModel= ruleNuSmvModel EOF )
            // InternalNuSMV.g:74:2: iv_ruleNuSmvModel= ruleNuSmvModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNuSmvModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNuSmvModel=ruleNuSmvModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNuSmvModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNuSmvModel"


    // $ANTLR start "ruleNuSmvModel"
    // InternalNuSMV.g:83:1: ruleNuSmvModel returns [EObject current=null] : ( (lv_modules_0_0= ruleModule ) )* ;
    public final EObject ruleNuSmvModel() throws RecognitionException {
        EObject current = null;

        EObject lv_modules_0_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:90:2: ( ( (lv_modules_0_0= ruleModule ) )* )
            // InternalNuSMV.g:91:2: ( (lv_modules_0_0= ruleModule ) )*
            {
            // InternalNuSMV.g:91:2: ( (lv_modules_0_0= ruleModule ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==9) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalNuSMV.g:92:3: (lv_modules_0_0= ruleModule )
            	    {
            	    // InternalNuSMV.g:92:3: (lv_modules_0_0= ruleModule )
            	    // InternalNuSMV.g:93:4: lv_modules_0_0= ruleModule
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getNuSmvModelAccess().getModulesModuleParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_modules_0_0=ruleModule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getNuSmvModelRule());
            	      				}
            	      				add(
            	      					current,
            	      					"modules",
            	      					lv_modules_0_0,
            	      					"org.xtext.nusmv.language.NuSMV.Module");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNuSmvModel"


    // $ANTLR start "entryRuleModule"
    // InternalNuSMV.g:116:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // InternalNuSMV.g:116:47: (iv_ruleModule= ruleModule EOF )
            // InternalNuSMV.g:117:2: iv_ruleModule= ruleModule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModule=ruleModule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // InternalNuSMV.g:123:1: ruleModule returns [EObject current=null] : (otherlv_0= 'MODULE' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleFormalParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleFormalParameter ) ) )* otherlv_6= ')' )? ( (lv_moduleElement_7_0= ruleModuleElement ) )* ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_moduleElement_7_0 = null;



        	enterRule();

        try {
            // InternalNuSMV.g:129:2: ( (otherlv_0= 'MODULE' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleFormalParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleFormalParameter ) ) )* otherlv_6= ')' )? ( (lv_moduleElement_7_0= ruleModuleElement ) )* ) )
            // InternalNuSMV.g:130:2: (otherlv_0= 'MODULE' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleFormalParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleFormalParameter ) ) )* otherlv_6= ')' )? ( (lv_moduleElement_7_0= ruleModuleElement ) )* )
            {
            // InternalNuSMV.g:130:2: (otherlv_0= 'MODULE' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleFormalParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleFormalParameter ) ) )* otherlv_6= ')' )? ( (lv_moduleElement_7_0= ruleModuleElement ) )* )
            // InternalNuSMV.g:131:3: otherlv_0= 'MODULE' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleFormalParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleFormalParameter ) ) )* otherlv_6= ')' )? ( (lv_moduleElement_7_0= ruleModuleElement ) )*
            {
            otherlv_0=(Token)match(input,9,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getMODULEKeyword_0());
              		
            }
            // InternalNuSMV.g:135:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalNuSMV.g:136:4: (lv_name_1_0= RULE_ID )
            {
            // InternalNuSMV.g:136:4: (lv_name_1_0= RULE_ID )
            // InternalNuSMV.g:137:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getModuleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.xtext.nusmv.language.NuSMV.ID");
              				
            }

            }


            }

            // InternalNuSMV.g:153:3: (otherlv_2= '(' ( (lv_params_3_0= ruleFormalParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleFormalParameter ) ) )* otherlv_6= ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==10) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalNuSMV.g:154:4: otherlv_2= '(' ( (lv_params_3_0= ruleFormalParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleFormalParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,10,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getModuleAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    // InternalNuSMV.g:158:4: ( (lv_params_3_0= ruleFormalParameter ) )
                    // InternalNuSMV.g:159:5: (lv_params_3_0= ruleFormalParameter )
                    {
                    // InternalNuSMV.g:159:5: (lv_params_3_0= ruleFormalParameter )
                    // InternalNuSMV.g:160:6: lv_params_3_0= ruleFormalParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getModuleAccess().getParamsFormalParameterParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    lv_params_3_0=ruleFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getModuleRule());
                      						}
                      						add(
                      							current,
                      							"params",
                      							lv_params_3_0,
                      							"org.xtext.nusmv.language.NuSMV.FormalParameter");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNuSMV.g:177:4: (otherlv_4= ',' ( (lv_params_5_0= ruleFormalParameter ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==11) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalNuSMV.g:178:5: otherlv_4= ',' ( (lv_params_5_0= ruleFormalParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getModuleAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalNuSMV.g:182:5: ( (lv_params_5_0= ruleFormalParameter ) )
                    	    // InternalNuSMV.g:183:6: (lv_params_5_0= ruleFormalParameter )
                    	    {
                    	    // InternalNuSMV.g:183:6: (lv_params_5_0= ruleFormalParameter )
                    	    // InternalNuSMV.g:184:7: lv_params_5_0= ruleFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getModuleAccess().getParamsFormalParameterParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_params_5_0=ruleFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getModuleRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"params",
                    	      								lv_params_5_0,
                    	      								"org.xtext.nusmv.language.NuSMV.FormalParameter");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,12,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getModuleAccess().getRightParenthesisKeyword_2_3());
                      			
                    }

                    }
                    break;

            }

            // InternalNuSMV.g:207:3: ( (lv_moduleElement_7_0= ruleModuleElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=13 && LA4_0<=15)||LA4_0==18||(LA4_0>=20 && LA4_0<=21)||(LA4_0>=24 && LA4_0<=31)||(LA4_0>=33 && LA4_0<=36)||LA4_0==88) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalNuSMV.g:208:4: (lv_moduleElement_7_0= ruleModuleElement )
            	    {
            	    // InternalNuSMV.g:208:4: (lv_moduleElement_7_0= ruleModuleElement )
            	    // InternalNuSMV.g:209:5: lv_moduleElement_7_0= ruleModuleElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModuleAccess().getModuleElementModuleElementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_moduleElement_7_0=ruleModuleElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModuleRule());
            	      					}
            	      					add(
            	      						current,
            	      						"moduleElement",
            	      						lv_moduleElement_7_0,
            	      						"org.xtext.nusmv.language.NuSMV.ModuleElement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleModuleElement"
    // InternalNuSMV.g:230:1: entryRuleModuleElement returns [EObject current=null] : iv_ruleModuleElement= ruleModuleElement EOF ;
    public final EObject entryRuleModuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleElement = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:232:2: (iv_ruleModuleElement= ruleModuleElement EOF )
            // InternalNuSMV.g:233:2: iv_ruleModuleElement= ruleModuleElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModuleElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModuleElement=ruleModuleElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModuleElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleModuleElement"


    // $ANTLR start "ruleModuleElement"
    // InternalNuSMV.g:242:1: ruleModuleElement returns [EObject current=null] : (this_VariableDeclaration_0= ruleVariableDeclaration | this_IVariableDeclaration_1= ruleIVariableDeclaration | this_FrozenVariableDeclaration_2= ruleFrozenVariableDeclaration | this_DefineDeclaration_3= ruleDefineDeclaration | this_ConstantsDeclaration_4= ruleConstantsDeclaration | this_AssignConstraint_5= ruleAssignConstraint | this_TransConstraint_6= ruleTransConstraint | this_InitConstraint_7= ruleInitConstraint | this_InvarConstraint_8= ruleInvarConstraint | this_FairnessConstraint_9= ruleFairnessConstraint | this_CtlSpecification_10= ruleCtlSpecification | this_PslSpecification_11= rulePslSpecification | this_InvarSpecification_12= ruleInvarSpecification | this_LtlSpecification_13= ruleLtlSpecification | this_IsaDeclaration_14= ruleIsaDeclaration | this_ComputeSpecification_15= ruleComputeSpecification ) ;
    public final EObject ruleModuleElement() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDeclaration_0 = null;

        EObject this_IVariableDeclaration_1 = null;

        EObject this_FrozenVariableDeclaration_2 = null;

        EObject this_DefineDeclaration_3 = null;

        EObject this_ConstantsDeclaration_4 = null;

        EObject this_AssignConstraint_5 = null;

        EObject this_TransConstraint_6 = null;

        EObject this_InitConstraint_7 = null;

        EObject this_InvarConstraint_8 = null;

        EObject this_FairnessConstraint_9 = null;

        EObject this_CtlSpecification_10 = null;

        EObject this_PslSpecification_11 = null;

        EObject this_InvarSpecification_12 = null;

        EObject this_LtlSpecification_13 = null;

        EObject this_IsaDeclaration_14 = null;

        EObject this_ComputeSpecification_15 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:249:2: ( (this_VariableDeclaration_0= ruleVariableDeclaration | this_IVariableDeclaration_1= ruleIVariableDeclaration | this_FrozenVariableDeclaration_2= ruleFrozenVariableDeclaration | this_DefineDeclaration_3= ruleDefineDeclaration | this_ConstantsDeclaration_4= ruleConstantsDeclaration | this_AssignConstraint_5= ruleAssignConstraint | this_TransConstraint_6= ruleTransConstraint | this_InitConstraint_7= ruleInitConstraint | this_InvarConstraint_8= ruleInvarConstraint | this_FairnessConstraint_9= ruleFairnessConstraint | this_CtlSpecification_10= ruleCtlSpecification | this_PslSpecification_11= rulePslSpecification | this_InvarSpecification_12= ruleInvarSpecification | this_LtlSpecification_13= ruleLtlSpecification | this_IsaDeclaration_14= ruleIsaDeclaration | this_ComputeSpecification_15= ruleComputeSpecification ) )
            // InternalNuSMV.g:250:2: (this_VariableDeclaration_0= ruleVariableDeclaration | this_IVariableDeclaration_1= ruleIVariableDeclaration | this_FrozenVariableDeclaration_2= ruleFrozenVariableDeclaration | this_DefineDeclaration_3= ruleDefineDeclaration | this_ConstantsDeclaration_4= ruleConstantsDeclaration | this_AssignConstraint_5= ruleAssignConstraint | this_TransConstraint_6= ruleTransConstraint | this_InitConstraint_7= ruleInitConstraint | this_InvarConstraint_8= ruleInvarConstraint | this_FairnessConstraint_9= ruleFairnessConstraint | this_CtlSpecification_10= ruleCtlSpecification | this_PslSpecification_11= rulePslSpecification | this_InvarSpecification_12= ruleInvarSpecification | this_LtlSpecification_13= ruleLtlSpecification | this_IsaDeclaration_14= ruleIsaDeclaration | this_ComputeSpecification_15= ruleComputeSpecification )
            {
            // InternalNuSMV.g:250:2: (this_VariableDeclaration_0= ruleVariableDeclaration | this_IVariableDeclaration_1= ruleIVariableDeclaration | this_FrozenVariableDeclaration_2= ruleFrozenVariableDeclaration | this_DefineDeclaration_3= ruleDefineDeclaration | this_ConstantsDeclaration_4= ruleConstantsDeclaration | this_AssignConstraint_5= ruleAssignConstraint | this_TransConstraint_6= ruleTransConstraint | this_InitConstraint_7= ruleInitConstraint | this_InvarConstraint_8= ruleInvarConstraint | this_FairnessConstraint_9= ruleFairnessConstraint | this_CtlSpecification_10= ruleCtlSpecification | this_PslSpecification_11= rulePslSpecification | this_InvarSpecification_12= ruleInvarSpecification | this_LtlSpecification_13= ruleLtlSpecification | this_IsaDeclaration_14= ruleIsaDeclaration | this_ComputeSpecification_15= ruleComputeSpecification )
            int alt5=16;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            case 18:
                {
                alt5=4;
                }
                break;
            case 20:
                {
                alt5=5;
                }
                break;
            case 21:
                {
                alt5=6;
                }
                break;
            case 24:
                {
                alt5=7;
                }
                break;
            case 25:
                {
                alt5=8;
                }
                break;
            case 26:
                {
                alt5=9;
                }
                break;
            case 27:
            case 28:
            case 29:
                {
                alt5=10;
                }
                break;
            case 30:
            case 31:
                {
                alt5=11;
                }
                break;
            case 33:
                {
                alt5=12;
                }
                break;
            case 34:
                {
                alt5=13;
                }
                break;
            case 36:
                {
                alt5=14;
                }
                break;
            case 35:
                {
                alt5=15;
                }
                break;
            case 88:
                {
                alt5=16;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalNuSMV.g:251:3: this_VariableDeclaration_0= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleElementAccess().getVariableDeclarationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VariableDeclaration_0=ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VariableDeclaration_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNuSMV.g:263:3: this_IVariableDeclaration_1= ruleIVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleElementAccess().getIVariableDeclarationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IVariableDeclaration_1=ruleIVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IVariableDeclaration_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNuSMV.g:275:3: this_FrozenVariableDeclaration_2= ruleFrozenVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleElementAccess().getFrozenVariableDeclarationParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FrozenVariableDeclaration_2=ruleFrozenVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FrozenVariableDeclaration_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNuSMV.g:287:3: this_DefineDeclaration_3= ruleDefineDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleElementAccess().getDefineDeclarationParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DefineDeclaration_3=ruleDefineDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DefineDeclaration_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalNuSMV.g:299:3: this_ConstantsDeclaration_4= ruleConstantsDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleElementAccess().getConstantsDeclarationParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConstantsDeclaration_4=ruleConstantsDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConstantsDeclaration_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalNuSMV.g:311:3: this_AssignConstraint_5= ruleAssignConstraint
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleElementAccess().getAssignConstraintParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AssignConstraint_5=ruleAssignConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AssignConstraint_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalNuSMV.g:323:3: this_TransConstraint_6= ruleTransConstraint
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleElementAccess().getTransConstraintParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TransConstraint_6=ruleTransConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TransConstraint_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalNuSMV.g:335:3: this_InitConstraint_7= ruleInitConstraint
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleElementAccess().getInitConstraintParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_InitConstraint_7=ruleInitConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InitConstraint_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalNuSMV.g:347:3: this_InvarConstraint_8= ruleInvarConstraint
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleElementAccess().getInvarConstraintParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_InvarConstraint_8=ruleInvarConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InvarConstraint_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalNuSMV.g:359:3: this_FairnessConstraint_9= ruleFairnessConstraint
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleElementAccess().getFairnessConstraintParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FairnessConstraint_9=ruleFairnessConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FairnessConstraint_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalNuSMV.g:371:3: this_CtlSpecification_10= ruleCtlSpecification
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleElementAccess().getCtlSpecificationParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CtlSpecification_10=ruleCtlSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CtlSpecification_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalNuSMV.g:383:3: this_PslSpecification_11= rulePslSpecification
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleElementAccess().getPslSpecificationParserRuleCall_11());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PslSpecification_11=rulePslSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PslSpecification_11;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalNuSMV.g:395:3: this_InvarSpecification_12= ruleInvarSpecification
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleElementAccess().getInvarSpecificationParserRuleCall_12());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_InvarSpecification_12=ruleInvarSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InvarSpecification_12;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalNuSMV.g:407:3: this_LtlSpecification_13= ruleLtlSpecification
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleElementAccess().getLtlSpecificationParserRuleCall_13());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LtlSpecification_13=ruleLtlSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LtlSpecification_13;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalNuSMV.g:419:3: this_IsaDeclaration_14= ruleIsaDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleElementAccess().getIsaDeclarationParserRuleCall_14());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IsaDeclaration_14=ruleIsaDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IsaDeclaration_14;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 16 :
                    // InternalNuSMV.g:431:3: this_ComputeSpecification_15= ruleComputeSpecification
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModuleElementAccess().getComputeSpecificationParserRuleCall_15());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ComputeSpecification_15=ruleComputeSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ComputeSpecification_15;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleModuleElement"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalNuSMV.g:449:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:451:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalNuSMV.g:452:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalNuSMV.g:461:1: ruleVariableDeclaration returns [EObject current=null] : (otherlv_0= 'VAR' () ( (lv_vars_2_0= ruleVarBody ) )* ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_vars_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:468:2: ( (otherlv_0= 'VAR' () ( (lv_vars_2_0= ruleVarBody ) )* ) )
            // InternalNuSMV.g:469:2: (otherlv_0= 'VAR' () ( (lv_vars_2_0= ruleVarBody ) )* )
            {
            // InternalNuSMV.g:469:2: (otherlv_0= 'VAR' () ( (lv_vars_2_0= ruleVarBody ) )* )
            // InternalNuSMV.g:470:3: otherlv_0= 'VAR' () ( (lv_vars_2_0= ruleVarBody ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getVARKeyword_0());
              		
            }
            // InternalNuSMV.g:474:3: ()
            // InternalNuSMV.g:475:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVariableDeclarationAccess().getVariableDeclarationAction_1(),
              					current);
              			
            }

            }

            // InternalNuSMV.g:484:3: ( (lv_vars_2_0= ruleVarBody ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalNuSMV.g:485:4: (lv_vars_2_0= ruleVarBody )
            	    {
            	    // InternalNuSMV.g:485:4: (lv_vars_2_0= ruleVarBody )
            	    // InternalNuSMV.g:486:5: lv_vars_2_0= ruleVarBody
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVarsVarBodyParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_vars_2_0=ruleVarBody();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"vars",
            	      						lv_vars_2_0,
            	      						"org.xtext.nusmv.language.NuSMV.VarBody");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleIVariableDeclaration"
    // InternalNuSMV.g:510:1: entryRuleIVariableDeclaration returns [EObject current=null] : iv_ruleIVariableDeclaration= ruleIVariableDeclaration EOF ;
    public final EObject entryRuleIVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIVariableDeclaration = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:512:2: (iv_ruleIVariableDeclaration= ruleIVariableDeclaration EOF )
            // InternalNuSMV.g:513:2: iv_ruleIVariableDeclaration= ruleIVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIVariableDeclaration=ruleIVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleIVariableDeclaration"


    // $ANTLR start "ruleIVariableDeclaration"
    // InternalNuSMV.g:522:1: ruleIVariableDeclaration returns [EObject current=null] : (otherlv_0= 'IVAR' ( (lv_vars_1_0= ruleVarBody ) )+ ) ;
    public final EObject ruleIVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_vars_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:529:2: ( (otherlv_0= 'IVAR' ( (lv_vars_1_0= ruleVarBody ) )+ ) )
            // InternalNuSMV.g:530:2: (otherlv_0= 'IVAR' ( (lv_vars_1_0= ruleVarBody ) )+ )
            {
            // InternalNuSMV.g:530:2: (otherlv_0= 'IVAR' ( (lv_vars_1_0= ruleVarBody ) )+ )
            // InternalNuSMV.g:531:3: otherlv_0= 'IVAR' ( (lv_vars_1_0= ruleVarBody ) )+
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIVariableDeclarationAccess().getIVARKeyword_0());
              		
            }
            // InternalNuSMV.g:535:3: ( (lv_vars_1_0= ruleVarBody ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalNuSMV.g:536:4: (lv_vars_1_0= ruleVarBody )
            	    {
            	    // InternalNuSMV.g:536:4: (lv_vars_1_0= ruleVarBody )
            	    // InternalNuSMV.g:537:5: lv_vars_1_0= ruleVarBody
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIVariableDeclarationAccess().getVarsVarBodyParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_vars_1_0=ruleVarBody();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getIVariableDeclarationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"vars",
            	      						lv_vars_1_0,
            	      						"org.xtext.nusmv.language.NuSMV.VarBody");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleIVariableDeclaration"


    // $ANTLR start "entryRuleFrozenVariableDeclaration"
    // InternalNuSMV.g:561:1: entryRuleFrozenVariableDeclaration returns [EObject current=null] : iv_ruleFrozenVariableDeclaration= ruleFrozenVariableDeclaration EOF ;
    public final EObject entryRuleFrozenVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrozenVariableDeclaration = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:563:2: (iv_ruleFrozenVariableDeclaration= ruleFrozenVariableDeclaration EOF )
            // InternalNuSMV.g:564:2: iv_ruleFrozenVariableDeclaration= ruleFrozenVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFrozenVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFrozenVariableDeclaration=ruleFrozenVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFrozenVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleFrozenVariableDeclaration"


    // $ANTLR start "ruleFrozenVariableDeclaration"
    // InternalNuSMV.g:573:1: ruleFrozenVariableDeclaration returns [EObject current=null] : (otherlv_0= 'FROZENVAR' ( (lv_vars_1_0= ruleVarBody ) )+ ) ;
    public final EObject ruleFrozenVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_vars_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:580:2: ( (otherlv_0= 'FROZENVAR' ( (lv_vars_1_0= ruleVarBody ) )+ ) )
            // InternalNuSMV.g:581:2: (otherlv_0= 'FROZENVAR' ( (lv_vars_1_0= ruleVarBody ) )+ )
            {
            // InternalNuSMV.g:581:2: (otherlv_0= 'FROZENVAR' ( (lv_vars_1_0= ruleVarBody ) )+ )
            // InternalNuSMV.g:582:3: otherlv_0= 'FROZENVAR' ( (lv_vars_1_0= ruleVarBody ) )+
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFrozenVariableDeclarationAccess().getFROZENVARKeyword_0());
              		
            }
            // InternalNuSMV.g:586:3: ( (lv_vars_1_0= ruleVarBody ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalNuSMV.g:587:4: (lv_vars_1_0= ruleVarBody )
            	    {
            	    // InternalNuSMV.g:587:4: (lv_vars_1_0= ruleVarBody )
            	    // InternalNuSMV.g:588:5: lv_vars_1_0= ruleVarBody
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFrozenVariableDeclarationAccess().getVarsVarBodyParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_vars_1_0=ruleVarBody();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getFrozenVariableDeclarationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"vars",
            	      						lv_vars_1_0,
            	      						"org.xtext.nusmv.language.NuSMV.VarBody");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleFrozenVariableDeclaration"


    // $ANTLR start "entryRuleVarBody"
    // InternalNuSMV.g:612:1: entryRuleVarBody returns [EObject current=null] : iv_ruleVarBody= ruleVarBody EOF ;
    public final EObject entryRuleVarBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarBody = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:614:2: (iv_ruleVarBody= ruleVarBody EOF )
            // InternalNuSMV.g:615:2: iv_ruleVarBody= ruleVarBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarBodyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarBody=ruleVarBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarBody; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleVarBody"


    // $ANTLR start "ruleVarBody"
    // InternalNuSMV.g:624:1: ruleVarBody returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ( (lv_semicolon_3_0= ';' ) ) ) ;
    public final EObject ruleVarBody() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_semicolon_3_0=null;
        EObject lv_type_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:631:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ( (lv_semicolon_3_0= ';' ) ) ) )
            // InternalNuSMV.g:632:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ( (lv_semicolon_3_0= ';' ) ) )
            {
            // InternalNuSMV.g:632:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ( (lv_semicolon_3_0= ';' ) ) )
            // InternalNuSMV.g:633:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ( (lv_semicolon_3_0= ';' ) )
            {
            // InternalNuSMV.g:633:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalNuSMV.g:634:4: (lv_name_0_0= RULE_ID )
            {
            // InternalNuSMV.g:634:4: (lv_name_0_0= RULE_ID )
            // InternalNuSMV.g:635:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getVarBodyAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVarBodyRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.xtext.nusmv.language.NuSMV.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVarBodyAccess().getColonKeyword_1());
              		
            }
            // InternalNuSMV.g:655:3: ( (lv_type_2_0= ruleType ) )
            // InternalNuSMV.g:656:4: (lv_type_2_0= ruleType )
            {
            // InternalNuSMV.g:656:4: (lv_type_2_0= ruleType )
            // InternalNuSMV.g:657:5: lv_type_2_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarBodyAccess().getTypeTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_type_2_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVarBodyRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"org.xtext.nusmv.language.NuSMV.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNuSMV.g:674:3: ( (lv_semicolon_3_0= ';' ) )
            // InternalNuSMV.g:675:4: (lv_semicolon_3_0= ';' )
            {
            // InternalNuSMV.g:675:4: (lv_semicolon_3_0= ';' )
            // InternalNuSMV.g:676:5: lv_semicolon_3_0= ';'
            {
            lv_semicolon_3_0=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_semicolon_3_0, grammarAccess.getVarBodyAccess().getSemicolonSemicolonKeyword_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVarBodyRule());
              					}
              					setWithLastConsumed(current, "semicolon", true, ";");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleVarBody"


    // $ANTLR start "entryRuleDefineDeclaration"
    // InternalNuSMV.g:695:1: entryRuleDefineDeclaration returns [EObject current=null] : iv_ruleDefineDeclaration= ruleDefineDeclaration EOF ;
    public final EObject entryRuleDefineDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineDeclaration = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:697:2: (iv_ruleDefineDeclaration= ruleDefineDeclaration EOF )
            // InternalNuSMV.g:698:2: iv_ruleDefineDeclaration= ruleDefineDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefineDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefineDeclaration=ruleDefineDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefineDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleDefineDeclaration"


    // $ANTLR start "ruleDefineDeclaration"
    // InternalNuSMV.g:707:1: ruleDefineDeclaration returns [EObject current=null] : ( ( (lv_define_0_0= 'DEFINE' ) ) ( (lv_defineBodies_1_0= ruleDefineBody ) )* ) ;
    public final EObject ruleDefineDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_define_0_0=null;
        EObject lv_defineBodies_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:714:2: ( ( ( (lv_define_0_0= 'DEFINE' ) ) ( (lv_defineBodies_1_0= ruleDefineBody ) )* ) )
            // InternalNuSMV.g:715:2: ( ( (lv_define_0_0= 'DEFINE' ) ) ( (lv_defineBodies_1_0= ruleDefineBody ) )* )
            {
            // InternalNuSMV.g:715:2: ( ( (lv_define_0_0= 'DEFINE' ) ) ( (lv_defineBodies_1_0= ruleDefineBody ) )* )
            // InternalNuSMV.g:716:3: ( (lv_define_0_0= 'DEFINE' ) ) ( (lv_defineBodies_1_0= ruleDefineBody ) )*
            {
            // InternalNuSMV.g:716:3: ( (lv_define_0_0= 'DEFINE' ) )
            // InternalNuSMV.g:717:4: (lv_define_0_0= 'DEFINE' )
            {
            // InternalNuSMV.g:717:4: (lv_define_0_0= 'DEFINE' )
            // InternalNuSMV.g:718:5: lv_define_0_0= 'DEFINE'
            {
            lv_define_0_0=(Token)match(input,18,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_define_0_0, grammarAccess.getDefineDeclarationAccess().getDefineDEFINEKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDefineDeclarationRule());
              					}
              					setWithLastConsumed(current, "define", lv_define_0_0, "DEFINE");
              				
            }

            }


            }

            // InternalNuSMV.g:730:3: ( (lv_defineBodies_1_0= ruleDefineBody ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalNuSMV.g:731:4: (lv_defineBodies_1_0= ruleDefineBody )
            	    {
            	    // InternalNuSMV.g:731:4: (lv_defineBodies_1_0= ruleDefineBody )
            	    // InternalNuSMV.g:732:5: lv_defineBodies_1_0= ruleDefineBody
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDefineDeclarationAccess().getDefineBodiesDefineBodyParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_defineBodies_1_0=ruleDefineBody();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDefineDeclarationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"defineBodies",
            	      						lv_defineBodies_1_0,
            	      						"org.xtext.nusmv.language.NuSMV.DefineBody");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleDefineDeclaration"


    // $ANTLR start "entryRuleDefineBody"
    // InternalNuSMV.g:756:1: entryRuleDefineBody returns [EObject current=null] : iv_ruleDefineBody= ruleDefineBody EOF ;
    public final EObject entryRuleDefineBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineBody = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:758:2: (iv_ruleDefineBody= ruleDefineBody EOF )
            // InternalNuSMV.g:759:2: iv_ruleDefineBody= ruleDefineBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefineBodyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefineBody=ruleDefineBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefineBody; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleDefineBody"


    // $ANTLR start "ruleDefineBody"
    // InternalNuSMV.g:768:1: ruleDefineBody returns [EObject current=null] : ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_assignment_2_0= ruleSimpleExpression ) ) ( (lv_semicolon_3_0= ';' ) ) ) ;
    public final EObject ruleDefineBody() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;
        Token otherlv_1=null;
        Token lv_semicolon_3_0=null;
        EObject lv_assignment_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:775:2: ( ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_assignment_2_0= ruleSimpleExpression ) ) ( (lv_semicolon_3_0= ';' ) ) ) )
            // InternalNuSMV.g:776:2: ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_assignment_2_0= ruleSimpleExpression ) ) ( (lv_semicolon_3_0= ';' ) ) )
            {
            // InternalNuSMV.g:776:2: ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_assignment_2_0= ruleSimpleExpression ) ) ( (lv_semicolon_3_0= ';' ) ) )
            // InternalNuSMV.g:777:3: ( (lv_var_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_assignment_2_0= ruleSimpleExpression ) ) ( (lv_semicolon_3_0= ';' ) )
            {
            // InternalNuSMV.g:777:3: ( (lv_var_0_0= RULE_ID ) )
            // InternalNuSMV.g:778:4: (lv_var_0_0= RULE_ID )
            {
            // InternalNuSMV.g:778:4: (lv_var_0_0= RULE_ID )
            // InternalNuSMV.g:779:5: lv_var_0_0= RULE_ID
            {
            lv_var_0_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_var_0_0, grammarAccess.getDefineBodyAccess().getVarIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDefineBodyRule());
              					}
              					setWithLastConsumed(
              						current,
              						"var",
              						lv_var_0_0,
              						"org.xtext.nusmv.language.NuSMV.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefineBodyAccess().getColonEqualsSignKeyword_1());
              		
            }
            // InternalNuSMV.g:799:3: ( (lv_assignment_2_0= ruleSimpleExpression ) )
            // InternalNuSMV.g:800:4: (lv_assignment_2_0= ruleSimpleExpression )
            {
            // InternalNuSMV.g:800:4: (lv_assignment_2_0= ruleSimpleExpression )
            // InternalNuSMV.g:801:5: lv_assignment_2_0= ruleSimpleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefineBodyAccess().getAssignmentSimpleExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_assignment_2_0=ruleSimpleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefineBodyRule());
              					}
              					set(
              						current,
              						"assignment",
              						lv_assignment_2_0,
              						"org.xtext.nusmv.language.NuSMV.SimpleExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNuSMV.g:818:3: ( (lv_semicolon_3_0= ';' ) )
            // InternalNuSMV.g:819:4: (lv_semicolon_3_0= ';' )
            {
            // InternalNuSMV.g:819:4: (lv_semicolon_3_0= ';' )
            // InternalNuSMV.g:820:5: lv_semicolon_3_0= ';'
            {
            lv_semicolon_3_0=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_semicolon_3_0, grammarAccess.getDefineBodyAccess().getSemicolonSemicolonKeyword_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDefineBodyRule());
              					}
              					setWithLastConsumed(current, "semicolon", true, ";");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleDefineBody"


    // $ANTLR start "entryRuleConstantsDeclaration"
    // InternalNuSMV.g:839:1: entryRuleConstantsDeclaration returns [EObject current=null] : iv_ruleConstantsDeclaration= ruleConstantsDeclaration EOF ;
    public final EObject entryRuleConstantsDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantsDeclaration = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:841:2: (iv_ruleConstantsDeclaration= ruleConstantsDeclaration EOF )
            // InternalNuSMV.g:842:2: iv_ruleConstantsDeclaration= ruleConstantsDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantsDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstantsDeclaration=ruleConstantsDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantsDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleConstantsDeclaration"


    // $ANTLR start "ruleConstantsDeclaration"
    // InternalNuSMV.g:851:1: ruleConstantsDeclaration returns [EObject current=null] : (otherlv_0= 'CONSTANTS' ( (lv_constants_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_constants_3_0= RULE_ID ) ) )* ( (lv_semicolon_4_0= ';' ) ) ) ;
    public final EObject ruleConstantsDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_constants_1_0=null;
        Token otherlv_2=null;
        Token lv_constants_3_0=null;
        Token lv_semicolon_4_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:858:2: ( (otherlv_0= 'CONSTANTS' ( (lv_constants_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_constants_3_0= RULE_ID ) ) )* ( (lv_semicolon_4_0= ';' ) ) ) )
            // InternalNuSMV.g:859:2: (otherlv_0= 'CONSTANTS' ( (lv_constants_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_constants_3_0= RULE_ID ) ) )* ( (lv_semicolon_4_0= ';' ) ) )
            {
            // InternalNuSMV.g:859:2: (otherlv_0= 'CONSTANTS' ( (lv_constants_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_constants_3_0= RULE_ID ) ) )* ( (lv_semicolon_4_0= ';' ) ) )
            // InternalNuSMV.g:860:3: otherlv_0= 'CONSTANTS' ( (lv_constants_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_constants_3_0= RULE_ID ) ) )* ( (lv_semicolon_4_0= ';' ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConstantsDeclarationAccess().getCONSTANTSKeyword_0());
              		
            }
            // InternalNuSMV.g:864:3: ( (lv_constants_1_0= RULE_ID ) )
            // InternalNuSMV.g:865:4: (lv_constants_1_0= RULE_ID )
            {
            // InternalNuSMV.g:865:4: (lv_constants_1_0= RULE_ID )
            // InternalNuSMV.g:866:5: lv_constants_1_0= RULE_ID
            {
            lv_constants_1_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_constants_1_0, grammarAccess.getConstantsDeclarationAccess().getConstantsIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConstantsDeclarationRule());
              					}
              					addWithLastConsumed(
              						current,
              						"constants",
              						lv_constants_1_0,
              						"org.xtext.nusmv.language.NuSMV.ID");
              				
            }

            }


            }

            // InternalNuSMV.g:882:3: (otherlv_2= ',' ( (lv_constants_3_0= RULE_ID ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==11) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalNuSMV.g:883:4: otherlv_2= ',' ( (lv_constants_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getConstantsDeclarationAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalNuSMV.g:887:4: ( (lv_constants_3_0= RULE_ID ) )
            	    // InternalNuSMV.g:888:5: (lv_constants_3_0= RULE_ID )
            	    {
            	    // InternalNuSMV.g:888:5: (lv_constants_3_0= RULE_ID )
            	    // InternalNuSMV.g:889:6: lv_constants_3_0= RULE_ID
            	    {
            	    lv_constants_3_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_constants_3_0, grammarAccess.getConstantsDeclarationAccess().getConstantsIDTerminalRuleCall_2_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getConstantsDeclarationRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"constants",
            	      							lv_constants_3_0,
            	      							"org.xtext.nusmv.language.NuSMV.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalNuSMV.g:906:3: ( (lv_semicolon_4_0= ';' ) )
            // InternalNuSMV.g:907:4: (lv_semicolon_4_0= ';' )
            {
            // InternalNuSMV.g:907:4: (lv_semicolon_4_0= ';' )
            // InternalNuSMV.g:908:5: lv_semicolon_4_0= ';'
            {
            lv_semicolon_4_0=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_semicolon_4_0, grammarAccess.getConstantsDeclarationAccess().getSemicolonSemicolonKeyword_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConstantsDeclarationRule());
              					}
              					setWithLastConsumed(current, "semicolon", true, ";");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleConstantsDeclaration"


    // $ANTLR start "entryRuleAssignConstraint"
    // InternalNuSMV.g:927:1: entryRuleAssignConstraint returns [EObject current=null] : iv_ruleAssignConstraint= ruleAssignConstraint EOF ;
    public final EObject entryRuleAssignConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignConstraint = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:929:2: (iv_ruleAssignConstraint= ruleAssignConstraint EOF )
            // InternalNuSMV.g:930:2: iv_ruleAssignConstraint= ruleAssignConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignConstraint=ruleAssignConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleAssignConstraint"


    // $ANTLR start "ruleAssignConstraint"
    // InternalNuSMV.g:939:1: ruleAssignConstraint returns [EObject current=null] : ( ( (lv_assign_0_0= 'ASSIGN' ) ) ( (lv_bodies_1_0= ruleAssignBody ) )* ) ;
    public final EObject ruleAssignConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_assign_0_0=null;
        EObject lv_bodies_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:946:2: ( ( ( (lv_assign_0_0= 'ASSIGN' ) ) ( (lv_bodies_1_0= ruleAssignBody ) )* ) )
            // InternalNuSMV.g:947:2: ( ( (lv_assign_0_0= 'ASSIGN' ) ) ( (lv_bodies_1_0= ruleAssignBody ) )* )
            {
            // InternalNuSMV.g:947:2: ( ( (lv_assign_0_0= 'ASSIGN' ) ) ( (lv_bodies_1_0= ruleAssignBody ) )* )
            // InternalNuSMV.g:948:3: ( (lv_assign_0_0= 'ASSIGN' ) ) ( (lv_bodies_1_0= ruleAssignBody ) )*
            {
            // InternalNuSMV.g:948:3: ( (lv_assign_0_0= 'ASSIGN' ) )
            // InternalNuSMV.g:949:4: (lv_assign_0_0= 'ASSIGN' )
            {
            // InternalNuSMV.g:949:4: (lv_assign_0_0= 'ASSIGN' )
            // InternalNuSMV.g:950:5: lv_assign_0_0= 'ASSIGN'
            {
            lv_assign_0_0=(Token)match(input,21,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_assign_0_0, grammarAccess.getAssignConstraintAccess().getAssignASSIGNKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAssignConstraintRule());
              					}
              					setWithLastConsumed(current, "assign", lv_assign_0_0, "ASSIGN");
              				
            }

            }


            }

            // InternalNuSMV.g:962:3: ( (lv_bodies_1_0= ruleAssignBody ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||(LA11_0>=22 && LA11_0<=23)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalNuSMV.g:963:4: (lv_bodies_1_0= ruleAssignBody )
            	    {
            	    // InternalNuSMV.g:963:4: (lv_bodies_1_0= ruleAssignBody )
            	    // InternalNuSMV.g:964:5: lv_bodies_1_0= ruleAssignBody
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAssignConstraintAccess().getBodiesAssignBodyParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_bodies_1_0=ruleAssignBody();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getAssignConstraintRule());
            	      					}
            	      					add(
            	      						current,
            	      						"bodies",
            	      						lv_bodies_1_0,
            	      						"org.xtext.nusmv.language.NuSMV.AssignBody");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleAssignConstraint"


    // $ANTLR start "entryRuleAssignBody"
    // InternalNuSMV.g:988:1: entryRuleAssignBody returns [EObject current=null] : iv_ruleAssignBody= ruleAssignBody EOF ;
    public final EObject entryRuleAssignBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignBody = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:990:2: (iv_ruleAssignBody= ruleAssignBody EOF )
            // InternalNuSMV.g:991:2: iv_ruleAssignBody= ruleAssignBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignBodyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignBody=ruleAssignBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignBody; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleAssignBody"


    // $ANTLR start "ruleAssignBody"
    // InternalNuSMV.g:1000:1: ruleAssignBody returns [EObject current=null] : (this_VarBodyAssign_0= ruleVarBodyAssign | this_InitBody_1= ruleInitBody | this_NextBody_2= ruleNextBody ) ;
    public final EObject ruleAssignBody() throws RecognitionException {
        EObject current = null;

        EObject this_VarBodyAssign_0 = null;

        EObject this_InitBody_1 = null;

        EObject this_NextBody_2 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:1007:2: ( (this_VarBodyAssign_0= ruleVarBodyAssign | this_InitBody_1= ruleInitBody | this_NextBody_2= ruleNextBody ) )
            // InternalNuSMV.g:1008:2: (this_VarBodyAssign_0= ruleVarBodyAssign | this_InitBody_1= ruleInitBody | this_NextBody_2= ruleNextBody )
            {
            // InternalNuSMV.g:1008:2: (this_VarBodyAssign_0= ruleVarBodyAssign | this_InitBody_1= ruleInitBody | this_NextBody_2= ruleNextBody )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt12=1;
                }
                break;
            case 22:
                {
                alt12=2;
                }
                break;
            case 23:
                {
                alt12=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalNuSMV.g:1009:3: this_VarBodyAssign_0= ruleVarBodyAssign
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAssignBodyAccess().getVarBodyAssignParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VarBodyAssign_0=ruleVarBodyAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VarBodyAssign_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNuSMV.g:1021:3: this_InitBody_1= ruleInitBody
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAssignBodyAccess().getInitBodyParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_InitBody_1=ruleInitBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InitBody_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNuSMV.g:1033:3: this_NextBody_2= ruleNextBody
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAssignBodyAccess().getNextBodyParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NextBody_2=ruleNextBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NextBody_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleAssignBody"


    // $ANTLR start "entryRuleVarBodyAssign"
    // InternalNuSMV.g:1051:1: entryRuleVarBodyAssign returns [EObject current=null] : iv_ruleVarBodyAssign= ruleVarBodyAssign EOF ;
    public final EObject entryRuleVarBodyAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarBodyAssign = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:1053:2: (iv_ruleVarBodyAssign= ruleVarBodyAssign EOF )
            // InternalNuSMV.g:1054:2: iv_ruleVarBodyAssign= ruleVarBodyAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarBodyAssignRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarBodyAssign=ruleVarBodyAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarBodyAssign; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleVarBodyAssign"


    // $ANTLR start "ruleVarBodyAssign"
    // InternalNuSMV.g:1063:1: ruleVarBodyAssign returns [EObject current=null] : ( ( (lv_var_0_0= ruleVariableID ) ) otherlv_1= ':=' ( (lv_assignment_2_0= ruleSimpleExpression ) ) ( (lv_semicolon_3_0= ';' ) ) ) ;
    public final EObject ruleVarBodyAssign() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_semicolon_3_0=null;
        AntlrDatatypeRuleToken lv_var_0_0 = null;

        EObject lv_assignment_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:1070:2: ( ( ( (lv_var_0_0= ruleVariableID ) ) otherlv_1= ':=' ( (lv_assignment_2_0= ruleSimpleExpression ) ) ( (lv_semicolon_3_0= ';' ) ) ) )
            // InternalNuSMV.g:1071:2: ( ( (lv_var_0_0= ruleVariableID ) ) otherlv_1= ':=' ( (lv_assignment_2_0= ruleSimpleExpression ) ) ( (lv_semicolon_3_0= ';' ) ) )
            {
            // InternalNuSMV.g:1071:2: ( ( (lv_var_0_0= ruleVariableID ) ) otherlv_1= ':=' ( (lv_assignment_2_0= ruleSimpleExpression ) ) ( (lv_semicolon_3_0= ';' ) ) )
            // InternalNuSMV.g:1072:3: ( (lv_var_0_0= ruleVariableID ) ) otherlv_1= ':=' ( (lv_assignment_2_0= ruleSimpleExpression ) ) ( (lv_semicolon_3_0= ';' ) )
            {
            // InternalNuSMV.g:1072:3: ( (lv_var_0_0= ruleVariableID ) )
            // InternalNuSMV.g:1073:4: (lv_var_0_0= ruleVariableID )
            {
            // InternalNuSMV.g:1073:4: (lv_var_0_0= ruleVariableID )
            // InternalNuSMV.g:1074:5: lv_var_0_0= ruleVariableID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarBodyAssignAccess().getVarVariableIDParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_var_0_0=ruleVariableID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVarBodyAssignRule());
              					}
              					set(
              						current,
              						"var",
              						lv_var_0_0,
              						"org.xtext.nusmv.language.NuSMV.VariableID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVarBodyAssignAccess().getColonEqualsSignKeyword_1());
              		
            }
            // InternalNuSMV.g:1095:3: ( (lv_assignment_2_0= ruleSimpleExpression ) )
            // InternalNuSMV.g:1096:4: (lv_assignment_2_0= ruleSimpleExpression )
            {
            // InternalNuSMV.g:1096:4: (lv_assignment_2_0= ruleSimpleExpression )
            // InternalNuSMV.g:1097:5: lv_assignment_2_0= ruleSimpleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarBodyAssignAccess().getAssignmentSimpleExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_assignment_2_0=ruleSimpleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVarBodyAssignRule());
              					}
              					set(
              						current,
              						"assignment",
              						lv_assignment_2_0,
              						"org.xtext.nusmv.language.NuSMV.SimpleExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNuSMV.g:1114:3: ( (lv_semicolon_3_0= ';' ) )
            // InternalNuSMV.g:1115:4: (lv_semicolon_3_0= ';' )
            {
            // InternalNuSMV.g:1115:4: (lv_semicolon_3_0= ';' )
            // InternalNuSMV.g:1116:5: lv_semicolon_3_0= ';'
            {
            lv_semicolon_3_0=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_semicolon_3_0, grammarAccess.getVarBodyAssignAccess().getSemicolonSemicolonKeyword_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVarBodyAssignRule());
              					}
              					setWithLastConsumed(current, "semicolon", true, ";");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleVarBodyAssign"


    // $ANTLR start "entryRuleInitBody"
    // InternalNuSMV.g:1135:1: entryRuleInitBody returns [EObject current=null] : iv_ruleInitBody= ruleInitBody EOF ;
    public final EObject entryRuleInitBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitBody = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:1137:2: (iv_ruleInitBody= ruleInitBody EOF )
            // InternalNuSMV.g:1138:2: iv_ruleInitBody= ruleInitBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitBodyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInitBody=ruleInitBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInitBody; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleInitBody"


    // $ANTLR start "ruleInitBody"
    // InternalNuSMV.g:1147:1: ruleInitBody returns [EObject current=null] : (otherlv_0= 'init' otherlv_1= '(' ( (lv_var_2_0= ruleVariableID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_initial_5_0= ruleSimpleExpression ) ) ( (lv_semicolon_6_0= ';' ) ) ) ;
    public final EObject ruleInitBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_semicolon_6_0=null;
        AntlrDatatypeRuleToken lv_var_2_0 = null;

        EObject lv_initial_5_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:1154:2: ( (otherlv_0= 'init' otherlv_1= '(' ( (lv_var_2_0= ruleVariableID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_initial_5_0= ruleSimpleExpression ) ) ( (lv_semicolon_6_0= ';' ) ) ) )
            // InternalNuSMV.g:1155:2: (otherlv_0= 'init' otherlv_1= '(' ( (lv_var_2_0= ruleVariableID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_initial_5_0= ruleSimpleExpression ) ) ( (lv_semicolon_6_0= ';' ) ) )
            {
            // InternalNuSMV.g:1155:2: (otherlv_0= 'init' otherlv_1= '(' ( (lv_var_2_0= ruleVariableID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_initial_5_0= ruleSimpleExpression ) ) ( (lv_semicolon_6_0= ';' ) ) )
            // InternalNuSMV.g:1156:3: otherlv_0= 'init' otherlv_1= '(' ( (lv_var_2_0= ruleVariableID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_initial_5_0= ruleSimpleExpression ) ) ( (lv_semicolon_6_0= ';' ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInitBodyAccess().getInitKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,10,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInitBodyAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalNuSMV.g:1164:3: ( (lv_var_2_0= ruleVariableID ) )
            // InternalNuSMV.g:1165:4: (lv_var_2_0= ruleVariableID )
            {
            // InternalNuSMV.g:1165:4: (lv_var_2_0= ruleVariableID )
            // InternalNuSMV.g:1166:5: lv_var_2_0= ruleVariableID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInitBodyAccess().getVarVariableIDParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_var_2_0=ruleVariableID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInitBodyRule());
              					}
              					set(
              						current,
              						"var",
              						lv_var_2_0,
              						"org.xtext.nusmv.language.NuSMV.VariableID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getInitBodyAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getInitBodyAccess().getColonEqualsSignKeyword_4());
              		
            }
            // InternalNuSMV.g:1191:3: ( (lv_initial_5_0= ruleSimpleExpression ) )
            // InternalNuSMV.g:1192:4: (lv_initial_5_0= ruleSimpleExpression )
            {
            // InternalNuSMV.g:1192:4: (lv_initial_5_0= ruleSimpleExpression )
            // InternalNuSMV.g:1193:5: lv_initial_5_0= ruleSimpleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInitBodyAccess().getInitialSimpleExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_initial_5_0=ruleSimpleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInitBodyRule());
              					}
              					set(
              						current,
              						"initial",
              						lv_initial_5_0,
              						"org.xtext.nusmv.language.NuSMV.SimpleExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNuSMV.g:1210:3: ( (lv_semicolon_6_0= ';' ) )
            // InternalNuSMV.g:1211:4: (lv_semicolon_6_0= ';' )
            {
            // InternalNuSMV.g:1211:4: (lv_semicolon_6_0= ';' )
            // InternalNuSMV.g:1212:5: lv_semicolon_6_0= ';'
            {
            lv_semicolon_6_0=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_semicolon_6_0, grammarAccess.getInitBodyAccess().getSemicolonSemicolonKeyword_6_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInitBodyRule());
              					}
              					setWithLastConsumed(current, "semicolon", true, ";");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleInitBody"


    // $ANTLR start "entryRuleNextBody"
    // InternalNuSMV.g:1231:1: entryRuleNextBody returns [EObject current=null] : iv_ruleNextBody= ruleNextBody EOF ;
    public final EObject entryRuleNextBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNextBody = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:1233:2: (iv_ruleNextBody= ruleNextBody EOF )
            // InternalNuSMV.g:1234:2: iv_ruleNextBody= ruleNextBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNextBodyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNextBody=ruleNextBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNextBody; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNextBody"


    // $ANTLR start "ruleNextBody"
    // InternalNuSMV.g:1243:1: ruleNextBody returns [EObject current=null] : (otherlv_0= 'next' otherlv_1= '(' ( (lv_var_2_0= ruleVariableID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_next_5_0= ruleNextExpression ) ) ( (lv_semicolon_6_0= ';' ) ) ) ;
    public final EObject ruleNextBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_semicolon_6_0=null;
        AntlrDatatypeRuleToken lv_var_2_0 = null;

        EObject lv_next_5_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:1250:2: ( (otherlv_0= 'next' otherlv_1= '(' ( (lv_var_2_0= ruleVariableID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_next_5_0= ruleNextExpression ) ) ( (lv_semicolon_6_0= ';' ) ) ) )
            // InternalNuSMV.g:1251:2: (otherlv_0= 'next' otherlv_1= '(' ( (lv_var_2_0= ruleVariableID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_next_5_0= ruleNextExpression ) ) ( (lv_semicolon_6_0= ';' ) ) )
            {
            // InternalNuSMV.g:1251:2: (otherlv_0= 'next' otherlv_1= '(' ( (lv_var_2_0= ruleVariableID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_next_5_0= ruleNextExpression ) ) ( (lv_semicolon_6_0= ';' ) ) )
            // InternalNuSMV.g:1252:3: otherlv_0= 'next' otherlv_1= '(' ( (lv_var_2_0= ruleVariableID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_next_5_0= ruleNextExpression ) ) ( (lv_semicolon_6_0= ';' ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNextBodyAccess().getNextKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,10,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNextBodyAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalNuSMV.g:1260:3: ( (lv_var_2_0= ruleVariableID ) )
            // InternalNuSMV.g:1261:4: (lv_var_2_0= ruleVariableID )
            {
            // InternalNuSMV.g:1261:4: (lv_var_2_0= ruleVariableID )
            // InternalNuSMV.g:1262:5: lv_var_2_0= ruleVariableID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNextBodyAccess().getVarVariableIDParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_var_2_0=ruleVariableID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNextBodyRule());
              					}
              					set(
              						current,
              						"var",
              						lv_var_2_0,
              						"org.xtext.nusmv.language.NuSMV.VariableID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getNextBodyAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getNextBodyAccess().getColonEqualsSignKeyword_4());
              		
            }
            // InternalNuSMV.g:1287:3: ( (lv_next_5_0= ruleNextExpression ) )
            // InternalNuSMV.g:1288:4: (lv_next_5_0= ruleNextExpression )
            {
            // InternalNuSMV.g:1288:4: (lv_next_5_0= ruleNextExpression )
            // InternalNuSMV.g:1289:5: lv_next_5_0= ruleNextExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNextBodyAccess().getNextNextExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_next_5_0=ruleNextExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNextBodyRule());
              					}
              					set(
              						current,
              						"next",
              						lv_next_5_0,
              						"org.xtext.nusmv.language.NuSMV.NextExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNuSMV.g:1306:3: ( (lv_semicolon_6_0= ';' ) )
            // InternalNuSMV.g:1307:4: (lv_semicolon_6_0= ';' )
            {
            // InternalNuSMV.g:1307:4: (lv_semicolon_6_0= ';' )
            // InternalNuSMV.g:1308:5: lv_semicolon_6_0= ';'
            {
            lv_semicolon_6_0=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_semicolon_6_0, grammarAccess.getNextBodyAccess().getSemicolonSemicolonKeyword_6_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNextBodyRule());
              					}
              					setWithLastConsumed(current, "semicolon", true, ";");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNextBody"


    // $ANTLR start "entryRuleTransConstraint"
    // InternalNuSMV.g:1327:1: entryRuleTransConstraint returns [EObject current=null] : iv_ruleTransConstraint= ruleTransConstraint EOF ;
    public final EObject entryRuleTransConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransConstraint = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:1329:2: (iv_ruleTransConstraint= ruleTransConstraint EOF )
            // InternalNuSMV.g:1330:2: iv_ruleTransConstraint= ruleTransConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTransConstraint=ruleTransConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleTransConstraint"


    // $ANTLR start "ruleTransConstraint"
    // InternalNuSMV.g:1339:1: ruleTransConstraint returns [EObject current=null] : (otherlv_0= 'TRANS' ( (lv_transExpression_1_0= ruleSimpleExpression ) ) ( (lv_semicolon_2_0= ';' ) )? ) ;
    public final EObject ruleTransConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_semicolon_2_0=null;
        EObject lv_transExpression_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:1346:2: ( (otherlv_0= 'TRANS' ( (lv_transExpression_1_0= ruleSimpleExpression ) ) ( (lv_semicolon_2_0= ';' ) )? ) )
            // InternalNuSMV.g:1347:2: (otherlv_0= 'TRANS' ( (lv_transExpression_1_0= ruleSimpleExpression ) ) ( (lv_semicolon_2_0= ';' ) )? )
            {
            // InternalNuSMV.g:1347:2: (otherlv_0= 'TRANS' ( (lv_transExpression_1_0= ruleSimpleExpression ) ) ( (lv_semicolon_2_0= ';' ) )? )
            // InternalNuSMV.g:1348:3: otherlv_0= 'TRANS' ( (lv_transExpression_1_0= ruleSimpleExpression ) ) ( (lv_semicolon_2_0= ';' ) )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTransConstraintAccess().getTRANSKeyword_0());
              		
            }
            // InternalNuSMV.g:1352:3: ( (lv_transExpression_1_0= ruleSimpleExpression ) )
            // InternalNuSMV.g:1353:4: (lv_transExpression_1_0= ruleSimpleExpression )
            {
            // InternalNuSMV.g:1353:4: (lv_transExpression_1_0= ruleSimpleExpression )
            // InternalNuSMV.g:1354:5: lv_transExpression_1_0= ruleSimpleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTransConstraintAccess().getTransExpressionSimpleExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_transExpression_1_0=ruleSimpleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTransConstraintRule());
              					}
              					set(
              						current,
              						"transExpression",
              						lv_transExpression_1_0,
              						"org.xtext.nusmv.language.NuSMV.SimpleExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNuSMV.g:1371:3: ( (lv_semicolon_2_0= ';' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalNuSMV.g:1372:4: (lv_semicolon_2_0= ';' )
                    {
                    // InternalNuSMV.g:1372:4: (lv_semicolon_2_0= ';' )
                    // InternalNuSMV.g:1373:5: lv_semicolon_2_0= ';'
                    {
                    lv_semicolon_2_0=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_semicolon_2_0, grammarAccess.getTransConstraintAccess().getSemicolonSemicolonKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getTransConstraintRule());
                      					}
                      					setWithLastConsumed(current, "semicolon", true, ";");
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleTransConstraint"


    // $ANTLR start "entryRuleInitConstraint"
    // InternalNuSMV.g:1392:1: entryRuleInitConstraint returns [EObject current=null] : iv_ruleInitConstraint= ruleInitConstraint EOF ;
    public final EObject entryRuleInitConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitConstraint = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:1394:2: (iv_ruleInitConstraint= ruleInitConstraint EOF )
            // InternalNuSMV.g:1395:2: iv_ruleInitConstraint= ruleInitConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInitConstraint=ruleInitConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInitConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleInitConstraint"


    // $ANTLR start "ruleInitConstraint"
    // InternalNuSMV.g:1404:1: ruleInitConstraint returns [EObject current=null] : (otherlv_0= 'INIT' ( (lv_initExpression_1_0= ruleSimpleExpression ) ) ( (lv_semicolon_2_0= ';' ) )? ) ;
    public final EObject ruleInitConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_semicolon_2_0=null;
        EObject lv_initExpression_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:1411:2: ( (otherlv_0= 'INIT' ( (lv_initExpression_1_0= ruleSimpleExpression ) ) ( (lv_semicolon_2_0= ';' ) )? ) )
            // InternalNuSMV.g:1412:2: (otherlv_0= 'INIT' ( (lv_initExpression_1_0= ruleSimpleExpression ) ) ( (lv_semicolon_2_0= ';' ) )? )
            {
            // InternalNuSMV.g:1412:2: (otherlv_0= 'INIT' ( (lv_initExpression_1_0= ruleSimpleExpression ) ) ( (lv_semicolon_2_0= ';' ) )? )
            // InternalNuSMV.g:1413:3: otherlv_0= 'INIT' ( (lv_initExpression_1_0= ruleSimpleExpression ) ) ( (lv_semicolon_2_0= ';' ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInitConstraintAccess().getINITKeyword_0());
              		
            }
            // InternalNuSMV.g:1417:3: ( (lv_initExpression_1_0= ruleSimpleExpression ) )
            // InternalNuSMV.g:1418:4: (lv_initExpression_1_0= ruleSimpleExpression )
            {
            // InternalNuSMV.g:1418:4: (lv_initExpression_1_0= ruleSimpleExpression )
            // InternalNuSMV.g:1419:5: lv_initExpression_1_0= ruleSimpleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInitConstraintAccess().getInitExpressionSimpleExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_initExpression_1_0=ruleSimpleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInitConstraintRule());
              					}
              					set(
              						current,
              						"initExpression",
              						lv_initExpression_1_0,
              						"org.xtext.nusmv.language.NuSMV.SimpleExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNuSMV.g:1436:3: ( (lv_semicolon_2_0= ';' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalNuSMV.g:1437:4: (lv_semicolon_2_0= ';' )
                    {
                    // InternalNuSMV.g:1437:4: (lv_semicolon_2_0= ';' )
                    // InternalNuSMV.g:1438:5: lv_semicolon_2_0= ';'
                    {
                    lv_semicolon_2_0=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_semicolon_2_0, grammarAccess.getInitConstraintAccess().getSemicolonSemicolonKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getInitConstraintRule());
                      					}
                      					setWithLastConsumed(current, "semicolon", true, ";");
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleInitConstraint"


    // $ANTLR start "entryRuleInvarConstraint"
    // InternalNuSMV.g:1457:1: entryRuleInvarConstraint returns [EObject current=null] : iv_ruleInvarConstraint= ruleInvarConstraint EOF ;
    public final EObject entryRuleInvarConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvarConstraint = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:1459:2: (iv_ruleInvarConstraint= ruleInvarConstraint EOF )
            // InternalNuSMV.g:1460:2: iv_ruleInvarConstraint= ruleInvarConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvarConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInvarConstraint=ruleInvarConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvarConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleInvarConstraint"


    // $ANTLR start "ruleInvarConstraint"
    // InternalNuSMV.g:1469:1: ruleInvarConstraint returns [EObject current=null] : (otherlv_0= 'INVAR' ( (lv_invarExpression_1_0= ruleSimpleExpression ) ) ( (lv_semicolon_2_0= ';' ) )? ) ;
    public final EObject ruleInvarConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_semicolon_2_0=null;
        EObject lv_invarExpression_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:1476:2: ( (otherlv_0= 'INVAR' ( (lv_invarExpression_1_0= ruleSimpleExpression ) ) ( (lv_semicolon_2_0= ';' ) )? ) )
            // InternalNuSMV.g:1477:2: (otherlv_0= 'INVAR' ( (lv_invarExpression_1_0= ruleSimpleExpression ) ) ( (lv_semicolon_2_0= ';' ) )? )
            {
            // InternalNuSMV.g:1477:2: (otherlv_0= 'INVAR' ( (lv_invarExpression_1_0= ruleSimpleExpression ) ) ( (lv_semicolon_2_0= ';' ) )? )
            // InternalNuSMV.g:1478:3: otherlv_0= 'INVAR' ( (lv_invarExpression_1_0= ruleSimpleExpression ) ) ( (lv_semicolon_2_0= ';' ) )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInvarConstraintAccess().getINVARKeyword_0());
              		
            }
            // InternalNuSMV.g:1482:3: ( (lv_invarExpression_1_0= ruleSimpleExpression ) )
            // InternalNuSMV.g:1483:4: (lv_invarExpression_1_0= ruleSimpleExpression )
            {
            // InternalNuSMV.g:1483:4: (lv_invarExpression_1_0= ruleSimpleExpression )
            // InternalNuSMV.g:1484:5: lv_invarExpression_1_0= ruleSimpleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInvarConstraintAccess().getInvarExpressionSimpleExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_invarExpression_1_0=ruleSimpleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInvarConstraintRule());
              					}
              					set(
              						current,
              						"invarExpression",
              						lv_invarExpression_1_0,
              						"org.xtext.nusmv.language.NuSMV.SimpleExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNuSMV.g:1501:3: ( (lv_semicolon_2_0= ';' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==17) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalNuSMV.g:1502:4: (lv_semicolon_2_0= ';' )
                    {
                    // InternalNuSMV.g:1502:4: (lv_semicolon_2_0= ';' )
                    // InternalNuSMV.g:1503:5: lv_semicolon_2_0= ';'
                    {
                    lv_semicolon_2_0=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_semicolon_2_0, grammarAccess.getInvarConstraintAccess().getSemicolonSemicolonKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getInvarConstraintRule());
                      					}
                      					setWithLastConsumed(current, "semicolon", true, ";");
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleInvarConstraint"


    // $ANTLR start "entryRuleFairnessConstraint"
    // InternalNuSMV.g:1522:1: entryRuleFairnessConstraint returns [EObject current=null] : iv_ruleFairnessConstraint= ruleFairnessConstraint EOF ;
    public final EObject entryRuleFairnessConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFairnessConstraint = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:1524:2: (iv_ruleFairnessConstraint= ruleFairnessConstraint EOF )
            // InternalNuSMV.g:1525:2: iv_ruleFairnessConstraint= ruleFairnessConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFairnessConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFairnessConstraint=ruleFairnessConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFairnessConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleFairnessConstraint"


    // $ANTLR start "ruleFairnessConstraint"
    // InternalNuSMV.g:1534:1: ruleFairnessConstraint returns [EObject current=null] : (this_FairnessExpression_0= ruleFairnessExpression | this_JusticeExpression_1= ruleJusticeExpression | this_CompassionExpression_2= ruleCompassionExpression ) ;
    public final EObject ruleFairnessConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_FairnessExpression_0 = null;

        EObject this_JusticeExpression_1 = null;

        EObject this_CompassionExpression_2 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:1541:2: ( (this_FairnessExpression_0= ruleFairnessExpression | this_JusticeExpression_1= ruleJusticeExpression | this_CompassionExpression_2= ruleCompassionExpression ) )
            // InternalNuSMV.g:1542:2: (this_FairnessExpression_0= ruleFairnessExpression | this_JusticeExpression_1= ruleJusticeExpression | this_CompassionExpression_2= ruleCompassionExpression )
            {
            // InternalNuSMV.g:1542:2: (this_FairnessExpression_0= ruleFairnessExpression | this_JusticeExpression_1= ruleJusticeExpression | this_CompassionExpression_2= ruleCompassionExpression )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt16=1;
                }
                break;
            case 28:
                {
                alt16=2;
                }
                break;
            case 29:
                {
                alt16=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalNuSMV.g:1543:3: this_FairnessExpression_0= ruleFairnessExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFairnessConstraintAccess().getFairnessExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FairnessExpression_0=ruleFairnessExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FairnessExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNuSMV.g:1555:3: this_JusticeExpression_1= ruleJusticeExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFairnessConstraintAccess().getJusticeExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_JusticeExpression_1=ruleJusticeExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JusticeExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNuSMV.g:1567:3: this_CompassionExpression_2= ruleCompassionExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFairnessConstraintAccess().getCompassionExpressionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CompassionExpression_2=ruleCompassionExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CompassionExpression_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleFairnessConstraint"


    // $ANTLR start "entryRuleFairnessExpression"
    // InternalNuSMV.g:1585:1: entryRuleFairnessExpression returns [EObject current=null] : iv_ruleFairnessExpression= ruleFairnessExpression EOF ;
    public final EObject entryRuleFairnessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFairnessExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:1587:2: (iv_ruleFairnessExpression= ruleFairnessExpression EOF )
            // InternalNuSMV.g:1588:2: iv_ruleFairnessExpression= ruleFairnessExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFairnessExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFairnessExpression=ruleFairnessExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFairnessExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleFairnessExpression"


    // $ANTLR start "ruleFairnessExpression"
    // InternalNuSMV.g:1597:1: ruleFairnessExpression returns [EObject current=null] : (otherlv_0= 'FAIRNESS' ( (lv_fairnessExpr_1_0= ruleSimpleExpression ) ) ( (lv_semicolon_2_0= ';' ) )? ) ;
    public final EObject ruleFairnessExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_semicolon_2_0=null;
        EObject lv_fairnessExpr_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:1604:2: ( (otherlv_0= 'FAIRNESS' ( (lv_fairnessExpr_1_0= ruleSimpleExpression ) ) ( (lv_semicolon_2_0= ';' ) )? ) )
            // InternalNuSMV.g:1605:2: (otherlv_0= 'FAIRNESS' ( (lv_fairnessExpr_1_0= ruleSimpleExpression ) ) ( (lv_semicolon_2_0= ';' ) )? )
            {
            // InternalNuSMV.g:1605:2: (otherlv_0= 'FAIRNESS' ( (lv_fairnessExpr_1_0= ruleSimpleExpression ) ) ( (lv_semicolon_2_0= ';' ) )? )
            // InternalNuSMV.g:1606:3: otherlv_0= 'FAIRNESS' ( (lv_fairnessExpr_1_0= ruleSimpleExpression ) ) ( (lv_semicolon_2_0= ';' ) )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFairnessExpressionAccess().getFAIRNESSKeyword_0());
              		
            }
            // InternalNuSMV.g:1610:3: ( (lv_fairnessExpr_1_0= ruleSimpleExpression ) )
            // InternalNuSMV.g:1611:4: (lv_fairnessExpr_1_0= ruleSimpleExpression )
            {
            // InternalNuSMV.g:1611:4: (lv_fairnessExpr_1_0= ruleSimpleExpression )
            // InternalNuSMV.g:1612:5: lv_fairnessExpr_1_0= ruleSimpleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFairnessExpressionAccess().getFairnessExprSimpleExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_fairnessExpr_1_0=ruleSimpleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFairnessExpressionRule());
              					}
              					set(
              						current,
              						"fairnessExpr",
              						lv_fairnessExpr_1_0,
              						"org.xtext.nusmv.language.NuSMV.SimpleExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNuSMV.g:1629:3: ( (lv_semicolon_2_0= ';' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==17) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalNuSMV.g:1630:4: (lv_semicolon_2_0= ';' )
                    {
                    // InternalNuSMV.g:1630:4: (lv_semicolon_2_0= ';' )
                    // InternalNuSMV.g:1631:5: lv_semicolon_2_0= ';'
                    {
                    lv_semicolon_2_0=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_semicolon_2_0, grammarAccess.getFairnessExpressionAccess().getSemicolonSemicolonKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFairnessExpressionRule());
                      					}
                      					setWithLastConsumed(current, "semicolon", true, ";");
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleFairnessExpression"


    // $ANTLR start "entryRuleJusticeExpression"
    // InternalNuSMV.g:1650:1: entryRuleJusticeExpression returns [EObject current=null] : iv_ruleJusticeExpression= ruleJusticeExpression EOF ;
    public final EObject entryRuleJusticeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJusticeExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:1652:2: (iv_ruleJusticeExpression= ruleJusticeExpression EOF )
            // InternalNuSMV.g:1653:2: iv_ruleJusticeExpression= ruleJusticeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJusticeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJusticeExpression=ruleJusticeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJusticeExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleJusticeExpression"


    // $ANTLR start "ruleJusticeExpression"
    // InternalNuSMV.g:1662:1: ruleJusticeExpression returns [EObject current=null] : (otherlv_0= 'JUSTICE' ( (lv_justiceExpr_1_0= ruleSimpleExpression ) ) ( (lv_semicolon_2_0= ';' ) )? ) ;
    public final EObject ruleJusticeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_semicolon_2_0=null;
        EObject lv_justiceExpr_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:1669:2: ( (otherlv_0= 'JUSTICE' ( (lv_justiceExpr_1_0= ruleSimpleExpression ) ) ( (lv_semicolon_2_0= ';' ) )? ) )
            // InternalNuSMV.g:1670:2: (otherlv_0= 'JUSTICE' ( (lv_justiceExpr_1_0= ruleSimpleExpression ) ) ( (lv_semicolon_2_0= ';' ) )? )
            {
            // InternalNuSMV.g:1670:2: (otherlv_0= 'JUSTICE' ( (lv_justiceExpr_1_0= ruleSimpleExpression ) ) ( (lv_semicolon_2_0= ';' ) )? )
            // InternalNuSMV.g:1671:3: otherlv_0= 'JUSTICE' ( (lv_justiceExpr_1_0= ruleSimpleExpression ) ) ( (lv_semicolon_2_0= ';' ) )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJusticeExpressionAccess().getJUSTICEKeyword_0());
              		
            }
            // InternalNuSMV.g:1675:3: ( (lv_justiceExpr_1_0= ruleSimpleExpression ) )
            // InternalNuSMV.g:1676:4: (lv_justiceExpr_1_0= ruleSimpleExpression )
            {
            // InternalNuSMV.g:1676:4: (lv_justiceExpr_1_0= ruleSimpleExpression )
            // InternalNuSMV.g:1677:5: lv_justiceExpr_1_0= ruleSimpleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJusticeExpressionAccess().getJusticeExprSimpleExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_justiceExpr_1_0=ruleSimpleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJusticeExpressionRule());
              					}
              					set(
              						current,
              						"justiceExpr",
              						lv_justiceExpr_1_0,
              						"org.xtext.nusmv.language.NuSMV.SimpleExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNuSMV.g:1694:3: ( (lv_semicolon_2_0= ';' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalNuSMV.g:1695:4: (lv_semicolon_2_0= ';' )
                    {
                    // InternalNuSMV.g:1695:4: (lv_semicolon_2_0= ';' )
                    // InternalNuSMV.g:1696:5: lv_semicolon_2_0= ';'
                    {
                    lv_semicolon_2_0=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_semicolon_2_0, grammarAccess.getJusticeExpressionAccess().getSemicolonSemicolonKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getJusticeExpressionRule());
                      					}
                      					setWithLastConsumed(current, "semicolon", true, ";");
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleJusticeExpression"


    // $ANTLR start "entryRuleCompassionExpression"
    // InternalNuSMV.g:1715:1: entryRuleCompassionExpression returns [EObject current=null] : iv_ruleCompassionExpression= ruleCompassionExpression EOF ;
    public final EObject entryRuleCompassionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompassionExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:1717:2: (iv_ruleCompassionExpression= ruleCompassionExpression EOF )
            // InternalNuSMV.g:1718:2: iv_ruleCompassionExpression= ruleCompassionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompassionExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCompassionExpression=ruleCompassionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompassionExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCompassionExpression"


    // $ANTLR start "ruleCompassionExpression"
    // InternalNuSMV.g:1727:1: ruleCompassionExpression returns [EObject current=null] : (otherlv_0= 'COMPASSION (' ( (lv_firstExpr_1_0= ruleSimpleExpression ) ) otherlv_2= ',' ( (lv_secondExpr_3_0= ruleSimpleExpression ) ) otherlv_4= ')' ( (lv_semicolon_5_0= ';' ) )? ) ;
    public final EObject ruleCompassionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_semicolon_5_0=null;
        EObject lv_firstExpr_1_0 = null;

        EObject lv_secondExpr_3_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:1734:2: ( (otherlv_0= 'COMPASSION (' ( (lv_firstExpr_1_0= ruleSimpleExpression ) ) otherlv_2= ',' ( (lv_secondExpr_3_0= ruleSimpleExpression ) ) otherlv_4= ')' ( (lv_semicolon_5_0= ';' ) )? ) )
            // InternalNuSMV.g:1735:2: (otherlv_0= 'COMPASSION (' ( (lv_firstExpr_1_0= ruleSimpleExpression ) ) otherlv_2= ',' ( (lv_secondExpr_3_0= ruleSimpleExpression ) ) otherlv_4= ')' ( (lv_semicolon_5_0= ';' ) )? )
            {
            // InternalNuSMV.g:1735:2: (otherlv_0= 'COMPASSION (' ( (lv_firstExpr_1_0= ruleSimpleExpression ) ) otherlv_2= ',' ( (lv_secondExpr_3_0= ruleSimpleExpression ) ) otherlv_4= ')' ( (lv_semicolon_5_0= ';' ) )? )
            // InternalNuSMV.g:1736:3: otherlv_0= 'COMPASSION (' ( (lv_firstExpr_1_0= ruleSimpleExpression ) ) otherlv_2= ',' ( (lv_secondExpr_3_0= ruleSimpleExpression ) ) otherlv_4= ')' ( (lv_semicolon_5_0= ';' ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCompassionExpressionAccess().getCOMPASSIONKeyword_0());
              		
            }
            // InternalNuSMV.g:1740:3: ( (lv_firstExpr_1_0= ruleSimpleExpression ) )
            // InternalNuSMV.g:1741:4: (lv_firstExpr_1_0= ruleSimpleExpression )
            {
            // InternalNuSMV.g:1741:4: (lv_firstExpr_1_0= ruleSimpleExpression )
            // InternalNuSMV.g:1742:5: lv_firstExpr_1_0= ruleSimpleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCompassionExpressionAccess().getFirstExprSimpleExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_firstExpr_1_0=ruleSimpleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCompassionExpressionRule());
              					}
              					set(
              						current,
              						"firstExpr",
              						lv_firstExpr_1_0,
              						"org.xtext.nusmv.language.NuSMV.SimpleExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCompassionExpressionAccess().getCommaKeyword_2());
              		
            }
            // InternalNuSMV.g:1763:3: ( (lv_secondExpr_3_0= ruleSimpleExpression ) )
            // InternalNuSMV.g:1764:4: (lv_secondExpr_3_0= ruleSimpleExpression )
            {
            // InternalNuSMV.g:1764:4: (lv_secondExpr_3_0= ruleSimpleExpression )
            // InternalNuSMV.g:1765:5: lv_secondExpr_3_0= ruleSimpleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCompassionExpressionAccess().getSecondExprSimpleExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_secondExpr_3_0=ruleSimpleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCompassionExpressionRule());
              					}
              					set(
              						current,
              						"secondExpr",
              						lv_secondExpr_3_0,
              						"org.xtext.nusmv.language.NuSMV.SimpleExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getCompassionExpressionAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalNuSMV.g:1786:3: ( (lv_semicolon_5_0= ';' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalNuSMV.g:1787:4: (lv_semicolon_5_0= ';' )
                    {
                    // InternalNuSMV.g:1787:4: (lv_semicolon_5_0= ';' )
                    // InternalNuSMV.g:1788:5: lv_semicolon_5_0= ';'
                    {
                    lv_semicolon_5_0=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_semicolon_5_0, grammarAccess.getCompassionExpressionAccess().getSemicolonSemicolonKeyword_5_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getCompassionExpressionRule());
                      					}
                      					setWithLastConsumed(current, "semicolon", true, ";");
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCompassionExpression"


    // $ANTLR start "entryRuleCtlSpecification"
    // InternalNuSMV.g:1807:1: entryRuleCtlSpecification returns [EObject current=null] : iv_ruleCtlSpecification= ruleCtlSpecification EOF ;
    public final EObject entryRuleCtlSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCtlSpecification = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:1809:2: (iv_ruleCtlSpecification= ruleCtlSpecification EOF )
            // InternalNuSMV.g:1810:2: iv_ruleCtlSpecification= ruleCtlSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCtlSpecificationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCtlSpecification=ruleCtlSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCtlSpecification; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCtlSpecification"


    // $ANTLR start "ruleCtlSpecification"
    // InternalNuSMV.g:1819:1: ruleCtlSpecification returns [EObject current=null] : ( ( ( (lv_specKeyWord_0_1= 'CTLSPEC' | lv_specKeyWord_0_2= 'SPEC' ) ) ) ( ( (lv_nameKeyWord_1_0= 'NAME' ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' )? ( (lv_ctlExpression_4_0= ruleCTLExpression ) ) ( (lv_semicolon_5_0= ';' ) )? ) ;
    public final EObject ruleCtlSpecification() throws RecognitionException {
        EObject current = null;

        Token lv_specKeyWord_0_1=null;
        Token lv_specKeyWord_0_2=null;
        Token lv_nameKeyWord_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_semicolon_5_0=null;
        EObject lv_ctlExpression_4_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:1826:2: ( ( ( ( (lv_specKeyWord_0_1= 'CTLSPEC' | lv_specKeyWord_0_2= 'SPEC' ) ) ) ( ( (lv_nameKeyWord_1_0= 'NAME' ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' )? ( (lv_ctlExpression_4_0= ruleCTLExpression ) ) ( (lv_semicolon_5_0= ';' ) )? ) )
            // InternalNuSMV.g:1827:2: ( ( ( (lv_specKeyWord_0_1= 'CTLSPEC' | lv_specKeyWord_0_2= 'SPEC' ) ) ) ( ( (lv_nameKeyWord_1_0= 'NAME' ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' )? ( (lv_ctlExpression_4_0= ruleCTLExpression ) ) ( (lv_semicolon_5_0= ';' ) )? )
            {
            // InternalNuSMV.g:1827:2: ( ( ( (lv_specKeyWord_0_1= 'CTLSPEC' | lv_specKeyWord_0_2= 'SPEC' ) ) ) ( ( (lv_nameKeyWord_1_0= 'NAME' ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' )? ( (lv_ctlExpression_4_0= ruleCTLExpression ) ) ( (lv_semicolon_5_0= ';' ) )? )
            // InternalNuSMV.g:1828:3: ( ( (lv_specKeyWord_0_1= 'CTLSPEC' | lv_specKeyWord_0_2= 'SPEC' ) ) ) ( ( (lv_nameKeyWord_1_0= 'NAME' ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' )? ( (lv_ctlExpression_4_0= ruleCTLExpression ) ) ( (lv_semicolon_5_0= ';' ) )?
            {
            // InternalNuSMV.g:1828:3: ( ( (lv_specKeyWord_0_1= 'CTLSPEC' | lv_specKeyWord_0_2= 'SPEC' ) ) )
            // InternalNuSMV.g:1829:4: ( (lv_specKeyWord_0_1= 'CTLSPEC' | lv_specKeyWord_0_2= 'SPEC' ) )
            {
            // InternalNuSMV.g:1829:4: ( (lv_specKeyWord_0_1= 'CTLSPEC' | lv_specKeyWord_0_2= 'SPEC' ) )
            // InternalNuSMV.g:1830:5: (lv_specKeyWord_0_1= 'CTLSPEC' | lv_specKeyWord_0_2= 'SPEC' )
            {
            // InternalNuSMV.g:1830:5: (lv_specKeyWord_0_1= 'CTLSPEC' | lv_specKeyWord_0_2= 'SPEC' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            else if ( (LA20_0==31) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalNuSMV.g:1831:6: lv_specKeyWord_0_1= 'CTLSPEC'
                    {
                    lv_specKeyWord_0_1=(Token)match(input,30,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_specKeyWord_0_1, grammarAccess.getCtlSpecificationAccess().getSpecKeyWordCTLSPECKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCtlSpecificationRule());
                      						}
                      						setWithLastConsumed(current, "specKeyWord", lv_specKeyWord_0_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalNuSMV.g:1842:6: lv_specKeyWord_0_2= 'SPEC'
                    {
                    lv_specKeyWord_0_2=(Token)match(input,31,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_specKeyWord_0_2, grammarAccess.getCtlSpecificationAccess().getSpecKeyWordSPECKeyword_0_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCtlSpecificationRule());
                      						}
                      						setWithLastConsumed(current, "specKeyWord", lv_specKeyWord_0_2, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalNuSMV.g:1855:3: ( ( (lv_nameKeyWord_1_0= 'NAME' ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalNuSMV.g:1856:4: ( (lv_nameKeyWord_1_0= 'NAME' ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':='
                    {
                    // InternalNuSMV.g:1856:4: ( (lv_nameKeyWord_1_0= 'NAME' ) )
                    // InternalNuSMV.g:1857:5: (lv_nameKeyWord_1_0= 'NAME' )
                    {
                    // InternalNuSMV.g:1857:5: (lv_nameKeyWord_1_0= 'NAME' )
                    // InternalNuSMV.g:1858:6: lv_nameKeyWord_1_0= 'NAME'
                    {
                    lv_nameKeyWord_1_0=(Token)match(input,32,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_nameKeyWord_1_0, grammarAccess.getCtlSpecificationAccess().getNameKeyWordNAMEKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCtlSpecificationRule());
                      						}
                      						setWithLastConsumed(current, "nameKeyWord", true, "NAME");
                      					
                    }

                    }


                    }

                    // InternalNuSMV.g:1870:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalNuSMV.g:1871:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalNuSMV.g:1871:5: (lv_name_2_0= RULE_ID )
                    // InternalNuSMV.g:1872:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_2_0, grammarAccess.getCtlSpecificationAccess().getNameIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCtlSpecificationRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_2_0,
                      							"org.xtext.nusmv.language.NuSMV.ID");
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,19,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getCtlSpecificationAccess().getColonEqualsSignKeyword_1_2());
                      			
                    }

                    }
                    break;

            }

            // InternalNuSMV.g:1893:3: ( (lv_ctlExpression_4_0= ruleCTLExpression ) )
            // InternalNuSMV.g:1894:4: (lv_ctlExpression_4_0= ruleCTLExpression )
            {
            // InternalNuSMV.g:1894:4: (lv_ctlExpression_4_0= ruleCTLExpression )
            // InternalNuSMV.g:1895:5: lv_ctlExpression_4_0= ruleCTLExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCtlSpecificationAccess().getCtlExpressionCTLExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_ctlExpression_4_0=ruleCTLExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCtlSpecificationRule());
              					}
              					set(
              						current,
              						"ctlExpression",
              						lv_ctlExpression_4_0,
              						"org.xtext.nusmv.language.NuSMV.CTLExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNuSMV.g:1912:3: ( (lv_semicolon_5_0= ';' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==17) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalNuSMV.g:1913:4: (lv_semicolon_5_0= ';' )
                    {
                    // InternalNuSMV.g:1913:4: (lv_semicolon_5_0= ';' )
                    // InternalNuSMV.g:1914:5: lv_semicolon_5_0= ';'
                    {
                    lv_semicolon_5_0=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_semicolon_5_0, grammarAccess.getCtlSpecificationAccess().getSemicolonSemicolonKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getCtlSpecificationRule());
                      					}
                      					setWithLastConsumed(current, "semicolon", true, ";");
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCtlSpecification"


    // $ANTLR start "entryRulePslSpecification"
    // InternalNuSMV.g:1933:1: entryRulePslSpecification returns [EObject current=null] : iv_rulePslSpecification= rulePslSpecification EOF ;
    public final EObject entryRulePslSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePslSpecification = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:1935:2: (iv_rulePslSpecification= rulePslSpecification EOF )
            // InternalNuSMV.g:1936:2: iv_rulePslSpecification= rulePslSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPslSpecificationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePslSpecification=rulePslSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePslSpecification; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulePslSpecification"


    // $ANTLR start "rulePslSpecification"
    // InternalNuSMV.g:1945:1: rulePslSpecification returns [EObject current=null] : (otherlv_0= 'PSLSPEC' ( ( (lv_nameKeyWord_1_0= 'NAME' ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' )? ( (lv_pslExpression_4_0= rulePSLExpression ) ) ( (lv_semicolon_5_0= ';' ) )? ) ;
    public final EObject rulePslSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nameKeyWord_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_semicolon_5_0=null;
        EObject lv_pslExpression_4_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:1952:2: ( (otherlv_0= 'PSLSPEC' ( ( (lv_nameKeyWord_1_0= 'NAME' ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' )? ( (lv_pslExpression_4_0= rulePSLExpression ) ) ( (lv_semicolon_5_0= ';' ) )? ) )
            // InternalNuSMV.g:1953:2: (otherlv_0= 'PSLSPEC' ( ( (lv_nameKeyWord_1_0= 'NAME' ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' )? ( (lv_pslExpression_4_0= rulePSLExpression ) ) ( (lv_semicolon_5_0= ';' ) )? )
            {
            // InternalNuSMV.g:1953:2: (otherlv_0= 'PSLSPEC' ( ( (lv_nameKeyWord_1_0= 'NAME' ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' )? ( (lv_pslExpression_4_0= rulePSLExpression ) ) ( (lv_semicolon_5_0= ';' ) )? )
            // InternalNuSMV.g:1954:3: otherlv_0= 'PSLSPEC' ( ( (lv_nameKeyWord_1_0= 'NAME' ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' )? ( (lv_pslExpression_4_0= rulePSLExpression ) ) ( (lv_semicolon_5_0= ';' ) )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPslSpecificationAccess().getPSLSPECKeyword_0());
              		
            }
            // InternalNuSMV.g:1958:3: ( ( (lv_nameKeyWord_1_0= 'NAME' ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalNuSMV.g:1959:4: ( (lv_nameKeyWord_1_0= 'NAME' ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':='
                    {
                    // InternalNuSMV.g:1959:4: ( (lv_nameKeyWord_1_0= 'NAME' ) )
                    // InternalNuSMV.g:1960:5: (lv_nameKeyWord_1_0= 'NAME' )
                    {
                    // InternalNuSMV.g:1960:5: (lv_nameKeyWord_1_0= 'NAME' )
                    // InternalNuSMV.g:1961:6: lv_nameKeyWord_1_0= 'NAME'
                    {
                    lv_nameKeyWord_1_0=(Token)match(input,32,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_nameKeyWord_1_0, grammarAccess.getPslSpecificationAccess().getNameKeyWordNAMEKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPslSpecificationRule());
                      						}
                      						setWithLastConsumed(current, "nameKeyWord", true, "NAME");
                      					
                    }

                    }


                    }

                    // InternalNuSMV.g:1973:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalNuSMV.g:1974:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalNuSMV.g:1974:5: (lv_name_2_0= RULE_ID )
                    // InternalNuSMV.g:1975:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_2_0, grammarAccess.getPslSpecificationAccess().getNameIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPslSpecificationRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_2_0,
                      							"org.xtext.nusmv.language.NuSMV.ID");
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,19,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getPslSpecificationAccess().getColonEqualsSignKeyword_1_2());
                      			
                    }

                    }
                    break;

            }

            // InternalNuSMV.g:1996:3: ( (lv_pslExpression_4_0= rulePSLExpression ) )
            // InternalNuSMV.g:1997:4: (lv_pslExpression_4_0= rulePSLExpression )
            {
            // InternalNuSMV.g:1997:4: (lv_pslExpression_4_0= rulePSLExpression )
            // InternalNuSMV.g:1998:5: lv_pslExpression_4_0= rulePSLExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPslSpecificationAccess().getPslExpressionPSLExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_pslExpression_4_0=rulePSLExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPslSpecificationRule());
              					}
              					set(
              						current,
              						"pslExpression",
              						lv_pslExpression_4_0,
              						"org.xtext.nusmv.language.NuSMV.PSLExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNuSMV.g:2015:3: ( (lv_semicolon_5_0= ';' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==17) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalNuSMV.g:2016:4: (lv_semicolon_5_0= ';' )
                    {
                    // InternalNuSMV.g:2016:4: (lv_semicolon_5_0= ';' )
                    // InternalNuSMV.g:2017:5: lv_semicolon_5_0= ';'
                    {
                    lv_semicolon_5_0=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_semicolon_5_0, grammarAccess.getPslSpecificationAccess().getSemicolonSemicolonKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPslSpecificationRule());
                      					}
                      					setWithLastConsumed(current, "semicolon", true, ";");
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulePslSpecification"


    // $ANTLR start "entryRuleInvarSpecification"
    // InternalNuSMV.g:2036:1: entryRuleInvarSpecification returns [EObject current=null] : iv_ruleInvarSpecification= ruleInvarSpecification EOF ;
    public final EObject entryRuleInvarSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvarSpecification = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:2038:2: (iv_ruleInvarSpecification= ruleInvarSpecification EOF )
            // InternalNuSMV.g:2039:2: iv_ruleInvarSpecification= ruleInvarSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvarSpecificationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInvarSpecification=ruleInvarSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvarSpecification; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleInvarSpecification"


    // $ANTLR start "ruleInvarSpecification"
    // InternalNuSMV.g:2048:1: ruleInvarSpecification returns [EObject current=null] : ( (otherlv_0= 'INVARSPEC' ( (lv_invarSpec_1_0= ruleNextExpression ) ) otherlv_2= ';' ) | (otherlv_3= 'INVARSPEC' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':=' ( (lv_invarSpec_6_0= ruleNextExpression ) ) ( (lv_semicolon_7_0= ';' ) )? ) ) ;
    public final EObject ruleInvarSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_semicolon_7_0=null;
        EObject lv_invarSpec_1_0 = null;

        EObject lv_invarSpec_6_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:2055:2: ( ( (otherlv_0= 'INVARSPEC' ( (lv_invarSpec_1_0= ruleNextExpression ) ) otherlv_2= ';' ) | (otherlv_3= 'INVARSPEC' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':=' ( (lv_invarSpec_6_0= ruleNextExpression ) ) ( (lv_semicolon_7_0= ';' ) )? ) ) )
            // InternalNuSMV.g:2056:2: ( (otherlv_0= 'INVARSPEC' ( (lv_invarSpec_1_0= ruleNextExpression ) ) otherlv_2= ';' ) | (otherlv_3= 'INVARSPEC' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':=' ( (lv_invarSpec_6_0= ruleNextExpression ) ) ( (lv_semicolon_7_0= ';' ) )? ) )
            {
            // InternalNuSMV.g:2056:2: ( (otherlv_0= 'INVARSPEC' ( (lv_invarSpec_1_0= ruleNextExpression ) ) otherlv_2= ';' ) | (otherlv_3= 'INVARSPEC' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':=' ( (lv_invarSpec_6_0= ruleNextExpression ) ) ( (lv_semicolon_7_0= ';' ) )? ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==34) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==RULE_ID) ) {
                    int LA26_2 = input.LA(3);

                    if ( (LA26_2==19) ) {
                        alt26=2;
                    }
                    else if ( (LA26_2==17||LA26_2==39||(LA26_2>=51 && LA26_2<=60)||LA26_2==75||(LA26_2>=91 && LA26_2<=106)) ) {
                        alt26=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 2, input);

                        throw nvae;
                    }
                }
                else if ( ((LA26_1>=RULE_WORD && LA26_1<=RULE_INT)||LA26_1==10||LA26_1==23||LA26_1==43||(LA26_1>=49 && LA26_1<=50)||(LA26_1>=55 && LA26_1<=56)||(LA26_1>=61 && LA26_1<=74)||(LA26_1>=76 && LA26_1<=82)) ) {
                    alt26=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalNuSMV.g:2057:3: (otherlv_0= 'INVARSPEC' ( (lv_invarSpec_1_0= ruleNextExpression ) ) otherlv_2= ';' )
                    {
                    // InternalNuSMV.g:2057:3: (otherlv_0= 'INVARSPEC' ( (lv_invarSpec_1_0= ruleNextExpression ) ) otherlv_2= ';' )
                    // InternalNuSMV.g:2058:4: otherlv_0= 'INVARSPEC' ( (lv_invarSpec_1_0= ruleNextExpression ) ) otherlv_2= ';'
                    {
                    otherlv_0=(Token)match(input,34,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getInvarSpecificationAccess().getINVARSPECKeyword_0_0());
                      			
                    }
                    // InternalNuSMV.g:2062:4: ( (lv_invarSpec_1_0= ruleNextExpression ) )
                    // InternalNuSMV.g:2063:5: (lv_invarSpec_1_0= ruleNextExpression )
                    {
                    // InternalNuSMV.g:2063:5: (lv_invarSpec_1_0= ruleNextExpression )
                    // InternalNuSMV.g:2064:6: lv_invarSpec_1_0= ruleNextExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInvarSpecificationAccess().getInvarSpecNextExpressionParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_invarSpec_1_0=ruleNextExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInvarSpecificationRule());
                      						}
                      						set(
                      							current,
                      							"invarSpec",
                      							lv_invarSpec_1_0,
                      							"org.xtext.nusmv.language.NuSMV.NextExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getInvarSpecificationAccess().getSemicolonKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalNuSMV.g:2087:3: (otherlv_3= 'INVARSPEC' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':=' ( (lv_invarSpec_6_0= ruleNextExpression ) ) ( (lv_semicolon_7_0= ';' ) )? )
                    {
                    // InternalNuSMV.g:2087:3: (otherlv_3= 'INVARSPEC' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':=' ( (lv_invarSpec_6_0= ruleNextExpression ) ) ( (lv_semicolon_7_0= ';' ) )? )
                    // InternalNuSMV.g:2088:4: otherlv_3= 'INVARSPEC' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':=' ( (lv_invarSpec_6_0= ruleNextExpression ) ) ( (lv_semicolon_7_0= ';' ) )?
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getInvarSpecificationAccess().getINVARSPECKeyword_1_0());
                      			
                    }
                    // InternalNuSMV.g:2092:4: ( (lv_name_4_0= RULE_ID ) )
                    // InternalNuSMV.g:2093:5: (lv_name_4_0= RULE_ID )
                    {
                    // InternalNuSMV.g:2093:5: (lv_name_4_0= RULE_ID )
                    // InternalNuSMV.g:2094:6: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_4_0, grammarAccess.getInvarSpecificationAccess().getNameIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getInvarSpecificationRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_4_0,
                      							"org.xtext.nusmv.language.NuSMV.ID");
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getInvarSpecificationAccess().getColonEqualsSignKeyword_1_2());
                      			
                    }
                    // InternalNuSMV.g:2114:4: ( (lv_invarSpec_6_0= ruleNextExpression ) )
                    // InternalNuSMV.g:2115:5: (lv_invarSpec_6_0= ruleNextExpression )
                    {
                    // InternalNuSMV.g:2115:5: (lv_invarSpec_6_0= ruleNextExpression )
                    // InternalNuSMV.g:2116:6: lv_invarSpec_6_0= ruleNextExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInvarSpecificationAccess().getInvarSpecNextExpressionParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    lv_invarSpec_6_0=ruleNextExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInvarSpecificationRule());
                      						}
                      						set(
                      							current,
                      							"invarSpec",
                      							lv_invarSpec_6_0,
                      							"org.xtext.nusmv.language.NuSMV.NextExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNuSMV.g:2133:4: ( (lv_semicolon_7_0= ';' ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==17) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalNuSMV.g:2134:5: (lv_semicolon_7_0= ';' )
                            {
                            // InternalNuSMV.g:2134:5: (lv_semicolon_7_0= ';' )
                            // InternalNuSMV.g:2135:6: lv_semicolon_7_0= ';'
                            {
                            lv_semicolon_7_0=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_semicolon_7_0, grammarAccess.getInvarSpecificationAccess().getSemicolonSemicolonKeyword_1_4_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getInvarSpecificationRule());
                              						}
                              						setWithLastConsumed(current, "semicolon", true, ";");
                              					
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleInvarSpecification"


    // $ANTLR start "entryRuleIsaDeclaration"
    // InternalNuSMV.g:2155:1: entryRuleIsaDeclaration returns [EObject current=null] : iv_ruleIsaDeclaration= ruleIsaDeclaration EOF ;
    public final EObject entryRuleIsaDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsaDeclaration = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:2157:2: (iv_ruleIsaDeclaration= ruleIsaDeclaration EOF )
            // InternalNuSMV.g:2158:2: iv_ruleIsaDeclaration= ruleIsaDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIsaDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIsaDeclaration=ruleIsaDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIsaDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleIsaDeclaration"


    // $ANTLR start "ruleIsaDeclaration"
    // InternalNuSMV.g:2167:1: ruleIsaDeclaration returns [EObject current=null] : (otherlv_0= 'ISA' ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleIsaDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:2174:2: ( (otherlv_0= 'ISA' ( (lv_id_1_0= RULE_ID ) ) ) )
            // InternalNuSMV.g:2175:2: (otherlv_0= 'ISA' ( (lv_id_1_0= RULE_ID ) ) )
            {
            // InternalNuSMV.g:2175:2: (otherlv_0= 'ISA' ( (lv_id_1_0= RULE_ID ) ) )
            // InternalNuSMV.g:2176:3: otherlv_0= 'ISA' ( (lv_id_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIsaDeclarationAccess().getISAKeyword_0());
              		
            }
            // InternalNuSMV.g:2180:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalNuSMV.g:2181:4: (lv_id_1_0= RULE_ID )
            {
            // InternalNuSMV.g:2181:4: (lv_id_1_0= RULE_ID )
            // InternalNuSMV.g:2182:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_id_1_0, grammarAccess.getIsaDeclarationAccess().getIdIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIsaDeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"id",
              						lv_id_1_0,
              						"org.xtext.nusmv.language.NuSMV.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleIsaDeclaration"


    // $ANTLR start "entryRuleLtlSpecification"
    // InternalNuSMV.g:2205:1: entryRuleLtlSpecification returns [EObject current=null] : iv_ruleLtlSpecification= ruleLtlSpecification EOF ;
    public final EObject entryRuleLtlSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLtlSpecification = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:2207:2: (iv_ruleLtlSpecification= ruleLtlSpecification EOF )
            // InternalNuSMV.g:2208:2: iv_ruleLtlSpecification= ruleLtlSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLtlSpecificationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLtlSpecification=ruleLtlSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLtlSpecification; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleLtlSpecification"


    // $ANTLR start "ruleLtlSpecification"
    // InternalNuSMV.g:2217:1: ruleLtlSpecification returns [EObject current=null] : (otherlv_0= 'LTLSPEC' ( ( (lv_nameId_1_0= 'NAME' ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' )? ( (lv_ltlExpression_4_0= ruleLTLExpression ) ) ( (lv_semicolon_5_0= ';' ) )? ) ;
    public final EObject ruleLtlSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nameId_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_semicolon_5_0=null;
        EObject lv_ltlExpression_4_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:2224:2: ( (otherlv_0= 'LTLSPEC' ( ( (lv_nameId_1_0= 'NAME' ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' )? ( (lv_ltlExpression_4_0= ruleLTLExpression ) ) ( (lv_semicolon_5_0= ';' ) )? ) )
            // InternalNuSMV.g:2225:2: (otherlv_0= 'LTLSPEC' ( ( (lv_nameId_1_0= 'NAME' ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' )? ( (lv_ltlExpression_4_0= ruleLTLExpression ) ) ( (lv_semicolon_5_0= ';' ) )? )
            {
            // InternalNuSMV.g:2225:2: (otherlv_0= 'LTLSPEC' ( ( (lv_nameId_1_0= 'NAME' ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' )? ( (lv_ltlExpression_4_0= ruleLTLExpression ) ) ( (lv_semicolon_5_0= ';' ) )? )
            // InternalNuSMV.g:2226:3: otherlv_0= 'LTLSPEC' ( ( (lv_nameId_1_0= 'NAME' ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' )? ( (lv_ltlExpression_4_0= ruleLTLExpression ) ) ( (lv_semicolon_5_0= ';' ) )?
            {
            otherlv_0=(Token)match(input,36,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLtlSpecificationAccess().getLTLSPECKeyword_0());
              		
            }
            // InternalNuSMV.g:2230:3: ( ( (lv_nameId_1_0= 'NAME' ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalNuSMV.g:2231:4: ( (lv_nameId_1_0= 'NAME' ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':='
                    {
                    // InternalNuSMV.g:2231:4: ( (lv_nameId_1_0= 'NAME' ) )
                    // InternalNuSMV.g:2232:5: (lv_nameId_1_0= 'NAME' )
                    {
                    // InternalNuSMV.g:2232:5: (lv_nameId_1_0= 'NAME' )
                    // InternalNuSMV.g:2233:6: lv_nameId_1_0= 'NAME'
                    {
                    lv_nameId_1_0=(Token)match(input,32,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_nameId_1_0, grammarAccess.getLtlSpecificationAccess().getNameIdNAMEKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getLtlSpecificationRule());
                      						}
                      						setWithLastConsumed(current, "nameId", true, "NAME");
                      					
                    }

                    }


                    }

                    // InternalNuSMV.g:2245:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalNuSMV.g:2246:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalNuSMV.g:2246:5: (lv_name_2_0= RULE_ID )
                    // InternalNuSMV.g:2247:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_2_0, grammarAccess.getLtlSpecificationAccess().getNameIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getLtlSpecificationRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_2_0,
                      							"org.xtext.nusmv.language.NuSMV.ID");
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,19,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getLtlSpecificationAccess().getColonEqualsSignKeyword_1_2());
                      			
                    }

                    }
                    break;

            }

            // InternalNuSMV.g:2268:3: ( (lv_ltlExpression_4_0= ruleLTLExpression ) )
            // InternalNuSMV.g:2269:4: (lv_ltlExpression_4_0= ruleLTLExpression )
            {
            // InternalNuSMV.g:2269:4: (lv_ltlExpression_4_0= ruleLTLExpression )
            // InternalNuSMV.g:2270:5: lv_ltlExpression_4_0= ruleLTLExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLtlSpecificationAccess().getLtlExpressionLTLExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_ltlExpression_4_0=ruleLTLExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLtlSpecificationRule());
              					}
              					set(
              						current,
              						"ltlExpression",
              						lv_ltlExpression_4_0,
              						"org.xtext.nusmv.language.NuSMV.LTLExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNuSMV.g:2287:3: ( (lv_semicolon_5_0= ';' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==17) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalNuSMV.g:2288:4: (lv_semicolon_5_0= ';' )
                    {
                    // InternalNuSMV.g:2288:4: (lv_semicolon_5_0= ';' )
                    // InternalNuSMV.g:2289:5: lv_semicolon_5_0= ';'
                    {
                    lv_semicolon_5_0=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_semicolon_5_0, grammarAccess.getLtlSpecificationAccess().getSemicolonSemicolonKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getLtlSpecificationRule());
                      					}
                      					setWithLastConsumed(current, "semicolon", true, ";");
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleLtlSpecification"


    // $ANTLR start "entryRuleType"
    // InternalNuSMV.g:2308:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:2310:2: (iv_ruleType= ruleType EOF )
            // InternalNuSMV.g:2311:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalNuSMV.g:2320:1: ruleType returns [EObject current=null] : (this_SimpleType_0= ruleSimpleType | this_ModuleType_1= ruleModuleType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleType_0 = null;

        EObject this_ModuleType_1 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:2327:2: ( (this_SimpleType_0= ruleSimpleType | this_ModuleType_1= ruleModuleType ) )
            // InternalNuSMV.g:2328:2: (this_SimpleType_0= ruleSimpleType | this_ModuleType_1= ruleModuleType )
            {
            // InternalNuSMV.g:2328:2: (this_SimpleType_0= ruleSimpleType | this_ModuleType_1= ruleModuleType )
            int alt29=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 37:
            case 38:
            case 41:
            case 42:
            case 43:
            case 46:
            case 55:
                {
                alt29=1;
                }
                break;
            case RULE_ID:
                {
                int LA29_2 = input.LA(2);

                if ( (LA29_2==39||LA29_2==45||LA29_2==75) ) {
                    alt29=1;
                }
                else if ( (LA29_2==EOF||LA29_2==10||LA29_2==17) ) {
                    alt29=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 2, input);

                    throw nvae;
                }
                }
                break;
            case 48:
                {
                alt29=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalNuSMV.g:2329:3: this_SimpleType_0= ruleSimpleType
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SimpleType_0=ruleSimpleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SimpleType_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNuSMV.g:2341:3: this_ModuleType_1= ruleModuleType
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getModuleTypeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ModuleType_1=ruleModuleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ModuleType_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleSimpleType"
    // InternalNuSMV.g:2359:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:2361:2: (iv_ruleSimpleType= ruleSimpleType EOF )
            // InternalNuSMV.g:2362:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleType=ruleSimpleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleType"


    // $ANTLR start "ruleSimpleType"
    // InternalNuSMV.g:2371:1: ruleSimpleType returns [EObject current=null] : ( ( () otherlv_1= 'boolean' ) | ( () (otherlv_3= 'word' otherlv_4= '[' ( (lv_wordNumber_5_0= ruleNUMBER ) ) otherlv_6= ']' ) ) | ( () (otherlv_8= 'unsigned' otherlv_9= 'word' otherlv_10= '[' ( (lv_uWordNumber_11_0= ruleNUMBER ) ) otherlv_12= ']' ) ) | ( () (otherlv_14= 'signed word' otherlv_15= '[' ( (lv_signedNumber_16_0= ruleNUMBER ) ) otherlv_17= ']' ) ) | ( () otherlv_19= '{' ( (lv_val_20_0= ruleVal ) ) (otherlv_21= ',' ( (lv_val_22_0= ruleVal ) ) )* otherlv_23= '}' ) | ( () ( ( ( (lv_low_25_1= ruleNUMBER | lv_low_25_2= ruleVariableID ) ) ) otherlv_26= '..' ( ( (lv_high_27_1= ruleNUMBER | lv_high_27_2= ruleVariableID ) ) ) ) ) | ( () otherlv_29= 'array' ( ( (lv_lowerBound_30_1= ruleNUMBER | lv_lowerBound_30_2= ruleVariableID ) ) ) otherlv_31= '..' ( ( (lv_upperBound_32_1= ruleNUMBER | lv_upperBound_32_2= ruleVariableID ) ) ) otherlv_33= 'of' ( (lv_type_34_0= ruleSimpleType ) ) ) ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_26=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        AntlrDatatypeRuleToken lv_wordNumber_5_0 = null;

        AntlrDatatypeRuleToken lv_uWordNumber_11_0 = null;

        AntlrDatatypeRuleToken lv_signedNumber_16_0 = null;

        EObject lv_val_20_0 = null;

        EObject lv_val_22_0 = null;

        AntlrDatatypeRuleToken lv_low_25_1 = null;

        AntlrDatatypeRuleToken lv_low_25_2 = null;

        AntlrDatatypeRuleToken lv_high_27_1 = null;

        AntlrDatatypeRuleToken lv_high_27_2 = null;

        AntlrDatatypeRuleToken lv_lowerBound_30_1 = null;

        AntlrDatatypeRuleToken lv_lowerBound_30_2 = null;

        AntlrDatatypeRuleToken lv_upperBound_32_1 = null;

        AntlrDatatypeRuleToken lv_upperBound_32_2 = null;

        EObject lv_type_34_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:2378:2: ( ( ( () otherlv_1= 'boolean' ) | ( () (otherlv_3= 'word' otherlv_4= '[' ( (lv_wordNumber_5_0= ruleNUMBER ) ) otherlv_6= ']' ) ) | ( () (otherlv_8= 'unsigned' otherlv_9= 'word' otherlv_10= '[' ( (lv_uWordNumber_11_0= ruleNUMBER ) ) otherlv_12= ']' ) ) | ( () (otherlv_14= 'signed word' otherlv_15= '[' ( (lv_signedNumber_16_0= ruleNUMBER ) ) otherlv_17= ']' ) ) | ( () otherlv_19= '{' ( (lv_val_20_0= ruleVal ) ) (otherlv_21= ',' ( (lv_val_22_0= ruleVal ) ) )* otherlv_23= '}' ) | ( () ( ( ( (lv_low_25_1= ruleNUMBER | lv_low_25_2= ruleVariableID ) ) ) otherlv_26= '..' ( ( (lv_high_27_1= ruleNUMBER | lv_high_27_2= ruleVariableID ) ) ) ) ) | ( () otherlv_29= 'array' ( ( (lv_lowerBound_30_1= ruleNUMBER | lv_lowerBound_30_2= ruleVariableID ) ) ) otherlv_31= '..' ( ( (lv_upperBound_32_1= ruleNUMBER | lv_upperBound_32_2= ruleVariableID ) ) ) otherlv_33= 'of' ( (lv_type_34_0= ruleSimpleType ) ) ) ) )
            // InternalNuSMV.g:2379:2: ( ( () otherlv_1= 'boolean' ) | ( () (otherlv_3= 'word' otherlv_4= '[' ( (lv_wordNumber_5_0= ruleNUMBER ) ) otherlv_6= ']' ) ) | ( () (otherlv_8= 'unsigned' otherlv_9= 'word' otherlv_10= '[' ( (lv_uWordNumber_11_0= ruleNUMBER ) ) otherlv_12= ']' ) ) | ( () (otherlv_14= 'signed word' otherlv_15= '[' ( (lv_signedNumber_16_0= ruleNUMBER ) ) otherlv_17= ']' ) ) | ( () otherlv_19= '{' ( (lv_val_20_0= ruleVal ) ) (otherlv_21= ',' ( (lv_val_22_0= ruleVal ) ) )* otherlv_23= '}' ) | ( () ( ( ( (lv_low_25_1= ruleNUMBER | lv_low_25_2= ruleVariableID ) ) ) otherlv_26= '..' ( ( (lv_high_27_1= ruleNUMBER | lv_high_27_2= ruleVariableID ) ) ) ) ) | ( () otherlv_29= 'array' ( ( (lv_lowerBound_30_1= ruleNUMBER | lv_lowerBound_30_2= ruleVariableID ) ) ) otherlv_31= '..' ( ( (lv_upperBound_32_1= ruleNUMBER | lv_upperBound_32_2= ruleVariableID ) ) ) otherlv_33= 'of' ( (lv_type_34_0= ruleSimpleType ) ) ) )
            {
            // InternalNuSMV.g:2379:2: ( ( () otherlv_1= 'boolean' ) | ( () (otherlv_3= 'word' otherlv_4= '[' ( (lv_wordNumber_5_0= ruleNUMBER ) ) otherlv_6= ']' ) ) | ( () (otherlv_8= 'unsigned' otherlv_9= 'word' otherlv_10= '[' ( (lv_uWordNumber_11_0= ruleNUMBER ) ) otherlv_12= ']' ) ) | ( () (otherlv_14= 'signed word' otherlv_15= '[' ( (lv_signedNumber_16_0= ruleNUMBER ) ) otherlv_17= ']' ) ) | ( () otherlv_19= '{' ( (lv_val_20_0= ruleVal ) ) (otherlv_21= ',' ( (lv_val_22_0= ruleVal ) ) )* otherlv_23= '}' ) | ( () ( ( ( (lv_low_25_1= ruleNUMBER | lv_low_25_2= ruleVariableID ) ) ) otherlv_26= '..' ( ( (lv_high_27_1= ruleNUMBER | lv_high_27_2= ruleVariableID ) ) ) ) ) | ( () otherlv_29= 'array' ( ( (lv_lowerBound_30_1= ruleNUMBER | lv_lowerBound_30_2= ruleVariableID ) ) ) otherlv_31= '..' ( ( (lv_upperBound_32_1= ruleNUMBER | lv_upperBound_32_2= ruleVariableID ) ) ) otherlv_33= 'of' ( (lv_type_34_0= ruleSimpleType ) ) ) )
            int alt35=7;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt35=1;
                }
                break;
            case 38:
                {
                alt35=2;
                }
                break;
            case 41:
                {
                alt35=3;
                }
                break;
            case 42:
                {
                alt35=4;
                }
                break;
            case 43:
                {
                alt35=5;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case 55:
                {
                alt35=6;
                }
                break;
            case 46:
                {
                alt35=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalNuSMV.g:2380:3: ( () otherlv_1= 'boolean' )
                    {
                    // InternalNuSMV.g:2380:3: ( () otherlv_1= 'boolean' )
                    // InternalNuSMV.g:2381:4: () otherlv_1= 'boolean'
                    {
                    // InternalNuSMV.g:2381:4: ()
                    // InternalNuSMV.g:2382:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSimpleTypeAccess().getBooleanTypeAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSimpleTypeAccess().getBooleanKeyword_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalNuSMV.g:2397:3: ( () (otherlv_3= 'word' otherlv_4= '[' ( (lv_wordNumber_5_0= ruleNUMBER ) ) otherlv_6= ']' ) )
                    {
                    // InternalNuSMV.g:2397:3: ( () (otherlv_3= 'word' otherlv_4= '[' ( (lv_wordNumber_5_0= ruleNUMBER ) ) otherlv_6= ']' ) )
                    // InternalNuSMV.g:2398:4: () (otherlv_3= 'word' otherlv_4= '[' ( (lv_wordNumber_5_0= ruleNUMBER ) ) otherlv_6= ']' )
                    {
                    // InternalNuSMV.g:2398:4: ()
                    // InternalNuSMV.g:2399:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSimpleTypeAccess().getWordTypeAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNuSMV.g:2408:4: (otherlv_3= 'word' otherlv_4= '[' ( (lv_wordNumber_5_0= ruleNUMBER ) ) otherlv_6= ']' )
                    // InternalNuSMV.g:2409:5: otherlv_3= 'word' otherlv_4= '[' ( (lv_wordNumber_5_0= ruleNUMBER ) ) otherlv_6= ']'
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getSimpleTypeAccess().getWordKeyword_1_1_0());
                      				
                    }
                    otherlv_4=(Token)match(input,39,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getSimpleTypeAccess().getLeftSquareBracketKeyword_1_1_1());
                      				
                    }
                    // InternalNuSMV.g:2417:5: ( (lv_wordNumber_5_0= ruleNUMBER ) )
                    // InternalNuSMV.g:2418:6: (lv_wordNumber_5_0= ruleNUMBER )
                    {
                    // InternalNuSMV.g:2418:6: (lv_wordNumber_5_0= ruleNUMBER )
                    // InternalNuSMV.g:2419:7: lv_wordNumber_5_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSimpleTypeAccess().getWordNumberNUMBERParserRuleCall_1_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_24);
                    lv_wordNumber_5_0=ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
                      							}
                      							set(
                      								current,
                      								"wordNumber",
                      								lv_wordNumber_5_0,
                      								"org.xtext.nusmv.language.NuSMV.NUMBER");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getSimpleTypeAccess().getRightSquareBracketKeyword_1_1_3());
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalNuSMV.g:2443:3: ( () (otherlv_8= 'unsigned' otherlv_9= 'word' otherlv_10= '[' ( (lv_uWordNumber_11_0= ruleNUMBER ) ) otherlv_12= ']' ) )
                    {
                    // InternalNuSMV.g:2443:3: ( () (otherlv_8= 'unsigned' otherlv_9= 'word' otherlv_10= '[' ( (lv_uWordNumber_11_0= ruleNUMBER ) ) otherlv_12= ']' ) )
                    // InternalNuSMV.g:2444:4: () (otherlv_8= 'unsigned' otherlv_9= 'word' otherlv_10= '[' ( (lv_uWordNumber_11_0= ruleNUMBER ) ) otherlv_12= ']' )
                    {
                    // InternalNuSMV.g:2444:4: ()
                    // InternalNuSMV.g:2445:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSimpleTypeAccess().getUnsignedWordTypeAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNuSMV.g:2454:4: (otherlv_8= 'unsigned' otherlv_9= 'word' otherlv_10= '[' ( (lv_uWordNumber_11_0= ruleNUMBER ) ) otherlv_12= ']' )
                    // InternalNuSMV.g:2455:5: otherlv_8= 'unsigned' otherlv_9= 'word' otherlv_10= '[' ( (lv_uWordNumber_11_0= ruleNUMBER ) ) otherlv_12= ']'
                    {
                    otherlv_8=(Token)match(input,41,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getSimpleTypeAccess().getUnsignedKeyword_2_1_0());
                      				
                    }
                    otherlv_9=(Token)match(input,38,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getSimpleTypeAccess().getWordKeyword_2_1_1());
                      				
                    }
                    otherlv_10=(Token)match(input,39,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_10, grammarAccess.getSimpleTypeAccess().getLeftSquareBracketKeyword_2_1_2());
                      				
                    }
                    // InternalNuSMV.g:2467:5: ( (lv_uWordNumber_11_0= ruleNUMBER ) )
                    // InternalNuSMV.g:2468:6: (lv_uWordNumber_11_0= ruleNUMBER )
                    {
                    // InternalNuSMV.g:2468:6: (lv_uWordNumber_11_0= ruleNUMBER )
                    // InternalNuSMV.g:2469:7: lv_uWordNumber_11_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSimpleTypeAccess().getUWordNumberNUMBERParserRuleCall_2_1_3_0());
                      						
                    }
                    pushFollow(FOLLOW_24);
                    lv_uWordNumber_11_0=ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
                      							}
                      							set(
                      								current,
                      								"uWordNumber",
                      								lv_uWordNumber_11_0,
                      								"org.xtext.nusmv.language.NuSMV.NUMBER");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_12, grammarAccess.getSimpleTypeAccess().getRightSquareBracketKeyword_2_1_4());
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalNuSMV.g:2493:3: ( () (otherlv_14= 'signed word' otherlv_15= '[' ( (lv_signedNumber_16_0= ruleNUMBER ) ) otherlv_17= ']' ) )
                    {
                    // InternalNuSMV.g:2493:3: ( () (otherlv_14= 'signed word' otherlv_15= '[' ( (lv_signedNumber_16_0= ruleNUMBER ) ) otherlv_17= ']' ) )
                    // InternalNuSMV.g:2494:4: () (otherlv_14= 'signed word' otherlv_15= '[' ( (lv_signedNumber_16_0= ruleNUMBER ) ) otherlv_17= ']' )
                    {
                    // InternalNuSMV.g:2494:4: ()
                    // InternalNuSMV.g:2495:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSimpleTypeAccess().getSignedWordTypeAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNuSMV.g:2504:4: (otherlv_14= 'signed word' otherlv_15= '[' ( (lv_signedNumber_16_0= ruleNUMBER ) ) otherlv_17= ']' )
                    // InternalNuSMV.g:2505:5: otherlv_14= 'signed word' otherlv_15= '[' ( (lv_signedNumber_16_0= ruleNUMBER ) ) otherlv_17= ']'
                    {
                    otherlv_14=(Token)match(input,42,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_14, grammarAccess.getSimpleTypeAccess().getSignedWordKeyword_3_1_0());
                      				
                    }
                    otherlv_15=(Token)match(input,39,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_15, grammarAccess.getSimpleTypeAccess().getLeftSquareBracketKeyword_3_1_1());
                      				
                    }
                    // InternalNuSMV.g:2513:5: ( (lv_signedNumber_16_0= ruleNUMBER ) )
                    // InternalNuSMV.g:2514:6: (lv_signedNumber_16_0= ruleNUMBER )
                    {
                    // InternalNuSMV.g:2514:6: (lv_signedNumber_16_0= ruleNUMBER )
                    // InternalNuSMV.g:2515:7: lv_signedNumber_16_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSimpleTypeAccess().getSignedNumberNUMBERParserRuleCall_3_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_24);
                    lv_signedNumber_16_0=ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
                      							}
                      							set(
                      								current,
                      								"signedNumber",
                      								lv_signedNumber_16_0,
                      								"org.xtext.nusmv.language.NuSMV.NUMBER");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_17, grammarAccess.getSimpleTypeAccess().getRightSquareBracketKeyword_3_1_3());
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalNuSMV.g:2539:3: ( () otherlv_19= '{' ( (lv_val_20_0= ruleVal ) ) (otherlv_21= ',' ( (lv_val_22_0= ruleVal ) ) )* otherlv_23= '}' )
                    {
                    // InternalNuSMV.g:2539:3: ( () otherlv_19= '{' ( (lv_val_20_0= ruleVal ) ) (otherlv_21= ',' ( (lv_val_22_0= ruleVal ) ) )* otherlv_23= '}' )
                    // InternalNuSMV.g:2540:4: () otherlv_19= '{' ( (lv_val_20_0= ruleVal ) ) (otherlv_21= ',' ( (lv_val_22_0= ruleVal ) ) )* otherlv_23= '}'
                    {
                    // InternalNuSMV.g:2540:4: ()
                    // InternalNuSMV.g:2541:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSimpleTypeAccess().getEnumTypeAction_4_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_19=(Token)match(input,43,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getSimpleTypeAccess().getLeftCurlyBracketKeyword_4_1());
                      			
                    }
                    // InternalNuSMV.g:2554:4: ( (lv_val_20_0= ruleVal ) )
                    // InternalNuSMV.g:2555:5: (lv_val_20_0= ruleVal )
                    {
                    // InternalNuSMV.g:2555:5: (lv_val_20_0= ruleVal )
                    // InternalNuSMV.g:2556:6: lv_val_20_0= ruleVal
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSimpleTypeAccess().getValValParserRuleCall_4_2_0());
                      					
                    }
                    pushFollow(FOLLOW_27);
                    lv_val_20_0=ruleVal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
                      						}
                      						add(
                      							current,
                      							"val",
                      							lv_val_20_0,
                      							"org.xtext.nusmv.language.NuSMV.Val");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNuSMV.g:2573:4: (otherlv_21= ',' ( (lv_val_22_0= ruleVal ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==11) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalNuSMV.g:2574:5: otherlv_21= ',' ( (lv_val_22_0= ruleVal ) )
                    	    {
                    	    otherlv_21=(Token)match(input,11,FOLLOW_26); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_21, grammarAccess.getSimpleTypeAccess().getCommaKeyword_4_3_0());
                    	      				
                    	    }
                    	    // InternalNuSMV.g:2578:5: ( (lv_val_22_0= ruleVal ) )
                    	    // InternalNuSMV.g:2579:6: (lv_val_22_0= ruleVal )
                    	    {
                    	    // InternalNuSMV.g:2579:6: (lv_val_22_0= ruleVal )
                    	    // InternalNuSMV.g:2580:7: lv_val_22_0= ruleVal
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSimpleTypeAccess().getValValParserRuleCall_4_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_27);
                    	    lv_val_22_0=ruleVal();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"val",
                    	      								lv_val_22_0,
                    	      								"org.xtext.nusmv.language.NuSMV.Val");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getSimpleTypeAccess().getRightCurlyBracketKeyword_4_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalNuSMV.g:2604:3: ( () ( ( ( (lv_low_25_1= ruleNUMBER | lv_low_25_2= ruleVariableID ) ) ) otherlv_26= '..' ( ( (lv_high_27_1= ruleNUMBER | lv_high_27_2= ruleVariableID ) ) ) ) )
                    {
                    // InternalNuSMV.g:2604:3: ( () ( ( ( (lv_low_25_1= ruleNUMBER | lv_low_25_2= ruleVariableID ) ) ) otherlv_26= '..' ( ( (lv_high_27_1= ruleNUMBER | lv_high_27_2= ruleVariableID ) ) ) ) )
                    // InternalNuSMV.g:2605:4: () ( ( ( (lv_low_25_1= ruleNUMBER | lv_low_25_2= ruleVariableID ) ) ) otherlv_26= '..' ( ( (lv_high_27_1= ruleNUMBER | lv_high_27_2= ruleVariableID ) ) ) )
                    {
                    // InternalNuSMV.g:2605:4: ()
                    // InternalNuSMV.g:2606:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSimpleTypeAccess().getIntervalTypeAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNuSMV.g:2615:4: ( ( ( (lv_low_25_1= ruleNUMBER | lv_low_25_2= ruleVariableID ) ) ) otherlv_26= '..' ( ( (lv_high_27_1= ruleNUMBER | lv_high_27_2= ruleVariableID ) ) ) )
                    // InternalNuSMV.g:2616:5: ( ( (lv_low_25_1= ruleNUMBER | lv_low_25_2= ruleVariableID ) ) ) otherlv_26= '..' ( ( (lv_high_27_1= ruleNUMBER | lv_high_27_2= ruleVariableID ) ) )
                    {
                    // InternalNuSMV.g:2616:5: ( ( (lv_low_25_1= ruleNUMBER | lv_low_25_2= ruleVariableID ) ) )
                    // InternalNuSMV.g:2617:6: ( (lv_low_25_1= ruleNUMBER | lv_low_25_2= ruleVariableID ) )
                    {
                    // InternalNuSMV.g:2617:6: ( (lv_low_25_1= ruleNUMBER | lv_low_25_2= ruleVariableID ) )
                    // InternalNuSMV.g:2618:7: (lv_low_25_1= ruleNUMBER | lv_low_25_2= ruleVariableID )
                    {
                    // InternalNuSMV.g:2618:7: (lv_low_25_1= ruleNUMBER | lv_low_25_2= ruleVariableID )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_INT||LA31_0==55) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==RULE_ID) ) {
                        alt31=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalNuSMV.g:2619:8: lv_low_25_1= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSimpleTypeAccess().getLowNUMBERParserRuleCall_5_1_0_0_0());
                              							
                            }
                            pushFollow(FOLLOW_28);
                            lv_low_25_1=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
                              								}
                              								set(
                              									current,
                              									"low",
                              									lv_low_25_1,
                              									"org.xtext.nusmv.language.NuSMV.NUMBER");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }
                            break;
                        case 2 :
                            // InternalNuSMV.g:2635:8: lv_low_25_2= ruleVariableID
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSimpleTypeAccess().getLowVariableIDParserRuleCall_5_1_0_0_1());
                              							
                            }
                            pushFollow(FOLLOW_28);
                            lv_low_25_2=ruleVariableID();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
                              								}
                              								set(
                              									current,
                              									"low",
                              									lv_low_25_2,
                              									"org.xtext.nusmv.language.NuSMV.VariableID");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_26=(Token)match(input,45,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_26, grammarAccess.getSimpleTypeAccess().getFullStopFullStopKeyword_5_1_1());
                      				
                    }
                    // InternalNuSMV.g:2657:5: ( ( (lv_high_27_1= ruleNUMBER | lv_high_27_2= ruleVariableID ) ) )
                    // InternalNuSMV.g:2658:6: ( (lv_high_27_1= ruleNUMBER | lv_high_27_2= ruleVariableID ) )
                    {
                    // InternalNuSMV.g:2658:6: ( (lv_high_27_1= ruleNUMBER | lv_high_27_2= ruleVariableID ) )
                    // InternalNuSMV.g:2659:7: (lv_high_27_1= ruleNUMBER | lv_high_27_2= ruleVariableID )
                    {
                    // InternalNuSMV.g:2659:7: (lv_high_27_1= ruleNUMBER | lv_high_27_2= ruleVariableID )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_INT||LA32_0==55) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==RULE_ID) ) {
                        alt32=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalNuSMV.g:2660:8: lv_high_27_1= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSimpleTypeAccess().getHighNUMBERParserRuleCall_5_1_2_0_0());
                              							
                            }
                            pushFollow(FOLLOW_2);
                            lv_high_27_1=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
                              								}
                              								set(
                              									current,
                              									"high",
                              									lv_high_27_1,
                              									"org.xtext.nusmv.language.NuSMV.NUMBER");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }
                            break;
                        case 2 :
                            // InternalNuSMV.g:2676:8: lv_high_27_2= ruleVariableID
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSimpleTypeAccess().getHighVariableIDParserRuleCall_5_1_2_0_1());
                              							
                            }
                            pushFollow(FOLLOW_2);
                            lv_high_27_2=ruleVariableID();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
                              								}
                              								set(
                              									current,
                              									"high",
                              									lv_high_27_2,
                              									"org.xtext.nusmv.language.NuSMV.VariableID");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalNuSMV.g:2697:3: ( () otherlv_29= 'array' ( ( (lv_lowerBound_30_1= ruleNUMBER | lv_lowerBound_30_2= ruleVariableID ) ) ) otherlv_31= '..' ( ( (lv_upperBound_32_1= ruleNUMBER | lv_upperBound_32_2= ruleVariableID ) ) ) otherlv_33= 'of' ( (lv_type_34_0= ruleSimpleType ) ) )
                    {
                    // InternalNuSMV.g:2697:3: ( () otherlv_29= 'array' ( ( (lv_lowerBound_30_1= ruleNUMBER | lv_lowerBound_30_2= ruleVariableID ) ) ) otherlv_31= '..' ( ( (lv_upperBound_32_1= ruleNUMBER | lv_upperBound_32_2= ruleVariableID ) ) ) otherlv_33= 'of' ( (lv_type_34_0= ruleSimpleType ) ) )
                    // InternalNuSMV.g:2698:4: () otherlv_29= 'array' ( ( (lv_lowerBound_30_1= ruleNUMBER | lv_lowerBound_30_2= ruleVariableID ) ) ) otherlv_31= '..' ( ( (lv_upperBound_32_1= ruleNUMBER | lv_upperBound_32_2= ruleVariableID ) ) ) otherlv_33= 'of' ( (lv_type_34_0= ruleSimpleType ) )
                    {
                    // InternalNuSMV.g:2698:4: ()
                    // InternalNuSMV.g:2699:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSimpleTypeAccess().getArrayTypeAction_6_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_29=(Token)match(input,46,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_29, grammarAccess.getSimpleTypeAccess().getArrayKeyword_6_1());
                      			
                    }
                    // InternalNuSMV.g:2712:4: ( ( (lv_lowerBound_30_1= ruleNUMBER | lv_lowerBound_30_2= ruleVariableID ) ) )
                    // InternalNuSMV.g:2713:5: ( (lv_lowerBound_30_1= ruleNUMBER | lv_lowerBound_30_2= ruleVariableID ) )
                    {
                    // InternalNuSMV.g:2713:5: ( (lv_lowerBound_30_1= ruleNUMBER | lv_lowerBound_30_2= ruleVariableID ) )
                    // InternalNuSMV.g:2714:6: (lv_lowerBound_30_1= ruleNUMBER | lv_lowerBound_30_2= ruleVariableID )
                    {
                    // InternalNuSMV.g:2714:6: (lv_lowerBound_30_1= ruleNUMBER | lv_lowerBound_30_2= ruleVariableID )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_INT||LA33_0==55) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==RULE_ID) ) {
                        alt33=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalNuSMV.g:2715:7: lv_lowerBound_30_1= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSimpleTypeAccess().getLowerBoundNUMBERParserRuleCall_6_2_0_0());
                              						
                            }
                            pushFollow(FOLLOW_28);
                            lv_lowerBound_30_1=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
                              							}
                              							set(
                              								current,
                              								"lowerBound",
                              								lv_lowerBound_30_1,
                              								"org.xtext.nusmv.language.NuSMV.NUMBER");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalNuSMV.g:2731:7: lv_lowerBound_30_2= ruleVariableID
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSimpleTypeAccess().getLowerBoundVariableIDParserRuleCall_6_2_0_1());
                              						
                            }
                            pushFollow(FOLLOW_28);
                            lv_lowerBound_30_2=ruleVariableID();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
                              							}
                              							set(
                              								current,
                              								"lowerBound",
                              								lv_lowerBound_30_2,
                              								"org.xtext.nusmv.language.NuSMV.VariableID");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_31=(Token)match(input,45,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_31, grammarAccess.getSimpleTypeAccess().getFullStopFullStopKeyword_6_3());
                      			
                    }
                    // InternalNuSMV.g:2753:4: ( ( (lv_upperBound_32_1= ruleNUMBER | lv_upperBound_32_2= ruleVariableID ) ) )
                    // InternalNuSMV.g:2754:5: ( (lv_upperBound_32_1= ruleNUMBER | lv_upperBound_32_2= ruleVariableID ) )
                    {
                    // InternalNuSMV.g:2754:5: ( (lv_upperBound_32_1= ruleNUMBER | lv_upperBound_32_2= ruleVariableID ) )
                    // InternalNuSMV.g:2755:6: (lv_upperBound_32_1= ruleNUMBER | lv_upperBound_32_2= ruleVariableID )
                    {
                    // InternalNuSMV.g:2755:6: (lv_upperBound_32_1= ruleNUMBER | lv_upperBound_32_2= ruleVariableID )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_INT||LA34_0==55) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==RULE_ID) ) {
                        alt34=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalNuSMV.g:2756:7: lv_upperBound_32_1= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSimpleTypeAccess().getUpperBoundNUMBERParserRuleCall_6_4_0_0());
                              						
                            }
                            pushFollow(FOLLOW_29);
                            lv_upperBound_32_1=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
                              							}
                              							set(
                              								current,
                              								"upperBound",
                              								lv_upperBound_32_1,
                              								"org.xtext.nusmv.language.NuSMV.NUMBER");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalNuSMV.g:2772:7: lv_upperBound_32_2= ruleVariableID
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSimpleTypeAccess().getUpperBoundVariableIDParserRuleCall_6_4_0_1());
                              						
                            }
                            pushFollow(FOLLOW_29);
                            lv_upperBound_32_2=ruleVariableID();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
                              							}
                              							set(
                              								current,
                              								"upperBound",
                              								lv_upperBound_32_2,
                              								"org.xtext.nusmv.language.NuSMV.VariableID");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_33=(Token)match(input,47,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_33, grammarAccess.getSimpleTypeAccess().getOfKeyword_6_5());
                      			
                    }
                    // InternalNuSMV.g:2794:4: ( (lv_type_34_0= ruleSimpleType ) )
                    // InternalNuSMV.g:2795:5: (lv_type_34_0= ruleSimpleType )
                    {
                    // InternalNuSMV.g:2795:5: (lv_type_34_0= ruleSimpleType )
                    // InternalNuSMV.g:2796:6: lv_type_34_0= ruleSimpleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSimpleTypeAccess().getTypeSimpleTypeParserRuleCall_6_6_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_type_34_0=ruleSimpleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_34_0,
                      							"org.xtext.nusmv.language.NuSMV.SimpleType");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "entryRuleModuleType"
    // InternalNuSMV.g:2821:1: entryRuleModuleType returns [EObject current=null] : iv_ruleModuleType= ruleModuleType EOF ;
    public final EObject entryRuleModuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleType = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:2823:2: (iv_ruleModuleType= ruleModuleType EOF )
            // InternalNuSMV.g:2824:2: iv_ruleModuleType= ruleModuleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModuleTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModuleType=ruleModuleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModuleType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleModuleType"


    // $ANTLR start "ruleModuleType"
    // InternalNuSMV.g:2833:1: ruleModuleType returns [EObject current=null] : ( ( () (otherlv_1= 'process' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleSimpleExpression ) ) | ( (otherlv_5= RULE_ID ) ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleSimpleExpression ) ) )* otherlv_8= ')' )? ) ) | ( () ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= '(' ( ( (lv_params_12_0= ruleSimpleExpression ) ) | ( (otherlv_13= RULE_ID ) ) ) (otherlv_14= ',' ( (lv_params_15_0= ruleSimpleExpression ) ) )* otherlv_16= ')' )? ) ) ) ;
    public final EObject ruleModuleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_params_4_0 = null;

        EObject lv_params_7_0 = null;

        EObject lv_params_12_0 = null;

        EObject lv_params_15_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:2840:2: ( ( ( () (otherlv_1= 'process' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleSimpleExpression ) ) | ( (otherlv_5= RULE_ID ) ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleSimpleExpression ) ) )* otherlv_8= ')' )? ) ) | ( () ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= '(' ( ( (lv_params_12_0= ruleSimpleExpression ) ) | ( (otherlv_13= RULE_ID ) ) ) (otherlv_14= ',' ( (lv_params_15_0= ruleSimpleExpression ) ) )* otherlv_16= ')' )? ) ) ) )
            // InternalNuSMV.g:2841:2: ( ( () (otherlv_1= 'process' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleSimpleExpression ) ) | ( (otherlv_5= RULE_ID ) ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleSimpleExpression ) ) )* otherlv_8= ')' )? ) ) | ( () ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= '(' ( ( (lv_params_12_0= ruleSimpleExpression ) ) | ( (otherlv_13= RULE_ID ) ) ) (otherlv_14= ',' ( (lv_params_15_0= ruleSimpleExpression ) ) )* otherlv_16= ')' )? ) ) )
            {
            // InternalNuSMV.g:2841:2: ( ( () (otherlv_1= 'process' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleSimpleExpression ) ) | ( (otherlv_5= RULE_ID ) ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleSimpleExpression ) ) )* otherlv_8= ')' )? ) ) | ( () ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= '(' ( ( (lv_params_12_0= ruleSimpleExpression ) ) | ( (otherlv_13= RULE_ID ) ) ) (otherlv_14= ',' ( (lv_params_15_0= ruleSimpleExpression ) ) )* otherlv_16= ')' )? ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==48) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_ID) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalNuSMV.g:2842:3: ( () (otherlv_1= 'process' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleSimpleExpression ) ) | ( (otherlv_5= RULE_ID ) ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleSimpleExpression ) ) )* otherlv_8= ')' )? ) )
                    {
                    // InternalNuSMV.g:2842:3: ( () (otherlv_1= 'process' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleSimpleExpression ) ) | ( (otherlv_5= RULE_ID ) ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleSimpleExpression ) ) )* otherlv_8= ')' )? ) )
                    // InternalNuSMV.g:2843:4: () (otherlv_1= 'process' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleSimpleExpression ) ) | ( (otherlv_5= RULE_ID ) ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleSimpleExpression ) ) )* otherlv_8= ')' )? )
                    {
                    // InternalNuSMV.g:2843:4: ()
                    // InternalNuSMV.g:2844:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getModuleTypeAccess().getAsyncrProcessTypeAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNuSMV.g:2853:4: (otherlv_1= 'process' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleSimpleExpression ) ) | ( (otherlv_5= RULE_ID ) ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleSimpleExpression ) ) )* otherlv_8= ')' )? )
                    // InternalNuSMV.g:2854:5: otherlv_1= 'process' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleSimpleExpression ) ) | ( (otherlv_5= RULE_ID ) ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleSimpleExpression ) ) )* otherlv_8= ')' )?
                    {
                    otherlv_1=(Token)match(input,48,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getModuleTypeAccess().getProcessKeyword_0_1_0());
                      				
                    }
                    // InternalNuSMV.g:2858:5: ( (otherlv_2= RULE_ID ) )
                    // InternalNuSMV.g:2859:6: (otherlv_2= RULE_ID )
                    {
                    // InternalNuSMV.g:2859:6: (otherlv_2= RULE_ID )
                    // InternalNuSMV.g:2860:7: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      							/* */
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getModuleTypeRule());
                      							}
                      						
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_2, grammarAccess.getModuleTypeAccess().getModuleModuleCrossReference_0_1_1_0());
                      						
                    }

                    }


                    }

                    // InternalNuSMV.g:2874:5: (otherlv_3= '(' ( ( (lv_params_4_0= ruleSimpleExpression ) ) | ( (otherlv_5= RULE_ID ) ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleSimpleExpression ) ) )* otherlv_8= ')' )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==10) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalNuSMV.g:2875:6: otherlv_3= '(' ( ( (lv_params_4_0= ruleSimpleExpression ) ) | ( (otherlv_5= RULE_ID ) ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleSimpleExpression ) ) )* otherlv_8= ')'
                            {
                            otherlv_3=(Token)match(input,10,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_3, grammarAccess.getModuleTypeAccess().getLeftParenthesisKeyword_0_1_2_0());
                              					
                            }
                            // InternalNuSMV.g:2879:6: ( ( (lv_params_4_0= ruleSimpleExpression ) ) | ( (otherlv_5= RULE_ID ) ) )
                            int alt36=2;
                            int LA36_0 = input.LA(1);

                            if ( ((LA36_0>=RULE_WORD && LA36_0<=RULE_INT)||LA36_0==10||LA36_0==23||LA36_0==43||(LA36_0>=49 && LA36_0<=50)||(LA36_0>=55 && LA36_0<=56)||(LA36_0>=61 && LA36_0<=74)||(LA36_0>=76 && LA36_0<=82)) ) {
                                alt36=1;
                            }
                            else if ( (LA36_0==RULE_ID) ) {
                                int LA36_2 = input.LA(2);

                                if ( (synpred57_InternalNuSMV()) ) {
                                    alt36=1;
                                }
                                else if ( (true) ) {
                                    alt36=2;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 36, 2, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 36, 0, input);

                                throw nvae;
                            }
                            switch (alt36) {
                                case 1 :
                                    // InternalNuSMV.g:2880:7: ( (lv_params_4_0= ruleSimpleExpression ) )
                                    {
                                    // InternalNuSMV.g:2880:7: ( (lv_params_4_0= ruleSimpleExpression ) )
                                    // InternalNuSMV.g:2881:8: (lv_params_4_0= ruleSimpleExpression )
                                    {
                                    // InternalNuSMV.g:2881:8: (lv_params_4_0= ruleSimpleExpression )
                                    // InternalNuSMV.g:2882:9: lv_params_4_0= ruleSimpleExpression
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getModuleTypeAccess().getParamsSimpleExpressionParserRuleCall_0_1_2_1_0_0());
                                      								
                                    }
                                    pushFollow(FOLLOW_6);
                                    lv_params_4_0=ruleSimpleExpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getModuleTypeRule());
                                      									}
                                      									add(
                                      										current,
                                      										"params",
                                      										lv_params_4_0,
                                      										"org.xtext.nusmv.language.NuSMV.SimpleExpression");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalNuSMV.g:2900:7: ( (otherlv_5= RULE_ID ) )
                                    {
                                    // InternalNuSMV.g:2900:7: ( (otherlv_5= RULE_ID ) )
                                    // InternalNuSMV.g:2901:8: (otherlv_5= RULE_ID )
                                    {
                                    // InternalNuSMV.g:2901:8: (otherlv_5= RULE_ID )
                                    // InternalNuSMV.g:2902:9: otherlv_5= RULE_ID
                                    {
                                    if ( state.backtracking==0 ) {

                                      									/* */
                                      								
                                    }
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElement(grammarAccess.getModuleTypeRule());
                                      									}
                                      								
                                    }
                                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(otherlv_5, grammarAccess.getModuleTypeAccess().getParVarBodyCrossReference_0_1_2_1_1_0());
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }

                            // InternalNuSMV.g:2917:6: (otherlv_6= ',' ( (lv_params_7_0= ruleSimpleExpression ) ) )*
                            loop37:
                            do {
                                int alt37=2;
                                int LA37_0 = input.LA(1);

                                if ( (LA37_0==11) ) {
                                    alt37=1;
                                }


                                switch (alt37) {
                            	case 1 :
                            	    // InternalNuSMV.g:2918:7: otherlv_6= ',' ( (lv_params_7_0= ruleSimpleExpression ) )
                            	    {
                            	    otherlv_6=(Token)match(input,11,FOLLOW_13); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_6, grammarAccess.getModuleTypeAccess().getCommaKeyword_0_1_2_2_0());
                            	      						
                            	    }
                            	    // InternalNuSMV.g:2922:7: ( (lv_params_7_0= ruleSimpleExpression ) )
                            	    // InternalNuSMV.g:2923:8: (lv_params_7_0= ruleSimpleExpression )
                            	    {
                            	    // InternalNuSMV.g:2923:8: (lv_params_7_0= ruleSimpleExpression )
                            	    // InternalNuSMV.g:2924:9: lv_params_7_0= ruleSimpleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getModuleTypeAccess().getParamsSimpleExpressionParserRuleCall_0_1_2_2_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_6);
                            	    lv_params_7_0=ruleSimpleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getModuleTypeRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"params",
                            	      										lv_params_7_0,
                            	      										"org.xtext.nusmv.language.NuSMV.SimpleExpression");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop37;
                                }
                            } while (true);

                            otherlv_8=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_8, grammarAccess.getModuleTypeAccess().getRightParenthesisKeyword_0_1_2_3());
                              					
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNuSMV.g:2950:3: ( () ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= '(' ( ( (lv_params_12_0= ruleSimpleExpression ) ) | ( (otherlv_13= RULE_ID ) ) ) (otherlv_14= ',' ( (lv_params_15_0= ruleSimpleExpression ) ) )* otherlv_16= ')' )? ) )
                    {
                    // InternalNuSMV.g:2950:3: ( () ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= '(' ( ( (lv_params_12_0= ruleSimpleExpression ) ) | ( (otherlv_13= RULE_ID ) ) ) (otherlv_14= ',' ( (lv_params_15_0= ruleSimpleExpression ) ) )* otherlv_16= ')' )? ) )
                    // InternalNuSMV.g:2951:4: () ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= '(' ( ( (lv_params_12_0= ruleSimpleExpression ) ) | ( (otherlv_13= RULE_ID ) ) ) (otherlv_14= ',' ( (lv_params_15_0= ruleSimpleExpression ) ) )* otherlv_16= ')' )? )
                    {
                    // InternalNuSMV.g:2951:4: ()
                    // InternalNuSMV.g:2952:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getModuleTypeAccess().getSyncrProcessTypeAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNuSMV.g:2961:4: ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= '(' ( ( (lv_params_12_0= ruleSimpleExpression ) ) | ( (otherlv_13= RULE_ID ) ) ) (otherlv_14= ',' ( (lv_params_15_0= ruleSimpleExpression ) ) )* otherlv_16= ')' )? )
                    // InternalNuSMV.g:2962:5: ( (otherlv_10= RULE_ID ) ) (otherlv_11= '(' ( ( (lv_params_12_0= ruleSimpleExpression ) ) | ( (otherlv_13= RULE_ID ) ) ) (otherlv_14= ',' ( (lv_params_15_0= ruleSimpleExpression ) ) )* otherlv_16= ')' )?
                    {
                    // InternalNuSMV.g:2962:5: ( (otherlv_10= RULE_ID ) )
                    // InternalNuSMV.g:2963:6: (otherlv_10= RULE_ID )
                    {
                    // InternalNuSMV.g:2963:6: (otherlv_10= RULE_ID )
                    // InternalNuSMV.g:2964:7: otherlv_10= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      							/* */
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getModuleTypeRule());
                      							}
                      						
                    }
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_10, grammarAccess.getModuleTypeAccess().getModuleModuleCrossReference_1_1_0_0());
                      						
                    }

                    }


                    }

                    // InternalNuSMV.g:2978:5: (otherlv_11= '(' ( ( (lv_params_12_0= ruleSimpleExpression ) ) | ( (otherlv_13= RULE_ID ) ) ) (otherlv_14= ',' ( (lv_params_15_0= ruleSimpleExpression ) ) )* otherlv_16= ')' )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==10) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalNuSMV.g:2979:6: otherlv_11= '(' ( ( (lv_params_12_0= ruleSimpleExpression ) ) | ( (otherlv_13= RULE_ID ) ) ) (otherlv_14= ',' ( (lv_params_15_0= ruleSimpleExpression ) ) )* otherlv_16= ')'
                            {
                            otherlv_11=(Token)match(input,10,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_11, grammarAccess.getModuleTypeAccess().getLeftParenthesisKeyword_1_1_1_0());
                              					
                            }
                            // InternalNuSMV.g:2983:6: ( ( (lv_params_12_0= ruleSimpleExpression ) ) | ( (otherlv_13= RULE_ID ) ) )
                            int alt39=2;
                            int LA39_0 = input.LA(1);

                            if ( ((LA39_0>=RULE_WORD && LA39_0<=RULE_INT)||LA39_0==10||LA39_0==23||LA39_0==43||(LA39_0>=49 && LA39_0<=50)||(LA39_0>=55 && LA39_0<=56)||(LA39_0>=61 && LA39_0<=74)||(LA39_0>=76 && LA39_0<=82)) ) {
                                alt39=1;
                            }
                            else if ( (LA39_0==RULE_ID) ) {
                                int LA39_2 = input.LA(2);

                                if ( (synpred61_InternalNuSMV()) ) {
                                    alt39=1;
                                }
                                else if ( (true) ) {
                                    alt39=2;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 39, 2, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 39, 0, input);

                                throw nvae;
                            }
                            switch (alt39) {
                                case 1 :
                                    // InternalNuSMV.g:2984:7: ( (lv_params_12_0= ruleSimpleExpression ) )
                                    {
                                    // InternalNuSMV.g:2984:7: ( (lv_params_12_0= ruleSimpleExpression ) )
                                    // InternalNuSMV.g:2985:8: (lv_params_12_0= ruleSimpleExpression )
                                    {
                                    // InternalNuSMV.g:2985:8: (lv_params_12_0= ruleSimpleExpression )
                                    // InternalNuSMV.g:2986:9: lv_params_12_0= ruleSimpleExpression
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getModuleTypeAccess().getParamsSimpleExpressionParserRuleCall_1_1_1_1_0_0());
                                      								
                                    }
                                    pushFollow(FOLLOW_6);
                                    lv_params_12_0=ruleSimpleExpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getModuleTypeRule());
                                      									}
                                      									add(
                                      										current,
                                      										"params",
                                      										lv_params_12_0,
                                      										"org.xtext.nusmv.language.NuSMV.SimpleExpression");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalNuSMV.g:3004:7: ( (otherlv_13= RULE_ID ) )
                                    {
                                    // InternalNuSMV.g:3004:7: ( (otherlv_13= RULE_ID ) )
                                    // InternalNuSMV.g:3005:8: (otherlv_13= RULE_ID )
                                    {
                                    // InternalNuSMV.g:3005:8: (otherlv_13= RULE_ID )
                                    // InternalNuSMV.g:3006:9: otherlv_13= RULE_ID
                                    {
                                    if ( state.backtracking==0 ) {

                                      									/* */
                                      								
                                    }
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElement(grammarAccess.getModuleTypeRule());
                                      									}
                                      								
                                    }
                                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(otherlv_13, grammarAccess.getModuleTypeAccess().getParVarBodyCrossReference_1_1_1_1_1_0());
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }

                            // InternalNuSMV.g:3021:6: (otherlv_14= ',' ( (lv_params_15_0= ruleSimpleExpression ) ) )*
                            loop40:
                            do {
                                int alt40=2;
                                int LA40_0 = input.LA(1);

                                if ( (LA40_0==11) ) {
                                    alt40=1;
                                }


                                switch (alt40) {
                            	case 1 :
                            	    // InternalNuSMV.g:3022:7: otherlv_14= ',' ( (lv_params_15_0= ruleSimpleExpression ) )
                            	    {
                            	    otherlv_14=(Token)match(input,11,FOLLOW_13); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_14, grammarAccess.getModuleTypeAccess().getCommaKeyword_1_1_1_2_0());
                            	      						
                            	    }
                            	    // InternalNuSMV.g:3026:7: ( (lv_params_15_0= ruleSimpleExpression ) )
                            	    // InternalNuSMV.g:3027:8: (lv_params_15_0= ruleSimpleExpression )
                            	    {
                            	    // InternalNuSMV.g:3027:8: (lv_params_15_0= ruleSimpleExpression )
                            	    // InternalNuSMV.g:3028:9: lv_params_15_0= ruleSimpleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getModuleTypeAccess().getParamsSimpleExpressionParserRuleCall_1_1_1_2_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_6);
                            	    lv_params_15_0=ruleSimpleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getModuleTypeRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"params",
                            	      										lv_params_15_0,
                            	      										"org.xtext.nusmv.language.NuSMV.SimpleExpression");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop40;
                                }
                            } while (true);

                            otherlv_16=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_16, grammarAccess.getModuleTypeAccess().getRightParenthesisKeyword_1_1_1_3());
                              					
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleModuleType"


    // $ANTLR start "entryRuleVal"
    // InternalNuSMV.g:3060:1: entryRuleVal returns [EObject current=null] : iv_ruleVal= ruleVal EOF ;
    public final EObject entryRuleVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVal = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:3062:2: (iv_ruleVal= ruleVal EOF )
            // InternalNuSMV.g:3063:2: iv_ruleVal= ruleVal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVal=ruleVal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVal; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleVal"


    // $ANTLR start "ruleVal"
    // InternalNuSMV.g:3072:1: ruleVal returns [EObject current=null] : ( () ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_num_2_0= ruleNUMBER ) ) | otherlv_3= 'TRUE' | otherlv_4= 'FALSE' ) ) ;
    public final EObject ruleVal() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_num_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:3079:2: ( ( () ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_num_2_0= ruleNUMBER ) ) | otherlv_3= 'TRUE' | otherlv_4= 'FALSE' ) ) )
            // InternalNuSMV.g:3080:2: ( () ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_num_2_0= ruleNUMBER ) ) | otherlv_3= 'TRUE' | otherlv_4= 'FALSE' ) )
            {
            // InternalNuSMV.g:3080:2: ( () ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_num_2_0= ruleNUMBER ) ) | otherlv_3= 'TRUE' | otherlv_4= 'FALSE' ) )
            // InternalNuSMV.g:3081:3: () ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_num_2_0= ruleNUMBER ) ) | otherlv_3= 'TRUE' | otherlv_4= 'FALSE' )
            {
            // InternalNuSMV.g:3081:3: ()
            // InternalNuSMV.g:3082:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getValAccess().getValAction_0(),
              					current);
              			
            }

            }

            // InternalNuSMV.g:3091:3: ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_num_2_0= ruleNUMBER ) ) | otherlv_3= 'TRUE' | otherlv_4= 'FALSE' )
            int alt43=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt43=1;
                }
                break;
            case RULE_INT:
            case 55:
                {
                alt43=2;
                }
                break;
            case 49:
                {
                alt43=3;
                }
                break;
            case 50:
                {
                alt43=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalNuSMV.g:3092:4: ( (lv_name_1_0= RULE_ID ) )
                    {
                    // InternalNuSMV.g:3092:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalNuSMV.g:3093:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalNuSMV.g:3093:5: (lv_name_1_0= RULE_ID )
                    // InternalNuSMV.g:3094:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_0, grammarAccess.getValAccess().getNameIDTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getValRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_1_0,
                      							"org.xtext.nusmv.language.NuSMV.ID");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNuSMV.g:3111:4: ( (lv_num_2_0= ruleNUMBER ) )
                    {
                    // InternalNuSMV.g:3111:4: ( (lv_num_2_0= ruleNUMBER ) )
                    // InternalNuSMV.g:3112:5: (lv_num_2_0= ruleNUMBER )
                    {
                    // InternalNuSMV.g:3112:5: (lv_num_2_0= ruleNUMBER )
                    // InternalNuSMV.g:3113:6: lv_num_2_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getValAccess().getNumNUMBERParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_num_2_0=ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getValRule());
                      						}
                      						set(
                      							current,
                      							"num",
                      							lv_num_2_0,
                      							"org.xtext.nusmv.language.NuSMV.NUMBER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalNuSMV.g:3131:4: otherlv_3= 'TRUE'
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getValAccess().getTRUEKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalNuSMV.g:3136:4: otherlv_4= 'FALSE'
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getValAccess().getFALSEKeyword_1_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleVal"


    // $ANTLR start "entryRuleNextExpression"
    // InternalNuSMV.g:3148:1: entryRuleNextExpression returns [EObject current=null] : iv_ruleNextExpression= ruleNextExpression EOF ;
    public final EObject entryRuleNextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNextExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:3150:2: (iv_ruleNextExpression= ruleNextExpression EOF )
            // InternalNuSMV.g:3151:2: iv_ruleNextExpression= ruleNextExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNextExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNextExpression=ruleNextExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNextExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNextExpression"


    // $ANTLR start "ruleNextExpression"
    // InternalNuSMV.g:3160:1: ruleNextExpression returns [EObject current=null] : ( (lv_simpleExpression_0_0= ruleSimpleExpression ) ) ;
    public final EObject ruleNextExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_simpleExpression_0_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:3167:2: ( ( (lv_simpleExpression_0_0= ruleSimpleExpression ) ) )
            // InternalNuSMV.g:3168:2: ( (lv_simpleExpression_0_0= ruleSimpleExpression ) )
            {
            // InternalNuSMV.g:3168:2: ( (lv_simpleExpression_0_0= ruleSimpleExpression ) )
            // InternalNuSMV.g:3169:3: (lv_simpleExpression_0_0= ruleSimpleExpression )
            {
            // InternalNuSMV.g:3169:3: (lv_simpleExpression_0_0= ruleSimpleExpression )
            // InternalNuSMV.g:3170:4: lv_simpleExpression_0_0= ruleSimpleExpression
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getNextExpressionAccess().getSimpleExpressionSimpleExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_simpleExpression_0_0=ruleSimpleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getNextExpressionRule());
              				}
              				set(
              					current,
              					"simpleExpression",
              					lv_simpleExpression_0_0,
              					"org.xtext.nusmv.language.NuSMV.SimpleExpression");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNextExpression"


    // $ANTLR start "entryRuleSimpleExpression"
    // InternalNuSMV.g:3193:1: entryRuleSimpleExpression returns [EObject current=null] : iv_ruleSimpleExpression= ruleSimpleExpression EOF ;
    public final EObject entryRuleSimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleExpression = null;


        try {
            // InternalNuSMV.g:3193:57: (iv_ruleSimpleExpression= ruleSimpleExpression EOF )
            // InternalNuSMV.g:3194:2: iv_ruleSimpleExpression= ruleSimpleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleExpression=ruleSimpleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleExpression"


    // $ANTLR start "ruleSimpleExpression"
    // InternalNuSMV.g:3200:1: ruleSimpleExpression returns [EObject current=null] : ( ( ruleImpliesExpression )=>this_LTLbinExpression_0= ruleLTLbinExpression ) ;
    public final EObject ruleSimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LTLbinExpression_0 = null;



        	enterRule();

        try {
            // InternalNuSMV.g:3206:2: ( ( ( ruleImpliesExpression )=>this_LTLbinExpression_0= ruleLTLbinExpression ) )
            // InternalNuSMV.g:3207:2: ( ( ruleImpliesExpression )=>this_LTLbinExpression_0= ruleLTLbinExpression )
            {
            // InternalNuSMV.g:3207:2: ( ( ruleImpliesExpression )=>this_LTLbinExpression_0= ruleLTLbinExpression )
            // InternalNuSMV.g:3208:3: ( ruleImpliesExpression )=>this_LTLbinExpression_0= ruleLTLbinExpression
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSimpleExpressionAccess().getLTLbinExpressionParserRuleCall());
              		
            }
            pushFollow(FOLLOW_2);
            this_LTLbinExpression_0=ruleLTLbinExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_LTLbinExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleExpression"


    // $ANTLR start "entryRuleLTLbinExpression"
    // InternalNuSMV.g:3224:1: entryRuleLTLbinExpression returns [EObject current=null] : iv_ruleLTLbinExpression= ruleLTLbinExpression EOF ;
    public final EObject entryRuleLTLbinExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLTLbinExpression = null;


        try {
            // InternalNuSMV.g:3224:57: (iv_ruleLTLbinExpression= ruleLTLbinExpression EOF )
            // InternalNuSMV.g:3225:2: iv_ruleLTLbinExpression= ruleLTLbinExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLTLbinExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLTLbinExpression=ruleLTLbinExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLTLbinExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLTLbinExpression"


    // $ANTLR start "ruleLTLbinExpression"
    // InternalNuSMV.g:3231:1: ruleLTLbinExpression returns [EObject current=null] : ( ( ( ruleImpliesExpression )=>this_ImpliesExpression_0= ruleImpliesExpression ) ( () ( (lv_operator_2_0= ruleLTLbinoperators ) ) ( ( ruleIffExpression )=> (lv_right_3_0= ruleImpliesExpression ) ) )* ) ;
    public final EObject ruleLTLbinExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ImpliesExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalNuSMV.g:3237:2: ( ( ( ( ruleImpliesExpression )=>this_ImpliesExpression_0= ruleImpliesExpression ) ( () ( (lv_operator_2_0= ruleLTLbinoperators ) ) ( ( ruleIffExpression )=> (lv_right_3_0= ruleImpliesExpression ) ) )* ) )
            // InternalNuSMV.g:3238:2: ( ( ( ruleImpliesExpression )=>this_ImpliesExpression_0= ruleImpliesExpression ) ( () ( (lv_operator_2_0= ruleLTLbinoperators ) ) ( ( ruleIffExpression )=> (lv_right_3_0= ruleImpliesExpression ) ) )* )
            {
            // InternalNuSMV.g:3238:2: ( ( ( ruleImpliesExpression )=>this_ImpliesExpression_0= ruleImpliesExpression ) ( () ( (lv_operator_2_0= ruleLTLbinoperators ) ) ( ( ruleIffExpression )=> (lv_right_3_0= ruleImpliesExpression ) ) )* )
            // InternalNuSMV.g:3239:3: ( ( ruleImpliesExpression )=>this_ImpliesExpression_0= ruleImpliesExpression ) ( () ( (lv_operator_2_0= ruleLTLbinoperators ) ) ( ( ruleIffExpression )=> (lv_right_3_0= ruleImpliesExpression ) ) )*
            {
            // InternalNuSMV.g:3239:3: ( ( ruleImpliesExpression )=>this_ImpliesExpression_0= ruleImpliesExpression )
            // InternalNuSMV.g:3240:4: ( ruleImpliesExpression )=>this_ImpliesExpression_0= ruleImpliesExpression
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getLTLbinExpressionAccess().getImpliesExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_32);
            this_ImpliesExpression_0=ruleImpliesExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_ImpliesExpression_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalNuSMV.g:3253:3: ( () ( (lv_operator_2_0= ruleLTLbinoperators ) ) ( ( ruleIffExpression )=> (lv_right_3_0= ruleImpliesExpression ) ) )*
            loop44:
            do {
                int alt44=2;
                switch ( input.LA(1) ) {
                case 103:
                    {
                    int LA44_2 = input.LA(2);

                    if ( (synpred70_InternalNuSMV()) ) {
                        alt44=1;
                    }


                    }
                    break;
                case 104:
                    {
                    int LA44_3 = input.LA(2);

                    if ( (synpred70_InternalNuSMV()) ) {
                        alt44=1;
                    }


                    }
                    break;
                case 105:
                    {
                    int LA44_4 = input.LA(2);

                    if ( (synpred70_InternalNuSMV()) ) {
                        alt44=1;
                    }


                    }
                    break;
                case 106:
                    {
                    int LA44_5 = input.LA(2);

                    if ( (synpred70_InternalNuSMV()) ) {
                        alt44=1;
                    }


                    }
                    break;

                }

                switch (alt44) {
            	case 1 :
            	    // InternalNuSMV.g:3254:4: () ( (lv_operator_2_0= ruleLTLbinoperators ) ) ( ( ruleIffExpression )=> (lv_right_3_0= ruleImpliesExpression ) )
            	    {
            	    // InternalNuSMV.g:3254:4: ()
            	    // InternalNuSMV.g:3255:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getLTLbinExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalNuSMV.g:3264:4: ( (lv_operator_2_0= ruleLTLbinoperators ) )
            	    // InternalNuSMV.g:3265:5: (lv_operator_2_0= ruleLTLbinoperators )
            	    {
            	    // InternalNuSMV.g:3265:5: (lv_operator_2_0= ruleLTLbinoperators )
            	    // InternalNuSMV.g:3266:6: lv_operator_2_0= ruleLTLbinoperators
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLTLbinExpressionAccess().getOperatorLTLbinoperatorsEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_operator_2_0=ruleLTLbinoperators();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLTLbinExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"operator",
            	      							lv_operator_2_0,
            	      							"org.xtext.nusmv.language.NuSMV.LTLbinoperators");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalNuSMV.g:3283:4: ( ( ruleIffExpression )=> (lv_right_3_0= ruleImpliesExpression ) )
            	    // InternalNuSMV.g:3284:5: ( ruleIffExpression )=> (lv_right_3_0= ruleImpliesExpression )
            	    {
            	    // InternalNuSMV.g:3285:5: (lv_right_3_0= ruleImpliesExpression )
            	    // InternalNuSMV.g:3286:6: lv_right_3_0= ruleImpliesExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLTLbinExpressionAccess().getRightImpliesExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_32);
            	    lv_right_3_0=ruleImpliesExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLTLbinExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.nusmv.language.NuSMV.ImpliesExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLTLbinExpression"


    // $ANTLR start "entryRuleImpliesExpression"
    // InternalNuSMV.g:3308:1: entryRuleImpliesExpression returns [EObject current=null] : iv_ruleImpliesExpression= ruleImpliesExpression EOF ;
    public final EObject entryRuleImpliesExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpliesExpression = null;


        try {
            // InternalNuSMV.g:3308:58: (iv_ruleImpliesExpression= ruleImpliesExpression EOF )
            // InternalNuSMV.g:3309:2: iv_ruleImpliesExpression= ruleImpliesExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImpliesExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImpliesExpression=ruleImpliesExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImpliesExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImpliesExpression"


    // $ANTLR start "ruleImpliesExpression"
    // InternalNuSMV.g:3315:1: ruleImpliesExpression returns [EObject current=null] : ( ( ( ruleIffExpression )=>this_IffExpression_0= ruleIffExpression ) ( () ( (lv_operator_2_0= ruleimpliesoperator ) ) ( ( ruleOrExpression )=> (lv_right_3_0= ruleIffExpression ) ) )* ) ;
    public final EObject ruleImpliesExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IffExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalNuSMV.g:3321:2: ( ( ( ( ruleIffExpression )=>this_IffExpression_0= ruleIffExpression ) ( () ( (lv_operator_2_0= ruleimpliesoperator ) ) ( ( ruleOrExpression )=> (lv_right_3_0= ruleIffExpression ) ) )* ) )
            // InternalNuSMV.g:3322:2: ( ( ( ruleIffExpression )=>this_IffExpression_0= ruleIffExpression ) ( () ( (lv_operator_2_0= ruleimpliesoperator ) ) ( ( ruleOrExpression )=> (lv_right_3_0= ruleIffExpression ) ) )* )
            {
            // InternalNuSMV.g:3322:2: ( ( ( ruleIffExpression )=>this_IffExpression_0= ruleIffExpression ) ( () ( (lv_operator_2_0= ruleimpliesoperator ) ) ( ( ruleOrExpression )=> (lv_right_3_0= ruleIffExpression ) ) )* )
            // InternalNuSMV.g:3323:3: ( ( ruleIffExpression )=>this_IffExpression_0= ruleIffExpression ) ( () ( (lv_operator_2_0= ruleimpliesoperator ) ) ( ( ruleOrExpression )=> (lv_right_3_0= ruleIffExpression ) ) )*
            {
            // InternalNuSMV.g:3323:3: ( ( ruleIffExpression )=>this_IffExpression_0= ruleIffExpression )
            // InternalNuSMV.g:3324:4: ( ruleIffExpression )=>this_IffExpression_0= ruleIffExpression
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getImpliesExpressionAccess().getIffExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_33);
            this_IffExpression_0=ruleIffExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_IffExpression_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalNuSMV.g:3337:3: ( () ( (lv_operator_2_0= ruleimpliesoperator ) ) ( ( ruleOrExpression )=> (lv_right_3_0= ruleIffExpression ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==100) ) {
                    int LA45_2 = input.LA(2);

                    if ( (synpred73_InternalNuSMV()) ) {
                        alt45=1;
                    }


                }


                switch (alt45) {
            	case 1 :
            	    // InternalNuSMV.g:3338:4: () ( (lv_operator_2_0= ruleimpliesoperator ) ) ( ( ruleOrExpression )=> (lv_right_3_0= ruleIffExpression ) )
            	    {
            	    // InternalNuSMV.g:3338:4: ()
            	    // InternalNuSMV.g:3339:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getImpliesExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalNuSMV.g:3348:4: ( (lv_operator_2_0= ruleimpliesoperator ) )
            	    // InternalNuSMV.g:3349:5: (lv_operator_2_0= ruleimpliesoperator )
            	    {
            	    // InternalNuSMV.g:3349:5: (lv_operator_2_0= ruleimpliesoperator )
            	    // InternalNuSMV.g:3350:6: lv_operator_2_0= ruleimpliesoperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getImpliesExpressionAccess().getOperatorImpliesoperatorEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_operator_2_0=ruleimpliesoperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getImpliesExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"operator",
            	      							lv_operator_2_0,
            	      							"org.xtext.nusmv.language.NuSMV.impliesoperator");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalNuSMV.g:3367:4: ( ( ruleOrExpression )=> (lv_right_3_0= ruleIffExpression ) )
            	    // InternalNuSMV.g:3368:5: ( ruleOrExpression )=> (lv_right_3_0= ruleIffExpression )
            	    {
            	    // InternalNuSMV.g:3369:5: (lv_right_3_0= ruleIffExpression )
            	    // InternalNuSMV.g:3370:6: lv_right_3_0= ruleIffExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getImpliesExpressionAccess().getRightIffExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_33);
            	    lv_right_3_0=ruleIffExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getImpliesExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.nusmv.language.NuSMV.IffExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImpliesExpression"


    // $ANTLR start "entryRuleIffExpression"
    // InternalNuSMV.g:3392:1: entryRuleIffExpression returns [EObject current=null] : iv_ruleIffExpression= ruleIffExpression EOF ;
    public final EObject entryRuleIffExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIffExpression = null;


        try {
            // InternalNuSMV.g:3392:54: (iv_ruleIffExpression= ruleIffExpression EOF )
            // InternalNuSMV.g:3393:2: iv_ruleIffExpression= ruleIffExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIffExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIffExpression=ruleIffExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIffExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIffExpression"


    // $ANTLR start "ruleIffExpression"
    // InternalNuSMV.g:3399:1: ruleIffExpression returns [EObject current=null] : ( ( ( ruleOrExpression )=>this_OrExpression_0= ruleOrExpression ) ( () ( (lv_operator_2_0= ruleiffoperator ) ) ( ( ruleAndExpression )=> (lv_right_3_0= ruleOrExpression ) ) )* ) ;
    public final EObject ruleIffExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalNuSMV.g:3405:2: ( ( ( ( ruleOrExpression )=>this_OrExpression_0= ruleOrExpression ) ( () ( (lv_operator_2_0= ruleiffoperator ) ) ( ( ruleAndExpression )=> (lv_right_3_0= ruleOrExpression ) ) )* ) )
            // InternalNuSMV.g:3406:2: ( ( ( ruleOrExpression )=>this_OrExpression_0= ruleOrExpression ) ( () ( (lv_operator_2_0= ruleiffoperator ) ) ( ( ruleAndExpression )=> (lv_right_3_0= ruleOrExpression ) ) )* )
            {
            // InternalNuSMV.g:3406:2: ( ( ( ruleOrExpression )=>this_OrExpression_0= ruleOrExpression ) ( () ( (lv_operator_2_0= ruleiffoperator ) ) ( ( ruleAndExpression )=> (lv_right_3_0= ruleOrExpression ) ) )* )
            // InternalNuSMV.g:3407:3: ( ( ruleOrExpression )=>this_OrExpression_0= ruleOrExpression ) ( () ( (lv_operator_2_0= ruleiffoperator ) ) ( ( ruleAndExpression )=> (lv_right_3_0= ruleOrExpression ) ) )*
            {
            // InternalNuSMV.g:3407:3: ( ( ruleOrExpression )=>this_OrExpression_0= ruleOrExpression )
            // InternalNuSMV.g:3408:4: ( ruleOrExpression )=>this_OrExpression_0= ruleOrExpression
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getIffExpressionAccess().getOrExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_34);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_OrExpression_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalNuSMV.g:3421:3: ( () ( (lv_operator_2_0= ruleiffoperator ) ) ( ( ruleAndExpression )=> (lv_right_3_0= ruleOrExpression ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==101) ) {
                    int LA46_2 = input.LA(2);

                    if ( (synpred76_InternalNuSMV()) ) {
                        alt46=1;
                    }


                }


                switch (alt46) {
            	case 1 :
            	    // InternalNuSMV.g:3422:4: () ( (lv_operator_2_0= ruleiffoperator ) ) ( ( ruleAndExpression )=> (lv_right_3_0= ruleOrExpression ) )
            	    {
            	    // InternalNuSMV.g:3422:4: ()
            	    // InternalNuSMV.g:3423:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getIffExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalNuSMV.g:3432:4: ( (lv_operator_2_0= ruleiffoperator ) )
            	    // InternalNuSMV.g:3433:5: (lv_operator_2_0= ruleiffoperator )
            	    {
            	    // InternalNuSMV.g:3433:5: (lv_operator_2_0= ruleiffoperator )
            	    // InternalNuSMV.g:3434:6: lv_operator_2_0= ruleiffoperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getIffExpressionAccess().getOperatorIffoperatorEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_operator_2_0=ruleiffoperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getIffExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"operator",
            	      							lv_operator_2_0,
            	      							"org.xtext.nusmv.language.NuSMV.iffoperator");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalNuSMV.g:3451:4: ( ( ruleAndExpression )=> (lv_right_3_0= ruleOrExpression ) )
            	    // InternalNuSMV.g:3452:5: ( ruleAndExpression )=> (lv_right_3_0= ruleOrExpression )
            	    {
            	    // InternalNuSMV.g:3453:5: (lv_right_3_0= ruleOrExpression )
            	    // InternalNuSMV.g:3454:6: lv_right_3_0= ruleOrExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getIffExpressionAccess().getRightOrExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_34);
            	    lv_right_3_0=ruleOrExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getIffExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.nusmv.language.NuSMV.OrExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIffExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalNuSMV.g:3476:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalNuSMV.g:3476:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalNuSMV.g:3477:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalNuSMV.g:3483:1: ruleOrExpression returns [EObject current=null] : ( ( ( ruleAndExpression )=>this_AndExpression_0= ruleAndExpression ) ( () ( (lv_operator_2_0= ruleoroperators ) ) ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalNuSMV.g:3489:2: ( ( ( ( ruleAndExpression )=>this_AndExpression_0= ruleAndExpression ) ( () ( (lv_operator_2_0= ruleoroperators ) ) ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalNuSMV.g:3490:2: ( ( ( ruleAndExpression )=>this_AndExpression_0= ruleAndExpression ) ( () ( (lv_operator_2_0= ruleoroperators ) ) ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalNuSMV.g:3490:2: ( ( ( ruleAndExpression )=>this_AndExpression_0= ruleAndExpression ) ( () ( (lv_operator_2_0= ruleoroperators ) ) ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalNuSMV.g:3491:3: ( ( ruleAndExpression )=>this_AndExpression_0= ruleAndExpression ) ( () ( (lv_operator_2_0= ruleoroperators ) ) ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) ) )*
            {
            // InternalNuSMV.g:3491:3: ( ( ruleAndExpression )=>this_AndExpression_0= ruleAndExpression )
            // InternalNuSMV.g:3492:4: ( ruleAndExpression )=>this_AndExpression_0= ruleAndExpression
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_35);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_AndExpression_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalNuSMV.g:3505:3: ( () ( (lv_operator_2_0= ruleoroperators ) ) ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) ) )*
            loop47:
            do {
                int alt47=2;
                switch ( input.LA(1) ) {
                case 97:
                    {
                    int LA47_2 = input.LA(2);

                    if ( (synpred79_InternalNuSMV()) ) {
                        alt47=1;
                    }


                    }
                    break;
                case 98:
                    {
                    int LA47_3 = input.LA(2);

                    if ( (synpred79_InternalNuSMV()) ) {
                        alt47=1;
                    }


                    }
                    break;
                case 99:
                    {
                    int LA47_4 = input.LA(2);

                    if ( (synpred79_InternalNuSMV()) ) {
                        alt47=1;
                    }


                    }
                    break;

                }

                switch (alt47) {
            	case 1 :
            	    // InternalNuSMV.g:3506:4: () ( (lv_operator_2_0= ruleoroperators ) ) ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalNuSMV.g:3506:4: ()
            	    // InternalNuSMV.g:3507:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalNuSMV.g:3516:4: ( (lv_operator_2_0= ruleoroperators ) )
            	    // InternalNuSMV.g:3517:5: (lv_operator_2_0= ruleoroperators )
            	    {
            	    // InternalNuSMV.g:3517:5: (lv_operator_2_0= ruleoroperators )
            	    // InternalNuSMV.g:3518:6: lv_operator_2_0= ruleoroperators
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorOroperatorsEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_operator_2_0=ruleoroperators();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"operator",
            	      							lv_operator_2_0,
            	      							"org.xtext.nusmv.language.NuSMV.oroperators");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalNuSMV.g:3535:4: ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) )
            	    // InternalNuSMV.g:3536:5: ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalNuSMV.g:3537:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalNuSMV.g:3538:6: lv_right_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_35);
            	    lv_right_3_0=ruleAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.nusmv.language.NuSMV.AndExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalNuSMV.g:3560:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalNuSMV.g:3560:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalNuSMV.g:3561:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalNuSMV.g:3567:1: ruleAndExpression returns [EObject current=null] : ( ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) ( () ( (lv_operator_2_0= ruleandoperator ) ) ( ( ruleInExpression )=> (lv_right_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalNuSMV.g:3573:2: ( ( ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) ( () ( (lv_operator_2_0= ruleandoperator ) ) ( ( ruleInExpression )=> (lv_right_3_0= ruleComparisonExpression ) ) )* ) )
            // InternalNuSMV.g:3574:2: ( ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) ( () ( (lv_operator_2_0= ruleandoperator ) ) ( ( ruleInExpression )=> (lv_right_3_0= ruleComparisonExpression ) ) )* )
            {
            // InternalNuSMV.g:3574:2: ( ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) ( () ( (lv_operator_2_0= ruleandoperator ) ) ( ( ruleInExpression )=> (lv_right_3_0= ruleComparisonExpression ) ) )* )
            // InternalNuSMV.g:3575:3: ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) ( () ( (lv_operator_2_0= ruleandoperator ) ) ( ( ruleInExpression )=> (lv_right_3_0= ruleComparisonExpression ) ) )*
            {
            // InternalNuSMV.g:3575:3: ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression )
            // InternalNuSMV.g:3576:4: ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getAndExpressionAccess().getComparisonExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_36);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_ComparisonExpression_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalNuSMV.g:3589:3: ( () ( (lv_operator_2_0= ruleandoperator ) ) ( ( ruleInExpression )=> (lv_right_3_0= ruleComparisonExpression ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==102) ) {
                    int LA48_2 = input.LA(2);

                    if ( (synpred82_InternalNuSMV()) ) {
                        alt48=1;
                    }


                }


                switch (alt48) {
            	case 1 :
            	    // InternalNuSMV.g:3590:4: () ( (lv_operator_2_0= ruleandoperator ) ) ( ( ruleInExpression )=> (lv_right_3_0= ruleComparisonExpression ) )
            	    {
            	    // InternalNuSMV.g:3590:4: ()
            	    // InternalNuSMV.g:3591:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalNuSMV.g:3600:4: ( (lv_operator_2_0= ruleandoperator ) )
            	    // InternalNuSMV.g:3601:5: (lv_operator_2_0= ruleandoperator )
            	    {
            	    // InternalNuSMV.g:3601:5: (lv_operator_2_0= ruleandoperator )
            	    // InternalNuSMV.g:3602:6: lv_operator_2_0= ruleandoperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorAndoperatorEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_operator_2_0=ruleandoperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"operator",
            	      							lv_operator_2_0,
            	      							"org.xtext.nusmv.language.NuSMV.andoperator");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalNuSMV.g:3619:4: ( ( ruleInExpression )=> (lv_right_3_0= ruleComparisonExpression ) )
            	    // InternalNuSMV.g:3620:5: ( ruleInExpression )=> (lv_right_3_0= ruleComparisonExpression )
            	    {
            	    // InternalNuSMV.g:3621:5: (lv_right_3_0= ruleComparisonExpression )
            	    // InternalNuSMV.g:3622:6: lv_right_3_0= ruleComparisonExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_36);
            	    lv_right_3_0=ruleComparisonExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.nusmv.language.NuSMV.ComparisonExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalNuSMV.g:3644:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalNuSMV.g:3644:61: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalNuSMV.g:3645:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalNuSMV.g:3651:1: ruleComparisonExpression returns [EObject current=null] : ( ( ( ruleInExpression )=>this_InExpression_0= ruleInExpression ) ( () ( (lv_operator_2_0= rulecomparisonoperators ) ) ( ( ruleUnionExpression )=> (lv_right_3_0= ruleInExpression ) ) )* ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_InExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalNuSMV.g:3657:2: ( ( ( ( ruleInExpression )=>this_InExpression_0= ruleInExpression ) ( () ( (lv_operator_2_0= rulecomparisonoperators ) ) ( ( ruleUnionExpression )=> (lv_right_3_0= ruleInExpression ) ) )* ) )
            // InternalNuSMV.g:3658:2: ( ( ( ruleInExpression )=>this_InExpression_0= ruleInExpression ) ( () ( (lv_operator_2_0= rulecomparisonoperators ) ) ( ( ruleUnionExpression )=> (lv_right_3_0= ruleInExpression ) ) )* )
            {
            // InternalNuSMV.g:3658:2: ( ( ( ruleInExpression )=>this_InExpression_0= ruleInExpression ) ( () ( (lv_operator_2_0= rulecomparisonoperators ) ) ( ( ruleUnionExpression )=> (lv_right_3_0= ruleInExpression ) ) )* )
            // InternalNuSMV.g:3659:3: ( ( ruleInExpression )=>this_InExpression_0= ruleInExpression ) ( () ( (lv_operator_2_0= rulecomparisonoperators ) ) ( ( ruleUnionExpression )=> (lv_right_3_0= ruleInExpression ) ) )*
            {
            // InternalNuSMV.g:3659:3: ( ( ruleInExpression )=>this_InExpression_0= ruleInExpression )
            // InternalNuSMV.g:3660:4: ( ruleInExpression )=>this_InExpression_0= ruleInExpression
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getComparisonExpressionAccess().getInExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_37);
            this_InExpression_0=ruleInExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_InExpression_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalNuSMV.g:3673:3: ( () ( (lv_operator_2_0= rulecomparisonoperators ) ) ( ( ruleUnionExpression )=> (lv_right_3_0= ruleInExpression ) ) )*
            loop49:
            do {
                int alt49=2;
                switch ( input.LA(1) ) {
                case 91:
                    {
                    int LA49_2 = input.LA(2);

                    if ( (synpred85_InternalNuSMV()) ) {
                        alt49=1;
                    }


                    }
                    break;
                case 92:
                    {
                    int LA49_3 = input.LA(2);

                    if ( (synpred85_InternalNuSMV()) ) {
                        alt49=1;
                    }


                    }
                    break;
                case 93:
                    {
                    int LA49_4 = input.LA(2);

                    if ( (synpred85_InternalNuSMV()) ) {
                        alt49=1;
                    }


                    }
                    break;
                case 94:
                    {
                    int LA49_5 = input.LA(2);

                    if ( (synpred85_InternalNuSMV()) ) {
                        alt49=1;
                    }


                    }
                    break;
                case 95:
                    {
                    int LA49_6 = input.LA(2);

                    if ( (synpred85_InternalNuSMV()) ) {
                        alt49=1;
                    }


                    }
                    break;
                case 96:
                    {
                    int LA49_7 = input.LA(2);

                    if ( (synpred85_InternalNuSMV()) ) {
                        alt49=1;
                    }


                    }
                    break;

                }

                switch (alt49) {
            	case 1 :
            	    // InternalNuSMV.g:3674:4: () ( (lv_operator_2_0= rulecomparisonoperators ) ) ( ( ruleUnionExpression )=> (lv_right_3_0= ruleInExpression ) )
            	    {
            	    // InternalNuSMV.g:3674:4: ()
            	    // InternalNuSMV.g:3675:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getComparisonExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalNuSMV.g:3684:4: ( (lv_operator_2_0= rulecomparisonoperators ) )
            	    // InternalNuSMV.g:3685:5: (lv_operator_2_0= rulecomparisonoperators )
            	    {
            	    // InternalNuSMV.g:3685:5: (lv_operator_2_0= rulecomparisonoperators )
            	    // InternalNuSMV.g:3686:6: lv_operator_2_0= rulecomparisonoperators
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getOperatorComparisonoperatorsEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_operator_2_0=rulecomparisonoperators();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"operator",
            	      							lv_operator_2_0,
            	      							"org.xtext.nusmv.language.NuSMV.comparisonoperators");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalNuSMV.g:3703:4: ( ( ruleUnionExpression )=> (lv_right_3_0= ruleInExpression ) )
            	    // InternalNuSMV.g:3704:5: ( ruleUnionExpression )=> (lv_right_3_0= ruleInExpression )
            	    {
            	    // InternalNuSMV.g:3705:5: (lv_right_3_0= ruleInExpression )
            	    // InternalNuSMV.g:3706:6: lv_right_3_0= ruleInExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightInExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_37);
            	    lv_right_3_0=ruleInExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.nusmv.language.NuSMV.InExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleInExpression"
    // InternalNuSMV.g:3728:1: entryRuleInExpression returns [EObject current=null] : iv_ruleInExpression= ruleInExpression EOF ;
    public final EObject entryRuleInExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInExpression = null;


        try {
            // InternalNuSMV.g:3728:53: (iv_ruleInExpression= ruleInExpression EOF )
            // InternalNuSMV.g:3729:2: iv_ruleInExpression= ruleInExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInExpression=ruleInExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInExpression"


    // $ANTLR start "ruleInExpression"
    // InternalNuSMV.g:3735:1: ruleInExpression returns [EObject current=null] : ( ( ( ruleUnionExpression )=>this_UnionExpression_0= ruleUnionExpression ) ( () ( (lv_op_2_0= 'in' ) ) ( ( ruleRightShift )=> (lv_right_3_0= ruleUnionExpression ) ) )* ) ;
    public final EObject ruleInExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_UnionExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalNuSMV.g:3741:2: ( ( ( ( ruleUnionExpression )=>this_UnionExpression_0= ruleUnionExpression ) ( () ( (lv_op_2_0= 'in' ) ) ( ( ruleRightShift )=> (lv_right_3_0= ruleUnionExpression ) ) )* ) )
            // InternalNuSMV.g:3742:2: ( ( ( ruleUnionExpression )=>this_UnionExpression_0= ruleUnionExpression ) ( () ( (lv_op_2_0= 'in' ) ) ( ( ruleRightShift )=> (lv_right_3_0= ruleUnionExpression ) ) )* )
            {
            // InternalNuSMV.g:3742:2: ( ( ( ruleUnionExpression )=>this_UnionExpression_0= ruleUnionExpression ) ( () ( (lv_op_2_0= 'in' ) ) ( ( ruleRightShift )=> (lv_right_3_0= ruleUnionExpression ) ) )* )
            // InternalNuSMV.g:3743:3: ( ( ruleUnionExpression )=>this_UnionExpression_0= ruleUnionExpression ) ( () ( (lv_op_2_0= 'in' ) ) ( ( ruleRightShift )=> (lv_right_3_0= ruleUnionExpression ) ) )*
            {
            // InternalNuSMV.g:3743:3: ( ( ruleUnionExpression )=>this_UnionExpression_0= ruleUnionExpression )
            // InternalNuSMV.g:3744:4: ( ruleUnionExpression )=>this_UnionExpression_0= ruleUnionExpression
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getInExpressionAccess().getUnionExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_38);
            this_UnionExpression_0=ruleUnionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_UnionExpression_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalNuSMV.g:3757:3: ( () ( (lv_op_2_0= 'in' ) ) ( ( ruleRightShift )=> (lv_right_3_0= ruleUnionExpression ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==51) ) {
                    int LA50_2 = input.LA(2);

                    if ( (synpred88_InternalNuSMV()) ) {
                        alt50=1;
                    }


                }


                switch (alt50) {
            	case 1 :
            	    // InternalNuSMV.g:3758:4: () ( (lv_op_2_0= 'in' ) ) ( ( ruleRightShift )=> (lv_right_3_0= ruleUnionExpression ) )
            	    {
            	    // InternalNuSMV.g:3758:4: ()
            	    // InternalNuSMV.g:3759:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getInExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalNuSMV.g:3768:4: ( (lv_op_2_0= 'in' ) )
            	    // InternalNuSMV.g:3769:5: (lv_op_2_0= 'in' )
            	    {
            	    // InternalNuSMV.g:3769:5: (lv_op_2_0= 'in' )
            	    // InternalNuSMV.g:3770:6: lv_op_2_0= 'in'
            	    {
            	    lv_op_2_0=(Token)match(input,51,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getInExpressionAccess().getOpInKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getInExpressionRule());
            	      						}
            	      						setWithLastConsumed(current, "op", lv_op_2_0, "in");
            	      					
            	    }

            	    }


            	    }

            	    // InternalNuSMV.g:3782:4: ( ( ruleRightShift )=> (lv_right_3_0= ruleUnionExpression ) )
            	    // InternalNuSMV.g:3783:5: ( ruleRightShift )=> (lv_right_3_0= ruleUnionExpression )
            	    {
            	    // InternalNuSMV.g:3784:5: (lv_right_3_0= ruleUnionExpression )
            	    // InternalNuSMV.g:3785:6: lv_right_3_0= ruleUnionExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getInExpressionAccess().getRightUnionExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_38);
            	    lv_right_3_0=ruleUnionExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getInExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.nusmv.language.NuSMV.UnionExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInExpression"


    // $ANTLR start "entryRuleUnionExpression"
    // InternalNuSMV.g:3807:1: entryRuleUnionExpression returns [EObject current=null] : iv_ruleUnionExpression= ruleUnionExpression EOF ;
    public final EObject entryRuleUnionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnionExpression = null;


        try {
            // InternalNuSMV.g:3807:56: (iv_ruleUnionExpression= ruleUnionExpression EOF )
            // InternalNuSMV.g:3808:2: iv_ruleUnionExpression= ruleUnionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnionExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnionExpression=ruleUnionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnionExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnionExpression"


    // $ANTLR start "ruleUnionExpression"
    // InternalNuSMV.g:3814:1: ruleUnionExpression returns [EObject current=null] : ( ( ( ruleRightShift )=>this_RightShift_0= ruleRightShift ) ( () ( (lv_op_2_0= 'union' ) ) ( ( ruleLeftShift )=> (lv_right_3_0= ruleRightShift ) ) )* ) ;
    public final EObject ruleUnionExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_RightShift_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalNuSMV.g:3820:2: ( ( ( ( ruleRightShift )=>this_RightShift_0= ruleRightShift ) ( () ( (lv_op_2_0= 'union' ) ) ( ( ruleLeftShift )=> (lv_right_3_0= ruleRightShift ) ) )* ) )
            // InternalNuSMV.g:3821:2: ( ( ( ruleRightShift )=>this_RightShift_0= ruleRightShift ) ( () ( (lv_op_2_0= 'union' ) ) ( ( ruleLeftShift )=> (lv_right_3_0= ruleRightShift ) ) )* )
            {
            // InternalNuSMV.g:3821:2: ( ( ( ruleRightShift )=>this_RightShift_0= ruleRightShift ) ( () ( (lv_op_2_0= 'union' ) ) ( ( ruleLeftShift )=> (lv_right_3_0= ruleRightShift ) ) )* )
            // InternalNuSMV.g:3822:3: ( ( ruleRightShift )=>this_RightShift_0= ruleRightShift ) ( () ( (lv_op_2_0= 'union' ) ) ( ( ruleLeftShift )=> (lv_right_3_0= ruleRightShift ) ) )*
            {
            // InternalNuSMV.g:3822:3: ( ( ruleRightShift )=>this_RightShift_0= ruleRightShift )
            // InternalNuSMV.g:3823:4: ( ruleRightShift )=>this_RightShift_0= ruleRightShift
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getUnionExpressionAccess().getRightShiftParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_39);
            this_RightShift_0=ruleRightShift();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_RightShift_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalNuSMV.g:3836:3: ( () ( (lv_op_2_0= 'union' ) ) ( ( ruleLeftShift )=> (lv_right_3_0= ruleRightShift ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==52) ) {
                    int LA51_2 = input.LA(2);

                    if ( (synpred91_InternalNuSMV()) ) {
                        alt51=1;
                    }


                }


                switch (alt51) {
            	case 1 :
            	    // InternalNuSMV.g:3837:4: () ( (lv_op_2_0= 'union' ) ) ( ( ruleLeftShift )=> (lv_right_3_0= ruleRightShift ) )
            	    {
            	    // InternalNuSMV.g:3837:4: ()
            	    // InternalNuSMV.g:3838:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getUnionExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalNuSMV.g:3847:4: ( (lv_op_2_0= 'union' ) )
            	    // InternalNuSMV.g:3848:5: (lv_op_2_0= 'union' )
            	    {
            	    // InternalNuSMV.g:3848:5: (lv_op_2_0= 'union' )
            	    // InternalNuSMV.g:3849:6: lv_op_2_0= 'union'
            	    {
            	    lv_op_2_0=(Token)match(input,52,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getUnionExpressionAccess().getOpUnionKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getUnionExpressionRule());
            	      						}
            	      						setWithLastConsumed(current, "op", lv_op_2_0, "union");
            	      					
            	    }

            	    }


            	    }

            	    // InternalNuSMV.g:3861:4: ( ( ruleLeftShift )=> (lv_right_3_0= ruleRightShift ) )
            	    // InternalNuSMV.g:3862:5: ( ruleLeftShift )=> (lv_right_3_0= ruleRightShift )
            	    {
            	    // InternalNuSMV.g:3863:5: (lv_right_3_0= ruleRightShift )
            	    // InternalNuSMV.g:3864:6: lv_right_3_0= ruleRightShift
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getUnionExpressionAccess().getRightRightShiftParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
            	    lv_right_3_0=ruleRightShift();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getUnionExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.nusmv.language.NuSMV.RightShift");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnionExpression"


    // $ANTLR start "entryRuleRightShift"
    // InternalNuSMV.g:3886:1: entryRuleRightShift returns [EObject current=null] : iv_ruleRightShift= ruleRightShift EOF ;
    public final EObject entryRuleRightShift() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightShift = null;


        try {
            // InternalNuSMV.g:3886:51: (iv_ruleRightShift= ruleRightShift EOF )
            // InternalNuSMV.g:3887:2: iv_ruleRightShift= ruleRightShift EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRightShiftRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRightShift=ruleRightShift();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRightShift; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRightShift"


    // $ANTLR start "ruleRightShift"
    // InternalNuSMV.g:3893:1: ruleRightShift returns [EObject current=null] : ( ( ( ruleLeftShift )=>this_LeftShift_0= ruleLeftShift ) ( () ( (lv_op_2_0= '>>' ) ) ( ( ruleMinus )=> (lv_right_3_0= ruleLeftShift ) ) )* ) ;
    public final EObject ruleRightShift() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_LeftShift_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalNuSMV.g:3899:2: ( ( ( ( ruleLeftShift )=>this_LeftShift_0= ruleLeftShift ) ( () ( (lv_op_2_0= '>>' ) ) ( ( ruleMinus )=> (lv_right_3_0= ruleLeftShift ) ) )* ) )
            // InternalNuSMV.g:3900:2: ( ( ( ruleLeftShift )=>this_LeftShift_0= ruleLeftShift ) ( () ( (lv_op_2_0= '>>' ) ) ( ( ruleMinus )=> (lv_right_3_0= ruleLeftShift ) ) )* )
            {
            // InternalNuSMV.g:3900:2: ( ( ( ruleLeftShift )=>this_LeftShift_0= ruleLeftShift ) ( () ( (lv_op_2_0= '>>' ) ) ( ( ruleMinus )=> (lv_right_3_0= ruleLeftShift ) ) )* )
            // InternalNuSMV.g:3901:3: ( ( ruleLeftShift )=>this_LeftShift_0= ruleLeftShift ) ( () ( (lv_op_2_0= '>>' ) ) ( ( ruleMinus )=> (lv_right_3_0= ruleLeftShift ) ) )*
            {
            // InternalNuSMV.g:3901:3: ( ( ruleLeftShift )=>this_LeftShift_0= ruleLeftShift )
            // InternalNuSMV.g:3902:4: ( ruleLeftShift )=>this_LeftShift_0= ruleLeftShift
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getRightShiftAccess().getLeftShiftParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_40);
            this_LeftShift_0=ruleLeftShift();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_LeftShift_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalNuSMV.g:3915:3: ( () ( (lv_op_2_0= '>>' ) ) ( ( ruleMinus )=> (lv_right_3_0= ruleLeftShift ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==53) ) {
                    int LA52_2 = input.LA(2);

                    if ( (synpred94_InternalNuSMV()) ) {
                        alt52=1;
                    }


                }


                switch (alt52) {
            	case 1 :
            	    // InternalNuSMV.g:3916:4: () ( (lv_op_2_0= '>>' ) ) ( ( ruleMinus )=> (lv_right_3_0= ruleLeftShift ) )
            	    {
            	    // InternalNuSMV.g:3916:4: ()
            	    // InternalNuSMV.g:3917:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getRightShiftAccess().getBinaryExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalNuSMV.g:3926:4: ( (lv_op_2_0= '>>' ) )
            	    // InternalNuSMV.g:3927:5: (lv_op_2_0= '>>' )
            	    {
            	    // InternalNuSMV.g:3927:5: (lv_op_2_0= '>>' )
            	    // InternalNuSMV.g:3928:6: lv_op_2_0= '>>'
            	    {
            	    lv_op_2_0=(Token)match(input,53,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getRightShiftAccess().getOpGreaterThanSignGreaterThanSignKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getRightShiftRule());
            	      						}
            	      						setWithLastConsumed(current, "op", lv_op_2_0, ">>");
            	      					
            	    }

            	    }


            	    }

            	    // InternalNuSMV.g:3940:4: ( ( ruleMinus )=> (lv_right_3_0= ruleLeftShift ) )
            	    // InternalNuSMV.g:3941:5: ( ruleMinus )=> (lv_right_3_0= ruleLeftShift )
            	    {
            	    // InternalNuSMV.g:3942:5: (lv_right_3_0= ruleLeftShift )
            	    // InternalNuSMV.g:3943:6: lv_right_3_0= ruleLeftShift
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getRightShiftAccess().getRightLeftShiftParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_40);
            	    lv_right_3_0=ruleLeftShift();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getRightShiftRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.nusmv.language.NuSMV.LeftShift");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRightShift"


    // $ANTLR start "entryRuleLeftShift"
    // InternalNuSMV.g:3965:1: entryRuleLeftShift returns [EObject current=null] : iv_ruleLeftShift= ruleLeftShift EOF ;
    public final EObject entryRuleLeftShift() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftShift = null;


        try {
            // InternalNuSMV.g:3965:50: (iv_ruleLeftShift= ruleLeftShift EOF )
            // InternalNuSMV.g:3966:2: iv_ruleLeftShift= ruleLeftShift EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLeftShiftRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLeftShift=ruleLeftShift();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLeftShift; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeftShift"


    // $ANTLR start "ruleLeftShift"
    // InternalNuSMV.g:3972:1: ruleLeftShift returns [EObject current=null] : ( ( ( ruleMinus )=>this_Minus_0= ruleMinus ) ( () ( (lv_op_2_0= '<<' ) ) ( ( rulePlus )=> (lv_right_3_0= ruleMinus ) ) )* ) ;
    public final EObject ruleLeftShift() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Minus_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalNuSMV.g:3978:2: ( ( ( ( ruleMinus )=>this_Minus_0= ruleMinus ) ( () ( (lv_op_2_0= '<<' ) ) ( ( rulePlus )=> (lv_right_3_0= ruleMinus ) ) )* ) )
            // InternalNuSMV.g:3979:2: ( ( ( ruleMinus )=>this_Minus_0= ruleMinus ) ( () ( (lv_op_2_0= '<<' ) ) ( ( rulePlus )=> (lv_right_3_0= ruleMinus ) ) )* )
            {
            // InternalNuSMV.g:3979:2: ( ( ( ruleMinus )=>this_Minus_0= ruleMinus ) ( () ( (lv_op_2_0= '<<' ) ) ( ( rulePlus )=> (lv_right_3_0= ruleMinus ) ) )* )
            // InternalNuSMV.g:3980:3: ( ( ruleMinus )=>this_Minus_0= ruleMinus ) ( () ( (lv_op_2_0= '<<' ) ) ( ( rulePlus )=> (lv_right_3_0= ruleMinus ) ) )*
            {
            // InternalNuSMV.g:3980:3: ( ( ruleMinus )=>this_Minus_0= ruleMinus )
            // InternalNuSMV.g:3981:4: ( ruleMinus )=>this_Minus_0= ruleMinus
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getLeftShiftAccess().getMinusParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_41);
            this_Minus_0=ruleMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_Minus_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalNuSMV.g:3994:3: ( () ( (lv_op_2_0= '<<' ) ) ( ( rulePlus )=> (lv_right_3_0= ruleMinus ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==54) ) {
                    int LA53_2 = input.LA(2);

                    if ( (synpred97_InternalNuSMV()) ) {
                        alt53=1;
                    }


                }


                switch (alt53) {
            	case 1 :
            	    // InternalNuSMV.g:3995:4: () ( (lv_op_2_0= '<<' ) ) ( ( rulePlus )=> (lv_right_3_0= ruleMinus ) )
            	    {
            	    // InternalNuSMV.g:3995:4: ()
            	    // InternalNuSMV.g:3996:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getLeftShiftAccess().getBinaryExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalNuSMV.g:4005:4: ( (lv_op_2_0= '<<' ) )
            	    // InternalNuSMV.g:4006:5: (lv_op_2_0= '<<' )
            	    {
            	    // InternalNuSMV.g:4006:5: (lv_op_2_0= '<<' )
            	    // InternalNuSMV.g:4007:6: lv_op_2_0= '<<'
            	    {
            	    lv_op_2_0=(Token)match(input,54,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getLeftShiftAccess().getOpLessThanSignLessThanSignKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getLeftShiftRule());
            	      						}
            	      						setWithLastConsumed(current, "op", lv_op_2_0, "<<");
            	      					
            	    }

            	    }


            	    }

            	    // InternalNuSMV.g:4019:4: ( ( rulePlus )=> (lv_right_3_0= ruleMinus ) )
            	    // InternalNuSMV.g:4020:5: ( rulePlus )=> (lv_right_3_0= ruleMinus )
            	    {
            	    // InternalNuSMV.g:4021:5: (lv_right_3_0= ruleMinus )
            	    // InternalNuSMV.g:4022:6: lv_right_3_0= ruleMinus
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLeftShiftAccess().getRightMinusParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_41);
            	    lv_right_3_0=ruleMinus();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLeftShiftRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.nusmv.language.NuSMV.Minus");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLeftShift"


    // $ANTLR start "entryRuleMinus"
    // InternalNuSMV.g:4044:1: entryRuleMinus returns [EObject current=null] : iv_ruleMinus= ruleMinus EOF ;
    public final EObject entryRuleMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinus = null;


        try {
            // InternalNuSMV.g:4044:46: (iv_ruleMinus= ruleMinus EOF )
            // InternalNuSMV.g:4045:2: iv_ruleMinus= ruleMinus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMinus=ruleMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinus; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMinus"


    // $ANTLR start "ruleMinus"
    // InternalNuSMV.g:4051:1: ruleMinus returns [EObject current=null] : ( ( ( rulePlus )=>this_Plus_0= rulePlus ) ( () ( (lv_op_2_0= '-' ) ) ( ( ruleMult )=> (lv_right_3_0= rulePlus ) ) )* ) ;
    public final EObject ruleMinus() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Plus_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalNuSMV.g:4057:2: ( ( ( ( rulePlus )=>this_Plus_0= rulePlus ) ( () ( (lv_op_2_0= '-' ) ) ( ( ruleMult )=> (lv_right_3_0= rulePlus ) ) )* ) )
            // InternalNuSMV.g:4058:2: ( ( ( rulePlus )=>this_Plus_0= rulePlus ) ( () ( (lv_op_2_0= '-' ) ) ( ( ruleMult )=> (lv_right_3_0= rulePlus ) ) )* )
            {
            // InternalNuSMV.g:4058:2: ( ( ( rulePlus )=>this_Plus_0= rulePlus ) ( () ( (lv_op_2_0= '-' ) ) ( ( ruleMult )=> (lv_right_3_0= rulePlus ) ) )* )
            // InternalNuSMV.g:4059:3: ( ( rulePlus )=>this_Plus_0= rulePlus ) ( () ( (lv_op_2_0= '-' ) ) ( ( ruleMult )=> (lv_right_3_0= rulePlus ) ) )*
            {
            // InternalNuSMV.g:4059:3: ( ( rulePlus )=>this_Plus_0= rulePlus )
            // InternalNuSMV.g:4060:4: ( rulePlus )=>this_Plus_0= rulePlus
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getMinusAccess().getPlusParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_42);
            this_Plus_0=rulePlus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_Plus_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalNuSMV.g:4073:3: ( () ( (lv_op_2_0= '-' ) ) ( ( ruleMult )=> (lv_right_3_0= rulePlus ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==55) ) {
                    int LA54_2 = input.LA(2);

                    if ( (synpred100_InternalNuSMV()) ) {
                        alt54=1;
                    }


                }


                switch (alt54) {
            	case 1 :
            	    // InternalNuSMV.g:4074:4: () ( (lv_op_2_0= '-' ) ) ( ( ruleMult )=> (lv_right_3_0= rulePlus ) )
            	    {
            	    // InternalNuSMV.g:4074:4: ()
            	    // InternalNuSMV.g:4075:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getMinusAccess().getBinaryExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalNuSMV.g:4084:4: ( (lv_op_2_0= '-' ) )
            	    // InternalNuSMV.g:4085:5: (lv_op_2_0= '-' )
            	    {
            	    // InternalNuSMV.g:4085:5: (lv_op_2_0= '-' )
            	    // InternalNuSMV.g:4086:6: lv_op_2_0= '-'
            	    {
            	    lv_op_2_0=(Token)match(input,55,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getMinusAccess().getOpHyphenMinusKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getMinusRule());
            	      						}
            	      						setWithLastConsumed(current, "op", lv_op_2_0, "-");
            	      					
            	    }

            	    }


            	    }

            	    // InternalNuSMV.g:4098:4: ( ( ruleMult )=> (lv_right_3_0= rulePlus ) )
            	    // InternalNuSMV.g:4099:5: ( ruleMult )=> (lv_right_3_0= rulePlus )
            	    {
            	    // InternalNuSMV.g:4100:5: (lv_right_3_0= rulePlus )
            	    // InternalNuSMV.g:4101:6: lv_right_3_0= rulePlus
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMinusAccess().getRightPlusParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_42);
            	    lv_right_3_0=rulePlus();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMinusRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.nusmv.language.NuSMV.Plus");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinus"


    // $ANTLR start "entryRulePlus"
    // InternalNuSMV.g:4123:1: entryRulePlus returns [EObject current=null] : iv_rulePlus= rulePlus EOF ;
    public final EObject entryRulePlus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlus = null;


        try {
            // InternalNuSMV.g:4123:45: (iv_rulePlus= rulePlus EOF )
            // InternalNuSMV.g:4124:2: iv_rulePlus= rulePlus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePlus=rulePlus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlus; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlus"


    // $ANTLR start "rulePlus"
    // InternalNuSMV.g:4130:1: rulePlus returns [EObject current=null] : ( ( ( ruleMult )=>this_Mult_0= ruleMult ) ( () ( (lv_op_2_0= '+' ) ) ( ( ruleMod )=> (lv_right_3_0= ruleMult ) ) )* ) ;
    public final EObject rulePlus() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Mult_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalNuSMV.g:4136:2: ( ( ( ( ruleMult )=>this_Mult_0= ruleMult ) ( () ( (lv_op_2_0= '+' ) ) ( ( ruleMod )=> (lv_right_3_0= ruleMult ) ) )* ) )
            // InternalNuSMV.g:4137:2: ( ( ( ruleMult )=>this_Mult_0= ruleMult ) ( () ( (lv_op_2_0= '+' ) ) ( ( ruleMod )=> (lv_right_3_0= ruleMult ) ) )* )
            {
            // InternalNuSMV.g:4137:2: ( ( ( ruleMult )=>this_Mult_0= ruleMult ) ( () ( (lv_op_2_0= '+' ) ) ( ( ruleMod )=> (lv_right_3_0= ruleMult ) ) )* )
            // InternalNuSMV.g:4138:3: ( ( ruleMult )=>this_Mult_0= ruleMult ) ( () ( (lv_op_2_0= '+' ) ) ( ( ruleMod )=> (lv_right_3_0= ruleMult ) ) )*
            {
            // InternalNuSMV.g:4138:3: ( ( ruleMult )=>this_Mult_0= ruleMult )
            // InternalNuSMV.g:4139:4: ( ruleMult )=>this_Mult_0= ruleMult
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getPlusAccess().getMultParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_43);
            this_Mult_0=ruleMult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_Mult_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalNuSMV.g:4152:3: ( () ( (lv_op_2_0= '+' ) ) ( ( ruleMod )=> (lv_right_3_0= ruleMult ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==56) ) {
                    int LA55_2 = input.LA(2);

                    if ( (synpred103_InternalNuSMV()) ) {
                        alt55=1;
                    }


                }


                switch (alt55) {
            	case 1 :
            	    // InternalNuSMV.g:4153:4: () ( (lv_op_2_0= '+' ) ) ( ( ruleMod )=> (lv_right_3_0= ruleMult ) )
            	    {
            	    // InternalNuSMV.g:4153:4: ()
            	    // InternalNuSMV.g:4154:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getPlusAccess().getBinaryExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalNuSMV.g:4163:4: ( (lv_op_2_0= '+' ) )
            	    // InternalNuSMV.g:4164:5: (lv_op_2_0= '+' )
            	    {
            	    // InternalNuSMV.g:4164:5: (lv_op_2_0= '+' )
            	    // InternalNuSMV.g:4165:6: lv_op_2_0= '+'
            	    {
            	    lv_op_2_0=(Token)match(input,56,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getPlusAccess().getOpPlusSignKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getPlusRule());
            	      						}
            	      						setWithLastConsumed(current, "op", lv_op_2_0, "+");
            	      					
            	    }

            	    }


            	    }

            	    // InternalNuSMV.g:4177:4: ( ( ruleMod )=> (lv_right_3_0= ruleMult ) )
            	    // InternalNuSMV.g:4178:5: ( ruleMod )=> (lv_right_3_0= ruleMult )
            	    {
            	    // InternalNuSMV.g:4179:5: (lv_right_3_0= ruleMult )
            	    // InternalNuSMV.g:4180:6: lv_right_3_0= ruleMult
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPlusAccess().getRightMultParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_43);
            	    lv_right_3_0=ruleMult();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPlusRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.nusmv.language.NuSMV.Mult");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlus"


    // $ANTLR start "entryRuleMult"
    // InternalNuSMV.g:4202:1: entryRuleMult returns [EObject current=null] : iv_ruleMult= ruleMult EOF ;
    public final EObject entryRuleMult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMult = null;


        try {
            // InternalNuSMV.g:4202:45: (iv_ruleMult= ruleMult EOF )
            // InternalNuSMV.g:4203:2: iv_ruleMult= ruleMult EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMult=ruleMult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMult; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMult"


    // $ANTLR start "ruleMult"
    // InternalNuSMV.g:4209:1: ruleMult returns [EObject current=null] : ( ( ( ruleMod )=>this_Mod_0= ruleMod ) ( () ( (lv_op_2_0= '*' ) ) ( ( ruleWordConcatenation )=> (lv_right_3_0= ruleMod ) ) )* ) ;
    public final EObject ruleMult() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Mod_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalNuSMV.g:4215:2: ( ( ( ( ruleMod )=>this_Mod_0= ruleMod ) ( () ( (lv_op_2_0= '*' ) ) ( ( ruleWordConcatenation )=> (lv_right_3_0= ruleMod ) ) )* ) )
            // InternalNuSMV.g:4216:2: ( ( ( ruleMod )=>this_Mod_0= ruleMod ) ( () ( (lv_op_2_0= '*' ) ) ( ( ruleWordConcatenation )=> (lv_right_3_0= ruleMod ) ) )* )
            {
            // InternalNuSMV.g:4216:2: ( ( ( ruleMod )=>this_Mod_0= ruleMod ) ( () ( (lv_op_2_0= '*' ) ) ( ( ruleWordConcatenation )=> (lv_right_3_0= ruleMod ) ) )* )
            // InternalNuSMV.g:4217:3: ( ( ruleMod )=>this_Mod_0= ruleMod ) ( () ( (lv_op_2_0= '*' ) ) ( ( ruleWordConcatenation )=> (lv_right_3_0= ruleMod ) ) )*
            {
            // InternalNuSMV.g:4217:3: ( ( ruleMod )=>this_Mod_0= ruleMod )
            // InternalNuSMV.g:4218:4: ( ruleMod )=>this_Mod_0= ruleMod
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getMultAccess().getModParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_44);
            this_Mod_0=ruleMod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_Mod_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalNuSMV.g:4231:3: ( () ( (lv_op_2_0= '*' ) ) ( ( ruleWordConcatenation )=> (lv_right_3_0= ruleMod ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==57) ) {
                    int LA56_2 = input.LA(2);

                    if ( (synpred106_InternalNuSMV()) ) {
                        alt56=1;
                    }


                }


                switch (alt56) {
            	case 1 :
            	    // InternalNuSMV.g:4232:4: () ( (lv_op_2_0= '*' ) ) ( ( ruleWordConcatenation )=> (lv_right_3_0= ruleMod ) )
            	    {
            	    // InternalNuSMV.g:4232:4: ()
            	    // InternalNuSMV.g:4233:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getMultAccess().getBinaryExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalNuSMV.g:4242:4: ( (lv_op_2_0= '*' ) )
            	    // InternalNuSMV.g:4243:5: (lv_op_2_0= '*' )
            	    {
            	    // InternalNuSMV.g:4243:5: (lv_op_2_0= '*' )
            	    // InternalNuSMV.g:4244:6: lv_op_2_0= '*'
            	    {
            	    lv_op_2_0=(Token)match(input,57,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getMultAccess().getOpAsteriskKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getMultRule());
            	      						}
            	      						setWithLastConsumed(current, "op", lv_op_2_0, "*");
            	      					
            	    }

            	    }


            	    }

            	    // InternalNuSMV.g:4256:4: ( ( ruleWordConcatenation )=> (lv_right_3_0= ruleMod ) )
            	    // InternalNuSMV.g:4257:5: ( ruleWordConcatenation )=> (lv_right_3_0= ruleMod )
            	    {
            	    // InternalNuSMV.g:4258:5: (lv_right_3_0= ruleMod )
            	    // InternalNuSMV.g:4259:6: lv_right_3_0= ruleMod
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultAccess().getRightModParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_44);
            	    lv_right_3_0=ruleMod();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMultRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.nusmv.language.NuSMV.Mod");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMult"


    // $ANTLR start "entryRuleMod"
    // InternalNuSMV.g:4281:1: entryRuleMod returns [EObject current=null] : iv_ruleMod= ruleMod EOF ;
    public final EObject entryRuleMod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMod = null;


        try {
            // InternalNuSMV.g:4281:44: (iv_ruleMod= ruleMod EOF )
            // InternalNuSMV.g:4282:2: iv_ruleMod= ruleMod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMod=ruleMod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMod; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMod"


    // $ANTLR start "ruleMod"
    // InternalNuSMV.g:4288:1: ruleMod returns [EObject current=null] : ( ( ( ruleWordConcatenation )=>this_WordConcatenation_0= ruleWordConcatenation ) ( () ( (lv_op_2_0= 'mod' ) ) ( ( ruleDiv )=> (lv_right_3_0= ruleWordConcatenation ) ) )* ) ;
    public final EObject ruleMod() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_WordConcatenation_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalNuSMV.g:4294:2: ( ( ( ( ruleWordConcatenation )=>this_WordConcatenation_0= ruleWordConcatenation ) ( () ( (lv_op_2_0= 'mod' ) ) ( ( ruleDiv )=> (lv_right_3_0= ruleWordConcatenation ) ) )* ) )
            // InternalNuSMV.g:4295:2: ( ( ( ruleWordConcatenation )=>this_WordConcatenation_0= ruleWordConcatenation ) ( () ( (lv_op_2_0= 'mod' ) ) ( ( ruleDiv )=> (lv_right_3_0= ruleWordConcatenation ) ) )* )
            {
            // InternalNuSMV.g:4295:2: ( ( ( ruleWordConcatenation )=>this_WordConcatenation_0= ruleWordConcatenation ) ( () ( (lv_op_2_0= 'mod' ) ) ( ( ruleDiv )=> (lv_right_3_0= ruleWordConcatenation ) ) )* )
            // InternalNuSMV.g:4296:3: ( ( ruleWordConcatenation )=>this_WordConcatenation_0= ruleWordConcatenation ) ( () ( (lv_op_2_0= 'mod' ) ) ( ( ruleDiv )=> (lv_right_3_0= ruleWordConcatenation ) ) )*
            {
            // InternalNuSMV.g:4296:3: ( ( ruleWordConcatenation )=>this_WordConcatenation_0= ruleWordConcatenation )
            // InternalNuSMV.g:4297:4: ( ruleWordConcatenation )=>this_WordConcatenation_0= ruleWordConcatenation
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getModAccess().getWordConcatenationParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_45);
            this_WordConcatenation_0=ruleWordConcatenation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_WordConcatenation_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalNuSMV.g:4310:3: ( () ( (lv_op_2_0= 'mod' ) ) ( ( ruleDiv )=> (lv_right_3_0= ruleWordConcatenation ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==58) ) {
                    int LA57_2 = input.LA(2);

                    if ( (synpred109_InternalNuSMV()) ) {
                        alt57=1;
                    }


                }


                switch (alt57) {
            	case 1 :
            	    // InternalNuSMV.g:4311:4: () ( (lv_op_2_0= 'mod' ) ) ( ( ruleDiv )=> (lv_right_3_0= ruleWordConcatenation ) )
            	    {
            	    // InternalNuSMV.g:4311:4: ()
            	    // InternalNuSMV.g:4312:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getModAccess().getBinaryExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalNuSMV.g:4321:4: ( (lv_op_2_0= 'mod' ) )
            	    // InternalNuSMV.g:4322:5: (lv_op_2_0= 'mod' )
            	    {
            	    // InternalNuSMV.g:4322:5: (lv_op_2_0= 'mod' )
            	    // InternalNuSMV.g:4323:6: lv_op_2_0= 'mod'
            	    {
            	    lv_op_2_0=(Token)match(input,58,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getModAccess().getOpModKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getModRule());
            	      						}
            	      						setWithLastConsumed(current, "op", lv_op_2_0, "mod");
            	      					
            	    }

            	    }


            	    }

            	    // InternalNuSMV.g:4335:4: ( ( ruleDiv )=> (lv_right_3_0= ruleWordConcatenation ) )
            	    // InternalNuSMV.g:4336:5: ( ruleDiv )=> (lv_right_3_0= ruleWordConcatenation )
            	    {
            	    // InternalNuSMV.g:4337:5: (lv_right_3_0= ruleWordConcatenation )
            	    // InternalNuSMV.g:4338:6: lv_right_3_0= ruleWordConcatenation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getModAccess().getRightWordConcatenationParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_45);
            	    lv_right_3_0=ruleWordConcatenation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getModRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.nusmv.language.NuSMV.WordConcatenation");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMod"


    // $ANTLR start "entryRuleWordConcatenation"
    // InternalNuSMV.g:4360:1: entryRuleWordConcatenation returns [EObject current=null] : iv_ruleWordConcatenation= ruleWordConcatenation EOF ;
    public final EObject entryRuleWordConcatenation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWordConcatenation = null;


        try {
            // InternalNuSMV.g:4360:58: (iv_ruleWordConcatenation= ruleWordConcatenation EOF )
            // InternalNuSMV.g:4361:2: iv_ruleWordConcatenation= ruleWordConcatenation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWordConcatenationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWordConcatenation=ruleWordConcatenation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWordConcatenation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWordConcatenation"


    // $ANTLR start "ruleWordConcatenation"
    // InternalNuSMV.g:4367:1: ruleWordConcatenation returns [EObject current=null] : ( ( ( ruleDiv )=>this_Div_0= ruleDiv ) ( () ( (lv_op_2_0= '::' ) ) ( ( ruleNotOrTerminalSimpleExpression )=> (lv_right_3_0= ruleDiv ) ) )* ) ;
    public final EObject ruleWordConcatenation() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Div_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalNuSMV.g:4373:2: ( ( ( ( ruleDiv )=>this_Div_0= ruleDiv ) ( () ( (lv_op_2_0= '::' ) ) ( ( ruleNotOrTerminalSimpleExpression )=> (lv_right_3_0= ruleDiv ) ) )* ) )
            // InternalNuSMV.g:4374:2: ( ( ( ruleDiv )=>this_Div_0= ruleDiv ) ( () ( (lv_op_2_0= '::' ) ) ( ( ruleNotOrTerminalSimpleExpression )=> (lv_right_3_0= ruleDiv ) ) )* )
            {
            // InternalNuSMV.g:4374:2: ( ( ( ruleDiv )=>this_Div_0= ruleDiv ) ( () ( (lv_op_2_0= '::' ) ) ( ( ruleNotOrTerminalSimpleExpression )=> (lv_right_3_0= ruleDiv ) ) )* )
            // InternalNuSMV.g:4375:3: ( ( ruleDiv )=>this_Div_0= ruleDiv ) ( () ( (lv_op_2_0= '::' ) ) ( ( ruleNotOrTerminalSimpleExpression )=> (lv_right_3_0= ruleDiv ) ) )*
            {
            // InternalNuSMV.g:4375:3: ( ( ruleDiv )=>this_Div_0= ruleDiv )
            // InternalNuSMV.g:4376:4: ( ruleDiv )=>this_Div_0= ruleDiv
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getWordConcatenationAccess().getDivParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_46);
            this_Div_0=ruleDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_Div_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalNuSMV.g:4389:3: ( () ( (lv_op_2_0= '::' ) ) ( ( ruleNotOrTerminalSimpleExpression )=> (lv_right_3_0= ruleDiv ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==59) ) {
                    int LA58_2 = input.LA(2);

                    if ( (synpred112_InternalNuSMV()) ) {
                        alt58=1;
                    }


                }


                switch (alt58) {
            	case 1 :
            	    // InternalNuSMV.g:4390:4: () ( (lv_op_2_0= '::' ) ) ( ( ruleNotOrTerminalSimpleExpression )=> (lv_right_3_0= ruleDiv ) )
            	    {
            	    // InternalNuSMV.g:4390:4: ()
            	    // InternalNuSMV.g:4391:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getWordConcatenationAccess().getBinaryExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalNuSMV.g:4400:4: ( (lv_op_2_0= '::' ) )
            	    // InternalNuSMV.g:4401:5: (lv_op_2_0= '::' )
            	    {
            	    // InternalNuSMV.g:4401:5: (lv_op_2_0= '::' )
            	    // InternalNuSMV.g:4402:6: lv_op_2_0= '::'
            	    {
            	    lv_op_2_0=(Token)match(input,59,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getWordConcatenationAccess().getOpColonColonKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getWordConcatenationRule());
            	      						}
            	      						setWithLastConsumed(current, "op", lv_op_2_0, "::");
            	      					
            	    }

            	    }


            	    }

            	    // InternalNuSMV.g:4414:4: ( ( ruleNotOrTerminalSimpleExpression )=> (lv_right_3_0= ruleDiv ) )
            	    // InternalNuSMV.g:4415:5: ( ruleNotOrTerminalSimpleExpression )=> (lv_right_3_0= ruleDiv )
            	    {
            	    // InternalNuSMV.g:4416:5: (lv_right_3_0= ruleDiv )
            	    // InternalNuSMV.g:4417:6: lv_right_3_0= ruleDiv
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getWordConcatenationAccess().getRightDivParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_46);
            	    lv_right_3_0=ruleDiv();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getWordConcatenationRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.nusmv.language.NuSMV.Div");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWordConcatenation"


    // $ANTLR start "entryRuleDiv"
    // InternalNuSMV.g:4439:1: entryRuleDiv returns [EObject current=null] : iv_ruleDiv= ruleDiv EOF ;
    public final EObject entryRuleDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiv = null;


        try {
            // InternalNuSMV.g:4439:44: (iv_ruleDiv= ruleDiv EOF )
            // InternalNuSMV.g:4440:2: iv_ruleDiv= ruleDiv EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDiv=ruleDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDiv; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiv"


    // $ANTLR start "ruleDiv"
    // InternalNuSMV.g:4446:1: ruleDiv returns [EObject current=null] : ( ( ( ruleNotOrTerminalSimpleExpression )=>this_NotOrTerminalSimpleExpression_0= ruleNotOrTerminalSimpleExpression ) ( () ( (lv_op_2_0= '/' ) ) ( (lv_right_3_0= ruleNotOrTerminalSimpleExpression ) ) )* ) ;
    public final EObject ruleDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_NotOrTerminalSimpleExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalNuSMV.g:4452:2: ( ( ( ( ruleNotOrTerminalSimpleExpression )=>this_NotOrTerminalSimpleExpression_0= ruleNotOrTerminalSimpleExpression ) ( () ( (lv_op_2_0= '/' ) ) ( (lv_right_3_0= ruleNotOrTerminalSimpleExpression ) ) )* ) )
            // InternalNuSMV.g:4453:2: ( ( ( ruleNotOrTerminalSimpleExpression )=>this_NotOrTerminalSimpleExpression_0= ruleNotOrTerminalSimpleExpression ) ( () ( (lv_op_2_0= '/' ) ) ( (lv_right_3_0= ruleNotOrTerminalSimpleExpression ) ) )* )
            {
            // InternalNuSMV.g:4453:2: ( ( ( ruleNotOrTerminalSimpleExpression )=>this_NotOrTerminalSimpleExpression_0= ruleNotOrTerminalSimpleExpression ) ( () ( (lv_op_2_0= '/' ) ) ( (lv_right_3_0= ruleNotOrTerminalSimpleExpression ) ) )* )
            // InternalNuSMV.g:4454:3: ( ( ruleNotOrTerminalSimpleExpression )=>this_NotOrTerminalSimpleExpression_0= ruleNotOrTerminalSimpleExpression ) ( () ( (lv_op_2_0= '/' ) ) ( (lv_right_3_0= ruleNotOrTerminalSimpleExpression ) ) )*
            {
            // InternalNuSMV.g:4454:3: ( ( ruleNotOrTerminalSimpleExpression )=>this_NotOrTerminalSimpleExpression_0= ruleNotOrTerminalSimpleExpression )
            // InternalNuSMV.g:4455:4: ( ruleNotOrTerminalSimpleExpression )=>this_NotOrTerminalSimpleExpression_0= ruleNotOrTerminalSimpleExpression
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getDivAccess().getNotOrTerminalSimpleExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_47);
            this_NotOrTerminalSimpleExpression_0=ruleNotOrTerminalSimpleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_NotOrTerminalSimpleExpression_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalNuSMV.g:4468:3: ( () ( (lv_op_2_0= '/' ) ) ( (lv_right_3_0= ruleNotOrTerminalSimpleExpression ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==60) ) {
                    int LA59_2 = input.LA(2);

                    if ( (synpred114_InternalNuSMV()) ) {
                        alt59=1;
                    }


                }


                switch (alt59) {
            	case 1 :
            	    // InternalNuSMV.g:4469:4: () ( (lv_op_2_0= '/' ) ) ( (lv_right_3_0= ruleNotOrTerminalSimpleExpression ) )
            	    {
            	    // InternalNuSMV.g:4469:4: ()
            	    // InternalNuSMV.g:4470:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getDivAccess().getBinaryExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalNuSMV.g:4479:4: ( (lv_op_2_0= '/' ) )
            	    // InternalNuSMV.g:4480:5: (lv_op_2_0= '/' )
            	    {
            	    // InternalNuSMV.g:4480:5: (lv_op_2_0= '/' )
            	    // InternalNuSMV.g:4481:6: lv_op_2_0= '/'
            	    {
            	    lv_op_2_0=(Token)match(input,60,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getDivAccess().getOpSolidusKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDivRule());
            	      						}
            	      						setWithLastConsumed(current, "op", lv_op_2_0, "/");
            	      					
            	    }

            	    }


            	    }

            	    // InternalNuSMV.g:4493:4: ( (lv_right_3_0= ruleNotOrTerminalSimpleExpression ) )
            	    // InternalNuSMV.g:4494:5: (lv_right_3_0= ruleNotOrTerminalSimpleExpression )
            	    {
            	    // InternalNuSMV.g:4494:5: (lv_right_3_0= ruleNotOrTerminalSimpleExpression )
            	    // InternalNuSMV.g:4495:6: lv_right_3_0= ruleNotOrTerminalSimpleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDivAccess().getRightNotOrTerminalSimpleExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_47);
            	    lv_right_3_0=ruleNotOrTerminalSimpleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDivRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.nusmv.language.NuSMV.NotOrTerminalSimpleExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiv"


    // $ANTLR start "entryRuleNotOrTerminalSimpleExpression"
    // InternalNuSMV.g:4517:1: entryRuleNotOrTerminalSimpleExpression returns [EObject current=null] : iv_ruleNotOrTerminalSimpleExpression= ruleNotOrTerminalSimpleExpression EOF ;
    public final EObject entryRuleNotOrTerminalSimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrTerminalSimpleExpression = null;


        try {
            // InternalNuSMV.g:4517:70: (iv_ruleNotOrTerminalSimpleExpression= ruleNotOrTerminalSimpleExpression EOF )
            // InternalNuSMV.g:4518:2: iv_ruleNotOrTerminalSimpleExpression= ruleNotOrTerminalSimpleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOrTerminalSimpleExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNotOrTerminalSimpleExpression=ruleNotOrTerminalSimpleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOrTerminalSimpleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotOrTerminalSimpleExpression"


    // $ANTLR start "ruleNotOrTerminalSimpleExpression"
    // InternalNuSMV.g:4524:1: ruleNotOrTerminalSimpleExpression returns [EObject current=null] : ( ( () otherlv_1= '!' ( (lv_exp_2_0= ruleTerminalSimpleExpression ) ) ) | this_TerminalSimpleExpression_3= ruleTerminalSimpleExpression ) ;
    public final EObject ruleNotOrTerminalSimpleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;

        EObject this_TerminalSimpleExpression_3 = null;



        	enterRule();

        try {
            // InternalNuSMV.g:4530:2: ( ( ( () otherlv_1= '!' ( (lv_exp_2_0= ruleTerminalSimpleExpression ) ) ) | this_TerminalSimpleExpression_3= ruleTerminalSimpleExpression ) )
            // InternalNuSMV.g:4531:2: ( ( () otherlv_1= '!' ( (lv_exp_2_0= ruleTerminalSimpleExpression ) ) ) | this_TerminalSimpleExpression_3= ruleTerminalSimpleExpression )
            {
            // InternalNuSMV.g:4531:2: ( ( () otherlv_1= '!' ( (lv_exp_2_0= ruleTerminalSimpleExpression ) ) ) | this_TerminalSimpleExpression_3= ruleTerminalSimpleExpression )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==61) ) {
                alt60=1;
            }
            else if ( ((LA60_0>=RULE_ID && LA60_0<=RULE_INT)||LA60_0==10||LA60_0==23||LA60_0==43||(LA60_0>=49 && LA60_0<=50)||(LA60_0>=55 && LA60_0<=56)||(LA60_0>=62 && LA60_0<=74)||(LA60_0>=76 && LA60_0<=82)) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalNuSMV.g:4532:3: ( () otherlv_1= '!' ( (lv_exp_2_0= ruleTerminalSimpleExpression ) ) )
                    {
                    // InternalNuSMV.g:4532:3: ( () otherlv_1= '!' ( (lv_exp_2_0= ruleTerminalSimpleExpression ) ) )
                    // InternalNuSMV.g:4533:4: () otherlv_1= '!' ( (lv_exp_2_0= ruleTerminalSimpleExpression ) )
                    {
                    // InternalNuSMV.g:4533:4: ()
                    // InternalNuSMV.g:4534:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNotOrTerminalSimpleExpressionAccess().getNotAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,61,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getNotOrTerminalSimpleExpressionAccess().getExclamationMarkKeyword_0_1());
                      			
                    }
                    // InternalNuSMV.g:4547:4: ( (lv_exp_2_0= ruleTerminalSimpleExpression ) )
                    // InternalNuSMV.g:4548:5: (lv_exp_2_0= ruleTerminalSimpleExpression )
                    {
                    // InternalNuSMV.g:4548:5: (lv_exp_2_0= ruleTerminalSimpleExpression )
                    // InternalNuSMV.g:4549:6: lv_exp_2_0= ruleTerminalSimpleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNotOrTerminalSimpleExpressionAccess().getExpTerminalSimpleExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_exp_2_0=ruleTerminalSimpleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNotOrTerminalSimpleExpressionRule());
                      						}
                      						set(
                      							current,
                      							"exp",
                      							lv_exp_2_0,
                      							"org.xtext.nusmv.language.NuSMV.TerminalSimpleExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNuSMV.g:4568:3: this_TerminalSimpleExpression_3= ruleTerminalSimpleExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNotOrTerminalSimpleExpressionAccess().getTerminalSimpleExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TerminalSimpleExpression_3=ruleTerminalSimpleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TerminalSimpleExpression_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNotOrTerminalSimpleExpression"


    // $ANTLR start "entryRuleTerminalSimpleExpression"
    // InternalNuSMV.g:4583:1: entryRuleTerminalSimpleExpression returns [EObject current=null] : iv_ruleTerminalSimpleExpression= ruleTerminalSimpleExpression EOF ;
    public final EObject entryRuleTerminalSimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalSimpleExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:4585:2: (iv_ruleTerminalSimpleExpression= ruleTerminalSimpleExpression EOF )
            // InternalNuSMV.g:4586:2: iv_ruleTerminalSimpleExpression= ruleTerminalSimpleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminalSimpleExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTerminalSimpleExpression=ruleTerminalSimpleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerminalSimpleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleTerminalSimpleExpression"


    // $ANTLR start "ruleTerminalSimpleExpression"
    // InternalNuSMV.g:4595:1: ruleTerminalSimpleExpression returns [EObject current=null] : ( ( () ( (lv_isNext_1_0= 'next' ) )? otherlv_2= '(' ( (lv_simpleExpression_3_0= ruleSimpleExpression ) ) otherlv_4= ')' ) | ( () ( ( ( (lv_operator_6_1= '-' | lv_operator_6_2= '+' | lv_operator_6_3= 'EG' | lv_operator_6_4= 'EX' | lv_operator_6_5= 'EF' | lv_operator_6_6= 'AG' | lv_operator_6_7= 'AX' | lv_operator_6_8= 'AF' | lv_operator_6_9= 'X' | lv_operator_6_10= 'G' | lv_operator_6_11= 'F' | lv_operator_6_12= 'Y' | lv_operator_6_13= 'Z' | lv_operator_6_14= 'H' | lv_operator_6_15= 'O' ) ) ) ( (lv_simpleExpression_7_0= ruleSimpleExpression ) ) ) ) | this_CaseSimpleExpression_8= ruleCaseSimpleExpression | ( () ( (lv_value_10_0= ruleVariableID ) ) (otherlv_11= '[' ( (lv_array_12_0= ruleNUMBER ) ) otherlv_13= ']' )* ) | ( () ( (otherlv_15= RULE_ID ) ) ( (otherlv_16= '.' ( (lv_dotted_17_0= ruleTerminalSimpleExpression ) ) ) | (otherlv_18= '[' ( (lv_array_19_0= ruleNUMBER ) ) otherlv_20= ']' )* )? ) | ( () ( (otherlv_22= RULE_ID ) ) ) | ( () ( (otherlv_24= RULE_ID ) ) ) | ( () ( (lv_value_26_0= RULE_ID ) ) ) | ( () ( (lv_value_28_0= ruleNUMBER ) ) ) | ( () ( (lv_value_30_0= 'TRUE' ) ) ) | ( () ( (lv_value_32_0= 'FALSE' ) ) ) | ( () ( (lv_value_34_0= 'self' ) ) ) | ( () otherlv_36= '{' ( (lv_setElement_37_0= ruleSimpleExpression ) ) (otherlv_38= ',' ( (lv_setElement_39_0= ruleSimpleExpression ) ) )* otherlv_40= '}' ) | ( () ( (lv_value_42_0= RULE_WORD ) ) ) | ( () ( (lv_lowerBound_44_0= ruleNUMBER ) ) otherlv_45= '..' ( (lv_upperBound_46_0= ruleNUMBER ) ) ) | ( () ( ( (lv_ea_48_1= 'E' | lv_ea_48_2= 'A' ) ) ) otherlv_49= '[' ( ( ruleImpliesExpression )=> (lv_arg_50_0= ruleLTLbinExpression ) ) otherlv_51= ']' ) | ( () ( ( (lv_function_53_1= 'word1' | lv_function_53_2= 'bool' ) ) ) otherlv_54= '(' ( (lv_arg_55_0= ruleSimpleExpression ) ) otherlv_56= ')' ) | ( () otherlv_58= 'toint' otherlv_59= '(' ( (lv_arg_60_0= ruleSimpleExpression ) ) otherlv_61= ')' ) ) ;
    public final EObject ruleTerminalSimpleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNext_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_operator_6_1=null;
        Token lv_operator_6_2=null;
        Token lv_operator_6_3=null;
        Token lv_operator_6_4=null;
        Token lv_operator_6_5=null;
        Token lv_operator_6_6=null;
        Token lv_operator_6_7=null;
        Token lv_operator_6_8=null;
        Token lv_operator_6_9=null;
        Token lv_operator_6_10=null;
        Token lv_operator_6_11=null;
        Token lv_operator_6_12=null;
        Token lv_operator_6_13=null;
        Token lv_operator_6_14=null;
        Token lv_operator_6_15=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token lv_value_26_0=null;
        Token lv_value_30_0=null;
        Token lv_value_32_0=null;
        Token lv_value_34_0=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token lv_value_42_0=null;
        Token otherlv_45=null;
        Token lv_ea_48_1=null;
        Token lv_ea_48_2=null;
        Token otherlv_49=null;
        Token otherlv_51=null;
        Token lv_function_53_1=null;
        Token lv_function_53_2=null;
        Token otherlv_54=null;
        Token otherlv_56=null;
        Token otherlv_58=null;
        Token otherlv_59=null;
        Token otherlv_61=null;
        EObject lv_simpleExpression_3_0 = null;

        EObject lv_simpleExpression_7_0 = null;

        EObject this_CaseSimpleExpression_8 = null;

        AntlrDatatypeRuleToken lv_value_10_0 = null;

        AntlrDatatypeRuleToken lv_array_12_0 = null;

        EObject lv_dotted_17_0 = null;

        AntlrDatatypeRuleToken lv_array_19_0 = null;

        AntlrDatatypeRuleToken lv_value_28_0 = null;

        EObject lv_setElement_37_0 = null;

        EObject lv_setElement_39_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_44_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_46_0 = null;

        EObject lv_arg_50_0 = null;

        EObject lv_arg_55_0 = null;

        EObject lv_arg_60_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:4602:2: ( ( ( () ( (lv_isNext_1_0= 'next' ) )? otherlv_2= '(' ( (lv_simpleExpression_3_0= ruleSimpleExpression ) ) otherlv_4= ')' ) | ( () ( ( ( (lv_operator_6_1= '-' | lv_operator_6_2= '+' | lv_operator_6_3= 'EG' | lv_operator_6_4= 'EX' | lv_operator_6_5= 'EF' | lv_operator_6_6= 'AG' | lv_operator_6_7= 'AX' | lv_operator_6_8= 'AF' | lv_operator_6_9= 'X' | lv_operator_6_10= 'G' | lv_operator_6_11= 'F' | lv_operator_6_12= 'Y' | lv_operator_6_13= 'Z' | lv_operator_6_14= 'H' | lv_operator_6_15= 'O' ) ) ) ( (lv_simpleExpression_7_0= ruleSimpleExpression ) ) ) ) | this_CaseSimpleExpression_8= ruleCaseSimpleExpression | ( () ( (lv_value_10_0= ruleVariableID ) ) (otherlv_11= '[' ( (lv_array_12_0= ruleNUMBER ) ) otherlv_13= ']' )* ) | ( () ( (otherlv_15= RULE_ID ) ) ( (otherlv_16= '.' ( (lv_dotted_17_0= ruleTerminalSimpleExpression ) ) ) | (otherlv_18= '[' ( (lv_array_19_0= ruleNUMBER ) ) otherlv_20= ']' )* )? ) | ( () ( (otherlv_22= RULE_ID ) ) ) | ( () ( (otherlv_24= RULE_ID ) ) ) | ( () ( (lv_value_26_0= RULE_ID ) ) ) | ( () ( (lv_value_28_0= ruleNUMBER ) ) ) | ( () ( (lv_value_30_0= 'TRUE' ) ) ) | ( () ( (lv_value_32_0= 'FALSE' ) ) ) | ( () ( (lv_value_34_0= 'self' ) ) ) | ( () otherlv_36= '{' ( (lv_setElement_37_0= ruleSimpleExpression ) ) (otherlv_38= ',' ( (lv_setElement_39_0= ruleSimpleExpression ) ) )* otherlv_40= '}' ) | ( () ( (lv_value_42_0= RULE_WORD ) ) ) | ( () ( (lv_lowerBound_44_0= ruleNUMBER ) ) otherlv_45= '..' ( (lv_upperBound_46_0= ruleNUMBER ) ) ) | ( () ( ( (lv_ea_48_1= 'E' | lv_ea_48_2= 'A' ) ) ) otherlv_49= '[' ( ( ruleImpliesExpression )=> (lv_arg_50_0= ruleLTLbinExpression ) ) otherlv_51= ']' ) | ( () ( ( (lv_function_53_1= 'word1' | lv_function_53_2= 'bool' ) ) ) otherlv_54= '(' ( (lv_arg_55_0= ruleSimpleExpression ) ) otherlv_56= ')' ) | ( () otherlv_58= 'toint' otherlv_59= '(' ( (lv_arg_60_0= ruleSimpleExpression ) ) otherlv_61= ')' ) ) )
            // InternalNuSMV.g:4603:2: ( ( () ( (lv_isNext_1_0= 'next' ) )? otherlv_2= '(' ( (lv_simpleExpression_3_0= ruleSimpleExpression ) ) otherlv_4= ')' ) | ( () ( ( ( (lv_operator_6_1= '-' | lv_operator_6_2= '+' | lv_operator_6_3= 'EG' | lv_operator_6_4= 'EX' | lv_operator_6_5= 'EF' | lv_operator_6_6= 'AG' | lv_operator_6_7= 'AX' | lv_operator_6_8= 'AF' | lv_operator_6_9= 'X' | lv_operator_6_10= 'G' | lv_operator_6_11= 'F' | lv_operator_6_12= 'Y' | lv_operator_6_13= 'Z' | lv_operator_6_14= 'H' | lv_operator_6_15= 'O' ) ) ) ( (lv_simpleExpression_7_0= ruleSimpleExpression ) ) ) ) | this_CaseSimpleExpression_8= ruleCaseSimpleExpression | ( () ( (lv_value_10_0= ruleVariableID ) ) (otherlv_11= '[' ( (lv_array_12_0= ruleNUMBER ) ) otherlv_13= ']' )* ) | ( () ( (otherlv_15= RULE_ID ) ) ( (otherlv_16= '.' ( (lv_dotted_17_0= ruleTerminalSimpleExpression ) ) ) | (otherlv_18= '[' ( (lv_array_19_0= ruleNUMBER ) ) otherlv_20= ']' )* )? ) | ( () ( (otherlv_22= RULE_ID ) ) ) | ( () ( (otherlv_24= RULE_ID ) ) ) | ( () ( (lv_value_26_0= RULE_ID ) ) ) | ( () ( (lv_value_28_0= ruleNUMBER ) ) ) | ( () ( (lv_value_30_0= 'TRUE' ) ) ) | ( () ( (lv_value_32_0= 'FALSE' ) ) ) | ( () ( (lv_value_34_0= 'self' ) ) ) | ( () otherlv_36= '{' ( (lv_setElement_37_0= ruleSimpleExpression ) ) (otherlv_38= ',' ( (lv_setElement_39_0= ruleSimpleExpression ) ) )* otherlv_40= '}' ) | ( () ( (lv_value_42_0= RULE_WORD ) ) ) | ( () ( (lv_lowerBound_44_0= ruleNUMBER ) ) otherlv_45= '..' ( (lv_upperBound_46_0= ruleNUMBER ) ) ) | ( () ( ( (lv_ea_48_1= 'E' | lv_ea_48_2= 'A' ) ) ) otherlv_49= '[' ( ( ruleImpliesExpression )=> (lv_arg_50_0= ruleLTLbinExpression ) ) otherlv_51= ']' ) | ( () ( ( (lv_function_53_1= 'word1' | lv_function_53_2= 'bool' ) ) ) otherlv_54= '(' ( (lv_arg_55_0= ruleSimpleExpression ) ) otherlv_56= ')' ) | ( () otherlv_58= 'toint' otherlv_59= '(' ( (lv_arg_60_0= ruleSimpleExpression ) ) otherlv_61= ')' ) )
            {
            // InternalNuSMV.g:4603:2: ( ( () ( (lv_isNext_1_0= 'next' ) )? otherlv_2= '(' ( (lv_simpleExpression_3_0= ruleSimpleExpression ) ) otherlv_4= ')' ) | ( () ( ( ( (lv_operator_6_1= '-' | lv_operator_6_2= '+' | lv_operator_6_3= 'EG' | lv_operator_6_4= 'EX' | lv_operator_6_5= 'EF' | lv_operator_6_6= 'AG' | lv_operator_6_7= 'AX' | lv_operator_6_8= 'AF' | lv_operator_6_9= 'X' | lv_operator_6_10= 'G' | lv_operator_6_11= 'F' | lv_operator_6_12= 'Y' | lv_operator_6_13= 'Z' | lv_operator_6_14= 'H' | lv_operator_6_15= 'O' ) ) ) ( (lv_simpleExpression_7_0= ruleSimpleExpression ) ) ) ) | this_CaseSimpleExpression_8= ruleCaseSimpleExpression | ( () ( (lv_value_10_0= ruleVariableID ) ) (otherlv_11= '[' ( (lv_array_12_0= ruleNUMBER ) ) otherlv_13= ']' )* ) | ( () ( (otherlv_15= RULE_ID ) ) ( (otherlv_16= '.' ( (lv_dotted_17_0= ruleTerminalSimpleExpression ) ) ) | (otherlv_18= '[' ( (lv_array_19_0= ruleNUMBER ) ) otherlv_20= ']' )* )? ) | ( () ( (otherlv_22= RULE_ID ) ) ) | ( () ( (otherlv_24= RULE_ID ) ) ) | ( () ( (lv_value_26_0= RULE_ID ) ) ) | ( () ( (lv_value_28_0= ruleNUMBER ) ) ) | ( () ( (lv_value_30_0= 'TRUE' ) ) ) | ( () ( (lv_value_32_0= 'FALSE' ) ) ) | ( () ( (lv_value_34_0= 'self' ) ) ) | ( () otherlv_36= '{' ( (lv_setElement_37_0= ruleSimpleExpression ) ) (otherlv_38= ',' ( (lv_setElement_39_0= ruleSimpleExpression ) ) )* otherlv_40= '}' ) | ( () ( (lv_value_42_0= RULE_WORD ) ) ) | ( () ( (lv_lowerBound_44_0= ruleNUMBER ) ) otherlv_45= '..' ( (lv_upperBound_46_0= ruleNUMBER ) ) ) | ( () ( ( (lv_ea_48_1= 'E' | lv_ea_48_2= 'A' ) ) ) otherlv_49= '[' ( ( ruleImpliesExpression )=> (lv_arg_50_0= ruleLTLbinExpression ) ) otherlv_51= ']' ) | ( () ( ( (lv_function_53_1= 'word1' | lv_function_53_2= 'bool' ) ) ) otherlv_54= '(' ( (lv_arg_55_0= ruleSimpleExpression ) ) otherlv_56= ')' ) | ( () otherlv_58= 'toint' otherlv_59= '(' ( (lv_arg_60_0= ruleSimpleExpression ) ) otherlv_61= ')' ) )
            int alt69=18;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // InternalNuSMV.g:4604:3: ( () ( (lv_isNext_1_0= 'next' ) )? otherlv_2= '(' ( (lv_simpleExpression_3_0= ruleSimpleExpression ) ) otherlv_4= ')' )
                    {
                    // InternalNuSMV.g:4604:3: ( () ( (lv_isNext_1_0= 'next' ) )? otherlv_2= '(' ( (lv_simpleExpression_3_0= ruleSimpleExpression ) ) otherlv_4= ')' )
                    // InternalNuSMV.g:4605:4: () ( (lv_isNext_1_0= 'next' ) )? otherlv_2= '(' ( (lv_simpleExpression_3_0= ruleSimpleExpression ) ) otherlv_4= ')'
                    {
                    // InternalNuSMV.g:4605:4: ()
                    // InternalNuSMV.g:4606:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalSimpleExpressionAccess().getParsExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNuSMV.g:4615:4: ( (lv_isNext_1_0= 'next' ) )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==23) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalNuSMV.g:4616:5: (lv_isNext_1_0= 'next' )
                            {
                            // InternalNuSMV.g:4616:5: (lv_isNext_1_0= 'next' )
                            // InternalNuSMV.g:4617:6: lv_isNext_1_0= 'next'
                            {
                            lv_isNext_1_0=(Token)match(input,23,FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_isNext_1_0, grammarAccess.getTerminalSimpleExpressionAccess().getIsNextNextKeyword_0_1_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getTerminalSimpleExpressionRule());
                              						}
                              						setWithLastConsumed(current, "isNext", lv_isNext_1_0, "next");
                              					
                            }

                            }


                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,10,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getTerminalSimpleExpressionAccess().getLeftParenthesisKeyword_0_2());
                      			
                    }
                    // InternalNuSMV.g:4633:4: ( (lv_simpleExpression_3_0= ruleSimpleExpression ) )
                    // InternalNuSMV.g:4634:5: (lv_simpleExpression_3_0= ruleSimpleExpression )
                    {
                    // InternalNuSMV.g:4634:5: (lv_simpleExpression_3_0= ruleSimpleExpression )
                    // InternalNuSMV.g:4635:6: lv_simpleExpression_3_0= ruleSimpleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalSimpleExpressionAccess().getSimpleExpressionSimpleExpressionParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_simpleExpression_3_0=ruleSimpleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalSimpleExpressionRule());
                      						}
                      						set(
                      							current,
                      							"simpleExpression",
                      							lv_simpleExpression_3_0,
                      							"org.xtext.nusmv.language.NuSMV.SimpleExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getTerminalSimpleExpressionAccess().getRightParenthesisKeyword_0_4());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalNuSMV.g:4658:3: ( () ( ( ( (lv_operator_6_1= '-' | lv_operator_6_2= '+' | lv_operator_6_3= 'EG' | lv_operator_6_4= 'EX' | lv_operator_6_5= 'EF' | lv_operator_6_6= 'AG' | lv_operator_6_7= 'AX' | lv_operator_6_8= 'AF' | lv_operator_6_9= 'X' | lv_operator_6_10= 'G' | lv_operator_6_11= 'F' | lv_operator_6_12= 'Y' | lv_operator_6_13= 'Z' | lv_operator_6_14= 'H' | lv_operator_6_15= 'O' ) ) ) ( (lv_simpleExpression_7_0= ruleSimpleExpression ) ) ) )
                    {
                    // InternalNuSMV.g:4658:3: ( () ( ( ( (lv_operator_6_1= '-' | lv_operator_6_2= '+' | lv_operator_6_3= 'EG' | lv_operator_6_4= 'EX' | lv_operator_6_5= 'EF' | lv_operator_6_6= 'AG' | lv_operator_6_7= 'AX' | lv_operator_6_8= 'AF' | lv_operator_6_9= 'X' | lv_operator_6_10= 'G' | lv_operator_6_11= 'F' | lv_operator_6_12= 'Y' | lv_operator_6_13= 'Z' | lv_operator_6_14= 'H' | lv_operator_6_15= 'O' ) ) ) ( (lv_simpleExpression_7_0= ruleSimpleExpression ) ) ) )
                    // InternalNuSMV.g:4659:4: () ( ( ( (lv_operator_6_1= '-' | lv_operator_6_2= '+' | lv_operator_6_3= 'EG' | lv_operator_6_4= 'EX' | lv_operator_6_5= 'EF' | lv_operator_6_6= 'AG' | lv_operator_6_7= 'AX' | lv_operator_6_8= 'AF' | lv_operator_6_9= 'X' | lv_operator_6_10= 'G' | lv_operator_6_11= 'F' | lv_operator_6_12= 'Y' | lv_operator_6_13= 'Z' | lv_operator_6_14= 'H' | lv_operator_6_15= 'O' ) ) ) ( (lv_simpleExpression_7_0= ruleSimpleExpression ) ) )
                    {
                    // InternalNuSMV.g:4659:4: ()
                    // InternalNuSMV.g:4660:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalSimpleExpressionAccess().getUnaryExpressionAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNuSMV.g:4669:4: ( ( ( (lv_operator_6_1= '-' | lv_operator_6_2= '+' | lv_operator_6_3= 'EG' | lv_operator_6_4= 'EX' | lv_operator_6_5= 'EF' | lv_operator_6_6= 'AG' | lv_operator_6_7= 'AX' | lv_operator_6_8= 'AF' | lv_operator_6_9= 'X' | lv_operator_6_10= 'G' | lv_operator_6_11= 'F' | lv_operator_6_12= 'Y' | lv_operator_6_13= 'Z' | lv_operator_6_14= 'H' | lv_operator_6_15= 'O' ) ) ) ( (lv_simpleExpression_7_0= ruleSimpleExpression ) ) )
                    // InternalNuSMV.g:4670:5: ( ( (lv_operator_6_1= '-' | lv_operator_6_2= '+' | lv_operator_6_3= 'EG' | lv_operator_6_4= 'EX' | lv_operator_6_5= 'EF' | lv_operator_6_6= 'AG' | lv_operator_6_7= 'AX' | lv_operator_6_8= 'AF' | lv_operator_6_9= 'X' | lv_operator_6_10= 'G' | lv_operator_6_11= 'F' | lv_operator_6_12= 'Y' | lv_operator_6_13= 'Z' | lv_operator_6_14= 'H' | lv_operator_6_15= 'O' ) ) ) ( (lv_simpleExpression_7_0= ruleSimpleExpression ) )
                    {
                    // InternalNuSMV.g:4670:5: ( ( (lv_operator_6_1= '-' | lv_operator_6_2= '+' | lv_operator_6_3= 'EG' | lv_operator_6_4= 'EX' | lv_operator_6_5= 'EF' | lv_operator_6_6= 'AG' | lv_operator_6_7= 'AX' | lv_operator_6_8= 'AF' | lv_operator_6_9= 'X' | lv_operator_6_10= 'G' | lv_operator_6_11= 'F' | lv_operator_6_12= 'Y' | lv_operator_6_13= 'Z' | lv_operator_6_14= 'H' | lv_operator_6_15= 'O' ) ) )
                    // InternalNuSMV.g:4671:6: ( (lv_operator_6_1= '-' | lv_operator_6_2= '+' | lv_operator_6_3= 'EG' | lv_operator_6_4= 'EX' | lv_operator_6_5= 'EF' | lv_operator_6_6= 'AG' | lv_operator_6_7= 'AX' | lv_operator_6_8= 'AF' | lv_operator_6_9= 'X' | lv_operator_6_10= 'G' | lv_operator_6_11= 'F' | lv_operator_6_12= 'Y' | lv_operator_6_13= 'Z' | lv_operator_6_14= 'H' | lv_operator_6_15= 'O' ) )
                    {
                    // InternalNuSMV.g:4671:6: ( (lv_operator_6_1= '-' | lv_operator_6_2= '+' | lv_operator_6_3= 'EG' | lv_operator_6_4= 'EX' | lv_operator_6_5= 'EF' | lv_operator_6_6= 'AG' | lv_operator_6_7= 'AX' | lv_operator_6_8= 'AF' | lv_operator_6_9= 'X' | lv_operator_6_10= 'G' | lv_operator_6_11= 'F' | lv_operator_6_12= 'Y' | lv_operator_6_13= 'Z' | lv_operator_6_14= 'H' | lv_operator_6_15= 'O' ) )
                    // InternalNuSMV.g:4672:7: (lv_operator_6_1= '-' | lv_operator_6_2= '+' | lv_operator_6_3= 'EG' | lv_operator_6_4= 'EX' | lv_operator_6_5= 'EF' | lv_operator_6_6= 'AG' | lv_operator_6_7= 'AX' | lv_operator_6_8= 'AF' | lv_operator_6_9= 'X' | lv_operator_6_10= 'G' | lv_operator_6_11= 'F' | lv_operator_6_12= 'Y' | lv_operator_6_13= 'Z' | lv_operator_6_14= 'H' | lv_operator_6_15= 'O' )
                    {
                    // InternalNuSMV.g:4672:7: (lv_operator_6_1= '-' | lv_operator_6_2= '+' | lv_operator_6_3= 'EG' | lv_operator_6_4= 'EX' | lv_operator_6_5= 'EF' | lv_operator_6_6= 'AG' | lv_operator_6_7= 'AX' | lv_operator_6_8= 'AF' | lv_operator_6_9= 'X' | lv_operator_6_10= 'G' | lv_operator_6_11= 'F' | lv_operator_6_12= 'Y' | lv_operator_6_13= 'Z' | lv_operator_6_14= 'H' | lv_operator_6_15= 'O' )
                    int alt62=15;
                    switch ( input.LA(1) ) {
                    case 55:
                        {
                        alt62=1;
                        }
                        break;
                    case 56:
                        {
                        alt62=2;
                        }
                        break;
                    case 62:
                        {
                        alt62=3;
                        }
                        break;
                    case 63:
                        {
                        alt62=4;
                        }
                        break;
                    case 64:
                        {
                        alt62=5;
                        }
                        break;
                    case 65:
                        {
                        alt62=6;
                        }
                        break;
                    case 66:
                        {
                        alt62=7;
                        }
                        break;
                    case 67:
                        {
                        alt62=8;
                        }
                        break;
                    case 68:
                        {
                        alt62=9;
                        }
                        break;
                    case 69:
                        {
                        alt62=10;
                        }
                        break;
                    case 70:
                        {
                        alt62=11;
                        }
                        break;
                    case 71:
                        {
                        alt62=12;
                        }
                        break;
                    case 72:
                        {
                        alt62=13;
                        }
                        break;
                    case 73:
                        {
                        alt62=14;
                        }
                        break;
                    case 74:
                        {
                        alt62=15;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 0, input);

                        throw nvae;
                    }

                    switch (alt62) {
                        case 1 :
                            // InternalNuSMV.g:4673:8: lv_operator_6_1= '-'
                            {
                            lv_operator_6_1=(Token)match(input,55,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_operator_6_1, grammarAccess.getTerminalSimpleExpressionAccess().getOperatorHyphenMinusKeyword_1_1_0_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getTerminalSimpleExpressionRule());
                              								}
                              								setWithLastConsumed(current, "operator", lv_operator_6_1, null);
                              							
                            }

                            }
                            break;
                        case 2 :
                            // InternalNuSMV.g:4684:8: lv_operator_6_2= '+'
                            {
                            lv_operator_6_2=(Token)match(input,56,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_operator_6_2, grammarAccess.getTerminalSimpleExpressionAccess().getOperatorPlusSignKeyword_1_1_0_0_1());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getTerminalSimpleExpressionRule());
                              								}
                              								setWithLastConsumed(current, "operator", lv_operator_6_2, null);
                              							
                            }

                            }
                            break;
                        case 3 :
                            // InternalNuSMV.g:4695:8: lv_operator_6_3= 'EG'
                            {
                            lv_operator_6_3=(Token)match(input,62,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_operator_6_3, grammarAccess.getTerminalSimpleExpressionAccess().getOperatorEGKeyword_1_1_0_0_2());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getTerminalSimpleExpressionRule());
                              								}
                              								setWithLastConsumed(current, "operator", lv_operator_6_3, null);
                              							
                            }

                            }
                            break;
                        case 4 :
                            // InternalNuSMV.g:4706:8: lv_operator_6_4= 'EX'
                            {
                            lv_operator_6_4=(Token)match(input,63,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_operator_6_4, grammarAccess.getTerminalSimpleExpressionAccess().getOperatorEXKeyword_1_1_0_0_3());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getTerminalSimpleExpressionRule());
                              								}
                              								setWithLastConsumed(current, "operator", lv_operator_6_4, null);
                              							
                            }

                            }
                            break;
                        case 5 :
                            // InternalNuSMV.g:4717:8: lv_operator_6_5= 'EF'
                            {
                            lv_operator_6_5=(Token)match(input,64,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_operator_6_5, grammarAccess.getTerminalSimpleExpressionAccess().getOperatorEFKeyword_1_1_0_0_4());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getTerminalSimpleExpressionRule());
                              								}
                              								setWithLastConsumed(current, "operator", lv_operator_6_5, null);
                              							
                            }

                            }
                            break;
                        case 6 :
                            // InternalNuSMV.g:4728:8: lv_operator_6_6= 'AG'
                            {
                            lv_operator_6_6=(Token)match(input,65,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_operator_6_6, grammarAccess.getTerminalSimpleExpressionAccess().getOperatorAGKeyword_1_1_0_0_5());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getTerminalSimpleExpressionRule());
                              								}
                              								setWithLastConsumed(current, "operator", lv_operator_6_6, null);
                              							
                            }

                            }
                            break;
                        case 7 :
                            // InternalNuSMV.g:4739:8: lv_operator_6_7= 'AX'
                            {
                            lv_operator_6_7=(Token)match(input,66,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_operator_6_7, grammarAccess.getTerminalSimpleExpressionAccess().getOperatorAXKeyword_1_1_0_0_6());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getTerminalSimpleExpressionRule());
                              								}
                              								setWithLastConsumed(current, "operator", lv_operator_6_7, null);
                              							
                            }

                            }
                            break;
                        case 8 :
                            // InternalNuSMV.g:4750:8: lv_operator_6_8= 'AF'
                            {
                            lv_operator_6_8=(Token)match(input,67,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_operator_6_8, grammarAccess.getTerminalSimpleExpressionAccess().getOperatorAFKeyword_1_1_0_0_7());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getTerminalSimpleExpressionRule());
                              								}
                              								setWithLastConsumed(current, "operator", lv_operator_6_8, null);
                              							
                            }

                            }
                            break;
                        case 9 :
                            // InternalNuSMV.g:4761:8: lv_operator_6_9= 'X'
                            {
                            lv_operator_6_9=(Token)match(input,68,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_operator_6_9, grammarAccess.getTerminalSimpleExpressionAccess().getOperatorXKeyword_1_1_0_0_8());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getTerminalSimpleExpressionRule());
                              								}
                              								setWithLastConsumed(current, "operator", lv_operator_6_9, null);
                              							
                            }

                            }
                            break;
                        case 10 :
                            // InternalNuSMV.g:4772:8: lv_operator_6_10= 'G'
                            {
                            lv_operator_6_10=(Token)match(input,69,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_operator_6_10, grammarAccess.getTerminalSimpleExpressionAccess().getOperatorGKeyword_1_1_0_0_9());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getTerminalSimpleExpressionRule());
                              								}
                              								setWithLastConsumed(current, "operator", lv_operator_6_10, null);
                              							
                            }

                            }
                            break;
                        case 11 :
                            // InternalNuSMV.g:4783:8: lv_operator_6_11= 'F'
                            {
                            lv_operator_6_11=(Token)match(input,70,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_operator_6_11, grammarAccess.getTerminalSimpleExpressionAccess().getOperatorFKeyword_1_1_0_0_10());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getTerminalSimpleExpressionRule());
                              								}
                              								setWithLastConsumed(current, "operator", lv_operator_6_11, null);
                              							
                            }

                            }
                            break;
                        case 12 :
                            // InternalNuSMV.g:4794:8: lv_operator_6_12= 'Y'
                            {
                            lv_operator_6_12=(Token)match(input,71,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_operator_6_12, grammarAccess.getTerminalSimpleExpressionAccess().getOperatorYKeyword_1_1_0_0_11());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getTerminalSimpleExpressionRule());
                              								}
                              								setWithLastConsumed(current, "operator", lv_operator_6_12, null);
                              							
                            }

                            }
                            break;
                        case 13 :
                            // InternalNuSMV.g:4805:8: lv_operator_6_13= 'Z'
                            {
                            lv_operator_6_13=(Token)match(input,72,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_operator_6_13, grammarAccess.getTerminalSimpleExpressionAccess().getOperatorZKeyword_1_1_0_0_12());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getTerminalSimpleExpressionRule());
                              								}
                              								setWithLastConsumed(current, "operator", lv_operator_6_13, null);
                              							
                            }

                            }
                            break;
                        case 14 :
                            // InternalNuSMV.g:4816:8: lv_operator_6_14= 'H'
                            {
                            lv_operator_6_14=(Token)match(input,73,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_operator_6_14, grammarAccess.getTerminalSimpleExpressionAccess().getOperatorHKeyword_1_1_0_0_13());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getTerminalSimpleExpressionRule());
                              								}
                              								setWithLastConsumed(current, "operator", lv_operator_6_14, null);
                              							
                            }

                            }
                            break;
                        case 15 :
                            // InternalNuSMV.g:4827:8: lv_operator_6_15= 'O'
                            {
                            lv_operator_6_15=(Token)match(input,74,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_operator_6_15, grammarAccess.getTerminalSimpleExpressionAccess().getOperatorOKeyword_1_1_0_0_14());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getTerminalSimpleExpressionRule());
                              								}
                              								setWithLastConsumed(current, "operator", lv_operator_6_15, null);
                              							
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalNuSMV.g:4840:5: ( (lv_simpleExpression_7_0= ruleSimpleExpression ) )
                    // InternalNuSMV.g:4841:6: (lv_simpleExpression_7_0= ruleSimpleExpression )
                    {
                    // InternalNuSMV.g:4841:6: (lv_simpleExpression_7_0= ruleSimpleExpression )
                    // InternalNuSMV.g:4842:7: lv_simpleExpression_7_0= ruleSimpleExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getTerminalSimpleExpressionAccess().getSimpleExpressionSimpleExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_simpleExpression_7_0=ruleSimpleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getTerminalSimpleExpressionRule());
                      							}
                      							set(
                      								current,
                      								"simpleExpression",
                      								lv_simpleExpression_7_0,
                      								"org.xtext.nusmv.language.NuSMV.SimpleExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalNuSMV.g:4862:3: this_CaseSimpleExpression_8= ruleCaseSimpleExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTerminalSimpleExpressionAccess().getCaseSimpleExpressionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CaseSimpleExpression_8=ruleCaseSimpleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CaseSimpleExpression_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNuSMV.g:4874:3: ( () ( (lv_value_10_0= ruleVariableID ) ) (otherlv_11= '[' ( (lv_array_12_0= ruleNUMBER ) ) otherlv_13= ']' )* )
                    {
                    // InternalNuSMV.g:4874:3: ( () ( (lv_value_10_0= ruleVariableID ) ) (otherlv_11= '[' ( (lv_array_12_0= ruleNUMBER ) ) otherlv_13= ']' )* )
                    // InternalNuSMV.g:4875:4: () ( (lv_value_10_0= ruleVariableID ) ) (otherlv_11= '[' ( (lv_array_12_0= ruleNUMBER ) ) otherlv_13= ']' )*
                    {
                    // InternalNuSMV.g:4875:4: ()
                    // InternalNuSMV.g:4876:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalSimpleExpressionAccess().getValueExpressionAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNuSMV.g:4885:4: ( (lv_value_10_0= ruleVariableID ) )
                    // InternalNuSMV.g:4886:5: (lv_value_10_0= ruleVariableID )
                    {
                    // InternalNuSMV.g:4886:5: (lv_value_10_0= ruleVariableID )
                    // InternalNuSMV.g:4887:6: lv_value_10_0= ruleVariableID
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalSimpleExpressionAccess().getValueVariableIDParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_48);
                    lv_value_10_0=ruleVariableID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalSimpleExpressionRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_10_0,
                      							"org.xtext.nusmv.language.NuSMV.VariableID");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNuSMV.g:4904:4: (otherlv_11= '[' ( (lv_array_12_0= ruleNUMBER ) ) otherlv_13= ']' )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==39) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalNuSMV.g:4905:5: otherlv_11= '[' ( (lv_array_12_0= ruleNUMBER ) ) otherlv_13= ']'
                    	    {
                    	    otherlv_11=(Token)match(input,39,FOLLOW_23); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_11, grammarAccess.getTerminalSimpleExpressionAccess().getLeftSquareBracketKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalNuSMV.g:4909:5: ( (lv_array_12_0= ruleNUMBER ) )
                    	    // InternalNuSMV.g:4910:6: (lv_array_12_0= ruleNUMBER )
                    	    {
                    	    // InternalNuSMV.g:4910:6: (lv_array_12_0= ruleNUMBER )
                    	    // InternalNuSMV.g:4911:7: lv_array_12_0= ruleNUMBER
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getTerminalSimpleExpressionAccess().getArrayNUMBERParserRuleCall_3_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_24);
                    	    lv_array_12_0=ruleNUMBER();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getTerminalSimpleExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"array",
                    	      								lv_array_12_0,
                    	      								"org.xtext.nusmv.language.NuSMV.NUMBER");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    otherlv_13=(Token)match(input,40,FOLLOW_48); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_13, grammarAccess.getTerminalSimpleExpressionAccess().getRightSquareBracketKeyword_3_2_2());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 5 :
                    // InternalNuSMV.g:4935:3: ( () ( (otherlv_15= RULE_ID ) ) ( (otherlv_16= '.' ( (lv_dotted_17_0= ruleTerminalSimpleExpression ) ) ) | (otherlv_18= '[' ( (lv_array_19_0= ruleNUMBER ) ) otherlv_20= ']' )* )? )
                    {
                    // InternalNuSMV.g:4935:3: ( () ( (otherlv_15= RULE_ID ) ) ( (otherlv_16= '.' ( (lv_dotted_17_0= ruleTerminalSimpleExpression ) ) ) | (otherlv_18= '[' ( (lv_array_19_0= ruleNUMBER ) ) otherlv_20= ']' )* )? )
                    // InternalNuSMV.g:4936:4: () ( (otherlv_15= RULE_ID ) ) ( (otherlv_16= '.' ( (lv_dotted_17_0= ruleTerminalSimpleExpression ) ) ) | (otherlv_18= '[' ( (lv_array_19_0= ruleNUMBER ) ) otherlv_20= ']' )* )?
                    {
                    // InternalNuSMV.g:4936:4: ()
                    // InternalNuSMV.g:4937:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalSimpleExpressionAccess().getVarAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNuSMV.g:4946:4: ( (otherlv_15= RULE_ID ) )
                    // InternalNuSMV.g:4947:5: (otherlv_15= RULE_ID )
                    {
                    // InternalNuSMV.g:4947:5: (otherlv_15= RULE_ID )
                    // InternalNuSMV.g:4948:6: otherlv_15= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalSimpleExpressionRule());
                      						}
                      					
                    }
                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_15, grammarAccess.getTerminalSimpleExpressionAccess().getValueVarBodyCrossReference_4_1_0());
                      					
                    }

                    }


                    }

                    // InternalNuSMV.g:4962:4: ( (otherlv_16= '.' ( (lv_dotted_17_0= ruleTerminalSimpleExpression ) ) ) | (otherlv_18= '[' ( (lv_array_19_0= ruleNUMBER ) ) otherlv_20= ']' )* )?
                    int alt65=3;
                    alt65 = dfa65.predict(input);
                    switch (alt65) {
                        case 1 :
                            // InternalNuSMV.g:4963:5: (otherlv_16= '.' ( (lv_dotted_17_0= ruleTerminalSimpleExpression ) ) )
                            {
                            // InternalNuSMV.g:4963:5: (otherlv_16= '.' ( (lv_dotted_17_0= ruleTerminalSimpleExpression ) ) )
                            // InternalNuSMV.g:4964:6: otherlv_16= '.' ( (lv_dotted_17_0= ruleTerminalSimpleExpression ) )
                            {
                            otherlv_16=(Token)match(input,75,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_16, grammarAccess.getTerminalSimpleExpressionAccess().getFullStopKeyword_4_2_0_0());
                              					
                            }
                            // InternalNuSMV.g:4968:6: ( (lv_dotted_17_0= ruleTerminalSimpleExpression ) )
                            // InternalNuSMV.g:4969:7: (lv_dotted_17_0= ruleTerminalSimpleExpression )
                            {
                            // InternalNuSMV.g:4969:7: (lv_dotted_17_0= ruleTerminalSimpleExpression )
                            // InternalNuSMV.g:4970:8: lv_dotted_17_0= ruleTerminalSimpleExpression
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getTerminalSimpleExpressionAccess().getDottedTerminalSimpleExpressionParserRuleCall_4_2_0_1_0());
                              							
                            }
                            pushFollow(FOLLOW_2);
                            lv_dotted_17_0=ruleTerminalSimpleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getTerminalSimpleExpressionRule());
                              								}
                              								set(
                              									current,
                              									"dotted",
                              									lv_dotted_17_0,
                              									"org.xtext.nusmv.language.NuSMV.TerminalSimpleExpression");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalNuSMV.g:4989:5: (otherlv_18= '[' ( (lv_array_19_0= ruleNUMBER ) ) otherlv_20= ']' )*
                            {
                            // InternalNuSMV.g:4989:5: (otherlv_18= '[' ( (lv_array_19_0= ruleNUMBER ) ) otherlv_20= ']' )*
                            loop64:
                            do {
                                int alt64=2;
                                int LA64_0 = input.LA(1);

                                if ( (LA64_0==39) ) {
                                    alt64=1;
                                }


                                switch (alt64) {
                            	case 1 :
                            	    // InternalNuSMV.g:4990:6: otherlv_18= '[' ( (lv_array_19_0= ruleNUMBER ) ) otherlv_20= ']'
                            	    {
                            	    otherlv_18=(Token)match(input,39,FOLLOW_23); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_18, grammarAccess.getTerminalSimpleExpressionAccess().getLeftSquareBracketKeyword_4_2_1_0());
                            	      					
                            	    }
                            	    // InternalNuSMV.g:4994:6: ( (lv_array_19_0= ruleNUMBER ) )
                            	    // InternalNuSMV.g:4995:7: (lv_array_19_0= ruleNUMBER )
                            	    {
                            	    // InternalNuSMV.g:4995:7: (lv_array_19_0= ruleNUMBER )
                            	    // InternalNuSMV.g:4996:8: lv_array_19_0= ruleNUMBER
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getTerminalSimpleExpressionAccess().getArrayNUMBERParserRuleCall_4_2_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_24);
                            	    lv_array_19_0=ruleNUMBER();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getTerminalSimpleExpressionRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"array",
                            	      									lv_array_19_0,
                            	      									"org.xtext.nusmv.language.NuSMV.NUMBER");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }

                            	    otherlv_20=(Token)match(input,40,FOLLOW_48); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_20, grammarAccess.getTerminalSimpleExpressionAccess().getRightSquareBracketKeyword_4_2_1_2());
                            	      					
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop64;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalNuSMV.g:5021:3: ( () ( (otherlv_22= RULE_ID ) ) )
                    {
                    // InternalNuSMV.g:5021:3: ( () ( (otherlv_22= RULE_ID ) ) )
                    // InternalNuSMV.g:5022:4: () ( (otherlv_22= RULE_ID ) )
                    {
                    // InternalNuSMV.g:5022:4: ()
                    // InternalNuSMV.g:5023:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalSimpleExpressionAccess().getSetElementExpressionAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNuSMV.g:5032:4: ( (otherlv_22= RULE_ID ) )
                    // InternalNuSMV.g:5033:5: (otherlv_22= RULE_ID )
                    {
                    // InternalNuSMV.g:5033:5: (otherlv_22= RULE_ID )
                    // InternalNuSMV.g:5034:6: otherlv_22= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalSimpleExpressionRule());
                      						}
                      					
                    }
                    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_22, grammarAccess.getTerminalSimpleExpressionAccess().getValValCrossReference_5_1_0());
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalNuSMV.g:5050:3: ( () ( (otherlv_24= RULE_ID ) ) )
                    {
                    // InternalNuSMV.g:5050:3: ( () ( (otherlv_24= RULE_ID ) ) )
                    // InternalNuSMV.g:5051:4: () ( (otherlv_24= RULE_ID ) )
                    {
                    // InternalNuSMV.g:5051:4: ()
                    // InternalNuSMV.g:5052:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalSimpleExpressionAccess().getSetValueParameterAction_6_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNuSMV.g:5061:4: ( (otherlv_24= RULE_ID ) )
                    // InternalNuSMV.g:5062:5: (otherlv_24= RULE_ID )
                    {
                    // InternalNuSMV.g:5062:5: (otherlv_24= RULE_ID )
                    // InternalNuSMV.g:5063:6: otherlv_24= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalSimpleExpressionRule());
                      						}
                      					
                    }
                    otherlv_24=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_24, grammarAccess.getTerminalSimpleExpressionAccess().getValparamFormalParameterCrossReference_6_1_0());
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalNuSMV.g:5079:3: ( () ( (lv_value_26_0= RULE_ID ) ) )
                    {
                    // InternalNuSMV.g:5079:3: ( () ( (lv_value_26_0= RULE_ID ) ) )
                    // InternalNuSMV.g:5080:4: () ( (lv_value_26_0= RULE_ID ) )
                    {
                    // InternalNuSMV.g:5080:4: ()
                    // InternalNuSMV.g:5081:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalSimpleExpressionAccess().getValueExpressionAction_7_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNuSMV.g:5090:4: ( (lv_value_26_0= RULE_ID ) )
                    // InternalNuSMV.g:5091:5: (lv_value_26_0= RULE_ID )
                    {
                    // InternalNuSMV.g:5091:5: (lv_value_26_0= RULE_ID )
                    // InternalNuSMV.g:5092:6: lv_value_26_0= RULE_ID
                    {
                    lv_value_26_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_26_0, grammarAccess.getTerminalSimpleExpressionAccess().getValueIDTerminalRuleCall_7_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalSimpleExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_26_0,
                      							"org.xtext.nusmv.language.NuSMV.ID");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalNuSMV.g:5110:3: ( () ( (lv_value_28_0= ruleNUMBER ) ) )
                    {
                    // InternalNuSMV.g:5110:3: ( () ( (lv_value_28_0= ruleNUMBER ) ) )
                    // InternalNuSMV.g:5111:4: () ( (lv_value_28_0= ruleNUMBER ) )
                    {
                    // InternalNuSMV.g:5111:4: ()
                    // InternalNuSMV.g:5112:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalSimpleExpressionAccess().getValueExpressionAction_8_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNuSMV.g:5121:4: ( (lv_value_28_0= ruleNUMBER ) )
                    // InternalNuSMV.g:5122:5: (lv_value_28_0= ruleNUMBER )
                    {
                    // InternalNuSMV.g:5122:5: (lv_value_28_0= ruleNUMBER )
                    // InternalNuSMV.g:5123:6: lv_value_28_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalSimpleExpressionAccess().getValueNUMBERParserRuleCall_8_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_28_0=ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalSimpleExpressionRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_28_0,
                      							"org.xtext.nusmv.language.NuSMV.NUMBER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalNuSMV.g:5142:3: ( () ( (lv_value_30_0= 'TRUE' ) ) )
                    {
                    // InternalNuSMV.g:5142:3: ( () ( (lv_value_30_0= 'TRUE' ) ) )
                    // InternalNuSMV.g:5143:4: () ( (lv_value_30_0= 'TRUE' ) )
                    {
                    // InternalNuSMV.g:5143:4: ()
                    // InternalNuSMV.g:5144:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalSimpleExpressionAccess().getValueExpressionAction_9_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNuSMV.g:5153:4: ( (lv_value_30_0= 'TRUE' ) )
                    // InternalNuSMV.g:5154:5: (lv_value_30_0= 'TRUE' )
                    {
                    // InternalNuSMV.g:5154:5: (lv_value_30_0= 'TRUE' )
                    // InternalNuSMV.g:5155:6: lv_value_30_0= 'TRUE'
                    {
                    lv_value_30_0=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_30_0, grammarAccess.getTerminalSimpleExpressionAccess().getValueTRUEKeyword_9_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalSimpleExpressionRule());
                      						}
                      						setWithLastConsumed(current, "value", lv_value_30_0, "TRUE");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalNuSMV.g:5169:3: ( () ( (lv_value_32_0= 'FALSE' ) ) )
                    {
                    // InternalNuSMV.g:5169:3: ( () ( (lv_value_32_0= 'FALSE' ) ) )
                    // InternalNuSMV.g:5170:4: () ( (lv_value_32_0= 'FALSE' ) )
                    {
                    // InternalNuSMV.g:5170:4: ()
                    // InternalNuSMV.g:5171:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalSimpleExpressionAccess().getValueExpressionAction_10_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNuSMV.g:5180:4: ( (lv_value_32_0= 'FALSE' ) )
                    // InternalNuSMV.g:5181:5: (lv_value_32_0= 'FALSE' )
                    {
                    // InternalNuSMV.g:5181:5: (lv_value_32_0= 'FALSE' )
                    // InternalNuSMV.g:5182:6: lv_value_32_0= 'FALSE'
                    {
                    lv_value_32_0=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_32_0, grammarAccess.getTerminalSimpleExpressionAccess().getValueFALSEKeyword_10_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalSimpleExpressionRule());
                      						}
                      						setWithLastConsumed(current, "value", lv_value_32_0, "FALSE");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 12 :
                    // InternalNuSMV.g:5196:3: ( () ( (lv_value_34_0= 'self' ) ) )
                    {
                    // InternalNuSMV.g:5196:3: ( () ( (lv_value_34_0= 'self' ) ) )
                    // InternalNuSMV.g:5197:4: () ( (lv_value_34_0= 'self' ) )
                    {
                    // InternalNuSMV.g:5197:4: ()
                    // InternalNuSMV.g:5198:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalSimpleExpressionAccess().getValueExpressionAction_11_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNuSMV.g:5207:4: ( (lv_value_34_0= 'self' ) )
                    // InternalNuSMV.g:5208:5: (lv_value_34_0= 'self' )
                    {
                    // InternalNuSMV.g:5208:5: (lv_value_34_0= 'self' )
                    // InternalNuSMV.g:5209:6: lv_value_34_0= 'self'
                    {
                    lv_value_34_0=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_34_0, grammarAccess.getTerminalSimpleExpressionAccess().getValueSelfKeyword_11_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalSimpleExpressionRule());
                      						}
                      						setWithLastConsumed(current, "value", lv_value_34_0, "self");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 13 :
                    // InternalNuSMV.g:5223:3: ( () otherlv_36= '{' ( (lv_setElement_37_0= ruleSimpleExpression ) ) (otherlv_38= ',' ( (lv_setElement_39_0= ruleSimpleExpression ) ) )* otherlv_40= '}' )
                    {
                    // InternalNuSMV.g:5223:3: ( () otherlv_36= '{' ( (lv_setElement_37_0= ruleSimpleExpression ) ) (otherlv_38= ',' ( (lv_setElement_39_0= ruleSimpleExpression ) ) )* otherlv_40= '}' )
                    // InternalNuSMV.g:5224:4: () otherlv_36= '{' ( (lv_setElement_37_0= ruleSimpleExpression ) ) (otherlv_38= ',' ( (lv_setElement_39_0= ruleSimpleExpression ) ) )* otherlv_40= '}'
                    {
                    // InternalNuSMV.g:5224:4: ()
                    // InternalNuSMV.g:5225:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalSimpleExpressionAccess().getSetExpressionAction_12_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_36=(Token)match(input,43,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_36, grammarAccess.getTerminalSimpleExpressionAccess().getLeftCurlyBracketKeyword_12_1());
                      			
                    }
                    // InternalNuSMV.g:5238:4: ( (lv_setElement_37_0= ruleSimpleExpression ) )
                    // InternalNuSMV.g:5239:5: (lv_setElement_37_0= ruleSimpleExpression )
                    {
                    // InternalNuSMV.g:5239:5: (lv_setElement_37_0= ruleSimpleExpression )
                    // InternalNuSMV.g:5240:6: lv_setElement_37_0= ruleSimpleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalSimpleExpressionAccess().getSetElementSimpleExpressionParserRuleCall_12_2_0());
                      					
                    }
                    pushFollow(FOLLOW_27);
                    lv_setElement_37_0=ruleSimpleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalSimpleExpressionRule());
                      						}
                      						add(
                      							current,
                      							"setElement",
                      							lv_setElement_37_0,
                      							"org.xtext.nusmv.language.NuSMV.SimpleExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNuSMV.g:5257:4: (otherlv_38= ',' ( (lv_setElement_39_0= ruleSimpleExpression ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==11) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalNuSMV.g:5258:5: otherlv_38= ',' ( (lv_setElement_39_0= ruleSimpleExpression ) )
                    	    {
                    	    otherlv_38=(Token)match(input,11,FOLLOW_13); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_38, grammarAccess.getTerminalSimpleExpressionAccess().getCommaKeyword_12_3_0());
                    	      				
                    	    }
                    	    // InternalNuSMV.g:5262:5: ( (lv_setElement_39_0= ruleSimpleExpression ) )
                    	    // InternalNuSMV.g:5263:6: (lv_setElement_39_0= ruleSimpleExpression )
                    	    {
                    	    // InternalNuSMV.g:5263:6: (lv_setElement_39_0= ruleSimpleExpression )
                    	    // InternalNuSMV.g:5264:7: lv_setElement_39_0= ruleSimpleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getTerminalSimpleExpressionAccess().getSetElementSimpleExpressionParserRuleCall_12_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_27);
                    	    lv_setElement_39_0=ruleSimpleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getTerminalSimpleExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"setElement",
                    	      								lv_setElement_39_0,
                    	      								"org.xtext.nusmv.language.NuSMV.SimpleExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);

                    otherlv_40=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_40, grammarAccess.getTerminalSimpleExpressionAccess().getRightCurlyBracketKeyword_12_4());
                      			
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalNuSMV.g:5288:3: ( () ( (lv_value_42_0= RULE_WORD ) ) )
                    {
                    // InternalNuSMV.g:5288:3: ( () ( (lv_value_42_0= RULE_WORD ) ) )
                    // InternalNuSMV.g:5289:4: () ( (lv_value_42_0= RULE_WORD ) )
                    {
                    // InternalNuSMV.g:5289:4: ()
                    // InternalNuSMV.g:5290:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalSimpleExpressionAccess().getWordExpressionAction_13_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNuSMV.g:5299:4: ( (lv_value_42_0= RULE_WORD ) )
                    // InternalNuSMV.g:5300:5: (lv_value_42_0= RULE_WORD )
                    {
                    // InternalNuSMV.g:5300:5: (lv_value_42_0= RULE_WORD )
                    // InternalNuSMV.g:5301:6: lv_value_42_0= RULE_WORD
                    {
                    lv_value_42_0=(Token)match(input,RULE_WORD,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_42_0, grammarAccess.getTerminalSimpleExpressionAccess().getValueWORDTerminalRuleCall_13_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalSimpleExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_42_0,
                      							"org.xtext.nusmv.language.NuSMV.WORD");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 15 :
                    // InternalNuSMV.g:5319:3: ( () ( (lv_lowerBound_44_0= ruleNUMBER ) ) otherlv_45= '..' ( (lv_upperBound_46_0= ruleNUMBER ) ) )
                    {
                    // InternalNuSMV.g:5319:3: ( () ( (lv_lowerBound_44_0= ruleNUMBER ) ) otherlv_45= '..' ( (lv_upperBound_46_0= ruleNUMBER ) ) )
                    // InternalNuSMV.g:5320:4: () ( (lv_lowerBound_44_0= ruleNUMBER ) ) otherlv_45= '..' ( (lv_upperBound_46_0= ruleNUMBER ) )
                    {
                    // InternalNuSMV.g:5320:4: ()
                    // InternalNuSMV.g:5321:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalSimpleExpressionAccess().getIntervalExpressionAction_14_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNuSMV.g:5330:4: ( (lv_lowerBound_44_0= ruleNUMBER ) )
                    // InternalNuSMV.g:5331:5: (lv_lowerBound_44_0= ruleNUMBER )
                    {
                    // InternalNuSMV.g:5331:5: (lv_lowerBound_44_0= ruleNUMBER )
                    // InternalNuSMV.g:5332:6: lv_lowerBound_44_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalSimpleExpressionAccess().getLowerBoundNUMBERParserRuleCall_14_1_0());
                      					
                    }
                    pushFollow(FOLLOW_28);
                    lv_lowerBound_44_0=ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalSimpleExpressionRule());
                      						}
                      						set(
                      							current,
                      							"lowerBound",
                      							lv_lowerBound_44_0,
                      							"org.xtext.nusmv.language.NuSMV.NUMBER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_45=(Token)match(input,45,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_45, grammarAccess.getTerminalSimpleExpressionAccess().getFullStopFullStopKeyword_14_2());
                      			
                    }
                    // InternalNuSMV.g:5353:4: ( (lv_upperBound_46_0= ruleNUMBER ) )
                    // InternalNuSMV.g:5354:5: (lv_upperBound_46_0= ruleNUMBER )
                    {
                    // InternalNuSMV.g:5354:5: (lv_upperBound_46_0= ruleNUMBER )
                    // InternalNuSMV.g:5355:6: lv_upperBound_46_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalSimpleExpressionAccess().getUpperBoundNUMBERParserRuleCall_14_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_upperBound_46_0=ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalSimpleExpressionRule());
                      						}
                      						set(
                      							current,
                      							"upperBound",
                      							lv_upperBound_46_0,
                      							"org.xtext.nusmv.language.NuSMV.NUMBER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 16 :
                    // InternalNuSMV.g:5374:3: ( () ( ( (lv_ea_48_1= 'E' | lv_ea_48_2= 'A' ) ) ) otherlv_49= '[' ( ( ruleImpliesExpression )=> (lv_arg_50_0= ruleLTLbinExpression ) ) otherlv_51= ']' )
                    {
                    // InternalNuSMV.g:5374:3: ( () ( ( (lv_ea_48_1= 'E' | lv_ea_48_2= 'A' ) ) ) otherlv_49= '[' ( ( ruleImpliesExpression )=> (lv_arg_50_0= ruleLTLbinExpression ) ) otherlv_51= ']' )
                    // InternalNuSMV.g:5375:4: () ( ( (lv_ea_48_1= 'E' | lv_ea_48_2= 'A' ) ) ) otherlv_49= '[' ( ( ruleImpliesExpression )=> (lv_arg_50_0= ruleLTLbinExpression ) ) otherlv_51= ']'
                    {
                    // InternalNuSMV.g:5375:4: ()
                    // InternalNuSMV.g:5376:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalSimpleExpressionAccess().getUntilCTLexpressionAction_15_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNuSMV.g:5385:4: ( ( (lv_ea_48_1= 'E' | lv_ea_48_2= 'A' ) ) )
                    // InternalNuSMV.g:5386:5: ( (lv_ea_48_1= 'E' | lv_ea_48_2= 'A' ) )
                    {
                    // InternalNuSMV.g:5386:5: ( (lv_ea_48_1= 'E' | lv_ea_48_2= 'A' ) )
                    // InternalNuSMV.g:5387:6: (lv_ea_48_1= 'E' | lv_ea_48_2= 'A' )
                    {
                    // InternalNuSMV.g:5387:6: (lv_ea_48_1= 'E' | lv_ea_48_2= 'A' )
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==77) ) {
                        alt67=1;
                    }
                    else if ( (LA67_0==78) ) {
                        alt67=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;
                    }
                    switch (alt67) {
                        case 1 :
                            // InternalNuSMV.g:5388:7: lv_ea_48_1= 'E'
                            {
                            lv_ea_48_1=(Token)match(input,77,FOLLOW_22); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_ea_48_1, grammarAccess.getTerminalSimpleExpressionAccess().getEaEKeyword_15_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getTerminalSimpleExpressionRule());
                              							}
                              							setWithLastConsumed(current, "ea", lv_ea_48_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalNuSMV.g:5399:7: lv_ea_48_2= 'A'
                            {
                            lv_ea_48_2=(Token)match(input,78,FOLLOW_22); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_ea_48_2, grammarAccess.getTerminalSimpleExpressionAccess().getEaAKeyword_15_1_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getTerminalSimpleExpressionRule());
                              							}
                              							setWithLastConsumed(current, "ea", lv_ea_48_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_49=(Token)match(input,39,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_49, grammarAccess.getTerminalSimpleExpressionAccess().getLeftSquareBracketKeyword_15_2());
                      			
                    }
                    // InternalNuSMV.g:5416:4: ( ( ruleImpliesExpression )=> (lv_arg_50_0= ruleLTLbinExpression ) )
                    // InternalNuSMV.g:5417:5: ( ruleImpliesExpression )=> (lv_arg_50_0= ruleLTLbinExpression )
                    {
                    // InternalNuSMV.g:5418:5: (lv_arg_50_0= ruleLTLbinExpression )
                    // InternalNuSMV.g:5419:6: lv_arg_50_0= ruleLTLbinExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalSimpleExpressionAccess().getArgLTLbinExpressionParserRuleCall_15_3_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
                    lv_arg_50_0=ruleLTLbinExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalSimpleExpressionRule());
                      						}
                      						set(
                      							current,
                      							"arg",
                      							lv_arg_50_0,
                      							"org.xtext.nusmv.language.NuSMV.LTLbinExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_51=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_51, grammarAccess.getTerminalSimpleExpressionAccess().getRightSquareBracketKeyword_15_4());
                      			
                    }

                    }


                    }
                    break;
                case 17 :
                    // InternalNuSMV.g:5442:3: ( () ( ( (lv_function_53_1= 'word1' | lv_function_53_2= 'bool' ) ) ) otherlv_54= '(' ( (lv_arg_55_0= ruleSimpleExpression ) ) otherlv_56= ')' )
                    {
                    // InternalNuSMV.g:5442:3: ( () ( ( (lv_function_53_1= 'word1' | lv_function_53_2= 'bool' ) ) ) otherlv_54= '(' ( (lv_arg_55_0= ruleSimpleExpression ) ) otherlv_56= ')' )
                    // InternalNuSMV.g:5443:4: () ( ( (lv_function_53_1= 'word1' | lv_function_53_2= 'bool' ) ) ) otherlv_54= '(' ( (lv_arg_55_0= ruleSimpleExpression ) ) otherlv_56= ')'
                    {
                    // InternalNuSMV.g:5443:4: ()
                    // InternalNuSMV.g:5444:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalSimpleExpressionAccess().getUnaryFunctionExpressionAction_16_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNuSMV.g:5453:4: ( ( (lv_function_53_1= 'word1' | lv_function_53_2= 'bool' ) ) )
                    // InternalNuSMV.g:5454:5: ( (lv_function_53_1= 'word1' | lv_function_53_2= 'bool' ) )
                    {
                    // InternalNuSMV.g:5454:5: ( (lv_function_53_1= 'word1' | lv_function_53_2= 'bool' ) )
                    // InternalNuSMV.g:5455:6: (lv_function_53_1= 'word1' | lv_function_53_2= 'bool' )
                    {
                    // InternalNuSMV.g:5455:6: (lv_function_53_1= 'word1' | lv_function_53_2= 'bool' )
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==79) ) {
                        alt68=1;
                    }
                    else if ( (LA68_0==80) ) {
                        alt68=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 68, 0, input);

                        throw nvae;
                    }
                    switch (alt68) {
                        case 1 :
                            // InternalNuSMV.g:5456:7: lv_function_53_1= 'word1'
                            {
                            lv_function_53_1=(Token)match(input,79,FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_function_53_1, grammarAccess.getTerminalSimpleExpressionAccess().getFunctionWord1Keyword_16_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getTerminalSimpleExpressionRule());
                              							}
                              							setWithLastConsumed(current, "function", lv_function_53_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalNuSMV.g:5467:7: lv_function_53_2= 'bool'
                            {
                            lv_function_53_2=(Token)match(input,80,FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_function_53_2, grammarAccess.getTerminalSimpleExpressionAccess().getFunctionBoolKeyword_16_1_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getTerminalSimpleExpressionRule());
                              							}
                              							setWithLastConsumed(current, "function", lv_function_53_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_54=(Token)match(input,10,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_54, grammarAccess.getTerminalSimpleExpressionAccess().getLeftParenthesisKeyword_16_2());
                      			
                    }
                    // InternalNuSMV.g:5484:4: ( (lv_arg_55_0= ruleSimpleExpression ) )
                    // InternalNuSMV.g:5485:5: (lv_arg_55_0= ruleSimpleExpression )
                    {
                    // InternalNuSMV.g:5485:5: (lv_arg_55_0= ruleSimpleExpression )
                    // InternalNuSMV.g:5486:6: lv_arg_55_0= ruleSimpleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalSimpleExpressionAccess().getArgSimpleExpressionParserRuleCall_16_3_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_arg_55_0=ruleSimpleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalSimpleExpressionRule());
                      						}
                      						set(
                      							current,
                      							"arg",
                      							lv_arg_55_0,
                      							"org.xtext.nusmv.language.NuSMV.SimpleExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_56=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_56, grammarAccess.getTerminalSimpleExpressionAccess().getRightParenthesisKeyword_16_4());
                      			
                    }

                    }


                    }
                    break;
                case 18 :
                    // InternalNuSMV.g:5509:3: ( () otherlv_58= 'toint' otherlv_59= '(' ( (lv_arg_60_0= ruleSimpleExpression ) ) otherlv_61= ')' )
                    {
                    // InternalNuSMV.g:5509:3: ( () otherlv_58= 'toint' otherlv_59= '(' ( (lv_arg_60_0= ruleSimpleExpression ) ) otherlv_61= ')' )
                    // InternalNuSMV.g:5510:4: () otherlv_58= 'toint' otherlv_59= '(' ( (lv_arg_60_0= ruleSimpleExpression ) ) otherlv_61= ')'
                    {
                    // InternalNuSMV.g:5510:4: ()
                    // InternalNuSMV.g:5511:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalSimpleExpressionAccess().getToIntAction_17_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_58=(Token)match(input,81,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_58, grammarAccess.getTerminalSimpleExpressionAccess().getTointKeyword_17_1());
                      			
                    }
                    otherlv_59=(Token)match(input,10,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_59, grammarAccess.getTerminalSimpleExpressionAccess().getLeftParenthesisKeyword_17_2());
                      			
                    }
                    // InternalNuSMV.g:5528:4: ( (lv_arg_60_0= ruleSimpleExpression ) )
                    // InternalNuSMV.g:5529:5: (lv_arg_60_0= ruleSimpleExpression )
                    {
                    // InternalNuSMV.g:5529:5: (lv_arg_60_0= ruleSimpleExpression )
                    // InternalNuSMV.g:5530:6: lv_arg_60_0= ruleSimpleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalSimpleExpressionAccess().getArgSimpleExpressionParserRuleCall_17_3_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_arg_60_0=ruleSimpleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalSimpleExpressionRule());
                      						}
                      						set(
                      							current,
                      							"arg",
                      							lv_arg_60_0,
                      							"org.xtext.nusmv.language.NuSMV.SimpleExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_61=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_61, grammarAccess.getTerminalSimpleExpressionAccess().getRightParenthesisKeyword_17_4());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleTerminalSimpleExpression"


    // $ANTLR start "entryRuleFormalParameter"
    // InternalNuSMV.g:5559:1: entryRuleFormalParameter returns [EObject current=null] : iv_ruleFormalParameter= ruleFormalParameter EOF ;
    public final EObject entryRuleFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalParameter = null;


        try {
            // InternalNuSMV.g:5559:56: (iv_ruleFormalParameter= ruleFormalParameter EOF )
            // InternalNuSMV.g:5560:2: iv_ruleFormalParameter= ruleFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormalParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFormalParameter=ruleFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFormalParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormalParameter"


    // $ANTLR start "ruleFormalParameter"
    // InternalNuSMV.g:5566:1: ruleFormalParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '.' )? this_ID_2= RULE_ID )* ) ;
    public final EObject ruleFormalParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalNuSMV.g:5572:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '.' )? this_ID_2= RULE_ID )* ) )
            // InternalNuSMV.g:5573:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '.' )? this_ID_2= RULE_ID )* )
            {
            // InternalNuSMV.g:5573:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '.' )? this_ID_2= RULE_ID )* )
            // InternalNuSMV.g:5574:3: ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '.' )? this_ID_2= RULE_ID )*
            {
            // InternalNuSMV.g:5574:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalNuSMV.g:5575:4: (lv_name_0_0= RULE_ID )
            {
            // InternalNuSMV.g:5575:4: (lv_name_0_0= RULE_ID )
            // InternalNuSMV.g:5576:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getFormalParameterAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFormalParameterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.xtext.nusmv.language.NuSMV.ID");
              				
            }

            }


            }

            // InternalNuSMV.g:5592:3: ( (otherlv_1= '.' )? this_ID_2= RULE_ID )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==RULE_ID||LA71_0==75) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalNuSMV.g:5593:4: (otherlv_1= '.' )? this_ID_2= RULE_ID
            	    {
            	    // InternalNuSMV.g:5593:4: (otherlv_1= '.' )?
            	    int alt70=2;
            	    int LA70_0 = input.LA(1);

            	    if ( (LA70_0==75) ) {
            	        alt70=1;
            	    }
            	    switch (alt70) {
            	        case 1 :
            	            // InternalNuSMV.g:5594:5: otherlv_1= '.'
            	            {
            	            otherlv_1=(Token)match(input,75,FOLLOW_4); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_1, grammarAccess.getFormalParameterAccess().getFullStopKeyword_1_0());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_50); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getFormalParameterAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormalParameter"


    // $ANTLR start "entryRuleCaseSimpleExpression"
    // InternalNuSMV.g:5608:1: entryRuleCaseSimpleExpression returns [EObject current=null] : iv_ruleCaseSimpleExpression= ruleCaseSimpleExpression EOF ;
    public final EObject entryRuleCaseSimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseSimpleExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:5610:2: (iv_ruleCaseSimpleExpression= ruleCaseSimpleExpression EOF )
            // InternalNuSMV.g:5611:2: iv_ruleCaseSimpleExpression= ruleCaseSimpleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseSimpleExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCaseSimpleExpression=ruleCaseSimpleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCaseSimpleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCaseSimpleExpression"


    // $ANTLR start "ruleCaseSimpleExpression"
    // InternalNuSMV.g:5620:1: ruleCaseSimpleExpression returns [EObject current=null] : (otherlv_0= 'case' ( (lv_branches_1_0= ruleCaseSimpleAssignementExpression ) )+ otherlv_2= 'esac' ) ;
    public final EObject ruleCaseSimpleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_branches_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:5627:2: ( (otherlv_0= 'case' ( (lv_branches_1_0= ruleCaseSimpleAssignementExpression ) )+ otherlv_2= 'esac' ) )
            // InternalNuSMV.g:5628:2: (otherlv_0= 'case' ( (lv_branches_1_0= ruleCaseSimpleAssignementExpression ) )+ otherlv_2= 'esac' )
            {
            // InternalNuSMV.g:5628:2: (otherlv_0= 'case' ( (lv_branches_1_0= ruleCaseSimpleAssignementExpression ) )+ otherlv_2= 'esac' )
            // InternalNuSMV.g:5629:3: otherlv_0= 'case' ( (lv_branches_1_0= ruleCaseSimpleAssignementExpression ) )+ otherlv_2= 'esac'
            {
            otherlv_0=(Token)match(input,82,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCaseSimpleExpressionAccess().getCaseKeyword_0());
              		
            }
            // InternalNuSMV.g:5633:3: ( (lv_branches_1_0= ruleCaseSimpleAssignementExpression ) )+
            int cnt72=0;
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( ((LA72_0>=RULE_ID && LA72_0<=RULE_INT)||LA72_0==10||LA72_0==23||LA72_0==43||(LA72_0>=49 && LA72_0<=50)||(LA72_0>=55 && LA72_0<=56)||(LA72_0>=61 && LA72_0<=74)||(LA72_0>=76 && LA72_0<=82)) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalNuSMV.g:5634:4: (lv_branches_1_0= ruleCaseSimpleAssignementExpression )
            	    {
            	    // InternalNuSMV.g:5634:4: (lv_branches_1_0= ruleCaseSimpleAssignementExpression )
            	    // InternalNuSMV.g:5635:5: lv_branches_1_0= ruleCaseSimpleAssignementExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCaseSimpleExpressionAccess().getBranchesCaseSimpleAssignementExpressionParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_51);
            	    lv_branches_1_0=ruleCaseSimpleAssignementExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getCaseSimpleExpressionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"branches",
            	      						lv_branches_1_0,
            	      						"org.xtext.nusmv.language.NuSMV.CaseSimpleAssignementExpression");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt72 >= 1 ) break loop72;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(72, input);
                        throw eee;
                }
                cnt72++;
            } while (true);

            otherlv_2=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCaseSimpleExpressionAccess().getEsacKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCaseSimpleExpression"


    // $ANTLR start "entryRuleCaseSimpleAssignementExpression"
    // InternalNuSMV.g:5663:1: entryRuleCaseSimpleAssignementExpression returns [EObject current=null] : iv_ruleCaseSimpleAssignementExpression= ruleCaseSimpleAssignementExpression EOF ;
    public final EObject entryRuleCaseSimpleAssignementExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseSimpleAssignementExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:5665:2: (iv_ruleCaseSimpleAssignementExpression= ruleCaseSimpleAssignementExpression EOF )
            // InternalNuSMV.g:5666:2: iv_ruleCaseSimpleAssignementExpression= ruleCaseSimpleAssignementExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseSimpleAssignementExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCaseSimpleAssignementExpression=ruleCaseSimpleAssignementExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCaseSimpleAssignementExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCaseSimpleAssignementExpression"


    // $ANTLR start "ruleCaseSimpleAssignementExpression"
    // InternalNuSMV.g:5675:1: ruleCaseSimpleAssignementExpression returns [EObject current=null] : ( ( (lv_case_0_0= ruleSimpleExpression ) ) otherlv_1= ':' ( (lv_assignment_2_0= ruleSimpleExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleCaseSimpleAssignementExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_case_0_0 = null;

        EObject lv_assignment_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:5682:2: ( ( ( (lv_case_0_0= ruleSimpleExpression ) ) otherlv_1= ':' ( (lv_assignment_2_0= ruleSimpleExpression ) ) otherlv_3= ';' ) )
            // InternalNuSMV.g:5683:2: ( ( (lv_case_0_0= ruleSimpleExpression ) ) otherlv_1= ':' ( (lv_assignment_2_0= ruleSimpleExpression ) ) otherlv_3= ';' )
            {
            // InternalNuSMV.g:5683:2: ( ( (lv_case_0_0= ruleSimpleExpression ) ) otherlv_1= ':' ( (lv_assignment_2_0= ruleSimpleExpression ) ) otherlv_3= ';' )
            // InternalNuSMV.g:5684:3: ( (lv_case_0_0= ruleSimpleExpression ) ) otherlv_1= ':' ( (lv_assignment_2_0= ruleSimpleExpression ) ) otherlv_3= ';'
            {
            // InternalNuSMV.g:5684:3: ( (lv_case_0_0= ruleSimpleExpression ) )
            // InternalNuSMV.g:5685:4: (lv_case_0_0= ruleSimpleExpression )
            {
            // InternalNuSMV.g:5685:4: (lv_case_0_0= ruleSimpleExpression )
            // InternalNuSMV.g:5686:5: lv_case_0_0= ruleSimpleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCaseSimpleAssignementExpressionAccess().getCaseSimpleExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_case_0_0=ruleSimpleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCaseSimpleAssignementExpressionRule());
              					}
              					set(
              						current,
              						"case",
              						lv_case_0_0,
              						"org.xtext.nusmv.language.NuSMV.SimpleExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCaseSimpleAssignementExpressionAccess().getColonKeyword_1());
              		
            }
            // InternalNuSMV.g:5707:3: ( (lv_assignment_2_0= ruleSimpleExpression ) )
            // InternalNuSMV.g:5708:4: (lv_assignment_2_0= ruleSimpleExpression )
            {
            // InternalNuSMV.g:5708:4: (lv_assignment_2_0= ruleSimpleExpression )
            // InternalNuSMV.g:5709:5: lv_assignment_2_0= ruleSimpleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCaseSimpleAssignementExpressionAccess().getAssignmentSimpleExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_assignment_2_0=ruleSimpleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCaseSimpleAssignementExpressionRule());
              					}
              					set(
              						current,
              						"assignment",
              						lv_assignment_2_0,
              						"org.xtext.nusmv.language.NuSMV.SimpleExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getCaseSimpleAssignementExpressionAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCaseSimpleAssignementExpression"


    // $ANTLR start "entryRuleCTLExpression"
    // InternalNuSMV.g:5737:1: entryRuleCTLExpression returns [EObject current=null] : iv_ruleCTLExpression= ruleCTLExpression EOF ;
    public final EObject entryRuleCTLExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCTLExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:5739:2: (iv_ruleCTLExpression= ruleCTLExpression EOF )
            // InternalNuSMV.g:5740:2: iv_ruleCTLExpression= ruleCTLExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCTLExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCTLExpression=ruleCTLExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCTLExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCTLExpression"


    // $ANTLR start "ruleCTLExpression"
    // InternalNuSMV.g:5749:1: ruleCTLExpression returns [EObject current=null] : ( (lv_simpleExpression_0_0= ruleSimpleExpression ) ) ;
    public final EObject ruleCTLExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_simpleExpression_0_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:5756:2: ( ( (lv_simpleExpression_0_0= ruleSimpleExpression ) ) )
            // InternalNuSMV.g:5757:2: ( (lv_simpleExpression_0_0= ruleSimpleExpression ) )
            {
            // InternalNuSMV.g:5757:2: ( (lv_simpleExpression_0_0= ruleSimpleExpression ) )
            // InternalNuSMV.g:5758:3: (lv_simpleExpression_0_0= ruleSimpleExpression )
            {
            // InternalNuSMV.g:5758:3: (lv_simpleExpression_0_0= ruleSimpleExpression )
            // InternalNuSMV.g:5759:4: lv_simpleExpression_0_0= ruleSimpleExpression
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getCTLExpressionAccess().getSimpleExpressionSimpleExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_simpleExpression_0_0=ruleSimpleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getCTLExpressionRule());
              				}
              				set(
              					current,
              					"simpleExpression",
              					lv_simpleExpression_0_0,
              					"org.xtext.nusmv.language.NuSMV.SimpleExpression");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCTLExpression"


    // $ANTLR start "entryRulePSLExpression"
    // InternalNuSMV.g:5782:1: entryRulePSLExpression returns [EObject current=null] : iv_rulePSLExpression= rulePSLExpression EOF ;
    public final EObject entryRulePSLExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePSLExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:5784:2: (iv_rulePSLExpression= rulePSLExpression EOF )
            // InternalNuSMV.g:5785:2: iv_rulePSLExpression= rulePSLExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPSLExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePSLExpression=rulePSLExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePSLExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulePSLExpression"


    // $ANTLR start "rulePSLExpression"
    // InternalNuSMV.g:5794:1: rulePSLExpression returns [EObject current=null] : ( (lv_simpleExpression_0_0= ruleSimpleExpression ) ) ;
    public final EObject rulePSLExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_simpleExpression_0_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:5801:2: ( ( (lv_simpleExpression_0_0= ruleSimpleExpression ) ) )
            // InternalNuSMV.g:5802:2: ( (lv_simpleExpression_0_0= ruleSimpleExpression ) )
            {
            // InternalNuSMV.g:5802:2: ( (lv_simpleExpression_0_0= ruleSimpleExpression ) )
            // InternalNuSMV.g:5803:3: (lv_simpleExpression_0_0= ruleSimpleExpression )
            {
            // InternalNuSMV.g:5803:3: (lv_simpleExpression_0_0= ruleSimpleExpression )
            // InternalNuSMV.g:5804:4: lv_simpleExpression_0_0= ruleSimpleExpression
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getPSLExpressionAccess().getSimpleExpressionSimpleExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_simpleExpression_0_0=ruleSimpleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getPSLExpressionRule());
              				}
              				set(
              					current,
              					"simpleExpression",
              					lv_simpleExpression_0_0,
              					"org.xtext.nusmv.language.NuSMV.SimpleExpression");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulePSLExpression"


    // $ANTLR start "entryRuleLTLExpression"
    // InternalNuSMV.g:5827:1: entryRuleLTLExpression returns [EObject current=null] : iv_ruleLTLExpression= ruleLTLExpression EOF ;
    public final EObject entryRuleLTLExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLTLExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:5829:2: (iv_ruleLTLExpression= ruleLTLExpression EOF )
            // InternalNuSMV.g:5830:2: iv_ruleLTLExpression= ruleLTLExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLTLExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLTLExpression=ruleLTLExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLTLExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleLTLExpression"


    // $ANTLR start "ruleLTLExpression"
    // InternalNuSMV.g:5839:1: ruleLTLExpression returns [EObject current=null] : ( (lv_simpleExpression_0_0= ruleSimpleExpression ) ) ;
    public final EObject ruleLTLExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_simpleExpression_0_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:5846:2: ( ( (lv_simpleExpression_0_0= ruleSimpleExpression ) ) )
            // InternalNuSMV.g:5847:2: ( (lv_simpleExpression_0_0= ruleSimpleExpression ) )
            {
            // InternalNuSMV.g:5847:2: ( (lv_simpleExpression_0_0= ruleSimpleExpression ) )
            // InternalNuSMV.g:5848:3: (lv_simpleExpression_0_0= ruleSimpleExpression )
            {
            // InternalNuSMV.g:5848:3: (lv_simpleExpression_0_0= ruleSimpleExpression )
            // InternalNuSMV.g:5849:4: lv_simpleExpression_0_0= ruleSimpleExpression
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getLTLExpressionAccess().getSimpleExpressionSimpleExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_simpleExpression_0_0=ruleSimpleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getLTLExpressionRule());
              				}
              				set(
              					current,
              					"simpleExpression",
              					lv_simpleExpression_0_0,
              					"org.xtext.nusmv.language.NuSMV.SimpleExpression");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleLTLExpression"


    // $ANTLR start "entryRuleRangeExpression"
    // InternalNuSMV.g:5872:1: entryRuleRangeExpression returns [EObject current=null] : iv_ruleRangeExpression= ruleRangeExpression EOF ;
    public final EObject entryRuleRangeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeExpression = null;


        try {
            // InternalNuSMV.g:5872:56: (iv_ruleRangeExpression= ruleRangeExpression EOF )
            // InternalNuSMV.g:5873:2: iv_ruleRangeExpression= ruleRangeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRangeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRangeExpression=ruleRangeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRangeExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRangeExpression"


    // $ANTLR start "ruleRangeExpression"
    // InternalNuSMV.g:5879:1: ruleRangeExpression returns [EObject current=null] : ( ( (lv_lower_0_0= ruleNUMBER ) ) otherlv_1= '..' ( (lv_upper_2_0= ruleNUMBER ) ) ) ;
    public final EObject ruleRangeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_lower_0_0 = null;

        AntlrDatatypeRuleToken lv_upper_2_0 = null;



        	enterRule();

        try {
            // InternalNuSMV.g:5885:2: ( ( ( (lv_lower_0_0= ruleNUMBER ) ) otherlv_1= '..' ( (lv_upper_2_0= ruleNUMBER ) ) ) )
            // InternalNuSMV.g:5886:2: ( ( (lv_lower_0_0= ruleNUMBER ) ) otherlv_1= '..' ( (lv_upper_2_0= ruleNUMBER ) ) )
            {
            // InternalNuSMV.g:5886:2: ( ( (lv_lower_0_0= ruleNUMBER ) ) otherlv_1= '..' ( (lv_upper_2_0= ruleNUMBER ) ) )
            // InternalNuSMV.g:5887:3: ( (lv_lower_0_0= ruleNUMBER ) ) otherlv_1= '..' ( (lv_upper_2_0= ruleNUMBER ) )
            {
            // InternalNuSMV.g:5887:3: ( (lv_lower_0_0= ruleNUMBER ) )
            // InternalNuSMV.g:5888:4: (lv_lower_0_0= ruleNUMBER )
            {
            // InternalNuSMV.g:5888:4: (lv_lower_0_0= ruleNUMBER )
            // InternalNuSMV.g:5889:5: lv_lower_0_0= ruleNUMBER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRangeExpressionAccess().getLowerNUMBERParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_28);
            lv_lower_0_0=ruleNUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRangeExpressionRule());
              					}
              					set(
              						current,
              						"lower",
              						lv_lower_0_0,
              						"org.xtext.nusmv.language.NuSMV.NUMBER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,45,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRangeExpressionAccess().getFullStopFullStopKeyword_1());
              		
            }
            // InternalNuSMV.g:5910:3: ( (lv_upper_2_0= ruleNUMBER ) )
            // InternalNuSMV.g:5911:4: (lv_upper_2_0= ruleNUMBER )
            {
            // InternalNuSMV.g:5911:4: (lv_upper_2_0= ruleNUMBER )
            // InternalNuSMV.g:5912:5: lv_upper_2_0= ruleNUMBER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRangeExpressionAccess().getUpperNUMBERParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_upper_2_0=ruleNUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRangeExpressionRule());
              					}
              					set(
              						current,
              						"upper",
              						lv_upper_2_0,
              						"org.xtext.nusmv.language.NuSMV.NUMBER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRangeExpression"


    // $ANTLR start "entryRuleRTCTLExpression"
    // InternalNuSMV.g:5933:1: entryRuleRTCTLExpression returns [EObject current=null] : iv_ruleRTCTLExpression= ruleRTCTLExpression EOF ;
    public final EObject entryRuleRTCTLExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRTCTLExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:5935:2: (iv_ruleRTCTLExpression= ruleRTCTLExpression EOF )
            // InternalNuSMV.g:5936:2: iv_ruleRTCTLExpression= ruleRTCTLExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRTCTLExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRTCTLExpression=ruleRTCTLExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRTCTLExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleRTCTLExpression"


    // $ANTLR start "ruleRTCTLExpression"
    // InternalNuSMV.g:5945:1: ruleRTCTLExpression returns [EObject current=null] : ( ( () ( ( (lv_ctlExpression_1_1= ruleCTLExpression | lv_ctlExpression_1_2= ruleFormalParameter ) ) ) ) | ( () ( ( (lv_unary_3_1= 'EBF' | lv_unary_3_2= 'ABF' | lv_unary_3_3= 'EBG' | lv_unary_3_4= 'ABG' ) ) ) ( (lv_range_4_0= ruleRangeExpression ) ) ( (lv_rctl_5_0= ruleRTCTLExpression ) ) ) ) ;
    public final EObject ruleRTCTLExpression() throws RecognitionException {
        EObject current = null;

        Token lv_unary_3_1=null;
        Token lv_unary_3_2=null;
        Token lv_unary_3_3=null;
        Token lv_unary_3_4=null;
        EObject lv_ctlExpression_1_1 = null;

        EObject lv_ctlExpression_1_2 = null;

        EObject lv_range_4_0 = null;

        EObject lv_rctl_5_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:5952:2: ( ( ( () ( ( (lv_ctlExpression_1_1= ruleCTLExpression | lv_ctlExpression_1_2= ruleFormalParameter ) ) ) ) | ( () ( ( (lv_unary_3_1= 'EBF' | lv_unary_3_2= 'ABF' | lv_unary_3_3= 'EBG' | lv_unary_3_4= 'ABG' ) ) ) ( (lv_range_4_0= ruleRangeExpression ) ) ( (lv_rctl_5_0= ruleRTCTLExpression ) ) ) ) )
            // InternalNuSMV.g:5953:2: ( ( () ( ( (lv_ctlExpression_1_1= ruleCTLExpression | lv_ctlExpression_1_2= ruleFormalParameter ) ) ) ) | ( () ( ( (lv_unary_3_1= 'EBF' | lv_unary_3_2= 'ABF' | lv_unary_3_3= 'EBG' | lv_unary_3_4= 'ABG' ) ) ) ( (lv_range_4_0= ruleRangeExpression ) ) ( (lv_rctl_5_0= ruleRTCTLExpression ) ) ) )
            {
            // InternalNuSMV.g:5953:2: ( ( () ( ( (lv_ctlExpression_1_1= ruleCTLExpression | lv_ctlExpression_1_2= ruleFormalParameter ) ) ) ) | ( () ( ( (lv_unary_3_1= 'EBF' | lv_unary_3_2= 'ABF' | lv_unary_3_3= 'EBG' | lv_unary_3_4= 'ABG' ) ) ) ( (lv_range_4_0= ruleRangeExpression ) ) ( (lv_rctl_5_0= ruleRTCTLExpression ) ) ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=RULE_ID && LA75_0<=RULE_INT)||LA75_0==10||LA75_0==23||LA75_0==43||(LA75_0>=49 && LA75_0<=50)||(LA75_0>=55 && LA75_0<=56)||(LA75_0>=61 && LA75_0<=74)||(LA75_0>=76 && LA75_0<=82)) ) {
                alt75=1;
            }
            else if ( ((LA75_0>=84 && LA75_0<=87)) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalNuSMV.g:5954:3: ( () ( ( (lv_ctlExpression_1_1= ruleCTLExpression | lv_ctlExpression_1_2= ruleFormalParameter ) ) ) )
                    {
                    // InternalNuSMV.g:5954:3: ( () ( ( (lv_ctlExpression_1_1= ruleCTLExpression | lv_ctlExpression_1_2= ruleFormalParameter ) ) ) )
                    // InternalNuSMV.g:5955:4: () ( ( (lv_ctlExpression_1_1= ruleCTLExpression | lv_ctlExpression_1_2= ruleFormalParameter ) ) )
                    {
                    // InternalNuSMV.g:5955:4: ()
                    // InternalNuSMV.g:5956:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getRTCTLExpressionAccess().getSingleRTCTLExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNuSMV.g:5965:4: ( ( (lv_ctlExpression_1_1= ruleCTLExpression | lv_ctlExpression_1_2= ruleFormalParameter ) ) )
                    // InternalNuSMV.g:5966:5: ( (lv_ctlExpression_1_1= ruleCTLExpression | lv_ctlExpression_1_2= ruleFormalParameter ) )
                    {
                    // InternalNuSMV.g:5966:5: ( (lv_ctlExpression_1_1= ruleCTLExpression | lv_ctlExpression_1_2= ruleFormalParameter ) )
                    // InternalNuSMV.g:5967:6: (lv_ctlExpression_1_1= ruleCTLExpression | lv_ctlExpression_1_2= ruleFormalParameter )
                    {
                    // InternalNuSMV.g:5967:6: (lv_ctlExpression_1_1= ruleCTLExpression | lv_ctlExpression_1_2= ruleFormalParameter )
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( ((LA73_0>=RULE_WORD && LA73_0<=RULE_INT)||LA73_0==10||LA73_0==23||LA73_0==43||(LA73_0>=49 && LA73_0<=50)||(LA73_0>=55 && LA73_0<=56)||(LA73_0>=61 && LA73_0<=74)||(LA73_0>=76 && LA73_0<=82)) ) {
                        alt73=1;
                    }
                    else if ( (LA73_0==RULE_ID) ) {
                        int LA73_2 = input.LA(2);

                        if ( (synpred159_InternalNuSMV()) ) {
                            alt73=1;
                        }
                        else if ( (true) ) {
                            alt73=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 73, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 0, input);

                        throw nvae;
                    }
                    switch (alt73) {
                        case 1 :
                            // InternalNuSMV.g:5968:7: lv_ctlExpression_1_1= ruleCTLExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getRTCTLExpressionAccess().getCtlExpressionCTLExpressionParserRuleCall_0_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_ctlExpression_1_1=ruleCTLExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getRTCTLExpressionRule());
                              							}
                              							set(
                              								current,
                              								"ctlExpression",
                              								lv_ctlExpression_1_1,
                              								"org.xtext.nusmv.language.NuSMV.CTLExpression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalNuSMV.g:5984:7: lv_ctlExpression_1_2= ruleFormalParameter
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getRTCTLExpressionAccess().getCtlExpressionFormalParameterParserRuleCall_0_1_0_1());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_ctlExpression_1_2=ruleFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getRTCTLExpressionRule());
                              							}
                              							set(
                              								current,
                              								"ctlExpression",
                              								lv_ctlExpression_1_2,
                              								"org.xtext.nusmv.language.NuSMV.FormalParameter");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNuSMV.g:6004:3: ( () ( ( (lv_unary_3_1= 'EBF' | lv_unary_3_2= 'ABF' | lv_unary_3_3= 'EBG' | lv_unary_3_4= 'ABG' ) ) ) ( (lv_range_4_0= ruleRangeExpression ) ) ( (lv_rctl_5_0= ruleRTCTLExpression ) ) )
                    {
                    // InternalNuSMV.g:6004:3: ( () ( ( (lv_unary_3_1= 'EBF' | lv_unary_3_2= 'ABF' | lv_unary_3_3= 'EBG' | lv_unary_3_4= 'ABG' ) ) ) ( (lv_range_4_0= ruleRangeExpression ) ) ( (lv_rctl_5_0= ruleRTCTLExpression ) ) )
                    // InternalNuSMV.g:6005:4: () ( ( (lv_unary_3_1= 'EBF' | lv_unary_3_2= 'ABF' | lv_unary_3_3= 'EBG' | lv_unary_3_4= 'ABG' ) ) ) ( (lv_range_4_0= ruleRangeExpression ) ) ( (lv_rctl_5_0= ruleRTCTLExpression ) )
                    {
                    // InternalNuSMV.g:6005:4: ()
                    // InternalNuSMV.g:6006:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getRTCTLExpressionAccess().getUnaryRTCTLExpressionAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNuSMV.g:6015:4: ( ( (lv_unary_3_1= 'EBF' | lv_unary_3_2= 'ABF' | lv_unary_3_3= 'EBG' | lv_unary_3_4= 'ABG' ) ) )
                    // InternalNuSMV.g:6016:5: ( (lv_unary_3_1= 'EBF' | lv_unary_3_2= 'ABF' | lv_unary_3_3= 'EBG' | lv_unary_3_4= 'ABG' ) )
                    {
                    // InternalNuSMV.g:6016:5: ( (lv_unary_3_1= 'EBF' | lv_unary_3_2= 'ABF' | lv_unary_3_3= 'EBG' | lv_unary_3_4= 'ABG' ) )
                    // InternalNuSMV.g:6017:6: (lv_unary_3_1= 'EBF' | lv_unary_3_2= 'ABF' | lv_unary_3_3= 'EBG' | lv_unary_3_4= 'ABG' )
                    {
                    // InternalNuSMV.g:6017:6: (lv_unary_3_1= 'EBF' | lv_unary_3_2= 'ABF' | lv_unary_3_3= 'EBG' | lv_unary_3_4= 'ABG' )
                    int alt74=4;
                    switch ( input.LA(1) ) {
                    case 84:
                        {
                        alt74=1;
                        }
                        break;
                    case 85:
                        {
                        alt74=2;
                        }
                        break;
                    case 86:
                        {
                        alt74=3;
                        }
                        break;
                    case 87:
                        {
                        alt74=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 74, 0, input);

                        throw nvae;
                    }

                    switch (alt74) {
                        case 1 :
                            // InternalNuSMV.g:6018:7: lv_unary_3_1= 'EBF'
                            {
                            lv_unary_3_1=(Token)match(input,84,FOLLOW_23); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_unary_3_1, grammarAccess.getRTCTLExpressionAccess().getUnaryEBFKeyword_1_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getRTCTLExpressionRule());
                              							}
                              							setWithLastConsumed(current, "unary", lv_unary_3_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalNuSMV.g:6029:7: lv_unary_3_2= 'ABF'
                            {
                            lv_unary_3_2=(Token)match(input,85,FOLLOW_23); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_unary_3_2, grammarAccess.getRTCTLExpressionAccess().getUnaryABFKeyword_1_1_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getRTCTLExpressionRule());
                              							}
                              							setWithLastConsumed(current, "unary", lv_unary_3_2, null);
                              						
                            }

                            }
                            break;
                        case 3 :
                            // InternalNuSMV.g:6040:7: lv_unary_3_3= 'EBG'
                            {
                            lv_unary_3_3=(Token)match(input,86,FOLLOW_23); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_unary_3_3, grammarAccess.getRTCTLExpressionAccess().getUnaryEBGKeyword_1_1_0_2());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getRTCTLExpressionRule());
                              							}
                              							setWithLastConsumed(current, "unary", lv_unary_3_3, null);
                              						
                            }

                            }
                            break;
                        case 4 :
                            // InternalNuSMV.g:6051:7: lv_unary_3_4= 'ABG'
                            {
                            lv_unary_3_4=(Token)match(input,87,FOLLOW_23); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_unary_3_4, grammarAccess.getRTCTLExpressionAccess().getUnaryABGKeyword_1_1_0_3());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getRTCTLExpressionRule());
                              							}
                              							setWithLastConsumed(current, "unary", lv_unary_3_4, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalNuSMV.g:6064:4: ( (lv_range_4_0= ruleRangeExpression ) )
                    // InternalNuSMV.g:6065:5: (lv_range_4_0= ruleRangeExpression )
                    {
                    // InternalNuSMV.g:6065:5: (lv_range_4_0= ruleRangeExpression )
                    // InternalNuSMV.g:6066:6: lv_range_4_0= ruleRangeExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRTCTLExpressionAccess().getRangeRangeExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_52);
                    lv_range_4_0=ruleRangeExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRTCTLExpressionRule());
                      						}
                      						set(
                      							current,
                      							"range",
                      							lv_range_4_0,
                      							"org.xtext.nusmv.language.NuSMV.RangeExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNuSMV.g:6083:4: ( (lv_rctl_5_0= ruleRTCTLExpression ) )
                    // InternalNuSMV.g:6084:5: (lv_rctl_5_0= ruleRTCTLExpression )
                    {
                    // InternalNuSMV.g:6084:5: (lv_rctl_5_0= ruleRTCTLExpression )
                    // InternalNuSMV.g:6085:6: lv_rctl_5_0= ruleRTCTLExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRTCTLExpressionAccess().getRctlRTCTLExpressionParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_rctl_5_0=ruleRTCTLExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRTCTLExpressionRule());
                      						}
                      						set(
                      							current,
                      							"rctl",
                      							lv_rctl_5_0,
                      							"org.xtext.nusmv.language.NuSMV.RTCTLExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleRTCTLExpression"


    // $ANTLR start "entryRuleComputeSpecification"
    // InternalNuSMV.g:6110:1: entryRuleComputeSpecification returns [EObject current=null] : iv_ruleComputeSpecification= ruleComputeSpecification EOF ;
    public final EObject entryRuleComputeSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputeSpecification = null;


        try {
            // InternalNuSMV.g:6110:61: (iv_ruleComputeSpecification= ruleComputeSpecification EOF )
            // InternalNuSMV.g:6111:2: iv_ruleComputeSpecification= ruleComputeSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComputeSpecificationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComputeSpecification=ruleComputeSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComputeSpecification; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComputeSpecification"


    // $ANTLR start "ruleComputeSpecification"
    // InternalNuSMV.g:6117:1: ruleComputeSpecification returns [EObject current=null] : (otherlv_0= 'COMPUTE' ( ( (lv_minMax_1_1= 'MIN' | lv_minMax_1_2= 'MAX' ) ) ) otherlv_2= '[' ( (lv_first_3_0= ruleRTCTLExpression ) ) otherlv_4= ',' ( (lv_second_5_0= ruleRTCTLExpression ) ) otherlv_6= ']' ( (lv_semicolon_7_0= ';' ) )? ) ;
    public final EObject ruleComputeSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_minMax_1_1=null;
        Token lv_minMax_1_2=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_semicolon_7_0=null;
        EObject lv_first_3_0 = null;

        EObject lv_second_5_0 = null;



        	enterRule();

        try {
            // InternalNuSMV.g:6123:2: ( (otherlv_0= 'COMPUTE' ( ( (lv_minMax_1_1= 'MIN' | lv_minMax_1_2= 'MAX' ) ) ) otherlv_2= '[' ( (lv_first_3_0= ruleRTCTLExpression ) ) otherlv_4= ',' ( (lv_second_5_0= ruleRTCTLExpression ) ) otherlv_6= ']' ( (lv_semicolon_7_0= ';' ) )? ) )
            // InternalNuSMV.g:6124:2: (otherlv_0= 'COMPUTE' ( ( (lv_minMax_1_1= 'MIN' | lv_minMax_1_2= 'MAX' ) ) ) otherlv_2= '[' ( (lv_first_3_0= ruleRTCTLExpression ) ) otherlv_4= ',' ( (lv_second_5_0= ruleRTCTLExpression ) ) otherlv_6= ']' ( (lv_semicolon_7_0= ';' ) )? )
            {
            // InternalNuSMV.g:6124:2: (otherlv_0= 'COMPUTE' ( ( (lv_minMax_1_1= 'MIN' | lv_minMax_1_2= 'MAX' ) ) ) otherlv_2= '[' ( (lv_first_3_0= ruleRTCTLExpression ) ) otherlv_4= ',' ( (lv_second_5_0= ruleRTCTLExpression ) ) otherlv_6= ']' ( (lv_semicolon_7_0= ';' ) )? )
            // InternalNuSMV.g:6125:3: otherlv_0= 'COMPUTE' ( ( (lv_minMax_1_1= 'MIN' | lv_minMax_1_2= 'MAX' ) ) ) otherlv_2= '[' ( (lv_first_3_0= ruleRTCTLExpression ) ) otherlv_4= ',' ( (lv_second_5_0= ruleRTCTLExpression ) ) otherlv_6= ']' ( (lv_semicolon_7_0= ';' ) )?
            {
            otherlv_0=(Token)match(input,88,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getComputeSpecificationAccess().getCOMPUTEKeyword_0());
              		
            }
            // InternalNuSMV.g:6129:3: ( ( (lv_minMax_1_1= 'MIN' | lv_minMax_1_2= 'MAX' ) ) )
            // InternalNuSMV.g:6130:4: ( (lv_minMax_1_1= 'MIN' | lv_minMax_1_2= 'MAX' ) )
            {
            // InternalNuSMV.g:6130:4: ( (lv_minMax_1_1= 'MIN' | lv_minMax_1_2= 'MAX' ) )
            // InternalNuSMV.g:6131:5: (lv_minMax_1_1= 'MIN' | lv_minMax_1_2= 'MAX' )
            {
            // InternalNuSMV.g:6131:5: (lv_minMax_1_1= 'MIN' | lv_minMax_1_2= 'MAX' )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==89) ) {
                alt76=1;
            }
            else if ( (LA76_0==90) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // InternalNuSMV.g:6132:6: lv_minMax_1_1= 'MIN'
                    {
                    lv_minMax_1_1=(Token)match(input,89,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_minMax_1_1, grammarAccess.getComputeSpecificationAccess().getMinMaxMINKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getComputeSpecificationRule());
                      						}
                      						setWithLastConsumed(current, "minMax", lv_minMax_1_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalNuSMV.g:6143:6: lv_minMax_1_2= 'MAX'
                    {
                    lv_minMax_1_2=(Token)match(input,90,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_minMax_1_2, grammarAccess.getComputeSpecificationAccess().getMinMaxMAXKeyword_1_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getComputeSpecificationRule());
                      						}
                      						setWithLastConsumed(current, "minMax", lv_minMax_1_2, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getComputeSpecificationAccess().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalNuSMV.g:6160:3: ( (lv_first_3_0= ruleRTCTLExpression ) )
            // InternalNuSMV.g:6161:4: (lv_first_3_0= ruleRTCTLExpression )
            {
            // InternalNuSMV.g:6161:4: (lv_first_3_0= ruleRTCTLExpression )
            // InternalNuSMV.g:6162:5: lv_first_3_0= ruleRTCTLExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComputeSpecificationAccess().getFirstRTCTLExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_first_3_0=ruleRTCTLExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getComputeSpecificationRule());
              					}
              					set(
              						current,
              						"first",
              						lv_first_3_0,
              						"org.xtext.nusmv.language.NuSMV.RTCTLExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,11,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getComputeSpecificationAccess().getCommaKeyword_4());
              		
            }
            // InternalNuSMV.g:6183:3: ( (lv_second_5_0= ruleRTCTLExpression ) )
            // InternalNuSMV.g:6184:4: (lv_second_5_0= ruleRTCTLExpression )
            {
            // InternalNuSMV.g:6184:4: (lv_second_5_0= ruleRTCTLExpression )
            // InternalNuSMV.g:6185:5: lv_second_5_0= ruleRTCTLExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComputeSpecificationAccess().getSecondRTCTLExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_second_5_0=ruleRTCTLExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getComputeSpecificationRule());
              					}
              					set(
              						current,
              						"second",
              						lv_second_5_0,
              						"org.xtext.nusmv.language.NuSMV.RTCTLExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,40,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getComputeSpecificationAccess().getRightSquareBracketKeyword_6());
              		
            }
            // InternalNuSMV.g:6206:3: ( (lv_semicolon_7_0= ';' ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==17) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalNuSMV.g:6207:4: (lv_semicolon_7_0= ';' )
                    {
                    // InternalNuSMV.g:6207:4: (lv_semicolon_7_0= ';' )
                    // InternalNuSMV.g:6208:5: lv_semicolon_7_0= ';'
                    {
                    lv_semicolon_7_0=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_semicolon_7_0, grammarAccess.getComputeSpecificationAccess().getSemicolonSemicolonKeyword_7_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getComputeSpecificationRule());
                      					}
                      					setWithLastConsumed(current, "semicolon", true, ";");
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComputeSpecification"


    // $ANTLR start "entryRuleVariableID"
    // InternalNuSMV.g:6224:1: entryRuleVariableID returns [String current=null] : iv_ruleVariableID= ruleVariableID EOF ;
    public final String entryRuleVariableID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableID = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:6226:2: (iv_ruleVariableID= ruleVariableID EOF )
            // InternalNuSMV.g:6227:2: iv_ruleVariableID= ruleVariableID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableIDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariableID=ruleVariableID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableID.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleVariableID"


    // $ANTLR start "ruleVariableID"
    // InternalNuSMV.g:6236:1: ruleVariableID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TerminalVariableID_0= ruleTerminalVariableID ( (kw= '.' this_TerminalVariableID_2= ruleTerminalVariableID ) | (kw= '[' (this_NUMBER_4= ruleNUMBER | this_TerminalVariableID_5= ruleTerminalVariableID ) kw= ']' ) | (kw= '[' this_NUMBER_8= ruleNUMBER kw= ':' this_NUMBER_10= ruleNUMBER kw= ']' ) )* ) ;
    public final AntlrDatatypeRuleToken ruleVariableID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TerminalVariableID_0 = null;

        AntlrDatatypeRuleToken this_TerminalVariableID_2 = null;

        AntlrDatatypeRuleToken this_NUMBER_4 = null;

        AntlrDatatypeRuleToken this_TerminalVariableID_5 = null;

        AntlrDatatypeRuleToken this_NUMBER_8 = null;

        AntlrDatatypeRuleToken this_NUMBER_10 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:6243:2: ( (this_TerminalVariableID_0= ruleTerminalVariableID ( (kw= '.' this_TerminalVariableID_2= ruleTerminalVariableID ) | (kw= '[' (this_NUMBER_4= ruleNUMBER | this_TerminalVariableID_5= ruleTerminalVariableID ) kw= ']' ) | (kw= '[' this_NUMBER_8= ruleNUMBER kw= ':' this_NUMBER_10= ruleNUMBER kw= ']' ) )* ) )
            // InternalNuSMV.g:6244:2: (this_TerminalVariableID_0= ruleTerminalVariableID ( (kw= '.' this_TerminalVariableID_2= ruleTerminalVariableID ) | (kw= '[' (this_NUMBER_4= ruleNUMBER | this_TerminalVariableID_5= ruleTerminalVariableID ) kw= ']' ) | (kw= '[' this_NUMBER_8= ruleNUMBER kw= ':' this_NUMBER_10= ruleNUMBER kw= ']' ) )* )
            {
            // InternalNuSMV.g:6244:2: (this_TerminalVariableID_0= ruleTerminalVariableID ( (kw= '.' this_TerminalVariableID_2= ruleTerminalVariableID ) | (kw= '[' (this_NUMBER_4= ruleNUMBER | this_TerminalVariableID_5= ruleTerminalVariableID ) kw= ']' ) | (kw= '[' this_NUMBER_8= ruleNUMBER kw= ':' this_NUMBER_10= ruleNUMBER kw= ']' ) )* )
            // InternalNuSMV.g:6245:3: this_TerminalVariableID_0= ruleTerminalVariableID ( (kw= '.' this_TerminalVariableID_2= ruleTerminalVariableID ) | (kw= '[' (this_NUMBER_4= ruleNUMBER | this_TerminalVariableID_5= ruleTerminalVariableID ) kw= ']' ) | (kw= '[' this_NUMBER_8= ruleNUMBER kw= ':' this_NUMBER_10= ruleNUMBER kw= ']' ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVariableIDAccess().getTerminalVariableIDParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_49);
            this_TerminalVariableID_0=ruleTerminalVariableID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_TerminalVariableID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalNuSMV.g:6255:3: ( (kw= '.' this_TerminalVariableID_2= ruleTerminalVariableID ) | (kw= '[' (this_NUMBER_4= ruleNUMBER | this_TerminalVariableID_5= ruleTerminalVariableID ) kw= ']' ) | (kw= '[' this_NUMBER_8= ruleNUMBER kw= ':' this_NUMBER_10= ruleNUMBER kw= ']' ) )*
            loop79:
            do {
                int alt79=4;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==39) ) {
                    switch ( input.LA(2) ) {
                    case 55:
                        {
                        int LA79_4 = input.LA(3);

                        if ( (LA79_4==RULE_INT) ) {
                            int LA79_5 = input.LA(4);

                            if ( (LA79_5==40) ) {
                                int LA79_7 = input.LA(5);

                                if ( (synpred168_InternalNuSMV()) ) {
                                    alt79=2;
                                }


                            }
                            else if ( (LA79_5==16) ) {
                                alt79=3;
                            }


                        }


                        }
                        break;
                    case RULE_INT:
                        {
                        int LA79_5 = input.LA(3);

                        if ( (LA79_5==40) ) {
                            int LA79_7 = input.LA(4);

                            if ( (synpred168_InternalNuSMV()) ) {
                                alt79=2;
                            }


                        }
                        else if ( (LA79_5==16) ) {
                            alt79=3;
                        }


                        }
                        break;
                    case RULE_ID:
                        {
                        alt79=2;
                        }
                        break;

                    }

                }
                else if ( (LA79_0==75) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalNuSMV.g:6256:4: (kw= '.' this_TerminalVariableID_2= ruleTerminalVariableID )
            	    {
            	    // InternalNuSMV.g:6256:4: (kw= '.' this_TerminalVariableID_2= ruleTerminalVariableID )
            	    // InternalNuSMV.g:6257:5: kw= '.' this_TerminalVariableID_2= ruleTerminalVariableID
            	    {
            	    kw=(Token)match(input,75,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(kw);
            	      					newLeafNode(kw, grammarAccess.getVariableIDAccess().getFullStopKeyword_1_0_0());
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVariableIDAccess().getTerminalVariableIDParserRuleCall_1_0_1());
            	      				
            	    }
            	    pushFollow(FOLLOW_49);
            	    this_TerminalVariableID_2=ruleTerminalVariableID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(this_TerminalVariableID_2);
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalNuSMV.g:6274:4: (kw= '[' (this_NUMBER_4= ruleNUMBER | this_TerminalVariableID_5= ruleTerminalVariableID ) kw= ']' )
            	    {
            	    // InternalNuSMV.g:6274:4: (kw= '[' (this_NUMBER_4= ruleNUMBER | this_TerminalVariableID_5= ruleTerminalVariableID ) kw= ']' )
            	    // InternalNuSMV.g:6275:5: kw= '[' (this_NUMBER_4= ruleNUMBER | this_TerminalVariableID_5= ruleTerminalVariableID ) kw= ']'
            	    {
            	    kw=(Token)match(input,39,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(kw);
            	      					newLeafNode(kw, grammarAccess.getVariableIDAccess().getLeftSquareBracketKeyword_1_1_0());
            	      				
            	    }
            	    // InternalNuSMV.g:6280:5: (this_NUMBER_4= ruleNUMBER | this_TerminalVariableID_5= ruleTerminalVariableID )
            	    int alt78=2;
            	    int LA78_0 = input.LA(1);

            	    if ( (LA78_0==RULE_INT||LA78_0==55) ) {
            	        alt78=1;
            	    }
            	    else if ( (LA78_0==RULE_ID) ) {
            	        alt78=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 78, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt78) {
            	        case 1 :
            	            // InternalNuSMV.g:6281:6: this_NUMBER_4= ruleNUMBER
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getVariableIDAccess().getNUMBERParserRuleCall_1_1_1_0());
            	              					
            	            }
            	            pushFollow(FOLLOW_24);
            	            this_NUMBER_4=ruleNUMBER();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						current.merge(this_NUMBER_4);
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalNuSMV.g:6292:6: this_TerminalVariableID_5= ruleTerminalVariableID
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getVariableIDAccess().getTerminalVariableIDParserRuleCall_1_1_1_1());
            	              					
            	            }
            	            pushFollow(FOLLOW_24);
            	            this_TerminalVariableID_5=ruleTerminalVariableID();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						current.merge(this_TerminalVariableID_5);
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;

            	    }

            	    kw=(Token)match(input,40,FOLLOW_49); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(kw);
            	      					newLeafNode(kw, grammarAccess.getVariableIDAccess().getRightSquareBracketKeyword_1_1_2());
            	      				
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalNuSMV.g:6310:4: (kw= '[' this_NUMBER_8= ruleNUMBER kw= ':' this_NUMBER_10= ruleNUMBER kw= ']' )
            	    {
            	    // InternalNuSMV.g:6310:4: (kw= '[' this_NUMBER_8= ruleNUMBER kw= ':' this_NUMBER_10= ruleNUMBER kw= ']' )
            	    // InternalNuSMV.g:6311:5: kw= '[' this_NUMBER_8= ruleNUMBER kw= ':' this_NUMBER_10= ruleNUMBER kw= ']'
            	    {
            	    kw=(Token)match(input,39,FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(kw);
            	      					newLeafNode(kw, grammarAccess.getVariableIDAccess().getLeftSquareBracketKeyword_1_2_0());
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVariableIDAccess().getNUMBERParserRuleCall_1_2_1());
            	      				
            	    }
            	    pushFollow(FOLLOW_9);
            	    this_NUMBER_8=ruleNUMBER();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(this_NUMBER_8);
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					afterParserOrEnumRuleCall();
            	      				
            	    }
            	    kw=(Token)match(input,16,FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(kw);
            	      					newLeafNode(kw, grammarAccess.getVariableIDAccess().getColonKeyword_1_2_2());
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVariableIDAccess().getNUMBERParserRuleCall_1_2_3());
            	      				
            	    }
            	    pushFollow(FOLLOW_24);
            	    this_NUMBER_10=ruleNUMBER();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(this_NUMBER_10);
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					afterParserOrEnumRuleCall();
            	      				
            	    }
            	    kw=(Token)match(input,40,FOLLOW_49); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(kw);
            	      					newLeafNode(kw, grammarAccess.getVariableIDAccess().getRightSquareBracketKeyword_1_2_4());
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleVariableID"


    // $ANTLR start "entryRuleTerminalVariableID"
    // InternalNuSMV.g:6355:1: entryRuleTerminalVariableID returns [String current=null] : iv_ruleTerminalVariableID= ruleTerminalVariableID EOF ;
    public final String entryRuleTerminalVariableID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTerminalVariableID = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:6357:2: (iv_ruleTerminalVariableID= ruleTerminalVariableID EOF )
            // InternalNuSMV.g:6358:2: iv_ruleTerminalVariableID= ruleTerminalVariableID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminalVariableIDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTerminalVariableID=ruleTerminalVariableID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerminalVariableID.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleTerminalVariableID"


    // $ANTLR start "ruleTerminalVariableID"
    // InternalNuSMV.g:6367:1: ruleTerminalVariableID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleTerminalVariableID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // InternalNuSMV.g:6374:2: (this_ID_0= RULE_ID )
            // InternalNuSMV.g:6375:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_ID_0, grammarAccess.getTerminalVariableIDAccess().getIDTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleTerminalVariableID"


    // $ANTLR start "entryRuleNUMBER"
    // InternalNuSMV.g:6388:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // InternalNuSMV.g:6388:46: (iv_ruleNUMBER= ruleNUMBER EOF )
            // InternalNuSMV.g:6389:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMBERRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMBER.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // InternalNuSMV.g:6395:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalNuSMV.g:6401:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalNuSMV.g:6402:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalNuSMV.g:6402:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalNuSMV.g:6403:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalNuSMV.g:6403:3: (kw= '-' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==55) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalNuSMV.g:6404:4: kw= '-'
                    {
                    kw=(Token)match(input,55,FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_0());
                      			
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_1, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "rulecomparisonoperators"
    // InternalNuSMV.g:6421:1: rulecomparisonoperators returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '>=' ) ) ;
    public final Enumerator rulecomparisonoperators() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalNuSMV.g:6427:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '>=' ) ) )
            // InternalNuSMV.g:6428:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '>=' ) )
            {
            // InternalNuSMV.g:6428:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '>=' ) )
            int alt81=6;
            switch ( input.LA(1) ) {
            case 91:
                {
                alt81=1;
                }
                break;
            case 92:
                {
                alt81=2;
                }
                break;
            case 93:
                {
                alt81=3;
                }
                break;
            case 94:
                {
                alt81=4;
                }
                break;
            case 95:
                {
                alt81=5;
                }
                break;
            case 96:
                {
                alt81=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // InternalNuSMV.g:6429:3: (enumLiteral_0= '=' )
                    {
                    // InternalNuSMV.g:6429:3: (enumLiteral_0= '=' )
                    // InternalNuSMV.g:6430:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonoperatorsAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getComparisonoperatorsAccess().getEqualEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalNuSMV.g:6437:3: (enumLiteral_1= '!=' )
                    {
                    // InternalNuSMV.g:6437:3: (enumLiteral_1= '!=' )
                    // InternalNuSMV.g:6438:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonoperatorsAccess().getDisEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getComparisonoperatorsAccess().getDisEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalNuSMV.g:6445:3: (enumLiteral_2= '<' )
                    {
                    // InternalNuSMV.g:6445:3: (enumLiteral_2= '<' )
                    // InternalNuSMV.g:6446:4: enumLiteral_2= '<'
                    {
                    enumLiteral_2=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonoperatorsAccess().getLEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getComparisonoperatorsAccess().getLEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalNuSMV.g:6453:3: (enumLiteral_3= '>' )
                    {
                    // InternalNuSMV.g:6453:3: (enumLiteral_3= '>' )
                    // InternalNuSMV.g:6454:4: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonoperatorsAccess().getGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getComparisonoperatorsAccess().getGEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalNuSMV.g:6461:3: (enumLiteral_4= '<=' )
                    {
                    // InternalNuSMV.g:6461:3: (enumLiteral_4= '<=' )
                    // InternalNuSMV.g:6462:4: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonoperatorsAccess().getLeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getComparisonoperatorsAccess().getLeEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalNuSMV.g:6469:3: (enumLiteral_5= '>=' )
                    {
                    // InternalNuSMV.g:6469:3: (enumLiteral_5= '>=' )
                    // InternalNuSMV.g:6470:4: enumLiteral_5= '>='
                    {
                    enumLiteral_5=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonoperatorsAccess().getGeEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getComparisonoperatorsAccess().getGeEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecomparisonoperators"


    // $ANTLR start "ruleoroperators"
    // InternalNuSMV.g:6480:1: ruleoroperators returns [Enumerator current=null] : ( (enumLiteral_0= '|' ) | (enumLiteral_1= 'xor' ) | (enumLiteral_2= 'xnor' ) ) ;
    public final Enumerator ruleoroperators() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalNuSMV.g:6486:2: ( ( (enumLiteral_0= '|' ) | (enumLiteral_1= 'xor' ) | (enumLiteral_2= 'xnor' ) ) )
            // InternalNuSMV.g:6487:2: ( (enumLiteral_0= '|' ) | (enumLiteral_1= 'xor' ) | (enumLiteral_2= 'xnor' ) )
            {
            // InternalNuSMV.g:6487:2: ( (enumLiteral_0= '|' ) | (enumLiteral_1= 'xor' ) | (enumLiteral_2= 'xnor' ) )
            int alt82=3;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt82=1;
                }
                break;
            case 98:
                {
                alt82=2;
                }
                break;
            case 99:
                {
                alt82=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // InternalNuSMV.g:6488:3: (enumLiteral_0= '|' )
                    {
                    // InternalNuSMV.g:6488:3: (enumLiteral_0= '|' )
                    // InternalNuSMV.g:6489:4: enumLiteral_0= '|'
                    {
                    enumLiteral_0=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOroperatorsAccess().getOrEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOroperatorsAccess().getOrEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalNuSMV.g:6496:3: (enumLiteral_1= 'xor' )
                    {
                    // InternalNuSMV.g:6496:3: (enumLiteral_1= 'xor' )
                    // InternalNuSMV.g:6497:4: enumLiteral_1= 'xor'
                    {
                    enumLiteral_1=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOroperatorsAccess().getXorEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOroperatorsAccess().getXorEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalNuSMV.g:6504:3: (enumLiteral_2= 'xnor' )
                    {
                    // InternalNuSMV.g:6504:3: (enumLiteral_2= 'xnor' )
                    // InternalNuSMV.g:6505:4: enumLiteral_2= 'xnor'
                    {
                    enumLiteral_2=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOroperatorsAccess().getXnorEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOroperatorsAccess().getXnorEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleoroperators"


    // $ANTLR start "ruleimpliesoperator"
    // InternalNuSMV.g:6515:1: ruleimpliesoperator returns [Enumerator current=null] : (enumLiteral_0= '->' ) ;
    public final Enumerator ruleimpliesoperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalNuSMV.g:6521:2: ( (enumLiteral_0= '->' ) )
            // InternalNuSMV.g:6522:2: (enumLiteral_0= '->' )
            {
            // InternalNuSMV.g:6522:2: (enumLiteral_0= '->' )
            // InternalNuSMV.g:6523:3: enumLiteral_0= '->'
            {
            enumLiteral_0=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getImpliesoperatorAccess().getImpliesEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getImpliesoperatorAccess().getImpliesEnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleimpliesoperator"


    // $ANTLR start "ruleiffoperator"
    // InternalNuSMV.g:6532:1: ruleiffoperator returns [Enumerator current=null] : (enumLiteral_0= '<->' ) ;
    public final Enumerator ruleiffoperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalNuSMV.g:6538:2: ( (enumLiteral_0= '<->' ) )
            // InternalNuSMV.g:6539:2: (enumLiteral_0= '<->' )
            {
            // InternalNuSMV.g:6539:2: (enumLiteral_0= '<->' )
            // InternalNuSMV.g:6540:3: enumLiteral_0= '<->'
            {
            enumLiteral_0=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getIffoperatorAccess().getIffEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getIffoperatorAccess().getIffEnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleiffoperator"


    // $ANTLR start "ruleandoperator"
    // InternalNuSMV.g:6549:1: ruleandoperator returns [Enumerator current=null] : (enumLiteral_0= '&' ) ;
    public final Enumerator ruleandoperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalNuSMV.g:6555:2: ( (enumLiteral_0= '&' ) )
            // InternalNuSMV.g:6556:2: (enumLiteral_0= '&' )
            {
            // InternalNuSMV.g:6556:2: (enumLiteral_0= '&' )
            // InternalNuSMV.g:6557:3: enumLiteral_0= '&'
            {
            enumLiteral_0=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getAndoperatorAccess().getAndEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getAndoperatorAccess().getAndEnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleandoperator"


    // $ANTLR start "ruleLTLbinoperators"
    // InternalNuSMV.g:6566:1: ruleLTLbinoperators returns [Enumerator current=null] : ( (enumLiteral_0= 'U' ) | (enumLiteral_1= 'V' ) | (enumLiteral_2= 'S' ) | (enumLiteral_3= 'T' ) ) ;
    public final Enumerator ruleLTLbinoperators() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalNuSMV.g:6572:2: ( ( (enumLiteral_0= 'U' ) | (enumLiteral_1= 'V' ) | (enumLiteral_2= 'S' ) | (enumLiteral_3= 'T' ) ) )
            // InternalNuSMV.g:6573:2: ( (enumLiteral_0= 'U' ) | (enumLiteral_1= 'V' ) | (enumLiteral_2= 'S' ) | (enumLiteral_3= 'T' ) )
            {
            // InternalNuSMV.g:6573:2: ( (enumLiteral_0= 'U' ) | (enumLiteral_1= 'V' ) | (enumLiteral_2= 'S' ) | (enumLiteral_3= 'T' ) )
            int alt83=4;
            switch ( input.LA(1) ) {
            case 103:
                {
                alt83=1;
                }
                break;
            case 104:
                {
                alt83=2;
                }
                break;
            case 105:
                {
                alt83=3;
                }
                break;
            case 106:
                {
                alt83=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // InternalNuSMV.g:6574:3: (enumLiteral_0= 'U' )
                    {
                    // InternalNuSMV.g:6574:3: (enumLiteral_0= 'U' )
                    // InternalNuSMV.g:6575:4: enumLiteral_0= 'U'
                    {
                    enumLiteral_0=(Token)match(input,103,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLTLbinoperatorsAccess().getUEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getLTLbinoperatorsAccess().getUEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalNuSMV.g:6582:3: (enumLiteral_1= 'V' )
                    {
                    // InternalNuSMV.g:6582:3: (enumLiteral_1= 'V' )
                    // InternalNuSMV.g:6583:4: enumLiteral_1= 'V'
                    {
                    enumLiteral_1=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLTLbinoperatorsAccess().getVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getLTLbinoperatorsAccess().getVEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalNuSMV.g:6590:3: (enumLiteral_2= 'S' )
                    {
                    // InternalNuSMV.g:6590:3: (enumLiteral_2= 'S' )
                    // InternalNuSMV.g:6591:4: enumLiteral_2= 'S'
                    {
                    enumLiteral_2=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLTLbinoperatorsAccess().getSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getLTLbinoperatorsAccess().getSEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalNuSMV.g:6598:3: (enumLiteral_3= 'T' )
                    {
                    // InternalNuSMV.g:6598:3: (enumLiteral_3= 'T' )
                    // InternalNuSMV.g:6599:4: enumLiteral_3= 'T'
                    {
                    enumLiteral_3=(Token)match(input,106,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLTLbinoperatorsAccess().getTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getLTLbinoperatorsAccess().getTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLTLbinoperators"

    // $ANTLR start synpred57_InternalNuSMV
    public final void synpred57_InternalNuSMV_fragment() throws RecognitionException {   
        EObject lv_params_4_0 = null;


        // InternalNuSMV.g:2880:7: ( ( (lv_params_4_0= ruleSimpleExpression ) ) )
        // InternalNuSMV.g:2880:7: ( (lv_params_4_0= ruleSimpleExpression ) )
        {
        // InternalNuSMV.g:2880:7: ( (lv_params_4_0= ruleSimpleExpression ) )
        // InternalNuSMV.g:2881:8: (lv_params_4_0= ruleSimpleExpression )
        {
        // InternalNuSMV.g:2881:8: (lv_params_4_0= ruleSimpleExpression )
        // InternalNuSMV.g:2882:9: lv_params_4_0= ruleSimpleExpression
        {
        if ( state.backtracking==0 ) {

          									newCompositeNode(grammarAccess.getModuleTypeAccess().getParamsSimpleExpressionParserRuleCall_0_1_2_1_0_0());
          								
        }
        pushFollow(FOLLOW_2);
        lv_params_4_0=ruleSimpleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred57_InternalNuSMV

    // $ANTLR start synpred61_InternalNuSMV
    public final void synpred61_InternalNuSMV_fragment() throws RecognitionException {   
        EObject lv_params_12_0 = null;


        // InternalNuSMV.g:2984:7: ( ( (lv_params_12_0= ruleSimpleExpression ) ) )
        // InternalNuSMV.g:2984:7: ( (lv_params_12_0= ruleSimpleExpression ) )
        {
        // InternalNuSMV.g:2984:7: ( (lv_params_12_0= ruleSimpleExpression ) )
        // InternalNuSMV.g:2985:8: (lv_params_12_0= ruleSimpleExpression )
        {
        // InternalNuSMV.g:2985:8: (lv_params_12_0= ruleSimpleExpression )
        // InternalNuSMV.g:2986:9: lv_params_12_0= ruleSimpleExpression
        {
        if ( state.backtracking==0 ) {

          									newCompositeNode(grammarAccess.getModuleTypeAccess().getParamsSimpleExpressionParserRuleCall_1_1_1_1_0_0());
          								
        }
        pushFollow(FOLLOW_2);
        lv_params_12_0=ruleSimpleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred61_InternalNuSMV

    // $ANTLR start synpred70_InternalNuSMV
    public final void synpred70_InternalNuSMV_fragment() throws RecognitionException {   
        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


        // InternalNuSMV.g:3254:4: ( () ( (lv_operator_2_0= ruleLTLbinoperators ) ) ( ( ruleIffExpression )=> (lv_right_3_0= ruleImpliesExpression ) ) )
        // InternalNuSMV.g:3254:4: () ( (lv_operator_2_0= ruleLTLbinoperators ) ) ( ( ruleIffExpression )=> (lv_right_3_0= ruleImpliesExpression ) )
        {
        // InternalNuSMV.g:3254:4: ()
        // InternalNuSMV.g:3255:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalNuSMV.g:3264:4: ( (lv_operator_2_0= ruleLTLbinoperators ) )
        // InternalNuSMV.g:3265:5: (lv_operator_2_0= ruleLTLbinoperators )
        {
        // InternalNuSMV.g:3265:5: (lv_operator_2_0= ruleLTLbinoperators )
        // InternalNuSMV.g:3266:6: lv_operator_2_0= ruleLTLbinoperators
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getLTLbinExpressionAccess().getOperatorLTLbinoperatorsEnumRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_13);
        lv_operator_2_0=ruleLTLbinoperators();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalNuSMV.g:3283:4: ( ( ruleIffExpression )=> (lv_right_3_0= ruleImpliesExpression ) )
        // InternalNuSMV.g:3284:5: ( ruleIffExpression )=> (lv_right_3_0= ruleImpliesExpression )
        {
        // InternalNuSMV.g:3285:5: (lv_right_3_0= ruleImpliesExpression )
        // InternalNuSMV.g:3286:6: lv_right_3_0= ruleImpliesExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getLTLbinExpressionAccess().getRightImpliesExpressionParserRuleCall_1_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_3_0=ruleImpliesExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred70_InternalNuSMV

    // $ANTLR start synpred73_InternalNuSMV
    public final void synpred73_InternalNuSMV_fragment() throws RecognitionException {   
        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


        // InternalNuSMV.g:3338:4: ( () ( (lv_operator_2_0= ruleimpliesoperator ) ) ( ( ruleOrExpression )=> (lv_right_3_0= ruleIffExpression ) ) )
        // InternalNuSMV.g:3338:4: () ( (lv_operator_2_0= ruleimpliesoperator ) ) ( ( ruleOrExpression )=> (lv_right_3_0= ruleIffExpression ) )
        {
        // InternalNuSMV.g:3338:4: ()
        // InternalNuSMV.g:3339:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalNuSMV.g:3348:4: ( (lv_operator_2_0= ruleimpliesoperator ) )
        // InternalNuSMV.g:3349:5: (lv_operator_2_0= ruleimpliesoperator )
        {
        // InternalNuSMV.g:3349:5: (lv_operator_2_0= ruleimpliesoperator )
        // InternalNuSMV.g:3350:6: lv_operator_2_0= ruleimpliesoperator
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getImpliesExpressionAccess().getOperatorImpliesoperatorEnumRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_13);
        lv_operator_2_0=ruleimpliesoperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalNuSMV.g:3367:4: ( ( ruleOrExpression )=> (lv_right_3_0= ruleIffExpression ) )
        // InternalNuSMV.g:3368:5: ( ruleOrExpression )=> (lv_right_3_0= ruleIffExpression )
        {
        // InternalNuSMV.g:3369:5: (lv_right_3_0= ruleIffExpression )
        // InternalNuSMV.g:3370:6: lv_right_3_0= ruleIffExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getImpliesExpressionAccess().getRightIffExpressionParserRuleCall_1_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_3_0=ruleIffExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred73_InternalNuSMV

    // $ANTLR start synpred76_InternalNuSMV
    public final void synpred76_InternalNuSMV_fragment() throws RecognitionException {   
        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


        // InternalNuSMV.g:3422:4: ( () ( (lv_operator_2_0= ruleiffoperator ) ) ( ( ruleAndExpression )=> (lv_right_3_0= ruleOrExpression ) ) )
        // InternalNuSMV.g:3422:4: () ( (lv_operator_2_0= ruleiffoperator ) ) ( ( ruleAndExpression )=> (lv_right_3_0= ruleOrExpression ) )
        {
        // InternalNuSMV.g:3422:4: ()
        // InternalNuSMV.g:3423:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalNuSMV.g:3432:4: ( (lv_operator_2_0= ruleiffoperator ) )
        // InternalNuSMV.g:3433:5: (lv_operator_2_0= ruleiffoperator )
        {
        // InternalNuSMV.g:3433:5: (lv_operator_2_0= ruleiffoperator )
        // InternalNuSMV.g:3434:6: lv_operator_2_0= ruleiffoperator
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getIffExpressionAccess().getOperatorIffoperatorEnumRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_13);
        lv_operator_2_0=ruleiffoperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalNuSMV.g:3451:4: ( ( ruleAndExpression )=> (lv_right_3_0= ruleOrExpression ) )
        // InternalNuSMV.g:3452:5: ( ruleAndExpression )=> (lv_right_3_0= ruleOrExpression )
        {
        // InternalNuSMV.g:3453:5: (lv_right_3_0= ruleOrExpression )
        // InternalNuSMV.g:3454:6: lv_right_3_0= ruleOrExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getIffExpressionAccess().getRightOrExpressionParserRuleCall_1_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_3_0=ruleOrExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred76_InternalNuSMV

    // $ANTLR start synpred79_InternalNuSMV
    public final void synpred79_InternalNuSMV_fragment() throws RecognitionException {   
        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


        // InternalNuSMV.g:3506:4: ( () ( (lv_operator_2_0= ruleoroperators ) ) ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) ) )
        // InternalNuSMV.g:3506:4: () ( (lv_operator_2_0= ruleoroperators ) ) ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) )
        {
        // InternalNuSMV.g:3506:4: ()
        // InternalNuSMV.g:3507:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalNuSMV.g:3516:4: ( (lv_operator_2_0= ruleoroperators ) )
        // InternalNuSMV.g:3517:5: (lv_operator_2_0= ruleoroperators )
        {
        // InternalNuSMV.g:3517:5: (lv_operator_2_0= ruleoroperators )
        // InternalNuSMV.g:3518:6: lv_operator_2_0= ruleoroperators
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorOroperatorsEnumRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_13);
        lv_operator_2_0=ruleoroperators();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalNuSMV.g:3535:4: ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) )
        // InternalNuSMV.g:3536:5: ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression )
        {
        // InternalNuSMV.g:3537:5: (lv_right_3_0= ruleAndExpression )
        // InternalNuSMV.g:3538:6: lv_right_3_0= ruleAndExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_3_0=ruleAndExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred79_InternalNuSMV

    // $ANTLR start synpred82_InternalNuSMV
    public final void synpred82_InternalNuSMV_fragment() throws RecognitionException {   
        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


        // InternalNuSMV.g:3590:4: ( () ( (lv_operator_2_0= ruleandoperator ) ) ( ( ruleInExpression )=> (lv_right_3_0= ruleComparisonExpression ) ) )
        // InternalNuSMV.g:3590:4: () ( (lv_operator_2_0= ruleandoperator ) ) ( ( ruleInExpression )=> (lv_right_3_0= ruleComparisonExpression ) )
        {
        // InternalNuSMV.g:3590:4: ()
        // InternalNuSMV.g:3591:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalNuSMV.g:3600:4: ( (lv_operator_2_0= ruleandoperator ) )
        // InternalNuSMV.g:3601:5: (lv_operator_2_0= ruleandoperator )
        {
        // InternalNuSMV.g:3601:5: (lv_operator_2_0= ruleandoperator )
        // InternalNuSMV.g:3602:6: lv_operator_2_0= ruleandoperator
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorAndoperatorEnumRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_13);
        lv_operator_2_0=ruleandoperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalNuSMV.g:3619:4: ( ( ruleInExpression )=> (lv_right_3_0= ruleComparisonExpression ) )
        // InternalNuSMV.g:3620:5: ( ruleInExpression )=> (lv_right_3_0= ruleComparisonExpression )
        {
        // InternalNuSMV.g:3621:5: (lv_right_3_0= ruleComparisonExpression )
        // InternalNuSMV.g:3622:6: lv_right_3_0= ruleComparisonExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_3_0=ruleComparisonExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred82_InternalNuSMV

    // $ANTLR start synpred85_InternalNuSMV
    public final void synpred85_InternalNuSMV_fragment() throws RecognitionException {   
        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


        // InternalNuSMV.g:3674:4: ( () ( (lv_operator_2_0= rulecomparisonoperators ) ) ( ( ruleUnionExpression )=> (lv_right_3_0= ruleInExpression ) ) )
        // InternalNuSMV.g:3674:4: () ( (lv_operator_2_0= rulecomparisonoperators ) ) ( ( ruleUnionExpression )=> (lv_right_3_0= ruleInExpression ) )
        {
        // InternalNuSMV.g:3674:4: ()
        // InternalNuSMV.g:3675:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalNuSMV.g:3684:4: ( (lv_operator_2_0= rulecomparisonoperators ) )
        // InternalNuSMV.g:3685:5: (lv_operator_2_0= rulecomparisonoperators )
        {
        // InternalNuSMV.g:3685:5: (lv_operator_2_0= rulecomparisonoperators )
        // InternalNuSMV.g:3686:6: lv_operator_2_0= rulecomparisonoperators
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getOperatorComparisonoperatorsEnumRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_13);
        lv_operator_2_0=rulecomparisonoperators();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalNuSMV.g:3703:4: ( ( ruleUnionExpression )=> (lv_right_3_0= ruleInExpression ) )
        // InternalNuSMV.g:3704:5: ( ruleUnionExpression )=> (lv_right_3_0= ruleInExpression )
        {
        // InternalNuSMV.g:3705:5: (lv_right_3_0= ruleInExpression )
        // InternalNuSMV.g:3706:6: lv_right_3_0= ruleInExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightInExpressionParserRuleCall_1_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_3_0=ruleInExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred85_InternalNuSMV

    // $ANTLR start synpred88_InternalNuSMV
    public final void synpred88_InternalNuSMV_fragment() throws RecognitionException {   
        Token lv_op_2_0=null;
        EObject lv_right_3_0 = null;


        // InternalNuSMV.g:3758:4: ( () ( (lv_op_2_0= 'in' ) ) ( ( ruleRightShift )=> (lv_right_3_0= ruleUnionExpression ) ) )
        // InternalNuSMV.g:3758:4: () ( (lv_op_2_0= 'in' ) ) ( ( ruleRightShift )=> (lv_right_3_0= ruleUnionExpression ) )
        {
        // InternalNuSMV.g:3758:4: ()
        // InternalNuSMV.g:3759:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalNuSMV.g:3768:4: ( (lv_op_2_0= 'in' ) )
        // InternalNuSMV.g:3769:5: (lv_op_2_0= 'in' )
        {
        // InternalNuSMV.g:3769:5: (lv_op_2_0= 'in' )
        // InternalNuSMV.g:3770:6: lv_op_2_0= 'in'
        {
        lv_op_2_0=(Token)match(input,51,FOLLOW_13); if (state.failed) return ;

        }


        }

        // InternalNuSMV.g:3782:4: ( ( ruleRightShift )=> (lv_right_3_0= ruleUnionExpression ) )
        // InternalNuSMV.g:3783:5: ( ruleRightShift )=> (lv_right_3_0= ruleUnionExpression )
        {
        // InternalNuSMV.g:3784:5: (lv_right_3_0= ruleUnionExpression )
        // InternalNuSMV.g:3785:6: lv_right_3_0= ruleUnionExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getInExpressionAccess().getRightUnionExpressionParserRuleCall_1_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_3_0=ruleUnionExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred88_InternalNuSMV

    // $ANTLR start synpred91_InternalNuSMV
    public final void synpred91_InternalNuSMV_fragment() throws RecognitionException {   
        Token lv_op_2_0=null;
        EObject lv_right_3_0 = null;


        // InternalNuSMV.g:3837:4: ( () ( (lv_op_2_0= 'union' ) ) ( ( ruleLeftShift )=> (lv_right_3_0= ruleRightShift ) ) )
        // InternalNuSMV.g:3837:4: () ( (lv_op_2_0= 'union' ) ) ( ( ruleLeftShift )=> (lv_right_3_0= ruleRightShift ) )
        {
        // InternalNuSMV.g:3837:4: ()
        // InternalNuSMV.g:3838:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalNuSMV.g:3847:4: ( (lv_op_2_0= 'union' ) )
        // InternalNuSMV.g:3848:5: (lv_op_2_0= 'union' )
        {
        // InternalNuSMV.g:3848:5: (lv_op_2_0= 'union' )
        // InternalNuSMV.g:3849:6: lv_op_2_0= 'union'
        {
        lv_op_2_0=(Token)match(input,52,FOLLOW_13); if (state.failed) return ;

        }


        }

        // InternalNuSMV.g:3861:4: ( ( ruleLeftShift )=> (lv_right_3_0= ruleRightShift ) )
        // InternalNuSMV.g:3862:5: ( ruleLeftShift )=> (lv_right_3_0= ruleRightShift )
        {
        // InternalNuSMV.g:3863:5: (lv_right_3_0= ruleRightShift )
        // InternalNuSMV.g:3864:6: lv_right_3_0= ruleRightShift
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getUnionExpressionAccess().getRightRightShiftParserRuleCall_1_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_3_0=ruleRightShift();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred91_InternalNuSMV

    // $ANTLR start synpred94_InternalNuSMV
    public final void synpred94_InternalNuSMV_fragment() throws RecognitionException {   
        Token lv_op_2_0=null;
        EObject lv_right_3_0 = null;


        // InternalNuSMV.g:3916:4: ( () ( (lv_op_2_0= '>>' ) ) ( ( ruleMinus )=> (lv_right_3_0= ruleLeftShift ) ) )
        // InternalNuSMV.g:3916:4: () ( (lv_op_2_0= '>>' ) ) ( ( ruleMinus )=> (lv_right_3_0= ruleLeftShift ) )
        {
        // InternalNuSMV.g:3916:4: ()
        // InternalNuSMV.g:3917:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalNuSMV.g:3926:4: ( (lv_op_2_0= '>>' ) )
        // InternalNuSMV.g:3927:5: (lv_op_2_0= '>>' )
        {
        // InternalNuSMV.g:3927:5: (lv_op_2_0= '>>' )
        // InternalNuSMV.g:3928:6: lv_op_2_0= '>>'
        {
        lv_op_2_0=(Token)match(input,53,FOLLOW_13); if (state.failed) return ;

        }


        }

        // InternalNuSMV.g:3940:4: ( ( ruleMinus )=> (lv_right_3_0= ruleLeftShift ) )
        // InternalNuSMV.g:3941:5: ( ruleMinus )=> (lv_right_3_0= ruleLeftShift )
        {
        // InternalNuSMV.g:3942:5: (lv_right_3_0= ruleLeftShift )
        // InternalNuSMV.g:3943:6: lv_right_3_0= ruleLeftShift
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getRightShiftAccess().getRightLeftShiftParserRuleCall_1_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_3_0=ruleLeftShift();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred94_InternalNuSMV

    // $ANTLR start synpred97_InternalNuSMV
    public final void synpred97_InternalNuSMV_fragment() throws RecognitionException {   
        Token lv_op_2_0=null;
        EObject lv_right_3_0 = null;


        // InternalNuSMV.g:3995:4: ( () ( (lv_op_2_0= '<<' ) ) ( ( rulePlus )=> (lv_right_3_0= ruleMinus ) ) )
        // InternalNuSMV.g:3995:4: () ( (lv_op_2_0= '<<' ) ) ( ( rulePlus )=> (lv_right_3_0= ruleMinus ) )
        {
        // InternalNuSMV.g:3995:4: ()
        // InternalNuSMV.g:3996:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalNuSMV.g:4005:4: ( (lv_op_2_0= '<<' ) )
        // InternalNuSMV.g:4006:5: (lv_op_2_0= '<<' )
        {
        // InternalNuSMV.g:4006:5: (lv_op_2_0= '<<' )
        // InternalNuSMV.g:4007:6: lv_op_2_0= '<<'
        {
        lv_op_2_0=(Token)match(input,54,FOLLOW_13); if (state.failed) return ;

        }


        }

        // InternalNuSMV.g:4019:4: ( ( rulePlus )=> (lv_right_3_0= ruleMinus ) )
        // InternalNuSMV.g:4020:5: ( rulePlus )=> (lv_right_3_0= ruleMinus )
        {
        // InternalNuSMV.g:4021:5: (lv_right_3_0= ruleMinus )
        // InternalNuSMV.g:4022:6: lv_right_3_0= ruleMinus
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getLeftShiftAccess().getRightMinusParserRuleCall_1_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_3_0=ruleMinus();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred97_InternalNuSMV

    // $ANTLR start synpred100_InternalNuSMV
    public final void synpred100_InternalNuSMV_fragment() throws RecognitionException {   
        Token lv_op_2_0=null;
        EObject lv_right_3_0 = null;


        // InternalNuSMV.g:4074:4: ( () ( (lv_op_2_0= '-' ) ) ( ( ruleMult )=> (lv_right_3_0= rulePlus ) ) )
        // InternalNuSMV.g:4074:4: () ( (lv_op_2_0= '-' ) ) ( ( ruleMult )=> (lv_right_3_0= rulePlus ) )
        {
        // InternalNuSMV.g:4074:4: ()
        // InternalNuSMV.g:4075:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalNuSMV.g:4084:4: ( (lv_op_2_0= '-' ) )
        // InternalNuSMV.g:4085:5: (lv_op_2_0= '-' )
        {
        // InternalNuSMV.g:4085:5: (lv_op_2_0= '-' )
        // InternalNuSMV.g:4086:6: lv_op_2_0= '-'
        {
        lv_op_2_0=(Token)match(input,55,FOLLOW_13); if (state.failed) return ;

        }


        }

        // InternalNuSMV.g:4098:4: ( ( ruleMult )=> (lv_right_3_0= rulePlus ) )
        // InternalNuSMV.g:4099:5: ( ruleMult )=> (lv_right_3_0= rulePlus )
        {
        // InternalNuSMV.g:4100:5: (lv_right_3_0= rulePlus )
        // InternalNuSMV.g:4101:6: lv_right_3_0= rulePlus
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getMinusAccess().getRightPlusParserRuleCall_1_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_3_0=rulePlus();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred100_InternalNuSMV

    // $ANTLR start synpred103_InternalNuSMV
    public final void synpred103_InternalNuSMV_fragment() throws RecognitionException {   
        Token lv_op_2_0=null;
        EObject lv_right_3_0 = null;


        // InternalNuSMV.g:4153:4: ( () ( (lv_op_2_0= '+' ) ) ( ( ruleMod )=> (lv_right_3_0= ruleMult ) ) )
        // InternalNuSMV.g:4153:4: () ( (lv_op_2_0= '+' ) ) ( ( ruleMod )=> (lv_right_3_0= ruleMult ) )
        {
        // InternalNuSMV.g:4153:4: ()
        // InternalNuSMV.g:4154:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalNuSMV.g:4163:4: ( (lv_op_2_0= '+' ) )
        // InternalNuSMV.g:4164:5: (lv_op_2_0= '+' )
        {
        // InternalNuSMV.g:4164:5: (lv_op_2_0= '+' )
        // InternalNuSMV.g:4165:6: lv_op_2_0= '+'
        {
        lv_op_2_0=(Token)match(input,56,FOLLOW_13); if (state.failed) return ;

        }


        }

        // InternalNuSMV.g:4177:4: ( ( ruleMod )=> (lv_right_3_0= ruleMult ) )
        // InternalNuSMV.g:4178:5: ( ruleMod )=> (lv_right_3_0= ruleMult )
        {
        // InternalNuSMV.g:4179:5: (lv_right_3_0= ruleMult )
        // InternalNuSMV.g:4180:6: lv_right_3_0= ruleMult
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getPlusAccess().getRightMultParserRuleCall_1_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_3_0=ruleMult();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred103_InternalNuSMV

    // $ANTLR start synpred106_InternalNuSMV
    public final void synpred106_InternalNuSMV_fragment() throws RecognitionException {   
        Token lv_op_2_0=null;
        EObject lv_right_3_0 = null;


        // InternalNuSMV.g:4232:4: ( () ( (lv_op_2_0= '*' ) ) ( ( ruleWordConcatenation )=> (lv_right_3_0= ruleMod ) ) )
        // InternalNuSMV.g:4232:4: () ( (lv_op_2_0= '*' ) ) ( ( ruleWordConcatenation )=> (lv_right_3_0= ruleMod ) )
        {
        // InternalNuSMV.g:4232:4: ()
        // InternalNuSMV.g:4233:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalNuSMV.g:4242:4: ( (lv_op_2_0= '*' ) )
        // InternalNuSMV.g:4243:5: (lv_op_2_0= '*' )
        {
        // InternalNuSMV.g:4243:5: (lv_op_2_0= '*' )
        // InternalNuSMV.g:4244:6: lv_op_2_0= '*'
        {
        lv_op_2_0=(Token)match(input,57,FOLLOW_13); if (state.failed) return ;

        }


        }

        // InternalNuSMV.g:4256:4: ( ( ruleWordConcatenation )=> (lv_right_3_0= ruleMod ) )
        // InternalNuSMV.g:4257:5: ( ruleWordConcatenation )=> (lv_right_3_0= ruleMod )
        {
        // InternalNuSMV.g:4258:5: (lv_right_3_0= ruleMod )
        // InternalNuSMV.g:4259:6: lv_right_3_0= ruleMod
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getMultAccess().getRightModParserRuleCall_1_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_3_0=ruleMod();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred106_InternalNuSMV

    // $ANTLR start synpred109_InternalNuSMV
    public final void synpred109_InternalNuSMV_fragment() throws RecognitionException {   
        Token lv_op_2_0=null;
        EObject lv_right_3_0 = null;


        // InternalNuSMV.g:4311:4: ( () ( (lv_op_2_0= 'mod' ) ) ( ( ruleDiv )=> (lv_right_3_0= ruleWordConcatenation ) ) )
        // InternalNuSMV.g:4311:4: () ( (lv_op_2_0= 'mod' ) ) ( ( ruleDiv )=> (lv_right_3_0= ruleWordConcatenation ) )
        {
        // InternalNuSMV.g:4311:4: ()
        // InternalNuSMV.g:4312:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalNuSMV.g:4321:4: ( (lv_op_2_0= 'mod' ) )
        // InternalNuSMV.g:4322:5: (lv_op_2_0= 'mod' )
        {
        // InternalNuSMV.g:4322:5: (lv_op_2_0= 'mod' )
        // InternalNuSMV.g:4323:6: lv_op_2_0= 'mod'
        {
        lv_op_2_0=(Token)match(input,58,FOLLOW_13); if (state.failed) return ;

        }


        }

        // InternalNuSMV.g:4335:4: ( ( ruleDiv )=> (lv_right_3_0= ruleWordConcatenation ) )
        // InternalNuSMV.g:4336:5: ( ruleDiv )=> (lv_right_3_0= ruleWordConcatenation )
        {
        // InternalNuSMV.g:4337:5: (lv_right_3_0= ruleWordConcatenation )
        // InternalNuSMV.g:4338:6: lv_right_3_0= ruleWordConcatenation
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getModAccess().getRightWordConcatenationParserRuleCall_1_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_3_0=ruleWordConcatenation();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred109_InternalNuSMV

    // $ANTLR start synpred112_InternalNuSMV
    public final void synpred112_InternalNuSMV_fragment() throws RecognitionException {   
        Token lv_op_2_0=null;
        EObject lv_right_3_0 = null;


        // InternalNuSMV.g:4390:4: ( () ( (lv_op_2_0= '::' ) ) ( ( ruleNotOrTerminalSimpleExpression )=> (lv_right_3_0= ruleDiv ) ) )
        // InternalNuSMV.g:4390:4: () ( (lv_op_2_0= '::' ) ) ( ( ruleNotOrTerminalSimpleExpression )=> (lv_right_3_0= ruleDiv ) )
        {
        // InternalNuSMV.g:4390:4: ()
        // InternalNuSMV.g:4391:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalNuSMV.g:4400:4: ( (lv_op_2_0= '::' ) )
        // InternalNuSMV.g:4401:5: (lv_op_2_0= '::' )
        {
        // InternalNuSMV.g:4401:5: (lv_op_2_0= '::' )
        // InternalNuSMV.g:4402:6: lv_op_2_0= '::'
        {
        lv_op_2_0=(Token)match(input,59,FOLLOW_13); if (state.failed) return ;

        }


        }

        // InternalNuSMV.g:4414:4: ( ( ruleNotOrTerminalSimpleExpression )=> (lv_right_3_0= ruleDiv ) )
        // InternalNuSMV.g:4415:5: ( ruleNotOrTerminalSimpleExpression )=> (lv_right_3_0= ruleDiv )
        {
        // InternalNuSMV.g:4416:5: (lv_right_3_0= ruleDiv )
        // InternalNuSMV.g:4417:6: lv_right_3_0= ruleDiv
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getWordConcatenationAccess().getRightDivParserRuleCall_1_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_3_0=ruleDiv();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred112_InternalNuSMV

    // $ANTLR start synpred114_InternalNuSMV
    public final void synpred114_InternalNuSMV_fragment() throws RecognitionException {   
        Token lv_op_2_0=null;
        EObject lv_right_3_0 = null;


        // InternalNuSMV.g:4469:4: ( () ( (lv_op_2_0= '/' ) ) ( (lv_right_3_0= ruleNotOrTerminalSimpleExpression ) ) )
        // InternalNuSMV.g:4469:4: () ( (lv_op_2_0= '/' ) ) ( (lv_right_3_0= ruleNotOrTerminalSimpleExpression ) )
        {
        // InternalNuSMV.g:4469:4: ()
        // InternalNuSMV.g:4470:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalNuSMV.g:4479:4: ( (lv_op_2_0= '/' ) )
        // InternalNuSMV.g:4480:5: (lv_op_2_0= '/' )
        {
        // InternalNuSMV.g:4480:5: (lv_op_2_0= '/' )
        // InternalNuSMV.g:4481:6: lv_op_2_0= '/'
        {
        lv_op_2_0=(Token)match(input,60,FOLLOW_13); if (state.failed) return ;

        }


        }

        // InternalNuSMV.g:4493:4: ( (lv_right_3_0= ruleNotOrTerminalSimpleExpression ) )
        // InternalNuSMV.g:4494:5: (lv_right_3_0= ruleNotOrTerminalSimpleExpression )
        {
        // InternalNuSMV.g:4494:5: (lv_right_3_0= ruleNotOrTerminalSimpleExpression )
        // InternalNuSMV.g:4495:6: lv_right_3_0= ruleNotOrTerminalSimpleExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getDivAccess().getRightNotOrTerminalSimpleExpressionParserRuleCall_1_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_3_0=ruleNotOrTerminalSimpleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred114_InternalNuSMV

    // $ANTLR start synpred132_InternalNuSMV
    public final void synpred132_InternalNuSMV_fragment() throws RecognitionException {   
        Token lv_operator_6_1=null;
        Token lv_operator_6_2=null;
        Token lv_operator_6_3=null;
        Token lv_operator_6_4=null;
        Token lv_operator_6_5=null;
        Token lv_operator_6_6=null;
        Token lv_operator_6_7=null;
        Token lv_operator_6_8=null;
        Token lv_operator_6_9=null;
        Token lv_operator_6_10=null;
        Token lv_operator_6_11=null;
        Token lv_operator_6_12=null;
        Token lv_operator_6_13=null;
        Token lv_operator_6_14=null;
        Token lv_operator_6_15=null;
        EObject lv_simpleExpression_7_0 = null;


        // InternalNuSMV.g:4658:3: ( ( () ( ( ( (lv_operator_6_1= '-' | lv_operator_6_2= '+' | lv_operator_6_3= 'EG' | lv_operator_6_4= 'EX' | lv_operator_6_5= 'EF' | lv_operator_6_6= 'AG' | lv_operator_6_7= 'AX' | lv_operator_6_8= 'AF' | lv_operator_6_9= 'X' | lv_operator_6_10= 'G' | lv_operator_6_11= 'F' | lv_operator_6_12= 'Y' | lv_operator_6_13= 'Z' | lv_operator_6_14= 'H' | lv_operator_6_15= 'O' ) ) ) ( (lv_simpleExpression_7_0= ruleSimpleExpression ) ) ) ) )
        // InternalNuSMV.g:4658:3: ( () ( ( ( (lv_operator_6_1= '-' | lv_operator_6_2= '+' | lv_operator_6_3= 'EG' | lv_operator_6_4= 'EX' | lv_operator_6_5= 'EF' | lv_operator_6_6= 'AG' | lv_operator_6_7= 'AX' | lv_operator_6_8= 'AF' | lv_operator_6_9= 'X' | lv_operator_6_10= 'G' | lv_operator_6_11= 'F' | lv_operator_6_12= 'Y' | lv_operator_6_13= 'Z' | lv_operator_6_14= 'H' | lv_operator_6_15= 'O' ) ) ) ( (lv_simpleExpression_7_0= ruleSimpleExpression ) ) ) )
        {
        // InternalNuSMV.g:4658:3: ( () ( ( ( (lv_operator_6_1= '-' | lv_operator_6_2= '+' | lv_operator_6_3= 'EG' | lv_operator_6_4= 'EX' | lv_operator_6_5= 'EF' | lv_operator_6_6= 'AG' | lv_operator_6_7= 'AX' | lv_operator_6_8= 'AF' | lv_operator_6_9= 'X' | lv_operator_6_10= 'G' | lv_operator_6_11= 'F' | lv_operator_6_12= 'Y' | lv_operator_6_13= 'Z' | lv_operator_6_14= 'H' | lv_operator_6_15= 'O' ) ) ) ( (lv_simpleExpression_7_0= ruleSimpleExpression ) ) ) )
        // InternalNuSMV.g:4659:4: () ( ( ( (lv_operator_6_1= '-' | lv_operator_6_2= '+' | lv_operator_6_3= 'EG' | lv_operator_6_4= 'EX' | lv_operator_6_5= 'EF' | lv_operator_6_6= 'AG' | lv_operator_6_7= 'AX' | lv_operator_6_8= 'AF' | lv_operator_6_9= 'X' | lv_operator_6_10= 'G' | lv_operator_6_11= 'F' | lv_operator_6_12= 'Y' | lv_operator_6_13= 'Z' | lv_operator_6_14= 'H' | lv_operator_6_15= 'O' ) ) ) ( (lv_simpleExpression_7_0= ruleSimpleExpression ) ) )
        {
        // InternalNuSMV.g:4659:4: ()
        // InternalNuSMV.g:4660:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalNuSMV.g:4669:4: ( ( ( (lv_operator_6_1= '-' | lv_operator_6_2= '+' | lv_operator_6_3= 'EG' | lv_operator_6_4= 'EX' | lv_operator_6_5= 'EF' | lv_operator_6_6= 'AG' | lv_operator_6_7= 'AX' | lv_operator_6_8= 'AF' | lv_operator_6_9= 'X' | lv_operator_6_10= 'G' | lv_operator_6_11= 'F' | lv_operator_6_12= 'Y' | lv_operator_6_13= 'Z' | lv_operator_6_14= 'H' | lv_operator_6_15= 'O' ) ) ) ( (lv_simpleExpression_7_0= ruleSimpleExpression ) ) )
        // InternalNuSMV.g:4670:5: ( ( (lv_operator_6_1= '-' | lv_operator_6_2= '+' | lv_operator_6_3= 'EG' | lv_operator_6_4= 'EX' | lv_operator_6_5= 'EF' | lv_operator_6_6= 'AG' | lv_operator_6_7= 'AX' | lv_operator_6_8= 'AF' | lv_operator_6_9= 'X' | lv_operator_6_10= 'G' | lv_operator_6_11= 'F' | lv_operator_6_12= 'Y' | lv_operator_6_13= 'Z' | lv_operator_6_14= 'H' | lv_operator_6_15= 'O' ) ) ) ( (lv_simpleExpression_7_0= ruleSimpleExpression ) )
        {
        // InternalNuSMV.g:4670:5: ( ( (lv_operator_6_1= '-' | lv_operator_6_2= '+' | lv_operator_6_3= 'EG' | lv_operator_6_4= 'EX' | lv_operator_6_5= 'EF' | lv_operator_6_6= 'AG' | lv_operator_6_7= 'AX' | lv_operator_6_8= 'AF' | lv_operator_6_9= 'X' | lv_operator_6_10= 'G' | lv_operator_6_11= 'F' | lv_operator_6_12= 'Y' | lv_operator_6_13= 'Z' | lv_operator_6_14= 'H' | lv_operator_6_15= 'O' ) ) )
        // InternalNuSMV.g:4671:6: ( (lv_operator_6_1= '-' | lv_operator_6_2= '+' | lv_operator_6_3= 'EG' | lv_operator_6_4= 'EX' | lv_operator_6_5= 'EF' | lv_operator_6_6= 'AG' | lv_operator_6_7= 'AX' | lv_operator_6_8= 'AF' | lv_operator_6_9= 'X' | lv_operator_6_10= 'G' | lv_operator_6_11= 'F' | lv_operator_6_12= 'Y' | lv_operator_6_13= 'Z' | lv_operator_6_14= 'H' | lv_operator_6_15= 'O' ) )
        {
        // InternalNuSMV.g:4671:6: ( (lv_operator_6_1= '-' | lv_operator_6_2= '+' | lv_operator_6_3= 'EG' | lv_operator_6_4= 'EX' | lv_operator_6_5= 'EF' | lv_operator_6_6= 'AG' | lv_operator_6_7= 'AX' | lv_operator_6_8= 'AF' | lv_operator_6_9= 'X' | lv_operator_6_10= 'G' | lv_operator_6_11= 'F' | lv_operator_6_12= 'Y' | lv_operator_6_13= 'Z' | lv_operator_6_14= 'H' | lv_operator_6_15= 'O' ) )
        // InternalNuSMV.g:4672:7: (lv_operator_6_1= '-' | lv_operator_6_2= '+' | lv_operator_6_3= 'EG' | lv_operator_6_4= 'EX' | lv_operator_6_5= 'EF' | lv_operator_6_6= 'AG' | lv_operator_6_7= 'AX' | lv_operator_6_8= 'AF' | lv_operator_6_9= 'X' | lv_operator_6_10= 'G' | lv_operator_6_11= 'F' | lv_operator_6_12= 'Y' | lv_operator_6_13= 'Z' | lv_operator_6_14= 'H' | lv_operator_6_15= 'O' )
        {
        // InternalNuSMV.g:4672:7: (lv_operator_6_1= '-' | lv_operator_6_2= '+' | lv_operator_6_3= 'EG' | lv_operator_6_4= 'EX' | lv_operator_6_5= 'EF' | lv_operator_6_6= 'AG' | lv_operator_6_7= 'AX' | lv_operator_6_8= 'AF' | lv_operator_6_9= 'X' | lv_operator_6_10= 'G' | lv_operator_6_11= 'F' | lv_operator_6_12= 'Y' | lv_operator_6_13= 'Z' | lv_operator_6_14= 'H' | lv_operator_6_15= 'O' )
        int alt96=15;
        switch ( input.LA(1) ) {
        case 55:
            {
            alt96=1;
            }
            break;
        case 56:
            {
            alt96=2;
            }
            break;
        case 62:
            {
            alt96=3;
            }
            break;
        case 63:
            {
            alt96=4;
            }
            break;
        case 64:
            {
            alt96=5;
            }
            break;
        case 65:
            {
            alt96=6;
            }
            break;
        case 66:
            {
            alt96=7;
            }
            break;
        case 67:
            {
            alt96=8;
            }
            break;
        case 68:
            {
            alt96=9;
            }
            break;
        case 69:
            {
            alt96=10;
            }
            break;
        case 70:
            {
            alt96=11;
            }
            break;
        case 71:
            {
            alt96=12;
            }
            break;
        case 72:
            {
            alt96=13;
            }
            break;
        case 73:
            {
            alt96=14;
            }
            break;
        case 74:
            {
            alt96=15;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 96, 0, input);

            throw nvae;
        }

        switch (alt96) {
            case 1 :
                // InternalNuSMV.g:4673:8: lv_operator_6_1= '-'
                {
                lv_operator_6_1=(Token)match(input,55,FOLLOW_13); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalNuSMV.g:4684:8: lv_operator_6_2= '+'
                {
                lv_operator_6_2=(Token)match(input,56,FOLLOW_13); if (state.failed) return ;

                }
                break;
            case 3 :
                // InternalNuSMV.g:4695:8: lv_operator_6_3= 'EG'
                {
                lv_operator_6_3=(Token)match(input,62,FOLLOW_13); if (state.failed) return ;

                }
                break;
            case 4 :
                // InternalNuSMV.g:4706:8: lv_operator_6_4= 'EX'
                {
                lv_operator_6_4=(Token)match(input,63,FOLLOW_13); if (state.failed) return ;

                }
                break;
            case 5 :
                // InternalNuSMV.g:4717:8: lv_operator_6_5= 'EF'
                {
                lv_operator_6_5=(Token)match(input,64,FOLLOW_13); if (state.failed) return ;

                }
                break;
            case 6 :
                // InternalNuSMV.g:4728:8: lv_operator_6_6= 'AG'
                {
                lv_operator_6_6=(Token)match(input,65,FOLLOW_13); if (state.failed) return ;

                }
                break;
            case 7 :
                // InternalNuSMV.g:4739:8: lv_operator_6_7= 'AX'
                {
                lv_operator_6_7=(Token)match(input,66,FOLLOW_13); if (state.failed) return ;

                }
                break;
            case 8 :
                // InternalNuSMV.g:4750:8: lv_operator_6_8= 'AF'
                {
                lv_operator_6_8=(Token)match(input,67,FOLLOW_13); if (state.failed) return ;

                }
                break;
            case 9 :
                // InternalNuSMV.g:4761:8: lv_operator_6_9= 'X'
                {
                lv_operator_6_9=(Token)match(input,68,FOLLOW_13); if (state.failed) return ;

                }
                break;
            case 10 :
                // InternalNuSMV.g:4772:8: lv_operator_6_10= 'G'
                {
                lv_operator_6_10=(Token)match(input,69,FOLLOW_13); if (state.failed) return ;

                }
                break;
            case 11 :
                // InternalNuSMV.g:4783:8: lv_operator_6_11= 'F'
                {
                lv_operator_6_11=(Token)match(input,70,FOLLOW_13); if (state.failed) return ;

                }
                break;
            case 12 :
                // InternalNuSMV.g:4794:8: lv_operator_6_12= 'Y'
                {
                lv_operator_6_12=(Token)match(input,71,FOLLOW_13); if (state.failed) return ;

                }
                break;
            case 13 :
                // InternalNuSMV.g:4805:8: lv_operator_6_13= 'Z'
                {
                lv_operator_6_13=(Token)match(input,72,FOLLOW_13); if (state.failed) return ;

                }
                break;
            case 14 :
                // InternalNuSMV.g:4816:8: lv_operator_6_14= 'H'
                {
                lv_operator_6_14=(Token)match(input,73,FOLLOW_13); if (state.failed) return ;

                }
                break;
            case 15 :
                // InternalNuSMV.g:4827:8: lv_operator_6_15= 'O'
                {
                lv_operator_6_15=(Token)match(input,74,FOLLOW_13); if (state.failed) return ;

                }
                break;

        }


        }


        }

        // InternalNuSMV.g:4840:5: ( (lv_simpleExpression_7_0= ruleSimpleExpression ) )
        // InternalNuSMV.g:4841:6: (lv_simpleExpression_7_0= ruleSimpleExpression )
        {
        // InternalNuSMV.g:4841:6: (lv_simpleExpression_7_0= ruleSimpleExpression )
        // InternalNuSMV.g:4842:7: lv_simpleExpression_7_0= ruleSimpleExpression
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getTerminalSimpleExpressionAccess().getSimpleExpressionSimpleExpressionParserRuleCall_1_1_1_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_simpleExpression_7_0=ruleSimpleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred132_InternalNuSMV

    // $ANTLR start synpred135_InternalNuSMV
    public final void synpred135_InternalNuSMV_fragment() throws RecognitionException {   
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_value_10_0 = null;

        AntlrDatatypeRuleToken lv_array_12_0 = null;


        // InternalNuSMV.g:4874:3: ( ( () ( (lv_value_10_0= ruleVariableID ) ) (otherlv_11= '[' ( (lv_array_12_0= ruleNUMBER ) ) otherlv_13= ']' )* ) )
        // InternalNuSMV.g:4874:3: ( () ( (lv_value_10_0= ruleVariableID ) ) (otherlv_11= '[' ( (lv_array_12_0= ruleNUMBER ) ) otherlv_13= ']' )* )
        {
        // InternalNuSMV.g:4874:3: ( () ( (lv_value_10_0= ruleVariableID ) ) (otherlv_11= '[' ( (lv_array_12_0= ruleNUMBER ) ) otherlv_13= ']' )* )
        // InternalNuSMV.g:4875:4: () ( (lv_value_10_0= ruleVariableID ) ) (otherlv_11= '[' ( (lv_array_12_0= ruleNUMBER ) ) otherlv_13= ']' )*
        {
        // InternalNuSMV.g:4875:4: ()
        // InternalNuSMV.g:4876:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalNuSMV.g:4885:4: ( (lv_value_10_0= ruleVariableID ) )
        // InternalNuSMV.g:4886:5: (lv_value_10_0= ruleVariableID )
        {
        // InternalNuSMV.g:4886:5: (lv_value_10_0= ruleVariableID )
        // InternalNuSMV.g:4887:6: lv_value_10_0= ruleVariableID
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getTerminalSimpleExpressionAccess().getValueVariableIDParserRuleCall_3_1_0());
          					
        }
        pushFollow(FOLLOW_48);
        lv_value_10_0=ruleVariableID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalNuSMV.g:4904:4: (otherlv_11= '[' ( (lv_array_12_0= ruleNUMBER ) ) otherlv_13= ']' )*
        loop97:
        do {
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==39) ) {
                alt97=1;
            }


            switch (alt97) {
        	case 1 :
        	    // InternalNuSMV.g:4905:5: otherlv_11= '[' ( (lv_array_12_0= ruleNUMBER ) ) otherlv_13= ']'
        	    {
        	    otherlv_11=(Token)match(input,39,FOLLOW_23); if (state.failed) return ;
        	    // InternalNuSMV.g:4909:5: ( (lv_array_12_0= ruleNUMBER ) )
        	    // InternalNuSMV.g:4910:6: (lv_array_12_0= ruleNUMBER )
        	    {
        	    // InternalNuSMV.g:4910:6: (lv_array_12_0= ruleNUMBER )
        	    // InternalNuSMV.g:4911:7: lv_array_12_0= ruleNUMBER
        	    {
        	    if ( state.backtracking==0 ) {

        	      							newCompositeNode(grammarAccess.getTerminalSimpleExpressionAccess().getArrayNUMBERParserRuleCall_3_2_1_0());
        	      						
        	    }
        	    pushFollow(FOLLOW_24);
        	    lv_array_12_0=ruleNUMBER();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }

        	    otherlv_13=(Token)match(input,40,FOLLOW_48); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop97;
            }
        } while (true);


        }


        }
    }
    // $ANTLR end synpred135_InternalNuSMV

    // $ANTLR start synpred138_InternalNuSMV
    public final void synpred138_InternalNuSMV_fragment() throws RecognitionException {   
        Token otherlv_18=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_array_19_0 = null;


        // InternalNuSMV.g:4989:5: ( (otherlv_18= '[' ( (lv_array_19_0= ruleNUMBER ) ) otherlv_20= ']' )* )
        // InternalNuSMV.g:4989:5: (otherlv_18= '[' ( (lv_array_19_0= ruleNUMBER ) ) otherlv_20= ']' )*
        {
        // InternalNuSMV.g:4989:5: (otherlv_18= '[' ( (lv_array_19_0= ruleNUMBER ) ) otherlv_20= ']' )*
        loop98:
        do {
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==39) ) {
                alt98=1;
            }


            switch (alt98) {
        	case 1 :
        	    // InternalNuSMV.g:4990:6: otherlv_18= '[' ( (lv_array_19_0= ruleNUMBER ) ) otherlv_20= ']'
        	    {
        	    otherlv_18=(Token)match(input,39,FOLLOW_23); if (state.failed) return ;
        	    // InternalNuSMV.g:4994:6: ( (lv_array_19_0= ruleNUMBER ) )
        	    // InternalNuSMV.g:4995:7: (lv_array_19_0= ruleNUMBER )
        	    {
        	    // InternalNuSMV.g:4995:7: (lv_array_19_0= ruleNUMBER )
        	    // InternalNuSMV.g:4996:8: lv_array_19_0= ruleNUMBER
        	    {
        	    if ( state.backtracking==0 ) {

        	      								newCompositeNode(grammarAccess.getTerminalSimpleExpressionAccess().getArrayNUMBERParserRuleCall_4_2_1_1_0());
        	      							
        	    }
        	    pushFollow(FOLLOW_24);
        	    lv_array_19_0=ruleNUMBER();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }

        	    otherlv_20=(Token)match(input,40,FOLLOW_48); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop98;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred138_InternalNuSMV

    // $ANTLR start synpred139_InternalNuSMV
    public final void synpred139_InternalNuSMV_fragment() throws RecognitionException {   
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        EObject lv_dotted_17_0 = null;

        AntlrDatatypeRuleToken lv_array_19_0 = null;


        // InternalNuSMV.g:4935:3: ( ( () ( (otherlv_15= RULE_ID ) ) ( (otherlv_16= '.' ( (lv_dotted_17_0= ruleTerminalSimpleExpression ) ) ) | (otherlv_18= '[' ( (lv_array_19_0= ruleNUMBER ) ) otherlv_20= ']' )* )? ) )
        // InternalNuSMV.g:4935:3: ( () ( (otherlv_15= RULE_ID ) ) ( (otherlv_16= '.' ( (lv_dotted_17_0= ruleTerminalSimpleExpression ) ) ) | (otherlv_18= '[' ( (lv_array_19_0= ruleNUMBER ) ) otherlv_20= ']' )* )? )
        {
        // InternalNuSMV.g:4935:3: ( () ( (otherlv_15= RULE_ID ) ) ( (otherlv_16= '.' ( (lv_dotted_17_0= ruleTerminalSimpleExpression ) ) ) | (otherlv_18= '[' ( (lv_array_19_0= ruleNUMBER ) ) otherlv_20= ']' )* )? )
        // InternalNuSMV.g:4936:4: () ( (otherlv_15= RULE_ID ) ) ( (otherlv_16= '.' ( (lv_dotted_17_0= ruleTerminalSimpleExpression ) ) ) | (otherlv_18= '[' ( (lv_array_19_0= ruleNUMBER ) ) otherlv_20= ']' )* )?
        {
        // InternalNuSMV.g:4936:4: ()
        // InternalNuSMV.g:4937:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalNuSMV.g:4946:4: ( (otherlv_15= RULE_ID ) )
        // InternalNuSMV.g:4947:5: (otherlv_15= RULE_ID )
        {
        // InternalNuSMV.g:4947:5: (otherlv_15= RULE_ID )
        // InternalNuSMV.g:4948:6: otherlv_15= RULE_ID
        {
        if ( state.backtracking==0 ) {

          						/* */
          					
        }
        otherlv_15=(Token)match(input,RULE_ID,FOLLOW_49); if (state.failed) return ;

        }


        }

        // InternalNuSMV.g:4962:4: ( (otherlv_16= '.' ( (lv_dotted_17_0= ruleTerminalSimpleExpression ) ) ) | (otherlv_18= '[' ( (lv_array_19_0= ruleNUMBER ) ) otherlv_20= ']' )* )?
        int alt100=3;
        switch ( input.LA(1) ) {
            case 75:
                {
                alt100=1;
                }
                break;
            case 39:
                {
                alt100=2;
                }
                break;
            case EOF:
                {
                int LA100_3 = input.LA(2);

                if ( (synpred138_InternalNuSMV()) ) {
                    alt100=2;
                }
                }
                break;
        }

        switch (alt100) {
            case 1 :
                // InternalNuSMV.g:4963:5: (otherlv_16= '.' ( (lv_dotted_17_0= ruleTerminalSimpleExpression ) ) )
                {
                // InternalNuSMV.g:4963:5: (otherlv_16= '.' ( (lv_dotted_17_0= ruleTerminalSimpleExpression ) ) )
                // InternalNuSMV.g:4964:6: otherlv_16= '.' ( (lv_dotted_17_0= ruleTerminalSimpleExpression ) )
                {
                otherlv_16=(Token)match(input,75,FOLLOW_13); if (state.failed) return ;
                // InternalNuSMV.g:4968:6: ( (lv_dotted_17_0= ruleTerminalSimpleExpression ) )
                // InternalNuSMV.g:4969:7: (lv_dotted_17_0= ruleTerminalSimpleExpression )
                {
                // InternalNuSMV.g:4969:7: (lv_dotted_17_0= ruleTerminalSimpleExpression )
                // InternalNuSMV.g:4970:8: lv_dotted_17_0= ruleTerminalSimpleExpression
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getTerminalSimpleExpressionAccess().getDottedTerminalSimpleExpressionParserRuleCall_4_2_0_1_0());
                  							
                }
                pushFollow(FOLLOW_2);
                lv_dotted_17_0=ruleTerminalSimpleExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }


                }
                break;
            case 2 :
                // InternalNuSMV.g:4989:5: (otherlv_18= '[' ( (lv_array_19_0= ruleNUMBER ) ) otherlv_20= ']' )*
                {
                // InternalNuSMV.g:4989:5: (otherlv_18= '[' ( (lv_array_19_0= ruleNUMBER ) ) otherlv_20= ']' )*
                loop99:
                do {
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==39) ) {
                        alt99=1;
                    }


                    switch (alt99) {
                	case 1 :
                	    // InternalNuSMV.g:4990:6: otherlv_18= '[' ( (lv_array_19_0= ruleNUMBER ) ) otherlv_20= ']'
                	    {
                	    otherlv_18=(Token)match(input,39,FOLLOW_23); if (state.failed) return ;
                	    // InternalNuSMV.g:4994:6: ( (lv_array_19_0= ruleNUMBER ) )
                	    // InternalNuSMV.g:4995:7: (lv_array_19_0= ruleNUMBER )
                	    {
                	    // InternalNuSMV.g:4995:7: (lv_array_19_0= ruleNUMBER )
                	    // InternalNuSMV.g:4996:8: lv_array_19_0= ruleNUMBER
                	    {
                	    if ( state.backtracking==0 ) {

                	      								newCompositeNode(grammarAccess.getTerminalSimpleExpressionAccess().getArrayNUMBERParserRuleCall_4_2_1_1_0());
                	      							
                	    }
                	    pushFollow(FOLLOW_24);
                	    lv_array_19_0=ruleNUMBER();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }

                	    otherlv_20=(Token)match(input,40,FOLLOW_48); if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop99;
                    }
                } while (true);


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred139_InternalNuSMV

    // $ANTLR start synpred140_InternalNuSMV
    public final void synpred140_InternalNuSMV_fragment() throws RecognitionException {   
        Token otherlv_22=null;

        // InternalNuSMV.g:5021:3: ( ( () ( (otherlv_22= RULE_ID ) ) ) )
        // InternalNuSMV.g:5021:3: ( () ( (otherlv_22= RULE_ID ) ) )
        {
        // InternalNuSMV.g:5021:3: ( () ( (otherlv_22= RULE_ID ) ) )
        // InternalNuSMV.g:5022:4: () ( (otherlv_22= RULE_ID ) )
        {
        // InternalNuSMV.g:5022:4: ()
        // InternalNuSMV.g:5023:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalNuSMV.g:5032:4: ( (otherlv_22= RULE_ID ) )
        // InternalNuSMV.g:5033:5: (otherlv_22= RULE_ID )
        {
        // InternalNuSMV.g:5033:5: (otherlv_22= RULE_ID )
        // InternalNuSMV.g:5034:6: otherlv_22= RULE_ID
        {
        if ( state.backtracking==0 ) {

          						/* */
          					
        }
        otherlv_22=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred140_InternalNuSMV

    // $ANTLR start synpred141_InternalNuSMV
    public final void synpred141_InternalNuSMV_fragment() throws RecognitionException {   
        Token otherlv_24=null;

        // InternalNuSMV.g:5050:3: ( ( () ( (otherlv_24= RULE_ID ) ) ) )
        // InternalNuSMV.g:5050:3: ( () ( (otherlv_24= RULE_ID ) ) )
        {
        // InternalNuSMV.g:5050:3: ( () ( (otherlv_24= RULE_ID ) ) )
        // InternalNuSMV.g:5051:4: () ( (otherlv_24= RULE_ID ) )
        {
        // InternalNuSMV.g:5051:4: ()
        // InternalNuSMV.g:5052:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalNuSMV.g:5061:4: ( (otherlv_24= RULE_ID ) )
        // InternalNuSMV.g:5062:5: (otherlv_24= RULE_ID )
        {
        // InternalNuSMV.g:5062:5: (otherlv_24= RULE_ID )
        // InternalNuSMV.g:5063:6: otherlv_24= RULE_ID
        {
        if ( state.backtracking==0 ) {

          						/* */
          					
        }
        otherlv_24=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred141_InternalNuSMV

    // $ANTLR start synpred142_InternalNuSMV
    public final void synpred142_InternalNuSMV_fragment() throws RecognitionException {   
        Token lv_value_26_0=null;

        // InternalNuSMV.g:5079:3: ( ( () ( (lv_value_26_0= RULE_ID ) ) ) )
        // InternalNuSMV.g:5079:3: ( () ( (lv_value_26_0= RULE_ID ) ) )
        {
        // InternalNuSMV.g:5079:3: ( () ( (lv_value_26_0= RULE_ID ) ) )
        // InternalNuSMV.g:5080:4: () ( (lv_value_26_0= RULE_ID ) )
        {
        // InternalNuSMV.g:5080:4: ()
        // InternalNuSMV.g:5081:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalNuSMV.g:5090:4: ( (lv_value_26_0= RULE_ID ) )
        // InternalNuSMV.g:5091:5: (lv_value_26_0= RULE_ID )
        {
        // InternalNuSMV.g:5091:5: (lv_value_26_0= RULE_ID )
        // InternalNuSMV.g:5092:6: lv_value_26_0= RULE_ID
        {
        lv_value_26_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred142_InternalNuSMV

    // $ANTLR start synpred143_InternalNuSMV
    public final void synpred143_InternalNuSMV_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_value_28_0 = null;


        // InternalNuSMV.g:5110:3: ( ( () ( (lv_value_28_0= ruleNUMBER ) ) ) )
        // InternalNuSMV.g:5110:3: ( () ( (lv_value_28_0= ruleNUMBER ) ) )
        {
        // InternalNuSMV.g:5110:3: ( () ( (lv_value_28_0= ruleNUMBER ) ) )
        // InternalNuSMV.g:5111:4: () ( (lv_value_28_0= ruleNUMBER ) )
        {
        // InternalNuSMV.g:5111:4: ()
        // InternalNuSMV.g:5112:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalNuSMV.g:5121:4: ( (lv_value_28_0= ruleNUMBER ) )
        // InternalNuSMV.g:5122:5: (lv_value_28_0= ruleNUMBER )
        {
        // InternalNuSMV.g:5122:5: (lv_value_28_0= ruleNUMBER )
        // InternalNuSMV.g:5123:6: lv_value_28_0= ruleNUMBER
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getTerminalSimpleExpressionAccess().getValueNUMBERParserRuleCall_8_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_value_28_0=ruleNUMBER();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred143_InternalNuSMV

    // $ANTLR start synpred150_InternalNuSMV
    public final void synpred150_InternalNuSMV_fragment() throws RecognitionException {   
        Token otherlv_45=null;
        AntlrDatatypeRuleToken lv_lowerBound_44_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_46_0 = null;


        // InternalNuSMV.g:5319:3: ( ( () ( (lv_lowerBound_44_0= ruleNUMBER ) ) otherlv_45= '..' ( (lv_upperBound_46_0= ruleNUMBER ) ) ) )
        // InternalNuSMV.g:5319:3: ( () ( (lv_lowerBound_44_0= ruleNUMBER ) ) otherlv_45= '..' ( (lv_upperBound_46_0= ruleNUMBER ) ) )
        {
        // InternalNuSMV.g:5319:3: ( () ( (lv_lowerBound_44_0= ruleNUMBER ) ) otherlv_45= '..' ( (lv_upperBound_46_0= ruleNUMBER ) ) )
        // InternalNuSMV.g:5320:4: () ( (lv_lowerBound_44_0= ruleNUMBER ) ) otherlv_45= '..' ( (lv_upperBound_46_0= ruleNUMBER ) )
        {
        // InternalNuSMV.g:5320:4: ()
        // InternalNuSMV.g:5321:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalNuSMV.g:5330:4: ( (lv_lowerBound_44_0= ruleNUMBER ) )
        // InternalNuSMV.g:5331:5: (lv_lowerBound_44_0= ruleNUMBER )
        {
        // InternalNuSMV.g:5331:5: (lv_lowerBound_44_0= ruleNUMBER )
        // InternalNuSMV.g:5332:6: lv_lowerBound_44_0= ruleNUMBER
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getTerminalSimpleExpressionAccess().getLowerBoundNUMBERParserRuleCall_14_1_0());
          					
        }
        pushFollow(FOLLOW_28);
        lv_lowerBound_44_0=ruleNUMBER();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_45=(Token)match(input,45,FOLLOW_23); if (state.failed) return ;
        // InternalNuSMV.g:5353:4: ( (lv_upperBound_46_0= ruleNUMBER ) )
        // InternalNuSMV.g:5354:5: (lv_upperBound_46_0= ruleNUMBER )
        {
        // InternalNuSMV.g:5354:5: (lv_upperBound_46_0= ruleNUMBER )
        // InternalNuSMV.g:5355:6: lv_upperBound_46_0= ruleNUMBER
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getTerminalSimpleExpressionAccess().getUpperBoundNUMBERParserRuleCall_14_3_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_upperBound_46_0=ruleNUMBER();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred150_InternalNuSMV

    // $ANTLR start synpred159_InternalNuSMV
    public final void synpred159_InternalNuSMV_fragment() throws RecognitionException {   
        EObject lv_ctlExpression_1_1 = null;


        // InternalNuSMV.g:5968:7: (lv_ctlExpression_1_1= ruleCTLExpression )
        // InternalNuSMV.g:5968:7: lv_ctlExpression_1_1= ruleCTLExpression
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getRTCTLExpressionAccess().getCtlExpressionCTLExpressionParserRuleCall_0_1_0_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_ctlExpression_1_1=ruleCTLExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred159_InternalNuSMV

    // $ANTLR start synpred168_InternalNuSMV
    public final void synpred168_InternalNuSMV_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_NUMBER_4 = null;

        AntlrDatatypeRuleToken this_TerminalVariableID_5 = null;


        // InternalNuSMV.g:6274:4: ( (kw= '[' (this_NUMBER_4= ruleNUMBER | this_TerminalVariableID_5= ruleTerminalVariableID ) kw= ']' ) )
        // InternalNuSMV.g:6274:4: (kw= '[' (this_NUMBER_4= ruleNUMBER | this_TerminalVariableID_5= ruleTerminalVariableID ) kw= ']' )
        {
        // InternalNuSMV.g:6274:4: (kw= '[' (this_NUMBER_4= ruleNUMBER | this_TerminalVariableID_5= ruleTerminalVariableID ) kw= ']' )
        // InternalNuSMV.g:6275:5: kw= '[' (this_NUMBER_4= ruleNUMBER | this_TerminalVariableID_5= ruleTerminalVariableID ) kw= ']'
        {
        kw=(Token)match(input,39,FOLLOW_17); if (state.failed) return ;
        // InternalNuSMV.g:6280:5: (this_NUMBER_4= ruleNUMBER | this_TerminalVariableID_5= ruleTerminalVariableID )
        int alt106=2;
        int LA106_0 = input.LA(1);

        if ( (LA106_0==RULE_INT||LA106_0==55) ) {
            alt106=1;
        }
        else if ( (LA106_0==RULE_ID) ) {
            alt106=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 106, 0, input);

            throw nvae;
        }
        switch (alt106) {
            case 1 :
                // InternalNuSMV.g:6281:6: this_NUMBER_4= ruleNUMBER
                {
                pushFollow(FOLLOW_24);
                this_NUMBER_4=ruleNUMBER();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalNuSMV.g:6292:6: this_TerminalVariableID_5= ruleTerminalVariableID
                {
                if ( state.backtracking==0 ) {

                  						newCompositeNode(grammarAccess.getVariableIDAccess().getTerminalVariableIDParserRuleCall_1_1_1_1());
                  					
                }
                pushFollow(FOLLOW_24);
                this_TerminalVariableID_5=ruleTerminalVariableID();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred168_InternalNuSMV

    // Delegated rules

    public final boolean synpred57_InternalNuSMV() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_InternalNuSMV_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred73_InternalNuSMV() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred73_InternalNuSMV_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred109_InternalNuSMV() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred109_InternalNuSMV_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred97_InternalNuSMV() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred97_InternalNuSMV_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred94_InternalNuSMV() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred94_InternalNuSMV_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred76_InternalNuSMV() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred76_InternalNuSMV_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred100_InternalNuSMV() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred100_InternalNuSMV_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred141_InternalNuSMV() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred141_InternalNuSMV_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred168_InternalNuSMV() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred168_InternalNuSMV_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred79_InternalNuSMV() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred79_InternalNuSMV_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred132_InternalNuSMV() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred132_InternalNuSMV_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred103_InternalNuSMV() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred103_InternalNuSMV_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred70_InternalNuSMV() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_InternalNuSMV_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred85_InternalNuSMV() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred85_InternalNuSMV_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred91_InternalNuSMV() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred91_InternalNuSMV_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred139_InternalNuSMV() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred139_InternalNuSMV_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred143_InternalNuSMV() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred143_InternalNuSMV_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred135_InternalNuSMV() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred135_InternalNuSMV_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred140_InternalNuSMV() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred140_InternalNuSMV_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred114_InternalNuSMV() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred114_InternalNuSMV_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred88_InternalNuSMV() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred88_InternalNuSMV_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_InternalNuSMV() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_InternalNuSMV_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred82_InternalNuSMV() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred82_InternalNuSMV_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred142_InternalNuSMV() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred142_InternalNuSMV_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred112_InternalNuSMV() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred112_InternalNuSMV_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred106_InternalNuSMV() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred106_InternalNuSMV_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred150_InternalNuSMV() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred150_InternalNuSMV_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred159_InternalNuSMV() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred159_InternalNuSMV_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred138_InternalNuSMV() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred138_InternalNuSMV_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA69 dfa69 = new DFA69(this);
    protected DFA65 dfa65 = new DFA65(this);
    static final String dfa_1s = "\26\uffff";
    static final String dfa_2s = "\6\uffff\1\17\17\uffff";
    static final String dfa_3s = "\1\4\1\uffff\1\0\2\uffff\1\0\1\11\17\uffff";
    static final String dfa_4s = "\1\122\1\uffff\1\0\2\uffff\1\0\1\152\17\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\uffff\1\2\1\3\2\uffff\1\12\1\13\1\14\1\15\1\16\1\20\1\21\1\22\1\11\1\17\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_6s = "\2\uffff\1\1\2\uffff\1\0\20\uffff}>";
    static final String[] dfa_7s = {
            "\1\5\1\13\1\6\3\uffff\1\1\14\uffff\1\1\23\uffff\1\12\5\uffff\1\7\1\10\4\uffff\1\2\1\3\5\uffff\15\3\1\uffff\1\11\2\14\2\15\1\16\1\4",
            "",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\17\1\uffff\10\17\1\uffff\2\17\2\uffff\10\17\1\uffff\4\17\3\uffff\1\17\3\uffff\1\17\1\20\5\uffff\12\17\33\uffff\1\17\2\uffff\20\17",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "4603:2: ( ( () ( (lv_isNext_1_0= 'next' ) )? otherlv_2= '(' ( (lv_simpleExpression_3_0= ruleSimpleExpression ) ) otherlv_4= ')' ) | ( () ( ( ( (lv_operator_6_1= '-' | lv_operator_6_2= '+' | lv_operator_6_3= 'EG' | lv_operator_6_4= 'EX' | lv_operator_6_5= 'EF' | lv_operator_6_6= 'AG' | lv_operator_6_7= 'AX' | lv_operator_6_8= 'AF' | lv_operator_6_9= 'X' | lv_operator_6_10= 'G' | lv_operator_6_11= 'F' | lv_operator_6_12= 'Y' | lv_operator_6_13= 'Z' | lv_operator_6_14= 'H' | lv_operator_6_15= 'O' ) ) ) ( (lv_simpleExpression_7_0= ruleSimpleExpression ) ) ) ) | this_CaseSimpleExpression_8= ruleCaseSimpleExpression | ( () ( (lv_value_10_0= ruleVariableID ) ) (otherlv_11= '[' ( (lv_array_12_0= ruleNUMBER ) ) otherlv_13= ']' )* ) | ( () ( (otherlv_15= RULE_ID ) ) ( (otherlv_16= '.' ( (lv_dotted_17_0= ruleTerminalSimpleExpression ) ) ) | (otherlv_18= '[' ( (lv_array_19_0= ruleNUMBER ) ) otherlv_20= ']' )* )? ) | ( () ( (otherlv_22= RULE_ID ) ) ) | ( () ( (otherlv_24= RULE_ID ) ) ) | ( () ( (lv_value_26_0= RULE_ID ) ) ) | ( () ( (lv_value_28_0= ruleNUMBER ) ) ) | ( () ( (lv_value_30_0= 'TRUE' ) ) ) | ( () ( (lv_value_32_0= 'FALSE' ) ) ) | ( () ( (lv_value_34_0= 'self' ) ) ) | ( () otherlv_36= '{' ( (lv_setElement_37_0= ruleSimpleExpression ) ) (otherlv_38= ',' ( (lv_setElement_39_0= ruleSimpleExpression ) ) )* otherlv_40= '}' ) | ( () ( (lv_value_42_0= RULE_WORD ) ) ) | ( () ( (lv_lowerBound_44_0= ruleNUMBER ) ) otherlv_45= '..' ( (lv_upperBound_46_0= ruleNUMBER ) ) ) | ( () ( ( (lv_ea_48_1= 'E' | lv_ea_48_2= 'A' ) ) ) otherlv_49= '[' ( ( ruleImpliesExpression )=> (lv_arg_50_0= ruleLTLbinExpression ) ) otherlv_51= ']' ) | ( () ( ( (lv_function_53_1= 'word1' | lv_function_53_2= 'bool' ) ) ) otherlv_54= '(' ( (lv_arg_55_0= ruleSimpleExpression ) ) otherlv_56= ')' ) | ( () otherlv_58= 'toint' otherlv_59= '(' ( (lv_arg_60_0= ruleSimpleExpression ) ) otherlv_61= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA69_5 = input.LA(1);

                         
                        int index69_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalNuSMV()) ) {s = 17;}

                        else if ( (synpred139_InternalNuSMV()) ) {s = 18;}

                        else if ( (synpred140_InternalNuSMV()) ) {s = 19;}

                        else if ( (synpred141_InternalNuSMV()) ) {s = 20;}

                        else if ( (synpred142_InternalNuSMV()) ) {s = 21;}

                         
                        input.seek(index69_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA69_2 = input.LA(1);

                         
                        int index69_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalNuSMV()) ) {s = 3;}

                        else if ( (synpred143_InternalNuSMV()) ) {s = 15;}

                        else if ( (synpred150_InternalNuSMV()) ) {s = 16;}

                         
                        input.seek(index69_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 69, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\71\uffff";
    static final String dfa_9s = "\1\36\70\uffff";
    static final String dfa_10s = "\1\11\2\uffff\65\0\1\uffff";
    static final String dfa_11s = "\1\152\2\uffff\65\0\1\uffff";
    static final String dfa_12s = "\1\uffff\1\1\1\2\65\uffff\1\3";
    static final String dfa_13s = "\3\uffff\1\7\1\43\1\2\1\45\1\41\1\40\1\21\1\53\1\32\1\20\1\55\1\11\1\27\1\47\1\35\1\54\1\6\1\34\1\52\1\3\1\22\1\4\1\37\1\13\1\33\1\5\1\56\1\26\1\44\1\14\1\15\1\30\1\57\1\17\1\24\1\16\1\36\1\51\1\0\1\50\1\62\1\23\1\10\1\25\1\64\1\1\1\12\1\46\1\60\1\31\1\63\1\61\1\42\1\uffff}>";
    static final String[] dfa_14s = {
            "\1\37\1\uffff\1\63\1\64\1\40\1\41\1\42\1\66\1\35\1\43\1\uffff\1\44\1\45\2\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\uffff\1\56\1\57\1\61\1\60\2\uffff\1\2\1\67\3\uffff\1\65\6\uffff\1\14\1\13\1\12\1\11\1\10\1\7\1\6\1\5\1\4\1\3\16\uffff\1\1\14\uffff\1\62\2\uffff\1\15\1\16\1\17\1\20\1\21\1\22\1\24\1\25\1\26\1\30\1\27\1\23\1\31\1\32\1\33\1\34",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "4962:4: ( (otherlv_16= '.' ( (lv_dotted_17_0= ruleTerminalSimpleExpression ) ) ) | (otherlv_18= '[' ( (lv_array_19_0= ruleNUMBER ) ) otherlv_20= ']' )* )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_41 = input.LA(1);

                         
                        int index65_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_41);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA65_48 = input.LA(1);

                         
                        int index65_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_48);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA65_5 = input.LA(1);

                         
                        int index65_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA65_22 = input.LA(1);

                         
                        int index65_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_22);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA65_24 = input.LA(1);

                         
                        int index65_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_24);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA65_28 = input.LA(1);

                         
                        int index65_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_28);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA65_19 = input.LA(1);

                         
                        int index65_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_19);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA65_3 = input.LA(1);

                         
                        int index65_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_3);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA65_45 = input.LA(1);

                         
                        int index65_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_45);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA65_14 = input.LA(1);

                         
                        int index65_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_14);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA65_49 = input.LA(1);

                         
                        int index65_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_49);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA65_26 = input.LA(1);

                         
                        int index65_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_26);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA65_32 = input.LA(1);

                         
                        int index65_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_32);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA65_33 = input.LA(1);

                         
                        int index65_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_33);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA65_38 = input.LA(1);

                         
                        int index65_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_38);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA65_36 = input.LA(1);

                         
                        int index65_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_36);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA65_12 = input.LA(1);

                         
                        int index65_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_12);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA65_9 = input.LA(1);

                         
                        int index65_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_9);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA65_23 = input.LA(1);

                         
                        int index65_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_23);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA65_44 = input.LA(1);

                         
                        int index65_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_44);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA65_37 = input.LA(1);

                         
                        int index65_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_37);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA65_46 = input.LA(1);

                         
                        int index65_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_46);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA65_30 = input.LA(1);

                         
                        int index65_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_30);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA65_15 = input.LA(1);

                         
                        int index65_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_15);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA65_34 = input.LA(1);

                         
                        int index65_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_34);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA65_52 = input.LA(1);

                         
                        int index65_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_52);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA65_11 = input.LA(1);

                         
                        int index65_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_11);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA65_27 = input.LA(1);

                         
                        int index65_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_27);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA65_20 = input.LA(1);

                         
                        int index65_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_20);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA65_17 = input.LA(1);

                         
                        int index65_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_17);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA65_39 = input.LA(1);

                         
                        int index65_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_39);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA65_25 = input.LA(1);

                         
                        int index65_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_25);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA65_8 = input.LA(1);

                         
                        int index65_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_8);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA65_7 = input.LA(1);

                         
                        int index65_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_7);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA65_55 = input.LA(1);

                         
                        int index65_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_55);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA65_4 = input.LA(1);

                         
                        int index65_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_4);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA65_31 = input.LA(1);

                         
                        int index65_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_31);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA65_6 = input.LA(1);

                         
                        int index65_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_6);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA65_50 = input.LA(1);

                         
                        int index65_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_50);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA65_16 = input.LA(1);

                         
                        int index65_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_16);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA65_42 = input.LA(1);

                         
                        int index65_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_42);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA65_40 = input.LA(1);

                         
                        int index65_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_40);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA65_21 = input.LA(1);

                         
                        int index65_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_21);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA65_10 = input.LA(1);

                         
                        int index65_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_10);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA65_18 = input.LA(1);

                         
                        int index65_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_18);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA65_13 = input.LA(1);

                         
                        int index65_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_13);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA65_29 = input.LA(1);

                         
                        int index65_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_29);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA65_35 = input.LA(1);

                         
                        int index65_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_35);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA65_51 = input.LA(1);

                         
                        int index65_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_51);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA65_54 = input.LA(1);

                         
                        int index65_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_54);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA65_43 = input.LA(1);

                         
                        int index65_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_43);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA65_53 = input.LA(1);

                         
                        int index65_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_53);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA65_47 = input.LA(1);

                         
                        int index65_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNuSMV()) ) {s = 2;}

                        else if ( (true) ) {s = 56;}

                         
                        input.seek(index65_47);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 65, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000001EFF34E402L,0x0000000001000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000001EFF34E002L,0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00814E6000000050L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0xE186080000800470L,0x000000000007F7FFL});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0080000000C00052L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0080000000000050L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0xE186080100800470L,0x000000000007F7FFL});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0080000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0086000000000050L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000100000000800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00804E6000000050L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000002L,0x0000078000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000002L,0x0000000E00000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000002L,0x00000001F8000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000008000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000800L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0xE186080000800470L,0x00000000000FF7FFL});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0xE186080100800470L,0x0000000000F7F7FFL});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000040L});

}