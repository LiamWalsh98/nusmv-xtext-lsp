// Monarch syntax highlighting for the nusmv language.
export default {
    keywords: [
        'A','ABF','ABG','AF','AG','ASSIGN','AX','COMPASSION','COMPUTE','CONSTANTS','CTLSPEC','DEFINE','E','EBF','EBG','EF','EG','EX','F','FAIRNESS','FALSE','FROZENVAR','G','H','INIT','INVAR','INVARSPEC','ISA','IVAR','JUSTICE','LTLSPEC','MAX','MIN','MODULE','NAME','O','PSLSPEC','S','SPEC','T','TRANS','TRUE','U','V','VAR','X','Y','Z','array','bool','boolean','case','esac','in','init','mod','next','of','process','self','signed','toint','union','unsigned','word','word1','xnor','xor'
    ],
    operators: [
        '!','!=','&','*','+',',','-','->','.','..','/',':','::',':=',';','<','<->','<<','<=','=','>','>=','>>','|'
    ],
    symbols: /!|!=|&|\(|\)|\*|\+|,|-|->|\.|\.\.|\/|:|::|:=|;|<|<->|<<|<=|=|>|>=|>>|\[|\]|\{|\||\}/,

    tokenizer: {
        initial: [
            { regex: /0(?:u|s)?(?:b|B|o|O|_|d|D|h|H)\d*_[A-Fa-f0-9]+/, action: {"token":"WORD"} },
            { regex: /[A-Za-z_][A-Za-z0-9_$#-]*/, action: { cases: { '@keywords': {"token":"keyword"}, '@default': {"token":"ID"} }} },
            { regex: /[0-9]+/, action: { cases: { '@keywords': {"token":"keyword"}, '@default': {"token":"number"} }} },
            { include: '@whitespace' },
            { regex: /@symbols/, action: { cases: { '@operators': {"token":"operator"}, '@default': {"token":""} }} },
        ],
        whitespace: [
            { regex: /\s+/, action: {"token":"white"} },
            { regex: /--[^\n\r]*/, action: {"token":"comment"} },
        ],
        comment: [
        ],
    }
};
