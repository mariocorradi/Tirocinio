package parser.spanish;

// Generated from SpanishParser.g4 by ANTLR 4.5.1
import java.util.List;

import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import parser.general.GeneraleParser;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SpanishParser extends GeneraleParser {
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
	public static final int
		RULE_page = 0, RULE_sezione = 1, RULE_contenuto = 2, RULE_informazione = 3, 
		RULE_collegamento = 4, RULE_image = 5, RULE_testo = 6, RULE_elenco = 7, 
		RULE_grassetto = 8, RULE_corsivo = 9, RULE_corsivoGrassetto = 10;
	public static final String[] ruleNames = {
		"page", "sezione", "contenuto", "informazione", "collegamento", "image", 
		"testo", "elenco", "grassetto", "corsivo", "corsivoGrassetto"
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

	@Override
	public String getGrammarFileName() { return "SpanishParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SpanishParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PageContext extends ParserRuleContext {
		public List<SezioneContext> sezione() {
			return getRuleContexts(SezioneContext.class);
		}
		public SezioneContext sezione(int i) {
			return getRuleContext(SezioneContext.class,i);
		}
		public PageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishParserListener ) ((SpanishParserListener)listener).enterPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishParserListener ) ((SpanishParserListener)listener).exitPage(this);
		}
	}

	public final PageContext page() throws RecognitionException {
		PageContext _localctx = new PageContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_page);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				sezione();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==EnterSezione );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SezioneContext extends ParserRuleContext {
		public TerminalNode EnterSezione() { return getToken(SpanishParser.EnterSezione, 0); }
		public TerminalNode TestoNomeSezione() { return getToken(SpanishParser.TestoNomeSezione, 0); }
		public TerminalNode ExitSezione() { return getToken(SpanishParser.ExitSezione, 0); }
		public ContenutoContext contenuto() {
			return getRuleContext(ContenutoContext.class,0);
		}
		public SezioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sezione; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishParserListener ) ((SpanishParserListener)listener).enterSezione(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishParserListener ) ((SpanishParserListener)listener).exitSezione(this);
		}
	}

	public final SezioneContext sezione() throws RecognitionException {
		SezioneContext _localctx = new SezioneContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sezione);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(EnterSezione);
			setState(28);
			match(TestoNomeSezione);
			setState(29);
			match(ExitSezione);
			setState(30);
			contenuto();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContenutoContext extends GeneraleParser.ContenutoContext {
		public TestoContext testo(int i) {
			return getRuleContext(TestoContext.class,i);
		}
		public InformazioneContext informazione(int i) {
			return getRuleContext(InformazioneContext.class,i);
		}
		public CollegamentoContext collegamento(int i) {
			return getRuleContext(CollegamentoContext.class,i);
		}
		public ElencoContext elenco(int i) {
			return getRuleContext(ElencoContext.class,i);
		}
		public GrassettoContext grassetto(int i) {
			return getRuleContext(GrassettoContext.class,i);
		}
		public CorsivoContext corsivo(int i) {
			return getRuleContext(CorsivoContext.class,i);
		}
		public CorsivoGrassettoContext corsivoGrassetto(int i) {
			return getRuleContext(CorsivoGrassettoContext.class,i);
		}
		public ContenutoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contenuto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishParserListener ) ((SpanishParserListener)listener).enterContenuto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishParserListener ) ((SpanishParserListener)listener).exitContenuto(this);
		}
	}

	public final ContenutoContext contenuto() throws RecognitionException {
		ContenutoContext _localctx = new ContenutoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_contenuto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(39);
				switch (_input.LA(1)) {
				case NEWLINE:
				case Text:
					{
					setState(32);
					testo();
					}
					break;
				case EnterInfo:
					{
					setState(33);
					informazione();
					}
					break;
				case EnterCollegamento:
					{
					setState(34);
					collegamento();
					}
					break;
				case Elenco:
					{
					setState(35);
					elenco();
					}
					break;
				case Grassetto:
					{
					setState(36);
					grassetto();
					}
					break;
				case Corsivo:
					{
					setState(37);
					corsivo();
					}
					break;
				case CorsivoGrassetto:
					{
					setState(38);
					corsivoGrassetto();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EnterInfo) | (1L << EnterCollegamento) | (1L << Grassetto) | (1L << Corsivo) | (1L << CorsivoGrassetto) | (1L << Elenco) | (1L << NEWLINE) | (1L << Text))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InformazioneContext extends GeneraleParser.InformazioneContext {
		public TerminalNode EnterInfo() { return getToken(SpanishParser.EnterInfo, 0); }
		public TerminalNode ExitInfo() { return getToken(SpanishParser.ExitInfo, 0); }
		public List<TerminalNode> TestoInformazione() { return getTokens(SpanishParser.TestoInformazione); }
		public TerminalNode TestoInformazione(int i) {
			return getToken(SpanishParser.TestoInformazione, i);
		}
		public InformazioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_informazione; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishParserListener ) ((SpanishParserListener)listener).enterInformazione(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishParserListener ) ((SpanishParserListener)listener).exitInformazione(this);
		}
	}

	public final InformazioneContext informazione() throws RecognitionException {
		InformazioneContext _localctx = new InformazioneContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_informazione);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(EnterInfo);
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				match(TestoInformazione);
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TestoInformazione );
			setState(49);
			match(ExitInfo);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollegamentoContext extends GeneraleParser.CollegamentoContext {
		public TerminalNode EnterCollegamento() { return getToken(SpanishParser.EnterCollegamento, 0); }
		public TerminalNode ExitCollegamento() { return getToken(SpanishParser.ExitCollegamento, 0); }
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public List<TerminalNode> CollegamentoTestoGenerico() { return getTokens(SpanishParser.CollegamentoTestoGenerico); }
		public TerminalNode CollegamentoTestoGenerico(int i) {
			return getToken(SpanishParser.CollegamentoTestoGenerico, i);
		}
		public CollegamentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collegamento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishParserListener ) ((SpanishParserListener)listener).enterCollegamento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishParserListener ) ((SpanishParserListener)listener).exitCollegamento(this);
		}
	}

	public final CollegamentoContext collegamento() throws RecognitionException {
		CollegamentoContext _localctx = new CollegamentoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_collegamento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(EnterCollegamento);
			setState(53);
			_la = _input.LA(1);
			if (_la==CollegamentoImage) {
				{
				setState(52);
				image();
				}
			}

			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55);
				match(CollegamentoTestoGenerico);
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CollegamentoTestoGenerico );
			setState(60);
			match(ExitCollegamento);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImageContext extends GeneraleParser.ImageContext {
		public TerminalNode CollegamentoImage() { return getToken(SpanishParser.CollegamentoImage, 0); }
		public ImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishParserListener ) ((SpanishParserListener)listener).enterImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishParserListener ) ((SpanishParserListener)listener).exitImage(this);
		}
	}

	public final ImageContext image() throws RecognitionException {
		ImageContext _localctx = new ImageContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_image);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(CollegamentoImage);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TestoContext extends GeneraleParser.TestoContext {
		public TerminalNode Text() { return getToken(SpanishParser.Text, 0); }
		public TerminalNode NEWLINE() { return getToken(SpanishParser.NEWLINE, 0); }
		public TestoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishParserListener ) ((SpanishParserListener)listener).enterTesto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishParserListener ) ((SpanishParserListener)listener).exitTesto(this);
		}
	}

	public final TestoContext testo() throws RecognitionException {
		TestoContext _localctx = new TestoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_testo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !(_la==NEWLINE || _la==Text) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElencoContext extends GeneraleParser.ElencoContext {
		public TerminalNode Elenco() { return getToken(SpanishParser.Elenco, 0); }
		public InformazioneContext informazione(int i) {
			return getRuleContext(InformazioneContext.class,i);
		}
		public TestoContext testo(int i) {
			return getRuleContext(TestoContext.class,i);
		}
		public CollegamentoContext collegamento(int i) {
			return getRuleContext(CollegamentoContext.class,i);
		}
		public GrassettoContext grassetto(int i) {
			return getRuleContext(GrassettoContext.class,i);
		}
		public CorsivoContext corsivo(int i) {
			return getRuleContext(CorsivoContext.class,i);
		}
		public CorsivoGrassettoContext corsivoGrassetto(int i) {
			return getRuleContext(CorsivoGrassettoContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(SpanishParser.NEWLINE, 0); }
		public TerminalNode EOF() { return getToken(SpanishParser.EOF, 0); }
		public ElencoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elenco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishParserListener ) ((SpanishParserListener)listener).enterElenco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishParserListener ) ((SpanishParserListener)listener).exitElenco(this);
		}
	}

	public final ElencoContext elenco() throws RecognitionException {
		ElencoContext _localctx = new ElencoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elenco);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(Elenco);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(73);
					switch (_input.LA(1)) {
					case EnterInfo:
						{
						setState(67);
						informazione();
						}
						break;
					case NEWLINE:
					case Text:
						{
						setState(68);
						testo();
						}
						break;
					case EnterCollegamento:
						{
						setState(69);
						collegamento();
						}
						break;
					case Grassetto:
						{
						setState(70);
						grassetto();
						}
						break;
					case Corsivo:
						{
						setState(71);
						corsivo();
						}
						break;
					case CorsivoGrassetto:
						{
						setState(72);
						corsivoGrassetto();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(79);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(78);
				_la = _input.LA(1);
				if ( !(_la==EOF || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrassettoContext extends GeneraleParser.GrassettoContext {
		public List<TerminalNode> Grassetto() { return getTokens(SpanishParser.Grassetto); }
		public TerminalNode Grassetto(int i) {
			return getToken(SpanishParser.Grassetto, i);
		}
		public TestoContext testo(int i) {
			return getRuleContext(TestoContext.class,i);
		}
		public InformazioneContext informazione(int i) {
			return getRuleContext(InformazioneContext.class,i);
		}
		public CollegamentoContext collegamento(int i) {
			return getRuleContext(CollegamentoContext.class,i);
		}
		public GrassettoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grassetto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishParserListener ) ((SpanishParserListener)listener).enterGrassetto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishParserListener ) ((SpanishParserListener)listener).exitGrassetto(this);
		}
	}

	public final GrassettoContext grassetto() throws RecognitionException {
		GrassettoContext _localctx = new GrassettoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_grassetto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(Grassetto);
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(85);
				switch (_input.LA(1)) {
				case NEWLINE:
				case Text:
					{
					setState(82);
					testo();
					}
					break;
				case EnterInfo:
					{
					setState(83);
					informazione();
					}
					break;
				case EnterCollegamento:
					{
					setState(84);
					collegamento();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EnterInfo) | (1L << EnterCollegamento) | (1L << NEWLINE) | (1L << Text))) != 0) );
			setState(89);
			match(Grassetto);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CorsivoContext extends GeneraleParser.CorsivoContext {
		public List<TerminalNode> Corsivo() { return getTokens(SpanishParser.Corsivo); }
		public TerminalNode Corsivo(int i) {
			return getToken(SpanishParser.Corsivo, i);
		}
		public TestoContext testo(int i) {
			return getRuleContext(TestoContext.class,i);
		}
		public InformazioneContext informazione(int i) {
			return getRuleContext(InformazioneContext.class,i);
		}
		public CollegamentoContext collegamento(int i) {
			return getRuleContext(CollegamentoContext.class,i);
		}
		public CorsivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corsivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishParserListener ) ((SpanishParserListener)listener).enterCorsivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishParserListener ) ((SpanishParserListener)listener).exitCorsivo(this);
		}
	}

	public final CorsivoContext corsivo() throws RecognitionException {
		CorsivoContext _localctx = new CorsivoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_corsivo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(Corsivo);
			setState(95); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(95);
				switch (_input.LA(1)) {
				case NEWLINE:
				case Text:
					{
					setState(92);
					testo();
					}
					break;
				case EnterInfo:
					{
					setState(93);
					informazione();
					}
					break;
				case EnterCollegamento:
					{
					setState(94);
					collegamento();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EnterInfo) | (1L << EnterCollegamento) | (1L << NEWLINE) | (1L << Text))) != 0) );
			setState(99);
			match(Corsivo);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CorsivoGrassettoContext extends GeneraleParser.CorsivoGrassettoContext {
		public List<TerminalNode> CorsivoGrassetto() { return getTokens(SpanishParser.CorsivoGrassetto); }
		public TerminalNode CorsivoGrassetto(int i) {
			return getToken(SpanishParser.CorsivoGrassetto, i);
		}
		public TestoContext testo(int i) {
			return getRuleContext(TestoContext.class,i);
		}
		public InformazioneContext informazione(int i) {
			return getRuleContext(InformazioneContext.class,i);
		}
		public CollegamentoContext collegamento(int i) {
			return getRuleContext(CollegamentoContext.class,i);
		}
		public CorsivoGrassettoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corsivoGrassetto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishParserListener ) ((SpanishParserListener)listener).enterCorsivoGrassetto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishParserListener ) ((SpanishParserListener)listener).exitCorsivoGrassetto(this);
		}
	}

	public final CorsivoGrassettoContext corsivoGrassetto() throws RecognitionException {
		CorsivoGrassettoContext _localctx = new CorsivoGrassettoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_corsivoGrassetto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(CorsivoGrassetto);
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(105);
				switch (_input.LA(1)) {
				case NEWLINE:
				case Text:
					{
					setState(102);
					testo();
					}
					break;
				case EnterInfo:
					{
					setState(103);
					informazione();
					}
					break;
				case EnterCollegamento:
					{
					setState(104);
					collegamento();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EnterInfo) | (1L << EnterCollegamento) | (1L << NEWLINE) | (1L << Text))) != 0) );
			setState(109);
			match(CorsivoGrassetto);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25r\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\6\2\32\n\2\r\2\16\2\33\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\6\4*\n\4\r\4\16\4+\3\5\3\5\6\5\60\n\5\r\5\16\5\61\3\5\3\5"+
		"\3\6\3\6\5\68\n\6\3\6\6\6;\n\6\r\6\16\6<\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\7\tL\n\t\f\t\16\tO\13\t\3\t\5\tR\n\t\3\n\3\n\3"+
		"\n\3\n\6\nX\n\n\r\n\16\nY\3\n\3\n\3\13\3\13\3\13\3\13\6\13b\n\13\r\13"+
		"\16\13c\3\13\3\13\3\f\3\f\3\f\3\f\6\fl\n\f\r\f\16\fm\3\f\3\f\3\f\2\2\r"+
		"\2\4\6\b\n\f\16\20\22\24\26\2\4\3\2\24\25\3\3\24\24\u0081\2\31\3\2\2\2"+
		"\4\35\3\2\2\2\6)\3\2\2\2\b-\3\2\2\2\n\65\3\2\2\2\f@\3\2\2\2\16B\3\2\2"+
		"\2\20D\3\2\2\2\22S\3\2\2\2\24]\3\2\2\2\26g\3\2\2\2\30\32\5\4\3\2\31\30"+
		"\3\2\2\2\32\33\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\3\3\2\2\2\35\36"+
		"\7\5\2\2\36\37\7\4\2\2\37 \7\6\2\2 !\5\6\4\2!\5\3\2\2\2\"*\5\16\b\2#*"+
		"\5\b\5\2$*\5\n\6\2%*\5\20\t\2&*\5\22\n\2\'*\5\24\13\2(*\5\26\f\2)\"\3"+
		"\2\2\2)#\3\2\2\2)$\3\2\2\2)%\3\2\2\2)&\3\2\2\2)\'\3\2\2\2)(\3\2\2\2*+"+
		"\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\7\3\2\2\2-/\7\7\2\2.\60\7\t\2\2/.\3\2\2"+
		"\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\7\b\2\2"+
		"\64\t\3\2\2\2\65\67\7\13\2\2\668\5\f\7\2\67\66\3\2\2\2\678\3\2\2\28:\3"+
		"\2\2\29;\7\16\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?"+
		"\7\f\2\2?\13\3\2\2\2@A\7\r\2\2A\r\3\2\2\2BC\t\2\2\2C\17\3\2\2\2DM\7\23"+
		"\2\2EL\5\b\5\2FL\5\16\b\2GL\5\n\6\2HL\5\22\n\2IL\5\24\13\2JL\5\26\f\2"+
		"KE\3\2\2\2KF\3\2\2\2KG\3\2\2\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2LO\3\2\2\2"+
		"MK\3\2\2\2MN\3\2\2\2NQ\3\2\2\2OM\3\2\2\2PR\t\3\2\2QP\3\2\2\2QR\3\2\2\2"+
		"R\21\3\2\2\2SW\7\20\2\2TX\5\16\b\2UX\5\b\5\2VX\5\n\6\2WT\3\2\2\2WU\3\2"+
		"\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7\20\2\2\\\23"+
		"\3\2\2\2]a\7\21\2\2^b\5\16\b\2_b\5\b\5\2`b\5\n\6\2a^\3\2\2\2a_\3\2\2\2"+
		"a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\7\21\2\2f\25\3\2"+
		"\2\2gk\7\22\2\2hl\5\16\b\2il\5\b\5\2jl\5\n\6\2kh\3\2\2\2ki\3\2\2\2kj\3"+
		"\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2no\3\2\2\2op\7\22\2\2p\27\3\2\2\2"+
		"\21\33)+\61\67<KMQWYackm";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
