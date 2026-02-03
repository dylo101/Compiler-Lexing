package
parse
;
import
java
.
util
.
List
;
import
errorMsg
.
*
;
public class TokenGrammarParseTable implements wrangLR.runtime.ParseTable {
public int getEofSym() { return 170; }
public int getNttSym() { return 171; }
private String[] symNameTable = {
"$$start",
"start",
"white*",
"$$0",
"token",
"`boolean",
"`class",
"`extends",
"`void",
"`int",
"`while",
"`if",
"`else",
"`for",
"`break",
"`this",
"`false",
"`true",
"`super",
"`null",
"`return",
"`instanceof",
"`new",
"`abstract",
"`assert",
"`byte",
"`case",
"`catch",
"`char",
"`const",
"`continue",
"`default",
"`do",
"`double",
"`enum",
"`final",
"`finally",
"`float",
"`goto",
"`implements",
"`import",
"`interface",
"`long",
"`native",
"`package",
"`private",
"`protected",
"`public",
"`short",
"`static",
"`strictfp",
"`switch",
"`synchronized",
"`throw",
"`throws",
"`transient",
"`try",
"`volatile",
"`!",
"`!=",
"`%",
"`&&",
"`*",
"`(",
"`)",
"`{",
"`}",
"`-",
"`+",
"`=",
"`==",
"`[",
"`]",
"`||",
"`<",
"`<=",
"`,",
"`>",
"`>=",
"`.",
"`;",
"`++",
"`--",
"`/",
"`:",
"ID",
"INT_LITERAL",
"STRING_LITERAL",
"CHAR_LITERAL",
"\"c\"",
"\"l\"",
"\"a\"",
"\"s\"",
"idChar",
"reserved",
"\"e\"",
"\"!\"",
"\"=\"",
"\"+\"",
"digit++",
"letter",
"digit",
"\"_\"",
"\"d\"",
"\"g\"",
"\"m\"",
"\"p\"",
"\"v\"",
"\"y\"",
"{\"A\"..\"Z\" \"j\" \"q\"}",
"\"f\"",
"\"i\"",
"\"o\"",
"\"r\"",
"\"u\"",
"\"x\"",
"\"b\"",
"\"h\"",
"\"k\"",
"\"n\"",
"\"t\"",
"\"w\"",
"\"z\"",
"{\"0\"..\"9\"}",
"white",
"\" \"",
"{9 12}",
"eol",
"singleLineComment",
"multiLineComment",
"10",
"13",
"printable",
"\"[\"",
"\"-\"",
"\"<\"",
"\"|\"",
"\"&\"",
"\")\"",
"\",\"",
"\"]\"",
"\"/\"",
"\";\"",
"\">\"",
"\"{\"",
"\"%\"",
"\"(\"",
"\"\\\"",
"\".\"",
"\":\"",
"{\"#\"..\"$\" \"?\"..\"@\" \"^\" \"`\" \"~\"}",
"\"}\"",
"\"\'\"",
"\'\"\'",
"\"*\"",
"idChar**",
"$$1",
"stringChar",
"stringChar*",
"$$2",
"commentChar",
"comment",
"commentChar**",
"multiCommentChar",
"multiCommentChar**",
"token*",
"commentChar*",
"digit+",
"idChar*",
"multiCommentChar*",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private TokenGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 172;}
private static final int MIN_REDUCTION = 1332;
public int minReduction() { return MIN_REDUCTION;}
private static final int MAX_ACCEPT_REDUCTION = MIN_REDUCTION+1;
public int maxAcceptReduction() { return MAX_ACCEPT_REDUCTION; }
private final int[][] parseTable;
public void error(int pos, String msg){
 if (((Object)actionObject) instanceof wrangLR.runtime.MessageObject)
 ((wrangLR.runtime.MessageObject)(Object)actionObject).error(pos,msg);
 else System.err.println("file position "+pos+": "+msg);}
public void warning(int pos, String msg){
 if (((Object)actionObject) instanceof wrangLR.runtime.MessageObject)
 ((wrangLR.runtime.MessageObject)(Object)actionObject).warning(pos,msg);
 else System.err.println("file position "+pos+"(warning): "+msg);}
public String filePosString(int pos){
 if (((Object)actionObject) instanceof wrangLR.runtime.FilePosObject)
 return ((wrangLR.runtime.FilePosObject)(Object)actionObject).filePosString(pos);
 else return ""+pos;}
public boolean parse(java.io.InputStream is) {
	return new wrangLR.runtime.BaseParser(this).parse(is);
}
public boolean parse(java.io.InputStream is, int verboseLevel, boolean verboseReductions) {
	return new wrangLR.runtime.BaseParser(this,verboseLevel,verboseReductions).parse(is);
}
private class Initter1{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 0
0x80000000|980, // match move
0x80000000|770, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 1
  }
,
{ // state 2
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 3
0x80000000|94, // match move
0x80000000|1080, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 4
-1, // $$start
-1, // start
713, // white*
-1, // $$0
MIN_REDUCTION+149, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
-1, // `=
-1, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
MIN_REDUCTION+149, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+149, // $
-1, // $NT
  }
,
{ // state 5
120,614, // "t"
  }
,
{ // state 6
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 7
-1, // $$start
-1, // start
340, // white*
-1, // $$0
MIN_REDUCTION+151, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+151, // $
-1, // $NT
  }
,
{ // state 8
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 9
0x80000000|1, // match move
0x80000000|255, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 10
103,442, // "d"
  }
,
{ // state 11
120,883, // "t"
  }
,
{ // state 12
0x80000000|1, // match move
0x80000000|1211, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 13
171,MIN_REDUCTION+292, // $NT
  }
,
{ // state 14
0x80000000|1, // match move
0x80000000|619, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 15
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 16
2,168, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+237, // $NT
  }
,
{ // state 17
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+281, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+281, // $
-1, // $NT
  }
,
{ // state 18
0x80000000|165, // match move
0x80000000|1254, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 19
90,665, // "l"
  }
,
{ // state 20
0x80000000|1, // match move
0x80000000|514, // no-match move
// T-test match for "/":
141,
  }
,
{ // state 21
0x80000000|535, // match move
0x80000000|1015, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 22
91,1030, // "a"
  }
,
{ // state 23
0x80000000|1, // match move
0x80000000|159, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 24
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 25
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+132, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+132, // $
-1, // $NT
  }
,
{ // state 26
111,930, // "i"
  }
,
{ // state 27
2,1247, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+267, // $NT
  }
,
{ // state 28
0x80000000|1, // match move
0x80000000|621, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 29
171,MIN_REDUCTION+190, // $NT
  }
,
{ // state 30
113,381, // "r"
  }
,
{ // state 31
0x80000000|1, // match move
0x80000000|342, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 32
113,556, // "r"
  }
,
{ // state 33
-1, // $$start
-1, // start
393, // white*
-1, // $$0
MIN_REDUCTION+180, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+180, // "c"
MIN_REDUCTION+180, // "l"
MIN_REDUCTION+180, // "a"
MIN_REDUCTION+180, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+180, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+180, // "d"
MIN_REDUCTION+180, // "g"
MIN_REDUCTION+180, // "m"
MIN_REDUCTION+180, // "p"
MIN_REDUCTION+180, // "v"
MIN_REDUCTION+180, // "y"
MIN_REDUCTION+180, // {"A".."Z" "j" "q"}
MIN_REDUCTION+180, // "f"
MIN_REDUCTION+180, // "i"
MIN_REDUCTION+180, // "o"
MIN_REDUCTION+180, // "r"
MIN_REDUCTION+180, // "u"
MIN_REDUCTION+180, // "x"
MIN_REDUCTION+180, // "b"
MIN_REDUCTION+180, // "h"
MIN_REDUCTION+180, // "k"
MIN_REDUCTION+180, // "n"
MIN_REDUCTION+180, // "t"
MIN_REDUCTION+180, // "w"
MIN_REDUCTION+180, // "z"
MIN_REDUCTION+180, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+180, // $
-1, // $NT
  }
,
{ // state 34
-1, // $$start
-1, // start
1297, // white*
-1, // $$0
MIN_REDUCTION+267, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+267, // "c"
MIN_REDUCTION+267, // "l"
MIN_REDUCTION+267, // "a"
MIN_REDUCTION+267, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+267, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+267, // "d"
MIN_REDUCTION+267, // "g"
MIN_REDUCTION+267, // "m"
MIN_REDUCTION+267, // "p"
MIN_REDUCTION+267, // "v"
MIN_REDUCTION+267, // "y"
MIN_REDUCTION+267, // {"A".."Z" "j" "q"}
MIN_REDUCTION+267, // "f"
MIN_REDUCTION+267, // "i"
MIN_REDUCTION+267, // "o"
MIN_REDUCTION+267, // "r"
MIN_REDUCTION+267, // "u"
MIN_REDUCTION+267, // "x"
MIN_REDUCTION+267, // "b"
MIN_REDUCTION+267, // "h"
MIN_REDUCTION+267, // "k"
MIN_REDUCTION+267, // "n"
MIN_REDUCTION+267, // "t"
MIN_REDUCTION+267, // "w"
MIN_REDUCTION+267, // "z"
MIN_REDUCTION+267, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+267, // $
-1, // $NT
  }
,
{ // state 35
0x80000000|1, // match move
0x80000000|169, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 36
2,451, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+210, // $NT
  }
,
{ // state 37
95,769, // "e"
  }
,
{ // state 38
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 39
119,1050, // "n"
  }
,
{ // state 40
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 41
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 42
0x80000000|1, // match move
0x80000000|221, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 43
0x80000000|1, // match move
0x80000000|161, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 44
0x80000000|905, // match move
0x80000000|1139, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 45
0x80000000|1, // match move
0x80000000|162, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 46
171,MIN_REDUCTION+187, // $NT
  }
,
{ // state 47
120,610, // "t"
  }
,
{ // state 48
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+170, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+170, // $
-1, // $NT
  }
,
{ // state 49
92,1287, // "s"
120,316, // "t"
  }
,
{ // state 50
2,833, // white*
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 51
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+164, // $NT
  }
,
{ // state 52
104,43, // "g"
  }
,
{ // state 53
0x80000000|64, // match move
0x80000000|267, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 54
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 55
105,919, // "m"
110,761, // "f"
119,129, // "n"
  }
,
{ // state 56
171,MIN_REDUCTION+274, // $NT
  }
,
{ // state 57
154,463, // "*"
  }
,
{ // state 58
2,801, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+222, // $NT
  }
,
{ // state 59
-1, // $$start
-1, // start
530, // white*
-1, // $$0
MIN_REDUCTION+186, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+186, // "c"
MIN_REDUCTION+186, // "l"
MIN_REDUCTION+186, // "a"
MIN_REDUCTION+186, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+186, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+186, // "d"
MIN_REDUCTION+186, // "g"
MIN_REDUCTION+186, // "m"
MIN_REDUCTION+186, // "p"
MIN_REDUCTION+186, // "v"
MIN_REDUCTION+186, // "y"
MIN_REDUCTION+186, // {"A".."Z" "j" "q"}
MIN_REDUCTION+186, // "f"
MIN_REDUCTION+186, // "i"
MIN_REDUCTION+186, // "o"
MIN_REDUCTION+186, // "r"
MIN_REDUCTION+186, // "u"
MIN_REDUCTION+186, // "x"
MIN_REDUCTION+186, // "b"
MIN_REDUCTION+186, // "h"
MIN_REDUCTION+186, // "k"
MIN_REDUCTION+186, // "n"
MIN_REDUCTION+186, // "t"
MIN_REDUCTION+186, // "w"
MIN_REDUCTION+186, // "z"
MIN_REDUCTION+186, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+186, // $
-1, // $NT
  }
,
{ // state 60
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 61
91,772, // "a"
  }
,
{ // state 62
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 63
0x80000000|328, // match move
0x80000000|1179, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 64
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 65
89,1159, // "c"
90,1159, // "l"
91,1159, // "a"
92,1159, // "s"
95,1159, // "e"
100,1268, // letter
101,494, // digit
102,325, // "_"
103,1159, // "d"
104,1159, // "g"
105,1159, // "m"
106,1159, // "p"
107,1159, // "v"
108,1159, // "y"
109,1159, // {"A".."Z" "j" "q"}
110,1159, // "f"
111,1159, // "i"
112,1159, // "o"
113,1159, // "r"
114,1159, // "u"
115,1159, // "x"
116,1159, // "b"
117,1159, // "h"
118,1159, // "k"
119,1159, // "n"
120,1159, // "t"
121,1159, // "w"
122,1159, // "z"
123,510, // {"0".."9"}
  }
,
{ // state 66
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 67
154,455, // "*"
163,726, // multiCommentChar
  }
,
{ // state 68
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+203, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+203, // $
-1, // $NT
  }
,
{ // state 69
106,520, // "p"
  }
,
{ // state 70
-1, // $$start
-1, // start
666, // white*
-1, // $$0
MIN_REDUCTION+98, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
-1, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
-1, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
MIN_REDUCTION+98, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+98, // $
-1, // $NT
  }
,
{ // state 71
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 72
110,358, // "f"
  }
,
{ // state 73
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 74
111,1093, // "i"
  }
,
{ // state 75
-1, // $$start
-1, // start
80, // white*
-1, // $$0
MIN_REDUCTION+237, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+237, // "c"
MIN_REDUCTION+237, // "l"
MIN_REDUCTION+237, // "a"
MIN_REDUCTION+237, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+237, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+237, // "d"
MIN_REDUCTION+237, // "g"
MIN_REDUCTION+237, // "m"
MIN_REDUCTION+237, // "p"
MIN_REDUCTION+237, // "v"
MIN_REDUCTION+237, // "y"
MIN_REDUCTION+237, // {"A".."Z" "j" "q"}
MIN_REDUCTION+237, // "f"
MIN_REDUCTION+237, // "i"
MIN_REDUCTION+237, // "o"
MIN_REDUCTION+237, // "r"
MIN_REDUCTION+237, // "u"
MIN_REDUCTION+237, // "x"
MIN_REDUCTION+237, // "b"
MIN_REDUCTION+237, // "h"
MIN_REDUCTION+237, // "k"
MIN_REDUCTION+237, // "n"
MIN_REDUCTION+237, // "t"
MIN_REDUCTION+237, // "w"
MIN_REDUCTION+237, // "z"
MIN_REDUCTION+237, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+237, // $
-1, // $NT
  }
,
{ // state 76
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 77
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+257, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+257, // $
-1, // $NT
  }
,
{ // state 78
171,MIN_REDUCTION+184, // $NT
  }
,
{ // state 79
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+299, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+299, // $
-1, // $NT
  }
,
{ // state 80
0x80000000|640, // match move
0x80000000|234, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 81
0x80000000|422, // match move
0x80000000|88, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 82
92,1022, // "s"
  }
,
{ // state 83
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 84
171,MIN_REDUCTION+166, // $NT
  }
,
{ // state 85
154,836, // "*"
  }
,
{ // state 86
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 87
154,738, // "*"
  }
,
{ // state 88
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+269, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+269, // $
-1, // $NT
  }
,
{ // state 89
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+212, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+212, // $
-1, // $NT
  }
,
{ // state 90
119,1305, // "n"
  }
,
{ // state 91
-1, // $$start
-1, // start
479, // white*
-1, // $$0
MIN_REDUCTION+222, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+222, // "c"
MIN_REDUCTION+222, // "l"
MIN_REDUCTION+222, // "a"
MIN_REDUCTION+222, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+222, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+222, // "d"
MIN_REDUCTION+222, // "g"
MIN_REDUCTION+222, // "m"
MIN_REDUCTION+222, // "p"
MIN_REDUCTION+222, // "v"
MIN_REDUCTION+222, // "y"
MIN_REDUCTION+222, // {"A".."Z" "j" "q"}
MIN_REDUCTION+222, // "f"
MIN_REDUCTION+222, // "i"
MIN_REDUCTION+222, // "o"
MIN_REDUCTION+222, // "r"
MIN_REDUCTION+222, // "u"
MIN_REDUCTION+222, // "x"
MIN_REDUCTION+222, // "b"
MIN_REDUCTION+222, // "h"
MIN_REDUCTION+222, // "k"
MIN_REDUCTION+222, // "n"
MIN_REDUCTION+222, // "t"
MIN_REDUCTION+222, // "w"
MIN_REDUCTION+222, // "z"
MIN_REDUCTION+222, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+222, // $
-1, // $NT
  }
,
{ // state 92
105,284, // "m"
110,526, // "f"
119,49, // "n"
  }
,
{ // state 93
91,892, // "a"
  }
,
{ // state 94
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 95
0x80000000|1, // match move
0x80000000|36, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 96
0x80000000|1, // match move
0x80000000|423, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 97
111,574, // "i"
  }
,
{ // state 98
0x80000000|858, // match move
0x80000000|529, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 99
89,1108, // "c"
90,1108, // "l"
91,1108, // "a"
92,1108, // "s"
93,116, // idChar
95,1108, // "e"
100,313, // letter
101,548, // digit
102,369, // "_"
103,1108, // "d"
104,1108, // "g"
105,1108, // "m"
106,1108, // "p"
107,1108, // "v"
108,1108, // "y"
109,1108, // {"A".."Z" "j" "q"}
110,1108, // "f"
111,1108, // "i"
112,1108, // "o"
113,1108, // "r"
114,1108, // "u"
115,1108, // "x"
116,1108, // "b"
117,1108, // "h"
118,1108, // "k"
119,1108, // "n"
120,1108, // "t"
121,1108, // "w"
122,1108, // "z"
123,98, // {"0".."9"}
  }
,
{ // state 100
-1, // $$start
-1, // start
431, // white*
-1, // $$0
MIN_REDUCTION+252, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+252, // "c"
MIN_REDUCTION+252, // "l"
MIN_REDUCTION+252, // "a"
MIN_REDUCTION+252, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+252, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+252, // "d"
MIN_REDUCTION+252, // "g"
MIN_REDUCTION+252, // "m"
MIN_REDUCTION+252, // "p"
MIN_REDUCTION+252, // "v"
MIN_REDUCTION+252, // "y"
MIN_REDUCTION+252, // {"A".."Z" "j" "q"}
MIN_REDUCTION+252, // "f"
MIN_REDUCTION+252, // "i"
MIN_REDUCTION+252, // "o"
MIN_REDUCTION+252, // "r"
MIN_REDUCTION+252, // "u"
MIN_REDUCTION+252, // "x"
MIN_REDUCTION+252, // "b"
MIN_REDUCTION+252, // "h"
MIN_REDUCTION+252, // "k"
MIN_REDUCTION+252, // "n"
MIN_REDUCTION+252, // "t"
MIN_REDUCTION+252, // "w"
MIN_REDUCTION+252, // "z"
MIN_REDUCTION+252, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+252, // $
-1, // $NT
  }
,
{ // state 101
107,841, // "v"
  }
,
{ // state 102
113,356, // "r"
  }
,
{ // state 103
123,510, // {"0".."9"}
  }
,
{ // state 104
0x80000000|1, // match move
0x80000000|236, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 105
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 106
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 107
171,MIN_REDUCTION+286, // $NT
  }
,
{ // state 108
0x80000000|1290, // match move
0x80000000|312, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 109
2,257, // white*
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 110
0x80000000|1, // match move
0x80000000|27, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 111
0x80000000|406, // match move
0x80000000|142, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 112
0x80000000|1283, // match move
0x80000000|120, // no-match move
0x80000000|511, // NT-test-match state for commentChar
  }
,
{ // state 113
89,1012, // "c"
  }
,
{ // state 114
119,467, // "n"
  }
,
{ // state 115
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+296, // $NT
  }
,
{ // state 116
0x80000000|1167, // match move
0x80000000|359, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 117
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 118
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 119
0x80000000|1, // match move
0x80000000|1032, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 120
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 121
2,115, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+297, // $NT
  }
,
{ // state 122
0x80000000|1133, // match move
0x80000000|1027, // no-match move
// T-test match for "=":
97,
  }
,
{ // state 123
0x80000000|1171, // match move
0x80000000|388, // no-match move
0x80000000|511, // NT-test-match state for commentChar
  }
,
{ // state 124
89,707, // "c"
  }
,
{ // state 125
119,962, // "n"
  }
,
{ // state 126
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 127
0x80000000|293, // match move
0x80000000|1281, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 128
92,889, // "s"
  }
,
{ // state 129
92,145, // "s"
120,745, // "t"
  }
,
{ // state 130
120,436, // "t"
  }
,
{ // state 131
2,819, // white*
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 132
91,730, // "a"
  }
,
{ // state 133
104,14, // "g"
  }
,
{ // state 134
171,MIN_REDUCTION+107, // $NT
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 135
171,MIN_REDUCTION+265, // $NT
  }
,
{ // state 136
120,697, // "t"
  }
,
{ // state 137
89,778, // "c"
  }
,
{ // state 138
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 139
95,28, // "e"
  }
,
{ // state 140
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 141
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 142
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+314, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+314, // $
-1, // $NT
  }
,
{ // state 143
0x80000000|329, // match move
0x80000000|1116, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 144
116,903, // "b"
  }
,
{ // state 145
120,1240, // "t"
  }
,
{ // state 146
95,72, // "e"
112,719, // "o"
  }
,
{ // state 147
119,457, // "n"
  }
,
{ // state 148
0x80000000|686, // match move
0x80000000|875, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 149
0x80000000|835, // match move
0x80000000|449, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 150
0x80000000|306, // match move
0x80000000|68, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 151
162,647, // commentChar**
166,123, // commentChar*
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 152
171,MIN_REDUCTION+235, // $NT
  }
,
{ // state 153
112,580, // "o"
  }
,
{ // state 154
120,1135, // "t"
  }
,
{ // state 155
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+182, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+182, // $
-1, // $NT
  }
,
{ // state 156
95,815, // "e"
  }
,
{ // state 157
2,1001, // white*
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 158
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 159
-1, // $$start
-1, // start
853, // white*
-1, // $$0
MIN_REDUCTION+213, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+213, // "c"
MIN_REDUCTION+213, // "l"
MIN_REDUCTION+213, // "a"
MIN_REDUCTION+213, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+213, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+213, // "d"
MIN_REDUCTION+213, // "g"
MIN_REDUCTION+213, // "m"
MIN_REDUCTION+213, // "p"
MIN_REDUCTION+213, // "v"
MIN_REDUCTION+213, // "y"
MIN_REDUCTION+213, // {"A".."Z" "j" "q"}
MIN_REDUCTION+213, // "f"
MIN_REDUCTION+213, // "i"
MIN_REDUCTION+213, // "o"
MIN_REDUCTION+213, // "r"
MIN_REDUCTION+213, // "u"
MIN_REDUCTION+213, // "x"
MIN_REDUCTION+213, // "b"
MIN_REDUCTION+213, // "h"
MIN_REDUCTION+213, // "k"
MIN_REDUCTION+213, // "n"
MIN_REDUCTION+213, // "t"
MIN_REDUCTION+213, // "w"
MIN_REDUCTION+213, // "z"
MIN_REDUCTION+213, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+213, // $
-1, // $NT
  }
,
{ // state 160
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 161
-1, // $$start
-1, // start
81, // white*
-1, // $$0
MIN_REDUCTION+270, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+270, // "c"
MIN_REDUCTION+270, // "l"
MIN_REDUCTION+270, // "a"
MIN_REDUCTION+270, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+270, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+270, // "d"
MIN_REDUCTION+270, // "g"
MIN_REDUCTION+270, // "m"
MIN_REDUCTION+270, // "p"
MIN_REDUCTION+270, // "v"
MIN_REDUCTION+270, // "y"
MIN_REDUCTION+270, // {"A".."Z" "j" "q"}
MIN_REDUCTION+270, // "f"
MIN_REDUCTION+270, // "i"
MIN_REDUCTION+270, // "o"
MIN_REDUCTION+270, // "r"
MIN_REDUCTION+270, // "u"
MIN_REDUCTION+270, // "x"
MIN_REDUCTION+270, // "b"
MIN_REDUCTION+270, // "h"
MIN_REDUCTION+270, // "k"
MIN_REDUCTION+270, // "n"
MIN_REDUCTION+270, // "t"
MIN_REDUCTION+270, // "w"
MIN_REDUCTION+270, // "z"
MIN_REDUCTION+270, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+270, // $
-1, // $NT
  }
,
{ // state 162
-1, // $$start
-1, // start
111, // white*
-1, // $$0
MIN_REDUCTION+315, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+315, // "c"
MIN_REDUCTION+315, // "l"
MIN_REDUCTION+315, // "a"
MIN_REDUCTION+315, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+315, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+315, // "d"
MIN_REDUCTION+315, // "g"
MIN_REDUCTION+315, // "m"
MIN_REDUCTION+315, // "p"
MIN_REDUCTION+315, // "v"
MIN_REDUCTION+315, // "y"
MIN_REDUCTION+315, // {"A".."Z" "j" "q"}
MIN_REDUCTION+315, // "f"
MIN_REDUCTION+315, // "i"
MIN_REDUCTION+315, // "o"
MIN_REDUCTION+315, // "r"
MIN_REDUCTION+315, // "u"
MIN_REDUCTION+315, // "x"
MIN_REDUCTION+315, // "b"
MIN_REDUCTION+315, // "h"
MIN_REDUCTION+315, // "k"
MIN_REDUCTION+315, // "n"
MIN_REDUCTION+315, // "t"
MIN_REDUCTION+315, // "w"
MIN_REDUCTION+315, // "z"
MIN_REDUCTION+315, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+315, // $
-1, // $NT
  }
,
{ // state 163
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+97, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+97, // $
-1, // $NT
  }
,
{ // state 164
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 165
2,810, // white*
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 166
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 167
-1, // $$start
-1, // start
534, // white*
-1, // $$0
MIN_REDUCTION+135, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+135, // $
-1, // $NT
  }
,
{ // state 168
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+236, // $NT
  }
,
{ // state 169
-1, // $$start
-1, // start
1223, // white*
-1, // $$0
MIN_REDUCTION+300, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+300, // "c"
MIN_REDUCTION+300, // "l"
MIN_REDUCTION+300, // "a"
MIN_REDUCTION+300, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+300, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+300, // "d"
MIN_REDUCTION+300, // "g"
MIN_REDUCTION+300, // "m"
MIN_REDUCTION+300, // "p"
MIN_REDUCTION+300, // "v"
MIN_REDUCTION+300, // "y"
MIN_REDUCTION+300, // {"A".."Z" "j" "q"}
MIN_REDUCTION+300, // "f"
MIN_REDUCTION+300, // "i"
MIN_REDUCTION+300, // "o"
MIN_REDUCTION+300, // "r"
MIN_REDUCTION+300, // "u"
MIN_REDUCTION+300, // "x"
MIN_REDUCTION+300, // "b"
MIN_REDUCTION+300, // "h"
MIN_REDUCTION+300, // "k"
MIN_REDUCTION+300, // "n"
MIN_REDUCTION+300, // "t"
MIN_REDUCTION+300, // "w"
MIN_REDUCTION+300, // "z"
MIN_REDUCTION+300, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+300, // $
-1, // $NT
  }
,
{ // state 170
95,1045, // "e"
  }
,
{ // state 171
117,357, // "h"
  }
,
{ // state 172
0x80000000|1193, // match move
0x80000000|256, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 173
0x80000000|583, // match move
0x80000000|1228, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 174
95,1263, // "e"
  }
,
{ // state 175
103,764, // "d"
  }
,
{ // state 176
0x80000000|1, // match move
0x80000000|493, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 177
120,1141, // "t"
  }
,
{ // state 178
114,768, // "u"
  }
,
{ // state 179
171,MIN_REDUCTION+244, // $NT
  }
,
{ // state 180
0x80000000|1, // match move
0x80000000|20, // no-match move
// T-test match for "*":
154,
  }
,
{ // state 181
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 182
95,12, // "e"
  }
,
{ // state 183
130,667, // {10}
  }
,
{ // state 184
0x80000000|504, // match move
0x80000000|1330, // no-match move
// T-test match for '"':
153,
  }
,
{ // state 185
2,981, // white*
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 186
2,1035, // white*
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 187
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+209, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+209, // $
-1, // $NT
  }
};
}
private class Initter2{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 188
0x80000000|1250, // match move
0x80000000|404, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 189
4,402, // token
58,1252, // `!
59,196, // `!=
60,411, // `%
61,324, // `&&
62,190, // `*
63,600, // `(
64,140, // `)
65,569, // `{
66,533, // `}
67,714, // `-
68,367, // `+
69,228, // `=
70,754, // `==
71,1164, // `[
72,849, // `]
73,1129, // `||
74,593, // `<
75,206, // `<=
76,985, // `,
77,1010, // `>
78,427, // `>=
79,687, // `.
80,605, // `;
81,181, // `++
82,1256, // `--
83,465, // `/
84,73, // `:
85,1251, // ID
86,397, // INT_LITERAL
87,906, // STRING_LITERAL
88,240, // CHAR_LITERAL
89,498, // "c"
90,498, // "l"
91,498, // "a"
92,498, // "s"
95,498, // "e"
96,122, // "!"
97,1067, // "="
98,1232, // "+"
99,237, // digit++
100,472, // letter
101,264, // digit
103,498, // "d"
104,498, // "g"
105,498, // "m"
106,498, // "p"
107,498, // "v"
108,498, // "y"
109,498, // {"A".."Z" "j" "q"}
110,498, // "f"
111,498, // "i"
112,498, // "o"
113,498, // "r"
114,498, // "u"
115,498, // "x"
116,498, // "b"
117,498, // "h"
118,498, // "k"
119,498, // "n"
120,498, // "t"
121,498, // "w"
122,498, // "z"
123,543, // {"0".."9"}
133,1284, // "["
134,492, // "-"
135,246, // "<"
136,354, // "|"
137,715, // "&"
138,499, // ")"
139,1235, // ","
140,711, // "]"
141,180, // "/"
142,260, // ";"
143,724, // ">"
144,986, // "{"
145,731, // "%"
146,668, // "("
148,149, // "."
149,172, // ":"
151,1213, // "}"
152,1092, // "'"
153,636, // '"'
154,964, // "*"
167,793, // digit+
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 190
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 191
117,1304, // "h"
  }
,
{ // state 192
103,9, // "d"
  }
,
{ // state 193
171,MIN_REDUCTION+91, // $NT
  }
,
{ // state 194
90,597, // "l"
91,918, // "a"
112,675, // "o"
117,433, // "h"
  }
,
{ // state 195
95,110, // "e"
  }
,
{ // state 196
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 197
0x80000000|1, // match move
0x80000000|474, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 198
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 199
95,956, // "e"
  }
,
{ // state 200
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 201
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 202
120,104, // "t"
  }
,
{ // state 203
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+266, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+266, // $
-1, // $NT
  }
,
{ // state 204
119,1315, // "n"
  }
,
{ // state 205
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+248, // $NT
  }
,
{ // state 206
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 207
4,402, // token
5,1155, // `boolean
6,224, // `class
7,322, // `extends
8,894, // `void
9,936, // `int
10,1274, // `while
11,166, // `if
12,201, // `else
13,765, // `for
14,473, // `break
15,1070, // `this
16,1198, // `false
17,1033, // `true
18,141, // `super
19,755, // `null
20,1162, // `return
21,1123, // `instanceof
22,565, // `new
23,929, // `abstract
24,760, // `assert
25,799, // `byte
26,117, // `case
27,1291, // `catch
28,570, // `char
29,751, // `const
30,1078, // `continue
31,661, // `default
32,1042, // `do
33,461, // `double
34,160, // `enum
35,988, // `final
36,1002, // `finally
37,334, // `float
38,443, // `goto
39,784, // `implements
40,939, // `import
41,633, // `interface
42,412, // `long
43,40, // `native
44,1328, // `package
45,1282, // `private
46,1191, // `protected
47,718, // `public
48,864, // `short
49,688, // `static
50,1100, // `strictfp
51,126, // `switch
52,86, // `synchronized
53,314, // `throw
54,1248, // `throws
55,708, // `transient
56,1138, // `try
57,1292, // `volatile
89,376, // "c"
90,245, // "l"
91,1174, // "a"
92,1106, // "s"
95,1168, // "e"
103,1156, // "d"
104,975, // "g"
106,1130, // "p"
107,1271, // "v"
110,882, // "f"
111,92, // "i"
113,587, // "r"
116,1215, // "b"
119,564, // "n"
120,219, // "t"
121,854, // "w"
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 208
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 209
0x80000000|1, // match move
0x80000000|969, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 210
89,789, // "c"
  }
,
{ // state 211
106,945, // "p"
  }
,
{ // state 212
2,1128, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+282, // $NT
  }
,
{ // state 213
130,1210, // {10}
  }
,
{ // state 214
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+260, // $NT
  }
,
{ // state 215
-1, // $$start
-1, // start
812, // white*
-1, // $$0
MIN_REDUCTION+141, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+141, // $
-1, // $NT
  }
,
{ // state 216
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 217
0x80000000|332, // match move
0x80000000|1182, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 218
153,880, // '"'
159,973, // $$2
  }
,
{ // state 219
113,475, // "r"
117,302, // "h"
  }
,
{ // state 220
89,8, // "c"
90,8, // "l"
91,8, // "a"
92,8, // "s"
95,8, // "e"
96,8, // "!"
97,8, // "="
98,8, // "+"
102,8, // "_"
103,8, // "d"
104,8, // "g"
105,8, // "m"
106,8, // "p"
107,8, // "v"
108,8, // "y"
109,8, // {"A".."Z" "j" "q"}
110,8, // "f"
111,8, // "i"
112,8, // "o"
113,8, // "r"
114,8, // "u"
115,8, // "x"
116,8, // "b"
117,8, // "h"
118,8, // "k"
119,8, // "n"
120,8, // "t"
121,8, // "w"
122,8, // "z"
123,8, // {"0".."9"}
125,8, // " "
132,1018, // printable
133,8, // "["
134,8, // "-"
135,8, // "<"
136,8, // "|"
137,8, // "&"
138,8, // ")"
139,8, // ","
140,8, // "]"
141,8, // "/"
142,8, // ";"
143,8, // ">"
144,8, // "{"
145,8, // "%"
146,8, // "("
147,8, // "\"
148,8, // "."
149,8, // ":"
150,8, // {"#".."$" "?".."@" "^" "`" "~"}
151,8, // "}"
152,8, // "'"
153,8, // '"'
154,8, // "*"
163,726, // multiCommentChar
  }
,
{ // state 221
-1, // $$start
-1, // start
676, // white*
-1, // $$0
MIN_REDUCTION+312, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+312, // "c"
MIN_REDUCTION+312, // "l"
MIN_REDUCTION+312, // "a"
MIN_REDUCTION+312, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+312, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+312, // "d"
MIN_REDUCTION+312, // "g"
MIN_REDUCTION+312, // "m"
MIN_REDUCTION+312, // "p"
MIN_REDUCTION+312, // "v"
MIN_REDUCTION+312, // "y"
MIN_REDUCTION+312, // {"A".."Z" "j" "q"}
MIN_REDUCTION+312, // "f"
MIN_REDUCTION+312, // "i"
MIN_REDUCTION+312, // "o"
MIN_REDUCTION+312, // "r"
MIN_REDUCTION+312, // "u"
MIN_REDUCTION+312, // "x"
MIN_REDUCTION+312, // "b"
MIN_REDUCTION+312, // "h"
MIN_REDUCTION+312, // "k"
MIN_REDUCTION+312, // "n"
MIN_REDUCTION+312, // "t"
MIN_REDUCTION+312, // "w"
MIN_REDUCTION+312, // "z"
MIN_REDUCTION+312, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+312, // $
-1, // $NT
  }
,
{ // state 222
91,1090, // "a"
  }
,
{ // state 223
90,1185, // "l"
  }
,
{ // state 224
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 225
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+230, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+230, // $
-1, // $NT
  }
,
{ // state 226
0x80000000|1, // match move
0x80000000|58, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 227
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+305, // $NT
  }
,
{ // state 228
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 229
112,788, // "o"
  }
,
{ // state 230
0x80000000|1, // match move
0x80000000|212, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 231
95,965, // "e"
  }
,
{ // state 232
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 233
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 234
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+236, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+236, // $
-1, // $NT
  }
,
{ // state 235
120,800, // "t"
  }
,
{ // state 236
-1, // $$start
-1, // start
974, // white*
-1, // $$0
MIN_REDUCTION+309, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+309, // "c"
MIN_REDUCTION+309, // "l"
MIN_REDUCTION+309, // "a"
MIN_REDUCTION+309, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+309, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+309, // "d"
MIN_REDUCTION+309, // "g"
MIN_REDUCTION+309, // "m"
MIN_REDUCTION+309, // "p"
MIN_REDUCTION+309, // "v"
MIN_REDUCTION+309, // "y"
MIN_REDUCTION+309, // {"A".."Z" "j" "q"}
MIN_REDUCTION+309, // "f"
MIN_REDUCTION+309, // "i"
MIN_REDUCTION+309, // "o"
MIN_REDUCTION+309, // "r"
MIN_REDUCTION+309, // "u"
MIN_REDUCTION+309, // "x"
MIN_REDUCTION+309, // "b"
MIN_REDUCTION+309, // "h"
MIN_REDUCTION+309, // "k"
MIN_REDUCTION+309, // "n"
MIN_REDUCTION+309, // "t"
MIN_REDUCTION+309, // "w"
MIN_REDUCTION+309, // "z"
MIN_REDUCTION+309, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+309, // $
-1, // $NT
  }
,
{ // state 237
0x80000000|1071, // match move
0x80000000|746, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 238
92,539, // "s"
  }
,
{ // state 239
-1, // $$start
-1, // start
1044, // white*
-1, // $$0
MIN_REDUCTION+207, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+207, // "c"
MIN_REDUCTION+207, // "l"
MIN_REDUCTION+207, // "a"
MIN_REDUCTION+207, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+207, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+207, // "d"
MIN_REDUCTION+207, // "g"
MIN_REDUCTION+207, // "m"
MIN_REDUCTION+207, // "p"
MIN_REDUCTION+207, // "v"
MIN_REDUCTION+207, // "y"
MIN_REDUCTION+207, // {"A".."Z" "j" "q"}
MIN_REDUCTION+207, // "f"
MIN_REDUCTION+207, // "i"
MIN_REDUCTION+207, // "o"
MIN_REDUCTION+207, // "r"
MIN_REDUCTION+207, // "u"
MIN_REDUCTION+207, // "x"
MIN_REDUCTION+207, // "b"
MIN_REDUCTION+207, // "h"
MIN_REDUCTION+207, // "k"
MIN_REDUCTION+207, // "n"
MIN_REDUCTION+207, // "t"
MIN_REDUCTION+207, // "w"
MIN_REDUCTION+207, // "z"
MIN_REDUCTION+207, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+207, // $
-1, // $NT
  }
,
{ // state 240
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 241
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 242
95,557, // "e"
  }
,
{ // state 243
171,MIN_REDUCTION+329, // $NT
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 244
92,344, // "s"
116,1007, // "b"
  }
,
{ // state 245
112,820, // "o"
  }
,
{ // state 246
0x80000000|1029, // match move
0x80000000|1127, // no-match move
// T-test match for "=":
97,
  }
,
{ // state 247
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 248
0x80000000|1, // match move
0x80000000|59, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 249
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+248, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+248, // $
-1, // $NT
  }
,
{ // state 250
89,1048, // "c"
90,1048, // "l"
91,1048, // "a"
92,1048, // "s"
95,1048, // "e"
96,1048, // "!"
97,1048, // "="
98,1048, // "+"
102,1048, // "_"
103,1048, // "d"
104,1048, // "g"
105,1048, // "m"
106,1048, // "p"
107,1048, // "v"
108,1048, // "y"
109,1048, // {"A".."Z" "j" "q"}
110,1048, // "f"
111,1048, // "i"
112,1048, // "o"
113,1048, // "r"
114,1048, // "u"
115,1048, // "x"
116,1048, // "b"
117,1048, // "h"
118,1048, // "k"
119,1048, // "n"
120,1048, // "t"
121,1048, // "w"
122,1048, // "z"
123,1048, // {"0".."9"}
125,1048, // " "
132,241, // printable
133,1048, // "["
134,1048, // "-"
135,1048, // "<"
136,1048, // "|"
137,1048, // "&"
138,1048, // ")"
139,1048, // ","
140,1048, // "]"
141,1048, // "/"
142,1048, // ";"
143,1048, // ">"
144,1048, // "{"
145,1048, // "%"
146,1048, // "("
147,1048, // "\"
148,1048, // "."
149,1048, // ":"
150,1048, // {"#".."$" "?".."@" "^" "`" "~"}
151,1048, // "}"
152,1048, // "'"
153,1048, // '"'
154,1048, // "*"
157,54, // stringChar
  }
,
{ // state 251
171,MIN_REDUCTION+280, // $NT
  }
,
{ // state 252
89,1064, // "c"
  }
,
{ // state 253
0x80000000|131, // match move
0x80000000|1103, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 254
111,507, // "i"
  }
,
{ // state 255
2,390, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+300, // $NT
  }
,
{ // state 256
-1, // $$start
-1, // start
127, // white*
-1, // $$0
MIN_REDUCTION+153, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+153, // $
-1, // $NT
  }
,
{ // state 257
0x80000000|685, // match move
0x80000000|756, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 258
89,741, // "c"
  }
,
{ // state 259
0x80000000|1, // match move
0x80000000|282, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 260
0x80000000|1014, // match move
0x80000000|828, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 261
0x80000000|1, // match move
0x80000000|331, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 262
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 263
141,429, // "/"
  }
,
{ // state 264
0x80000000|1163, // match move
0x80000000|1096, // no-match move
0x80000000|103, // NT-test-match state for digit
  }
,
{ // state 265
0x80000000|1307, // match move
0x80000000|1051, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 266
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 267
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+215, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+215, // $
-1, // $NT
  }
,
{ // state 268
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 269
90,897, // "l"
  }
,
{ // state 270
120,1180, // "t"
  }
,
{ // state 271
91,368, // "a"
95,940, // "e"
114,705, // "u"
  }
,
{ // state 272
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+221, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+221, // $
-1, // $NT
  }
,
{ // state 273
89,519, // "c"
  }
,
{ // state 274
0x80000000|303, // match move
0x80000000|1095, // no-match move
0x80000000|511, // NT-test-match state for commentChar
  }
,
{ // state 275
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 276
0x80000000|949, // match move
0x80000000|456, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 277
0x80000000|1, // match move
0x80000000|346, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 278
104,547, // "g"
  }
,
{ // state 279
89,838, // "c"
  }
,
{ // state 280
95,690, // "e"
  }
,
{ // state 281
120,488, // "t"
  }
,
{ // state 282
-1, // $$start
-1, // start
541, // white*
-1, // $$0
MIN_REDUCTION+177, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+177, // "c"
MIN_REDUCTION+177, // "l"
MIN_REDUCTION+177, // "a"
MIN_REDUCTION+177, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+177, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+177, // "d"
MIN_REDUCTION+177, // "g"
MIN_REDUCTION+177, // "m"
MIN_REDUCTION+177, // "p"
MIN_REDUCTION+177, // "v"
MIN_REDUCTION+177, // "y"
MIN_REDUCTION+177, // {"A".."Z" "j" "q"}
MIN_REDUCTION+177, // "f"
MIN_REDUCTION+177, // "i"
MIN_REDUCTION+177, // "o"
MIN_REDUCTION+177, // "r"
MIN_REDUCTION+177, // "u"
MIN_REDUCTION+177, // "x"
MIN_REDUCTION+177, // "b"
MIN_REDUCTION+177, // "h"
MIN_REDUCTION+177, // "k"
MIN_REDUCTION+177, // "n"
MIN_REDUCTION+177, // "t"
MIN_REDUCTION+177, // "w"
MIN_REDUCTION+177, // "z"
MIN_REDUCTION+177, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+177, // $
-1, // $NT
  }
,
{ // state 283
0x80000000|1206, // match move
0x80000000|48, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 284
106,1207, // "p"
  }
,
{ // state 285
171,MIN_REDUCTION+111, // $NT
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 286
0x80000000|1, // match move
0x80000000|1013, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 287
-1, // $$start
-1, // start
1221, // white*
-1, // $$0
MIN_REDUCTION+147, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+147, // $
-1, // $NT
  }
,
{ // state 288
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 289
111,432, // "i"
  }
,
{ // state 290
120,209, // "t"
  }
,
{ // state 291
0x80000000|968, // match move
0x80000000|462, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 292
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+284, // $NT
  }
,
{ // state 293
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 294
95,703, // "e"
  }
,
{ // state 295
113,832, // "r"
  }
,
{ // state 296
120,1236, // "t"
  }
,
{ // state 297
105,1111, // "m"
  }
,
{ // state 298
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+89, // $NT
  }
,
{ // state 299
90,335, // "l"
112,506, // "o"
  }
,
{ // state 300
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 301
-1, // $$start
-1, // start
1188, // white*
-1, // $$0
MIN_REDUCTION+133, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
-1, // `=
-1, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
MIN_REDUCTION+133, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+133, // $
-1, // $NT
  }
,
{ // state 302
111,967, // "i"
113,341, // "r"
  }
,
{ // state 303
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 304
0x80000000|749, // match move
0x80000000|215, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 305
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 306
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 307
120,680, // "t"
  }
,
{ // state 308
89,8, // "c"
90,8, // "l"
91,8, // "a"
92,8, // "s"
95,8, // "e"
96,8, // "!"
97,8, // "="
98,8, // "+"
102,8, // "_"
103,8, // "d"
104,8, // "g"
105,8, // "m"
106,8, // "p"
107,8, // "v"
108,8, // "y"
109,8, // {"A".."Z" "j" "q"}
110,8, // "f"
111,8, // "i"
112,8, // "o"
113,8, // "r"
114,8, // "u"
115,8, // "x"
116,8, // "b"
117,8, // "h"
118,8, // "k"
119,8, // "n"
120,8, // "t"
121,8, // "w"
122,8, // "z"
123,8, // {"0".."9"}
125,8, // " "
132,1018, // printable
133,8, // "["
134,8, // "-"
135,8, // "<"
136,8, // "|"
137,8, // "&"
138,8, // ")"
139,8, // ","
140,8, // "]"
141,8, // "/"
142,8, // ";"
143,8, // ">"
144,8, // "{"
145,8, // "%"
146,8, // "("
147,8, // "\"
148,8, // "."
149,8, // ":"
150,8, // {"#".."$" "?".."@" "^" "`" "~"}
151,8, // "}"
152,8, // "'"
153,8, // '"'
154,8, // "*"
163,1219, // multiCommentChar
164,57, // multiCommentChar**
169,1181, // multiCommentChar*
  }
,
{ // state 309
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+188, // $NT
  }
,
{ // state 310
91,39, // "a"
108,717, // "y"
114,1216, // "u"
  }
,
{ // state 311
112,846, // "o"
  }
,
{ // state 312
-1, // $$start
-1, // start
736, // white*
-1, // $$0
MIN_REDUCTION+145, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+145, // $
-1, // $NT
  }
,
{ // state 313
0x80000000|996, // match move
0x80000000|164, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 314
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 315
0x80000000|970, // match move
0x80000000|721, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 316
0x80000000|1289, // match move
0x80000000|779, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 317
105,1099, // "m"
  }
,
{ // state 318
0x80000000|1, // match move
0x80000000|16, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 319
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+116, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+116, // $
-1, // $NT
  }
,
{ // state 320
103,35, // "d"
  }
,
{ // state 321
2,391, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+201, // $NT
  }
,
{ // state 322
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 323
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+287, // $NT
  }
,
{ // state 324
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 325
171,MIN_REDUCTION+103, // $NT
  }
,
{ // state 326
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+185, // $NT
  }
,
{ // state 327
0x80000000|635, // match move
0x80000000|380, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 328
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 329
3,6, // $$0
4,76, // token
5,1155, // `boolean
6,224, // `class
7,322, // `extends
8,894, // `void
9,936, // `int
10,1274, // `while
11,166, // `if
12,201, // `else
13,765, // `for
14,473, // `break
15,1070, // `this
16,1198, // `false
17,1033, // `true
18,141, // `super
19,755, // `null
20,1162, // `return
21,1123, // `instanceof
22,565, // `new
23,929, // `abstract
24,760, // `assert
25,799, // `byte
26,117, // `case
27,1291, // `catch
28,570, // `char
29,751, // `const
30,1078, // `continue
31,661, // `default
32,1042, // `do
33,461, // `double
34,160, // `enum
35,988, // `final
36,1002, // `finally
37,334, // `float
38,443, // `goto
39,784, // `implements
40,939, // `import
41,633, // `interface
42,412, // `long
43,40, // `native
44,1328, // `package
45,1282, // `private
46,1191, // `protected
47,718, // `public
48,864, // `short
49,688, // `static
50,1100, // `strictfp
51,126, // `switch
52,86, // `synchronized
53,314, // `throw
54,1248, // `throws
55,708, // `transient
56,1138, // `try
57,1292, // `volatile
89,376, // "c"
90,245, // "l"
91,1174, // "a"
92,1106, // "s"
95,1168, // "e"
103,1156, // "d"
104,975, // "g"
106,1130, // "p"
107,1271, // "v"
110,882, // "f"
111,92, // "i"
113,587, // "r"
116,1215, // "b"
119,564, // "n"
120,219, // "t"
121,854, // "w"
165,759, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 330
171,MIN_REDUCTION+250, // $NT
  }
,
{ // state 331
-1, // $$start
-1, // start
917, // white*
-1, // $$0
MIN_REDUCTION+189, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+189, // "c"
MIN_REDUCTION+189, // "l"
MIN_REDUCTION+189, // "a"
MIN_REDUCTION+189, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+189, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+189, // "d"
MIN_REDUCTION+189, // "g"
MIN_REDUCTION+189, // "m"
MIN_REDUCTION+189, // "p"
MIN_REDUCTION+189, // "v"
MIN_REDUCTION+189, // "y"
MIN_REDUCTION+189, // {"A".."Z" "j" "q"}
MIN_REDUCTION+189, // "f"
MIN_REDUCTION+189, // "i"
MIN_REDUCTION+189, // "o"
MIN_REDUCTION+189, // "r"
MIN_REDUCTION+189, // "u"
MIN_REDUCTION+189, // "x"
MIN_REDUCTION+189, // "b"
MIN_REDUCTION+189, // "h"
MIN_REDUCTION+189, // "k"
MIN_REDUCTION+189, // "n"
MIN_REDUCTION+189, // "t"
MIN_REDUCTION+189, // "w"
MIN_REDUCTION+189, // "z"
MIN_REDUCTION+189, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+189, // $
-1, // $NT
  }
,
{ // state 332
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 333
119,806, // "n"
  }
,
{ // state 334
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 335
95,1272, // "e"
  }
,
{ // state 336
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+136, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+136, // $
-1, // $NT
  }
,
{ // state 337
154,595, // "*"
  }
,
{ // state 338
113,742, // "r"
  }
,
{ // state 339
171,MIN_REDUCTION+253, // $NT
  }
,
{ // state 340
0x80000000|942, // match move
0x80000000|1241, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 341
112,538, // "o"
  }
,
{ // state 342
-1, // $$start
-1, // start
634, // white*
-1, // $$0
MIN_REDUCTION+306, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+306, // "c"
MIN_REDUCTION+306, // "l"
MIN_REDUCTION+306, // "a"
MIN_REDUCTION+306, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+306, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+306, // "d"
MIN_REDUCTION+306, // "g"
MIN_REDUCTION+306, // "m"
MIN_REDUCTION+306, // "p"
MIN_REDUCTION+306, // "v"
MIN_REDUCTION+306, // "y"
MIN_REDUCTION+306, // {"A".."Z" "j" "q"}
MIN_REDUCTION+306, // "f"
MIN_REDUCTION+306, // "i"
MIN_REDUCTION+306, // "o"
MIN_REDUCTION+306, // "r"
MIN_REDUCTION+306, // "u"
MIN_REDUCTION+306, // "x"
MIN_REDUCTION+306, // "b"
MIN_REDUCTION+306, // "h"
MIN_REDUCTION+306, // "k"
MIN_REDUCTION+306, // "n"
MIN_REDUCTION+306, // "t"
MIN_REDUCTION+306, // "w"
MIN_REDUCTION+306, // "z"
MIN_REDUCTION+306, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+306, // $
-1, // $NT
  }
,
{ // state 343
95,802, // "e"
  }
,
{ // state 344
92,602, // "s"
  }
,
{ // state 345
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 346
-1, // $$start
-1, // start
315, // white*
-1, // $$0
MIN_REDUCTION+165, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+165, // "c"
MIN_REDUCTION+165, // "l"
MIN_REDUCTION+165, // "a"
MIN_REDUCTION+165, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+165, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+165, // "d"
MIN_REDUCTION+165, // "g"
MIN_REDUCTION+165, // "m"
MIN_REDUCTION+165, // "p"
MIN_REDUCTION+165, // "v"
MIN_REDUCTION+165, // "y"
MIN_REDUCTION+165, // {"A".."Z" "j" "q"}
MIN_REDUCTION+165, // "f"
MIN_REDUCTION+165, // "i"
MIN_REDUCTION+165, // "o"
MIN_REDUCTION+165, // "r"
MIN_REDUCTION+165, // "u"
MIN_REDUCTION+165, // "x"
MIN_REDUCTION+165, // "b"
MIN_REDUCTION+165, // "h"
MIN_REDUCTION+165, // "k"
MIN_REDUCTION+165, // "n"
MIN_REDUCTION+165, // "t"
MIN_REDUCTION+165, // "w"
MIN_REDUCTION+165, // "z"
MIN_REDUCTION+165, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+165, // $
-1, // $NT
  }
,
{ // state 347
95,392, // "e"
  }
,
{ // state 348
120,737, // "t"
  }
,
{ // state 349
114,879, // "u"
  }
,
{ // state 350
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 351
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+302, // $NT
  }
,
{ // state 352
0x80000000|536, // match move
0x80000000|308, // no-match move
// T-test match for "*":
154,
  }
,
{ // state 353
171,MIN_REDUCTION+256, // $NT
  }
,
{ // state 354
136,304, // "|"
  }
,
{ // state 355
0x80000000|927, // match move
0x80000000|1057, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 356
0x80000000|1, // match move
0x80000000|911, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 357
0x80000000|1, // match move
0x80000000|460, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 358
91,649, // "a"
  }
,
{ // state 359
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 360
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+179, // $NT
  }
,
{ // state 361
95,1255, // "e"
  }
,
{ // state 362
171,MIN_REDUCTION+223, // $NT
  }
,
{ // state 363
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 364
0x80000000|183, // match move
0x80000000|394, // no-match move
// T-test match for 10:
130,
  }
,
{ // state 365
2,577, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+264, // $NT
  }
,
{ // state 366
171,MIN_REDUCTION+113, // $NT
  }
,
{ // state 367
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 368
120,74, // "t"
  }
,
{ // state 369
0x80000000|1068, // match move
0x80000000|1073, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 370
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+140, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+140, // $
-1, // $NT
  }
};
}
private class Initter3{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 371
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 372
111,901, // "i"
  }
,
{ // state 373
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 374
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 375
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 376
90,1061, // "l"
91,1275, // "a"
112,114, // "o"
117,733, // "h"
  }
,
{ // state 377
114,448, // "u"
  }
,
{ // state 378
90,1085, // "l"
  }
,
{ // state 379
0x80000000|1, // match move
0x80000000|239, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 380
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 381
110,762, // "f"
  }
,
{ // state 382
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+124, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+124, // $
-1, // $NT
  }
,
{ // state 383
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 384
95,924, // "e"
  }
,
{ // state 385
119,26, // "n"
  }
,
{ // state 386
120,881, // "t"
  }
,
{ // state 387
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+251, // $NT
  }
,
{ // state 388
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 389
112,1153, // "o"
  }
,
{ // state 390
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+299, // $NT
  }
,
{ // state 391
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+200, // $NT
  }
,
{ // state 392
91,1244, // "a"
  }
,
{ // state 393
0x80000000|383, // match move
0x80000000|525, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 394
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 395
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 396
113,130, // "r"
  }
,
{ // state 397
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 398
95,1157, // "e"
  }
,
{ // state 399
-1, // $$start
-1, // start
776, // white*
-1, // $$0
MIN_REDUCTION+273, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+273, // "c"
MIN_REDUCTION+273, // "l"
MIN_REDUCTION+273, // "a"
MIN_REDUCTION+273, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+273, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+273, // "d"
MIN_REDUCTION+273, // "g"
MIN_REDUCTION+273, // "m"
MIN_REDUCTION+273, // "p"
MIN_REDUCTION+273, // "v"
MIN_REDUCTION+273, // "y"
MIN_REDUCTION+273, // {"A".."Z" "j" "q"}
MIN_REDUCTION+273, // "f"
MIN_REDUCTION+273, // "i"
MIN_REDUCTION+273, // "o"
MIN_REDUCTION+273, // "r"
MIN_REDUCTION+273, // "u"
MIN_REDUCTION+273, // "x"
MIN_REDUCTION+273, // "b"
MIN_REDUCTION+273, // "h"
MIN_REDUCTION+273, // "k"
MIN_REDUCTION+273, // "n"
MIN_REDUCTION+273, // "t"
MIN_REDUCTION+273, // "w"
MIN_REDUCTION+273, // "z"
MIN_REDUCTION+273, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+273, // $
-1, // $NT
  }
,
{ // state 400
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 401
2,292, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+285, // $NT
  }
,
{ // state 402
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 403
0x80000000|1145, // match move
0x80000000|502, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 404
-1, // $$start
-1, // start
1144, // white*
-1, // $$0
MIN_REDUCTION+96, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+96, // $
-1, // $NT
  }
,
{ // state 405
91,868, // "a"
  }
,
{ // state 406
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 407
119,959, // "n"
  }
,
{ // state 408
95,1124, // "e"
  }
,
{ // state 409
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+311, // $NT
  }
,
{ // state 410
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+245, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+245, // $
-1, // $NT
  }
,
{ // state 411
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 412
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 413
2,1298, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+174, // $NT
  }
,
{ // state 414
0x80000000|1094, // match move
0x80000000|7, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 415
103,176, // "d"
  }
,
{ // state 416
95,270, // "e"
  }
,
{ // state 417
2,480, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+183, // $NT
  }
,
{ // state 418
120,1076, // "t"
  }
,
{ // state 419
119,1148, // "n"
  }
,
{ // state 420
89,1132, // "c"
  }
,
{ // state 421
2,573, // white*
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 422
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 423
-1, // $$start
-1, // start
1165, // white*
-1, // $$0
MIN_REDUCTION+258, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+258, // "c"
MIN_REDUCTION+258, // "l"
MIN_REDUCTION+258, // "a"
MIN_REDUCTION+258, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+258, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+258, // "d"
MIN_REDUCTION+258, // "g"
MIN_REDUCTION+258, // "m"
MIN_REDUCTION+258, // "p"
MIN_REDUCTION+258, // "v"
MIN_REDUCTION+258, // "y"
MIN_REDUCTION+258, // {"A".."Z" "j" "q"}
MIN_REDUCTION+258, // "f"
MIN_REDUCTION+258, // "i"
MIN_REDUCTION+258, // "o"
MIN_REDUCTION+258, // "r"
MIN_REDUCTION+258, // "u"
MIN_REDUCTION+258, // "x"
MIN_REDUCTION+258, // "b"
MIN_REDUCTION+258, // "h"
MIN_REDUCTION+258, // "k"
MIN_REDUCTION+258, // "n"
MIN_REDUCTION+258, // "t"
MIN_REDUCTION+258, // "w"
MIN_REDUCTION+258, // "z"
MIN_REDUCTION+258, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+258, // $
-1, // $NT
  }
,
{ // state 424
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 425
92,1276, // "s"
  }
,
{ // state 426
95,320, // "e"
  }
,
{ // state 427
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 428
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+290, // $NT
  }
,
{ // state 429
0x80000000|434, // match move
0x80000000|151, // no-match move
0x80000000|511, // NT-test-match state for commentChar
  }
,
{ // state 430
114,144, // "u"
  }
,
{ // state 431
0x80000000|1269, // match move
0x80000000|900, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 432
120,1121, // "t"
  }
,
{ // state 433
91,102, // "a"
  }
,
{ // state 434
89,274, // "c"
90,274, // "l"
91,274, // "a"
92,274, // "s"
95,274, // "e"
96,274, // "!"
97,274, // "="
98,274, // "+"
102,274, // "_"
103,274, // "d"
104,274, // "g"
105,274, // "m"
106,274, // "p"
107,274, // "v"
108,274, // "y"
109,274, // {"A".."Z" "j" "q"}
110,274, // "f"
111,274, // "i"
112,274, // "o"
113,274, // "r"
114,274, // "u"
115,274, // "x"
116,274, // "b"
117,274, // "h"
118,274, // "k"
119,274, // "n"
120,274, // "t"
121,274, // "w"
122,274, // "z"
123,274, // {"0".."9"}
125,274, // " "
132,453, // printable
133,274, // "["
134,274, // "-"
135,274, // "<"
136,274, // "|"
137,274, // "&"
138,274, // ")"
139,274, // ","
140,274, // "]"
141,274, // "/"
142,274, // ";"
143,274, // ">"
144,274, // "{"
145,274, // "%"
146,274, // "("
147,274, // "\"
148,274, // "."
149,274, // ":"
150,274, // {"#".."$" "?".."@" "^" "`" "~"}
151,274, // "}"
152,274, // "'"
153,274, // '"'
154,274, // "*"
160,112, // commentChar
162,647, // commentChar**
166,123, // commentChar*
  }
,
{ // state 435
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 436
0x80000000|1, // match move
0x80000000|934, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 437
0x80000000|1, // match move
0x80000000|589, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 438
95,773, // "e"
  }
,
{ // state 439
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 440
-1, // $$start
-1, // start
848, // white*
-1, // $$0
MIN_REDUCTION+234, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+234, // "c"
MIN_REDUCTION+234, // "l"
MIN_REDUCTION+234, // "a"
MIN_REDUCTION+234, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+234, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+234, // "d"
MIN_REDUCTION+234, // "g"
MIN_REDUCTION+234, // "m"
MIN_REDUCTION+234, // "p"
MIN_REDUCTION+234, // "v"
MIN_REDUCTION+234, // "y"
MIN_REDUCTION+234, // {"A".."Z" "j" "q"}
MIN_REDUCTION+234, // "f"
MIN_REDUCTION+234, // "i"
MIN_REDUCTION+234, // "o"
MIN_REDUCTION+234, // "r"
MIN_REDUCTION+234, // "u"
MIN_REDUCTION+234, // "x"
MIN_REDUCTION+234, // "b"
MIN_REDUCTION+234, // "h"
MIN_REDUCTION+234, // "k"
MIN_REDUCTION+234, // "n"
MIN_REDUCTION+234, // "t"
MIN_REDUCTION+234, // "w"
MIN_REDUCTION+234, // "z"
MIN_REDUCTION+234, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+234, // $
-1, // $NT
  }
,
{ // state 441
0x80000000|1056, // match move
0x80000000|902, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 442
0x80000000|1, // match move
0x80000000|500, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 443
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 444
113,1200, // "r"
  }
,
{ // state 445
90,139, // "l"
  }
,
{ // state 446
0x80000000|1, // match move
0x80000000|417, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 447
114,317, // "u"
  }
,
{ // state 448
113,1194, // "r"
  }
,
{ // state 449
-1, // $$start
-1, // start
291, // white*
-1, // $$0
MIN_REDUCTION+155, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+155, // $
-1, // $NT
  }
,
{ // state 450
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+239, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+239, // $
-1, // $NT
  }
,
{ // state 451
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+209, // $NT
  }
,
{ // state 452
113,544, // "r"
  }
,
{ // state 453
0x80000000|1031, // match move
0x80000000|629, // no-match move
0x80000000|511, // NT-test-match state for commentChar
  }
,
{ // state 454
0x80000000|400, // match move
0x80000000|659, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 455
0x80000000|1, // match move
0x80000000|1122, // no-match move
// T-test match for "/":
141,
  }
,
{ // state 456
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+162, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+162, // $
-1, // $NT
  }
,
{ // state 457
120,723, // "t"
  }
,
{ // state 458
0x80000000|1, // match move
0x80000000|121, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 459
0x80000000|1, // match move
0x80000000|915, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 460
2,521, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+225, // $NT
  }
,
{ // state 461
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 462
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+154, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+154, // $
-1, // $NT
  }
,
{ // state 463
141,1222, // "/"
  }
,
{ // state 464
0x80000000|1, // match move
0x80000000|401, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 465
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 466
0x80000000|908, // match move
0x80000000|70, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 467
92,386, // "s"
120,1184, // "t"
  }
,
{ // state 468
116,596, // "b"
  }
,
{ // state 469
171,MIN_REDUCTION+310, // $NT
  }
,
{ // state 470
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+245, // $NT
  }
,
{ // state 471
0x80000000|1, // match move
0x80000000|440, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 472
0x80000000|527, // match move
0x80000000|1046, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 473
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 474
2,954, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+171, // $NT
  }
,
{ // state 475
91,333, // "a"
108,42, // "y"
114,1082, // "u"
  }
,
{ // state 476
0x80000000|1075, // match move
0x80000000|1314, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 477
171,MIN_REDUCTION+108, // $NT
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 478
-1, // $$start
-1, // start
895, // white*
-1, // $$0
MIN_REDUCTION+297, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+297, // "c"
MIN_REDUCTION+297, // "l"
MIN_REDUCTION+297, // "a"
MIN_REDUCTION+297, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+297, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+297, // "d"
MIN_REDUCTION+297, // "g"
MIN_REDUCTION+297, // "m"
MIN_REDUCTION+297, // "p"
MIN_REDUCTION+297, // "v"
MIN_REDUCTION+297, // "y"
MIN_REDUCTION+297, // {"A".."Z" "j" "q"}
MIN_REDUCTION+297, // "f"
MIN_REDUCTION+297, // "i"
MIN_REDUCTION+297, // "o"
MIN_REDUCTION+297, // "r"
MIN_REDUCTION+297, // "u"
MIN_REDUCTION+297, // "x"
MIN_REDUCTION+297, // "b"
MIN_REDUCTION+297, // "h"
MIN_REDUCTION+297, // "k"
MIN_REDUCTION+297, // "n"
MIN_REDUCTION+297, // "t"
MIN_REDUCTION+297, // "w"
MIN_REDUCTION+297, // "z"
MIN_REDUCTION+297, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+297, // $
-1, // $NT
  }
,
{ // state 479
0x80000000|612, // match move
0x80000000|272, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 480
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+182, // $NT
  }
,
{ // state 481
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 482
0x80000000|1, // match move
0x80000000|478, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 483
-1, // $$start
-1, // start
1134, // white*
-1, // $$0
MIN_REDUCTION+225, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+225, // "c"
MIN_REDUCTION+225, // "l"
MIN_REDUCTION+225, // "a"
MIN_REDUCTION+225, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+225, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+225, // "d"
MIN_REDUCTION+225, // "g"
MIN_REDUCTION+225, // "m"
MIN_REDUCTION+225, // "p"
MIN_REDUCTION+225, // "v"
MIN_REDUCTION+225, // "y"
MIN_REDUCTION+225, // {"A".."Z" "j" "q"}
MIN_REDUCTION+225, // "f"
MIN_REDUCTION+225, // "i"
MIN_REDUCTION+225, // "o"
MIN_REDUCTION+225, // "r"
MIN_REDUCTION+225, // "u"
MIN_REDUCTION+225, // "x"
MIN_REDUCTION+225, // "b"
MIN_REDUCTION+225, // "h"
MIN_REDUCTION+225, // "k"
MIN_REDUCTION+225, // "n"
MIN_REDUCTION+225, // "t"
MIN_REDUCTION+225, // "w"
MIN_REDUCTION+225, // "z"
MIN_REDUCTION+225, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+225, // $
-1, // $NT
  }
,
{ // state 484
171,MIN_REDUCTION+241, // $NT
  }
,
{ // state 485
0x80000000|50, // match move
0x80000000|893, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 486
91,279, // "a"
  }
,
{ // state 487
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 488
95,856, // "e"
  }
,
{ // state 489
-1, // $$start
-1, // start
558, // white*
-1, // $$0
MIN_REDUCTION+168, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+168, // "c"
MIN_REDUCTION+168, // "l"
MIN_REDUCTION+168, // "a"
MIN_REDUCTION+168, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+168, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+168, // "d"
MIN_REDUCTION+168, // "g"
MIN_REDUCTION+168, // "m"
MIN_REDUCTION+168, // "p"
MIN_REDUCTION+168, // "v"
MIN_REDUCTION+168, // "y"
MIN_REDUCTION+168, // {"A".."Z" "j" "q"}
MIN_REDUCTION+168, // "f"
MIN_REDUCTION+168, // "i"
MIN_REDUCTION+168, // "o"
MIN_REDUCTION+168, // "r"
MIN_REDUCTION+168, // "u"
MIN_REDUCTION+168, // "x"
MIN_REDUCTION+168, // "b"
MIN_REDUCTION+168, // "h"
MIN_REDUCTION+168, // "k"
MIN_REDUCTION+168, // "n"
MIN_REDUCTION+168, // "t"
MIN_REDUCTION+168, // "w"
MIN_REDUCTION+168, // "z"
MIN_REDUCTION+168, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+168, // $
-1, // $NT
  }
,
{ // state 490
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+290, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+290, // $
-1, // $NT
  }
,
{ // state 491
103,1201, // "d"
  }
,
{ // state 492
0x80000000|1028, // match move
0x80000000|485, // no-match move
// T-test match for "-":
134,
  }
,
{ // state 493
-1, // $$start
-1, // start
803, // white*
-1, // $$0
MIN_REDUCTION+282, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+282, // "c"
MIN_REDUCTION+282, // "l"
MIN_REDUCTION+282, // "a"
MIN_REDUCTION+282, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+282, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+282, // "d"
MIN_REDUCTION+282, // "g"
MIN_REDUCTION+282, // "m"
MIN_REDUCTION+282, // "p"
MIN_REDUCTION+282, // "v"
MIN_REDUCTION+282, // "y"
MIN_REDUCTION+282, // {"A".."Z" "j" "q"}
MIN_REDUCTION+282, // "f"
MIN_REDUCTION+282, // "i"
MIN_REDUCTION+282, // "o"
MIN_REDUCTION+282, // "r"
MIN_REDUCTION+282, // "u"
MIN_REDUCTION+282, // "x"
MIN_REDUCTION+282, // "b"
MIN_REDUCTION+282, // "h"
MIN_REDUCTION+282, // "k"
MIN_REDUCTION+282, // "n"
MIN_REDUCTION+282, // "t"
MIN_REDUCTION+282, // "w"
MIN_REDUCTION+282, // "z"
MIN_REDUCTION+282, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+282, // $
-1, // $NT
  }
,
{ // state 494
171,MIN_REDUCTION+102, // $NT
  }
,
{ // state 495
-1, // $$start
-1, // start
794, // white*
-1, // $$0
MIN_REDUCTION+195, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+195, // "c"
MIN_REDUCTION+195, // "l"
MIN_REDUCTION+195, // "a"
MIN_REDUCTION+195, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+195, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+195, // "d"
MIN_REDUCTION+195, // "g"
MIN_REDUCTION+195, // "m"
MIN_REDUCTION+195, // "p"
MIN_REDUCTION+195, // "v"
MIN_REDUCTION+195, // "y"
MIN_REDUCTION+195, // {"A".."Z" "j" "q"}
MIN_REDUCTION+195, // "f"
MIN_REDUCTION+195, // "i"
MIN_REDUCTION+195, // "o"
MIN_REDUCTION+195, // "r"
MIN_REDUCTION+195, // "u"
MIN_REDUCTION+195, // "x"
MIN_REDUCTION+195, // "b"
MIN_REDUCTION+195, // "h"
MIN_REDUCTION+195, // "k"
MIN_REDUCTION+195, // "n"
MIN_REDUCTION+195, // "t"
MIN_REDUCTION+195, // "w"
MIN_REDUCTION+195, // "z"
MIN_REDUCTION+195, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+195, // $
-1, // $NT
  }
,
{ // state 496
171,MIN_REDUCTION+199, // $NT
  }
,
{ // state 497
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 498
0x80000000|663, // match move
0x80000000|1217, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 499
0x80000000|701, // match move
0x80000000|1063, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 500
-1, // $$start
-1, // start
283, // white*
-1, // $$0
MIN_REDUCTION+171, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+171, // "c"
MIN_REDUCTION+171, // "l"
MIN_REDUCTION+171, // "a"
MIN_REDUCTION+171, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+171, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+171, // "d"
MIN_REDUCTION+171, // "g"
MIN_REDUCTION+171, // "m"
MIN_REDUCTION+171, // "p"
MIN_REDUCTION+171, // "v"
MIN_REDUCTION+171, // "y"
MIN_REDUCTION+171, // {"A".."Z" "j" "q"}
MIN_REDUCTION+171, // "f"
MIN_REDUCTION+171, // "i"
MIN_REDUCTION+171, // "o"
MIN_REDUCTION+171, // "r"
MIN_REDUCTION+171, // "u"
MIN_REDUCTION+171, // "x"
MIN_REDUCTION+171, // "b"
MIN_REDUCTION+171, // "h"
MIN_REDUCTION+171, // "k"
MIN_REDUCTION+171, // "n"
MIN_REDUCTION+171, // "t"
MIN_REDUCTION+171, // "w"
MIN_REDUCTION+171, // "z"
MIN_REDUCTION+171, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+171, // $
-1, // $NT
  }
,
{ // state 501
0x80000000|1324, // match move
0x80000000|301, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 502
-1, // $$start
-1, // start
523, // white*
-1, // $$0
MIN_REDUCTION+303, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+303, // "c"
MIN_REDUCTION+303, // "l"
MIN_REDUCTION+303, // "a"
MIN_REDUCTION+303, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+303, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+303, // "d"
MIN_REDUCTION+303, // "g"
MIN_REDUCTION+303, // "m"
MIN_REDUCTION+303, // "p"
MIN_REDUCTION+303, // "v"
MIN_REDUCTION+303, // "y"
MIN_REDUCTION+303, // {"A".."Z" "j" "q"}
MIN_REDUCTION+303, // "f"
MIN_REDUCTION+303, // "i"
MIN_REDUCTION+303, // "o"
MIN_REDUCTION+303, // "r"
MIN_REDUCTION+303, // "u"
MIN_REDUCTION+303, // "x"
MIN_REDUCTION+303, // "b"
MIN_REDUCTION+303, // "h"
MIN_REDUCTION+303, // "k"
MIN_REDUCTION+303, // "n"
MIN_REDUCTION+303, // "t"
MIN_REDUCTION+303, // "w"
MIN_REDUCTION+303, // "z"
MIN_REDUCTION+303, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+303, // $
-1, // $NT
  }
,
{ // state 503
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+242, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+242, // $
-1, // $NT
  }
,
{ // state 504
153,880, // '"'
158,914, // stringChar*
159,288, // $$2
  }
,
{ // state 505
0x80000000|937, // match move
0x80000000|4, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 506
113,5, // "r"
  }
,
{ // state 507
90,1278, // "l"
  }
,
{ // state 508
91,290, // "a"
  }
,
{ // state 509
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+206, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+206, // $
-1, // $NT
  }
,
{ // state 510
171,MIN_REDUCTION+105, // $NT
  }
,
{ // state 511
89,366, // "c"
90,366, // "l"
91,366, // "a"
92,366, // "s"
95,366, // "e"
96,366, // "!"
97,366, // "="
98,366, // "+"
102,366, // "_"
103,366, // "d"
104,366, // "g"
105,366, // "m"
106,366, // "p"
107,366, // "v"
108,366, // "y"
109,366, // {"A".."Z" "j" "q"}
110,366, // "f"
111,366, // "i"
112,366, // "o"
113,366, // "r"
114,366, // "u"
115,366, // "x"
116,366, // "b"
117,366, // "h"
118,366, // "k"
119,366, // "n"
120,366, // "t"
121,366, // "w"
122,366, // "z"
123,366, // {"0".."9"}
125,366, // " "
132,579, // printable
133,366, // "["
134,366, // "-"
135,366, // "<"
136,366, // "|"
137,366, // "&"
138,366, // ")"
139,366, // ","
140,366, // "]"
141,366, // "/"
142,366, // ";"
143,366, // ">"
144,366, // "{"
145,366, // "%"
146,366, // "("
147,366, // "\"
148,366, // "."
149,366, // ":"
150,366, // {"#".."$" "?".."@" "^" "`" "~"}
151,366, // "}"
152,366, // "'"
153,366, // '"'
154,366, // "*"
  }
,
{ // state 512
171,MIN_REDUCTION+316, // $NT
  }
,
{ // state 513
95,22, // "e"
  }
,
{ // state 514
2,276, // white*
124,363, // white
125,1264, // " "
126,1264, // {9 12}
127,654, // eol
130,642, // {10}
131,1260, // {13}
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 515
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+218, // $NT
  }
,
{ // state 516
112,957, // "o"
  }
,
{ // state 517
119,775, // "n"
  }
,
{ // state 518
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+353, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+353, // $
-1, // $NT
  }
,
{ // state 519
117,720, // "h"
  }
,
{ // state 520
0x80000000|1, // match move
0x80000000|822, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 521
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+224, // $NT
  }
,
{ // state 522
0x80000000|740, // match move
0x80000000|1308, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 523
0x80000000|963, // match move
0x80000000|646, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 524
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+218, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+218, // $
-1, // $NT
  }
,
{ // state 525
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+179, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+179, // $
-1, // $NT
  }
,
{ // state 526
0x80000000|1, // match move
0x80000000|33, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 527
89,1108, // "c"
90,1108, // "l"
91,1108, // "a"
92,1108, // "s"
93,327, // idChar
95,1108, // "e"
100,313, // letter
101,548, // digit
102,369, // "_"
103,1108, // "d"
104,1108, // "g"
105,1108, // "m"
106,1108, // "p"
107,1108, // "v"
108,1108, // "y"
109,1108, // {"A".."Z" "j" "q"}
110,1108, // "f"
111,1108, // "i"
112,1108, // "o"
113,1108, // "r"
114,1108, // "u"
115,1108, // "x"
116,1108, // "b"
117,1108, // "h"
118,1108, // "k"
119,1108, // "n"
120,1108, // "t"
121,1108, // "w"
122,1108, // "z"
123,98, // {"0".."9"}
155,890, // idChar**
168,585, // idChar*
  }
,
{ // state 528
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 529
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 530
0x80000000|1069, // match move
0x80000000|1131, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 531
95,204, // "e"
  }
,
{ // state 532
171,MIN_REDUCTION+169, // $NT
  }
,
{ // state 533
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 534
0x80000000|865, // match move
0x80000000|1023, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 535
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 536
154,455, // "*"
163,1219, // multiCommentChar
164,57, // multiCommentChar**
169,1181, // multiCommentChar*
  }
,
{ // state 537
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+158, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+158, // $
-1, // $NT
  }
};
}
private class Initter4{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 538
121,403, // "w"
  }
,
{ // state 539
95,1091, // "e"
  }
,
{ // state 540
98,441, // "+"
  }
,
{ // state 541
0x80000000|268, // match move
0x80000000|1142, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 542
2,791, // white*
156,926, // $$1
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 543
0x80000000|208, // match move
0x80000000|138, // no-match move
0x80000000|103, // NT-test-match state for digit
  }
,
{ // state 544
91,987, // "a"
  }
,
{ // state 545
2,674, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+198, // $NT
  }
,
{ // state 546
120,286, // "t"
  }
,
{ // state 547
95,950, // "e"
  }
,
{ // state 548
0x80000000|118, // match move
0x80000000|831, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 549
0x80000000|71, // match move
0x80000000|155, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 550
92,1325, // "s"
  }
,
{ // state 551
0x80000000|1, // match move
0x80000000|399, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 552
95,1060, // "e"
  }
,
{ // state 553
89,233, // "c"
90,233, // "l"
91,233, // "a"
92,233, // "s"
95,233, // "e"
96,233, // "!"
97,233, // "="
98,233, // "+"
102,233, // "_"
103,233, // "d"
104,233, // "g"
105,233, // "m"
106,233, // "p"
107,233, // "v"
108,233, // "y"
109,233, // {"A".."Z" "j" "q"}
110,233, // "f"
111,233, // "i"
112,233, // "o"
113,233, // "r"
114,233, // "u"
115,233, // "x"
116,233, // "b"
117,233, // "h"
118,233, // "k"
119,233, // "n"
120,233, // "t"
121,233, // "w"
122,233, // "z"
123,233, // {"0".."9"}
125,233, // " "
132,777, // printable
133,233, // "["
134,233, // "-"
135,233, // "<"
136,233, // "|"
137,233, // "&"
138,233, // ")"
139,233, // ","
140,233, // "]"
141,233, // "/"
142,233, // ";"
143,233, // ">"
144,233, // "{"
145,233, // "%"
146,233, // "("
147,233, // "\"
148,233, // "."
149,233, // ":"
150,233, // {"#".."$" "?".."@" "^" "`" "~"}
151,233, // "}"
152,233, // "'"
153,233, // '"'
154,233, // "*"
157,664, // stringChar
  }
,
{ // state 554
-1, // $$start
-1, // start
454, // white*
-1, // $$0
MIN_REDUCTION+90, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+90, // "c"
MIN_REDUCTION+90, // "l"
MIN_REDUCTION+90, // "a"
MIN_REDUCTION+90, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+90, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+90, // "d"
MIN_REDUCTION+90, // "g"
MIN_REDUCTION+90, // "m"
MIN_REDUCTION+90, // "p"
MIN_REDUCTION+90, // "v"
MIN_REDUCTION+90, // "y"
MIN_REDUCTION+90, // {"A".."Z" "j" "q"}
MIN_REDUCTION+90, // "f"
MIN_REDUCTION+90, // "i"
MIN_REDUCTION+90, // "o"
MIN_REDUCTION+90, // "r"
MIN_REDUCTION+90, // "u"
MIN_REDUCTION+90, // "x"
MIN_REDUCTION+90, // "b"
MIN_REDUCTION+90, // "h"
MIN_REDUCTION+90, // "k"
MIN_REDUCTION+90, // "n"
MIN_REDUCTION+90, // "t"
MIN_REDUCTION+90, // "w"
MIN_REDUCTION+90, // "z"
MIN_REDUCTION+90, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+90, // $
-1, // $NT
  }
,
{ // state 555
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+272, // $NT
  }
,
{ // state 556
0x80000000|1, // match move
0x80000000|651, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 557
0x80000000|1, // match move
0x80000000|732, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 558
0x80000000|266, // match move
0x80000000|1261, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 559
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 560
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 561
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+126, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+126, // $
-1, // $NT
  }
,
{ // state 562
2,214, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+261, // $NT
  }
,
{ // state 563
91,1049, // "a"
113,372, // "r"
  }
,
{ // state 564
91,699, // "a"
95,907, // "e"
114,19, // "u"
  }
,
{ // state 565
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 566
0x80000000|560, // match move
0x80000000|319, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 567
113,696, // "r"
  }
,
{ // state 568
0x80000000|1152, // match move
0x80000000|410, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 569
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 570
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 571
90,242, // "l"
  }
,
{ // state 572
171,MIN_REDUCTION+232, // $NT
  }
,
{ // state 573
0x80000000|2, // match move
0x80000000|336, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 574
107,1322, // "v"
  }
,
{ // state 575
95,61, // "e"
  }
,
{ // state 576
130,285, // {10}
  }
,
{ // state 577
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+263, // $NT
  }
,
{ // state 578
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+120, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+120, // $
-1, // $NT
  }
,
{ // state 579
171,MIN_REDUCTION+326, // $NT
  }
,
{ // state 580
90,513, // "l"
  }
,
{ // state 581
119,175, // "n"
  }
,
{ // state 582
89,1140, // "c"
  }
,
{ // state 583
92,698, // "s"
  }
,
{ // state 584
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+293, // $NT
  }
,
{ // state 585
0x80000000|99, // match move
0x80000000|305, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 586
120,128, // "t"
  }
,
{ // state 587
95,1125, // "e"
  }
,
{ // state 588
-1, // $$start
-1, // start
729, // white*
-1, // $$0
MIN_REDUCTION+288, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+288, // "c"
MIN_REDUCTION+288, // "l"
MIN_REDUCTION+288, // "a"
MIN_REDUCTION+288, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+288, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+288, // "d"
MIN_REDUCTION+288, // "g"
MIN_REDUCTION+288, // "m"
MIN_REDUCTION+288, // "p"
MIN_REDUCTION+288, // "v"
MIN_REDUCTION+288, // "y"
MIN_REDUCTION+288, // {"A".."Z" "j" "q"}
MIN_REDUCTION+288, // "f"
MIN_REDUCTION+288, // "i"
MIN_REDUCTION+288, // "o"
MIN_REDUCTION+288, // "r"
MIN_REDUCTION+288, // "u"
MIN_REDUCTION+288, // "x"
MIN_REDUCTION+288, // "b"
MIN_REDUCTION+288, // "h"
MIN_REDUCTION+288, // "k"
MIN_REDUCTION+288, // "n"
MIN_REDUCTION+288, // "t"
MIN_REDUCTION+288, // "w"
MIN_REDUCTION+288, // "z"
MIN_REDUCTION+288, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+288, // $
-1, // $NT
  }
,
{ // state 589
2,953, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+168, // $NT
  }
,
{ // state 590
110,694, // "f"
  }
,
{ // state 591
0x80000000|1, // match move
0x80000000|562, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 592
111,1220, // "i"
113,1234, // "r"
  }
,
{ // state 593
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 594
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+308, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+308, // $
-1, // $NT
  }
,
{ // state 595
141,1040, // "/"
  }
,
{ // state 596
90,977, // "l"
  }
,
{ // state 597
91,82, // "a"
  }
,
{ // state 598
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 599
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 600
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 601
111,137, // "i"
  }
,
{ // state 602
95,396, // "e"
  }
,
{ // state 603
0x80000000|845, // match move
0x80000000|1149, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 604
120,1237, // "t"
  }
,
{ // state 605
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 606
-1, // $$start
-1, // start
909, // white*
-1, // $$0
MIN_REDUCTION+285, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+285, // "c"
MIN_REDUCTION+285, // "l"
MIN_REDUCTION+285, // "a"
MIN_REDUCTION+285, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+285, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+285, // "d"
MIN_REDUCTION+285, // "g"
MIN_REDUCTION+285, // "m"
MIN_REDUCTION+285, // "p"
MIN_REDUCTION+285, // "v"
MIN_REDUCTION+285, // "y"
MIN_REDUCTION+285, // {"A".."Z" "j" "q"}
MIN_REDUCTION+285, // "f"
MIN_REDUCTION+285, // "i"
MIN_REDUCTION+285, // "o"
MIN_REDUCTION+285, // "r"
MIN_REDUCTION+285, // "u"
MIN_REDUCTION+285, // "x"
MIN_REDUCTION+285, // "b"
MIN_REDUCTION+285, // "h"
MIN_REDUCTION+285, // "k"
MIN_REDUCTION+285, // "n"
MIN_REDUCTION+285, // "t"
MIN_REDUCTION+285, // "w"
MIN_REDUCTION+285, // "z"
MIN_REDUCTION+285, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+285, // $
-1, // $NT
  }
,
{ // state 607
121,173, // "w"
  }
,
{ // state 608
-1, // $$start
-1, // start
1035, // white*
-1, // $$0
MIN_REDUCTION+143, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
-1, // `=
-1, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
MIN_REDUCTION+143, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+143, // $
-1, // $NT
  }
,
{ // state 609
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 610
0x80000000|1, // match move
0x80000000|588, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 611
113,310, // "r"
117,592, // "h"
  }
,
{ // state 612
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 613
112,338, // "o"
  }
,
{ // state 614
0x80000000|1, // match move
0x80000000|365, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 615
110,379, // "f"
  }
,
{ // state 616
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+203, // $NT
  }
,
{ // state 617
2,946, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+213, // $NT
  }
,
{ // state 618
171,MIN_REDUCTION+172, // $NT
  }
,
{ // state 619
2,626, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+270, // $NT
  }
,
{ // state 620
171,MIN_REDUCTION+298, // $NT
  }
,
{ // state 621
2,869, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+315, // $NT
  }
,
{ // state 622
171,MIN_REDUCTION+94, // $NT
  }
,
{ // state 623
101,786, // digit
123,543, // {"0".."9"}
  }
,
{ // state 624
91,113, // "a"
113,955, // "r"
114,468, // "u"
  }
,
{ // state 625
0x80000000|1, // match move
0x80000000|641, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 626
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+269, // $NT
  }
,
{ // state 627
171,MIN_REDUCTION+277, // $NT
  }
,
{ // state 628
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+146, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+146, // $
-1, // $NT
  }
,
{ // state 629
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 630
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 631
90,834, // "l"
  }
,
{ // state 632
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 633
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 634
0x80000000|609, // match move
0x80000000|790, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 635
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 636
0x80000000|1266, // match move
0x80000000|184, // no-match move
// T-test match for "\":
147,
  }
,
{ // state 637
116,1218, // "b"
  }
,
{ // state 638
0x80000000|1, // match move
0x80000000|606, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 639
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+128, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+128, // $
-1, // $NT
  }
,
{ // state 640
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 641
2,683, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+234, // $NT
  }
,
{ // state 642
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 643
114,297, // "u"
  }
,
{ // state 644
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+287, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+287, // $
-1, // $NT
  }
,
{ // state 645
89,296, // "c"
  }
,
{ // state 646
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+302, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+302, // $
-1, // $NT
  }
,
{ // state 647
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 648
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+257, // $NT
  }
,
{ // state 649
114,223, // "u"
  }
,
{ // state 650
107,1026, // "v"
  }
,
{ // state 651
-1, // $$start
-1, // start
792, // white*
-1, // $$0
MIN_REDUCTION+198, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+198, // "c"
MIN_REDUCTION+198, // "l"
MIN_REDUCTION+198, // "a"
MIN_REDUCTION+198, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+198, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+198, // "d"
MIN_REDUCTION+198, // "g"
MIN_REDUCTION+198, // "m"
MIN_REDUCTION+198, // "p"
MIN_REDUCTION+198, // "v"
MIN_REDUCTION+198, // "y"
MIN_REDUCTION+198, // {"A".."Z" "j" "q"}
MIN_REDUCTION+198, // "f"
MIN_REDUCTION+198, // "i"
MIN_REDUCTION+198, // "o"
MIN_REDUCTION+198, // "r"
MIN_REDUCTION+198, // "u"
MIN_REDUCTION+198, // "x"
MIN_REDUCTION+198, // "b"
MIN_REDUCTION+198, // "h"
MIN_REDUCTION+198, // "k"
MIN_REDUCTION+198, // "n"
MIN_REDUCTION+198, // "t"
MIN_REDUCTION+198, // "w"
MIN_REDUCTION+198, // "z"
MIN_REDUCTION+198, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+198, // $
-1, // $NT
  }
,
{ // state 652
2,1041, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+255, // $NT
  }
,
{ // state 653
95,222, // "e"
  }
,
{ // state 654
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 655
2,409, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+312, // $NT
  }
,
{ // state 656
0x80000000|106, // match move
0x80000000|249, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 657
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 658
0x80000000|1, // match move
0x80000000|554, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 659
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+89, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+89, // $
-1, // $NT
  }
,
{ // state 660
127,38, // eol
130,642, // {10}
131,1260, // {13}
  }
,
{ // state 661
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 662
89,438, // "c"
  }
,
{ // state 663
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 664
152,253, // "'"
  }
,
{ // state 665
90,952, // "l"
  }
,
{ // state 666
0x80000000|374, // match move
0x80000000|163, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 667
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 668
0x80000000|185, // match move
0x80000000|1267, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 669
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+191, // $NT
  }
,
{ // state 670
2,566, // white*
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 671
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 672
111,154, // "i"
  }
,
{ // state 673
0x80000000|375, // match move
0x80000000|187, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 674
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+197, // $NT
  }
,
{ // state 675
119,1204, // "n"
  }
,
{ // state 676
0x80000000|938, // match move
0x80000000|747, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 677
111,1203, // "i"
  }
,
{ // state 678
117,482, // "h"
  }
,
{ // state 679
0x80000000|1, // match move
0x80000000|617, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 680
0x80000000|1, // match move
0x80000000|652, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 681
0x80000000|904, // match move
0x80000000|1087, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 682
111,210, // "i"
  }
,
{ // state 683
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+233, // $NT
  }
,
{ // state 684
120,37, // "t"
  }
,
{ // state 685
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 686
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 687
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 688
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 689
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 690
0x80000000|1, // match move
0x80000000|826, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 691
-1, // $$start
-1, // start
998, // white*
-1, // $$0
MIN_REDUCTION+231, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+231, // "c"
MIN_REDUCTION+231, // "l"
MIN_REDUCTION+231, // "a"
MIN_REDUCTION+231, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+231, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+231, // "d"
MIN_REDUCTION+231, // "g"
MIN_REDUCTION+231, // "m"
MIN_REDUCTION+231, // "p"
MIN_REDUCTION+231, // "v"
MIN_REDUCTION+231, // "y"
MIN_REDUCTION+231, // {"A".."Z" "j" "q"}
MIN_REDUCTION+231, // "f"
MIN_REDUCTION+231, // "i"
MIN_REDUCTION+231, // "o"
MIN_REDUCTION+231, // "r"
MIN_REDUCTION+231, // "u"
MIN_REDUCTION+231, // "x"
MIN_REDUCTION+231, // "b"
MIN_REDUCTION+231, // "h"
MIN_REDUCTION+231, // "k"
MIN_REDUCTION+231, // "n"
MIN_REDUCTION+231, // "t"
MIN_REDUCTION+231, // "w"
MIN_REDUCTION+231, // "z"
MIN_REDUCTION+231, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+231, // $
-1, // $NT
  }
,
{ // state 692
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+324, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+324, // $
-1, // $NT
  }
,
{ // state 693
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+272, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+272, // $
-1, // $NT
  }
,
{ // state 694
91,349, // "a"
  }
,
{ // state 695
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+197, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+197, // $
-1, // $NT
  }
,
{ // state 696
0x80000000|1, // match move
0x80000000|871, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 697
110,1242, // "f"
  }
,
{ // state 698
0x80000000|1, // match move
0x80000000|960, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 699
120,97, // "t"
  }
,
{ // state 700
171,MIN_REDUCTION+289, // $NT
  }
,
{ // state 701
2,1105, // white*
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 702
0x80000000|1, // match move
0x80000000|489, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 703
113,766, // "r"
  }
,
{ // state 704
0x80000000|1, // match move
0x80000000|1208, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 705
90,1120, // "l"
  }
,
{ // state 706
97,414, // "="
  }
,
{ // state 707
118,93, // "k"
  }
,
{ // state 708
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 709
90,476, // "l"
  }
,
{ // state 710
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+92, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+92, // $
-1, // $NT
  }
,
{ // state 711
0x80000000|109, // match move
0x80000000|867, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 712
2,360, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+180, // $NT
  }
,
{ // state 713
0x80000000|630, // match move
0x80000000|782, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 714
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 715
137,855, // "&"
  }
,
{ // state 716
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 717
0x80000000|1, // match move
0x80000000|655, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 718
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 719
0x80000000|430, // match move
0x80000000|1233, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 720
0x80000000|1, // match move
0x80000000|483, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 721
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+164, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+164, // $
-1, // $NT
  }
,
{ // state 722
0x80000000|1, // match move
0x80000000|783, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 723
92,591, // "s"
  }
,
{ // state 724
0x80000000|706, // match move
0x80000000|505, // no-match move
// T-test match for "=":
97,
  }
,
{ // state 725
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+142, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+142, // $
-1, // $NT
  }
,
{ // state 726
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 727
-1, // $$start
-1, // start
549, // white*
-1, // $$0
MIN_REDUCTION+183, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+183, // "c"
MIN_REDUCTION+183, // "l"
MIN_REDUCTION+183, // "a"
MIN_REDUCTION+183, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+183, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+183, // "d"
MIN_REDUCTION+183, // "g"
MIN_REDUCTION+183, // "m"
MIN_REDUCTION+183, // "p"
MIN_REDUCTION+183, // "v"
MIN_REDUCTION+183, // "y"
MIN_REDUCTION+183, // {"A".."Z" "j" "q"}
MIN_REDUCTION+183, // "f"
MIN_REDUCTION+183, // "i"
MIN_REDUCTION+183, // "o"
MIN_REDUCTION+183, // "r"
MIN_REDUCTION+183, // "u"
MIN_REDUCTION+183, // "x"
MIN_REDUCTION+183, // "b"
MIN_REDUCTION+183, // "h"
MIN_REDUCTION+183, // "k"
MIN_REDUCTION+183, // "n"
MIN_REDUCTION+183, // "t"
MIN_REDUCTION+183, // "w"
MIN_REDUCTION+183, // "z"
MIN_REDUCTION+183, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+183, // $
-1, // $NT
  }
,
{ // state 728
0x80000000|1, // match move
0x80000000|753, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 729
0x80000000|435, // match move
0x80000000|644, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 730
120,254, // "t"
  }
,
{ // state 731
0x80000000|670, // match move
0x80000000|991, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 732
2,921, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+177, // $NT
  }
,
{ // state 733
91,567, // "a"
  }
,
{ // state 734
5,84, // `boolean
6,193, // `class
7,532, // `extends
8,618, // `void
9,1178, // `int
10,1074, // `while
11,1084, // `if
12,622, // `else
13,78, // `for
14,46, // `break
15,29, // `this
16,1118, // `false
17,811, // `true
18,496, // `super
19,817, // `null
20,948, // `return
21,1039, // `instanceof
22,1303, // `new
23,850, // `abstract
24,785, // `assert
25,1137, // `byte
26,362, // `case
27,1285, // `catch
28,1190, // `char
29,572, // `const
30,152, // `continue
31,824, // `default
32,484, // `do
33,179, // `double
34,993, // `enum
35,330, // `final
36,339, // `finally
37,353, // `float
38,1279, // `goto
39,735, // `implements
40,135, // `import
41,1019, // `interface
42,899, // `long
43,56, // `native
44,627, // `package
45,251, // `private
46,1059, // `protected
47,107, // `public
48,700, // `short
49,13, // `static
50,839, // `strictfp
51,620, // `switch
52,1107, // `synchronized
53,997, // `throw
54,1265, // `throws
55,469, // `transient
56,1126, // `try
57,512, // `volatile
89,194, // "c"
90,1224, // "l"
91,244, // "a"
92,891, // "s"
95,1077, // "e"
103,146, // "d"
104,1313, // "g"
106,624, // "p"
107,311, // "v"
110,1098, // "f"
111,55, // "i"
113,416, // "r"
116,1288, // "b"
119,271, // "n"
120,611, // "t"
121,1097, // "w"
  }
,
{ // state 735
171,MIN_REDUCTION+262, // $NT
  }
,
{ // state 736
0x80000000|920, // match move
0x80000000|1294, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 737
111,445, // "i"
  }
,
{ // state 738
0x80000000|885, // match move
0x80000000|863, // no-match move
// T-test match for "*":
154,
  }
,
{ // state 739
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+254, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+254, // $
-1, // $NT
  }
,
{ // state 740
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 741
95,1229, // "e"
  }
,
{ // state 742
120,728, // "t"
  }
,
{ // state 743
-1, // $$start
-1, // start
63, // white*
-1, // $$0
MIN_REDUCTION+264, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+264, // "c"
MIN_REDUCTION+264, // "l"
MIN_REDUCTION+264, // "a"
MIN_REDUCTION+264, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+264, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+264, // "d"
MIN_REDUCTION+264, // "g"
MIN_REDUCTION+264, // "m"
MIN_REDUCTION+264, // "p"
MIN_REDUCTION+264, // "v"
MIN_REDUCTION+264, // "y"
MIN_REDUCTION+264, // {"A".."Z" "j" "q"}
MIN_REDUCTION+264, // "f"
MIN_REDUCTION+264, // "i"
MIN_REDUCTION+264, // "o"
MIN_REDUCTION+264, // "r"
MIN_REDUCTION+264, // "u"
MIN_REDUCTION+264, // "x"
MIN_REDUCTION+264, // "b"
MIN_REDUCTION+264, // "h"
MIN_REDUCTION+264, // "k"
MIN_REDUCTION+264, // "n"
MIN_REDUCTION+264, // "t"
MIN_REDUCTION+264, // "w"
MIN_REDUCTION+264, // "z"
MIN_REDUCTION+264, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+264, // $
-1, // $NT
  }
};
}
private class Initter5{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 744
95,645, // "e"
  }
,
{ // state 745
0x80000000|795, // match move
0x80000000|413, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 746
-1, // $$start
-1, // start
522, // white*
-1, // $$0
MIN_REDUCTION+100, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+100, // $
-1, // $NT
  }
,
{ // state 747
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+311, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+311, // $
-1, // $NT
  }
,
{ // state 748
2,1000, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+207, // $NT
  }
,
{ // state 749
2,812, // white*
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 750
0x80000000|943, // match move
0x80000000|910, // no-match move
// T-test match for "*":
154,
  }
,
{ // state 751
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 752
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 753
2,323, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+288, // $NT
  }
,
{ // state 754
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 755
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 756
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+138, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+138, // $
-1, // $NT
  }
,
{ // state 757
91,278, // "a"
  }
,
{ // state 758
2,326, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+186, // $NT
  }
,
{ // state 759
0x80000000|207, // match move
0x80000000|189, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 760
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 761
0x80000000|1, // match move
0x80000000|712, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 762
91,1231, // "a"
  }
,
{ // state 763
0x80000000|1, // match move
0x80000000|1243, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 764
92,437, // "s"
  }
,
{ // state 765
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 766
0x80000000|1, // match move
0x80000000|545, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 767
170,MIN_REDUCTION+0, // $
  }
,
{ // state 768
95,625, // "e"
  }
,
{ // state 769
89,177, // "c"
  }
,
{ // state 770
-1, // $$start
767, // start
143, // white*
979, // $$0
76, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
1037, // white
599, // " "
599, // {9 12}
1006, // eol
105, // singleLineComment
439, // multiLineComment
1110, // {10}
364, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
1277, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
1166, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
759, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 771
120,170, // "t"
  }
,
{ // state 772
119,277, // "n"
  }
,
{ // state 773
112,1113, // "o"
  }
,
{ // state 774
171,MIN_REDUCTION+342, // $NT
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 775
89,191, // "c"
  }
,
{ // state 776
0x80000000|840, // match move
0x80000000|693, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 777
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 778
0x80000000|1, // match move
0x80000000|808, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 779
-1, // $$start
-1, // start
1119, // white*
-1, // $$0
MIN_REDUCTION+174, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+174, // "c"
MIN_REDUCTION+174, // "l"
MIN_REDUCTION+174, // "a"
MIN_REDUCTION+174, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+174, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+174, // "d"
MIN_REDUCTION+174, // "g"
MIN_REDUCTION+174, // "m"
MIN_REDUCTION+174, // "p"
MIN_REDUCTION+174, // "v"
MIN_REDUCTION+174, // "y"
MIN_REDUCTION+174, // {"A".."Z" "j" "q"}
MIN_REDUCTION+174, // "f"
MIN_REDUCTION+174, // "i"
MIN_REDUCTION+174, // "o"
MIN_REDUCTION+174, // "r"
MIN_REDUCTION+174, // "u"
MIN_REDUCTION+174, // "x"
MIN_REDUCTION+174, // "b"
MIN_REDUCTION+174, // "h"
MIN_REDUCTION+174, // "k"
MIN_REDUCTION+174, // "n"
MIN_REDUCTION+174, // "t"
MIN_REDUCTION+174, // "w"
MIN_REDUCTION+174, // "z"
MIN_REDUCTION+174, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+174, // $
-1, // $NT
  }
,
{ // state 780
117,458, // "h"
  }
,
{ // state 781
-1, // $$start
-1, // start
355, // white*
-1, // $$0
MIN_REDUCTION+115, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
-1, // `=
-1, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
MIN_REDUCTION+115, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+115, // $
-1, // $NT
  }
,
{ // state 782
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+148, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+148, // $
-1, // $NT
  }
,
{ // state 783
2,298, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+90, // $NT
  }
,
{ // state 784
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 785
171,MIN_REDUCTION+217, // $NT
  }
,
{ // state 786
0x80000000|951, // match move
0x80000000|809, // no-match move
0x80000000|103, // NT-test-match state for digit
  }
,
{ // state 787
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 788
119,677, // "n"
  }
,
{ // state 789
120,1003, // "t"
  }
,
{ // state 790
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+305, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+305, // $
-1, // $NT
  }
,
{ // state 791
0x80000000|1072, // match move
0x80000000|518, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 792
0x80000000|843, // match move
0x80000000|695, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 793
0x80000000|623, // match move
0x80000000|632, // no-match move
0x80000000|103, // NT-test-match state for digit
  }
,
{ // state 794
0x80000000|1173, // match move
0x80000000|1009, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 795
95,30, // "e"
  }
,
{ // state 796
120,452, // "t"
  }
,
{ // state 797
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 798
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 799
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 800
112,1312, // "o"
  }
,
{ // state 801
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+221, // $NT
  }
,
{ // state 802
0x80000000|1, // match move
0x80000000|1017, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 803
0x80000000|528, // match move
0x80000000|17, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 804
0x80000000|263, // match move
0x80000000|514, // no-match move
// T-test match for "/":
141,
  }
,
{ // state 805
0x80000000|24, // match move
0x80000000|1202, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 806
92,1249, // "s"
  }
,
{ // state 807
111,531, // "i"
  }
,
{ // state 808
-1, // $$start
-1, // start
1196, // white*
-1, // $$0
MIN_REDUCTION+291, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+291, // "c"
MIN_REDUCTION+291, // "l"
MIN_REDUCTION+291, // "a"
MIN_REDUCTION+291, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+291, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+291, // "d"
MIN_REDUCTION+291, // "g"
MIN_REDUCTION+291, // "m"
MIN_REDUCTION+291, // "p"
MIN_REDUCTION+291, // "v"
MIN_REDUCTION+291, // "y"
MIN_REDUCTION+291, // {"A".."Z" "j" "q"}
MIN_REDUCTION+291, // "f"
MIN_REDUCTION+291, // "i"
MIN_REDUCTION+291, // "o"
MIN_REDUCTION+291, // "r"
MIN_REDUCTION+291, // "u"
MIN_REDUCTION+291, // "x"
MIN_REDUCTION+291, // "b"
MIN_REDUCTION+291, // "h"
MIN_REDUCTION+291, // "k"
MIN_REDUCTION+291, // "n"
MIN_REDUCTION+291, // "t"
MIN_REDUCTION+291, // "w"
MIN_REDUCTION+291, // "z"
MIN_REDUCTION+291, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+291, // $
-1, // $NT
  }
,
{ // state 809
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 810
0x80000000|424, // match move
0x80000000|825, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 811
171,MIN_REDUCTION+196, // $NT
  }
,
{ // state 812
0x80000000|1170, // match move
0x80000000|370, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 813
2,470, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+246, // $NT
  }
,
{ // state 814
-1, // $$start
-1, // start
148, // white*
-1, // $$0
MIN_REDUCTION+192, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+192, // "c"
MIN_REDUCTION+192, // "l"
MIN_REDUCTION+192, // "a"
MIN_REDUCTION+192, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+192, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+192, // "d"
MIN_REDUCTION+192, // "g"
MIN_REDUCTION+192, // "m"
MIN_REDUCTION+192, // "p"
MIN_REDUCTION+192, // "v"
MIN_REDUCTION+192, // "y"
MIN_REDUCTION+192, // {"A".."Z" "j" "q"}
MIN_REDUCTION+192, // "f"
MIN_REDUCTION+192, // "i"
MIN_REDUCTION+192, // "o"
MIN_REDUCTION+192, // "r"
MIN_REDUCTION+192, // "u"
MIN_REDUCTION+192, // "x"
MIN_REDUCTION+192, // "b"
MIN_REDUCTION+192, // "h"
MIN_REDUCTION+192, // "k"
MIN_REDUCTION+192, // "n"
MIN_REDUCTION+192, // "t"
MIN_REDUCTION+192, // "w"
MIN_REDUCTION+192, // "z"
MIN_REDUCTION+192, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+192, // $
-1, // $NT
  }
,
{ // state 815
113,1309, // "r"
  }
,
{ // state 816
95,226, // "e"
  }
,
{ // state 817
171,MIN_REDUCTION+202, // $NT
  }
,
{ // state 818
127,243, // eol
130,872, // {10}
131,862, // {13}
  }
,
{ // state 819
0x80000000|866, // match move
0x80000000|692, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 820
119,52, // "n"
  }
,
{ // state 821
92,604, // "s"
  }
,
{ // state 822
2,584, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+294, // $NT
  }
,
{ // state 823
111,571, // "i"
  }
,
{ // state 824
171,MIN_REDUCTION+238, // $NT
  }
,
{ // state 825
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+160, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+160, // $
-1, // $NT
  }
,
{ // state 826
2,1109, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+279, // $NT
  }
,
{ // state 827
0x80000000|1, // match move
0x80000000|814, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 828
-1, // $$start
-1, // start
217, // white*
-1, // $$0
MIN_REDUCTION+157, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+157, // $
-1, // $NT
  }
,
{ // state 829
92,199, // "s"
  }
,
{ // state 830
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+122, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+122, // $
-1, // $NT
  }
,
{ // state 831
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 832
110,1177, // "f"
  }
,
{ // state 833
0x80000000|752, // match move
0x80000000|982, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 834
95,259, // "e"
  }
,
{ // state 835
2,291, // white*
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 836
141,1008, // "/"
  }
,
{ // state 837
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+194, // $NT
  }
,
{ // state 838
120,23, // "t"
  }
,
{ // state 839
171,MIN_REDUCTION+295, // $NT
  }
,
{ // state 840
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 841
91,1299, // "a"
  }
,
{ // state 842
2,1038, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+93, // $NT
  }
,
{ // state 843
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 844
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 845
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 846
90,1262, // "l"
111,1327, // "i"
  }
,
{ // state 847
0x80000000|1, // match move
0x80000000|748, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 848
0x80000000|158, // match move
0x80000000|1054, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 849
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 850
171,MIN_REDUCTION+214, // $NT
  }
,
{ // state 851
2,1209, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+276, // $NT
  }
,
{ // state 852
95,147, // "e"
  }
,
{ // state 853
0x80000000|275, // match move
0x80000000|89, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 854
117,1036, // "h"
  }
,
{ // state 855
0x80000000|1114, // match move
0x80000000|860, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 856
0x80000000|1, // match move
0x80000000|1065, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 857
-1, // $$start
-1, // start
573, // white*
-1, // $$0
MIN_REDUCTION+137, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+137, // $
-1, // $NT
  }
,
{ // state 858
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 859
89,638, // "c"
  }
,
{ // state 860
-1, // $$start
-1, // start
805, // white*
-1, // $$0
MIN_REDUCTION+119, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+119, // $
-1, // $NT
  }
,
{ // state 861
0x80000000|1, // match move
0x80000000|495, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 862
0x80000000|576, // match move
0x80000000|1062, // no-match move
// T-test match for 10:
130,
  }
,
{ // state 863
89,8, // "c"
90,8, // "l"
91,8, // "a"
92,8, // "s"
95,8, // "e"
96,8, // "!"
97,8, // "="
98,8, // "+"
102,8, // "_"
103,8, // "d"
104,8, // "g"
105,8, // "m"
106,8, // "p"
107,8, // "v"
108,8, // "y"
109,8, // {"A".."Z" "j" "q"}
110,8, // "f"
111,8, // "i"
112,8, // "o"
113,8, // "r"
114,8, // "u"
115,8, // "x"
116,8, // "b"
117,8, // "h"
118,8, // "k"
119,8, // "n"
120,8, // "t"
121,8, // "w"
122,8, // "z"
123,8, // {"0".."9"}
125,8, // " "
132,1018, // printable
133,8, // "["
134,8, // "-"
135,8, // "<"
136,8, // "|"
137,8, // "&"
138,8, // ")"
139,8, // ","
140,8, // "]"
141,8, // "/"
142,8, // ";"
143,8, // ">"
144,8, // "{"
145,8, // "%"
146,8, // "("
147,8, // "\"
148,8, // "."
149,8, // ":"
150,8, // {"#".."$" "?".."@" "^" "`" "~"}
151,8, // "}"
152,8, // "'"
153,8, // '"'
154,8, // "*"
163,1219, // multiCommentChar
164,337, // multiCommentChar**
169,1181, // multiCommentChar*
  }
,
{ // state 864
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 865
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 866
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 867
-1, // $$start
-1, // start
257, // white*
-1, // $$0
MIN_REDUCTION+139, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+139, // $
-1, // $NT
  }
,
{ // state 868
119,258, // "n"
  }
,
{ // state 869
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+314, // $NT
  }
,
{ // state 870
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 871
-1, // $$start
-1, // start
3, // white*
-1, // $$0
MIN_REDUCTION+228, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+228, // "c"
MIN_REDUCTION+228, // "l"
MIN_REDUCTION+228, // "a"
MIN_REDUCTION+228, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+228, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+228, // "d"
MIN_REDUCTION+228, // "g"
MIN_REDUCTION+228, // "m"
MIN_REDUCTION+228, // "p"
MIN_REDUCTION+228, // "v"
MIN_REDUCTION+228, // "y"
MIN_REDUCTION+228, // {"A".."Z" "j" "q"}
MIN_REDUCTION+228, // "f"
MIN_REDUCTION+228, // "i"
MIN_REDUCTION+228, // "o"
MIN_REDUCTION+228, // "r"
MIN_REDUCTION+228, // "u"
MIN_REDUCTION+228, // "x"
MIN_REDUCTION+228, // "b"
MIN_REDUCTION+228, // "h"
MIN_REDUCTION+228, // "k"
MIN_REDUCTION+228, // "n"
MIN_REDUCTION+228, // "t"
MIN_REDUCTION+228, // "w"
MIN_REDUCTION+228, // "z"
MIN_REDUCTION+228, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+228, // $
-1, // $NT
  }
,
{ // state 872
171,MIN_REDUCTION+110, // $NT
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 873
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+200, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+200, // $
-1, // $NT
  }
,
{ // state 874
95,763, // "e"
  }
,
{ // state 875
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+191, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+191, // $
-1, // $NT
  }
,
{ // state 876
0x80000000|1, // match move
0x80000000|983, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 877
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+188, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+188, // $
-1, // $NT
  }
,
{ // state 878
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 879
90,1052, // "l"
  }
,
{ // state 880
0x80000000|1293, // match move
0x80000000|990, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 881
0x80000000|1, // match move
0x80000000|691, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 882
90,1227, // "l"
91,269, // "a"
111,419, // "i"
112,444, // "o"
  }
,
{ // state 883
0x80000000|1, // match move
0x80000000|743, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 884
113,90, // "r"
  }
,
{ // state 885
154,455, // "*"
163,1219, // multiCommentChar
164,337, // multiCommentChar**
169,1181, // multiCommentChar*
  }
,
{ // state 886
111,650, // "i"
112,684, // "o"
  }
,
{ // state 887
113,446, // "r"
  }
,
{ // state 888
0x80000000|1, // match move
0x80000000|758, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 889
0x80000000|1, // match move
0x80000000|1083, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 890
0x80000000|542, // match move
0x80000000|1079, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 891
108,517, // "y"
114,1258, // "u"
117,613, // "h"
120,1270, // "t"
121,672, // "w"
  }
,
{ // state 892
104,343, // "g"
  }
,
{ // state 893
-1, // $$start
-1, // start
833, // white*
-1, // $$0
MIN_REDUCTION+131, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
-1, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
-1, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
MIN_REDUCTION+131, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+131, // $
-1, // $NT
  }
,
{ // state 894
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 895
0x80000000|1186, // match move
0x80000000|1016, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 896
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 897
92,1020, // "s"
  }
,
{ // state 898
2,837, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+195, // $NT
  }
,
{ // state 899
171,MIN_REDUCTION+271, // $NT
  }
,
{ // state 900
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+251, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+251, // $
-1, // $NT
  }
,
{ // state 901
89,136, // "c"
  }
,
{ // state 902
-1, // $$start
-1, // start
1115, // white*
-1, // $$0
MIN_REDUCTION+159, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+159, // $
-1, // $NT
  }
,
{ // state 903
90,552, // "l"
  }
,
{ // state 904
90,1112, // "l"
  }
,
{ // state 905
114,637, // "u"
  }
,
{ // state 906
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 907
121,1321, // "w"
  }
,
{ // state 908
2,666, // white*
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 909
0x80000000|15, // match move
0x80000000|1323, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 910
89,8, // "c"
90,8, // "l"
91,8, // "a"
92,8, // "s"
95,8, // "e"
96,8, // "!"
97,8, // "="
98,8, // "+"
102,8, // "_"
103,8, // "d"
104,8, // "g"
105,8, // "m"
106,8, // "p"
107,8, // "v"
108,8, // "y"
109,8, // {"A".."Z" "j" "q"}
110,8, // "f"
111,8, // "i"
112,8, // "o"
113,8, // "r"
114,8, // "u"
115,8, // "x"
116,8, // "b"
117,8, // "h"
118,8, // "k"
119,8, // "n"
120,8, // "t"
121,8, // "w"
122,8, // "z"
123,8, // {"0".."9"}
125,8, // " "
132,1018, // printable
133,8, // "["
134,8, // "-"
135,8, // "<"
136,8, // "|"
137,8, // "&"
138,8, // ")"
139,8, // ","
140,8, // "]"
141,8, // "/"
142,8, // ";"
143,8, // ">"
144,8, // "{"
145,8, // "%"
146,8, // "("
147,8, // "\"
148,8, // "."
149,8, // ":"
150,8, // {"#".."$" "?".."@" "^" "`" "~"}
151,8, // "}"
152,8, // "'"
153,8, // '"'
154,8, // "*"
163,1219, // multiCommentChar
164,85, // multiCommentChar**
169,1181, // multiCommentChar*
  }
,
{ // state 911
2,1150, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+228, // $NT
  }
,
{ // state 912
0x80000000|1, // match move
0x80000000|898, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 913
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 914
0x80000000|989, // match move
0x80000000|976, // no-match move
// T-test match for "\":
147,
  }
,
{ // state 915
-1, // $$start
-1, // start
150, // white*
-1, // $$0
MIN_REDUCTION+204, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+204, // "c"
MIN_REDUCTION+204, // "l"
MIN_REDUCTION+204, // "a"
MIN_REDUCTION+204, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+204, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+204, // "d"
MIN_REDUCTION+204, // "g"
MIN_REDUCTION+204, // "m"
MIN_REDUCTION+204, // "p"
MIN_REDUCTION+204, // "v"
MIN_REDUCTION+204, // "y"
MIN_REDUCTION+204, // {"A".."Z" "j" "q"}
MIN_REDUCTION+204, // "f"
MIN_REDUCTION+204, // "i"
MIN_REDUCTION+204, // "o"
MIN_REDUCTION+204, // "r"
MIN_REDUCTION+204, // "u"
MIN_REDUCTION+204, // "x"
MIN_REDUCTION+204, // "b"
MIN_REDUCTION+204, // "h"
MIN_REDUCTION+204, // "k"
MIN_REDUCTION+204, // "n"
MIN_REDUCTION+204, // "t"
MIN_REDUCTION+204, // "w"
MIN_REDUCTION+204, // "z"
MIN_REDUCTION+204, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+204, // $
-1, // $NT
  }
,
{ // state 916
0x80000000|1151, // match move
0x80000000|804, // no-match move
// T-test match for "*":
154,
  }
,
{ // state 917
0x80000000|395, // match move
0x80000000|877, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
};
}
private class Initter6{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 918
92,816, // "s"
120,1225, // "t"
  }
,
{ // state 919
106,299, // "p"
  }
,
{ // state 920
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 921
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+176, // $NT
  }
,
{ // state 922
-1, // $$start
-1, // start
1172, // white*
-1, // $$0
MIN_REDUCTION+129, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+129, // $
-1, // $NT
  }
,
{ // state 923
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 924
0x80000000|1, // match move
0x80000000|1004, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 925
120,182, // "t"
  }
,
{ // state 926
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 927
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 928
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+278, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+278, // $
-1, // $NT
  }
,
{ // state 929
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 930
122,1306, // "z"
  }
,
{ // state 931
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+308, // $NT
  }
,
{ // state 932
112,385, // "o"
  }
,
{ // state 933
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 934
2,978, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+216, // $NT
  }
,
{ // state 935
0x80000000|913, // match move
0x80000000|503, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 936
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 937
2,713, // white*
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 938
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 939
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 940
121,95, // "w"
  }
,
{ // state 941
113,229, // "r"
  }
,
{ // state 942
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 943
154,455, // "*"
163,1219, // multiCommentChar
164,85, // multiCommentChar**
169,1181, // multiCommentChar*
  }
,
{ // state 944
0x80000000|1273, // match move
0x80000000|167, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 945
95,32, // "e"
  }
,
{ // state 946
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+212, // $NT
  }
,
{ // state 947
111,1316, // "i"
  }
,
{ // state 948
171,MIN_REDUCTION+205, // $NT
  }
,
{ // state 949
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 950
0x80000000|1, // match move
0x80000000|851, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 951
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 952
0x80000000|1, // match move
0x80000000|994, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 953
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+167, // $NT
  }
,
{ // state 954
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+170, // $NT
  }
,
{ // state 955
111,101, // "i"
112,1102, // "o"
  }
,
{ // state 956
0x80000000|1, // match move
0x80000000|842, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 957
113,47, // "r"
  }
,
{ // state 958
92,156, // "s"
  }
,
{ // state 959
114,1158, // "u"
  }
,
{ // state 960
2,227, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+306, // $NT
  }
,
{ // state 961
2,309, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+189, // $NT
  }
,
{ // state 962
91,1066, // "a"
  }
,
{ // state 963
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 964
0x80000000|157, // match move
0x80000000|1160, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 965
105,361, // "m"
  }
,
{ // state 966
119,662, // "n"
  }
,
{ // state 967
92,261, // "s"
  }
,
{ // state 968
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 969
-1, // $$start
-1, // start
1192, // white*
-1, // $$0
MIN_REDUCTION+255, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+255, // "c"
MIN_REDUCTION+255, // "l"
MIN_REDUCTION+255, // "a"
MIN_REDUCTION+255, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+255, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+255, // "d"
MIN_REDUCTION+255, // "g"
MIN_REDUCTION+255, // "m"
MIN_REDUCTION+255, // "p"
MIN_REDUCTION+255, // "v"
MIN_REDUCTION+255, // "y"
MIN_REDUCTION+255, // {"A".."Z" "j" "q"}
MIN_REDUCTION+255, // "f"
MIN_REDUCTION+255, // "i"
MIN_REDUCTION+255, // "o"
MIN_REDUCTION+255, // "r"
MIN_REDUCTION+255, // "u"
MIN_REDUCTION+255, // "x"
MIN_REDUCTION+255, // "b"
MIN_REDUCTION+255, // "h"
MIN_REDUCTION+255, // "k"
MIN_REDUCTION+255, // "n"
MIN_REDUCTION+255, // "t"
MIN_REDUCTION+255, // "w"
MIN_REDUCTION+255, // "z"
MIN_REDUCTION+255, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+255, // $
-1, // $NT
  }
,
{ // state 970
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 971
2,1034, // white*
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 972
0x80000000|83, // match move
0x80000000|450, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 973
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 974
0x80000000|345, // match move
0x80000000|594, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 975
112,418, // "o"
  }
,
{ // state 976
0x80000000|218, // match move
0x80000000|250, // no-match move
// T-test match for '"':
153,
  }
,
{ // state 977
111,1280, // "i"
  }
,
{ // state 978
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+215, // $NT
  }
,
{ // state 979
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 980
1,767, // start
2,143, // white*
3,979, // $$0
4,76, // token
5,1155, // `boolean
6,224, // `class
7,322, // `extends
8,894, // `void
9,936, // `int
10,1274, // `while
11,166, // `if
12,201, // `else
13,765, // `for
14,473, // `break
15,1070, // `this
16,1198, // `false
17,1033, // `true
18,141, // `super
19,755, // `null
20,1162, // `return
21,1123, // `instanceof
22,565, // `new
23,929, // `abstract
24,760, // `assert
25,799, // `byte
26,117, // `case
27,1291, // `catch
28,570, // `char
29,751, // `const
30,1078, // `continue
31,661, // `default
32,1042, // `do
33,461, // `double
34,160, // `enum
35,988, // `final
36,1002, // `finally
37,334, // `float
38,443, // `goto
39,784, // `implements
40,939, // `import
41,633, // `interface
42,412, // `long
43,40, // `native
44,1328, // `package
45,1282, // `private
46,1191, // `protected
47,718, // `public
48,864, // `short
49,688, // `static
50,1100, // `strictfp
51,126, // `switch
52,86, // `synchronized
53,314, // `throw
54,1248, // `throws
55,708, // `transient
56,1138, // `try
57,1292, // `volatile
89,376, // "c"
90,245, // "l"
91,1174, // "a"
92,1106, // "s"
95,1168, // "e"
103,1156, // "d"
104,975, // "g"
106,1130, // "p"
107,1271, // "v"
110,882, // "f"
111,92, // "i"
113,587, // "r"
116,1215, // "b"
119,564, // "n"
120,219, // "t"
121,854, // "w"
165,759, // token*
170,MIN_REDUCTION+1, // $
  }
,
{ // state 981
0x80000000|559, // match move
0x80000000|830, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 982
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+130, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+130, // $
-1, // $NT
  }
,
{ // state 983
2,387, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+252, // $NT
  }
,
{ // state 984
0x80000000|1, // match move
0x80000000|321, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 985
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 986
0x80000000|971, // match move
0x80000000|1226, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 987
89,1253, // "c"
  }
,
{ // state 988
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 989
159,973, // $$2
  }
,
{ // state 990
-1, // $$start
-1, // start
1183, // white*
-1, // $$0
MIN_REDUCTION+355, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+355, // $
-1, // $NT
  }
,
{ // state 991
-1, // $$start
-1, // start
566, // white*
-1, // $$0
MIN_REDUCTION+117, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+117, // $
-1, // $NT
  }
,
{ // state 992
0x80000000|1, // match move
0x80000000|961, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 993
171,MIN_REDUCTION+247, // $NT
  }
,
{ // state 994
-1, // $$start
-1, // start
1011, // white*
-1, // $$0
MIN_REDUCTION+201, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+201, // "c"
MIN_REDUCTION+201, // "l"
MIN_REDUCTION+201, // "a"
MIN_REDUCTION+201, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+201, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+201, // "d"
MIN_REDUCTION+201, // "g"
MIN_REDUCTION+201, // "m"
MIN_REDUCTION+201, // "p"
MIN_REDUCTION+201, // "v"
MIN_REDUCTION+201, // "y"
MIN_REDUCTION+201, // {"A".."Z" "j" "q"}
MIN_REDUCTION+201, // "f"
MIN_REDUCTION+201, // "i"
MIN_REDUCTION+201, // "o"
MIN_REDUCTION+201, // "r"
MIN_REDUCTION+201, // "u"
MIN_REDUCTION+201, // "x"
MIN_REDUCTION+201, // "b"
MIN_REDUCTION+201, // "h"
MIN_REDUCTION+201, // "k"
MIN_REDUCTION+201, // "n"
MIN_REDUCTION+201, // "t"
MIN_REDUCTION+201, // "w"
MIN_REDUCTION+201, // "z"
MIN_REDUCTION+201, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+201, // $
-1, // $NT
  }
,
{ // state 995
141,429, // "/"
154,352, // "*"
  }
,
{ // state 996
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 997
171,MIN_REDUCTION+304, // $NT
  }
,
{ // state 998
0x80000000|1319, // match move
0x80000000|225, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 999
95,581, // "e"
  }
,
{ // state 1000
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+206, // $NT
  }
,
{ // state 1001
0x80000000|481, // match move
0x80000000|578, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 1002
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 1003
110,69, // "f"
  }
,
{ // state 1004
-1, // $$start
-1, // start
935, // white*
-1, // $$0
MIN_REDUCTION+243, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+243, // "c"
MIN_REDUCTION+243, // "l"
MIN_REDUCTION+243, // "a"
MIN_REDUCTION+243, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+243, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+243, // "d"
MIN_REDUCTION+243, // "g"
MIN_REDUCTION+243, // "m"
MIN_REDUCTION+243, // "p"
MIN_REDUCTION+243, // "v"
MIN_REDUCTION+243, // "y"
MIN_REDUCTION+243, // {"A".."Z" "j" "q"}
MIN_REDUCTION+243, // "f"
MIN_REDUCTION+243, // "i"
MIN_REDUCTION+243, // "o"
MIN_REDUCTION+243, // "r"
MIN_REDUCTION+243, // "u"
MIN_REDUCTION+243, // "x"
MIN_REDUCTION+243, // "b"
MIN_REDUCTION+243, // "h"
MIN_REDUCTION+243, // "k"
MIN_REDUCTION+243, // "n"
MIN_REDUCTION+243, // "t"
MIN_REDUCTION+243, // "w"
MIN_REDUCTION+243, // "z"
MIN_REDUCTION+243, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+243, // $
-1, // $NT
  }
,
{ // state 1005
0x80000000|1, // match move
0x80000000|553, // no-match move
// T-test match for '"':
153,
  }
,
{ // state 1006
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 1007
92,796, // "s"
  }
,
{ // state 1008
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 1009
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+194, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+194, // $
-1, // $NT
  }
,
{ // state 1010
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 1011
0x80000000|716, // match move
0x80000000|873, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 1012
118,757, // "k"
  }
,
{ // state 1013
2,1245, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+231, // $NT
  }
,
{ // state 1014
2,217, // white*
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 1015
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+293, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+293, // $
-1, // $NT
  }
,
{ // state 1016
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+296, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+296, // $
-1, // $NT
  }
,
{ // state 1017
-1, // $$start
-1, // start
265, // white*
-1, // $$0
MIN_REDUCTION+276, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+276, // "c"
MIN_REDUCTION+276, // "l"
MIN_REDUCTION+276, // "a"
MIN_REDUCTION+276, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+276, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+276, // "d"
MIN_REDUCTION+276, // "g"
MIN_REDUCTION+276, // "m"
MIN_REDUCTION+276, // "p"
MIN_REDUCTION+276, // "v"
MIN_REDUCTION+276, // "y"
MIN_REDUCTION+276, // {"A".."Z" "j" "q"}
MIN_REDUCTION+276, // "f"
MIN_REDUCTION+276, // "i"
MIN_REDUCTION+276, // "o"
MIN_REDUCTION+276, // "r"
MIN_REDUCTION+276, // "u"
MIN_REDUCTION+276, // "x"
MIN_REDUCTION+276, // "b"
MIN_REDUCTION+276, // "h"
MIN_REDUCTION+276, // "k"
MIN_REDUCTION+276, // "n"
MIN_REDUCTION+276, // "t"
MIN_REDUCTION+276, // "w"
MIN_REDUCTION+276, // "z"
MIN_REDUCTION+276, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+276, // $
-1, // $NT
  }
,
{ // state 1018
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 1019
171,MIN_REDUCTION+268, // $NT
  }
,
{ // state 1020
95,827, // "e"
  }
,
{ // state 1021
171,MIN_REDUCTION+341, // $NT
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 1022
92,722, // "s"
  }
,
{ // state 1023
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+134, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+134, // $
-1, // $NT
  }
,
{ // state 1024
0x80000000|373, // match move
0x80000000|66, // no-match move
0x80000000|511, // NT-test-match state for commentChar
  }
,
{ // state 1025
2,669, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+192, // $NT
  }
,
{ // state 1026
91,925, // "a"
  }
,
{ // state 1027
0x80000000|1205, // match move
0x80000000|781, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 1028
134,18, // "-"
  }
,
{ // state 1029
97,108, // "="
  }
,
{ // state 1030
119,1302, // "n"
  }
,
{ // state 1031
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 1032
-1, // $$start
-1, // start
1238, // white*
-1, // $$0
MIN_REDUCTION+93, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+93, // "c"
MIN_REDUCTION+93, // "l"
MIN_REDUCTION+93, // "a"
MIN_REDUCTION+93, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+93, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+93, // "d"
MIN_REDUCTION+93, // "g"
MIN_REDUCTION+93, // "m"
MIN_REDUCTION+93, // "p"
MIN_REDUCTION+93, // "v"
MIN_REDUCTION+93, // "y"
MIN_REDUCTION+93, // {"A".."Z" "j" "q"}
MIN_REDUCTION+93, // "f"
MIN_REDUCTION+93, // "i"
MIN_REDUCTION+93, // "o"
MIN_REDUCTION+93, // "r"
MIN_REDUCTION+93, // "u"
MIN_REDUCTION+93, // "x"
MIN_REDUCTION+93, // "b"
MIN_REDUCTION+93, // "h"
MIN_REDUCTION+93, // "k"
MIN_REDUCTION+93, // "n"
MIN_REDUCTION+93, // "t"
MIN_REDUCTION+93, // "w"
MIN_REDUCTION+93, // "z"
MIN_REDUCTION+93, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+93, // $
-1, // $NT
  }
,
{ // state 1033
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 1034
0x80000000|41, // match move
0x80000000|561, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 1035
0x80000000|878, // match move
0x80000000|725, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 1036
111,631, // "i"
  }
,
{ // state 1037
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 1038
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+92, // $NT
  }
,
{ // state 1039
171,MIN_REDUCTION+208, // $NT
  }
,
{ // state 1040
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 1041
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+254, // $NT
  }
,
{ // state 1042
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 1043
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 1044
0x80000000|598, // match move
0x80000000|509, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 1045
119,491, // "n"
  }
,
{ // state 1046
-1, // $$start
-1, // start
791, // white*
-1, // $$0
MIN_REDUCTION+320, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+320, // "c"
MIN_REDUCTION+320, // "l"
MIN_REDUCTION+320, // "a"
MIN_REDUCTION+320, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+320, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+320, // "d"
MIN_REDUCTION+320, // "g"
MIN_REDUCTION+320, // "m"
MIN_REDUCTION+320, // "p"
MIN_REDUCTION+320, // "v"
MIN_REDUCTION+320, // "y"
MIN_REDUCTION+320, // {"A".."Z" "j" "q"}
MIN_REDUCTION+320, // "f"
MIN_REDUCTION+320, // "i"
MIN_REDUCTION+320, // "o"
MIN_REDUCTION+320, // "r"
MIN_REDUCTION+320, // "u"
MIN_REDUCTION+320, // "x"
MIN_REDUCTION+320, // "b"
MIN_REDUCTION+320, // "h"
MIN_REDUCTION+320, // "k"
MIN_REDUCTION+320, // "n"
MIN_REDUCTION+320, // "t"
MIN_REDUCTION+320, // "w"
MIN_REDUCTION+320, // "z"
MIN_REDUCTION+320, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
890, // idChar**
198, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
585, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+320, // $
-1, // $NT
  }
,
{ // state 1047
120,999, // "t"
  }
,
{ // state 1048
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 1049
120,601, // "t"
  }
,
{ // state 1050
92,807, // "s"
  }
,
{ // state 1051
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+275, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+275, // $
-1, // $NT
  }
,
{ // state 1052
120,1104, // "t"
  }
,
{ // state 1053
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1054
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+233, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+233, // $
-1, // $NT
  }
,
{ // state 1055
2,428, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+291, // $NT
  }
,
{ // state 1056
2,1115, // white*
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 1057
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+114, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+114, // $
-1, // $NT
  }
,
{ // state 1058
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+239, // $NT
  }
,
{ // state 1059
171,MIN_REDUCTION+283, // $NT
  }
,
{ // state 1060
0x80000000|1, // match move
0x80000000|1169, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 1061
91,550, // "a"
  }
,
{ // state 1062
171,MIN_REDUCTION+112, // $NT
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 1063
-1, // $$start
-1, // start
1105, // white*
-1, // $$0
MIN_REDUCTION+125, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+125, // $
-1, // $NT
  }
,
{ // state 1064
0x80000000|1, // match move
0x80000000|1055, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 1065
-1, // $$start
-1, // start
1143, // white*
-1, // $$0
MIN_REDUCTION+219, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+219, // "c"
MIN_REDUCTION+219, // "l"
MIN_REDUCTION+219, // "a"
MIN_REDUCTION+219, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+219, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+219, // "d"
MIN_REDUCTION+219, // "g"
MIN_REDUCTION+219, // "m"
MIN_REDUCTION+219, // "p"
MIN_REDUCTION+219, // "v"
MIN_REDUCTION+219, // "y"
MIN_REDUCTION+219, // {"A".."Z" "j" "q"}
MIN_REDUCTION+219, // "f"
MIN_REDUCTION+219, // "i"
MIN_REDUCTION+219, // "o"
MIN_REDUCTION+219, // "r"
MIN_REDUCTION+219, // "u"
MIN_REDUCTION+219, // "x"
MIN_REDUCTION+219, // "b"
MIN_REDUCTION+219, // "h"
MIN_REDUCTION+219, // "k"
MIN_REDUCTION+219, // "n"
MIN_REDUCTION+219, // "t"
MIN_REDUCTION+219, // "w"
MIN_REDUCTION+219, // "z"
MIN_REDUCTION+219, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+219, // $
-1, // $NT
  }
,
{ // state 1066
90,681, // "l"
  }
,
{ // state 1067
0x80000000|1199, // match move
0x80000000|501, // no-match move
// T-test match for "=":
97,
  }
,
{ // state 1068
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 1069
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 1070
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 1071
2,522, // white*
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 1072
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 1073
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 1074
171,MIN_REDUCTION+178, // $NT
  }
,
{ // state 1075
90,1195, // "l"
  }
,
{ // state 1076
112,96, // "o"
  }
,
{ // state 1077
90,829, // "l"
115,1047, // "x"
119,643, // "n"
  }
,
{ // state 1078
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 1079
-1, // $$start
-1, // start
791, // white*
-1, // $$0
MIN_REDUCTION+318, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
926, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+318, // $
-1, // $NT
  }
,
{ // state 1080
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+227, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+227, // $
-1, // $NT
  }
,
{ // state 1081
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+224, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+224, // $
-1, // $NT
  }
,
{ // state 1082
95,861, // "e"
  }
,
{ // state 1083
-1, // $$start
-1, // start
603, // white*
-1, // $$0
MIN_REDUCTION+261, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+261, // "c"
MIN_REDUCTION+261, // "l"
MIN_REDUCTION+261, // "a"
MIN_REDUCTION+261, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+261, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+261, // "d"
MIN_REDUCTION+261, // "g"
MIN_REDUCTION+261, // "m"
MIN_REDUCTION+261, // "p"
MIN_REDUCTION+261, // "v"
MIN_REDUCTION+261, // "y"
MIN_REDUCTION+261, // {"A".."Z" "j" "q"}
MIN_REDUCTION+261, // "f"
MIN_REDUCTION+261, // "i"
MIN_REDUCTION+261, // "o"
MIN_REDUCTION+261, // "r"
MIN_REDUCTION+261, // "u"
MIN_REDUCTION+261, // "x"
MIN_REDUCTION+261, // "b"
MIN_REDUCTION+261, // "h"
MIN_REDUCTION+261, // "k"
MIN_REDUCTION+261, // "n"
MIN_REDUCTION+261, // "t"
MIN_REDUCTION+261, // "w"
MIN_REDUCTION+261, // "z"
MIN_REDUCTION+261, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+261, // $
-1, // $NT
  }
,
{ // state 1084
171,MIN_REDUCTION+181, // $NT
  }
,
{ // state 1085
111,859, // "i"
  }
,
{ // state 1086
119,133, // "n"
  }
,
{ // state 1087
2,205, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+249, // $NT
  }
,
{ // state 1088
-1, // $$start
-1, // start
568, // white*
-1, // $$0
MIN_REDUCTION+246, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+246, // "c"
MIN_REDUCTION+246, // "l"
MIN_REDUCTION+246, // "a"
MIN_REDUCTION+246, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+246, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+246, // "d"
MIN_REDUCTION+246, // "g"
MIN_REDUCTION+246, // "m"
MIN_REDUCTION+246, // "p"
MIN_REDUCTION+246, // "v"
MIN_REDUCTION+246, // "y"
MIN_REDUCTION+246, // {"A".."Z" "j" "q"}
MIN_REDUCTION+246, // "f"
MIN_REDUCTION+246, // "i"
MIN_REDUCTION+246, // "o"
MIN_REDUCTION+246, // "r"
MIN_REDUCTION+246, // "u"
MIN_REDUCTION+246, // "x"
MIN_REDUCTION+246, // "b"
MIN_REDUCTION+246, // "h"
MIN_REDUCTION+246, // "k"
MIN_REDUCTION+246, // "n"
MIN_REDUCTION+246, // "t"
MIN_REDUCTION+246, // "w"
MIN_REDUCTION+246, // "z"
MIN_REDUCTION+246, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+246, // $
-1, // $NT
  }
};
}
private class Initter7{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 1089
0x80000000|1, // match move
0x80000000|100, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 1090
118,888, // "k"
  }
,
{ // state 1091
0x80000000|1, // match move
0x80000000|1025, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 1092
0x80000000|1, // match move
0x80000000|1005, // no-match move
// T-test match for "\":
147,
  }
,
{ // state 1093
107,874, // "v"
  }
,
{ // state 1094
2,340, // white*
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 1095
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 1096
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 1097
117,823, // "h"
  }
,
{ // state 1098
90,1101, // "l"
91,1310, // "a"
111,125, // "i"
112,887, // "o"
  }
,
{ // state 1099
0x80000000|1, // match move
0x80000000|1088, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 1100
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 1101
112,1176, // "o"
  }
,
{ // state 1102
120,744, // "t"
  }
,
{ // state 1103
-1, // $$start
-1, // start
819, // white*
-1, // $$0
MIN_REDUCTION+325, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+325, // $
-1, // $NT
  }
,
{ // state 1104
0x80000000|1, // match move
0x80000000|75, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 1105
0x80000000|797, // match move
0x80000000|382, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 1106
108,1257, // "y"
114,211, // "u"
117,516, // "h"
120,563, // "t"
121,289, // "w"
  }
,
{ // state 1107
171,MIN_REDUCTION+301, // $NT
  }
,
{ // state 1108
0x80000000|247, // match move
0x80000000|300, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 1109
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+278, // $NT
  }
,
{ // state 1110
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 1111
0x80000000|1, // match move
0x80000000|813, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 1112
108,876, // "y"
  }
,
{ // state 1113
110,847, // "f"
  }
,
{ // state 1114
2,805, // white*
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 1115
0x80000000|689, // match move
0x80000000|537, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 1116
-1, // $$start
-1, // start
-1, // white*
6, // $$0
76, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
933, // white
599, // " "
599, // {9 12}
1006, // eol
105, // singleLineComment
439, // multiLineComment
1110, // {10}
364, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
1277, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
1166, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
759, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 1117
171,MIN_REDUCTION+106, // $NT
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 1118
171,MIN_REDUCTION+193, // $NT
  }
,
{ // state 1119
0x80000000|62, // match move
0x80000000|1311, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 1120
90,984, // "l"
  }
,
{ // state 1121
89,678, // "c"
  }
,
{ // state 1122
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 1123
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 1124
0x80000000|1, // match move
0x80000000|91, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 1125
120,377, // "t"
  }
,
{ // state 1126
171,MIN_REDUCTION+313, // $NT
  }
,
{ // state 1127
0x80000000|186, // match move
0x80000000|608, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 1128
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+281, // $NT
  }
,
{ // state 1129
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 1130
91,124, // "a"
113,886, // "r"
114,1329, // "u"
  }
,
{ // state 1131
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+185, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+185, // $
-1, // $NT
  }
,
{ // state 1132
95,1146, // "e"
  }
,
{ // state 1133
97,188, // "="
  }
,
{ // state 1134
0x80000000|787, // match move
0x80000000|1081, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 1135
89,780, // "c"
  }
,
{ // state 1136
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 1137
171,MIN_REDUCTION+220, // $NT
  }
,
{ // state 1138
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 1139
-1, // $$start
-1, // start
972, // white*
-1, // $$0
MIN_REDUCTION+240, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+240, // "c"
MIN_REDUCTION+240, // "l"
MIN_REDUCTION+240, // "a"
MIN_REDUCTION+240, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+240, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+240, // "d"
MIN_REDUCTION+240, // "g"
MIN_REDUCTION+240, // "m"
MIN_REDUCTION+240, // "p"
MIN_REDUCTION+240, // "v"
MIN_REDUCTION+240, // "y"
MIN_REDUCTION+240, // {"A".."Z" "j" "q"}
MIN_REDUCTION+240, // "f"
MIN_REDUCTION+240, // "i"
MIN_REDUCTION+240, // "o"
MIN_REDUCTION+240, // "r"
MIN_REDUCTION+240, // "u"
MIN_REDUCTION+240, // "x"
MIN_REDUCTION+240, // "b"
MIN_REDUCTION+240, // "h"
MIN_REDUCTION+240, // "k"
MIN_REDUCTION+240, // "n"
MIN_REDUCTION+240, // "t"
MIN_REDUCTION+240, // "w"
MIN_REDUCTION+240, // "z"
MIN_REDUCTION+240, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+240, // $
-1, // $NT
  }
,
{ // state 1140
117,941, // "h"
  }
,
{ // state 1141
95,415, // "e"
  }
,
{ // state 1142
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+176, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+176, // $
-1, // $NT
  }
,
{ // state 1143
0x80000000|923, // match move
0x80000000|524, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 1144
0x80000000|262, // match move
0x80000000|1259, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 1145
92,31, // "s"
  }
,
{ // state 1146
0x80000000|1, // match move
0x80000000|34, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 1147
90,132, // "l"
111,10, // "i"
  }
,
{ // state 1148
91,709, // "a"
  }
,
{ // state 1149
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+260, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+260, // $
-1, // $NT
  }
,
{ // state 1150
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+227, // $NT
  }
,
{ // state 1151
154,750, // "*"
  }
,
{ // state 1152
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 1153
90,575, // "l"
  }
,
{ // state 1154
120,1212, // "t"
  }
,
{ // state 1155
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 1156
95,590, // "e"
112,44, // "o"
  }
,
{ // state 1157
119,202, // "n"
  }
,
{ // state 1158
95,471, // "e"
  }
,
{ // state 1159
171,MIN_REDUCTION+104, // $NT
  }
,
{ // state 1160
-1, // $$start
-1, // start
1001, // white*
-1, // $$0
MIN_REDUCTION+121, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+121, // $
-1, // $NT
  }
,
{ // state 1161
103,230, // "d"
  }
,
{ // state 1162
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 1163
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 1164
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 1165
0x80000000|350, // match move
0x80000000|77, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 1166
127,671, // eol
130,1110, // {10}
131,364, // {13}
  }
,
{ // state 1167
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 1168
90,425, // "l"
115,771, // "x"
119,447, // "n"
  }
,
{ // state 1169
2,1239, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+243, // $NT
  }
,
{ // state 1170
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 1171
89,274, // "c"
90,274, // "l"
91,274, // "a"
92,274, // "s"
95,274, // "e"
96,274, // "!"
97,274, // "="
98,274, // "+"
102,274, // "_"
103,274, // "d"
104,274, // "g"
105,274, // "m"
106,274, // "p"
107,274, // "v"
108,274, // "y"
109,274, // {"A".."Z" "j" "q"}
110,274, // "f"
111,274, // "i"
112,274, // "o"
113,274, // "r"
114,274, // "u"
115,274, // "x"
116,274, // "b"
117,274, // "h"
118,274, // "k"
119,274, // "n"
120,274, // "t"
121,274, // "w"
122,274, // "z"
123,274, // {"0".."9"}
125,274, // " "
132,453, // printable
133,274, // "["
134,274, // "-"
135,274, // "<"
136,274, // "|"
137,274, // "&"
138,274, // ")"
139,274, // ","
140,274, // "]"
141,274, // "/"
142,274, // ";"
143,274, // ">"
144,274, // "{"
145,274, // "%"
146,274, // "("
147,274, // "\"
148,274, // "."
149,274, // ":"
150,274, // {"#".."$" "?".."@" "^" "`" "~"}
151,274, // "}"
152,274, // "'"
153,274, // '"'
154,274, // "*"
160,1024, // commentChar
  }
,
{ // state 1172
0x80000000|896, // match move
0x80000000|639, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 1173
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 1174
92,958, // "s"
116,821, // "b"
  }
,
{ // state 1175
2,515, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+219, // $NT
  }
,
{ // state 1176
91,307, // "a"
  }
,
{ // state 1177
91,420, // "a"
  }
,
{ // state 1178
171,MIN_REDUCTION+175, // $NT
  }
,
{ // state 1179
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+263, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+263, // $
-1, // $NT
  }
,
{ // state 1180
114,884, // "u"
  }
,
{ // state 1181
0x80000000|67, // match move
0x80000000|220, // no-match move
// T-test match for "*":
154,
  }
,
{ // state 1182
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+156, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+156, // $
-1, // $NT
  }
,
{ // state 1183
0x80000000|232, // match move
0x80000000|1295, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 1184
111,407, // "i"
  }
,
{ // state 1185
120,318, // "t"
  }
,
{ // state 1186
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 1187
2,1221, // white*
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 1188
0x80000000|487, // match move
0x80000000|25, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 1189
0x80000000|1, // match move
0x80000000|1296, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 1190
171,MIN_REDUCTION+229, // $NT
  }
,
{ // state 1191
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 1192
0x80000000|844, // match move
0x80000000|739, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 1193
2,127, // white*
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 1194
119,459, // "n"
  }
,
{ // state 1195
108,1089, // "y"
  }
,
{ // state 1196
0x80000000|60, // match move
0x80000000|490, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 1197
2,51, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+165, // $NT
  }
,
{ // state 1198
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 1199
97,944, // "="
  }
,
{ // state 1200
0x80000000|1, // match move
0x80000000|727, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 1201
92,702, // "s"
  }
,
{ // state 1202
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+118, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+118, // $
-1, // $NT
  }
,
{ // state 1203
122,426, // "z"
  }
,
{ // state 1204
92,546, // "s"
120,947, // "t"
  }
,
{ // state 1205
2,355, // white*
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 1206
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1207
90,231, // "l"
112,1286, // "o"
  }
,
{ // state 1208
-1, // $$start
-1, // start
53, // white*
-1, // $$0
MIN_REDUCTION+216, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+216, // "c"
MIN_REDUCTION+216, // "l"
MIN_REDUCTION+216, // "a"
MIN_REDUCTION+216, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+216, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+216, // "d"
MIN_REDUCTION+216, // "g"
MIN_REDUCTION+216, // "m"
MIN_REDUCTION+216, // "p"
MIN_REDUCTION+216, // "v"
MIN_REDUCTION+216, // "y"
MIN_REDUCTION+216, // {"A".."Z" "j" "q"}
MIN_REDUCTION+216, // "f"
MIN_REDUCTION+216, // "i"
MIN_REDUCTION+216, // "o"
MIN_REDUCTION+216, // "r"
MIN_REDUCTION+216, // "u"
MIN_REDUCTION+216, // "x"
MIN_REDUCTION+216, // "b"
MIN_REDUCTION+216, // "h"
MIN_REDUCTION+216, // "k"
MIN_REDUCTION+216, // "n"
MIN_REDUCTION+216, // "t"
MIN_REDUCTION+216, // "w"
MIN_REDUCTION+216, // "z"
MIN_REDUCTION+216, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+216, // $
-1, // $NT
  }
,
{ // state 1209
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+275, // $NT
  }
,
{ // state 1210
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 1211
-1, // $$start
-1, // start
1246, // white*
-1, // $$0
MIN_REDUCTION+279, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+279, // "c"
MIN_REDUCTION+279, // "l"
MIN_REDUCTION+279, // "a"
MIN_REDUCTION+279, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+279, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+279, // "d"
MIN_REDUCTION+279, // "g"
MIN_REDUCTION+279, // "m"
MIN_REDUCTION+279, // "p"
MIN_REDUCTION+279, // "v"
MIN_REDUCTION+279, // "y"
MIN_REDUCTION+279, // {"A".."Z" "j" "q"}
MIN_REDUCTION+279, // "f"
MIN_REDUCTION+279, // "i"
MIN_REDUCTION+279, // "o"
MIN_REDUCTION+279, // "r"
MIN_REDUCTION+279, // "u"
MIN_REDUCTION+279, // "x"
MIN_REDUCTION+279, // "b"
MIN_REDUCTION+279, // "h"
MIN_REDUCTION+279, // "k"
MIN_REDUCTION+279, // "n"
MIN_REDUCTION+279, // "t"
MIN_REDUCTION+279, // "w"
MIN_REDUCTION+279, // "z"
MIN_REDUCTION+279, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+279, // $
-1, // $NT
  }
,
{ // state 1212
111,252, // "i"
  }
,
{ // state 1213
0x80000000|1214, // match move
0x80000000|922, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 1214
2,1172, // white*
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 1215
108,281, // "y"
112,389, // "o"
113,347, // "r"
  }
,
{ // state 1216
95,912, // "e"
  }
,
{ // state 1217
102,MIN_REDUCTION+104, // "_"
155,MIN_REDUCTION+104, // idChar**
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1218
90,384, // "l"
  }
,
{ // state 1219
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 1220
92,992, // "s"
  }
,
{ // state 1221
0x80000000|200, // match move
0x80000000|628, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 1222
171,MIN_REDUCTION+332, // $NT
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 1223
0x80000000|1053, // match move
0x80000000|79, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 1224
112,1086, // "o"
  }
,
{ // state 1225
89,171, // "c"
  }
,
{ // state 1226
-1, // $$start
-1, // start
1034, // white*
-1, // $$0
MIN_REDUCTION+127, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+127, // $
-1, // $NT
  }
,
{ // state 1227
112,508, // "o"
  }
,
{ // state 1228
2,351, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+303, // $NT
  }
,
{ // state 1229
112,615, // "o"
  }
,
{ // state 1230
120,174, // "t"
  }
,
{ // state 1231
89,195, // "c"
  }
,
{ // state 1232
0x80000000|540, // match move
0x80000000|466, // no-match move
// T-test match for "+":
98,
  }
,
{ // state 1233
2,1058, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+240, // $NT
  }
,
{ // state 1234
112,607, // "o"
  }
,
{ // state 1235
0x80000000|1187, // match move
0x80000000|287, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 1236
95,1161, // "e"
  }
,
{ // state 1237
113,486, // "r"
  }
,
{ // state 1238
0x80000000|657, // match move
0x80000000|710, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 1239
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+242, // $NT
  }
,
{ // state 1240
91,966, // "a"
  }
,
{ // state 1241
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+150, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+150, // $
-1, // $NT
  }
,
{ // state 1242
106,1189, // "p"
  }
,
{ // state 1243
2,555, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+273, // $NT
  }
,
{ // state 1244
118,248, // "k"
  }
,
{ // state 1245
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+230, // $NT
  }
,
{ // state 1246
0x80000000|497, // match move
0x80000000|928, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 1247
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+266, // $NT
  }
,
{ // state 1248
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 1249
111,398, // "i"
  }
,
{ // state 1250
2,1144, // white*
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 1251
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 1252
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 1253
120,679, // "t"
  }
,
{ // state 1254
-1, // $$start
-1, // start
810, // white*
-1, // $$0
MIN_REDUCTION+161, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+161, // $
-1, // $NT
  }
,
{ // state 1255
119,586, // "n"
  }
,
{ // state 1256
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1257
119,582, // "n"
  }
,
{ // state 1258
106,294, // "p"
  }
,
{ // state 1259
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+95, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+95, // $
-1, // $NT
  }
,
{ // state 1260
0x80000000|213, // match move
0x80000000|371, // no-match move
// T-test match for 10:
130,
  }
,
{ // state 1261
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+167, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+167, // $
-1, // $NT
  }
,
{ // state 1262
91,348, // "a"
  }
,
{ // state 1263
0x80000000|1, // match move
0x80000000|1175, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 1264
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 1265
171,MIN_REDUCTION+307, // $NT
  }
,
{ // state 1266
158,914, // stringChar*
159,288, // $$2
  }
,
{ // state 1267
-1, // $$start
-1, // start
981, // white*
-1, // $$0
MIN_REDUCTION+123, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+123, // $
-1, // $NT
  }
,
{ // state 1268
171,MIN_REDUCTION+101, // $NT
  }
,
{ // state 1269
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1270
91,1154, // "a"
113,682, // "r"
  }
,
{ // state 1271
112,1147, // "o"
  }
,
{ // state 1272
105,852, // "m"
  }
,
{ // state 1273
2,534, // white*
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 1274
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 1275
92,408, // "s"
120,273, // "t"
  }
,
{ // state 1276
95,119, // "e"
  }
,
{ // state 1277
0x80000000|87, // match move
0x80000000|804, // no-match move
// T-test match for "*":
154,
  }
,
{ // state 1278
95,45, // "e"
  }
,
{ // state 1279
171,MIN_REDUCTION+259, // $NT
  }
,
{ // state 1280
89,464, // "c"
  }
,
{ // state 1281
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+152, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+152, // $
-1, // $NT
  }
,
{ // state 1282
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 1283
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 1284
0x80000000|421, // match move
0x80000000|857, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 1285
171,MIN_REDUCTION+226, // $NT
  }
,
{ // state 1286
113,11, // "r"
  }
,
{ // state 1287
120,405, // "t"
  }
,
{ // state 1288
108,1230, // "y"
112,153, // "o"
113,653, // "r"
  }
,
{ // state 1289
95,295, // "e"
  }
,
{ // state 1290
2,736, // white*
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 1291
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 1292
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 1293
2,1183, // white*
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 1294
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+144, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+144, // $
-1, // $NT
  }
,
{ // state 1295
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+354, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+354, // $
-1, // $NT
  }
,
{ // state 1296
-1, // $$start
-1, // start
21, // white*
-1, // $$0
MIN_REDUCTION+294, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+294, // "c"
MIN_REDUCTION+294, // "l"
MIN_REDUCTION+294, // "a"
MIN_REDUCTION+294, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+294, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+294, // "d"
MIN_REDUCTION+294, // "g"
MIN_REDUCTION+294, // "m"
MIN_REDUCTION+294, // "p"
MIN_REDUCTION+294, // "v"
MIN_REDUCTION+294, // "y"
MIN_REDUCTION+294, // {"A".."Z" "j" "q"}
MIN_REDUCTION+294, // "f"
MIN_REDUCTION+294, // "i"
MIN_REDUCTION+294, // "o"
MIN_REDUCTION+294, // "r"
MIN_REDUCTION+294, // "u"
MIN_REDUCTION+294, // "x"
MIN_REDUCTION+294, // "b"
MIN_REDUCTION+294, // "h"
MIN_REDUCTION+294, // "k"
MIN_REDUCTION+294, // "n"
MIN_REDUCTION+294, // "t"
MIN_REDUCTION+294, // "w"
MIN_REDUCTION+294, // "z"
MIN_REDUCTION+294, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+294, // $
-1, // $NT
  }
,
{ // state 1297
0x80000000|1136, // match move
0x80000000|203, // no-match move
0x80000000|734, // NT-test-match state for reserved
  }
,
{ // state 1298
124,1021, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+173, // $NT
  }
,
{ // state 1299
120,280, // "t"
  }
,
{ // state 1300
2,931, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+309, // $NT
  }
,
{ // state 1301
0x80000000|1, // match move
0x80000000|1300, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 1302
0x80000000|1, // match move
0x80000000|1197, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 1303
171,MIN_REDUCTION+211, // $NT
  }
,
{ // state 1304
113,932, // "r"
  }
,
{ // state 1305
0x80000000|1, // match move
0x80000000|1318, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 1306
95,192, // "e"
  }
,
{ // state 1307
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 1308
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+99, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+99, // $
-1, // $NT
  }
,
{ // state 1309
120,704, // "t"
  }
,
{ // state 1310
90,238, // "l"
  }
,
{ // state 1311
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+173, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+173, // $
-1, // $NT
  }
};
}
private class Initter8{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 1312
0x80000000|1, // match move
0x80000000|1326, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 1313
112,235, // "o"
  }
,
{ // state 1314
-1, // $$start
-1, // start
656, // white*
-1, // $$0
MIN_REDUCTION+249, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+249, // "c"
MIN_REDUCTION+249, // "l"
MIN_REDUCTION+249, // "a"
MIN_REDUCTION+249, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+249, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+249, // "d"
MIN_REDUCTION+249, // "g"
MIN_REDUCTION+249, // "m"
MIN_REDUCTION+249, // "p"
MIN_REDUCTION+249, // "v"
MIN_REDUCTION+249, // "y"
MIN_REDUCTION+249, // {"A".."Z" "j" "q"}
MIN_REDUCTION+249, // "f"
MIN_REDUCTION+249, // "i"
MIN_REDUCTION+249, // "o"
MIN_REDUCTION+249, // "r"
MIN_REDUCTION+249, // "u"
MIN_REDUCTION+249, // "x"
MIN_REDUCTION+249, // "b"
MIN_REDUCTION+249, // "h"
MIN_REDUCTION+249, // "k"
MIN_REDUCTION+249, // "n"
MIN_REDUCTION+249, // "t"
MIN_REDUCTION+249, // "w"
MIN_REDUCTION+249, // "z"
MIN_REDUCTION+249, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+249, // $
-1, // $NT
  }
,
{ // state 1315
120,1301, // "t"
  }
,
{ // state 1316
119,178, // "n"
  }
,
{ // state 1317
171,MIN_REDUCTION+109, // $NT
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 1318
2,616, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+204, // $NT
  }
,
{ // state 1319
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 1320
-1, // $$start
-1, // start
673, // white*
-1, // $$0
MIN_REDUCTION+210, // token
1155, // `boolean
224, // `class
322, // `extends
894, // `void
936, // `int
1274, // `while
166, // `if
201, // `else
765, // `for
473, // `break
1070, // `this
1198, // `false
1033, // `true
141, // `super
755, // `null
1162, // `return
1123, // `instanceof
565, // `new
929, // `abstract
760, // `assert
799, // `byte
117, // `case
1291, // `catch
570, // `char
751, // `const
1078, // `continue
661, // `default
1042, // `do
461, // `double
160, // `enum
988, // `final
1002, // `finally
334, // `float
443, // `goto
784, // `implements
939, // `import
633, // `interface
412, // `long
40, // `native
1328, // `package
1282, // `private
1191, // `protected
718, // `public
864, // `short
688, // `static
1100, // `strictfp
126, // `switch
86, // `synchronized
314, // `throw
1248, // `throws
708, // `transient
1138, // `try
1292, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
-1, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
MIN_REDUCTION+210, // "c"
MIN_REDUCTION+210, // "l"
MIN_REDUCTION+210, // "a"
MIN_REDUCTION+210, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+210, // "e"
122, // "!"
1067, // "="
1232, // "+"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+210, // "d"
MIN_REDUCTION+210, // "g"
MIN_REDUCTION+210, // "m"
MIN_REDUCTION+210, // "p"
MIN_REDUCTION+210, // "v"
MIN_REDUCTION+210, // "y"
MIN_REDUCTION+210, // {"A".."Z" "j" "q"}
MIN_REDUCTION+210, // "f"
MIN_REDUCTION+210, // "i"
MIN_REDUCTION+210, // "o"
MIN_REDUCTION+210, // "r"
MIN_REDUCTION+210, // "u"
MIN_REDUCTION+210, // "x"
MIN_REDUCTION+210, // "b"
MIN_REDUCTION+210, // "h"
MIN_REDUCTION+210, // "k"
MIN_REDUCTION+210, // "n"
MIN_REDUCTION+210, // "t"
MIN_REDUCTION+210, // "w"
MIN_REDUCTION+210, // "z"
MIN_REDUCTION+210, // {"0".."9"}
363, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
-1, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+210, // $
-1, // $NT
  }
,
{ // state 1321
0x80000000|1, // match move
0x80000000|1320, // no-match move
0x80000000|65, // NT-test-match state for idChar
  }
,
{ // state 1322
95,551, // "e"
  }
,
{ // state 1323
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+284, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1252, // `!
196, // `!=
411, // `%
324, // `&&
190, // `*
600, // `(
140, // `)
569, // `{
533, // `}
714, // `-
367, // `+
228, // `=
754, // `==
1164, // `[
849, // `]
1129, // `||
593, // `<
206, // `<=
985, // `,
1010, // `>
427, // `>=
687, // `.
605, // `;
181, // `++
1256, // `--
465, // `/
73, // `:
1251, // ID
397, // INT_LITERAL
906, // STRING_LITERAL
240, // CHAR_LITERAL
498, // "c"
498, // "l"
498, // "a"
498, // "s"
-1, // idChar
-1, // reserved
498, // "e"
122, // "!"
1067, // "="
1232, // "+"
237, // digit++
472, // letter
264, // digit
-1, // "_"
498, // "d"
498, // "g"
498, // "m"
498, // "p"
498, // "v"
498, // "y"
498, // {"A".."Z" "j" "q"}
498, // "f"
498, // "i"
498, // "o"
498, // "r"
498, // "u"
498, // "x"
498, // "b"
498, // "h"
498, // "k"
498, // "n"
498, // "t"
498, // "w"
498, // "z"
543, // {"0".."9"}
798, // white
1264, // " "
1264, // {9 12}
654, // eol
216, // singleLineComment
1043, // multiLineComment
642, // {10}
1260, // {13}
-1, // printable
1284, // "["
492, // "-"
246, // "<"
354, // "|"
715, // "&"
499, // ")"
1235, // ","
711, // "]"
916, // "/"
260, // ";"
724, // ">"
986, // "{"
731, // "%"
668, // "("
-1, // "\"
149, // "."
172, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
1213, // "}"
1092, // "'"
636, // '"'
964, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
660, // comment
-1, // commentChar**
-1, // multiCommentChar
-1, // multiCommentChar**
-1, // token*
-1, // commentChar*
793, // digit+
-1, // idChar*
-1, // multiCommentChar*
MIN_REDUCTION+284, // $
-1, // $NT
  }
,
{ // state 1324
2,1188, // white*
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 1325
92,658, // "s"
  }
,
{ // state 1326
2,648, // white*
124,774, // white
125,1117, // " "
126,1117, // {9 12}
127,134, // eol
128,477, // singleLineComment
129,1317, // multiLineComment
130,872, // {10}
131,862, // {13}
141,995, // "/"
161,818, // comment
171,MIN_REDUCTION+258, // $NT
  }
,
{ // state 1327
103,197, // "d"
  }
,
{ // state 1328
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 1329
116,378, // "b"
  }
,
{ // state 1330
89,1048, // "c"
90,1048, // "l"
91,1048, // "a"
92,1048, // "s"
95,1048, // "e"
96,1048, // "!"
97,1048, // "="
98,1048, // "+"
102,1048, // "_"
103,1048, // "d"
104,1048, // "g"
105,1048, // "m"
106,1048, // "p"
107,1048, // "v"
108,1048, // "y"
109,1048, // {"A".."Z" "j" "q"}
110,1048, // "f"
111,1048, // "i"
112,1048, // "o"
113,1048, // "r"
114,1048, // "u"
115,1048, // "x"
116,1048, // "b"
117,1048, // "h"
118,1048, // "k"
119,1048, // "n"
120,1048, // "t"
121,1048, // "w"
122,1048, // "z"
123,1048, // {"0".."9"}
125,1048, // " "
132,241, // printable
133,1048, // "["
134,1048, // "-"
135,1048, // "<"
136,1048, // "|"
137,1048, // "&"
138,1048, // ")"
139,1048, // ","
140,1048, // "]"
141,1048, // "/"
142,1048, // ";"
143,1048, // ">"
144,1048, // "{"
145,1048, // "%"
146,1048, // "("
147,1048, // "\"
148,1048, // "."
149,1048, // ":"
150,1048, // {"#".."$" "?".."@" "^" "`" "~"}
151,1048, // "}"
152,1048, // "'"
153,1048, // '"'
154,1048, // "*"
157,870, // stringChar
158,914, // stringChar*
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[1331][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
  doneSoFar += new Initter2().doInit(doneSoFar);
  doneSoFar += new Initter3().doInit(doneSoFar);
  doneSoFar += new Initter4().doInit(doneSoFar);
  doneSoFar += new Initter5().doInit(doneSoFar);
  doneSoFar += new Initter6().doInit(doneSoFar);
  doneSoFar += new Initter7().doInit(doneSoFar);
  doneSoFar += new Initter8().doInit(doneSoFar);
}
public int[] getProdTable() { return prodTable; }
private static int[] prodTable = {
// $$start ::= start
(0<<16)+1,
// $$start ::=
(0<<16)+0,
// start ::= white* $$0
(1<<16)+2,
// start ::= white*
(1<<16)+1,
// start ::= $$0
(1<<16)+1,
// token ::= `boolean
(4<<16)+1,
// token ::= `class
(4<<16)+1,
// token ::= `extends
(4<<16)+1,
// token ::= `void
(4<<16)+1,
// token ::= `int
(4<<16)+1,
// token ::= `while
(4<<16)+1,
// token ::= `if
(4<<16)+1,
// token ::= `else
(4<<16)+1,
// token ::= `for
(4<<16)+1,
// token ::= `break
(4<<16)+1,
// token ::= `this
(4<<16)+1,
// token ::= `false
(4<<16)+1,
// token ::= `true
(4<<16)+1,
// token ::= `super
(4<<16)+1,
// token ::= `null
(4<<16)+1,
// token ::= `return
(4<<16)+1,
// token ::= `instanceof
(4<<16)+1,
// token ::= `new
(4<<16)+1,
// token ::= `abstract
(4<<16)+1,
// token ::= `assert
(4<<16)+1,
// token ::= `byte
(4<<16)+1,
// token ::= `case
(4<<16)+1,
// token ::= `catch
(4<<16)+1,
// token ::= `char
(4<<16)+1,
// token ::= `const
(4<<16)+1,
// token ::= `continue
(4<<16)+1,
// token ::= `default
(4<<16)+1,
// token ::= `do
(4<<16)+1,
// token ::= `double
(4<<16)+1,
// token ::= `enum
(4<<16)+1,
// token ::= `final
(4<<16)+1,
// token ::= `finally
(4<<16)+1,
// token ::= `float
(4<<16)+1,
// token ::= `goto
(4<<16)+1,
// token ::= `implements
(4<<16)+1,
// token ::= `import
(4<<16)+1,
// token ::= `interface
(4<<16)+1,
// token ::= `long
(4<<16)+1,
// token ::= `native
(4<<16)+1,
// token ::= `package
(4<<16)+1,
// token ::= `private
(4<<16)+1,
// token ::= `protected
(4<<16)+1,
// token ::= `public
(4<<16)+1,
// token ::= `short
(4<<16)+1,
// token ::= `static
(4<<16)+1,
// token ::= `strictfp
(4<<16)+1,
// token ::= `switch
(4<<16)+1,
// token ::= `synchronized
(4<<16)+1,
// token ::= `throw
(4<<16)+1,
// token ::= `throws
(4<<16)+1,
// token ::= `transient
(4<<16)+1,
// token ::= `try
(4<<16)+1,
// token ::= `volatile
(4<<16)+1,
// token ::= `!
(4<<16)+1,
// token ::= `!=
(4<<16)+1,
// token ::= `%
(4<<16)+1,
// token ::= `&&
(4<<16)+1,
// token ::= `*
(4<<16)+1,
// token ::= `(
(4<<16)+1,
// token ::= `)
(4<<16)+1,
// token ::= `{
(4<<16)+1,
// token ::= `}
(4<<16)+1,
// token ::= `-
(4<<16)+1,
// token ::= `+
(4<<16)+1,
// token ::= `=
(4<<16)+1,
// token ::= `==
(4<<16)+1,
// token ::= `[
(4<<16)+1,
// token ::= `]
(4<<16)+1,
// token ::= `||
(4<<16)+1,
// token ::= `<
(4<<16)+1,
// token ::= `<=
(4<<16)+1,
// token ::= `,
(4<<16)+1,
// token ::= `>
(4<<16)+1,
// token ::= `>=
(4<<16)+1,
// token ::= `.
(4<<16)+1,
// token ::= `;
(4<<16)+1,
// token ::= `++
(4<<16)+1,
// token ::= `--
(4<<16)+1,
// token ::= `/
(4<<16)+1,
// token ::= `:
(4<<16)+1,
// token ::= ID
(4<<16)+1,
// token ::= INT_LITERAL
(4<<16)+1,
// token ::= STRING_LITERAL
(4<<16)+1,
// token ::= CHAR_LITERAL
(4<<16)+1,
// `class ::= "c" "l" "a" "s" "s" !idChar white*
(6<<16)+6,
// `class ::= "c" "l" "a" "s" "s" !idChar
(6<<16)+5,
// reserved ::= `class
(94<<16)+1,
// `else ::= "e" "l" "s" "e" !idChar white*
(12<<16)+5,
// `else ::= "e" "l" "s" "e" !idChar
(12<<16)+4,
// reserved ::= `else
(94<<16)+1,
// `!= ::= "!" "=" white*
(59<<16)+3,
// `!= ::= "!" "="
(59<<16)+2,
// `+ ::= "+" !"+" white*
(68<<16)+2,
// `+ ::= "+" !"+"
(68<<16)+1,
// INT_LITERAL ::= digit++ white*
(86<<16)+2,
// INT_LITERAL ::= digit++
(86<<16)+1,
// idChar ::= letter
(93<<16)+1,
// idChar ::= digit
(93<<16)+1,
// idChar ::= "_"
(93<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(100<<16)+1,
// digit ::= {"0".."9"}
(101<<16)+1,
// white ::= {9 12 " "}
(124<<16)+1,
// white ::= eol
(124<<16)+1,
// white ::= singleLineComment
(124<<16)+1,
// white ::= multiLineComment
(124<<16)+1,
// eol ::= {10}
(127<<16)+1,
// eol ::= {13} {10}
(127<<16)+2,
// eol ::= {13} !10
(127<<16)+1,
// printable ::= {" ".."~"}
(132<<16)+1,
// `! ::= "!" !"=" white*
(58<<16)+2,
// `! ::= "!" !"="
(58<<16)+1,
// `% ::= "%" white*
(60<<16)+2,
// `% ::= "%"
(60<<16)+1,
// `&& ::= "&" "&" white*
(61<<16)+3,
// `&& ::= "&" "&"
(61<<16)+2,
// `* ::= "*" white*
(62<<16)+2,
// `* ::= "*"
(62<<16)+1,
// `( ::= "(" white*
(63<<16)+2,
// `( ::= "("
(63<<16)+1,
// `) ::= ")" white*
(64<<16)+2,
// `) ::= ")"
(64<<16)+1,
// `{ ::= "{" white*
(65<<16)+2,
// `{ ::= "{"
(65<<16)+1,
// `} ::= "}" white*
(66<<16)+2,
// `} ::= "}"
(66<<16)+1,
// `- ::= "-" !"-" white*
(67<<16)+2,
// `- ::= "-" !"-"
(67<<16)+1,
// `= ::= "=" !"=" white*
(69<<16)+2,
// `= ::= "=" !"="
(69<<16)+1,
// `== ::= "=" "=" white*
(70<<16)+3,
// `== ::= "=" "="
(70<<16)+2,
// `[ ::= "[" white*
(71<<16)+2,
// `[ ::= "["
(71<<16)+1,
// `] ::= "]" white*
(72<<16)+2,
// `] ::= "]"
(72<<16)+1,
// `|| ::= "|" "|" white*
(73<<16)+3,
// `|| ::= "|" "|"
(73<<16)+2,
// `< ::= "<" !"=" white*
(74<<16)+2,
// `< ::= "<" !"="
(74<<16)+1,
// `<= ::= "<" "=" white*
(75<<16)+3,
// `<= ::= "<" "="
(75<<16)+2,
// `, ::= "," white*
(76<<16)+2,
// `, ::= ","
(76<<16)+1,
// `> ::= ">" !"=" white*
(77<<16)+2,
// `> ::= ">" !"="
(77<<16)+1,
// `>= ::= ">" "=" white*
(78<<16)+3,
// `>= ::= ">" "="
(78<<16)+2,
// `: ::= ":" white*
(84<<16)+2,
// `: ::= ":"
(84<<16)+1,
// `. ::= "." white*
(79<<16)+2,
// `. ::= "."
(79<<16)+1,
// `; ::= ";" white*
(80<<16)+2,
// `; ::= ";"
(80<<16)+1,
// `++ ::= "+" "+" white*
(81<<16)+3,
// `++ ::= "+" "+"
(81<<16)+2,
// `-- ::= "-" "-" white*
(82<<16)+3,
// `-- ::= "-" "-"
(82<<16)+2,
// `/ ::= "/" !"*" !"/" white*
(83<<16)+2,
// `/ ::= "/" !"*" !"/"
(83<<16)+1,
// `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar white*
(5<<16)+8,
// `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar
(5<<16)+7,
// reserved ::= `boolean
(94<<16)+1,
// `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar white*
(7<<16)+8,
// `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar
(7<<16)+7,
// reserved ::= `extends
(94<<16)+1,
// `void ::= "v" "o" "i" "d" !idChar white*
(8<<16)+5,
// `void ::= "v" "o" "i" "d" !idChar
(8<<16)+4,
// reserved ::= `void
(94<<16)+1,
// `int ::= "i" "n" "t" !idChar white*
(9<<16)+4,
// `int ::= "i" "n" "t" !idChar
(9<<16)+3,
// reserved ::= `int
(94<<16)+1,
// `while ::= "w" "h" "i" "l" "e" !idChar white*
(10<<16)+6,
// `while ::= "w" "h" "i" "l" "e" !idChar
(10<<16)+5,
// reserved ::= `while
(94<<16)+1,
// `if ::= "i" "f" !idChar white*
(11<<16)+3,
// `if ::= "i" "f" !idChar
(11<<16)+2,
// reserved ::= `if
(94<<16)+1,
// `for ::= "f" "o" "r" !idChar white*
(13<<16)+4,
// `for ::= "f" "o" "r" !idChar
(13<<16)+3,
// reserved ::= `for
(94<<16)+1,
// `break ::= "b" "r" "e" "a" "k" !idChar white*
(14<<16)+6,
// `break ::= "b" "r" "e" "a" "k" !idChar
(14<<16)+5,
// reserved ::= `break
(94<<16)+1,
// `this ::= "t" "h" "i" "s" !idChar white*
(15<<16)+5,
// `this ::= "t" "h" "i" "s" !idChar
(15<<16)+4,
// reserved ::= `this
(94<<16)+1,
// `false ::= "f" "a" "l" "s" "e" !idChar white*
(16<<16)+6,
// `false ::= "f" "a" "l" "s" "e" !idChar
(16<<16)+5,
// reserved ::= `false
(94<<16)+1,
// `true ::= "t" "r" "u" "e" !idChar white*
(17<<16)+5,
// `true ::= "t" "r" "u" "e" !idChar
(17<<16)+4,
// reserved ::= `true
(94<<16)+1,
// `super ::= "s" "u" "p" "e" "r" !idChar white*
(18<<16)+6,
// `super ::= "s" "u" "p" "e" "r" !idChar
(18<<16)+5,
// reserved ::= `super
(94<<16)+1,
// `null ::= "n" "u" "l" "l" !idChar white*
(19<<16)+5,
// `null ::= "n" "u" "l" "l" !idChar
(19<<16)+4,
// reserved ::= `null
(94<<16)+1,
// `return ::= "r" "e" "t" "u" "r" "n" !idChar white*
(20<<16)+7,
// `return ::= "r" "e" "t" "u" "r" "n" !idChar
(20<<16)+6,
// reserved ::= `return
(94<<16)+1,
// `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar white*
(21<<16)+11,
// `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar
(21<<16)+10,
// reserved ::= `instanceof
(94<<16)+1,
// `new ::= "n" "e" "w" !idChar white*
(22<<16)+4,
// `new ::= "n" "e" "w" !idChar
(22<<16)+3,
// reserved ::= `new
(94<<16)+1,
// `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar white*
(23<<16)+9,
// `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar
(23<<16)+8,
// reserved ::= `abstract
(94<<16)+1,
// `assert ::= "a" "s" "s" "e" "r" "t" !idChar white*
(24<<16)+7,
// `assert ::= "a" "s" "s" "e" "r" "t" !idChar
(24<<16)+6,
// reserved ::= `assert
(94<<16)+1,
// `byte ::= "b" "y" "t" "e" !idChar white*
(25<<16)+5,
// `byte ::= "b" "y" "t" "e" !idChar
(25<<16)+4,
// reserved ::= `byte
(94<<16)+1,
// `case ::= "c" "a" "s" "e" !idChar white*
(26<<16)+5,
// `case ::= "c" "a" "s" "e" !idChar
(26<<16)+4,
// reserved ::= `case
(94<<16)+1,
// `catch ::= "c" "a" "t" "c" "h" !idChar white*
(27<<16)+6,
// `catch ::= "c" "a" "t" "c" "h" !idChar
(27<<16)+5,
// reserved ::= `catch
(94<<16)+1,
// `char ::= "c" "h" "a" "r" !idChar white*
(28<<16)+5,
// `char ::= "c" "h" "a" "r" !idChar
(28<<16)+4,
// reserved ::= `char
(94<<16)+1,
// `const ::= "c" "o" "n" "s" "t" !idChar white*
(29<<16)+6,
// `const ::= "c" "o" "n" "s" "t" !idChar
(29<<16)+5,
// reserved ::= `const
(94<<16)+1,
// `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar white*
(30<<16)+9,
// `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar
(30<<16)+8,
// reserved ::= `continue
(94<<16)+1,
// `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar white*
(31<<16)+8,
// `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar
(31<<16)+7,
// reserved ::= `default
(94<<16)+1,
// `do ::= "d" "o" !idChar white*
(32<<16)+3,
// `do ::= "d" "o" !idChar
(32<<16)+2,
// reserved ::= `do
(94<<16)+1,
// `double ::= "d" "o" "u" "b" "l" "e" !idChar white*
(33<<16)+7,
// `double ::= "d" "o" "u" "b" "l" "e" !idChar
(33<<16)+6,
// reserved ::= `double
(94<<16)+1,
// `enum ::= "e" "n" "u" "m" !idChar white*
(34<<16)+5,
// `enum ::= "e" "n" "u" "m" !idChar
(34<<16)+4,
// reserved ::= `enum
(94<<16)+1,
// `final ::= "f" "i" "n" "a" "l" !idChar white*
(35<<16)+6,
// `final ::= "f" "i" "n" "a" "l" !idChar
(35<<16)+5,
// reserved ::= `final
(94<<16)+1,
// `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar white*
(36<<16)+8,
// `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar
(36<<16)+7,
// reserved ::= `finally
(94<<16)+1,
// `float ::= "f" "l" "o" "a" "t" !idChar white*
(37<<16)+6,
// `float ::= "f" "l" "o" "a" "t" !idChar
(37<<16)+5,
// reserved ::= `float
(94<<16)+1,
// `goto ::= "g" "o" "t" "o" !idChar white*
(38<<16)+5,
// `goto ::= "g" "o" "t" "o" !idChar
(38<<16)+4,
// reserved ::= `goto
(94<<16)+1,
// `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar white*
(39<<16)+11,
// `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar
(39<<16)+10,
// reserved ::= `implements
(94<<16)+1,
// `import ::= "i" "m" "p" "o" "r" "t" !idChar white*
(40<<16)+7,
// `import ::= "i" "m" "p" "o" "r" "t" !idChar
(40<<16)+6,
// reserved ::= `import
(94<<16)+1,
// `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar white*
(41<<16)+10,
// `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar
(41<<16)+9,
// reserved ::= `interface
(94<<16)+1,
// `long ::= "l" "o" "n" "g" !idChar white*
(42<<16)+5,
// `long ::= "l" "o" "n" "g" !idChar
(42<<16)+4,
// reserved ::= `long
(94<<16)+1,
// `native ::= "n" "a" "t" "i" "v" "e" !idChar white*
(43<<16)+7,
// `native ::= "n" "a" "t" "i" "v" "e" !idChar
(43<<16)+6,
// reserved ::= `native
(94<<16)+1,
// `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar white*
(44<<16)+8,
// `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar
(44<<16)+7,
// reserved ::= `package
(94<<16)+1,
// `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar white*
(45<<16)+8,
// `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar
(45<<16)+7,
// reserved ::= `private
(94<<16)+1,
// `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar white*
(46<<16)+10,
// `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar
(46<<16)+9,
// reserved ::= `protected
(94<<16)+1,
// `public ::= "p" "u" "b" "l" "i" "c" !idChar white*
(47<<16)+7,
// `public ::= "p" "u" "b" "l" "i" "c" !idChar
(47<<16)+6,
// reserved ::= `public
(94<<16)+1,
// `short ::= "s" "h" "o" "r" "t" !idChar white*
(48<<16)+6,
// `short ::= "s" "h" "o" "r" "t" !idChar
(48<<16)+5,
// reserved ::= `short
(94<<16)+1,
// `static ::= "s" "t" "a" "t" "i" "c" !idChar white*
(49<<16)+7,
// `static ::= "s" "t" "a" "t" "i" "c" !idChar
(49<<16)+6,
// reserved ::= `static
(94<<16)+1,
// `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar white*
(50<<16)+9,
// `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar
(50<<16)+8,
// reserved ::= `strictfp
(94<<16)+1,
// `switch ::= "s" "w" "i" "t" "c" "h" !idChar white*
(51<<16)+7,
// `switch ::= "s" "w" "i" "t" "c" "h" !idChar
(51<<16)+6,
// reserved ::= `switch
(94<<16)+1,
// `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar white*
(52<<16)+13,
// `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar
(52<<16)+12,
// reserved ::= `synchronized
(94<<16)+1,
// `throw ::= "t" "h" "r" "o" "w" !idChar white*
(53<<16)+6,
// `throw ::= "t" "h" "r" "o" "w" !idChar
(53<<16)+5,
// reserved ::= `throw
(94<<16)+1,
// `throws ::= "t" "h" "r" "o" "w" "s" !idChar white*
(54<<16)+7,
// `throws ::= "t" "h" "r" "o" "w" "s" !idChar
(54<<16)+6,
// reserved ::= `throws
(94<<16)+1,
// `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar white*
(55<<16)+10,
// `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar
(55<<16)+9,
// reserved ::= `transient
(94<<16)+1,
// `try ::= "t" "r" "y" !idChar white*
(56<<16)+4,
// `try ::= "t" "r" "y" !idChar
(56<<16)+3,
// reserved ::= `try
(94<<16)+1,
// `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar white*
(57<<16)+9,
// `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar
(57<<16)+8,
// reserved ::= `volatile
(94<<16)+1,
// ID ::= !reserved letter idChar** $$1
(85<<16)+3,
// ID ::= !reserved letter idChar**
(85<<16)+2,
// ID ::= !reserved letter !idChar $$1
(85<<16)+2,
// ID ::= !reserved letter !idChar
(85<<16)+1,
// stringChar ::= !"\" !'"' printable
(157<<16)+1,
// STRING_LITERAL ::= '"' stringChar* $$2
(87<<16)+3,
// STRING_LITERAL ::= '"' $$2
(87<<16)+2,
// CHAR_LITERAL ::= "'" stringChar "'" white*
(88<<16)+4,
// CHAR_LITERAL ::= "'" stringChar "'"
(88<<16)+3,
// commentChar ::= printable
(160<<16)+1,
// comment ::= "/" "/" commentChar**
(161<<16)+3,
// comment ::= "/" "/" !commentChar
(161<<16)+2,
// singleLineComment ::= comment eol
(128<<16)+2,
// multiCommentChar ::= !"*" printable
(163<<16)+1,
// multiCommentChar ::= "*" !"/"
(163<<16)+1,
// multiLineComment ::= "/" "*" multiCommentChar** "*" "/"
(129<<16)+5,
// multiLineComment ::= "/" "*" !multiCommentChar "*" "/"
(129<<16)+4,
// token* ::= token* token
(165<<16)+2,
// token* ::= token
(165<<16)+1,
// commentChar** ::= commentChar* !commentChar
(162<<16)+1,
// digit++ ::= digit+ !digit
(99<<16)+1,
// idChar** ::= idChar* !idChar
(155<<16)+1,
// stringChar* ::= stringChar* stringChar
(158<<16)+2,
// stringChar* ::= stringChar
(158<<16)+1,
// white* ::= white* white
(2<<16)+2,
// white* ::= white
(2<<16)+1,
// multiCommentChar** ::= multiCommentChar* !multiCommentChar
(164<<16)+1,
// digit+ ::= digit
(167<<16)+1,
// digit+ ::= digit+ digit
(167<<16)+2,
// commentChar* ::= commentChar* commentChar
(166<<16)+2,
// commentChar* ::= commentChar
(166<<16)+1,
// idChar* ::= idChar* idChar
(168<<16)+2,
// idChar* ::= idChar
(168<<16)+1,
// multiCommentChar* ::= multiCommentChar* multiCommentChar
(169<<16)+2,
// multiCommentChar* ::= multiCommentChar
(169<<16)+1,
// $$0 ::= token*
(3<<16)+1,
// $$1 ::= white*
(156<<16)+1,
// $$2 ::= '"' white*
(159<<16)+2,
// $$2 ::= '"'
(159<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
-1, // 0
-1, // 1
-1, // 2
-1, // 3
-1, // 4
-1, // 5
-1, // 6
-1, // 7
-1, // 8
126, // 9
130, // 10
-1, // 11
126, // 12
131, // 13
-1, // 14
-1, // 15
-1, // 16
-1, // 17
-1, // 18
-1, // 19
-1, // 20
-1, // 21
-1, // 22
-1, // 23
-1, // 24
-1, // 25
-1, // 26
-1, // 27
-1, // 28
-1, // 29
-1, // 30
-1, // 31
125, // " "
96, // "!"
153, // '"'
150, // "#"
150, // "$"
145, // "%"
137, // "&"
152, // "'"
146, // "("
138, // ")"
154, // "*"
98, // "+"
139, // ","
134, // "-"
148, // "."
141, // "/"
123, // "0"
123, // "1"
123, // "2"
123, // "3"
123, // "4"
123, // "5"
123, // "6"
123, // "7"
123, // "8"
123, // "9"
149, // ":"
142, // ";"
135, // "<"
97, // "="
143, // ">"
150, // "?"
150, // "@"
109, // "A"
109, // "B"
109, // "C"
109, // "D"
109, // "E"
109, // "F"
109, // "G"
109, // "H"
109, // "I"
109, // "J"
109, // "K"
109, // "L"
109, // "M"
109, // "N"
109, // "O"
109, // "P"
109, // "Q"
109, // "R"
109, // "S"
109, // "T"
109, // "U"
109, // "V"
109, // "W"
109, // "X"
109, // "Y"
109, // "Z"
133, // "["
147, // "\"
140, // "]"
150, // "^"
102, // "_"
150, // "`"
91, // "a"
116, // "b"
89, // "c"
103, // "d"
95, // "e"
110, // "f"
104, // "g"
117, // "h"
111, // "i"
109, // "j"
118, // "k"
90, // "l"
105, // "m"
119, // "n"
112, // "o"
106, // "p"
109, // "q"
113, // "r"
92, // "s"
120, // "t"
114, // "u"
107, // "v"
121, // "w"
115, // "x"
108, // "y"
122, // "z"
144, // "{"
136, // "|"
151, // "}"
150, // "~"
-1, // 127
-1, // 128
-1, // 129
-1, // 130
-1, // 131
-1, // 132
-1, // 133
-1, // 134
-1, // 135
-1, // 136
-1, // 137
-1, // 138
-1, // 139
-1, // 140
-1, // 141
-1, // 142
-1, // 143
-1, // 144
-1, // 145
-1, // 146
-1, // 147
-1, // 148
-1, // 149
-1, // 150
-1, // 151
-1, // 152
-1, // 153
-1, // 154
-1, // 155
-1, // 156
-1, // 157
-1, // 158
-1, // 159
-1, // 160
-1, // 161
-1, // 162
-1, // 163
-1, // 164
-1, // 165
-1, // 166
-1, // 167
-1, // 168
-1, // 169
-1, // 170
-1, // 171
-1, // 172
-1, // 173
-1, // 174
-1, // 175
-1, // 176
-1, // 177
-1, // 178
-1, // 179
-1, // 180
-1, // 181
-1, // 182
-1, // 183
-1, // 184
-1, // 185
-1, // 186
-1, // 187
-1, // 188
-1, // 189
-1, // 190
-1, // 191
-1, // 192
-1, // 193
-1, // 194
-1, // 195
-1, // 196
-1, // 197
-1, // 198
-1, // 199
-1, // 200
-1, // 201
-1, // 202
-1, // 203
-1, // 204
-1, // 205
-1, // 206
-1, // 207
-1, // 208
-1, // 209
-1, // 210
-1, // 211
-1, // 212
-1, // 213
-1, // 214
-1, // 215
-1, // 216
-1, // 217
-1, // 218
-1, // 219
-1, // 220
-1, // 221
-1, // 222
-1, // 223
-1, // 224
-1, // 225
-1, // 226
-1, // 227
-1, // 228
-1, // 229
-1, // 230
-1, // 231
-1, // 232
-1, // 233
-1, // 234
-1, // 235
-1, // 236
-1, // 237
-1, // 238
-1, // 239
-1, // 240
-1, // 241
-1, // 242
-1, // 243
-1, // 244
-1, // 245
-1, // 246
-1, // 247
-1, // 248
-1, // 249
-1, // 250
-1, // 251
-1, // 252
-1, // 253
-1, // 254
-1, // 255
};
public String[] getActionProdNameTable() { return actionProdNameTable; }
private String[] actionProdNameTable = {
"", // 0
"", // 1
"", // 2
"", // 3
"", // 4
"", // 5
"", // 6
"", // 7
"", // 8
"", // 9
"", // 10
"", // 11
"", // 12
"", // 13
"", // 14
"", // 15
"", // 16
"", // 17
"", // 18
"", // 19
"", // 20
"", // 21
"", // 22
"", // 23
"", // 24
"", // 25
"", // 26
"", // 27
"", // 28
"", // 29
"", // 30
"", // 31
"", // 32
"", // 33
"", // 34
"", // 35
"", // 36
"", // 37
"", // 38
"", // 39
"", // 40
"", // 41
"", // 42
"", // 43
"", // 44
"", // 45
"", // 46
"", // 47
"", // 48
"", // 49
"", // 50
"", // 51
"", // 52
"", // 53
"", // 54
"", // 55
"", // 56
"", // 57
"", // 58
"", // 59
"", // 60
"", // 61
"", // 62
"", // 63
"", // 64
"", // 65
"", // 66
"", // 67
"", // 68
"", // 69
"", // 70
"", // 71
"", // 72
"", // 73
"", // 74
"", // 75
"", // 76
"", // 77
"", // 78
"", // 79
"", // 80
"", // 81
"", // 82
"", // 83
"", // 84
"", // 85
"", // 86
"", // 87
"", // 88
"", // 89
"", // 90
"", // 91
"", // 92
"", // 93
"", // 94
"", // 95
"", // 96
"", // 97
"", // 98
"", // 99
"", // 100
"", // 101
"", // 102
"", // 103
"", // 104
"", // 105
"", // 106
"", // 107
"", // 108
"", // 109
"", // 110
"", // 111
"", // 112
"", // 113
"", // 114
"", // 115
"", // 116
"", // 117
"", // 118
"", // 119
"", // 120
"", // 121
"", // 122
"", // 123
"", // 124
"", // 125
"", // 126
"", // 127
"", // 128
"", // 129
"", // 130
"", // 131
"", // 132
"", // 133
"", // 134
"", // 135
"", // 136
"", // 137
"", // 138
"", // 139
"", // 140
"", // 141
"", // 142
"", // 143
"", // 144
"", // 145
"", // 146
"", // 147
"", // 148
"", // 149
"", // 150
"", // 151
"", // 152
"", // 153
"", // 154
"", // 155
"", // 156
"", // 157
"", // 158
"", // 159
"", // 160
"", // 161
"", // 162
"", // 163
"", // 164
"", // 165
"", // 166
"", // 167
"", // 168
"", // 169
"", // 170
"", // 171
"", // 172
"", // 173
"", // 174
"", // 175
"", // 176
"", // 177
"", // 178
"", // 179
"", // 180
"", // 181
"", // 182
"", // 183
"", // 184
"", // 185
"", // 186
"", // 187
"", // 188
"", // 189
"", // 190
"", // 191
"", // 192
"", // 193
"", // 194
"", // 195
"", // 196
"", // 197
"", // 198
"", // 199
"", // 200
"", // 201
"", // 202
"", // 203
"", // 204
"", // 205
"", // 206
"", // 207
"", // 208
"", // 209
"", // 210
"", // 211
"", // 212
"", // 213
"", // 214
"", // 215
"", // 216
"", // 217
"", // 218
"", // 219
"", // 220
"", // 221
"", // 222
"", // 223
"", // 224
"", // 225
"", // 226
"", // 227
"", // 228
"", // 229
"", // 230
"", // 231
"", // 232
"", // 233
"", // 234
"", // 235
"", // 236
"", // 237
"", // 238
"", // 239
"", // 240
"", // 241
"", // 242
"", // 243
"", // 244
"", // 245
"", // 246
"", // 247
"", // 248
"", // 249
"", // 250
"", // 251
"", // 252
"", // 253
"", // 254
"", // 255
"", // 256
"", // 257
"", // 258
"", // 259
"", // 260
"", // 261
"", // 262
"", // 263
"", // 264
"", // 265
"", // 266
"", // 267
"", // 268
"", // 269
"", // 270
"", // 271
"", // 272
"", // 273
"", // 274
"", // 275
"", // 276
"", // 277
"", // 278
"", // 279
"", // 280
"", // 281
"", // 282
"", // 283
"", // 284
"", // 285
"", // 286
"", // 287
"", // 288
"", // 289
"", // 290
"", // 291
"", // 292
"", // 293
"", // 294
"", // 295
"", // 296
"", // 297
"", // 298
"", // 299
"", // 300
"", // 301
"", // 302
"", // 303
"", // 304
"", // 305
"", // 306
"", // 307
"", // 308
"", // 309
"", // 310
"", // 311
"", // 312
"", // 313
"", // 314
"", // 315
"", // 316
"", // 317
"", // 318
"", // 319
"", // 320
"", // 321
"", // 322
"", // 323
"", // 324
"", // 325
"", // 326
"", // 327
"", // 328
"", // 329
"", // 330
"", // 331
"", // 332
"", // 333
"token* ::= token* token", // 334
"token* ::= token* token", // 335
"commentChar** ::= commentChar* !commentChar", // 336
"digit++ ::= digit+ !digit", // 337
"idChar** ::= idChar* !idChar", // 338
"stringChar* ::= stringChar* stringChar", // 339
"stringChar* ::= stringChar* stringChar", // 340
"white* ::= white* white", // 341
"white* ::= white* white", // 342
"multiCommentChar** ::= multiCommentChar* !multiCommentChar", // 343
"digit+ ::= digit", // 344
"digit+ ::= digit+ digit", // 345
"commentChar* ::= commentChar* commentChar", // 346
"commentChar* ::= commentChar* commentChar", // 347
"idChar* ::= idChar* idChar", // 348
"idChar* ::= idChar* idChar", // 349
"multiCommentChar* ::= multiCommentChar* multiCommentChar", // 350
"multiCommentChar* ::= multiCommentChar* multiCommentChar", // 351
"", // 352
"", // 353
"", // 354
"", // 355
};
public int[][] getActionTable() { return actionTable; }
private int[][] actionTable = {
    { // 0: $$start ::= start @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 1: $$start ::= [start] @pass
      ((0<<5)|0x6)/*nullProductionAction:0*/,
    },
    { // 2: start ::= white* $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 3: start ::= white* [token*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 4: start ::= [white*] $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
    },
    { // 5: token ::= [#] `boolean @sawBoolean(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 6: token ::= [#] `class @sawClass(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 7: token ::= [#] `extends @sawExtends(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 8: token ::= [#] `void @sawVoid(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: token ::= [#] `int @sawInt(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: token ::= [#] `while @sawWhile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: token ::= [#] `if @sawIf(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: token ::= [#] `else @sawElse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: token ::= [#] `for @sawFor(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 14: token ::= [#] `break @sawBreak(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 15: token ::= [#] `this @sawThis(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 16: token ::= [#] `false @sawFalse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 17: token ::= [#] `true @sawTrue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 18: token ::= [#] `super @sawSuper(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 19: token ::= [#] `null @sawNull(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 20: token ::= [#] `return @sawReturn(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 21: token ::= [#] `instanceof @sawInstanceof(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 22: token ::= [#] `new @sawNew(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 23: token ::= [#] `abstract @sawAbstract(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 24: token ::= [#] `assert @sawAssert(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 25: token ::= [#] `byte @sawByte(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 26: token ::= [#] `case @sawCase(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 27: token ::= [#] `catch @sawCatch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 28: token ::= [#] `char @sawChar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 29: token ::= [#] `const @sawConst(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 30: token ::= [#] `continue @sawContinue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 31: token ::= [#] `default @sawDefault(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 32: token ::= [#] `do @sawDo(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 33: token ::= [#] `double @sawDouble(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 34: token ::= [#] `enum @sawEnum(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 35: token ::= [#] `final @sawFinal(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 36: token ::= [#] `finally @sawFinally(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 37: token ::= [#] `float @sawFloat(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 38: token ::= [#] `goto @sawGoto(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 39: token ::= [#] `implements @sawImplements(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 40: token ::= [#] `import @sawImport(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 41: token ::= [#] `interface @sawInterface(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 42: token ::= [#] `long @sawLong(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 43: token ::= [#] `native @sawNative(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 44: token ::= [#] `package @sawPackage(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 45: token ::= [#] `private @sawPrivate(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 46: token ::= [#] `protected @sawProtected(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 47: token ::= [#] `public @sawPublic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 48: token ::= [#] `short @sawShort(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 49: token ::= [#] `static @sawStatic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 50: token ::= [#] `strictfp @sawStrictfp(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 51: token ::= [#] `switch @sawSwitch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 52: token ::= [#] `synchronized @sawSynchronized(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 53: token ::= [#] `throw @sawThrow(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 54: token ::= [#] `throws @sawThrows(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 55: token ::= [#] `transient @sawTransient(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 56: token ::= [#] `try @sawTry(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 57: token ::= [#] `volatile @sawVolatile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 58: token ::= [#] `! @sawNot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 59: token ::= [#] `!= @sawNotEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 60: token ::= [#] `% @sawRemainder(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 61: token ::= [#] `&& @sawAnd(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 62: token ::= [#] `* @sawTimes(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 63: token ::= [#] `( @sawLpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 64: token ::= [#] `) @sawRpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 65: token ::= [#] `{ @sawLbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 66: token ::= [#] `} @sawRbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 67: token ::= [#] `- @sawMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 68: token ::= [#] `+ @sawPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 69: token ::= [#] `= @sawAssign(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
    { // 70: token ::= [#] `== @sawEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((65<<5)|0x5)/*methodCall:65*/,
    },
    { // 71: token ::= [#] `[ @sawLbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 72: token ::= [#] `] @sawRbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 73: token ::= [#] `|| @sawOr(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((68<<5)|0x5)/*methodCall:68*/,
    },
    { // 74: token ::= [#] `< @sawLess(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 75: token ::= [#] `<= @sawLessEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((70<<5)|0x5)/*methodCall:70*/,
    },
    { // 76: token ::= [#] `, @sawComma(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((71<<5)|0x5)/*methodCall:71*/,
    },
    { // 77: token ::= [#] `> @sawGreater(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((72<<5)|0x5)/*methodCall:72*/,
    },
    { // 78: token ::= [#] `>= @sawGreaterEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((73<<5)|0x5)/*methodCall:73*/,
    },
    { // 79: token ::= [#] `. @sawDot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((74<<5)|0x5)/*methodCall:74*/,
    },
    { // 80: token ::= [#] `; @sawSemi(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((75<<5)|0x5)/*methodCall:75*/,
    },
    { // 81: token ::= [#] `++ @sawPlusPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((76<<5)|0x5)/*methodCall:76*/,
    },
    { // 82: token ::= [#] `-- @sawMinusMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((77<<5)|0x5)/*methodCall:77*/,
    },
    { // 83: token ::= [#] `/ @sawSlash(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((78<<5)|0x5)/*methodCall:78*/,
    },
    { // 84: token ::= [#] `: @sawColon(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((79<<5)|0x5)/*methodCall:79*/,
    },
    { // 85: token ::= [#] ID @identifier(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((80<<5)|0x5)/*methodCall:80*/,
    },
    { // 86: token ::= [#] INT_LITERAL @intLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((81<<5)|0x5)/*methodCall:81*/,
    },
    { // 87: token ::= [#] STRING_LITERAL @stringLit(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((82<<5)|0x5)/*methodCall:82*/,
    },
    { // 88: token ::= [#] CHAR_LITERAL @charLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((83<<5)|0x5)/*methodCall:83*/,
    },
    { // 89: `class ::= "c" "l" "a" "s" "s" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 90: `class ::= "c" "l" "a" "s" "s" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 91: reserved ::= `class @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 92: `else ::= "e" "l" "s" "e" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 93: `else ::= "e" "l" "s" "e" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 94: reserved ::= `else @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 95: `!= ::= "!" "=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 96: `!= ::= "!" "=" [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 97: `+ ::= "+" !"+" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 98: `+ ::= "+" !"+" [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 99: INT_LITERAL ::= [#] digit++ white* @convertToInt(int,List<Character>)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 100: INT_LITERAL ::= [#] digit++ [white*] @convertToInt(int,List<Character>)=>int
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 101: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 102: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 103: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 104: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 105: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 106: white ::= {9 12 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 107: white ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 108: white ::= singleLineComment @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 109: white ::= multiLineComment @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 110: eol ::= {10} [registerNewline] @void
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 111: eol ::= {13} {10} [registerNewline] @void
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 112: eol ::= {13} !10 [registerNewline] @void
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 113: printable ::= {" ".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 114: `! ::= "!" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 115: `! ::= "!" !"=" [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 116: `% ::= "%" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 117: `% ::= "%" [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 118: `&& ::= "&" "&" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 119: `&& ::= "&" "&" [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 120: `* ::= "*" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 121: `* ::= "*" [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 122: `( ::= "(" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 123: `( ::= "(" [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 124: `) ::= ")" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 125: `) ::= ")" [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 126: `{ ::= "{" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 127: `{ ::= "{" [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 128: `} ::= "}" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 129: `} ::= "}" [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 130: `- ::= "-" !"-" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 131: `- ::= "-" !"-" [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 132: `= ::= "=" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 133: `= ::= "=" !"=" [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 134: `== ::= "=" "=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 135: `== ::= "=" "=" [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 136: `[ ::= "[" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 137: `[ ::= "[" [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 138: `] ::= "]" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 139: `] ::= "]" [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 140: `|| ::= "|" "|" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 141: `|| ::= "|" "|" [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 142: `< ::= "<" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 143: `< ::= "<" !"=" [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 144: `<= ::= "<" "=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 145: `<= ::= "<" "=" [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 146: `, ::= "," white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 147: `, ::= "," [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 148: `> ::= ">" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 149: `> ::= ">" !"=" [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 150: `>= ::= ">" "=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 151: `>= ::= ">" "=" [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 152: `: ::= ":" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 153: `: ::= ":" [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 154: `. ::= "." white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 155: `. ::= "." [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 156: `; ::= ";" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 157: `; ::= ";" [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 158: `++ ::= "+" "+" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 159: `++ ::= "+" "+" [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 160: `-- ::= "-" "-" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 161: `-- ::= "-" "-" [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 162: `/ ::= "/" !"*" !"/" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 163: `/ ::= "/" !"*" !"/" [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 164: `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 165: `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 166: reserved ::= `boolean @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 167: `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 168: `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 169: reserved ::= `extends @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 170: `void ::= "v" "o" "i" "d" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 171: `void ::= "v" "o" "i" "d" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 172: reserved ::= `void @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 173: `int ::= "i" "n" "t" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 174: `int ::= "i" "n" "t" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 175: reserved ::= `int @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 176: `while ::= "w" "h" "i" "l" "e" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 177: `while ::= "w" "h" "i" "l" "e" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 178: reserved ::= `while @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 179: `if ::= "i" "f" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 180: `if ::= "i" "f" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 181: reserved ::= `if @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 182: `for ::= "f" "o" "r" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 183: `for ::= "f" "o" "r" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 184: reserved ::= `for @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 185: `break ::= "b" "r" "e" "a" "k" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 186: `break ::= "b" "r" "e" "a" "k" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 187: reserved ::= `break @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 188: `this ::= "t" "h" "i" "s" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 189: `this ::= "t" "h" "i" "s" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 190: reserved ::= `this @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 191: `false ::= "f" "a" "l" "s" "e" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 192: `false ::= "f" "a" "l" "s" "e" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 193: reserved ::= `false @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 194: `true ::= "t" "r" "u" "e" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 195: `true ::= "t" "r" "u" "e" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 196: reserved ::= `true @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 197: `super ::= "s" "u" "p" "e" "r" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 198: `super ::= "s" "u" "p" "e" "r" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 199: reserved ::= `super @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 200: `null ::= "n" "u" "l" "l" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 201: `null ::= "n" "u" "l" "l" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 202: reserved ::= `null @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 203: `return ::= "r" "e" "t" "u" "r" "n" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 204: `return ::= "r" "e" "t" "u" "r" "n" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 205: reserved ::= `return @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 206: `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 207: `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 208: reserved ::= `instanceof @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 209: `new ::= "n" "e" "w" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 210: `new ::= "n" "e" "w" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 211: reserved ::= `new @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 212: `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 213: `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 214: reserved ::= `abstract @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 215: `assert ::= "a" "s" "s" "e" "r" "t" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 216: `assert ::= "a" "s" "s" "e" "r" "t" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 217: reserved ::= `assert @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 218: `byte ::= "b" "y" "t" "e" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 219: `byte ::= "b" "y" "t" "e" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 220: reserved ::= `byte @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 221: `case ::= "c" "a" "s" "e" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 222: `case ::= "c" "a" "s" "e" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 223: reserved ::= `case @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 224: `catch ::= "c" "a" "t" "c" "h" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 225: `catch ::= "c" "a" "t" "c" "h" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 226: reserved ::= `catch @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 227: `char ::= "c" "h" "a" "r" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 228: `char ::= "c" "h" "a" "r" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 229: reserved ::= `char @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 230: `const ::= "c" "o" "n" "s" "t" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 231: `const ::= "c" "o" "n" "s" "t" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 232: reserved ::= `const @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 233: `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 234: `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 235: reserved ::= `continue @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 236: `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 237: `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 238: reserved ::= `default @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 239: `do ::= "d" "o" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 240: `do ::= "d" "o" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 241: reserved ::= `do @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 242: `double ::= "d" "o" "u" "b" "l" "e" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 243: `double ::= "d" "o" "u" "b" "l" "e" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 244: reserved ::= `double @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 245: `enum ::= "e" "n" "u" "m" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 246: `enum ::= "e" "n" "u" "m" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 247: reserved ::= `enum @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 248: `final ::= "f" "i" "n" "a" "l" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 249: `final ::= "f" "i" "n" "a" "l" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 250: reserved ::= `final @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 251: `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 252: `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 253: reserved ::= `finally @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 254: `float ::= "f" "l" "o" "a" "t" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 255: `float ::= "f" "l" "o" "a" "t" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 256: reserved ::= `float @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 257: `goto ::= "g" "o" "t" "o" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 258: `goto ::= "g" "o" "t" "o" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 259: reserved ::= `goto @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 260: `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 261: `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 262: reserved ::= `implements @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 263: `import ::= "i" "m" "p" "o" "r" "t" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 264: `import ::= "i" "m" "p" "o" "r" "t" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 265: reserved ::= `import @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 266: `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 267: `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 268: reserved ::= `interface @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 269: `long ::= "l" "o" "n" "g" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 270: `long ::= "l" "o" "n" "g" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 271: reserved ::= `long @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 272: `native ::= "n" "a" "t" "i" "v" "e" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 273: `native ::= "n" "a" "t" "i" "v" "e" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 274: reserved ::= `native @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 275: `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 276: `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 277: reserved ::= `package @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 278: `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 279: `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 280: reserved ::= `private @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 281: `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 282: `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 283: reserved ::= `protected @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 284: `public ::= "p" "u" "b" "l" "i" "c" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 285: `public ::= "p" "u" "b" "l" "i" "c" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 286: reserved ::= `public @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 287: `short ::= "s" "h" "o" "r" "t" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 288: `short ::= "s" "h" "o" "r" "t" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 289: reserved ::= `short @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 290: `static ::= "s" "t" "a" "t" "i" "c" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 291: `static ::= "s" "t" "a" "t" "i" "c" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 292: reserved ::= `static @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 293: `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 294: `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 295: reserved ::= `strictfp @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 296: `switch ::= "s" "w" "i" "t" "c" "h" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 297: `switch ::= "s" "w" "i" "t" "c" "h" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 298: reserved ::= `switch @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 299: `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x3)/*popOffPushBack:12*/,
    },
    { // 300: `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x3)/*popOffPushBack:12*/,
    },
    { // 301: reserved ::= `synchronized @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 302: `throw ::= "t" "h" "r" "o" "w" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 303: `throw ::= "t" "h" "r" "o" "w" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 304: reserved ::= `throw @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 305: `throws ::= "t" "h" "r" "o" "w" "s" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 306: `throws ::= "t" "h" "r" "o" "w" "s" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 307: reserved ::= `throws @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 308: `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 309: `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 310: reserved ::= `transient @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 311: `try ::= "t" "r" "y" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 312: `try ::= "t" "r" "y" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 313: reserved ::= `try @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 314: `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 315: `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar [white*] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 316: reserved ::= `volatile @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 317: ID ::= !reserved letter idChar** $$1 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 318: ID ::= !reserved letter idChar** [white*] @text
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 319: ID ::= !reserved letter !idChar [idChar**] $$1 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 320: ID ::= !reserved letter !idChar [idChar**] [white*] @text
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 321: stringChar ::= !"\" !'"' printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 322: STRING_LITERAL ::= '"' stringChar* $$2 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 323: STRING_LITERAL ::= '"' [stringChar*] $$2 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 324: CHAR_LITERAL ::= "'" stringChar "'" white* @returChar(char,char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 325: CHAR_LITERAL ::= "'" stringChar "'" [white*] @returChar(char,char,char)=>int
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 326: commentChar ::= printable @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 327: comment ::= "/" "/" commentChar** @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 328: comment ::= "/" "/" !commentChar [commentChar**] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 329: singleLineComment ::= comment eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 330: multiCommentChar ::= !"*" printable @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 331: multiCommentChar ::= "*" !"/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 332: multiLineComment ::= "/" "*" multiCommentChar** "*" "/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 333: multiLineComment ::= "/" "*" !multiCommentChar [multiCommentChar**] "*" "/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 334: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 335: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
    },
    { // 336: commentChar** ::= commentChar* !commentChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 337: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 338: idChar** ::= idChar* !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 339: stringChar* ::= stringChar* stringChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 340: stringChar* ::= [stringChar*] stringChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 341: white* ::= white* white @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 342: white* ::= [white*] white @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
    },
    { // 343: multiCommentChar** ::= multiCommentChar* !multiCommentChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 344: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 345: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 346: commentChar* ::= commentChar* commentChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 347: commentChar* ::= [commentChar*] commentChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 348: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 349: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 350: multiCommentChar* ::= multiCommentChar* multiCommentChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 351: multiCommentChar* ::= [multiCommentChar*] multiCommentChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
    },
    { // 352: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 353: $$1 ::= white* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 354: $$2 ::= '"' white* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 355: $$2 ::= '"' [white*] @pass
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "", // start
    "multiCommentChar** ::= multiCommentChar* !multiCommentChar", // multiCommentChar**
    "commentChar* ::=", // commentChar*
    "commentChar** ::= commentChar* !commentChar", // commentChar**
    "stringChar* ::=", // stringChar*
    "idChar** ::= idChar* !idChar", // idChar**
    "token* ::=", // token*
    "idChar* ::=", // idChar*
    "multiCommentChar* ::=", // multiCommentChar*
    "white* ::=", // white*
    "", // $$start
    "# ::=", // #
    "", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // start
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
    },
    { // multiCommentChar**
      ((8<<5)|0x6)/*nullProductionAction:8*/,
    },
    { // commentChar*
    },
    { // commentChar**
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // stringChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // idChar**
      ((7<<5)|0x6)/*nullProductionAction:7*/,
    },
    { // token*
    },
    { // idChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // multiCommentChar*
    },
    { // white*
    },
    { // $$start
      ((0<<5)|0x6)/*nullProductionAction:0*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
};
public void actionCall(int idx, wrangLR.runtime.SemanticInfo si) {
  switch(idx) {
    default: System.err.println("Internal error--illegal action number: "+idx);break;
    case 0: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawBoolean(parm0);
    }
    break;
    case 1: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawClass(parm0);
    }
    break;
    case 2: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawExtends(parm0);
    }
    break;
    case 3: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawVoid(parm0);
    }
    break;
    case 4: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawInt(parm0);
    }
    break;
    case 5: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawWhile(parm0);
    }
    break;
    case 6: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawIf(parm0);
    }
    break;
    case 7: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawElse(parm0);
    }
    break;
    case 8: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFor(parm0);
    }
    break;
    case 9: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawBreak(parm0);
    }
    break;
    case 10: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawThis(parm0);
    }
    break;
    case 11: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFalse(parm0);
    }
    break;
    case 12: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTrue(parm0);
    }
    break;
    case 13: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSuper(parm0);
    }
    break;
    case 14: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNull(parm0);
    }
    break;
    case 15: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawReturn(parm0);
    }
    break;
    case 16: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawInstanceof(parm0);
    }
    break;
    case 17: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNew(parm0);
    }
    break;
    case 18: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAbstract(parm0);
    }
    break;
    case 19: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAssert(parm0);
    }
    break;
    case 20: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawByte(parm0);
    }
    break;
    case 21: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawCase(parm0);
    }
    break;
    case 22: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawCatch(parm0);
    }
    break;
    case 23: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawChar(parm0);
    }
    break;
    case 24: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawConst(parm0);
    }
    break;
    case 25: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawContinue(parm0);
    }
    break;
    case 26: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDefault(parm0);
    }
    break;
    case 27: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDo(parm0);
    }
    break;
    case 28: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDouble(parm0);
    }
    break;
    case 29: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawEnum(parm0);
    }
    break;
    case 30: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFinal(parm0);
    }
    break;
    case 31: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFinally(parm0);
    }
    break;
    case 32: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFloat(parm0);
    }
    break;
    case 33: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawGoto(parm0);
    }
    break;
    case 34: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawImplements(parm0);
    }
    break;
    case 35: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawImport(parm0);
    }
    break;
    case 36: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawInterface(parm0);
    }
    break;
    case 37: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLong(parm0);
    }
    break;
    case 38: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNative(parm0);
    }
    break;
    case 39: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPackage(parm0);
    }
    break;
    case 40: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPrivate(parm0);
    }
    break;
    case 41: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawProtected(parm0);
    }
    break;
    case 42: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPublic(parm0);
    }
    break;
    case 43: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawShort(parm0);
    }
    break;
    case 44: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawStatic(parm0);
    }
    break;
    case 45: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawStrictfp(parm0);
    }
    break;
    case 46: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSwitch(parm0);
    }
    break;
    case 47: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSynchronized(parm0);
    }
    break;
    case 48: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawThrow(parm0);
    }
    break;
    case 49: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawThrows(parm0);
    }
    break;
    case 50: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTransient(parm0);
    }
    break;
    case 51: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTry(parm0);
    }
    break;
    case 52: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawVolatile(parm0);
    }
    break;
    case 53: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNot(parm0);
    }
    break;
    case 54: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNotEqual(parm0);
    }
    break;
    case 55: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRemainder(parm0);
    }
    break;
    case 56: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAnd(parm0);
    }
    break;
    case 57: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTimes(parm0);
    }
    break;
    case 58: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLpar(parm0);
    }
    break;
    case 59: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRpar(parm0);
    }
    break;
    case 60: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLbrace(parm0);
    }
    break;
    case 61: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRbrace(parm0);
    }
    break;
    case 62: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawMinus(parm0);
    }
    break;
    case 63: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPlus(parm0);
    }
    break;
    case 64: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAssign(parm0);
    }
    break;
    case 65: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawEqual(parm0);
    }
    break;
    case 66: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLbrack(parm0);
    }
    break;
    case 67: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRbrack(parm0);
    }
    break;
    case 68: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawOr(parm0);
    }
    break;
    case 69: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLess(parm0);
    }
    break;
    case 70: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLessEq(parm0);
    }
    break;
    case 71: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawComma(parm0);
    }
    break;
    case 72: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawGreater(parm0);
    }
    break;
    case 73: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawGreaterEq(parm0);
    }
    break;
    case 74: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDot(parm0);
    }
    break;
    case 75: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSemi(parm0);
    }
    break;
    case 76: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPlusPlus(parm0);
    }
    break;
    case 77: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawMinusMinus(parm0);
    }
    break;
    case 78: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSlash(parm0);
    }
    break;
    case 79: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawColon(parm0);
    }
    break;
    case 80: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      actionObject.identifier(parm0,parm1);
    }
    break;
    case 81: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      actionObject.intLit(parm0,parm1);
    }
    break;
    case 82: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      actionObject.stringLit(parm0,parm1);
    }
    break;
    case 83: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      actionObject.charLit(parm0,parm1);
    }
    break;
    case 84: {
      int parm0 = (Integer)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 85: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.returChar(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 86: {
      int parm0 = (Integer)si.popPb();
      actionObject.registerNewline(parm0);
    }
    break;
  }
}
private String[] saNameSigTable = {
"void sawBoolean(int)",
"void sawClass(int)",
"void sawExtends(int)",
"void sawVoid(int)",
"void sawInt(int)",
"void sawWhile(int)",
"void sawIf(int)",
"void sawElse(int)",
"void sawFor(int)",
"void sawBreak(int)",
"void sawThis(int)",
"void sawFalse(int)",
"void sawTrue(int)",
"void sawSuper(int)",
"void sawNull(int)",
"void sawReturn(int)",
"void sawInstanceof(int)",
"void sawNew(int)",
"void sawAbstract(int)",
"void sawAssert(int)",
"void sawByte(int)",
"void sawCase(int)",
"void sawCatch(int)",
"void sawChar(int)",
"void sawConst(int)",
"void sawContinue(int)",
"void sawDefault(int)",
"void sawDo(int)",
"void sawDouble(int)",
"void sawEnum(int)",
"void sawFinal(int)",
"void sawFinally(int)",
"void sawFloat(int)",
"void sawGoto(int)",
"void sawImplements(int)",
"void sawImport(int)",
"void sawInterface(int)",
"void sawLong(int)",
"void sawNative(int)",
"void sawPackage(int)",
"void sawPrivate(int)",
"void sawProtected(int)",
"void sawPublic(int)",
"void sawShort(int)",
"void sawStatic(int)",
"void sawStrictfp(int)",
"void sawSwitch(int)",
"void sawSynchronized(int)",
"void sawThrow(int)",
"void sawThrows(int)",
"void sawTransient(int)",
"void sawTry(int)",
"void sawVolatile(int)",
"void sawNot(int)",
"void sawNotEqual(int)",
"void sawRemainder(int)",
"void sawAnd(int)",
"void sawTimes(int)",
"void sawLpar(int)",
"void sawRpar(int)",
"void sawLbrace(int)",
"void sawRbrace(int)",
"void sawMinus(int)",
"void sawPlus(int)",
"void sawAssign(int)",
"void sawEqual(int)",
"void sawLbrack(int)",
"void sawRbrack(int)",
"void sawOr(int)",
"void sawLess(int)",
"void sawLessEq(int)",
"void sawComma(int)",
"void sawGreater(int)",
"void sawGreaterEq(int)",
"void sawDot(int)",
"void sawSemi(int)",
"void sawPlusPlus(int)",
"void sawMinusMinus(int)",
"void sawSlash(int)",
"void sawColon(int)",
"void identifier(int,String)",
"void intLit(int,int)",
"void stringLit(int,String)",
"void charLit(int,int)",
"int convertToInt(int,List<Character>)",
"int returChar(char,char,char)",
"void registerNewline(int)",
};
public String[] getSaNameSigTable() {
  return saNameSigTable;
}
private int[] sigCountTable = {
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
2,0,
2,0,
2,0,
2,0,
2,1,
3,1,
1,0,
};
public int[] getSigCountTable() {
  return sigCountTable;
}
public int[] getSymbolSizeTable() { return symbolSizeTable; }
private int[] symbolSizeTable = {
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    1,
    1,
    1,
    1,
    -1,
    -1,
    -1,
    -1,
    1,
    0,
    -1,
    -1,
    -1,
    -1,
    1,
    1,
    1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    0,
    -1,
    -1,
    0,
    0,
    0,
    -1,
    -1,
    1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    1,
    0,
    1,
    1,
    1,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    1,
    1,
    0,
    -1,
    -1,
};
public Object vectorToTuple(java.util.ArrayList<Object> vec) {
  switch (vec.size()) {
  }
  System.err.println("Internal error--illegal Tuple size: "+vec.size());
  return null;
}
}
