/**
 * generated by Xtext 2.21.0
 */
package org.xtext.nusmv.language.nuSMV.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.nusmv.language.nuSMV.ArrayType;
import org.xtext.nusmv.language.nuSMV.AssignBody;
import org.xtext.nusmv.language.nuSMV.AssignConstraintElement;
import org.xtext.nusmv.language.nuSMV.AsyncrProcessType;
import org.xtext.nusmv.language.nuSMV.BinaryExpression;
import org.xtext.nusmv.language.nuSMV.BooleanType;
import org.xtext.nusmv.language.nuSMV.CTLExpression;
import org.xtext.nusmv.language.nuSMV.CaseSimpleAssignementExpression;
import org.xtext.nusmv.language.nuSMV.CaseSimpleExpression;
import org.xtext.nusmv.language.nuSMV.CompassionExpression;
import org.xtext.nusmv.language.nuSMV.ComputeSpecification;
import org.xtext.nusmv.language.nuSMV.ConstantsDeclaration;
import org.xtext.nusmv.language.nuSMV.CtlSpecification;
import org.xtext.nusmv.language.nuSMV.DefineBody;
import org.xtext.nusmv.language.nuSMV.DefineDeclaration;
import org.xtext.nusmv.language.nuSMV.EnumType;
import org.xtext.nusmv.language.nuSMV.FairnessConstraint;
import org.xtext.nusmv.language.nuSMV.FairnessExpression;
import org.xtext.nusmv.language.nuSMV.FormalParameter;
import org.xtext.nusmv.language.nuSMV.FrozenVariableDeclaration;
import org.xtext.nusmv.language.nuSMV.IVariableDeclaration;
import org.xtext.nusmv.language.nuSMV.InitBody;
import org.xtext.nusmv.language.nuSMV.InitConstraint;
import org.xtext.nusmv.language.nuSMV.IntervalExpression;
import org.xtext.nusmv.language.nuSMV.IntervalType;
import org.xtext.nusmv.language.nuSMV.InvarConstraint;
import org.xtext.nusmv.language.nuSMV.InvarSpecification;
import org.xtext.nusmv.language.nuSMV.IsaDeclaration;
import org.xtext.nusmv.language.nuSMV.JusticeExpression;
import org.xtext.nusmv.language.nuSMV.LTLExpression;
import org.xtext.nusmv.language.nuSMV.LtlSpecification;
import org.xtext.nusmv.language.nuSMV.ModuleElement;
import org.xtext.nusmv.language.nuSMV.ModuleType;
import org.xtext.nusmv.language.nuSMV.NextBody;
import org.xtext.nusmv.language.nuSMV.NextExpression;
import org.xtext.nusmv.language.nuSMV.Not;
import org.xtext.nusmv.language.nuSMV.NuSMVFactory;
import org.xtext.nusmv.language.nuSMV.NuSMVPackage;
import org.xtext.nusmv.language.nuSMV.NuSmvModel;
import org.xtext.nusmv.language.nuSMV.PSLExpression;
import org.xtext.nusmv.language.nuSMV.ParsExpression;
import org.xtext.nusmv.language.nuSMV.PslSpecification;
import org.xtext.nusmv.language.nuSMV.RTCTLExpression;
import org.xtext.nusmv.language.nuSMV.RangeExpression;
import org.xtext.nusmv.language.nuSMV.SetElementExpression;
import org.xtext.nusmv.language.nuSMV.SetExpression;
import org.xtext.nusmv.language.nuSMV.SetValueParameter;
import org.xtext.nusmv.language.nuSMV.SignedWordType;
import org.xtext.nusmv.language.nuSMV.SimpleExpression;
import org.xtext.nusmv.language.nuSMV.SimpleType;
import org.xtext.nusmv.language.nuSMV.SingleRTCTLExpression;
import org.xtext.nusmv.language.nuSMV.SyncrProcessType;
import org.xtext.nusmv.language.nuSMV.ToInt;
import org.xtext.nusmv.language.nuSMV.TransConstraint;
import org.xtext.nusmv.language.nuSMV.Type;
import org.xtext.nusmv.language.nuSMV.UnaryExpression;
import org.xtext.nusmv.language.nuSMV.UnaryFunctionExpression;
import org.xtext.nusmv.language.nuSMV.UnaryRTCTLExpression;
import org.xtext.nusmv.language.nuSMV.UnsignedWordType;
import org.xtext.nusmv.language.nuSMV.UntilCTLexpression;
import org.xtext.nusmv.language.nuSMV.Val;
import org.xtext.nusmv.language.nuSMV.ValueExpression;
import org.xtext.nusmv.language.nuSMV.Var;
import org.xtext.nusmv.language.nuSMV.VarBody;
import org.xtext.nusmv.language.nuSMV.VarBodyAssign;
import org.xtext.nusmv.language.nuSMV.VariableDeclaration;
import org.xtext.nusmv.language.nuSMV.WordExpression;
import org.xtext.nusmv.language.nuSMV.WordType;
import org.xtext.nusmv.language.nuSMV.operators;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NuSMVFactoryImpl extends EFactoryImpl implements NuSMVFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static NuSMVFactory init()
  {
    try
    {
      NuSMVFactory theNuSMVFactory = (NuSMVFactory)EPackage.Registry.INSTANCE.getEFactory(NuSMVPackage.eNS_URI);
      if (theNuSMVFactory != null)
      {
        return theNuSMVFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new NuSMVFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NuSMVFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case NuSMVPackage.NU_SMV_MODEL: return createNuSmvModel();
      case NuSMVPackage.MODULE: return createModule();
      case NuSMVPackage.MODULE_ELEMENT: return createModuleElement();
      case NuSMVPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case NuSMVPackage.IVARIABLE_DECLARATION: return createIVariableDeclaration();
      case NuSMVPackage.FROZEN_VARIABLE_DECLARATION: return createFrozenVariableDeclaration();
      case NuSMVPackage.VAR_BODY: return createVarBody();
      case NuSMVPackage.DEFINE_DECLARATION: return createDefineDeclaration();
      case NuSMVPackage.DEFINE_BODY: return createDefineBody();
      case NuSMVPackage.CONSTANTS_DECLARATION: return createConstantsDeclaration();
      case NuSMVPackage.ASSIGN_CONSTRAINT_ELEMENT: return createAssignConstraintElement();
      case NuSMVPackage.ASSIGN_BODY: return createAssignBody();
      case NuSMVPackage.VAR_BODY_ASSIGN: return createVarBodyAssign();
      case NuSMVPackage.INIT_BODY: return createInitBody();
      case NuSMVPackage.NEXT_BODY: return createNextBody();
      case NuSMVPackage.TRANS_CONSTRAINT: return createTransConstraint();
      case NuSMVPackage.INIT_CONSTRAINT: return createInitConstraint();
      case NuSMVPackage.INVAR_CONSTRAINT: return createInvarConstraint();
      case NuSMVPackage.FAIRNESS_CONSTRAINT: return createFairnessConstraint();
      case NuSMVPackage.FAIRNESS_EXPRESSION: return createFairnessExpression();
      case NuSMVPackage.JUSTICE_EXPRESSION: return createJusticeExpression();
      case NuSMVPackage.COMPASSION_EXPRESSION: return createCompassionExpression();
      case NuSMVPackage.CTL_SPECIFICATION: return createCtlSpecification();
      case NuSMVPackage.PSL_SPECIFICATION: return createPslSpecification();
      case NuSMVPackage.INVAR_SPECIFICATION: return createInvarSpecification();
      case NuSMVPackage.ISA_DECLARATION: return createIsaDeclaration();
      case NuSMVPackage.LTL_SPECIFICATION: return createLtlSpecification();
      case NuSMVPackage.TYPE: return createType();
      case NuSMVPackage.SIMPLE_TYPE: return createSimpleType();
      case NuSMVPackage.MODULE_TYPE: return createModuleType();
      case NuSMVPackage.VAL: return createVal();
      case NuSMVPackage.NEXT_EXPRESSION: return createNextExpression();
      case NuSMVPackage.SIMPLE_EXPRESSION: return createSimpleExpression();
      case NuSMVPackage.FORMAL_PARAMETER: return createFormalParameter();
      case NuSMVPackage.CASE_SIMPLE_EXPRESSION: return createCaseSimpleExpression();
      case NuSMVPackage.CASE_SIMPLE_ASSIGNEMENT_EXPRESSION: return createCaseSimpleAssignementExpression();
      case NuSMVPackage.CTL_EXPRESSION: return createCTLExpression();
      case NuSMVPackage.PSL_EXPRESSION: return createPSLExpression();
      case NuSMVPackage.LTL_EXPRESSION: return createLTLExpression();
      case NuSMVPackage.RANGE_EXPRESSION: return createRangeExpression();
      case NuSMVPackage.RTCTL_EXPRESSION: return createRTCTLExpression();
      case NuSMVPackage.COMPUTE_SPECIFICATION: return createComputeSpecification();
      case NuSMVPackage.BOOLEAN_TYPE: return createBooleanType();
      case NuSMVPackage.WORD_TYPE: return createWordType();
      case NuSMVPackage.UNSIGNED_WORD_TYPE: return createUnsignedWordType();
      case NuSMVPackage.SIGNED_WORD_TYPE: return createSignedWordType();
      case NuSMVPackage.ENUM_TYPE: return createEnumType();
      case NuSMVPackage.INTERVAL_TYPE: return createIntervalType();
      case NuSMVPackage.ARRAY_TYPE: return createArrayType();
      case NuSMVPackage.ASYNCR_PROCESS_TYPE: return createAsyncrProcessType();
      case NuSMVPackage.SYNCR_PROCESS_TYPE: return createSyncrProcessType();
      case NuSMVPackage.BINARY_EXPRESSION: return createBinaryExpression();
      case NuSMVPackage.NOT: return createNot();
      case NuSMVPackage.PARS_EXPRESSION: return createParsExpression();
      case NuSMVPackage.UNARY_EXPRESSION: return createUnaryExpression();
      case NuSMVPackage.VALUE_EXPRESSION: return createValueExpression();
      case NuSMVPackage.VAR: return createVar();
      case NuSMVPackage.SET_ELEMENT_EXPRESSION: return createSetElementExpression();
      case NuSMVPackage.SET_VALUE_PARAMETER: return createSetValueParameter();
      case NuSMVPackage.SET_EXPRESSION: return createSetExpression();
      case NuSMVPackage.WORD_EXPRESSION: return createWordExpression();
      case NuSMVPackage.INTERVAL_EXPRESSION: return createIntervalExpression();
      case NuSMVPackage.UNTIL_CT_LEXPRESSION: return createUntilCTLexpression();
      case NuSMVPackage.UNARY_FUNCTION_EXPRESSION: return createUnaryFunctionExpression();
      case NuSMVPackage.TO_INT: return createToInt();
      case NuSMVPackage.SINGLE_RTCTL_EXPRESSION: return createSingleRTCTLExpression();
      case NuSMVPackage.UNARY_RTCTL_EXPRESSION: return createUnaryRTCTLExpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case NuSMVPackage.OPERATORS:
        return createoperatorsFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case NuSMVPackage.OPERATORS:
        return convertoperatorsToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NuSmvModel createNuSmvModel()
  {
    NuSmvModelImpl nuSmvModel = new NuSmvModelImpl();
    return nuSmvModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public org.xtext.nusmv.language.nuSMV.Module createModule()
  {
    ModuleImpl module = new ModuleImpl();
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ModuleElement createModuleElement()
  {
    ModuleElementImpl moduleElement = new ModuleElementImpl();
    return moduleElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IVariableDeclaration createIVariableDeclaration()
  {
    IVariableDeclarationImpl iVariableDeclaration = new IVariableDeclarationImpl();
    return iVariableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FrozenVariableDeclaration createFrozenVariableDeclaration()
  {
    FrozenVariableDeclarationImpl frozenVariableDeclaration = new FrozenVariableDeclarationImpl();
    return frozenVariableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VarBody createVarBody()
  {
    VarBodyImpl varBody = new VarBodyImpl();
    return varBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DefineDeclaration createDefineDeclaration()
  {
    DefineDeclarationImpl defineDeclaration = new DefineDeclarationImpl();
    return defineDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DefineBody createDefineBody()
  {
    DefineBodyImpl defineBody = new DefineBodyImpl();
    return defineBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConstantsDeclaration createConstantsDeclaration()
  {
    ConstantsDeclarationImpl constantsDeclaration = new ConstantsDeclarationImpl();
    return constantsDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AssignConstraintElement createAssignConstraintElement()
  {
    AssignConstraintElementImpl assignConstraintElement = new AssignConstraintElementImpl();
    return assignConstraintElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AssignBody createAssignBody()
  {
    AssignBodyImpl assignBody = new AssignBodyImpl();
    return assignBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VarBodyAssign createVarBodyAssign()
  {
    VarBodyAssignImpl varBodyAssign = new VarBodyAssignImpl();
    return varBodyAssign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InitBody createInitBody()
  {
    InitBodyImpl initBody = new InitBodyImpl();
    return initBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NextBody createNextBody()
  {
    NextBodyImpl nextBody = new NextBodyImpl();
    return nextBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TransConstraint createTransConstraint()
  {
    TransConstraintImpl transConstraint = new TransConstraintImpl();
    return transConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InitConstraint createInitConstraint()
  {
    InitConstraintImpl initConstraint = new InitConstraintImpl();
    return initConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InvarConstraint createInvarConstraint()
  {
    InvarConstraintImpl invarConstraint = new InvarConstraintImpl();
    return invarConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FairnessConstraint createFairnessConstraint()
  {
    FairnessConstraintImpl fairnessConstraint = new FairnessConstraintImpl();
    return fairnessConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FairnessExpression createFairnessExpression()
  {
    FairnessExpressionImpl fairnessExpression = new FairnessExpressionImpl();
    return fairnessExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JusticeExpression createJusticeExpression()
  {
    JusticeExpressionImpl justiceExpression = new JusticeExpressionImpl();
    return justiceExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CompassionExpression createCompassionExpression()
  {
    CompassionExpressionImpl compassionExpression = new CompassionExpressionImpl();
    return compassionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CtlSpecification createCtlSpecification()
  {
    CtlSpecificationImpl ctlSpecification = new CtlSpecificationImpl();
    return ctlSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PslSpecification createPslSpecification()
  {
    PslSpecificationImpl pslSpecification = new PslSpecificationImpl();
    return pslSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InvarSpecification createInvarSpecification()
  {
    InvarSpecificationImpl invarSpecification = new InvarSpecificationImpl();
    return invarSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IsaDeclaration createIsaDeclaration()
  {
    IsaDeclarationImpl isaDeclaration = new IsaDeclarationImpl();
    return isaDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LtlSpecification createLtlSpecification()
  {
    LtlSpecificationImpl ltlSpecification = new LtlSpecificationImpl();
    return ltlSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SimpleType createSimpleType()
  {
    SimpleTypeImpl simpleType = new SimpleTypeImpl();
    return simpleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ModuleType createModuleType()
  {
    ModuleTypeImpl moduleType = new ModuleTypeImpl();
    return moduleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Val createVal()
  {
    ValImpl val = new ValImpl();
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NextExpression createNextExpression()
  {
    NextExpressionImpl nextExpression = new NextExpressionImpl();
    return nextExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SimpleExpression createSimpleExpression()
  {
    SimpleExpressionImpl simpleExpression = new SimpleExpressionImpl();
    return simpleExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FormalParameter createFormalParameter()
  {
    FormalParameterImpl formalParameter = new FormalParameterImpl();
    return formalParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CaseSimpleExpression createCaseSimpleExpression()
  {
    CaseSimpleExpressionImpl caseSimpleExpression = new CaseSimpleExpressionImpl();
    return caseSimpleExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CaseSimpleAssignementExpression createCaseSimpleAssignementExpression()
  {
    CaseSimpleAssignementExpressionImpl caseSimpleAssignementExpression = new CaseSimpleAssignementExpressionImpl();
    return caseSimpleAssignementExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CTLExpression createCTLExpression()
  {
    CTLExpressionImpl ctlExpression = new CTLExpressionImpl();
    return ctlExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PSLExpression createPSLExpression()
  {
    PSLExpressionImpl pslExpression = new PSLExpressionImpl();
    return pslExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LTLExpression createLTLExpression()
  {
    LTLExpressionImpl ltlExpression = new LTLExpressionImpl();
    return ltlExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RangeExpression createRangeExpression()
  {
    RangeExpressionImpl rangeExpression = new RangeExpressionImpl();
    return rangeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RTCTLExpression createRTCTLExpression()
  {
    RTCTLExpressionImpl rtctlExpression = new RTCTLExpressionImpl();
    return rtctlExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ComputeSpecification createComputeSpecification()
  {
    ComputeSpecificationImpl computeSpecification = new ComputeSpecificationImpl();
    return computeSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanType createBooleanType()
  {
    BooleanTypeImpl booleanType = new BooleanTypeImpl();
    return booleanType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WordType createWordType()
  {
    WordTypeImpl wordType = new WordTypeImpl();
    return wordType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnsignedWordType createUnsignedWordType()
  {
    UnsignedWordTypeImpl unsignedWordType = new UnsignedWordTypeImpl();
    return unsignedWordType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SignedWordType createSignedWordType()
  {
    SignedWordTypeImpl signedWordType = new SignedWordTypeImpl();
    return signedWordType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EnumType createEnumType()
  {
    EnumTypeImpl enumType = new EnumTypeImpl();
    return enumType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntervalType createIntervalType()
  {
    IntervalTypeImpl intervalType = new IntervalTypeImpl();
    return intervalType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArrayType createArrayType()
  {
    ArrayTypeImpl arrayType = new ArrayTypeImpl();
    return arrayType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AsyncrProcessType createAsyncrProcessType()
  {
    AsyncrProcessTypeImpl asyncrProcessType = new AsyncrProcessTypeImpl();
    return asyncrProcessType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SyncrProcessType createSyncrProcessType()
  {
    SyncrProcessTypeImpl syncrProcessType = new SyncrProcessTypeImpl();
    return syncrProcessType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BinaryExpression createBinaryExpression()
  {
    BinaryExpressionImpl binaryExpression = new BinaryExpressionImpl();
    return binaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Not createNot()
  {
    NotImpl not = new NotImpl();
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ParsExpression createParsExpression()
  {
    ParsExpressionImpl parsExpression = new ParsExpressionImpl();
    return parsExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnaryExpression createUnaryExpression()
  {
    UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
    return unaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ValueExpression createValueExpression()
  {
    ValueExpressionImpl valueExpression = new ValueExpressionImpl();
    return valueExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Var createVar()
  {
    VarImpl var = new VarImpl();
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SetElementExpression createSetElementExpression()
  {
    SetElementExpressionImpl setElementExpression = new SetElementExpressionImpl();
    return setElementExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SetValueParameter createSetValueParameter()
  {
    SetValueParameterImpl setValueParameter = new SetValueParameterImpl();
    return setValueParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SetExpression createSetExpression()
  {
    SetExpressionImpl setExpression = new SetExpressionImpl();
    return setExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WordExpression createWordExpression()
  {
    WordExpressionImpl wordExpression = new WordExpressionImpl();
    return wordExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntervalExpression createIntervalExpression()
  {
    IntervalExpressionImpl intervalExpression = new IntervalExpressionImpl();
    return intervalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UntilCTLexpression createUntilCTLexpression()
  {
    UntilCTLexpressionImpl untilCTLexpression = new UntilCTLexpressionImpl();
    return untilCTLexpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnaryFunctionExpression createUnaryFunctionExpression()
  {
    UnaryFunctionExpressionImpl unaryFunctionExpression = new UnaryFunctionExpressionImpl();
    return unaryFunctionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ToInt createToInt()
  {
    ToIntImpl toInt = new ToIntImpl();
    return toInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SingleRTCTLExpression createSingleRTCTLExpression()
  {
    SingleRTCTLExpressionImpl singleRTCTLExpression = new SingleRTCTLExpressionImpl();
    return singleRTCTLExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnaryRTCTLExpression createUnaryRTCTLExpression()
  {
    UnaryRTCTLExpressionImpl unaryRTCTLExpression = new UnaryRTCTLExpressionImpl();
    return unaryRTCTLExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public operators createoperatorsFromString(EDataType eDataType, String initialValue)
  {
    operators result = operators.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertoperatorsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NuSMVPackage getNuSMVPackage()
  {
    return (NuSMVPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static NuSMVPackage getPackage()
  {
    return NuSMVPackage.eINSTANCE;
  }

} //NuSMVFactoryImpl
