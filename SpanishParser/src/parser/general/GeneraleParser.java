package parser.general;

// Generated from GeneraleParser.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GeneraleParser extends Parser {
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
	public static final int
		RULE_contenuto = 0, RULE_informazione = 1, RULE_collegamento = 2, RULE_image = 3, 
		RULE_testo = 4, RULE_elenco = 5, RULE_grassetto = 6, RULE_corsivo = 7, 
		RULE_corsivoGrassetto = 8;
	public static final String[] ruleNames = {
		"contenuto", "informazione", "collegamento", "image", "testo", "elenco", 
		"grassetto", "corsivo", "corsivoGrassetto"
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

	@Override
	public String getGrammarFileName() { return "GeneraleParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GeneraleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ContenutoContext extends ParserRuleContext {
		public List<TestoContext> testo() {
			return getRuleContexts(TestoContext.class);
		}
		public TestoContext testo(int i) {
			return getRuleContext(TestoContext.class,i);
		}
		public List<InformazioneContext> informazione() {
			return getRuleContexts(InformazioneContext.class);
		}
		public InformazioneContext informazione(int i) {
			return getRuleContext(InformazioneContext.class,i);
		}
		public List<CollegamentoContext> collegamento() {
			return getRuleContexts(CollegamentoContext.class);
		}
		public CollegamentoContext collegamento(int i) {
			return getRuleContext(CollegamentoContext.class,i);
		}
		public List<ElencoContext> elenco() {
			return getRuleContexts(ElencoContext.class);
		}
		public ElencoContext elenco(int i) {
			return getRuleContext(ElencoContext.class,i);
		}
		public List<GrassettoContext> grassetto() {
			return getRuleContexts(GrassettoContext.class);
		}
		public GrassettoContext grassetto(int i) {
			return getRuleContext(GrassettoContext.class,i);
		}
		public List<CorsivoContext> corsivo() {
			return getRuleContexts(CorsivoContext.class);
		}
		public CorsivoContext corsivo(int i) {
			return getRuleContext(CorsivoContext.class,i);
		}
		public List<CorsivoGrassettoContext> corsivoGrassetto() {
			return getRuleContexts(CorsivoGrassettoContext.class);
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
			if ( listener instanceof GeneraleParserListener ) ((GeneraleParserListener)listener).enterContenuto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneraleParserListener ) ((GeneraleParserListener)listener).exitContenuto(this);
		}
	}

	public ContenutoContext contenuto() throws RecognitionException {
		ContenutoContext _localctx = new ContenutoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_contenuto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(25);
				switch (_input.LA(1)) {
				case NEWLINE:
				case Text:
					{
					setState(18);
					testo();
					}
					break;
				case EnterInfo:
					{
					setState(19);
					informazione();
					}
					break;
				case EnterCollegamento:
					{
					setState(20);
					collegamento();
					}
					break;
				case Elenco:
					{
					setState(21);
					elenco();
					}
					break;
				case Grassetto:
					{
					setState(22);
					grassetto();
					}
					break;
				case Corsivo:
					{
					setState(23);
					corsivo();
					}
					break;
				case CorsivoGrassetto:
					{
					setState(24);
					corsivoGrassetto();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(27); 
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

	public static class InformazioneContext extends ParserRuleContext {
		public TerminalNode EnterInfo() { return getToken(GeneraleParser.EnterInfo, 0); }
		public TerminalNode ExitInfo() { return getToken(GeneraleParser.ExitInfo, 0); }
		public List<TerminalNode> TestoInformazione() { return getTokens(GeneraleParser.TestoInformazione); }
		public TerminalNode TestoInformazione(int i) {
			return getToken(GeneraleParser.TestoInformazione, i);
		}
		public InformazioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_informazione; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneraleParserListener ) ((GeneraleParserListener)listener).enterInformazione(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneraleParserListener ) ((GeneraleParserListener)listener).exitInformazione(this);
		}
	}

	public InformazioneContext informazione() throws RecognitionException {
		InformazioneContext _localctx = new InformazioneContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_informazione);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(EnterInfo);
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				match(TestoInformazione);
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TestoInformazione );
			setState(35);
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

	public static class CollegamentoContext extends ParserRuleContext {
		public TerminalNode EnterCollegamento() { return getToken(GeneraleParser.EnterCollegamento, 0); }
		public TerminalNode ExitCollegamento() { return getToken(GeneraleParser.ExitCollegamento, 0); }
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public List<TerminalNode> CollegamentoTestoGenerico() { return getTokens(GeneraleParser.CollegamentoTestoGenerico); }
		public TerminalNode CollegamentoTestoGenerico(int i) {
			return getToken(GeneraleParser.CollegamentoTestoGenerico, i);
		}
		public CollegamentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collegamento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneraleParserListener ) ((GeneraleParserListener)listener).enterCollegamento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneraleParserListener ) ((GeneraleParserListener)listener).exitCollegamento(this);
		}
	}

	public CollegamentoContext collegamento() throws RecognitionException {
		CollegamentoContext _localctx = new CollegamentoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_collegamento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(EnterCollegamento);
			setState(39);
			_la = _input.LA(1);
			if (_la==CollegamentoImage) {
				{
				setState(38);
				image();
				}
			}

			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				match(CollegamentoTestoGenerico);
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CollegamentoTestoGenerico );
			setState(46);
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

	public static class ImageContext extends ParserRuleContext {
		public TerminalNode CollegamentoImage() { return getToken(GeneraleParser.CollegamentoImage, 0); }
		public ImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneraleParserListener ) ((GeneraleParserListener)listener).enterImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneraleParserListener ) ((GeneraleParserListener)listener).exitImage(this);
		}
	}

	public ImageContext image() throws RecognitionException {
		ImageContext _localctx = new ImageContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_image);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
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

	public static class TestoContext extends ParserRuleContext {
		public TerminalNode Text() { return getToken(GeneraleParser.Text, 0); }
		public TerminalNode NEWLINE() { return getToken(GeneraleParser.NEWLINE, 0); }
		public TestoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneraleParserListener ) ((GeneraleParserListener)listener).enterTesto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneraleParserListener ) ((GeneraleParserListener)listener).exitTesto(this);
		}
	}

	public TestoContext testo() throws RecognitionException {
		TestoContext _localctx = new TestoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_testo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
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

	public static class ElencoContext extends ParserRuleContext {
		public TerminalNode Elenco() { return getToken(GeneraleParser.Elenco, 0); }
		public List<InformazioneContext> informazione() {
			return getRuleContexts(InformazioneContext.class);
		}
		public InformazioneContext informazione(int i) {
			return getRuleContext(InformazioneContext.class,i);
		}
		public List<TestoContext> testo() {
			return getRuleContexts(TestoContext.class);
		}
		public TestoContext testo(int i) {
			return getRuleContext(TestoContext.class,i);
		}
		public List<CollegamentoContext> collegamento() {
			return getRuleContexts(CollegamentoContext.class);
		}
		public CollegamentoContext collegamento(int i) {
			return getRuleContext(CollegamentoContext.class,i);
		}
		public List<GrassettoContext> grassetto() {
			return getRuleContexts(GrassettoContext.class);
		}
		public GrassettoContext grassetto(int i) {
			return getRuleContext(GrassettoContext.class,i);
		}
		public List<CorsivoContext> corsivo() {
			return getRuleContexts(CorsivoContext.class);
		}
		public CorsivoContext corsivo(int i) {
			return getRuleContext(CorsivoContext.class,i);
		}
		public List<CorsivoGrassettoContext> corsivoGrassetto() {
			return getRuleContexts(CorsivoGrassettoContext.class);
		}
		public CorsivoGrassettoContext corsivoGrassetto(int i) {
			return getRuleContext(CorsivoGrassettoContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(GeneraleParser.NEWLINE, 0); }
		public TerminalNode EOF() { return getToken(GeneraleParser.EOF, 0); }
		public ElencoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elenco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneraleParserListener ) ((GeneraleParserListener)listener).enterElenco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneraleParserListener ) ((GeneraleParserListener)listener).exitElenco(this);
		}
	}

	public ElencoContext elenco() throws RecognitionException {
		ElencoContext _localctx = new ElencoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elenco);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(Elenco);
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(59);
					switch (_input.LA(1)) {
					case EnterInfo:
						{
						setState(53);
						informazione();
						}
						break;
					case NEWLINE:
					case Text:
						{
						setState(54);
						testo();
						}
						break;
					case EnterCollegamento:
						{
						setState(55);
						collegamento();
						}
						break;
					case Grassetto:
						{
						setState(56);
						grassetto();
						}
						break;
					case Corsivo:
						{
						setState(57);
						corsivo();
						}
						break;
					case CorsivoGrassetto:
						{
						setState(58);
						corsivoGrassetto();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(65);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(64);
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

	public static class GrassettoContext extends ParserRuleContext {
		public List<TerminalNode> Grassetto() { return getTokens(GeneraleParser.Grassetto); }
		public TerminalNode Grassetto(int i) {
			return getToken(GeneraleParser.Grassetto, i);
		}
		public List<TestoContext> testo() {
			return getRuleContexts(TestoContext.class);
		}
		public TestoContext testo(int i) {
			return getRuleContext(TestoContext.class,i);
		}
		public List<InformazioneContext> informazione() {
			return getRuleContexts(InformazioneContext.class);
		}
		public InformazioneContext informazione(int i) {
			return getRuleContext(InformazioneContext.class,i);
		}
		public List<CollegamentoContext> collegamento() {
			return getRuleContexts(CollegamentoContext.class);
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
			if ( listener instanceof GeneraleParserListener ) ((GeneraleParserListener)listener).enterGrassetto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneraleParserListener ) ((GeneraleParserListener)listener).exitGrassetto(this);
		}
	}

	public GrassettoContext grassetto() throws RecognitionException {
		GrassettoContext _localctx = new GrassettoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_grassetto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(Grassetto);
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(71);
				switch (_input.LA(1)) {
				case NEWLINE:
				case Text:
					{
					setState(68);
					testo();
					}
					break;
				case EnterInfo:
					{
					setState(69);
					informazione();
					}
					break;
				case EnterCollegamento:
					{
					setState(70);
					collegamento();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EnterInfo) | (1L << EnterCollegamento) | (1L << NEWLINE) | (1L << Text))) != 0) );
			setState(75);
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

	public static class CorsivoContext extends ParserRuleContext {
		public List<TerminalNode> Corsivo() { return getTokens(GeneraleParser.Corsivo); }
		public TerminalNode Corsivo(int i) {
			return getToken(GeneraleParser.Corsivo, i);
		}
		public List<TestoContext> testo() {
			return getRuleContexts(TestoContext.class);
		}
		public TestoContext testo(int i) {
			return getRuleContext(TestoContext.class,i);
		}
		public List<InformazioneContext> informazione() {
			return getRuleContexts(InformazioneContext.class);
		}
		public InformazioneContext informazione(int i) {
			return getRuleContext(InformazioneContext.class,i);
		}
		public List<CollegamentoContext> collegamento() {
			return getRuleContexts(CollegamentoContext.class);
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
			if ( listener instanceof GeneraleParserListener ) ((GeneraleParserListener)listener).enterCorsivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneraleParserListener ) ((GeneraleParserListener)listener).exitCorsivo(this);
		}
	}

	public CorsivoContext corsivo() throws RecognitionException {
		CorsivoContext _localctx = new CorsivoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_corsivo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(Corsivo);
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(81);
				switch (_input.LA(1)) {
				case NEWLINE:
				case Text:
					{
					setState(78);
					testo();
					}
					break;
				case EnterInfo:
					{
					setState(79);
					informazione();
					}
					break;
				case EnterCollegamento:
					{
					setState(80);
					collegamento();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EnterInfo) | (1L << EnterCollegamento) | (1L << NEWLINE) | (1L << Text))) != 0) );
			setState(85);
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

	public static class CorsivoGrassettoContext extends ParserRuleContext {
		public List<TerminalNode> CorsivoGrassetto() { return getTokens(GeneraleParser.CorsivoGrassetto); }
		public TerminalNode CorsivoGrassetto(int i) {
			return getToken(GeneraleParser.CorsivoGrassetto, i);
		}
		public List<TestoContext> testo() {
			return getRuleContexts(TestoContext.class);
		}
		public TestoContext testo(int i) {
			return getRuleContext(TestoContext.class,i);
		}
		public List<InformazioneContext> informazione() {
			return getRuleContexts(InformazioneContext.class);
		}
		public InformazioneContext informazione(int i) {
			return getRuleContext(InformazioneContext.class,i);
		}
		public List<CollegamentoContext> collegamento() {
			return getRuleContexts(CollegamentoContext.class);
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
			if ( listener instanceof GeneraleParserListener ) ((GeneraleParserListener)listener).enterCorsivoGrassetto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneraleParserListener ) ((GeneraleParserListener)listener).exitCorsivoGrassetto(this);
		}
	}

	public CorsivoGrassettoContext corsivoGrassetto() throws RecognitionException {
		CorsivoGrassettoContext _localctx = new CorsivoGrassettoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_corsivoGrassetto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(CorsivoGrassetto);
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(91);
				switch (_input.LA(1)) {
				case NEWLINE:
				case Text:
					{
					setState(88);
					testo();
					}
					break;
				case EnterInfo:
					{
					setState(89);
					informazione();
					}
					break;
				case EnterCollegamento:
					{
					setState(90);
					collegamento();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EnterInfo) | (1L << EnterCollegamento) | (1L << NEWLINE) | (1L << Text))) != 0) );
			setState(95);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24d\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\6\2\34\n\2\r\2\16\2\35\3\3\3\3\6\3\"\n\3\r\3\16\3#\3"+
		"\3\3\3\3\4\3\4\5\4*\n\4\3\4\6\4-\n\4\r\4\16\4.\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7>\n\7\f\7\16\7A\13\7\3\7\5\7D\n\7\3\b"+
		"\3\b\3\b\3\b\6\bJ\n\b\r\b\16\bK\3\b\3\b\3\t\3\t\3\t\3\t\6\tT\n\t\r\t\16"+
		"\tU\3\t\3\t\3\n\3\n\3\n\3\n\6\n^\n\n\r\n\16\n_\3\n\3\n\3\n\2\2\13\2\4"+
		"\6\b\n\f\16\20\22\2\4\3\2\23\24\3\3\23\23t\2\33\3\2\2\2\4\37\3\2\2\2\6"+
		"\'\3\2\2\2\b\62\3\2\2\2\n\64\3\2\2\2\f\66\3\2\2\2\16E\3\2\2\2\20O\3\2"+
		"\2\2\22Y\3\2\2\2\24\34\5\n\6\2\25\34\5\4\3\2\26\34\5\6\4\2\27\34\5\f\7"+
		"\2\30\34\5\16\b\2\31\34\5\20\t\2\32\34\5\22\n\2\33\24\3\2\2\2\33\25\3"+
		"\2\2\2\33\26\3\2\2\2\33\27\3\2\2\2\33\30\3\2\2\2\33\31\3\2\2\2\33\32\3"+
		"\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\3\3\2\2\2\37!\7\6"+
		"\2\2 \"\7\b\2\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$%\3\2\2\2%&\7"+
		"\7\2\2&\5\3\2\2\2\')\7\n\2\2(*\5\b\5\2)(\3\2\2\2)*\3\2\2\2*,\3\2\2\2+"+
		"-\7\r\2\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\61\7"+
		"\13\2\2\61\7\3\2\2\2\62\63\7\f\2\2\63\t\3\2\2\2\64\65\t\2\2\2\65\13\3"+
		"\2\2\2\66?\7\22\2\2\67>\5\4\3\28>\5\n\6\29>\5\6\4\2:>\5\16\b\2;>\5\20"+
		"\t\2<>\5\22\n\2=\67\3\2\2\2=8\3\2\2\2=9\3\2\2\2=:\3\2\2\2=;\3\2\2\2=<"+
		"\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@C\3\2\2\2A?\3\2\2\2BD\t\3\2\2C"+
		"B\3\2\2\2CD\3\2\2\2D\r\3\2\2\2EI\7\17\2\2FJ\5\n\6\2GJ\5\4\3\2HJ\5\6\4"+
		"\2IF\3\2\2\2IG\3\2\2\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2"+
		"\2MN\7\17\2\2N\17\3\2\2\2OS\7\20\2\2PT\5\n\6\2QT\5\4\3\2RT\5\6\4\2SP\3"+
		"\2\2\2SQ\3\2\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7"+
		"\20\2\2X\21\3\2\2\2Y]\7\21\2\2Z^\5\n\6\2[^\5\4\3\2\\^\5\6\4\2]Z\3\2\2"+
		"\2][\3\2\2\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7\21"+
		"\2\2b\23\3\2\2\2\20\33\35#).=?CIKSU]_";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
