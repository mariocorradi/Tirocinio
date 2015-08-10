package parser.spanish;

// Generated from SpanishLexer.g4 by ANTLR 4.5.1

	import java.util.HashMap;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SpanishLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SezioneSpecifica=1, TestoNomeSezione=2, EnterSezione=3, ExitSezione=4, 
		EnterInfo=5, ExitInfo=6, TestoInformazione=7, SkipInformazione=8, EnterCollegamento=9, 
		ExitCollegamento=10, CollegamentoImage=11, CollegamentoTestoGenerico=12, 
		SkipCollegamento=13, Grassetto=14, Corsivo=15, CorsivoGrassetto=16, Elenco=17, 
		NEWLINE=18, Text=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"EnterSezioneU", "ExitSezioneU", "EnterSezioneD", "ExitSezioneD", "EnterSezioneT", 
		"ExitSezioneT", "TestoSezione", "EnterInformazione", "ExitInfo", "TestoInformazione", 
		"SkipInformazione", "EnterCollegamento", "ExitCollegamento", "CollegamentoImage", 
		"CollegamentoTestoGenerico", "SkipCollegamento", "Grassetto", "Corsivo", 
		"CorsivoGrassetto", "Elenco", "ElencoNumerico", "ElencoPuntato", "ElencoPersonalizzato", 
		"ElencoVuoto", "TestoElencoPersonalizzato", "NEWLINE", "Text", "UGUALE", 
		"GRAFFAAPERTA", "GRAFFACHIUSA", "QUADRAAPERTA", "QUADRACHIUSA", "TRATTINO", 
		"DUEPUNTI", "BARRAVERTICALE", "CANCELLETTO", "ASTERISCO", "PUNTOVIRGOLA", 
		"APOSTROFO"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SezioneSpecifica", "TestoNomeSezione", "EnterSezione", "ExitSezione", 
		"EnterInfo", "ExitInfo", "TestoInformazione", "SkipInformazione", "EnterCollegamento", 
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


		private static HashMap<String, String> mappa = new HashMap<String, String>();
		
		static {
			mappa.put("EtimologÃ­a", "Etimology");
			mappa.put("Traducciones", "Translation");
			mappa.put("Locuciones", "Idioms");
			mappa.put("Refranes", "Sayings");
		}
		
		public static String getKey(String value){
			return mappa.get(value);
		}
		
		public static boolean containsKey(String value){
				return mappa.containsKey(value);
		}


	protected boolean testo = false;
	protected boolean enterSezione = false;
	protected boolean enterInfo = false;
	protected boolean enterCollegamento = false;


	public SpanishLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SpanishLexer.g4"; }

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
			EnterSezioneU_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			ExitSezioneU_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			EnterSezioneD_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			ExitSezioneD_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			EnterSezioneT_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			ExitSezioneT_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			EnterInformazione_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			ExitInfo_action((RuleContext)_localctx, actionIndex);
			break;
		case 11:
			EnterCollegamento_action((RuleContext)_localctx, actionIndex);
			break;
		case 12:
			ExitCollegamento_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void EnterSezioneU_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			enterSezione = true; testo = false; 
			break;
		}
	}
	private void ExitSezioneU_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			enterSezione = false; testo = true;
			break;
		}
	}
	private void EnterSezioneD_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			enterSezione = true; testo = false;
			break;
		}
	}
	private void ExitSezioneD_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			enterSezione = false; testo = true;
			break;
		}
	}
	private void EnterSezioneT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			enterSezione = true; testo = false;
			break;
		}
	}
	private void ExitSezioneT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			enterSezione = false; testo = true;
			break;
		}
	}
	private void EnterInformazione_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			enterInfo = true; testo = false;
			break;
		}
	}
	private void ExitInfo_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			enterInfo = false; testo = true; 
			break;
		}
	}
	private void EnterCollegamento_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			enterCollegamento = true; testo = false;
			break;
		}
	}
	private void ExitCollegamento_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			enterCollegamento = false; testo = true;
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return EnterSezioneU_sempred((RuleContext)_localctx, predIndex);
		case 1:
			return ExitSezioneU_sempred((RuleContext)_localctx, predIndex);
		case 2:
			return EnterSezioneD_sempred((RuleContext)_localctx, predIndex);
		case 3:
			return ExitSezioneD_sempred((RuleContext)_localctx, predIndex);
		case 4:
			return EnterSezioneT_sempred((RuleContext)_localctx, predIndex);
		case 5:
			return ExitSezioneT_sempred((RuleContext)_localctx, predIndex);
		case 6:
			return TestoSezione_sempred((RuleContext)_localctx, predIndex);
		case 8:
			return ExitInfo_sempred((RuleContext)_localctx, predIndex);
		case 9:
			return TestoInformazione_sempred((RuleContext)_localctx, predIndex);
		case 10:
			return SkipInformazione_sempred((RuleContext)_localctx, predIndex);
		case 12:
			return ExitCollegamento_sempred((RuleContext)_localctx, predIndex);
		case 13:
			return CollegamentoImage_sempred((RuleContext)_localctx, predIndex);
		case 14:
			return CollegamentoTestoGenerico_sempred((RuleContext)_localctx, predIndex);
		case 15:
			return SkipCollegamento_sempred((RuleContext)_localctx, predIndex);
		case 26:
			return Text_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean EnterSezioneU_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return _input.LA(-1)=='\n' || _input.LA(-1)==-1;
		}
		return true;
	}
	private boolean ExitSezioneU_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return enterSezione;
		}
		return true;
	}
	private boolean EnterSezioneD_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return _input.LA(-1)=='\n' || _input.LA(-1)==-1;
		}
		return true;
	}
	private boolean ExitSezioneD_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return enterSezione;
		}
		return true;
	}
	private boolean EnterSezioneT_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return _input.LA(-1)=='\n' || _input.LA(-1)==-1;
		}
		return true;
	}
	private boolean ExitSezioneT_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return enterSezione;
		}
		return true;
	}
	private boolean TestoSezione_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return enterSezione;
		}
		return true;
	}
	private boolean ExitInfo_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return enterInfo;
		}
		return true;
	}
	private boolean TestoInformazione_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return enterInfo;
		}
		return true;
	}
	private boolean SkipInformazione_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return enterInfo;
		}
		return true;
	}
	private boolean ExitCollegamento_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return enterCollegamento;
		}
		return true;
	}
	private boolean CollegamentoImage_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return enterCollegamento;
		}
		return true;
	}
	private boolean CollegamentoTestoGenerico_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return enterCollegamento;
		case 13:
			return _input.LA(1) != ']' || (_input.LA(1) == ']' && _input.LA(2) == ']');
		}
		return true;
	}
	private boolean SkipCollegamento_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return enterCollegamento;
		}
		return true;
	}
	private boolean Text_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return testo;
		case 16:
			return _input.LA(-1)!='\n';
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25\u0148\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\6\b\u0081\n\b\r\b\16\b\u0082\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\6\13\u0094\n\13"+
		"\r\13\16\13\u0095\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b0"+
		"\n\17\3\20\3\20\6\20\u00b4\n\20\r\20\16\20\u00b5\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\5\20\u00c0\n\20\3\21\3\21\3\21\5\21\u00c5\n\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\5\25\u00d9\n\25\3\26\3\26\7\26\u00dd\n\26\f\26\16\26\u00e0"+
		"\13\26\3\26\6\26\u00e3\n\26\r\26\16\26\u00e4\3\26\5\26\u00e8\n\26\3\27"+
		"\3\27\7\27\u00ec\n\27\f\27\16\27\u00ef\13\27\3\27\6\27\u00f2\n\27\r\27"+
		"\16\27\u00f3\3\27\5\27\u00f7\n\27\3\30\3\30\7\30\u00fb\n\30\f\30\16\30"+
		"\u00fe\13\30\3\30\3\30\3\30\3\30\3\31\3\31\6\31\u0106\n\31\r\31\16\31"+
		"\u0107\3\32\6\32\u010b\n\32\r\32\16\32\u010c\3\33\5\33\u0110\n\33\3\33"+
		"\3\33\3\34\3\34\6\34\u0116\n\34\r\34\16\34\u0117\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\5\34\u012d\n\34\5\34\u012f\n\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\2\2)\3\2\5\2\7\2"+
		"\t\2\13\2\r\2\17\2\21\2\23\b\25\t\27\n\31\13\33\f\35\r\37\16!\17#\20%"+
		"\21\'\22)\23+\2-\2/\2\61\2\63\2\65\24\67\259\2;\2=\2?\2A\2C\2E\2G\2I\2"+
		"K\2M\2O\2\3\2\13\3\2??\4\2<<~\177\4\2<<~~\5\2<<]_~~\3\2<<\b\2\f\f\17\17"+
		"))??]]}}\3\2]]\3\2))\3\2}}\u0151\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\3Q\3\2\2\2\5W\3\2\2\2\7^\3\2\2\2\te\3\2\2\2"+
		"\13m\3\2\2\2\ru\3\2\2\2\17~\3\2\2\2\21\u0086\3\2\2\2\23\u008c\3\2\2\2"+
		"\25\u0091\3\2\2\2\27\u0097\3\2\2\2\31\u009c\3\2\2\2\33\u00a0\3\2\2\2\35"+
		"\u00a5\3\2\2\2\37\u00b1\3\2\2\2!\u00c1\3\2\2\2#\u00c8\3\2\2\2%\u00cc\3"+
		"\2\2\2\'\u00cf\3\2\2\2)\u00d8\3\2\2\2+\u00da\3\2\2\2-\u00e9\3\2\2\2/\u00f8"+
		"\3\2\2\2\61\u0103\3\2\2\2\63\u010a\3\2\2\2\65\u010f\3\2\2\2\67\u0113\3"+
		"\2\2\29\u0130\3\2\2\2;\u0132\3\2\2\2=\u0134\3\2\2\2?\u0136\3\2\2\2A\u0138"+
		"\3\2\2\2C\u013a\3\2\2\2E\u013c\3\2\2\2G\u013e\3\2\2\2I\u0140\3\2\2\2K"+
		"\u0142\3\2\2\2M\u0144\3\2\2\2O\u0146\3\2\2\2QR\6\2\2\2RS\59\35\2ST\b\2"+
		"\2\2TU\3\2\2\2UV\b\2\3\2V\4\3\2\2\2WX\6\3\3\2XY\59\35\2YZ\5\65\33\2Z["+
		"\b\3\4\2[\\\3\2\2\2\\]\b\3\5\2]\6\3\2\2\2^_\6\4\4\2_`\59\35\2`a\59\35"+
		"\2ab\b\4\6\2bc\3\2\2\2cd\b\4\3\2d\b\3\2\2\2ef\6\5\5\2fg\59\35\2gh\59\35"+
		"\2hi\5\65\33\2ij\b\5\7\2jk\3\2\2\2kl\b\5\5\2l\n\3\2\2\2mn\6\6\6\2no\5"+
		"9\35\2op\59\35\2pq\59\35\2qr\b\6\b\2rs\3\2\2\2st\b\6\3\2t\f\3\2\2\2uv"+
		"\6\7\7\2vw\59\35\2wx\59\35\2xy\59\35\2yz\5\65\33\2z{\b\7\t\2{|\3\2\2\2"+
		"|}\b\7\5\2}\16\3\2\2\2~\u0080\6\b\b\2\177\u0081\n\2\2\2\u0080\177\3\2"+
		"\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0085\b\b\n\2\u0085\20\3\2\2\2\u0086\u0087\5;\36"+
		"\2\u0087\u0088\5;\36\2\u0088\u0089\b\t\13\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\b\t\f\2\u008b\22\3\2\2\2\u008c\u008d\6\n\t\2\u008d\u008e\5=\37"+
		"\2\u008e\u008f\5=\37\2\u008f\u0090\b\n\r\2\u0090\24\3\2\2\2\u0091\u0093"+
		"\6\13\n\2\u0092\u0094\n\3\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2"+
		"\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\26\3\2\2\2\u0097\u0098"+
		"\6\f\13\2\u0098\u0099\t\4\2\2\u0099\u009a\3\2\2\2\u009a\u009b\b\f\16\2"+
		"\u009b\30\3\2\2\2\u009c\u009d\5? \2\u009d\u009e\5? \2\u009e\u009f\b\r"+
		"\17\2\u009f\32\3\2\2\2\u00a0\u00a1\6\16\f\2\u00a1\u00a2\5A!\2\u00a2\u00a3"+
		"\5A!\2\u00a3\u00a4\b\16\20\2\u00a4\34\3\2\2\2\u00a5\u00af\6\17\r\2\u00a6"+
		"\u00a7\7k\2\2\u00a7\u00a8\7o\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7i\2\2"+
		"\u00aa\u00b0\7g\2\2\u00ab\u00ac\7H\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae"+
		"\7n\2\2\u00ae\u00b0\7g\2\2\u00af\u00a6\3\2\2\2\u00af\u00ab\3\2\2\2\u00b0"+
		"\36\3\2\2\2\u00b1\u00bf\6\20\16\2\u00b2\u00b4\n\5\2\2\u00b3\u00b2\3\2"+
		"\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00c0\3\2\2\2\u00b7\u00b8\5? \2\u00b8\u00b9\5\37\20\2\u00b9\u00ba\5A"+
		"!\2\u00ba\u00bb\6\20\17\2\u00bb\u00c0\3\2\2\2\u00bc\u00bd\5? \2\u00bd"+
		"\u00be\5\37\20\2\u00be\u00c0\3\2\2\2\u00bf\u00b3\3\2\2\2\u00bf\u00b7\3"+
		"\2\2\2\u00bf\u00bc\3\2\2\2\u00c0 \3\2\2\2\u00c1\u00c4\6\21\20\2\u00c2"+
		"\u00c5\5E#\2\u00c3\u00c5\5G$\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2"+
		"\u00c5\u00c6\3\2\2\2\u00c6\u00c7\b\21\16\2\u00c7\"\3\2\2\2\u00c8\u00c9"+
		"\5O(\2\u00c9\u00ca\5O(\2\u00ca\u00cb\5O(\2\u00cb$\3\2\2\2\u00cc\u00cd"+
		"\5O(\2\u00cd\u00ce\5O(\2\u00ce&\3\2\2\2\u00cf\u00d0\5O(\2\u00d0\u00d1"+
		"\5O(\2\u00d1\u00d2\5O(\2\u00d2\u00d3\5O(\2\u00d3(\3\2\2\2\u00d4\u00d9"+
		"\5+\26\2\u00d5\u00d9\5/\30\2\u00d6\u00d9\5-\27\2\u00d7\u00d9\5\61\31\2"+
		"\u00d8\u00d4\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7"+
		"\3\2\2\2\u00d9*\3\2\2\2\u00da\u00de\5\65\33\2\u00db\u00dd\5E#\2\u00dc"+
		"\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e3\5K&\2\u00e2\u00e1"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e7\3\2\2\2\u00e6\u00e8\5E#\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2"+
		"\2\u00e8,\3\2\2\2\u00e9\u00ed\5\65\33\2\u00ea\u00ec\5E#\2\u00eb\u00ea"+
		"\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f2\5I%\2\u00f1\u00f0\3\2\2"+
		"\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6"+
		"\3\2\2\2\u00f5\u00f7\5E#\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		".\3\2\2\2\u00f8\u00fc\5\65\33\2\u00f9\u00fb\5E#\2\u00fa\u00f9\3\2\2\2"+
		"\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff"+
		"\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\5M\'\2\u0100\u0101\5\63\32\2"+
		"\u0101\u0102\5E#\2\u0102\60\3\2\2\2\u0103\u0105\5\65\33\2\u0104\u0106"+
		"\5E#\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\62\3\2\2\2\u0109\u010b\n\6\2\2\u010a\u0109\3\2\2"+
		"\2\u010b\u010c\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\64"+
		"\3\2\2\2\u010e\u0110\7\17\2\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2"+
		"\u0110\u0111\3\2\2\2\u0111\u0112\7\f\2\2\u0112\66\3\2\2\2\u0113\u012e"+
		"\6\34\21\2\u0114\u0116\n\7\2\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2"+
		"\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u012f\3\2\2\2\u0119\u011a"+
		"\5? \2\u011a\u011b\n\b\2\2\u011b\u011c\5\67\34\2\u011c\u012f\3\2\2\2\u011d"+
		"\u011e\5O(\2\u011e\u011f\n\t\2\2\u011f\u0120\5\67\34\2\u0120\u012f\3\2"+
		"\2\2\u0121\u0122\5;\36\2\u0122\u0123\n\n\2\2\u0123\u0124\5\67\34\2\u0124"+
		"\u012f\3\2\2\2\u0125\u0126\5O(\2\u0126\u0127\n\t\2\2\u0127\u0128\5\67"+
		"\34\2\u0128\u012f\3\2\2\2\u0129\u012a\6\34\22\2\u012a\u012c\59\35\2\u012b"+
		"\u012d\5\67\34\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3"+
		"\2\2\2\u012e\u0115\3\2\2\2\u012e\u0119\3\2\2\2\u012e\u011d\3\2\2\2\u012e"+
		"\u0121\3\2\2\2\u012e\u0125\3\2\2\2\u012e\u0129\3\2\2\2\u012f8\3\2\2\2"+
		"\u0130\u0131\7?\2\2\u0131:\3\2\2\2\u0132\u0133\7}\2\2\u0133<\3\2\2\2\u0134"+
		"\u0135\7\177\2\2\u0135>\3\2\2\2\u0136\u0137\7]\2\2\u0137@\3\2\2\2\u0138"+
		"\u0139\7_\2\2\u0139B\3\2\2\2\u013a\u013b\7/\2\2\u013bD\3\2\2\2\u013c\u013d"+
		"\7<\2\2\u013dF\3\2\2\2\u013e\u013f\7~\2\2\u013fH\3\2\2\2\u0140\u0141\7"+
		"%\2\2\u0141J\3\2\2\2\u0142\u0143\7,\2\2\u0143L\3\2\2\2\u0144\u0145\7="+
		"\2\2\u0145N\3\2\2\2\u0146\u0147\7)\2\2\u0147P\3\2\2\2\27\2\u0082\u0095"+
		"\u00af\u00b5\u00bf\u00c4\u00d8\u00de\u00e4\u00e7\u00ed\u00f3\u00f6\u00fc"+
		"\u0107\u010c\u010f\u0117\u012c\u012e\21\3\2\2\t\5\2\3\3\3\t\6\2\3\4\4"+
		"\3\5\5\3\6\6\3\7\7\t\4\2\3\t\b\t\7\2\3\n\t\b\2\2\3\r\n\3\16\13";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
