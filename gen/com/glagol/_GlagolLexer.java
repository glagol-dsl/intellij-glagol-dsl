/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package com.glagol;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static com.glagol.psi.GlagolTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>_GlagolLexer.flex</tt>
 */
public class _GlagolLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [9, 6, 6]
   * Total runtime size is 1568 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>12]|((ch>>6)&0x3f)]<<6)|(ch&0x3f)];
  }

  /* The ZZ_CMAP_Z table has 272 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\100\1\200\u010d\100");

  /* The ZZ_CMAP_Y table has 192 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\175\3\1\4\77\3");

  /* The ZZ_CMAP_A table has 320 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\2\1\1\1\33\2\1\22\0\1\2\1\0\1\34\4\0\1\32\1\46\1\47\1\36\1\0\1\41"+
    "\1\0\1\5\1\35\12\4\1\3\1\40\1\0\1\37\2\0\1\50\32\6\1\44\1\30\1\45\1\0\1\7"+
    "\1\0\1\11\1\55\1\20\1\12\1\14\1\23\1\16\1\54\1\51\2\31\1\21\1\26\1\25\1\24"+
    "\1\10\1\31\1\17\1\13\1\15\1\22\1\52\1\53\1\31\1\27\1\31\1\42\1\0\1\43\7\0"+
    "\1\33\242\0\2\33\26\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\2\6\7\7"+
    "\1\6\4\7\4\1\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\4\7\1\6\1\0"+
    "\2\7\1\22\15\7\2\0\1\23\2\0\1\24\1\0"+
    "\4\7\1\25\1\7\1\26\5\7\1\27\3\7\1\30"+
    "\2\7\1\23\1\0\1\31\6\7\1\32\2\7\1\33"+
    "\2\7\1\34\1\7\1\35\1\36\4\7\1\37\1\7"+
    "\1\40\1\7\1\41\1\42\1\7\1\43\1\44\1\7"+
    "\1\45";

  private static int [] zzUnpackAction() {
    int [] result = new int[116];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\56\0\134\0\212\0\270\0\346\0\u0114\0\u0142"+
    "\0\u0170\0\u019e\0\u01cc\0\u01fa\0\u0228\0\u0256\0\u0284\0\u02b2"+
    "\0\u02e0\0\u030e\0\u033c\0\u036a\0\u0398\0\u03c6\0\u03f4\0\u0422"+
    "\0\56\0\56\0\56\0\56\0\56\0\56\0\56\0\56"+
    "\0\56\0\56\0\u0450\0\u047e\0\u04ac\0\u04da\0\212\0\u0508"+
    "\0\u0536\0\u0564\0\u0170\0\u0592\0\u05c0\0\u05ee\0\u061c\0\u064a"+
    "\0\u0678\0\u06a6\0\u06d4\0\u0702\0\u0730\0\u075e\0\u078c\0\u07ba"+
    "\0\u03c6\0\u07e8\0\56\0\u03f4\0\u0816\0\u0844\0\u0872\0\u08a0"+
    "\0\u08ce\0\u08fc\0\u092a\0\u0508\0\u0958\0\u0170\0\u0986\0\u09b4"+
    "\0\u09e2\0\u0a10\0\u0a3e\0\u0170\0\u0a6c\0\u0a9a\0\u0ac8\0\u0170"+
    "\0\u0af6\0\u0b24\0\u03f4\0\u0b52\0\u0170\0\u0b80\0\u0bae\0\u0bdc"+
    "\0\u0c0a\0\u0c38\0\u0c66\0\u0170\0\u0c94\0\u0cc2\0\u0170\0\u0cf0"+
    "\0\u0d1e\0\u0872\0\u0d4c\0\u0170\0\u0170\0\u0d7a\0\u0da8\0\u0dd6"+
    "\0\u0e04\0\u0170\0\u0e32\0\u0170\0\u0e60\0\u0170\0\u0170\0\u0e8e"+
    "\0\u0170\0\u0170\0\u0ebc\0\u0170";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[116];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\4\1\5\1\2\1\6\1\2\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\11\1\24\1\11\1\25"+
    "\1\11\1\26\1\2\1\27\1\30\1\2\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\20\1\46\57\0\2\3\56\0"+
    "\1\47\4\0\2\47\7\0\1\47\32\0\1\47\5\0"+
    "\1\5\1\50\54\0\1\6\1\0\22\6\1\0\1\6"+
    "\17\0\5\6\3\0\1\47\1\11\1\0\2\11\2\20"+
    "\5\11\1\51\1\11\1\20\6\11\1\0\1\11\17\0"+
    "\3\11\1\20\1\11\3\0\1\47\1\11\1\0\2\11"+
    "\2\20\1\52\1\53\5\11\1\20\6\11\1\0\1\11"+
    "\17\0\3\11\1\20\1\11\4\0\1\11\1\0\22\11"+
    "\1\0\1\11\17\0\5\11\4\0\1\11\1\0\6\11"+
    "\1\54\1\55\12\11\1\0\1\11\17\0\5\11\4\0"+
    "\1\11\1\0\17\11\1\56\2\11\1\0\1\11\17\0"+
    "\5\11\4\0\1\11\1\0\11\11\1\57\10\11\1\0"+
    "\1\11\17\0\5\11\4\0\1\11\1\0\6\11\1\54"+
    "\13\11\1\0\1\11\17\0\5\11\4\0\1\11\1\0"+
    "\6\11\1\60\13\11\1\0\1\11\17\0\5\11\4\0"+
    "\1\11\1\0\13\11\1\61\6\11\1\0\1\11\17\0"+
    "\5\11\3\0\1\47\1\11\1\0\2\11\2\20\7\11"+
    "\1\20\6\11\1\0\1\11\17\0\3\11\1\20\1\11"+
    "\4\0\1\11\1\0\5\11\1\62\14\11\1\0\1\11"+
    "\17\0\5\11\4\0\1\11\1\0\3\11\1\63\5\11"+
    "\1\64\1\11\1\65\6\11\1\0\1\11\17\0\5\11"+
    "\4\0\1\11\1\0\17\11\1\66\2\11\1\0\1\11"+
    "\17\0\5\11\4\0\1\11\1\0\3\11\1\67\12\11"+
    "\1\70\3\11\1\0\1\11\17\0\5\11\10\0\20\11"+
    "\1\0\1\11\17\0\5\11\30\71\1\72\1\71\1\73"+
    "\23\71\30\74\1\75\3\74\1\73\21\74\35\0\1\76"+
    "\1\77\23\0\1\11\1\0\17\11\1\100\2\11\1\0"+
    "\1\11\17\0\5\11\4\0\1\11\1\0\3\11\1\101"+
    "\16\11\1\0\1\11\17\0\5\11\4\0\1\11\1\0"+
    "\22\11\1\0\1\11\17\0\1\102\4\11\4\0\1\11"+
    "\1\0\16\11\1\103\3\11\1\0\1\11\17\0\5\11"+
    "\4\0\1\104\55\0\1\11\1\0\22\11\1\0\1\11"+
    "\17\0\1\105\4\11\4\0\1\11\1\0\4\11\1\106"+
    "\15\11\1\0\1\11\17\0\5\11\4\0\1\11\1\0"+
    "\7\11\1\106\12\11\1\0\1\11\17\0\5\11\4\0"+
    "\1\11\1\0\11\11\1\107\10\11\1\0\1\11\17\0"+
    "\5\11\4\0\1\11\1\0\7\11\1\110\12\11\1\0"+
    "\1\11\17\0\5\11\4\0\1\11\1\0\14\11\1\111"+
    "\5\11\1\0\1\11\17\0\5\11\4\0\1\11\1\0"+
    "\5\11\1\15\5\11\1\112\6\11\1\0\1\11\17\0"+
    "\5\11\4\0\1\11\1\0\6\11\1\113\13\11\1\0"+
    "\1\11\17\0\5\11\4\0\1\11\1\0\6\11\1\114"+
    "\13\11\1\0\1\11\17\0\5\11\4\0\1\11\1\0"+
    "\13\11\1\115\6\11\1\0\1\11\17\0\5\11\4\0"+
    "\1\11\1\0\16\11\1\116\3\11\1\0\1\11\17\0"+
    "\5\11\4\0\1\11\1\0\16\11\1\117\3\11\1\0"+
    "\1\11\17\0\5\11\4\0\1\11\1\0\6\11\1\120"+
    "\13\11\1\0\1\11\17\0\5\11\4\0\1\11\1\0"+
    "\17\11\1\121\2\11\1\0\1\11\17\0\5\11\4\0"+
    "\1\11\1\0\4\11\1\122\15\11\1\0\1\11\17\0"+
    "\5\11\1\71\1\0\31\71\1\0\22\71\30\74\1\75"+
    "\3\74\1\123\21\74\1\76\1\0\31\76\1\0\22\76"+
    "\36\77\1\124\17\77\4\0\1\11\1\0\7\11\1\125"+
    "\12\11\1\0\1\11\17\0\5\11\4\0\1\11\1\0"+
    "\13\11\1\126\6\11\1\0\1\11\17\0\5\11\4\0"+
    "\1\11\1\0\7\11\1\127\12\11\1\0\1\11\17\0"+
    "\5\11\4\0\1\11\1\0\16\11\1\130\3\11\1\0"+
    "\1\11\17\0\5\11\4\0\1\11\1\0\20\11\1\131"+
    "\1\11\1\0\1\11\17\0\5\11\4\0\1\11\1\0"+
    "\22\11\1\0\1\11\17\0\1\132\4\11\4\0\1\11"+
    "\1\0\22\11\1\0\1\11\17\0\1\133\4\11\4\0"+
    "\1\11\1\0\6\11\1\134\13\11\1\0\1\11\17\0"+
    "\5\11\4\0\1\11\1\0\3\11\1\135\16\11\1\0"+
    "\1\11\17\0\5\11\4\0\1\11\1\0\3\11\1\136"+
    "\16\11\1\0\1\11\17\0\5\11\4\0\1\11\1\0"+
    "\5\11\1\111\14\11\1\0\1\11\17\0\5\11\4\0"+
    "\1\11\1\0\20\11\1\137\1\11\1\0\1\11\17\0"+
    "\5\11\4\0\1\11\1\0\3\11\1\140\16\11\1\0"+
    "\1\11\17\0\5\11\4\0\1\11\1\0\21\11\1\120"+
    "\1\0\1\11\17\0\5\11\4\0\1\11\1\0\14\11"+
    "\1\141\5\11\1\0\1\11\17\0\5\11\35\77\1\142"+
    "\1\124\17\77\4\0\1\11\1\0\14\11\1\143\5\11"+
    "\1\0\1\11\17\0\5\11\4\0\1\11\1\0\22\11"+
    "\1\0\1\11\17\0\3\11\1\144\1\11\4\0\1\11"+
    "\1\0\13\11\1\145\6\11\1\0\1\11\17\0\5\11"+
    "\4\0\1\11\1\0\3\11\1\146\16\11\1\0\1\11"+
    "\17\0\5\11\4\0\1\11\1\0\17\11\1\147\2\11"+
    "\1\0\1\11\17\0\5\11\4\0\1\11\1\0\7\11"+
    "\1\150\12\11\1\0\1\11\17\0\5\11\4\0\1\11"+
    "\1\0\7\11\1\151\12\11\1\0\1\11\17\0\5\11"+
    "\4\0\1\11\1\0\11\11\1\106\10\11\1\0\1\11"+
    "\17\0\5\11\4\0\1\11\1\0\7\11\1\152\12\11"+
    "\1\0\1\11\17\0\5\11\4\0\1\11\1\0\13\11"+
    "\1\153\6\11\1\0\1\11\17\0\5\11\4\0\1\11"+
    "\1\0\6\11\1\154\13\11\1\0\1\11\17\0\5\11"+
    "\4\0\1\11\1\0\11\11\1\155\10\11\1\0\1\11"+
    "\17\0\5\11\4\0\1\11\1\0\10\11\1\156\11\11"+
    "\1\0\1\11\17\0\5\11\4\0\1\11\1\0\21\11"+
    "\1\157\1\0\1\11\17\0\5\11\4\0\1\11\1\0"+
    "\22\11\1\0\1\11\17\0\1\160\4\11\4\0\1\11"+
    "\1\0\6\11\1\161\13\11\1\0\1\11\17\0\5\11"+
    "\4\0\1\11\1\0\21\11\1\162\1\0\1\11\17\0"+
    "\5\11\4\0\1\11\1\0\16\11\1\163\3\11\1\0"+
    "\1\11\17\0\5\11\4\0\1\11\1\0\17\11\1\164"+
    "\2\11\1\0\1\11\17\0\5\11";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3818];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\26\1\12\11\5\1\1\0\20\1\2\0"+
    "\1\11\2\0\1\1\1\0\24\1\1\0\40\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[116];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _GlagolLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _GlagolLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return com.intellij.psi.TokenType.BAD_CHARACTER;
            }
          case 38: break;
          case 2: 
            { return com.intellij.psi.TokenType.WHITE_SPACE;
            }
          case 39: break;
          case 3: 
            { return G_COLON;
            }
          case 40: break;
          case 4: 
            { return G_INT;
            }
          case 41: break;
          case 5: 
            { return G_ARTIFACT_ID;
            }
          case 42: break;
          case 6: 
            { return G_ALPHA;
            }
          case 43: break;
          case 7: 
            { return G_ID;
            }
          case 44: break;
          case 8: 
            { return G_OP_EQ;
            }
          case 45: break;
          case 9: 
            { return G_SEMICOLON;
            }
          case 46: break;
          case 10: 
            { return G_COMMA;
            }
          case 47: break;
          case 11: 
            { return G_LEFT_BRACE;
            }
          case 48: break;
          case 12: 
            { return G_RIGHT_BRACE;
            }
          case 49: break;
          case 13: 
            { return G_LEFT_BRACKET;
            }
          case 50: break;
          case 14: 
            { return G_RIGHT_BRACKET;
            }
          case 51: break;
          case 15: 
            { return G_LEFT_PAREN;
            }
          case 52: break;
          case 16: 
            { return G_RIGHT_PAREN;
            }
          case 53: break;
          case 17: 
            { return G_AT;
            }
          case 54: break;
          case 18: 
            { return G_KW_ALIAS;
            }
          case 55: break;
          case 19: 
            { return G_STRING;
            }
          case 56: break;
          case 20: 
            { return G_LINE_COMMENT;
            }
          case 57: break;
          case 21: 
            { return G_DECIMAL;
            }
          case 58: break;
          case 22: 
            { return G_ACCESS_OPTION;
            }
          case 59: break;
          case 23: 
            { return G_KW_IMPORT;
            }
          case 60: break;
          case 24: 
            { return G_REL_DIR;
            }
          case 61: break;
          case 25: 
            { return G_TYPE_INT;
            }
          case 62: break;
          case 26: 
            { return G_BOOLEAN;
            }
          case 63: break;
          case 27: 
            { return G_KW_FROM;
            }
          case 64: break;
          case 28: 
            { return G_BLOCK_COMMENT;
            }
          case 65: break;
          case 29: 
            { return G_KW_WITH;
            }
          case 66: break;
          case 30: 
            { return G_TYPE_BOOL;
            }
          case 67: break;
          case 31: 
            { return G_TYPE_FLOAT;
            }
          case 68: break;
          case 32: 
            { return G_KW_VALUE;
            }
          case 69: break;
          case 33: 
            { return G_TYPE_STRING;
            }
          case 70: break;
          case 34: 
            { return G_KW_ENTITY;
            }
          case 71: break;
          case 35: 
            { return G_KW_MODULE;
            }
          case 72: break;
          case 36: 
            { return G_KW_PRIMARY;
            }
          case 73: break;
          case 37: 
            { return G_KW_REL;
            }
          case 74: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
