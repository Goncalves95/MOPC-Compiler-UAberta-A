// Generated from /Users/fernandogoncalves/Desktop/UAB/2025-2026/2-Semestre/Compilação/Efolio-A/MOPC-Compiler-UAberta-A/grammar/MOCP.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MOCPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTEIRO=1, REAL=2, VAZIO=3, PRINCIPAL=4, RETORNAR=5, ESCREVER=6, ESCREVERS=7, 
		EQUALS=8, SEMI=9, COMMA=10, LPAR=11, RPAR=12, LBRACE=13, RBRACE=14, ID=15, 
		NUMBER=16, STRING=17, WS=18, COMMENT=19;
	public static final int
		RULE_program = 0, RULE_principal_func = 1, RULE_block = 2, RULE_statement = 3, 
		RULE_declaration = 4, RULE_tipo = 5, RULE_assignment = 6, RULE_return_stmt = 7, 
		RULE_function_call = 8, RULE_expr = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "principal_func", "block", "statement", "declaration", "tipo", 
			"assignment", "return_stmt", "function_call", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inteiro'", "'real'", "'vazio'", "'principal'", "'retornar'", 
			"'escrever'", "'escrevers'", "'='", "';'", "','", "'('", "')'", "'{'", 
			"'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INTEIRO", "REAL", "VAZIO", "PRINCIPAL", "RETORNAR", "ESCREVER", 
			"ESCREVERS", "EQUALS", "SEMI", "COMMA", "LPAR", "RPAR", "LBRACE", "RBRACE", 
			"ID", "NUMBER", "STRING", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "MOCP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MOCPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MOCPParser.EOF, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<Principal_funcContext> principal_func() {
			return getRuleContexts(Principal_funcContext.class);
		}
		public Principal_funcContext principal_func(int i) {
			return getRuleContext(Principal_funcContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEIRO) | (1L << REAL) | (1L << VAZIO))) != 0)) {
				{
				setState(22);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(20);
					declaration();
					}
					break;
				case 2:
					{
					setState(21);
					principal_func();
					}
					break;
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27);
			match(EOF);
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

	public static class Principal_funcContext extends ParserRuleContext {
		public List<TerminalNode> VAZIO() { return getTokens(MOCPParser.VAZIO); }
		public TerminalNode VAZIO(int i) {
			return getToken(MOCPParser.VAZIO, i);
		}
		public TerminalNode PRINCIPAL() { return getToken(MOCPParser.PRINCIPAL, 0); }
		public TerminalNode LPAR() { return getToken(MOCPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MOCPParser.RPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Principal_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principal_func; }
	}

	public final Principal_funcContext principal_func() throws RecognitionException {
		Principal_funcContext _localctx = new Principal_funcContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_principal_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(VAZIO);
			setState(30);
			match(PRINCIPAL);
			setState(31);
			match(LPAR);
			setState(32);
			match(VAZIO);
			setState(33);
			match(RPAR);
			setState(34);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(MOCPParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MOCPParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(LBRACE);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEIRO) | (1L << REAL) | (1L << VAZIO) | (1L << RETORNAR) | (1L << ESCREVER) | (1L << ESCREVERS) | (1L << ID))) != 0)) {
				{
				{
				setState(37);
				statement();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			match(RBRACE);
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

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MOCPParser.SEMI, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				assignment();
				setState(47);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				function_call();
				setState(50);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				return_stmt();
				setState(53);
				match(SEMI);
				}
				break;
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

	public static class DeclarationContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(MOCPParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(MOCPParser.SEMI, 0); }
		public TerminalNode EQUALS() { return getToken(MOCPParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			tipo();
			setState(58);
			match(ID);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(59);
				match(EQUALS);
				setState(60);
				expr();
				}
			}

			setState(63);
			match(SEMI);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INTEIRO() { return getToken(MOCPParser.INTEIRO, 0); }
		public TerminalNode REAL() { return getToken(MOCPParser.REAL, 0); }
		public TerminalNode VAZIO() { return getToken(MOCPParser.VAZIO, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEIRO) | (1L << REAL) | (1L << VAZIO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MOCPParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(MOCPParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(ID);
			setState(68);
			match(EQUALS);
			setState(69);
			expr();
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

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETORNAR() { return getToken(MOCPParser.RETORNAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(RETORNAR);
			setState(72);
			expr();
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ESCREVERS() { return getToken(MOCPParser.ESCREVERS, 0); }
		public TerminalNode LPAR() { return getToken(MOCPParser.LPAR, 0); }
		public TerminalNode STRING() { return getToken(MOCPParser.STRING, 0); }
		public TerminalNode RPAR() { return getToken(MOCPParser.RPAR, 0); }
		public TerminalNode ESCREVER() { return getToken(MOCPParser.ESCREVER, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(MOCPParser.ID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MOCPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MOCPParser.COMMA, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_call);
		int _la;
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESCREVERS:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(ESCREVERS);
				setState(75);
				match(LPAR);
				setState(76);
				match(STRING);
				setState(77);
				match(RPAR);
				}
				break;
			case ESCREVER:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(ESCREVER);
				setState(79);
				match(LPAR);
				setState(80);
				expr();
				setState(81);
				match(RPAR);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				match(ID);
				setState(84);
				match(LPAR);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUMBER) | (1L << STRING))) != 0)) {
					{
					setState(85);
					expr();
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(86);
						match(COMMA);
						setState(87);
						expr();
						}
						}
						setState(92);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(95);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MOCPParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(MOCPParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(MOCPParser.STRING, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUMBER) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25g\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\7\2\31\n\2\f\2\16\2\34\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\7\4)\n\4\f\4\16\4,\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5:\n\5\3\6\3\6\3\6\3\6\5\6@\n\6\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\7\n[\n\n\f\n\16\n^\13\n\5\n`\n\n\3\n\5\nc\n\n\3\13\3\13\3\13\2\2"+
		"\f\2\4\6\b\n\f\16\20\22\24\2\4\3\2\3\5\3\2\21\23\2g\2\32\3\2\2\2\4\37"+
		"\3\2\2\2\6&\3\2\2\2\b9\3\2\2\2\n;\3\2\2\2\fC\3\2\2\2\16E\3\2\2\2\20I\3"+
		"\2\2\2\22b\3\2\2\2\24d\3\2\2\2\26\31\5\n\6\2\27\31\5\4\3\2\30\26\3\2\2"+
		"\2\30\27\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\35\3\2\2"+
		"\2\34\32\3\2\2\2\35\36\7\2\2\3\36\3\3\2\2\2\37 \7\5\2\2 !\7\6\2\2!\"\7"+
		"\r\2\2\"#\7\5\2\2#$\7\16\2\2$%\5\6\4\2%\5\3\2\2\2&*\7\17\2\2\')\5\b\5"+
		"\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,*\3\2\2\2-.\7\20"+
		"\2\2.\7\3\2\2\2/:\5\n\6\2\60\61\5\16\b\2\61\62\7\13\2\2\62:\3\2\2\2\63"+
		"\64\5\22\n\2\64\65\7\13\2\2\65:\3\2\2\2\66\67\5\20\t\2\678\7\13\2\28:"+
		"\3\2\2\29/\3\2\2\29\60\3\2\2\29\63\3\2\2\29\66\3\2\2\2:\t\3\2\2\2;<\5"+
		"\f\7\2<?\7\21\2\2=>\7\n\2\2>@\5\24\13\2?=\3\2\2\2?@\3\2\2\2@A\3\2\2\2"+
		"AB\7\13\2\2B\13\3\2\2\2CD\t\2\2\2D\r\3\2\2\2EF\7\21\2\2FG\7\n\2\2GH\5"+
		"\24\13\2H\17\3\2\2\2IJ\7\7\2\2JK\5\24\13\2K\21\3\2\2\2LM\7\t\2\2MN\7\r"+
		"\2\2NO\7\23\2\2Oc\7\16\2\2PQ\7\b\2\2QR\7\r\2\2RS\5\24\13\2ST\7\16\2\2"+
		"Tc\3\2\2\2UV\7\21\2\2V_\7\r\2\2W\\\5\24\13\2XY\7\f\2\2Y[\5\24\13\2ZX\3"+
		"\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]`\3\2\2\2^\\\3\2\2\2_W\3\2\2\2"+
		"_`\3\2\2\2`a\3\2\2\2ac\7\16\2\2bL\3\2\2\2bP\3\2\2\2bU\3\2\2\2c\23\3\2"+
		"\2\2de\t\3\2\2e\25\3\2\2\2\n\30\32*9?\\_b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}