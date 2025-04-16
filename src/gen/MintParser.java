// Generated from Mint.g4 by ANTLR 4.13.2

package gen;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MintParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MINT_IF=1, MINT_ELSE=2, MINT_ELSEIF=3, MINT_FOR=4, MINT_WHILE=5, MINT_BREAK=6, 
		MINT_CONTINUE=7, SAY=8, SAYLN=9, T_IF=10, T_ELSE=11, AND=12, OR=13, NOT=14, 
		ADD=15, SUB=16, MUL=17, DIV=18, MOD=19, EQ=20, NEQ=21, LT=22, LTE=23, 
		GT=24, GTE=25, ASSIGN=26, SEMI=27, COMMA=28, LPAREN=29, RPAREN=30, LBRACE=31, 
		RBRACE=32, INT_TYPE=33, FLOAT_TYPE=34, STRING_TYPE=35, BOOL_TYPE=36, BOOL=37, 
		NUMBER=38, STRING=39, IDENTIFIER=40, WS=41, LINE_COMMENT=42;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_declaration = 2, RULE_assignment = 3, 
		RULE_printStatement = 4, RULE_ifStatement = 5, RULE_whileLoop = 6, RULE_simpleAssignment = 7, 
		RULE_forLoop = 8, RULE_breakStatement = 9, RULE_continueStatement = 10, 
		RULE_expressionStatement = 11, RULE_block = 12, RULE_type = 13, RULE_expression = 14, 
		RULE_ternaryExpression = 15, RULE_logicalExpression = 16, RULE_equalityExpression = 17, 
		RULE_comparisonExpression = 18, RULE_additiveExpression = 19, RULE_multiplicativeExpression = 20, 
		RULE_primaryExpression = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "declaration", "assignment", "printStatement", 
			"ifStatement", "whileLoop", "simpleAssignment", "forLoop", "breakStatement", 
			"continueStatement", "expressionStatement", "block", "type", "expression", 
			"ternaryExpression", "logicalExpression", "equalityExpression", "comparisonExpression", 
			"additiveExpression", "multiplicativeExpression", "primaryExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'mint_if'", "'mint_else'", "'mint_elseif'", "'mint_for'", "'mint_while'", 
			"'mint_break'", "'mint_continue'", "'say'", "'sayln'", "'?'", "':'", 
			"'and'", "'or'", "'not'", "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", 
			"'!='", "'<'", "'<='", "'>'", "'>='", "'='", "';'", "','", "'('", "')'", 
			"'{'", "'}'", "'mint_int'", "'mint_float'", "'mint_string'", "'mint_bool'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MINT_IF", "MINT_ELSE", "MINT_ELSEIF", "MINT_FOR", "MINT_WHILE", 
			"MINT_BREAK", "MINT_CONTINUE", "SAY", "SAYLN", "T_IF", "T_ELSE", "AND", 
			"OR", "NOT", "ADD", "SUB", "MUL", "DIV", "MOD", "EQ", "NEQ", "LT", "LTE", 
			"GT", "GTE", "ASSIGN", "SEMI", "COMMA", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "INT_TYPE", "FLOAT_TYPE", "STRING_TYPE", "BOOL_TYPE", "BOOL", 
			"NUMBER", "STRING", "IDENTIFIER", "WS", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "Mint.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MintParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MintParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MintVisitor ) return ((MintVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2190970209266L) != 0)) {
				{
				{
				setState(44);
				statement();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MintVisitor ) return ((MintVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				printStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(56);
				whileLoop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(57);
				forLoop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(58);
				breakStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(59);
				continueStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(60);
				expressionStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MintParser.IDENTIFIER, 0); }
		public TerminalNode SEMI() { return getToken(MintParser.SEMI, 0); }
		public TerminalNode ASSIGN() { return getToken(MintParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MintVisitor ) return ((MintVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			type();
			setState(64);
			match(IDENTIFIER);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(65);
				match(ASSIGN);
				setState(66);
				expression();
				}
			}

			setState(69);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MintParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(MintParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MintParser.SEMI, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MintVisitor ) return ((MintVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(IDENTIFIER);
			setState(72);
			match(ASSIGN);
			setState(73);
			expression();
			setState(74);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode SAY() { return getToken(MintParser.SAY, 0); }
		public TerminalNode LPAREN() { return getToken(MintParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MintParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(MintParser.SEMI, 0); }
		public TerminalNode SAYLN() { return getToken(MintParser.SAYLN, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MintVisitor ) return ((MintVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_printStatement);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(SAY);
				setState(77);
				match(LPAREN);
				setState(78);
				expression();
				setState(79);
				match(RPAREN);
				setState(80);
				match(SEMI);
				}
				break;
			case SAYLN:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(SAYLN);
				setState(83);
				match(LPAREN);
				setState(84);
				expression();
				setState(85);
				match(RPAREN);
				setState(86);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode MINT_IF() { return getToken(MintParser.MINT_IF, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(MintParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(MintParser.LPAREN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(MintParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(MintParser.RPAREN, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> MINT_ELSEIF() { return getTokens(MintParser.MINT_ELSEIF); }
		public TerminalNode MINT_ELSEIF(int i) {
			return getToken(MintParser.MINT_ELSEIF, i);
		}
		public TerminalNode MINT_ELSE() { return getToken(MintParser.MINT_ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MintVisitor ) return ((MintVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(MINT_IF);
			setState(91);
			match(LPAREN);
			setState(92);
			expression();
			setState(93);
			match(RPAREN);
			setState(94);
			block();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINT_ELSEIF) {
				{
				{
				setState(95);
				match(MINT_ELSEIF);
				setState(96);
				match(LPAREN);
				setState(97);
				expression();
				setState(98);
				match(RPAREN);
				setState(99);
				block();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINT_ELSE) {
				{
				setState(106);
				match(MINT_ELSE);
				setState(107);
				block();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode MINT_WHILE() { return getToken(MintParser.MINT_WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(MintParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MintParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MintVisitor ) return ((MintVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(MINT_WHILE);
			setState(111);
			match(LPAREN);
			setState(112);
			expression();
			setState(113);
			match(RPAREN);
			setState(114);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleAssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MintParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(MintParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).enterSimpleAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).exitSimpleAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MintVisitor ) return ((MintVisitor<? extends T>)visitor).visitSimpleAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleAssignmentContext simpleAssignment() throws RecognitionException {
		SimpleAssignmentContext _localctx = new SimpleAssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simpleAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(IDENTIFIER);
			setState(117);
			match(ASSIGN);
			setState(118);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode MINT_FOR() { return getToken(MintParser.MINT_FOR, 0); }
		public TerminalNode LPAREN() { return getToken(MintParser.LPAREN, 0); }
		public List<SimpleAssignmentContext> simpleAssignment() {
			return getRuleContexts(SimpleAssignmentContext.class);
		}
		public SimpleAssignmentContext simpleAssignment(int i) {
			return getRuleContext(SimpleAssignmentContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(MintParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(MintParser.SEMI, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MintParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MintVisitor ) return ((MintVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(MINT_FOR);
			setState(121);
			match(LPAREN);
			setState(122);
			simpleAssignment();
			setState(123);
			match(SEMI);
			setState(124);
			expression();
			setState(125);
			match(SEMI);
			setState(126);
			simpleAssignment();
			setState(127);
			match(RPAREN);
			setState(128);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode MINT_BREAK() { return getToken(MintParser.MINT_BREAK, 0); }
		public TerminalNode SEMI() { return getToken(MintParser.SEMI, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MintVisitor ) return ((MintVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(MINT_BREAK);
			setState(131);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode MINT_CONTINUE() { return getToken(MintParser.MINT_CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(MintParser.SEMI, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MintVisitor ) return ((MintVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(MINT_CONTINUE);
			setState(134);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MintParser.SEMI, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MintVisitor ) return ((MintVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			expression();
			setState(137);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(MintParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MintParser.RBRACE, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MintVisitor ) return ((MintVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(LBRACE);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2190970209266L) != 0)) {
				{
				{
				setState(140);
				statement();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(MintParser.INT_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(MintParser.FLOAT_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(MintParser.STRING_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(MintParser.BOOL_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MintVisitor ) return ((MintVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 128849018880L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TernaryExpressionContext ternaryExpression() {
			return getRuleContext(TernaryExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MintVisitor ) return ((MintVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			ternaryExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TernaryExpressionContext extends ParserRuleContext {
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode T_IF() { return getToken(MintParser.T_IF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode T_ELSE() { return getToken(MintParser.T_ELSE, 0); }
		public TernaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).exitTernaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MintVisitor ) return ((MintVisitor<? extends T>)visitor).visitTernaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TernaryExpressionContext ternaryExpression() throws RecognitionException {
		TernaryExpressionContext _localctx = new TernaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ternaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			logicalExpression(0);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_IF) {
				{
				setState(153);
				match(T_IF);
				setState(154);
				expression();
				setState(155);
				match(T_ELSE);
				setState(156);
				expression();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExpressionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(MintParser.NOT, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(MintParser.AND, 0); }
		public TerminalNode OR() { return getToken(MintParser.OR, 0); }
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MintVisitor ) return ((MintVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		return logicalExpression(0);
	}

	private LogicalExpressionContext logicalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, _parentState);
		LogicalExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_logicalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(161);
				match(NOT);
				setState(162);
				logicalExpression(2);
				}
				break;
			case LPAREN:
			case BOOL:
			case NUMBER:
			case STRING:
			case IDENTIFIER:
				{
				setState(163);
				equalityExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(172);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
						setState(166);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(167);
						match(AND);
						setState(168);
						equalityExpression();
						}
						break;
					case 2:
						{
						_localctx = new LogicalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
						setState(169);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(170);
						match(OR);
						setState(171);
						equalityExpression();
						}
						break;
					}
					} 
				}
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<ComparisonExpressionContext> comparisonExpression() {
			return getRuleContexts(ComparisonExpressionContext.class);
		}
		public ComparisonExpressionContext comparisonExpression(int i) {
			return getRuleContext(ComparisonExpressionContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(MintParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(MintParser.EQ, i);
		}
		public List<TerminalNode> NEQ() { return getTokens(MintParser.NEQ); }
		public TerminalNode NEQ(int i) {
			return getToken(MintParser.NEQ, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MintVisitor ) return ((MintVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_equalityExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			comparisonExpression();
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(178);
					_la = _input.LA(1);
					if ( !(_la==EQ || _la==NEQ) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(179);
					comparisonExpression();
					}
					} 
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(MintParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(MintParser.LT, i);
		}
		public List<TerminalNode> LTE() { return getTokens(MintParser.LTE); }
		public TerminalNode LTE(int i) {
			return getToken(MintParser.LTE, i);
		}
		public List<TerminalNode> GT() { return getTokens(MintParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(MintParser.GT, i);
		}
		public List<TerminalNode> GTE() { return getTokens(MintParser.GTE); }
		public TerminalNode GTE(int i) {
			return getToken(MintParser.GTE, i);
		}
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MintVisitor ) return ((MintVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comparisonExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			additiveExpression(0);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(186);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62914560L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(187);
					additiveExpression(0);
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(MintParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(MintParser.SUB, 0); }
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MintVisitor ) return ((MintVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_additiveExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(194);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
					setState(196);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(197);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(198);
					multiplicativeExpression(0);
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode MUL() { return getToken(MintParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(MintParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MintParser.MOD, 0); }
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MintVisitor ) return ((MintVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_multiplicativeExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(205);
			primaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
					setState(207);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(208);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(209);
					primaryExpression();
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MintParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MintParser.RPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MintParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(MintParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(MintParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(MintParser.BOOL, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MintListener ) ((MintListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MintVisitor ) return ((MintVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_primaryExpression);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(LPAREN);
				setState(216);
				expression();
				setState(217);
				match(RPAREN);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
				match(STRING);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 5);
				{
				setState(222);
				match(BOOL);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return logicalExpression_sempred((LogicalExpressionContext)_localctx, predIndex);
		case 19:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 20:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logicalExpression_sempred(LogicalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001*\u00e2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0005\u0000.\b\u0000\n\u0000\f\u00001\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001>\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002D\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004Y\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005f\b\u0005\n\u0005\f\u0005i\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005m\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0005\f"+
		"\u008e\b\f\n\f\f\f\u0091\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u009f\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u00a5\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00ad\b\u0010\n\u0010"+
		"\f\u0010\u00b0\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u00b5\b\u0011\n\u0011\f\u0011\u00b8\t\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u00bd\b\u0012\n\u0012\f\u0012\u00c0\t\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u00c8\b\u0013\n\u0013\f\u0013\u00cb\t\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00d3\b\u0014\n"+
		"\u0014\f\u0014\u00d6\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00e0"+
		"\b\u0015\u0001\u0015\u0000\u0003 &(\u0016\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*\u0000"+
		"\u0005\u0001\u0000!$\u0001\u0000\u0014\u0015\u0001\u0000\u0016\u0019\u0001"+
		"\u0000\u000f\u0010\u0001\u0000\u0011\u0013\u00e5\u0000/\u0001\u0000\u0000"+
		"\u0000\u0002=\u0001\u0000\u0000\u0000\u0004?\u0001\u0000\u0000\u0000\u0006"+
		"G\u0001\u0000\u0000\u0000\bX\u0001\u0000\u0000\u0000\nZ\u0001\u0000\u0000"+
		"\u0000\fn\u0001\u0000\u0000\u0000\u000et\u0001\u0000\u0000\u0000\u0010"+
		"x\u0001\u0000\u0000\u0000\u0012\u0082\u0001\u0000\u0000\u0000\u0014\u0085"+
		"\u0001\u0000\u0000\u0000\u0016\u0088\u0001\u0000\u0000\u0000\u0018\u008b"+
		"\u0001\u0000\u0000\u0000\u001a\u0094\u0001\u0000\u0000\u0000\u001c\u0096"+
		"\u0001\u0000\u0000\u0000\u001e\u0098\u0001\u0000\u0000\u0000 \u00a4\u0001"+
		"\u0000\u0000\u0000\"\u00b1\u0001\u0000\u0000\u0000$\u00b9\u0001\u0000"+
		"\u0000\u0000&\u00c1\u0001\u0000\u0000\u0000(\u00cc\u0001\u0000\u0000\u0000"+
		"*\u00df\u0001\u0000\u0000\u0000,.\u0003\u0002\u0001\u0000-,\u0001\u0000"+
		"\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001"+
		"\u0000\u0000\u000002\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u0000"+
		"23\u0005\u0000\u0000\u00013\u0001\u0001\u0000\u0000\u00004>\u0003\u0004"+
		"\u0002\u00005>\u0003\u0006\u0003\u00006>\u0003\b\u0004\u00007>\u0003\n"+
		"\u0005\u00008>\u0003\f\u0006\u00009>\u0003\u0010\b\u0000:>\u0003\u0012"+
		"\t\u0000;>\u0003\u0014\n\u0000<>\u0003\u0016\u000b\u0000=4\u0001\u0000"+
		"\u0000\u0000=5\u0001\u0000\u0000\u0000=6\u0001\u0000\u0000\u0000=7\u0001"+
		"\u0000\u0000\u0000=8\u0001\u0000\u0000\u0000=9\u0001\u0000\u0000\u0000"+
		"=:\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=<\u0001\u0000\u0000"+
		"\u0000>\u0003\u0001\u0000\u0000\u0000?@\u0003\u001a\r\u0000@C\u0005(\u0000"+
		"\u0000AB\u0005\u001a\u0000\u0000BD\u0003\u001c\u000e\u0000CA\u0001\u0000"+
		"\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0005"+
		"\u001b\u0000\u0000F\u0005\u0001\u0000\u0000\u0000GH\u0005(\u0000\u0000"+
		"HI\u0005\u001a\u0000\u0000IJ\u0003\u001c\u000e\u0000JK\u0005\u001b\u0000"+
		"\u0000K\u0007\u0001\u0000\u0000\u0000LM\u0005\b\u0000\u0000MN\u0005\u001d"+
		"\u0000\u0000NO\u0003\u001c\u000e\u0000OP\u0005\u001e\u0000\u0000PQ\u0005"+
		"\u001b\u0000\u0000QY\u0001\u0000\u0000\u0000RS\u0005\t\u0000\u0000ST\u0005"+
		"\u001d\u0000\u0000TU\u0003\u001c\u000e\u0000UV\u0005\u001e\u0000\u0000"+
		"VW\u0005\u001b\u0000\u0000WY\u0001\u0000\u0000\u0000XL\u0001\u0000\u0000"+
		"\u0000XR\u0001\u0000\u0000\u0000Y\t\u0001\u0000\u0000\u0000Z[\u0005\u0001"+
		"\u0000\u0000[\\\u0005\u001d\u0000\u0000\\]\u0003\u001c\u000e\u0000]^\u0005"+
		"\u001e\u0000\u0000^g\u0003\u0018\f\u0000_`\u0005\u0003\u0000\u0000`a\u0005"+
		"\u001d\u0000\u0000ab\u0003\u001c\u000e\u0000bc\u0005\u001e\u0000\u0000"+
		"cd\u0003\u0018\f\u0000df\u0001\u0000\u0000\u0000e_\u0001\u0000\u0000\u0000"+
		"fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000hl\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jk\u0005\u0002"+
		"\u0000\u0000km\u0003\u0018\f\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000"+
		"\u0000\u0000m\u000b\u0001\u0000\u0000\u0000no\u0005\u0005\u0000\u0000"+
		"op\u0005\u001d\u0000\u0000pq\u0003\u001c\u000e\u0000qr\u0005\u001e\u0000"+
		"\u0000rs\u0003\u0018\f\u0000s\r\u0001\u0000\u0000\u0000tu\u0005(\u0000"+
		"\u0000uv\u0005\u001a\u0000\u0000vw\u0003\u001c\u000e\u0000w\u000f\u0001"+
		"\u0000\u0000\u0000xy\u0005\u0004\u0000\u0000yz\u0005\u001d\u0000\u0000"+
		"z{\u0003\u000e\u0007\u0000{|\u0005\u001b\u0000\u0000|}\u0003\u001c\u000e"+
		"\u0000}~\u0005\u001b\u0000\u0000~\u007f\u0003\u000e\u0007\u0000\u007f"+
		"\u0080\u0005\u001e\u0000\u0000\u0080\u0081\u0003\u0018\f\u0000\u0081\u0011"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u0006\u0000\u0000\u0083\u0084"+
		"\u0005\u001b\u0000\u0000\u0084\u0013\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0005\u0007\u0000\u0000\u0086\u0087\u0005\u001b\u0000\u0000\u0087\u0015"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0003\u001c\u000e\u0000\u0089\u008a"+
		"\u0005\u001b\u0000\u0000\u008a\u0017\u0001\u0000\u0000\u0000\u008b\u008f"+
		"\u0005\u001f\u0000\u0000\u008c\u008e\u0003\u0002\u0001\u0000\u008d\u008c"+
		"\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0092"+
		"\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0005 \u0000\u0000\u0093\u0019\u0001\u0000\u0000\u0000\u0094\u0095\u0007"+
		"\u0000\u0000\u0000\u0095\u001b\u0001\u0000\u0000\u0000\u0096\u0097\u0003"+
		"\u001e\u000f\u0000\u0097\u001d\u0001\u0000\u0000\u0000\u0098\u009e\u0003"+
		" \u0010\u0000\u0099\u009a\u0005\n\u0000\u0000\u009a\u009b\u0003\u001c"+
		"\u000e\u0000\u009b\u009c\u0005\u000b\u0000\u0000\u009c\u009d\u0003\u001c"+
		"\u000e\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u0099\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u001f\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0006\u0010\uffff\uffff\u0000\u00a1\u00a2\u0005"+
		"\u000e\u0000\u0000\u00a2\u00a5\u0003 \u0010\u0002\u00a3\u00a5\u0003\""+
		"\u0011\u0000\u00a4\u00a0\u0001\u0000\u0000\u0000\u00a4\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a5\u00ae\u0001\u0000\u0000\u0000\u00a6\u00a7\n\u0004\u0000"+
		"\u0000\u00a7\u00a8\u0005\f\u0000\u0000\u00a8\u00ad\u0003\"\u0011\u0000"+
		"\u00a9\u00aa\n\u0003\u0000\u0000\u00aa\u00ab\u0005\r\u0000\u0000\u00ab"+
		"\u00ad\u0003\"\u0011\u0000\u00ac\u00a6\u0001\u0000\u0000\u0000\u00ac\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af!\u0001"+
		"\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b6\u0003"+
		"$\u0012\u0000\u00b2\u00b3\u0007\u0001\u0000\u0000\u00b3\u00b5\u0003$\u0012"+
		"\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b7#\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b9\u00be\u0003&\u0013\u0000\u00ba\u00bb\u0007\u0002\u0000\u0000\u00bb"+
		"\u00bd\u0003&\u0013\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00c0"+
		"\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0001\u0000\u0000\u0000\u00bf%\u0001\u0000\u0000\u0000\u00c0\u00be\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0006\u0013\uffff\uffff\u0000\u00c2\u00c3"+
		"\u0003(\u0014\u0000\u00c3\u00c9\u0001\u0000\u0000\u0000\u00c4\u00c5\n"+
		"\u0002\u0000\u0000\u00c5\u00c6\u0007\u0003\u0000\u0000\u00c6\u00c8\u0003"+
		"(\u0014\u0000\u00c7\u00c4\u0001\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000"+
		"\u0000\u0000\u00ca\'\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cd\u0006\u0014\uffff\uffff\u0000\u00cd\u00ce\u0003*\u0015"+
		"\u0000\u00ce\u00d4\u0001\u0000\u0000\u0000\u00cf\u00d0\n\u0002\u0000\u0000"+
		"\u00d0\u00d1\u0007\u0004\u0000\u0000\u00d1\u00d3\u0003*\u0015\u0000\u00d2"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5"+
		")\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00d8"+
		"\u0005\u001d\u0000\u0000\u00d8\u00d9\u0003\u001c\u000e\u0000\u00d9\u00da"+
		"\u0005\u001e\u0000\u0000\u00da\u00e0\u0001\u0000\u0000\u0000\u00db\u00e0"+
		"\u0005(\u0000\u0000\u00dc\u00e0\u0005&\u0000\u0000\u00dd\u00e0\u0005\'"+
		"\u0000\u0000\u00de\u00e0\u0005%\u0000\u0000\u00df\u00d7\u0001\u0000\u0000"+
		"\u0000\u00df\u00db\u0001\u0000\u0000\u0000\u00df\u00dc\u0001\u0000\u0000"+
		"\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00de\u0001\u0000\u0000"+
		"\u0000\u00e0+\u0001\u0000\u0000\u0000\u0010/=CXgl\u008f\u009e\u00a4\u00ac"+
		"\u00ae\u00b6\u00be\u00c9\u00d4\u00df";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}