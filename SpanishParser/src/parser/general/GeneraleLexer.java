package parser.general;

// Generated from GeneraleLexer.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GeneraleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TestoNomeSezione=1, EnterSezione=2, ExitSezione=3, EnterInfo=4, ExitInfo=5, 
		TestoInformazione=6, SkipInformazione=7, EnterCollegamento=8, ExitCollegamento=9, 
		CollegamentoImage=10, CollegamentoTestoGenerico=11, SkipCollegamento=12, 
		Grassetto=13, Corsivo=14, CorsivoGrassetto=15, Elenco=16, NEWLINE=17, 
		Text=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"EnterInformazione", "ExitInfo", "TestoInformazione", "SkipInformazione", 
		"EnterCollegamento", "ExitCollegamento", "CollegamentoImage", "CollegamentoTestoGenerico", 
		"SkipCollegamento", "Grassetto", "Corsivo", "CorsivoGrassetto", "Elenco", 
		"ElencoNumerico", "ElencoPuntato", "ElencoPersonalizzato", "ElencoVuoto", 
		"TestoElencoPersonalizzato", "NEWLINE", "Text", "UGUALE", "GRAFFAAPERTA", 
		"GRAFFACHIUSA", "QUADRAAPERTA", "QUADRACHIUSA", "TRATTINO", "DUEPUNTI", 
		"BARRAVERTICALE", "CANCELLETTO", "ASTERISCO", "PUNTOVIRGOLA", "APOSTROFO"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TestoNomeSezione", "EnterSezione", "ExitSezione", "EnterInfo", 
		"ExitInfo", "TestoInformazione", "SkipInformazione", "EnterCollegamento", 
		"ExitCollegamento", "CollegamentoImage", "CollegamentoTestoGenerico", 
		"SkipCollegamento", "Grassetto", "Corsivo", "CorsivoGrassetto", "Elenco", 
		"NEWLINE", "Text"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	protected boolean testo = false;
	protected boolean enterSezione = false;
	protected boolean enterInfo = false;
	protected boolean enterCollegamento = false;


	public GeneraleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GeneraleLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			EnterInformazione_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			ExitInfo_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			EnterCollegamento_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			ExitCollegamento_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void EnterInformazione_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			enterInfo = true; testo = false;
			break;
		}
	}
	private void ExitInfo_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			enterInfo = false; testo = true; 
			break;
		}
	}
	private void EnterCollegamento_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			enterCollegamento = true; testo = false;
			break;
		}
	}
	private void ExitCollegamento_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			enterCollegamento = false; testo = true;
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return ExitInfo_sempred((RuleContext)_localctx, predIndex);
		case 2:
			return TestoInformazione_sempred((RuleContext)_localctx, predIndex);
		case 3:
			return SkipInformazione_sempred((RuleContext)_localctx, predIndex);
		case 5:
			return ExitCollegamento_sempred((RuleContext)_localctx, predIndex);
		case 6:
			return CollegamentoImage_sempred((RuleContext)_localctx, predIndex);
		case 7:
			return CollegamentoTestoGenerico_sempred((RuleContext)_localctx, predIndex);
		case 8:
			return SkipCollegamento_sempred((RuleContext)_localctx, predIndex);
		case 19:
			return Text_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean ExitInfo_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return enterInfo;
		}
		return true;
	}
	private boolean TestoInformazione_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return enterInfo;
		}
		return true;
	}
	private boolean SkipInformazione_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return enterInfo;
		}
		return true;
	}
	private boolean ExitCollegamento_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return enterCollegamento;
		}
		return true;
	}
	private boolean CollegamentoImage_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return enterCollegamento;
		}
		return true;
	}
	private boolean CollegamentoTestoGenerico_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return enterCollegamento;
		case 6:
			return _input.LA(1) != ']' || (_input.LA(1) == ']' && _input.LA(2) == ']');
		}
		return true;
	}
	private boolean SkipCollegamento_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return enterCollegamento;
		}
		return true;
	}
	private boolean Text_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return testo;
		case 9:
			return _input.LA(-1)!='\n';
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24\u0105\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\6\4Q\n\4\r"+
		"\4\16\4R\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bm\n\b\3\t\3\t\6\tq\n\t\r\t\16\t"+
		"r\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t}\n\t\3\n\3\n\3\n\5\n\u0082\n\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\5\16\u0096\n\16\3\17\3\17\7\17\u009a\n\17\f\17\16\17\u009d\13"+
		"\17\3\17\6\17\u00a0\n\17\r\17\16\17\u00a1\3\17\5\17\u00a5\n\17\3\20\3"+
		"\20\7\20\u00a9\n\20\f\20\16\20\u00ac\13\20\3\20\6\20\u00af\n\20\r\20\16"+
		"\20\u00b0\3\20\5\20\u00b4\n\20\3\21\3\21\7\21\u00b8\n\21\f\21\16\21\u00bb"+
		"\13\21\3\21\3\21\3\21\3\21\3\22\3\22\6\22\u00c3\n\22\r\22\16\22\u00c4"+
		"\3\23\6\23\u00c8\n\23\r\23\16\23\u00c9\3\24\5\24\u00cd\n\24\3\24\3\24"+
		"\3\25\3\25\6\25\u00d3\n\25\r\25\16\25\u00d4\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5"+
		"\25\u00ea\n\25\5\25\u00ec\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\2\2\"\3\2\5\7\7\b\t\t\13\n\r\13\17\f\21\r\23\16\25\17\27\20\31\21"+
		"\33\22\35\2\37\2!\2#\2%\2\'\23)\24+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2"+
		"=\2?\2A\2\3\2\n\4\2<<~\177\4\2<<~~\5\2<<]_~~\3\2<<\b\2\f\f\17\17))??]"+
		"]}}\3\2]]\3\2))\3\2}}\u010d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\3C\3\2\2\2\5I\3\2\2\2\7N\3\2\2\2\tT\3\2\2\2\13Y\3\2\2\2\r]\3\2"+
		"\2\2\17b\3\2\2\2\21n\3\2\2\2\23~\3\2\2\2\25\u0085\3\2\2\2\27\u0089\3\2"+
		"\2\2\31\u008c\3\2\2\2\33\u0095\3\2\2\2\35\u0097\3\2\2\2\37\u00a6\3\2\2"+
		"\2!\u00b5\3\2\2\2#\u00c0\3\2\2\2%\u00c7\3\2\2\2\'\u00cc\3\2\2\2)\u00d0"+
		"\3\2\2\2+\u00ed\3\2\2\2-\u00ef\3\2\2\2/\u00f1\3\2\2\2\61\u00f3\3\2\2\2"+
		"\63\u00f5\3\2\2\2\65\u00f7\3\2\2\2\67\u00f9\3\2\2\29\u00fb\3\2\2\2;\u00fd"+
		"\3\2\2\2=\u00ff\3\2\2\2?\u0101\3\2\2\2A\u0103\3\2\2\2CD\5-\27\2DE\5-\27"+
		"\2EF\b\2\2\2FG\3\2\2\2GH\b\2\3\2H\4\3\2\2\2IJ\6\3\2\2JK\5/\30\2KL\5/\30"+
		"\2LM\b\3\4\2M\6\3\2\2\2NP\6\4\3\2OQ\n\2\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2"+
		"\2\2RS\3\2\2\2S\b\3\2\2\2TU\6\5\4\2UV\t\3\2\2VW\3\2\2\2WX\b\5\5\2X\n\3"+
		"\2\2\2YZ\5\61\31\2Z[\5\61\31\2[\\\b\6\6\2\\\f\3\2\2\2]^\6\7\5\2^_\5\63"+
		"\32\2_`\5\63\32\2`a\b\7\7\2a\16\3\2\2\2bl\6\b\6\2cd\7k\2\2de\7o\2\2ef"+
		"\7c\2\2fg\7i\2\2gm\7g\2\2hi\7H\2\2ij\7k\2\2jk\7n\2\2km\7g\2\2lc\3\2\2"+
		"\2lh\3\2\2\2m\20\3\2\2\2n|\6\t\7\2oq\n\4\2\2po\3\2\2\2qr\3\2\2\2rp\3\2"+
		"\2\2rs\3\2\2\2s}\3\2\2\2tu\5\61\31\2uv\5\21\t\2vw\5\63\32\2wx\6\t\b\2"+
		"x}\3\2\2\2yz\5\61\31\2z{\5\21\t\2{}\3\2\2\2|p\3\2\2\2|t\3\2\2\2|y\3\2"+
		"\2\2}\22\3\2\2\2~\u0081\6\n\t\2\177\u0082\5\67\34\2\u0080\u0082\59\35"+
		"\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084"+
		"\b\n\5\2\u0084\24\3\2\2\2\u0085\u0086\5A!\2\u0086\u0087\5A!\2\u0087\u0088"+
		"\5A!\2\u0088\26\3\2\2\2\u0089\u008a\5A!\2\u008a\u008b\5A!\2\u008b\30\3"+
		"\2\2\2\u008c\u008d\5A!\2\u008d\u008e\5A!\2\u008e\u008f\5A!\2\u008f\u0090"+
		"\5A!\2\u0090\32\3\2\2\2\u0091\u0096\5\35\17\2\u0092\u0096\5!\21\2\u0093"+
		"\u0096\5\37\20\2\u0094\u0096\5#\22\2\u0095\u0091\3\2\2\2\u0095\u0092\3"+
		"\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\34\3\2\2\2\u0097"+
		"\u009b\5\'\24\2\u0098\u009a\5\67\34\2\u0099\u0098\3\2\2\2\u009a\u009d"+
		"\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009f\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009e\u00a0\5=\37\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3"+
		"\u00a5\5\67\34\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\36\3\2"+
		"\2\2\u00a6\u00aa\5\'\24\2\u00a7\u00a9\5\67\34\2\u00a8\u00a7\3\2\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ae\3\2"+
		"\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00af\5;\36\2\u00ae\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2"+
		"\2\2\u00b2\u00b4\5\67\34\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		" \3\2\2\2\u00b5\u00b9\5\'\24\2\u00b6\u00b8\5\67\34\2\u00b7\u00b6\3\2\2"+
		"\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\5? \2\u00bd\u00be\5%\23\2\u00be"+
		"\u00bf\5\67\34\2\u00bf\"\3\2\2\2\u00c0\u00c2\5\'\24\2\u00c1\u00c3\5\67"+
		"\34\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5$\3\2\2\2\u00c6\u00c8\n\5\2\2\u00c7\u00c6\3\2\2\2"+
		"\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca&\3"+
		"\2\2\2\u00cb\u00cd\7\17\2\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00cf\7\f\2\2\u00cf(\3\2\2\2\u00d0\u00eb\6\25\n\2"+
		"\u00d1\u00d3\n\6\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00ec\3\2\2\2\u00d6\u00d7\5\61\31\2"+
		"\u00d7\u00d8\n\7\2\2\u00d8\u00d9\5)\25\2\u00d9\u00ec\3\2\2\2\u00da\u00db"+
		"\5A!\2\u00db\u00dc\n\b\2\2\u00dc\u00dd\5)\25\2\u00dd\u00ec\3\2\2\2\u00de"+
		"\u00df\5-\27\2\u00df\u00e0\n\t\2\2\u00e0\u00e1\5)\25\2\u00e1\u00ec\3\2"+
		"\2\2\u00e2\u00e3\5A!\2\u00e3\u00e4\n\b\2\2\u00e4\u00e5\5)\25\2\u00e5\u00ec"+
		"\3\2\2\2\u00e6\u00e7\6\25\13\2\u00e7\u00e9\5+\26\2\u00e8\u00ea\5)\25\2"+
		"\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00d2"+
		"\3\2\2\2\u00eb\u00d6\3\2\2\2\u00eb\u00da\3\2\2\2\u00eb\u00de\3\2\2\2\u00eb"+
		"\u00e2\3\2\2\2\u00eb\u00e6\3\2\2\2\u00ec*\3\2\2\2\u00ed\u00ee\7?\2\2\u00ee"+
		",\3\2\2\2\u00ef\u00f0\7}\2\2\u00f0.\3\2\2\2\u00f1\u00f2\7\177\2\2\u00f2"+
		"\60\3\2\2\2\u00f3\u00f4\7]\2\2\u00f4\62\3\2\2\2\u00f5\u00f6\7_\2\2\u00f6"+
		"\64\3\2\2\2\u00f7\u00f8\7/\2\2\u00f8\66\3\2\2\2\u00f9\u00fa\7<\2\2\u00fa"+
		"8\3\2\2\2\u00fb\u00fc\7~\2\2\u00fc:\3\2\2\2\u00fd\u00fe\7%\2\2\u00fe<"+
		"\3\2\2\2\u00ff\u0100\7,\2\2\u0100>\3\2\2\2\u0101\u0102\7=\2\2\u0102@\3"+
		"\2\2\2\u0103\u0104\7)\2\2\u0104B\3\2\2\2\26\2Rlr|\u0081\u0095\u009b\u00a1"+
		"\u00a4\u00aa\u00b0\u00b3\u00b9\u00c4\u00c9\u00cc\u00d4\u00e9\u00eb\b\3"+
		"\2\2\t\6\2\3\3\3\b\2\2\3\6\4\3\7\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
