define(["ace/lib/oop", "ace/mode/text", "ace/mode/text_highlight_rules"], function(oop, mText, mTextHighlightRules) {
	var HighlightRules = function() {
		var keywords = "A|ABF|ABG|AF|AG|ASSIGN|AX|COMPUTE|CONSTANTS|CTLSPEC|DEFINE|E|EBF|EBG|EF|EG|EX|F|FAIRNESS|FALSE|FROZENVAR|G|H|INIT|INVAR|INVARSPEC|ISA|IVAR|JUSTICE|LTLSPEC|MAX|MIN|MODULE|NAME|O|PSLSPEC|S|SPEC|T|TRANS|TRUE|U|V|VAR|X|Y|Z|array|bool|boolean|case|esac|in|init|mod|next|of|process|self|toint|union|unsigned|word|word1|xnor|xor";
		this.$rules = {
			"start": [
				{token: "lparen", regex: "[\\[({]"},
				{token: "rparen", regex: "[\\])}]"},
				{token: "keyword", regex: "\\b(?:" + keywords + ")\\b"}
			]
		};
	};
	oop.inherits(HighlightRules, mTextHighlightRules.TextHighlightRules);
	
	var Mode = function() {
		this.HighlightRules = HighlightRules;
	};
	oop.inherits(Mode, mText.Mode);
	Mode.prototype.$id = "xtext/smv";
	Mode.prototype.getCompletions = function(state, session, pos, prefix) {
		return [];
	}
	
	return {
		Mode: Mode
	};
});
