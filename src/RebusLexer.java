// Generated from Rebus.g4 by ANTLR 4.12.0

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class RebusLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, MUL=7, DIV=8, ADD=9, SUB=10, 
		ID=11, INT=12, STRING=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "MUL", "DIV", "ADD", 
			"SUB", "ID", "INT", "STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'int'", "'string'", "'='", "'('", "')'", "'*'", "'/'", 
			"'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "MUL", "DIV", "ADD", "SUB", 
			"ID", "INT", "STRING", "WS"
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


	public RebusLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Rebus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000eX\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n?\b\n\n"+
		"\n\f\nB\t\n\u0001\u000b\u0004\u000bE\b\u000b\u000b\u000b\f\u000bF\u0001"+
		"\f\u0001\f\u0005\fK\b\f\n\f\f\fN\t\f\u0001\f\u0001\f\u0001\r\u0004\rS"+
		"\b\r\u000b\r\f\rT\u0001\r\u0001\r\u0000\u0000\u000e\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u0001\u0000\u0005\u0003"+
		"\u0000AZ__az\u0004\u000009AZ__az\u0001\u000009\u0003\u0000\n\n\r\r\"\""+
		"\u0003\u0000\t\n\r\r  [\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0001\u001d\u0001\u0000\u0000\u0000\u0003#\u0001\u0000\u0000"+
		"\u0000\u0005\'\u0001\u0000\u0000\u0000\u0007.\u0001\u0000\u0000\u0000"+
		"\t0\u0001\u0000\u0000\u0000\u000b2\u0001\u0000\u0000\u0000\r4\u0001\u0000"+
		"\u0000\u0000\u000f6\u0001\u0000\u0000\u0000\u00118\u0001\u0000\u0000\u0000"+
		"\u0013:\u0001\u0000\u0000\u0000\u0015<\u0001\u0000\u0000\u0000\u0017D"+
		"\u0001\u0000\u0000\u0000\u0019H\u0001\u0000\u0000\u0000\u001bR\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0005p\u0000\u0000\u001e\u001f\u0005r\u0000\u0000"+
		"\u001f \u0005i\u0000\u0000 !\u0005n\u0000\u0000!\"\u0005t\u0000\u0000"+
		"\"\u0002\u0001\u0000\u0000\u0000#$\u0005i\u0000\u0000$%\u0005n\u0000\u0000"+
		"%&\u0005t\u0000\u0000&\u0004\u0001\u0000\u0000\u0000\'(\u0005s\u0000\u0000"+
		"()\u0005t\u0000\u0000)*\u0005r\u0000\u0000*+\u0005i\u0000\u0000+,\u0005"+
		"n\u0000\u0000,-\u0005g\u0000\u0000-\u0006\u0001\u0000\u0000\u0000./\u0005"+
		"=\u0000\u0000/\b\u0001\u0000\u0000\u000001\u0005(\u0000\u00001\n\u0001"+
		"\u0000\u0000\u000023\u0005)\u0000\u00003\f\u0001\u0000\u0000\u000045\u0005"+
		"*\u0000\u00005\u000e\u0001\u0000\u0000\u000067\u0005/\u0000\u00007\u0010"+
		"\u0001\u0000\u0000\u000089\u0005+\u0000\u00009\u0012\u0001\u0000\u0000"+
		"\u0000:;\u0005-\u0000\u0000;\u0014\u0001\u0000\u0000\u0000<@\u0007\u0000"+
		"\u0000\u0000=?\u0007\u0001\u0000\u0000>=\u0001\u0000\u0000\u0000?B\u0001"+
		"\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000"+
		"A\u0016\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000CE\u0007\u0002"+
		"\u0000\u0000DC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FD\u0001"+
		"\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000G\u0018\u0001\u0000\u0000"+
		"\u0000HL\u0005\"\u0000\u0000IK\b\u0003\u0000\u0000JI\u0001\u0000\u0000"+
		"\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000"+
		"\u0000\u0000MO\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OP\u0005"+
		"\"\u0000\u0000P\u001a\u0001\u0000\u0000\u0000QS\u0007\u0004\u0000\u0000"+
		"RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000"+
		"\u0000TU\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0006\r\u0000"+
		"\u0000W\u001c\u0001\u0000\u0000\u0000\u0005\u0000@FLT\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}