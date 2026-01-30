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
public int getEofSym() { return 161; }
public int getNttSym() { return 162; }
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
"token*",
"digit+",
"idChar*",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private TokenGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 163;}
private static final int MIN_REDUCTION = 1034;
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
0x80000000|758, // match move
0x80000000|598, // no-match move
0x80000000|571, // NT-test-match state for reserved
  }
,
{ // state 1
  }
,
{ // state 2
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 3
120,478, // "t"
  }
,
{ // state 4
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 5
0x80000000|1, // match move
0x80000000|196, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 6
103,340, // "d"
  }
,
{ // state 7
120,684, // "t"
  }
,
{ // state 8
0x80000000|1, // match move
0x80000000|938, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 9
162,MIN_REDUCTION+290, // $NT
  }
,
{ // state 10
0x80000000|1, // match move
0x80000000|483, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 11
2,124, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+235, // $NT
  }
,
{ // state 12
2,631, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 13
90,516, // "l"
  }
,
{ // state 14
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 15
91,796, // "a"
  }
,
{ // state 16
0x80000000|1, // match move
0x80000000|118, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 17
111,717, // "i"
  }
,
{ // state 18
2,970, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+265, // $NT
  }
,
{ // state 19
0x80000000|1, // match move
0x80000000|485, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 20
162,MIN_REDUCTION+188, // $NT
  }
,
{ // state 21
113,294, // "r"
  }
,
{ // state 22
0x80000000|1, // match move
0x80000000|262, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 23
113,431, // "r"
  }
,
{ // state 24
2,303, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 25
2,1006, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 26
0x80000000|1, // match move
0x80000000|125, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 27
2,347, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+208, // $NT
  }
,
{ // state 28
95,597, // "e"
  }
,
{ // state 29
119,812, // "n"
  }
,
{ // state 30
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 31
0x80000000|1, // match move
0x80000000|167, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 32
0x80000000|1, // match move
0x80000000|119, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 33
0x80000000|701, // match move
0x80000000|883, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 34
0x80000000|1, // match move
0x80000000|121, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 35
162,MIN_REDUCTION+185, // $NT
  }
,
{ // state 36
120,475, // "t"
  }
,
{ // state 37
92,1000, // "s"
120,240, // "t"
  }
,
{ // state 38
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+162, // $NT
  }
,
{ // state 39
104,32, // "g"
  }
,
{ // state 40
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 41
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 42
105,711, // "m"
110,589, // "f"
119,94, // "n"
  }
,
{ // state 43
162,MIN_REDUCTION+272, // $NT
  }
,
{ // state 44
2,624, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+220, // $NT
  }
,
{ // state 45
2,408, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 46
91,600, // "a"
  }
,
{ // state 47
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 48
89,899, // "c"
90,899, // "l"
91,899, // "a"
92,899, // "s"
95,899, // "e"
100,985, // letter
101,382, // digit
102,248, // "_"
103,899, // "d"
104,899, // "g"
105,899, // "m"
106,899, // "p"
107,899, // "v"
108,899, // "y"
109,899, // {"A".."Z" "j" "q"}
110,899, // "f"
111,899, // "i"
112,899, // "o"
113,899, // "r"
114,899, // "u"
115,899, // "x"
116,899, // "b"
117,899, // "h"
118,899, // "k"
119,899, // "n"
120,899, // "t"
121,899, // "w"
122,899, // "z"
123,394, // {"0".."9"}
  }
,
{ // state 49
106,401, // "p"
  }
,
{ // state 50
110,277, // "f"
  }
,
{ // state 51
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 52
111,843, // "i"
  }
,
{ // state 53
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 54
2,56, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 55
162,MIN_REDUCTION+182, // $NT
  }
,
{ // state 56
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 57
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 58
92,790, // "s"
  }
,
{ // state 59
162,MIN_REDUCTION+164, // $NT
  }
,
{ // state 60
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 61
119,1014, // "n"
  }
,
{ // state 62
2,369, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 63
105,215, // "m"
110,405, // "f"
119,37, // "n"
  }
,
{ // state 64
91,692, // "a"
  }
,
{ // state 65
0x80000000|1, // match move
0x80000000|27, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 66
0x80000000|1, // match move
0x80000000|326, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 67
111,446, // "i"
  }
,
{ // state 68
0x80000000|669, // match move
0x80000000|407, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 69
89,856, // "c"
90,856, // "l"
91,856, // "a"
92,856, // "s"
93,82, // idChar
95,856, // "e"
100,237, // letter
101,422, // digit
102,287, // "_"
103,856, // "d"
104,856, // "g"
105,856, // "m"
106,856, // "p"
107,856, // "v"
108,856, // "y"
109,856, // {"A".."Z" "j" "q"}
110,856, // "f"
111,856, // "i"
112,856, // "o"
113,856, // "r"
114,856, // "u"
115,856, // "x"
116,856, // "b"
117,856, // "h"
118,856, // "k"
119,856, // "n"
120,856, // "t"
121,856, // "w"
122,856, // "z"
123,68, // {"0".."9"}
  }
,
{ // state 70
2,332, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 71
107,656, // "v"
  }
,
{ // state 72
113,275, // "r"
  }
,
{ // state 73
123,394, // {"0".."9"}
  }
,
{ // state 74
0x80000000|1, // match move
0x80000000|179, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 75
162,MIN_REDUCTION+284, // $NT
  }
,
{ // state 76
2,573, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 77
0x80000000|1, // match move
0x80000000|18, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 78
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 79
89,784, // "c"
  }
,
{ // state 80
119,359, // "n"
  }
,
{ // state 81
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+294, // $NT
  }
,
{ // state 82
0x80000000|905, // match move
0x80000000|278, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 83
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 84
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 85
0x80000000|1, // match move
0x80000000|797, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 86
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 87
2,81, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+295, // $NT
  }
,
{ // state 88
0x80000000|878, // match move
0x80000000|793, // no-match move
// T-test match for "=":
97,
  }
,
{ // state 89
89,549, // "c"
  }
,
{ // state 90
119,744, // "n"
  }
,
{ // state 91
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 92
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 93
92,689, // "s"
  }
,
{ // state 94
92,108, // "s"
120,579, // "t"
  }
,
{ // state 95
120,335, // "t"
  }
,
{ // state 96
91,567, // "a"
  }
,
{ // state 97
104,10, // "g"
  }
,
{ // state 98
162,MIN_REDUCTION+107, // $NT
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 99
162,MIN_REDUCTION+263, // $NT
  }
,
{ // state 100
120,540, // "t"
  }
,
{ // state 101
89,606, // "c"
  }
,
{ // state 102
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 103
95,19, // "e"
  }
,
{ // state 104
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 105
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 106
0x80000000|250, // match move
0x80000000|863, // no-match move
0x80000000|571, // NT-test-match state for reserved
  }
,
{ // state 107
116,699, // "b"
  }
,
{ // state 108
120,964, // "t"
  }
,
{ // state 109
95,50, // "e"
112,559, // "o"
  }
,
{ // state 110
119,351, // "n"
  }
,
{ // state 111
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 112
2,220, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 113
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 114
162,MIN_REDUCTION+233, // $NT
  }
,
{ // state 115
112,450, // "o"
  }
,
{ // state 116
120,880, // "t"
  }
,
{ // state 117
95,637, // "e"
  }
,
{ // state 118
2,665, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 119
2,57, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 120
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 121
2,78, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 122
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 123
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 124
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+234, // $NT
  }
,
{ // state 125
2,947, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 126
95,808, // "e"
  }
,
{ // state 127
117,276, // "h"
  }
,
{ // state 128
2,92, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 129
0x80000000|453, // match move
0x80000000|951, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 130
95,982, // "e"
  }
,
{ // state 131
103,592, // "d"
  }
,
{ // state 132
0x80000000|1, // match move
0x80000000|381, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 133
120,885, // "t"
  }
,
{ // state 134
114,596, // "u"
  }
,
{ // state 135
162,MIN_REDUCTION+242, // $NT
  }
,
{ // state 136
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 137
95,8, // "e"
  }
,
{ // state 138
128,518, // {10}
  }
,
{ // state 139
2,887, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 140
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
310, // token
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
974, // `!
147, // `!=
316, // `%
247, // `&&
141, // `*
467, // `(
104, // `)
441, // `{
411, // `}
555, // `-
285, // `+
173, // `=
583, // `==
902, // `[
661, // `]
875, // `||
463, // `<
155, // `<=
762, // `,
782, // `>
329, // `>=
534, // `.
472, // `;
136, // `++
977, // `--
357, // `/
51, // `:
973, // ID
306, // INT_LITERAL
702, // STRING_LITERAL
183, // CHAR_LITERAL
386, // "c"
386, // "l"
386, // "a"
386, // "s"
-1, // idChar
-1, // reserved
386, // "e"
88, // "!"
823, // "="
955, // "+"
180, // digit++
956, // letter
202, // digit
-1, // "_"
386, // "d"
386, // "g"
386, // "m"
386, // "p"
386, // "v"
386, // "y"
386, // {"A".."Z" "j" "q"}
386, // "f"
386, // "i"
386, // "o"
386, // "r"
386, // "u"
386, // "x"
386, // "b"
386, // "h"
386, // "k"
386, // "n"
386, // "t"
386, // "w"
386, // "z"
417, // {"0".."9"}
-1, // white
-1, // " "
-1, // {9 12}
-1, // eol
-1, // {10}
-1, // {13}
-1, // printable
997, // "["
380, // "-"
188, // "<"
273, // "|"
556, // "&"
385, // ")"
959, // ","
552, // "]"
424, // "/"
200, // ";"
563, // ">"
763, // "{"
568, // "%"
519, // "("
-1, // "\"
112, // "."
128, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
940, // "}"
842, // "'"
995, // '"'
745, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // token*
617, // digit+
-1, // idChar*
MIN_REDUCTION+336, // $
-1, // $NT
  }
,
{ // state 141
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 142
117,1013, // "h"
  }
,
{ // state 143
103,5, // "d"
  }
,
{ // state 144
162,MIN_REDUCTION+91, // $NT
  }
,
{ // state 145
90,465, // "l"
91,710, // "a"
112,524, // "o"
117,334, // "h"
  }
,
{ // state 146
95,77, // "e"
  }
,
{ // state 147
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 148
0x80000000|1, // match move
0x80000000|365, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 149
95,738, // "e"
  }
,
{ // state 150
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 151
120,74, // "t"
  }
,
{ // state 152
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 153
119,1021, // "n"
  }
,
{ // state 154
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+246, // $NT
  }
,
{ // state 155
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 156
4,310, // token
5,895, // `boolean
6,170, // `class
7,245, // `extends
8,693, // `void
9,723, // `int
10,989, // `while
11,123, // `if
12,150, // `else
13,593, // `for
14,364, // `break
15,826, // `this
16,928, // `false
17,798, // `true
18,105, // `super
19,584, // `null
20,903, // `return
21,870, // `instanceof
22,437, // `new
23,716, // `abstract
24,588, // `assert
25,622, // `byte
26,83, // `case
27,1003, // `catch
28,442, // `char
29,581, // `const
30,831, // `continue
31,512, // `default
32,806, // `do
33,355, // `double
34,120, // `enum
35,765, // `final
36,776, // `finally
37,254, // `float
38,341, // `goto
39,610, // `implements
40,724, // `import
41,494, // `interface
42,317, // `long
43,30, // `native
44,1030, // `package
45,996, // `private
46,922, // `protected
47,558, // `public
48,673, // `short
49,535, // `static
50,848, // `strictfp
51,91, // `switch
52,60, // `synchronized
53,238, // `throw
54,971, // `throws
55,550, // `transient
56,882, // `try
57,1004, // `volatile
89,290, // "c"
90,187, // "l"
91,910, // "a"
92,854, // "s"
95,906, // "e"
103,896, // "d"
104,753, // "g"
106,876, // "p"
107,987, // "v"
110,683, // "f"
111,63, // "i"
113,457, // "r"
116,941, // "b"
119,436, // "n"
120,166, // "t"
121,666, // "w"
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 157
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 158
0x80000000|1, // match move
0x80000000|749, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 159
89,614, // "c"
  }
,
{ // state 160
106,728, // "p"
  }
,
{ // state 161
2,874, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+280, // $NT
  }
,
{ // state 162
128,937, // {10}
  }
,
{ // state 163
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+258, // $NT
  }
,
{ // state 164
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 165
151,681, // '"'
157,751, // $$2
  }
,
{ // state 166
113,366, // "r"
117,230, // "h"
  }
,
{ // state 167
2,525, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 168
91,840, // "a"
  }
,
{ // state 169
90,918, // "l"
  }
,
{ // state 170
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 171
0x80000000|1, // match move
0x80000000|44, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 172
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+303, // $NT
  }
,
{ // state 173
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 174
112,613, // "o"
  }
,
{ // state 175
0x80000000|1, // match move
0x80000000|161, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 176
95,746, // "e"
  }
,
{ // state 177
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 178
120,623, // "t"
  }
,
{ // state 179
2,752, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 180
2,403, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 181
92,414, // "s"
  }
,
{ // state 182
2,807, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 183
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 184
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 185
95,432, // "e"
  }
,
{ // state 186
92,264, // "s"
116,781, // "b"
  }
,
{ // state 187
112,641, // "o"
  }
,
{ // state 188
0x80000000|795, // match move
0x80000000|873, // no-match move
// T-test match for "=":
97,
  }
,
{ // state 189
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 190
0x80000000|1, // match move
0x80000000|45, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 191
89,810, // "c"
90,810, // "l"
91,810, // "a"
92,810, // "s"
95,810, // "e"
96,810, // "!"
97,810, // "="
98,810, // "+"
102,810, // "_"
103,810, // "d"
104,810, // "g"
105,810, // "m"
106,810, // "p"
107,810, // "v"
108,810, // "y"
109,810, // {"A".."Z" "j" "q"}
110,810, // "f"
111,810, // "i"
112,810, // "o"
113,810, // "r"
114,810, // "u"
115,810, // "x"
116,810, // "b"
117,810, // "h"
118,810, // "k"
119,810, // "n"
120,810, // "t"
121,810, // "w"
122,810, // "z"
123,810, // {"0".."9"}
125,810, // " "
130,184, // printable
131,810, // "["
132,810, // "-"
133,810, // "<"
134,810, // "|"
135,810, // "&"
136,810, // ")"
137,810, // ","
138,810, // "]"
139,810, // "/"
140,810, // ";"
141,810, // ">"
142,810, // "{"
143,810, // "%"
144,810, // "("
145,810, // "\"
146,810, // "."
147,810, // ":"
148,810, // {"#".."$" "?".."@" "^" "`" "~"}
149,810, // "}"
150,810, // "'"
151,810, // '"'
152,810, // "*"
155,41, // stringChar
  }
,
{ // state 192
162,MIN_REDUCTION+278, // $NT
  }
,
{ // state 193
89,820, // "c"
  }
,
{ // state 194
2,640, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 195
111,392, // "i"
  }
,
{ // state 196
2,300, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+298, // $NT
  }
,
{ // state 197
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 198
89,575, // "c"
  }
,
{ // state 199
0x80000000|1, // match move
0x80000000|213, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 200
2,164, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 201
0x80000000|1, // match move
0x80000000|252, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 202
0x80000000|901, // match move
0x80000000|844, // no-match move
0x80000000|73, // NT-test-match state for digit
  }
,
{ // state 203
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 204
90,695, // "l"
  }
,
{ // state 205
120,915, // "t"
  }
,
{ // state 206
91,286, // "a"
95,725, // "e"
114,547, // "u"
  }
,
{ // state 207
89,400, // "c"
  }
,
{ // state 208
0x80000000|1, // match move
0x80000000|266, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 209
104,421, // "g"
  }
,
{ // state 210
89,654, // "c"
  }
,
{ // state 211
95,536, // "e"
  }
,
{ // state 212
120,377, // "t"
  }
,
{ // state 213
2,416, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 214
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 215
106,934, // "p"
  }
,
{ // state 216
162,MIN_REDUCTION+109, // $NT
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 217
0x80000000|1, // match move
0x80000000|785, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 218
111,333, // "i"
  }
,
{ // state 219
120,158, // "t"
  }
,
{ // state 220
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 221
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+282, // $NT
  }
,
{ // state 222
2,615, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
153,690, // idChar**
154,270, // $$1
160,455, // idChar*
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 223
95,545, // "e"
  }
,
{ // state 224
113,650, // "r"
  }
,
{ // state 225
120,960, // "t"
  }
,
{ // state 226
105,859, // "m"
  }
,
{ // state 227
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+89, // $NT
  }
,
{ // state 228
90,255, // "l"
112,391, // "o"
  }
,
{ // state 229
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 230
111,748, // "i"
113,261, // "r"
  }
,
{ // state 231
2,634, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 232
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 233
120,529, // "t"
  }
,
{ // state 234
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+186, // $NT
  }
,
{ // state 235
91,29, // "a"
108,557, // "y"
114,942, // "u"
  }
,
{ // state 236
112,658, // "o"
  }
,
{ // state 237
0x80000000|770, // match move
0x80000000|122, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 238
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 239
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 240
0x80000000|1002, // match move
0x80000000|607, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 241
105,847, // "m"
  }
,
{ // state 242
0x80000000|1, // match move
0x80000000|11, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 243
103,26, // "d"
  }
,
{ // state 244
2,301, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+199, // $NT
  }
,
{ // state 245
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 246
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+285, // $NT
  }
,
{ // state 247
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 248
162,MIN_REDUCTION+103, // $NT
  }
,
{ // state 249
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+183, // $NT
  }
,
{ // state 250
3,4, // $$0
4,53, // token
5,895, // `boolean
6,170, // `class
7,245, // `extends
8,693, // `void
9,723, // `int
10,989, // `while
11,123, // `if
12,150, // `else
13,593, // `for
14,364, // `break
15,826, // `this
16,928, // `false
17,798, // `true
18,105, // `super
19,584, // `null
20,903, // `return
21,870, // `instanceof
22,437, // `new
23,716, // `abstract
24,588, // `assert
25,622, // `byte
26,83, // `case
27,1003, // `catch
28,442, // `char
29,581, // `const
30,831, // `continue
31,512, // `default
32,806, // `do
33,355, // `double
34,120, // `enum
35,765, // `final
36,776, // `finally
37,254, // `float
38,341, // `goto
39,610, // `implements
40,724, // `import
41,494, // `interface
42,317, // `long
43,30, // `native
44,1030, // `package
45,996, // `private
46,922, // `protected
47,558, // `public
48,673, // `short
49,535, // `static
50,848, // `strictfp
51,91, // `switch
52,60, // `synchronized
53,238, // `throw
54,971, // `throws
55,550, // `transient
56,882, // `try
57,1004, // `volatile
89,290, // "c"
90,187, // "l"
91,910, // "a"
92,854, // "s"
95,906, // "e"
103,896, // "d"
104,753, // "g"
106,876, // "p"
107,987, // "v"
110,683, // "f"
111,63, // "i"
113,457, // "r"
116,941, // "b"
119,436, // "n"
120,166, // "t"
121,666, // "w"
158,587, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 251
162,MIN_REDUCTION+248, // $NT
  }
,
{ // state 252
2,709, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 253
119,628, // "n"
  }
,
{ // state 254
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 255
95,988, // "e"
  }
,
{ // state 256
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 257
156,707, // stringChar*
157,850, // $$2
  }
,
{ // state 258
113,576, // "r"
  }
,
{ // state 259
162,MIN_REDUCTION+251, // $NT
  }
,
{ // state 260
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 261
112,413, // "o"
  }
,
{ // state 262
2,495, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 263
95,625, // "e"
  }
,
{ // state 264
92,469, // "s"
  }
,
{ // state 265
151,681, // '"'
156,707, // stringChar*
157,850, // $$2
  }
,
{ // state 266
2,239, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 267
95,302, // "e"
  }
,
{ // state 268
120,574, // "t"
  }
,
{ // state 269
114,680, // "u"
  }
,
{ // state 270
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 271
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+300, // $NT
  }
,
{ // state 272
162,MIN_REDUCTION+254, // $NT
  }
,
{ // state 273
134,231, // "|"
  }
,
{ // state 274
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 275
0x80000000|1, // match move
0x80000000|705, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 276
0x80000000|1, // match move
0x80000000|354, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 277
91,503, // "a"
  }
,
{ // state 278
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 279
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+177, // $NT
  }
,
{ // state 280
95,976, // "e"
  }
,
{ // state 281
162,MIN_REDUCTION+221, // $NT
  }
,
{ // state 282
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 283
0x80000000|138, // match move
0x80000000|304, // no-match move
// T-test match for 10:
128,
  }
,
{ // state 284
2,449, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+262, // $NT
  }
,
{ // state 285
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 286
120,52, // "t"
  }
,
{ // state 287
0x80000000|824, // match move
0x80000000|825, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 288
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 289
111,698, // "i"
  }
,
{ // state 290
90,818, // "l"
91,990, // "a"
112,80, // "o"
117,570, // "h"
  }
,
{ // state 291
114,346, // "u"
  }
,
{ // state 292
90,835, // "l"
  }
,
{ // state 293
0x80000000|1, // match move
0x80000000|182, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 294
110,590, // "f"
  }
,
{ // state 295
95,713, // "e"
  }
,
{ // state 296
119,17, // "n"
  }
,
{ // state 297
120,682, // "t"
  }
,
{ // state 298
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+249, // $NT
  }
,
{ // state 299
112,893, // "o"
  }
,
{ // state 300
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+297, // $NT
  }
,
{ // state 301
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+198, // $NT
  }
,
{ // state 302
91,967, // "a"
  }
,
{ // state 303
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 304
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 305
113,95, // "r"
  }
,
{ // state 306
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 307
95,897, // "e"
  }
,
{ // state 308
2,604, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 309
2,221, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+283, // $NT
  }
,
{ // state 310
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 311
0x80000000|888, // match move
0x80000000|389, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 312
91,674, // "a"
  }
,
{ // state 313
119,741, // "n"
  }
,
{ // state 314
95,869, // "e"
  }
,
{ // state 315
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+309, // $NT
  }
,
{ // state 316
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 317
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 318
2,1007, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+172, // $NT
  }
,
{ // state 319
2,260, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 320
103,132, // "d"
  }
,
{ // state 321
95,205, // "e"
  }
,
{ // state 322
2,371, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+181, // $NT
  }
,
{ // state 323
120,829, // "t"
  }
,
{ // state 324
119,891, // "n"
  }
,
{ // state 325
89,877, // "c"
  }
,
{ // state 326
2,904, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 327
92,991, // "s"
  }
,
{ // state 328
95,243, // "e"
  }
,
{ // state 329
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 330
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+288, // $NT
  }
,
{ // state 331
114,107, // "u"
  }
,
{ // state 332
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 333
120,868, // "t"
  }
,
{ // state 334
91,72, // "a"
  }
,
{ // state 335
0x80000000|1, // match move
0x80000000|721, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 336
0x80000000|1, // match move
0x80000000|459, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 337
95,601, // "e"
  }
,
{ // state 338
2,660, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 339
2,862, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 340
0x80000000|1, // match move
0x80000000|387, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 341
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 342
113,930, // "r"
  }
,
{ // state 343
90,103, // "l"
  }
,
{ // state 344
0x80000000|1, // match move
0x80000000|322, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 345
114,241, // "u"
  }
,
{ // state 346
113,924, // "r"
  }
,
{ // state 347
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+207, // $NT
  }
,
{ // state 348
113,418, // "r"
  }
,
{ // state 349
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 350
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 351
120,562, // "t"
  }
,
{ // state 352
0x80000000|1, // match move
0x80000000|87, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 353
0x80000000|1, // match move
0x80000000|708, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 354
2,402, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+223, // $NT
  }
,
{ // state 355
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 356
0x80000000|1, // match move
0x80000000|309, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 357
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 358
2,517, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 359
92,297, // "s"
120,917, // "t"
  }
,
{ // state 360
116,464, // "b"
  }
,
{ // state 361
162,MIN_REDUCTION+308, // $NT
  }
,
{ // state 362
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+243, // $NT
  }
,
{ // state 363
0x80000000|1, // match move
0x80000000|338, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 364
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 365
2,736, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+169, // $NT
  }
,
{ // state 366
91,253, // "a"
108,31, // "y"
114,832, // "u"
  }
,
{ // state 367
0x80000000|828, // match move
0x80000000|1020, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 368
2,694, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 369
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 370
0x80000000|256, // match move
0x80000000|350, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 371
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+180, // $NT
  }
,
{ // state 372
0x80000000|1, // match move
0x80000000|368, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 373
2,879, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 374
162,MIN_REDUCTION+239, // $NT
  }
,
{ // state 375
2,651, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 376
91,210, // "a"
  }
,
{ // state 377
95,668, // "e"
  }
,
{ // state 378
2,433, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 379
103,931, // "d"
  }
,
{ // state 380
0x80000000|794, // match move
0x80000000|375, // no-match move
// T-test match for "-":
132,
  }
,
{ // state 381
2,626, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 382
162,MIN_REDUCTION+102, // $NT
  }
,
{ // state 383
2,618, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 384
162,MIN_REDUCTION+197, // $NT
  }
,
{ // state 385
2,853, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 386
0x80000000|514, // match move
0x80000000|943, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 387
2,214, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 388
2,919, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 389
2,404, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 390
2,554, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 391
113,3, // "r"
  }
,
{ // state 392
90,992, // "l"
  }
,
{ // state 393
91,219, // "a"
  }
,
{ // state 394
162,MIN_REDUCTION+105, // $NT
  }
,
{ // state 395
162,MIN_REDUCTION+314, // $NT
  }
,
{ // state 396
95,15, // "e"
  }
,
{ // state 397
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+216, // $NT
  }
,
{ // state 398
112,739, // "o"
  }
,
{ // state 399
119,603, // "n"
  }
,
{ // state 400
117,560, // "h"
  }
,
{ // state 401
0x80000000|1, // match move
0x80000000|643, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 402
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+222, // $NT
  }
,
{ // state 403
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 404
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 405
0x80000000|1, // match move
0x80000000|24, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 406
89,856, // "c"
90,856, // "l"
91,856, // "a"
92,856, // "s"
93,370, // idChar
95,856, // "e"
100,237, // letter
101,422, // digit
102,287, // "_"
103,856, // "d"
104,856, // "g"
105,856, // "m"
106,856, // "p"
107,856, // "v"
108,856, // "y"
109,856, // {"A".."Z" "j" "q"}
110,856, // "f"
111,856, // "i"
112,856, // "o"
113,856, // "r"
114,856, // "u"
115,856, // "x"
116,856, // "b"
117,856, // "h"
118,856, // "k"
119,856, // "n"
120,856, // "t"
121,856, // "w"
122,856, // "z"
123,68, // {"0".."9"}
153,690, // idChar**
160,455, // idChar*
  }
,
{ // state 407
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 408
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 409
95,153, // "e"
  }
,
{ // state 410
162,MIN_REDUCTION+167, // $NT
  }
,
{ // state 411
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 412
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 413
121,311, // "w"
  }
,
{ // state 414
95,841, // "e"
  }
,
{ // state 415
98,339, // "+"
  }
,
{ // state 416
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 417
0x80000000|157, // match move
0x80000000|102, // no-match move
0x80000000|73, // NT-test-match state for digit
  }
,
{ // state 418
91,764, // "a"
  }
,
{ // state 419
2,523, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+196, // $NT
  }
,
{ // state 420
120,217, // "t"
  }
,
{ // state 421
95,732, // "e"
  }
,
{ // state 422
0x80000000|84, // match move
0x80000000|649, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 423
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 424
2,152, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 425
92,1027, // "s"
  }
,
{ // state 426
0x80000000|1, // match move
0x80000000|308, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 427
95,817, // "e"
  }
,
{ // state 428
89,177, // "c"
90,177, // "l"
91,177, // "a"
92,177, // "s"
95,177, // "e"
96,177, // "!"
97,177, // "="
98,177, // "+"
102,177, // "_"
103,177, // "d"
104,177, // "g"
105,177, // "m"
106,177, // "p"
107,177, // "v"
108,177, // "y"
109,177, // {"A".."Z" "j" "q"}
110,177, // "f"
111,177, // "i"
112,177, // "o"
113,177, // "r"
114,177, // "u"
115,177, // "x"
116,177, // "b"
117,177, // "h"
118,177, // "k"
119,177, // "n"
120,177, // "t"
121,177, // "w"
122,177, // "z"
123,177, // {"0".."9"}
125,177, // " "
130,605, // printable
131,177, // "["
132,177, // "-"
133,177, // "<"
134,177, // "|"
135,177, // "&"
136,177, // ")"
137,177, // ","
138,177, // "]"
139,177, // "/"
140,177, // ";"
141,177, // ">"
142,177, // "{"
143,177, // "%"
144,177, // "("
145,177, // "\"
146,177, // "."
147,177, // ":"
148,177, // {"#".."$" "?".."@" "^" "`" "~"}
149,177, // "}"
150,177, // "'"
151,177, // '"'
152,177, // "*"
155,515, // stringChar
  }
,
{ // state 429
2,349, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 430
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+270, // $NT
  }
,
{ // state 431
0x80000000|1, // match move
0x80000000|505, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 432
0x80000000|1, // match move
0x80000000|569, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 433
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 434
2,163, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+259, // $NT
  }
,
{ // state 435
91,811, // "a"
113,289, // "r"
  }
,
{ // state 436
91,542, // "a"
95,703, // "e"
114,13, // "u"
  }
,
{ // state 437
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 438
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 439
113,539, // "r"
  }
,
{ // state 440
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 441
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 442
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 443
90,185, // "l"
  }
,
{ // state 444
162,MIN_REDUCTION+230, // $NT
  }
,
{ // state 445
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 446
107,1026, // "v"
  }
,
{ // state 447
95,46, // "e"
  }
,
{ // state 448
128,216, // {10}
  }
,
{ // state 449
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+261, // $NT
  }
,
{ // state 450
90,396, // "l"
  }
,
{ // state 451
119,131, // "n"
  }
,
{ // state 452
89,884, // "c"
  }
,
{ // state 453
92,541, // "s"
  }
,
{ // state 454
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+291, // $NT
  }
,
{ // state 455
0x80000000|69, // match move
0x80000000|232, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 456
120,93, // "t"
  }
,
{ // state 457
95,871, // "e"
  }
,
{ // state 458
2,566, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 459
2,735, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+166, // $NT
  }
,
{ // state 460
110,538, // "f"
  }
,
{ // state 461
0x80000000|1, // match move
0x80000000|434, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 462
111,945, // "i"
113,958, // "r"
  }
,
{ // state 463
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 464
90,755, // "l"
  }
,
{ // state 465
91,58, // "a"
  }
,
{ // state 466
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 467
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 468
111,101, // "i"
  }
,
{ // state 469
95,305, // "e"
  }
,
{ // state 470
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 471
120,961, // "t"
  }
,
{ // state 472
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 473
2,704, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 474
121,129, // "w"
  }
,
{ // state 475
0x80000000|1, // match move
0x80000000|458, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 476
113,235, // "r"
117,462, // "h"
  }
,
{ // state 477
112,258, // "o"
  }
,
{ // state 478
0x80000000|1, // match move
0x80000000|284, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 479
110,293, // "f"
  }
,
{ // state 480
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+201, // $NT
  }
,
{ // state 481
2,729, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+211, // $NT
  }
,
{ // state 482
162,MIN_REDUCTION+170, // $NT
  }
,
{ // state 483
2,490, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+268, // $NT
  }
,
{ // state 484
162,MIN_REDUCTION+296, // $NT
  }
,
{ // state 485
2,675, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+313, // $NT
  }
,
{ // state 486
162,MIN_REDUCTION+94, // $NT
  }
,
{ // state 487
101,612, // digit
123,417, // {"0".."9"}
  }
,
{ // state 488
91,79, // "a"
113,737, // "r"
114,360, // "u"
  }
,
{ // state 489
0x80000000|1, // match move
0x80000000|498, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 490
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+267, // $NT
  }
,
{ // state 491
162,MIN_REDUCTION+275, // $NT
  }
,
{ // state 492
90,652, // "l"
  }
,
{ // state 493
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 494
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 495
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 496
116,944, // "b"
  }
,
{ // state 497
0x80000000|1, // match move
0x80000000|473, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 498
2,532, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+232, // $NT
  }
,
{ // state 499
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 500
114,226, // "u"
  }
,
{ // state 501
89,225, // "c"
  }
,
{ // state 502
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+255, // $NT
  }
,
{ // state 503
114,169, // "u"
  }
,
{ // state 504
107,792, // "v"
  }
,
{ // state 505
2,616, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 506
2,805, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+253, // $NT
  }
,
{ // state 507
95,168, // "e"
  }
,
{ // state 508
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 509
2,315, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+310, // $NT
  }
,
{ // state 510
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 511
0x80000000|1, // match move
0x80000000|429, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 512
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 513
89,337, // "c"
  }
,
{ // state 514
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 515
150,194, // "'"
  }
,
{ // state 516
90,734, // "l"
  }
,
{ // state 517
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 518
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 519
2,759, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 520
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+189, // $NT
  }
,
{ // state 521
111,116, // "i"
  }
,
{ // state 522
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 523
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+195, // $NT
  }
,
{ // state 524
119,933, // "n"
  }
,
{ // state 525
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 526
111,932, // "i"
  }
,
{ // state 527
117,372, // "h"
  }
,
{ // state 528
0x80000000|1, // match move
0x80000000|481, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 529
0x80000000|1, // match move
0x80000000|506, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 530
0x80000000|700, // match move
0x80000000|837, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 531
111,159, // "i"
  }
,
{ // state 532
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+231, // $NT
  }
,
{ // state 533
120,28, // "t"
  }
,
{ // state 534
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 535
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 536
0x80000000|1, // match move
0x80000000|646, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 537
2,772, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 538
91,269, // "a"
  }
,
{ // state 539
0x80000000|1, // match move
0x80000000|676, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 540
110,965, // "f"
  }
,
{ // state 541
0x80000000|1, // match move
0x80000000|742, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 542
120,67, // "t"
  }
,
{ // state 543
162,MIN_REDUCTION+287, // $NT
  }
,
{ // state 544
0x80000000|1, // match move
0x80000000|378, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 545
113,594, // "r"
  }
,
{ // state 546
0x80000000|1, // match move
0x80000000|935, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 547
90,867, // "l"
  }
,
{ // state 548
97,319, // "="
  }
,
{ // state 549
118,64, // "k"
  }
,
{ // state 550
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 551
90,367, // "l"
  }
,
{ // state 552
2,197, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 553
2,279, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+178, // $NT
  }
,
{ // state 554
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 555
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 556
135,667, // "&"
  }
,
{ // state 557
0x80000000|1, // match move
0x80000000|509, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 558
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 559
0x80000000|331, // match move
0x80000000|957, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 560
0x80000000|1, // match move
0x80000000|373, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 561
0x80000000|1, // match move
0x80000000|609, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 562
92,461, // "s"
  }
,
{ // state 563
0x80000000|548, // match move
0x80000000|390, // no-match move
// T-test match for "=":
97,
  }
,
{ // state 564
2,423, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 565
0x80000000|1, // match move
0x80000000|582, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 566
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 567
120,195, // "t"
  }
,
{ // state 568
2,438, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 569
2,712, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+175, // $NT
  }
,
{ // state 570
91,439, // "a"
  }
,
{ // state 571
5,59, // `boolean
6,144, // `class
7,410, // `extends
8,482, // `void
9,914, // `int
10,827, // `while
11,834, // `if
12,486, // `else
13,55, // `for
14,35, // `break
15,20, // `this
16,865, // `false
17,633, // `true
18,384, // `super
19,639, // `null
20,731, // `return
21,804, // `instanceof
22,1012, // `new
23,662, // `abstract
24,611, // `assert
25,881, // `byte
26,281, // `case
27,998, // `catch
28,921, // `char
29,444, // `const
30,114, // `continue
31,645, // `default
32,374, // `do
33,135, // `double
34,768, // `enum
35,251, // `final
36,259, // `finally
37,272, // `float
38,993, // `goto
39,572, // `implements
40,99, // `import
41,787, // `interface
42,697, // `long
43,43, // `native
44,491, // `package
45,192, // `private
46,816, // `protected
47,75, // `public
48,543, // `short
49,9, // `static
50,655, // `strictfp
51,484, // `switch
52,855, // `synchronized
53,771, // `throw
54,984, // `throws
55,361, // `transient
56,872, // `try
57,395, // `volatile
89,145, // "c"
90,948, // "l"
91,186, // "a"
92,691, // "s"
95,830, // "e"
103,109, // "d"
104,1019, // "g"
106,488, // "p"
107,236, // "v"
110,846, // "f"
111,42, // "i"
113,321, // "r"
116,1001, // "b"
119,206, // "n"
120,476, // "t"
121,845, // "w"
  }
,
{ // state 572
162,MIN_REDUCTION+260, // $NT
  }
,
{ // state 573
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 574
111,343, // "i"
  }
,
{ // state 575
95,952, // "e"
  }
,
{ // state 576
120,565, // "t"
  }
,
{ // state 577
2,47, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 578
95,501, // "e"
  }
,
{ // state 579
0x80000000|619, // match move
0x80000000|318, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 580
2,774, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+205, // $NT
  }
,
{ // state 581
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 582
2,246, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+286, // $NT
  }
,
{ // state 583
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 584
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 585
91,209, // "a"
  }
,
{ // state 586
2,249, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+184, // $NT
  }
,
{ // state 587
0x80000000|156, // match move
0x80000000|140, // no-match move
0x80000000|571, // NT-test-match state for reserved
  }
,
{ // state 588
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 589
0x80000000|1, // match move
0x80000000|553, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 590
91,954, // "a"
  }
,
{ // state 591
0x80000000|1, // match move
0x80000000|966, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 592
92,336, // "s"
  }
,
{ // state 593
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 594
0x80000000|1, // match move
0x80000000|419, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 595
161,MIN_REDUCTION+0, // $
  }
,
{ // state 596
95,489, // "e"
  }
,
{ // state 597
89,133, // "c"
  }
,
{ // state 598
-1, // $$start
595, // start
106, // white*
757, // $$0
53, // token
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
974, // `!
147, // `!=
316, // `%
247, // `&&
141, // `*
467, // `(
104, // `)
441, // `{
411, // `}
555, // `-
285, // `+
173, // `=
583, // `==
902, // `[
661, // `]
875, // `||
463, // `<
155, // `<=
762, // `,
782, // `>
329, // `>=
534, // `.
472, // `;
136, // `++
977, // `--
357, // `/
51, // `:
973, // ID
306, // INT_LITERAL
702, // STRING_LITERAL
183, // CHAR_LITERAL
386, // "c"
386, // "l"
386, // "a"
386, // "s"
-1, // idChar
-1, // reserved
386, // "e"
88, // "!"
823, // "="
955, // "+"
180, // digit++
956, // letter
202, // digit
-1, // "_"
386, // "d"
386, // "g"
386, // "m"
386, // "p"
386, // "v"
386, // "y"
386, // {"A".."Z" "j" "q"}
386, // "f"
386, // "i"
386, // "o"
386, // "r"
386, // "u"
386, // "x"
386, // "b"
386, // "h"
386, // "k"
386, // "n"
386, // "t"
386, // "w"
386, // "z"
417, // {"0".."9"}
802, // white
466, // " "
466, // {9 12}
780, // eol
858, // {10}
283, // {13}
-1, // printable
997, // "["
380, // "-"
188, // "<"
273, // "|"
556, // "&"
385, // ")"
959, // ","
552, // "]"
424, // "/"
200, // ";"
563, // ">"
763, // "{"
568, // "%"
519, // "("
-1, // "\"
112, // "."
128, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
940, // "}"
842, // "'"
995, // '"'
745, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
587, // token*
617, // digit+
-1, // idChar*
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 599
120,126, // "t"
  }
,
{ // state 600
119,208, // "n"
  }
,
{ // state 601
112,861, // "o"
  }
,
{ // state 602
162,MIN_REDUCTION+331, // $NT
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 603
89,142, // "c"
  }
,
{ // state 604
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 605
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 606
0x80000000|1, // match move
0x80000000|630, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 607
2,866, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 608
117,352, // "h"
  }
,
{ // state 609
2,227, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+90, // $NT
  }
,
{ // state 610
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 611
162,MIN_REDUCTION+215, // $NT
  }
,
{ // state 612
0x80000000|733, // match move
0x80000000|632, // no-match move
0x80000000|73, // NT-test-match state for digit
  }
,
{ // state 613
119,526, // "n"
  }
,
{ // state 614
120,777, // "t"
  }
,
{ // state 615
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 616
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 617
0x80000000|487, // match move
0x80000000|493, // no-match move
0x80000000|73, // NT-test-match state for digit
  }
,
{ // state 618
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 619
95,21, // "e"
  }
,
{ // state 620
120,348, // "t"
  }
,
{ // state 621
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 622
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 623
112,1018, // "o"
  }
,
{ // state 624
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+219, // $NT
  }
,
{ // state 625
0x80000000|1, // match move
0x80000000|786, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 626
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 627
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 628
92,972, // "s"
  }
,
{ // state 629
111,409, // "i"
  }
,
{ // state 630
2,926, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 631
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 632
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 633
162,MIN_REDUCTION+194, // $NT
  }
,
{ // state 634
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 635
2,362, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+244, // $NT
  }
,
{ // state 636
2,111, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 637
113,1016, // "r"
  }
,
{ // state 638
95,171, // "e"
  }
,
{ // state 639
162,MIN_REDUCTION+200, // $NT
  }
,
{ // state 640
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 641
119,39, // "n"
  }
,
{ // state 642
92,471, // "s"
  }
,
{ // state 643
2,454, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+292, // $NT
  }
,
{ // state 644
111,443, // "i"
  }
,
{ // state 645
162,MIN_REDUCTION+236, // $NT
  }
,
{ // state 646
2,857, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+277, // $NT
  }
,
{ // state 647
0x80000000|1, // match move
0x80000000|636, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 648
92,149, // "s"
  }
,
{ // state 649
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 650
110,913, // "f"
  }
,
{ // state 651
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 652
95,199, // "e"
  }
,
{ // state 653
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+192, // $NT
  }
,
{ // state 654
120,16, // "t"
  }
,
{ // state 655
162,MIN_REDUCTION+293, // $NT
  }
,
{ // state 656
91,1008, // "a"
  }
,
{ // state 657
2,803, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+93, // $NT
  }
,
{ // state 658
90,981, // "l"
111,1029, // "i"
  }
,
{ // state 659
0x80000000|1, // match move
0x80000000|580, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 660
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 661
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 662
162,MIN_REDUCTION+212, // $NT
  }
,
{ // state 663
2,936, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+274, // $NT
  }
,
{ // state 664
95,110, // "e"
  }
,
{ // state 665
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 666
117,801, // "h"
  }
,
{ // state 667
2,627, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 668
0x80000000|1, // match move
0x80000000|821, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 669
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 670
89,497, // "c"
  }
,
{ // state 671
0x80000000|1, // match move
0x80000000|383, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 672
0x80000000|448, // match move
0x80000000|819, // no-match move
// T-test match for 10:
128,
  }
,
{ // state 673
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 674
119,198, // "n"
  }
,
{ // state 675
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+312, // $NT
  }
,
{ // state 676
2,2, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 677
162,MIN_REDUCTION+108, // $NT
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 678
95,591, // "e"
  }
,
{ // state 679
0x80000000|1, // match move
0x80000000|760, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 680
90,813, // "l"
  }
,
{ // state 681
2,916, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 682
0x80000000|1, // match move
0x80000000|537, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 683
90,950, // "l"
91,204, // "a"
111,324, // "i"
112,342, // "o"
  }
,
{ // state 684
0x80000000|1, // match move
0x80000000|577, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 685
113,61, // "r"
  }
,
{ // state 686
111,504, // "i"
112,533, // "o"
  }
,
{ // state 687
113,344, // "r"
  }
,
{ // state 688
0x80000000|1, // match move
0x80000000|586, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 689
0x80000000|1, // match move
0x80000000|833, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 690
2,615, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
154,715, // $$1
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 691
108,399, // "y"
114,979, // "u"
117,477, // "h"
120,986, // "t"
121,521, // "w"
  }
,
{ // state 692
104,263, // "g"
  }
,
{ // state 693
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 694
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 695
92,788, // "s"
  }
,
{ // state 696
2,653, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+193, // $NT
  }
,
{ // state 697
162,MIN_REDUCTION+269, // $NT
  }
,
{ // state 698
89,100, // "c"
  }
,
{ // state 699
90,427, // "l"
  }
,
{ // state 700
90,860, // "l"
  }
,
{ // state 701
114,496, // "u"
  }
,
{ // state 702
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 703
121,1025, // "w"
  }
,
{ // state 704
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 705
2,892, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+226, // $NT
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
{ // state 706
0x80000000|1, // match move
0x80000000|696, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 707
0x80000000|766, // match move
0x80000000|754, // no-match move
// T-test match for "\":
145,
  }
,
{ // state 708
2,113, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 709
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 710
92,638, // "s"
120,949, // "t"
  }
,
{ // state 711
106,228, // "p"
  }
,
{ // state 712
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+174, // $NT
  }
,
{ // state 713
0x80000000|1, // match move
0x80000000|778, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 714
120,137, // "t"
  }
,
{ // state 715
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 716
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 717
122,1015, // "z"
  }
,
{ // state 718
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+306, // $NT
  }
,
{ // state 719
112,296, // "o"
  }
,
{ // state 720
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 721
2,756, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+214, // $NT
  }
,
{ // state 722
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+240, // (default reduction)
  }
,
{ // state 723
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 724
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 725
121,65, // "w"
  }
,
{ // state 726
113,174, // "r"
  }
,
{ // state 727
2,412, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 728
95,23, // "e"
  }
,
{ // state 729
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+210, // $NT
  }
,
{ // state 730
111,1022, // "i"
  }
,
{ // state 731
162,MIN_REDUCTION+203, // $NT
  }
,
{ // state 732
0x80000000|1, // match move
0x80000000|663, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 733
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 734
0x80000000|1, // match move
0x80000000|769, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 735
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+165, // $NT
  }
,
{ // state 736
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+168, // $NT
  }
,
{ // state 737
111,71, // "i"
112,851, // "o"
  }
,
{ // state 738
0x80000000|1, // match move
0x80000000|657, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 739
113,36, // "r"
  }
,
{ // state 740
92,117, // "s"
  }
,
{ // state 741
114,898, // "u"
  }
,
{ // state 742
2,172, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+304, // $NT
  }
,
{ // state 743
2,234, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+187, // $NT
  }
,
{ // state 744
91,822, // "a"
  }
,
{ // state 745
2,775, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 746
105,280, // "m"
  }
,
{ // state 747
119,513, // "n"
  }
,
{ // state 748
92,201, // "s"
  }
,
{ // state 749
2,923, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 750
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 751
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 752
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 753
112,323, // "o"
  }
,
{ // state 754
0x80000000|165, // match move
0x80000000|191, // no-match move
// T-test match for '"':
151,
  }
,
{ // state 755
111,994, // "i"
  }
,
{ // state 756
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+213, // $NT
  }
,
{ // state 757
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 758
1,595, // start
2,106, // white*
3,757, // $$0
4,53, // token
5,895, // `boolean
6,170, // `class
7,245, // `extends
8,693, // `void
9,723, // `int
10,989, // `while
11,123, // `if
12,150, // `else
13,593, // `for
14,364, // `break
15,826, // `this
16,928, // `false
17,798, // `true
18,105, // `super
19,584, // `null
20,903, // `return
21,870, // `instanceof
22,437, // `new
23,716, // `abstract
24,588, // `assert
25,622, // `byte
26,83, // `case
27,1003, // `catch
28,442, // `char
29,581, // `const
30,831, // `continue
31,512, // `default
32,806, // `do
33,355, // `double
34,120, // `enum
35,765, // `final
36,776, // `finally
37,254, // `float
38,341, // `goto
39,610, // `implements
40,724, // `import
41,494, // `interface
42,317, // `long
43,30, // `native
44,1030, // `package
45,996, // `private
46,922, // `protected
47,558, // `public
48,673, // `short
49,535, // `static
50,848, // `strictfp
51,91, // `switch
52,60, // `synchronized
53,238, // `throw
54,971, // `throws
55,550, // `transient
56,882, // `try
57,1004, // `volatile
89,290, // "c"
90,187, // "l"
91,910, // "a"
92,854, // "s"
95,906, // "e"
103,896, // "d"
104,753, // "g"
106,876, // "p"
107,987, // "v"
110,683, // "f"
111,63, // "i"
113,457, // "r"
116,941, // "b"
119,436, // "n"
120,166, // "t"
121,666, // "w"
158,587, // token*
161,MIN_REDUCTION+1, // $
  }
,
{ // state 759
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 760
2,298, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+250, // $NT
  }
,
{ // state 761
0x80000000|1, // match move
0x80000000|244, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 762
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 763
2,799, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 764
89,975, // "c"
  }
,
{ // state 765
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 766
157,751, // $$2
  }
,
{ // state 767
0x80000000|1, // match move
0x80000000|743, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 768
162,MIN_REDUCTION+245, // $NT
  }
,
{ // state 769
2,783, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 770
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 771
162,MIN_REDUCTION+302, // $NT
  }
,
{ // state 772
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 773
95,451, // "e"
  }
,
{ // state 774
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+204, // $NT
  }
,
{ // state 775
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 776
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 777
110,49, // "f"
  }
,
{ // state 778
2,722, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 779
0x80000000|1, // match move
0x80000000|428, // no-match move
// T-test match for '"':
151,
  }
,
{ // state 780
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 781
92,620, // "s"
  }
,
{ // state 782
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 783
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 784
118,585, // "k"
  }
,
{ // state 785
2,968, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+229, // $NT
  }
,
{ // state 786
2,203, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 787
162,MIN_REDUCTION+266, // $NT
  }
,
{ // state 788
95,647, // "e"
  }
,
{ // state 789
162,MIN_REDUCTION+330, // $NT
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 790
92,561, // "s"
  }
,
{ // state 791
2,520, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+190, // $NT
  }
,
{ // state 792
91,714, // "a"
  }
,
{ // state 793
2,274, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 794
132,12, // "-"
  }
,
{ // state 795
97,76, // "="
  }
,
{ // state 796
119,1011, // "n"
  }
,
{ // state 797
2,962, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 798
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 799
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 800
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 801
111,492, // "i"
  }
,
{ // state 802
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 803
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+92, // $NT
  }
,
{ // state 804
162,MIN_REDUCTION+206, // $NT
  }
,
{ // state 805
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+252, // $NT
  }
,
{ // state 806
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 807
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 808
119,379, // "n"
  }
,
{ // state 809
120,773, // "t"
  }
,
{ // state 810
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 811
120,468, // "t"
  }
,
{ // state 812
92,629, // "s"
  }
,
{ // state 813
120,852, // "t"
  }
,
{ // state 814
2,330, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+289, // $NT
  }
,
{ // state 815
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+237, // $NT
  }
,
{ // state 816
162,MIN_REDUCTION+281, // $NT
  }
,
{ // state 817
0x80000000|1, // match move
0x80000000|907, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 818
91,425, // "a"
  }
,
{ // state 819
162,MIN_REDUCTION+110, // $NT
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 820
0x80000000|1, // match move
0x80000000|814, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 821
2,886, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 822
90,530, // "l"
  }
,
{ // state 823
0x80000000|929, // match move
0x80000000|388, // no-match move
// T-test match for "=":
97,
  }
,
{ // state 824
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 825
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 826
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 827
162,MIN_REDUCTION+176, // $NT
  }
,
{ // state 828
90,925, // "l"
  }
,
{ // state 829
112,66, // "o"
  }
,
{ // state 830
90,648, // "l"
115,809, // "x"
119,500, // "n"
  }
,
{ // state 831
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 832
95,671, // "e"
  }
,
{ // state 833
2,470, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 834
162,MIN_REDUCTION+179, // $NT
  }
,
{ // state 835
111,670, // "i"
  }
,
{ // state 836
119,97, // "n"
  }
,
{ // state 837
2,154, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+247, // $NT
  }
,
{ // state 838
2,440, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 839
0x80000000|1, // match move
0x80000000|70, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 840
118,688, // "k"
  }
,
{ // state 841
0x80000000|1, // match move
0x80000000|791, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 842
0x80000000|1, // match move
0x80000000|779, // no-match move
// T-test match for "\":
145,
  }
,
{ // state 843
107,678, // "v"
  }
,
{ // state 844
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 845
117,644, // "h"
  }
,
{ // state 846
90,849, // "l"
91,1017, // "a"
111,90, // "i"
112,687, // "o"
  }
,
{ // state 847
0x80000000|1, // match move
0x80000000|838, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 848
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 849
112,912, // "o"
  }
,
{ // state 850
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 851
120,578, // "t"
  }
,
{ // state 852
0x80000000|1, // match move
0x80000000|54, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 853
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 854
108,978, // "y"
114,160, // "u"
117,398, // "h"
120,435, // "t"
121,218, // "w"
  }
,
{ // state 855
162,MIN_REDUCTION+299, // $NT
  }
,
{ // state 856
0x80000000|189, // match move
0x80000000|229, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 857
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+276, // $NT
  }
,
{ // state 858
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 859
0x80000000|1, // match move
0x80000000|635, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 860
108,679, // "y"
  }
,
{ // state 861
110,659, // "f"
  }
,
{ // state 862
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 863
-1, // $$start
-1, // start
-1, // white*
4, // $$0
53, // token
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
974, // `!
147, // `!=
316, // `%
247, // `&&
141, // `*
467, // `(
104, // `)
441, // `{
411, // `}
555, // `-
285, // `+
173, // `=
583, // `==
902, // `[
661, // `]
875, // `||
463, // `<
155, // `<=
762, // `,
782, // `>
329, // `>=
534, // `.
472, // `;
136, // `++
977, // `--
357, // `/
51, // `:
973, // ID
306, // INT_LITERAL
702, // STRING_LITERAL
183, // CHAR_LITERAL
386, // "c"
386, // "l"
386, // "a"
386, // "s"
-1, // idChar
-1, // reserved
386, // "e"
88, // "!"
823, // "="
955, // "+"
180, // digit++
956, // letter
202, // digit
-1, // "_"
386, // "d"
386, // "g"
386, // "m"
386, // "p"
386, // "v"
386, // "y"
386, // {"A".."Z" "j" "q"}
386, // "f"
386, // "i"
386, // "o"
386, // "r"
386, // "u"
386, // "x"
386, // "b"
386, // "h"
386, // "k"
386, // "n"
386, // "t"
386, // "w"
386, // "z"
417, // {"0".."9"}
720, // white
466, // " "
466, // {9 12}
780, // eol
858, // {10}
283, // {13}
-1, // printable
997, // "["
380, // "-"
188, // "<"
273, // "|"
556, // "&"
385, // ")"
959, // ","
552, // "]"
424, // "/"
200, // ";"
563, // ">"
763, // "{"
568, // "%"
519, // "("
-1, // "\"
112, // "."
128, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
940, // "}"
842, // "'"
995, // '"'
745, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
587, // token*
617, // digit+
-1, // idChar*
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 864
162,MIN_REDUCTION+106, // $NT
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 865
162,MIN_REDUCTION+191, // $NT
  }
,
{ // state 866
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 867
90,761, // "l"
  }
,
{ // state 868
89,527, // "c"
  }
,
{ // state 869
0x80000000|1, // match move
0x80000000|62, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 870
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 871
120,291, // "t"
  }
,
{ // state 872
162,MIN_REDUCTION+311, // $NT
  }
,
{ // state 873
2,800, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 874
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+279, // $NT
  }
,
{ // state 875
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 876
91,89, // "a"
113,686, // "r"
114,1031, // "u"
  }
,
{ // state 877
95,889, // "e"
  }
,
{ // state 878
97,139, // "="
  }
,
{ // state 879
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 880
89,608, // "c"
  }
,
{ // state 881
162,MIN_REDUCTION+218, // $NT
  }
,
{ // state 882
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 883
2,750, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 884
117,726, // "h"
  }
,
{ // state 885
95,320, // "e"
  }
,
{ // state 886
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 887
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 888
92,22, // "s"
  }
,
{ // state 889
0x80000000|1, // match move
0x80000000|25, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 890
90,96, // "l"
111,6, // "i"
  }
,
{ // state 891
91,551, // "a"
  }
,
{ // state 892
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+225, // $NT
  }
,
{ // state 893
90,447, // "l"
  }
,
{ // state 894
120,939, // "t"
  }
,
{ // state 895
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 896
95,460, // "e"
112,33, // "o"
  }
,
{ // state 897
119,151, // "n"
  }
,
{ // state 898
95,363, // "e"
  }
,
{ // state 899
162,MIN_REDUCTION+104, // $NT
  }
,
{ // state 900
103,175, // "d"
  }
,
{ // state 901
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 902
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 903
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 904
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 905
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 906
90,327, // "l"
115,599, // "x"
119,345, // "n"
  }
,
{ // state 907
2,963, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+241, // $NT
  }
,
{ // state 908
0x80000000|265, // match move
0x80000000|1032, // no-match move
// T-test match for '"':
151,
  }
,
{ // state 909
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 910
92,740, // "s"
116,642, // "b"
  }
,
{ // state 911
2,397, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+217, // $NT
  }
,
{ // state 912
91,233, // "a"
  }
,
{ // state 913
91,325, // "a"
  }
,
{ // state 914
162,MIN_REDUCTION+173, // $NT
  }
,
{ // state 915
114,685, // "u"
  }
,
{ // state 916
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 917
111,313, // "i"
  }
,
{ // state 918
120,242, // "t"
  }
,
{ // state 919
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 920
0x80000000|1, // match move
0x80000000|1005, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 921
162,MIN_REDUCTION+227, // $NT
  }
,
{ // state 922
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 923
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 924
119,353, // "n"
  }
,
{ // state 925
108,839, // "y"
  }
,
{ // state 926
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 927
2,38, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+163, // $NT
  }
,
{ // state 928
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 929
97,727, // "="
  }
,
{ // state 930
0x80000000|1, // match move
0x80000000|564, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 931
92,544, // "s"
  }
,
{ // state 932
122,328, // "z"
  }
,
{ // state 933
92,420, // "s"
120,730, // "t"
  }
,
{ // state 934
90,176, // "l"
112,999, // "o"
  }
,
{ // state 935
2,40, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 936
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+273, // $NT
  }
,
{ // state 937
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 938
2,969, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 939
111,193, // "i"
  }
,
{ // state 940
2,909, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 941
108,212, // "y"
112,299, // "o"
113,267, // "r"
  }
,
{ // state 942
95,706, // "e"
  }
,
{ // state 943
102,MIN_REDUCTION+104, // "_"
153,MIN_REDUCTION+104, // idChar**
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 944
90,295, // "l"
  }
,
{ // state 945
92,767, // "s"
  }
,
{ // state 946
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 947
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 948
112,836, // "o"
  }
,
{ // state 949
89,127, // "c"
  }
,
{ // state 950
112,393, // "o"
  }
,
{ // state 951
2,271, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+301, // $NT
  }
,
{ // state 952
112,479, // "o"
  }
,
{ // state 953
120,130, // "t"
  }
,
{ // state 954
89,146, // "c"
  }
,
{ // state 955
0x80000000|415, // match move
0x80000000|358, // no-match move
// T-test match for "+":
98,
  }
,
{ // state 956
0x80000000|406, // match move
0x80000000|222, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 957
2,815, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+238, // $NT
  }
,
{ // state 958
112,474, // "o"
  }
,
{ // state 959
2,946, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 960
95,900, // "e"
  }
,
{ // state 961
113,376, // "r"
  }
,
{ // state 962
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 963
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+240, // $NT
  }
,
{ // state 964
91,747, // "a"
  }
,
{ // state 965
106,920, // "p"
  }
,
{ // state 966
2,430, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+271, // $NT
  }
,
{ // state 967
118,190, // "k"
  }
,
{ // state 968
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+228, // $NT
  }
,
{ // state 969
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 970
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+264, // $NT
  }
,
{ // state 971
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 972
111,307, // "i"
  }
,
{ // state 973
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 974
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 975
120,528, // "t"
  }
,
{ // state 976
119,456, // "n"
  }
,
{ // state 977
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 978
119,452, // "n"
  }
,
{ // state 979
106,223, // "p"
  }
,
{ // state 980
0x80000000|162, // match move
0x80000000|288, // no-match move
// T-test match for 10:
128,
  }
,
{ // state 981
91,268, // "a"
  }
,
{ // state 982
0x80000000|1, // match move
0x80000000|911, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 983
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 984
162,MIN_REDUCTION+305, // $NT
  }
,
{ // state 985
162,MIN_REDUCTION+101, // $NT
  }
,
{ // state 986
91,894, // "a"
113,531, // "r"
  }
,
{ // state 987
112,890, // "o"
  }
,
{ // state 988
105,664, // "m"
  }
,
{ // state 989
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 990
92,314, // "s"
120,207, // "t"
  }
,
{ // state 991
95,85, // "e"
  }
,
{ // state 992
95,34, // "e"
  }
,
{ // state 993
162,MIN_REDUCTION+257, // $NT
  }
,
{ // state 994
89,356, // "c"
  }
,
{ // state 995
0x80000000|257, // match move
0x80000000|908, // no-match move
// T-test match for "\":
145,
  }
,
{ // state 996
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 997
2,445, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 998
162,MIN_REDUCTION+224, // $NT
  }
,
{ // state 999
113,7, // "r"
  }
,
{ // state 1000
120,312, // "t"
  }
,
{ // state 1001
108,953, // "y"
112,115, // "o"
113,507, // "r"
  }
,
{ // state 1002
95,224, // "e"
  }
,
{ // state 1003
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 1004
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 1005
2,14, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 1006
124,621, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 1007
124,789, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+171, // $NT
  }
,
{ // state 1008
120,211, // "t"
  }
,
{ // state 1009
2,718, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+307, // $NT
  }
,
{ // state 1010
0x80000000|1, // match move
0x80000000|1009, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 1011
0x80000000|1, // match move
0x80000000|927, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 1012
162,MIN_REDUCTION+209, // $NT
  }
,
{ // state 1013
113,719, // "r"
  }
,
{ // state 1014
0x80000000|1, // match move
0x80000000|1023, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 1015
95,143, // "e"
  }
,
{ // state 1016
120,546, // "t"
  }
,
{ // state 1017
90,181, // "l"
  }
,
{ // state 1018
0x80000000|1, // match move
0x80000000|1028, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 1019
112,178, // "o"
  }
,
{ // state 1020
2,510, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 1021
120,1010, // "t"
  }
,
{ // state 1022
119,134, // "n"
  }
,
{ // state 1023
2,480, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+202, // $NT
  }
,
{ // state 1024
2,522, // white*
124,282, // white
125,983, // " "
126,983, // {9 12}
127,508, // eol
128,499, // {10}
129,980, // {13}
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 1025
0x80000000|1, // match move
0x80000000|1024, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 1026
95,426, // "e"
  }
,
{ // state 1027
92,511, // "s"
  }
,
{ // state 1028
2,502, // white*
124,602, // white
125,864, // " "
126,864, // {9 12}
127,98, // eol
128,677, // {10}
129,672, // {13}
162,MIN_REDUCTION+256, // $NT
  }
,
{ // state 1029
103,148, // "d"
  }
,
{ // state 1030
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 1031
116,292, // "b"
  }
,
{ // state 1032
89,810, // "c"
90,810, // "l"
91,810, // "a"
92,810, // "s"
95,810, // "e"
96,810, // "!"
97,810, // "="
98,810, // "+"
102,810, // "_"
103,810, // "d"
104,810, // "g"
105,810, // "m"
106,810, // "p"
107,810, // "v"
108,810, // "y"
109,810, // {"A".."Z" "j" "q"}
110,810, // "f"
111,810, // "i"
112,810, // "o"
113,810, // "r"
114,810, // "u"
115,810, // "x"
116,810, // "b"
117,810, // "h"
118,810, // "k"
119,810, // "n"
120,810, // "t"
121,810, // "w"
122,810, // "z"
123,810, // {"0".."9"}
125,810, // " "
130,184, // printable
131,810, // "["
132,810, // "-"
133,810, // "<"
134,810, // "|"
135,810, // "&"
136,810, // ")"
137,810, // ","
138,810, // "]"
139,810, // "/"
140,810, // ";"
141,810, // ">"
142,810, // "{"
143,810, // "%"
144,810, // "("
145,810, // "\"
146,810, // "."
147,810, // ":"
148,810, // {"#".."$" "?".."@" "^" "`" "~"}
149,810, // "}"
150,810, // "'"
151,810, // '"'
152,810, // "*"
155,86, // stringChar
156,707, // stringChar*
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[1033][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
  doneSoFar += new Initter2().doInit(doneSoFar);
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
// eol ::= {10}
(127<<16)+1,
// eol ::= {13} {10}
(127<<16)+2,
// eol ::= {13} !10
(127<<16)+1,
// printable ::= {" ".."~"}
(130<<16)+1,
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
// `/ ::= "/" white*
(83<<16)+2,
// `/ ::= "/"
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
(155<<16)+1,
// STRING_LITERAL ::= '"' stringChar* $$2
(87<<16)+3,
// STRING_LITERAL ::= '"' $$2
(87<<16)+2,
// CHAR_LITERAL ::= "'" stringChar "'" white*
(88<<16)+4,
// CHAR_LITERAL ::= "'" stringChar "'"
(88<<16)+3,
// token* ::= token* token
(158<<16)+2,
// token* ::= token
(158<<16)+1,
// digit++ ::= digit+ !digit
(99<<16)+1,
// idChar** ::= idChar* !idChar
(153<<16)+1,
// stringChar* ::= stringChar* stringChar
(156<<16)+2,
// stringChar* ::= stringChar
(156<<16)+1,
// white* ::= white* white
(2<<16)+2,
// white* ::= white
(2<<16)+1,
// digit+ ::= digit
(159<<16)+1,
// digit+ ::= digit+ digit
(159<<16)+2,
// idChar* ::= idChar* idChar
(160<<16)+2,
// idChar* ::= idChar
(160<<16)+1,
// $$0 ::= token*
(3<<16)+1,
// $$1 ::= white*
(154<<16)+1,
// $$2 ::= '"' white*
(157<<16)+2,
// $$2 ::= '"'
(157<<16)+1,
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
128, // 10
-1, // 11
126, // 12
129, // 13
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
151, // '"'
148, // "#"
148, // "$"
143, // "%"
135, // "&"
150, // "'"
144, // "("
136, // ")"
152, // "*"
98, // "+"
137, // ","
132, // "-"
146, // "."
139, // "/"
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
147, // ":"
140, // ";"
133, // "<"
97, // "="
141, // ">"
148, // "?"
148, // "@"
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
131, // "["
145, // "\"
138, // "]"
148, // "^"
102, // "_"
148, // "`"
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
142, // "{"
134, // "|"
149, // "}"
148, // "~"
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
"token* ::= token* token", // 324
"token* ::= token* token", // 325
"digit++ ::= digit+ !digit", // 326
"idChar** ::= idChar* !idChar", // 327
"stringChar* ::= stringChar* stringChar", // 328
"stringChar* ::= stringChar* stringChar", // 329
"white* ::= white* white", // 330
"white* ::= white* white", // 331
"digit+ ::= digit", // 332
"digit+ ::= digit+ digit", // 333
"idChar* ::= idChar* idChar", // 334
"idChar* ::= idChar* idChar", // 335
"", // 336
"", // 337
"", // 338
"", // 339
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 4: start ::= [white*] $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // 5: token ::= [#] `boolean @sawBoolean(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 6: token ::= [#] `class @sawClass(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 7: token ::= [#] `extends @sawExtends(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 8: token ::= [#] `void @sawVoid(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: token ::= [#] `int @sawInt(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: token ::= [#] `while @sawWhile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: token ::= [#] `if @sawIf(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: token ::= [#] `else @sawElse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: token ::= [#] `for @sawFor(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 14: token ::= [#] `break @sawBreak(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 15: token ::= [#] `this @sawThis(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 16: token ::= [#] `false @sawFalse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 17: token ::= [#] `true @sawTrue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 18: token ::= [#] `super @sawSuper(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 19: token ::= [#] `null @sawNull(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 20: token ::= [#] `return @sawReturn(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 21: token ::= [#] `instanceof @sawInstanceof(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 22: token ::= [#] `new @sawNew(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 23: token ::= [#] `abstract @sawAbstract(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 24: token ::= [#] `assert @sawAssert(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 25: token ::= [#] `byte @sawByte(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 26: token ::= [#] `case @sawCase(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 27: token ::= [#] `catch @sawCatch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 28: token ::= [#] `char @sawChar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 29: token ::= [#] `const @sawConst(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 30: token ::= [#] `continue @sawContinue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 31: token ::= [#] `default @sawDefault(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 32: token ::= [#] `do @sawDo(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 33: token ::= [#] `double @sawDouble(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 34: token ::= [#] `enum @sawEnum(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 35: token ::= [#] `final @sawFinal(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 36: token ::= [#] `finally @sawFinally(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 37: token ::= [#] `float @sawFloat(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 38: token ::= [#] `goto @sawGoto(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 39: token ::= [#] `implements @sawImplements(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 40: token ::= [#] `import @sawImport(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 41: token ::= [#] `interface @sawInterface(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 42: token ::= [#] `long @sawLong(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 43: token ::= [#] `native @sawNative(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 44: token ::= [#] `package @sawPackage(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 45: token ::= [#] `private @sawPrivate(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 46: token ::= [#] `protected @sawProtected(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 47: token ::= [#] `public @sawPublic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 48: token ::= [#] `short @sawShort(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 49: token ::= [#] `static @sawStatic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 50: token ::= [#] `strictfp @sawStrictfp(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 51: token ::= [#] `switch @sawSwitch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 52: token ::= [#] `synchronized @sawSynchronized(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 53: token ::= [#] `throw @sawThrow(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 54: token ::= [#] `throws @sawThrows(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 55: token ::= [#] `transient @sawTransient(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 56: token ::= [#] `try @sawTry(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 57: token ::= [#] `volatile @sawVolatile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 58: token ::= [#] `! @sawNot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 59: token ::= [#] `!= @sawNotEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 60: token ::= [#] `% @sawRemainder(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 61: token ::= [#] `&& @sawAnd(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 62: token ::= [#] `* @sawTimes(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 63: token ::= [#] `( @sawLpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 64: token ::= [#] `) @sawRpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 65: token ::= [#] `{ @sawLbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 66: token ::= [#] `} @sawRbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 67: token ::= [#] `- @sawMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 68: token ::= [#] `+ @sawPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 69: token ::= [#] `= @sawAssign(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
    { // 70: token ::= [#] `== @sawEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((65<<5)|0x5)/*methodCall:65*/,
    },
    { // 71: token ::= [#] `[ @sawLbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 72: token ::= [#] `] @sawRbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 73: token ::= [#] `|| @sawOr(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((68<<5)|0x5)/*methodCall:68*/,
    },
    { // 74: token ::= [#] `< @sawLess(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 75: token ::= [#] `<= @sawLessEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((70<<5)|0x5)/*methodCall:70*/,
    },
    { // 76: token ::= [#] `, @sawComma(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((71<<5)|0x5)/*methodCall:71*/,
    },
    { // 77: token ::= [#] `> @sawGreater(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((72<<5)|0x5)/*methodCall:72*/,
    },
    { // 78: token ::= [#] `>= @sawGreaterEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((73<<5)|0x5)/*methodCall:73*/,
    },
    { // 79: token ::= [#] `. @sawDot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((74<<5)|0x5)/*methodCall:74*/,
    },
    { // 80: token ::= [#] `; @sawSemi(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((75<<5)|0x5)/*methodCall:75*/,
    },
    { // 81: token ::= [#] `++ @sawPlusPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((76<<5)|0x5)/*methodCall:76*/,
    },
    { // 82: token ::= [#] `-- @sawMinusMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((77<<5)|0x5)/*methodCall:77*/,
    },
    { // 83: token ::= [#] `/ @sawSlash(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((78<<5)|0x5)/*methodCall:78*/,
    },
    { // 84: token ::= [#] `: @sawColon(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((79<<5)|0x5)/*methodCall:79*/,
    },
    { // 85: token ::= [#] ID @identifier(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((80<<5)|0x5)/*methodCall:80*/,
    },
    { // 86: token ::= [#] INT_LITERAL @intLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((81<<5)|0x5)/*methodCall:81*/,
    },
    { // 87: token ::= [#] STRING_LITERAL @stringLit(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((82<<5)|0x5)/*methodCall:82*/,
    },
    { // 88: token ::= [#] CHAR_LITERAL @charLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 99: INT_LITERAL ::= [#] digit++ white* @convertToInt(int,List<Character>)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 100: INT_LITERAL ::= [#] digit++ [white*] @convertToInt(int,List<Character>)=>int
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
    { // 108: eol ::= {10} [registerNewline] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 109: eol ::= {13} {10} [registerNewline] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 110: eol ::= {13} !10 [registerNewline] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 111: printable ::= {" ".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 112: `! ::= "!" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 113: `! ::= "!" !"=" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 114: `% ::= "%" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 115: `% ::= "%" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 116: `&& ::= "&" "&" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 117: `&& ::= "&" "&" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 118: `* ::= "*" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 119: `* ::= "*" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 120: `( ::= "(" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 121: `( ::= "(" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 122: `) ::= ")" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 123: `) ::= ")" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 124: `{ ::= "{" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 125: `{ ::= "{" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 126: `} ::= "}" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 127: `} ::= "}" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 128: `- ::= "-" !"-" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 129: `- ::= "-" !"-" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 130: `= ::= "=" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 131: `= ::= "=" !"=" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 132: `== ::= "=" "=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 133: `== ::= "=" "=" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 134: `[ ::= "[" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 135: `[ ::= "[" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 136: `] ::= "]" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 137: `] ::= "]" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 138: `|| ::= "|" "|" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 139: `|| ::= "|" "|" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 140: `< ::= "<" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 141: `< ::= "<" !"=" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 142: `<= ::= "<" "=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 143: `<= ::= "<" "=" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 144: `, ::= "," white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 145: `, ::= "," [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 146: `> ::= ">" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 147: `> ::= ">" !"=" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 148: `>= ::= ">" "=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 149: `>= ::= ">" "=" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 150: `: ::= ":" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 151: `: ::= ":" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 152: `. ::= "." white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 153: `. ::= "." [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 154: `; ::= ";" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 155: `; ::= ";" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 156: `++ ::= "+" "+" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 157: `++ ::= "+" "+" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 158: `-- ::= "-" "-" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 159: `-- ::= "-" "-" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 160: `/ ::= "/" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 161: `/ ::= "/" [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 162: `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar white* @void
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
    { // 163: `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 164: reserved ::= `boolean @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 165: `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar white* @void
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
    { // 166: `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 167: reserved ::= `extends @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 168: `void ::= "v" "o" "i" "d" !idChar white* @void
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
    { // 169: `void ::= "v" "o" "i" "d" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 170: reserved ::= `void @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 171: `int ::= "i" "n" "t" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 172: `int ::= "i" "n" "t" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 173: reserved ::= `int @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 174: `while ::= "w" "h" "i" "l" "e" !idChar white* @void
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
    { // 175: `while ::= "w" "h" "i" "l" "e" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 176: reserved ::= `while @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 177: `if ::= "i" "f" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 178: `if ::= "i" "f" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 179: reserved ::= `if @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 180: `for ::= "f" "o" "r" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 181: `for ::= "f" "o" "r" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 182: reserved ::= `for @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 183: `break ::= "b" "r" "e" "a" "k" !idChar white* @void
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
    { // 184: `break ::= "b" "r" "e" "a" "k" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 185: reserved ::= `break @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 186: `this ::= "t" "h" "i" "s" !idChar white* @void
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
    { // 187: `this ::= "t" "h" "i" "s" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 188: reserved ::= `this @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 189: `false ::= "f" "a" "l" "s" "e" !idChar white* @void
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
    { // 190: `false ::= "f" "a" "l" "s" "e" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 191: reserved ::= `false @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 192: `true ::= "t" "r" "u" "e" !idChar white* @void
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
    { // 193: `true ::= "t" "r" "u" "e" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 194: reserved ::= `true @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 195: `super ::= "s" "u" "p" "e" "r" !idChar white* @void
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
    { // 196: `super ::= "s" "u" "p" "e" "r" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 197: reserved ::= `super @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 198: `null ::= "n" "u" "l" "l" !idChar white* @void
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
    { // 199: `null ::= "n" "u" "l" "l" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 200: reserved ::= `null @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 201: `return ::= "r" "e" "t" "u" "r" "n" !idChar white* @void
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
    { // 202: `return ::= "r" "e" "t" "u" "r" "n" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 203: reserved ::= `return @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 204: `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar white* @void
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
    { // 205: `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 206: reserved ::= `instanceof @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 207: `new ::= "n" "e" "w" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 208: `new ::= "n" "e" "w" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 209: reserved ::= `new @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 210: `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar white* @void
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
    { // 211: `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 212: reserved ::= `abstract @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 213: `assert ::= "a" "s" "s" "e" "r" "t" !idChar white* @void
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
    { // 214: `assert ::= "a" "s" "s" "e" "r" "t" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 215: reserved ::= `assert @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 216: `byte ::= "b" "y" "t" "e" !idChar white* @void
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
    { // 217: `byte ::= "b" "y" "t" "e" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 218: reserved ::= `byte @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 219: `case ::= "c" "a" "s" "e" !idChar white* @void
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
    { // 220: `case ::= "c" "a" "s" "e" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 221: reserved ::= `case @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 222: `catch ::= "c" "a" "t" "c" "h" !idChar white* @void
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
    { // 223: `catch ::= "c" "a" "t" "c" "h" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 224: reserved ::= `catch @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 225: `char ::= "c" "h" "a" "r" !idChar white* @void
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
    { // 226: `char ::= "c" "h" "a" "r" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 227: reserved ::= `char @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 228: `const ::= "c" "o" "n" "s" "t" !idChar white* @void
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
    { // 229: `const ::= "c" "o" "n" "s" "t" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 230: reserved ::= `const @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 231: `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar white* @void
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
    { // 232: `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 233: reserved ::= `continue @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 234: `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar white* @void
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
    { // 235: `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 236: reserved ::= `default @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 237: `do ::= "d" "o" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 238: `do ::= "d" "o" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 239: reserved ::= `do @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 240: `double ::= "d" "o" "u" "b" "l" "e" !idChar white* @void
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
    { // 241: `double ::= "d" "o" "u" "b" "l" "e" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 242: reserved ::= `double @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 243: `enum ::= "e" "n" "u" "m" !idChar white* @void
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
    { // 244: `enum ::= "e" "n" "u" "m" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 245: reserved ::= `enum @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 246: `final ::= "f" "i" "n" "a" "l" !idChar white* @void
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
    { // 247: `final ::= "f" "i" "n" "a" "l" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 248: reserved ::= `final @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 249: `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar white* @void
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
    { // 250: `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 251: reserved ::= `finally @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 252: `float ::= "f" "l" "o" "a" "t" !idChar white* @void
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
    { // 253: `float ::= "f" "l" "o" "a" "t" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 254: reserved ::= `float @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 255: `goto ::= "g" "o" "t" "o" !idChar white* @void
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
    { // 256: `goto ::= "g" "o" "t" "o" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 257: reserved ::= `goto @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 258: `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar white* @void
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
    { // 259: `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 260: reserved ::= `implements @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 261: `import ::= "i" "m" "p" "o" "r" "t" !idChar white* @void
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
    { // 262: `import ::= "i" "m" "p" "o" "r" "t" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 263: reserved ::= `import @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 264: `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar white* @void
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
    { // 265: `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 266: reserved ::= `interface @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 267: `long ::= "l" "o" "n" "g" !idChar white* @void
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
    { // 268: `long ::= "l" "o" "n" "g" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 269: reserved ::= `long @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 270: `native ::= "n" "a" "t" "i" "v" "e" !idChar white* @void
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
    { // 271: `native ::= "n" "a" "t" "i" "v" "e" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 272: reserved ::= `native @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 273: `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar white* @void
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
    { // 274: `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 275: reserved ::= `package @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 276: `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar white* @void
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
    { // 277: `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 278: reserved ::= `private @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 279: `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar white* @void
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
    { // 280: `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 281: reserved ::= `protected @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 282: `public ::= "p" "u" "b" "l" "i" "c" !idChar white* @void
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
    { // 283: `public ::= "p" "u" "b" "l" "i" "c" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 284: reserved ::= `public @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 285: `short ::= "s" "h" "o" "r" "t" !idChar white* @void
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
    { // 286: `short ::= "s" "h" "o" "r" "t" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 287: reserved ::= `short @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 288: `static ::= "s" "t" "a" "t" "i" "c" !idChar white* @void
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
    { // 289: `static ::= "s" "t" "a" "t" "i" "c" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 290: reserved ::= `static @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 291: `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar white* @void
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
    { // 292: `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 293: reserved ::= `strictfp @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 294: `switch ::= "s" "w" "i" "t" "c" "h" !idChar white* @void
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
    { // 295: `switch ::= "s" "w" "i" "t" "c" "h" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 296: reserved ::= `switch @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 297: `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar white* @void
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
    { // 298: `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 299: reserved ::= `synchronized @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 300: `throw ::= "t" "h" "r" "o" "w" !idChar white* @void
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
    { // 301: `throw ::= "t" "h" "r" "o" "w" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 302: reserved ::= `throw @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 303: `throws ::= "t" "h" "r" "o" "w" "s" !idChar white* @void
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
    { // 304: `throws ::= "t" "h" "r" "o" "w" "s" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 305: reserved ::= `throws @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 306: `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar white* @void
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
    { // 307: `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 308: reserved ::= `transient @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 309: `try ::= "t" "r" "y" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 310: `try ::= "t" "r" "y" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 311: reserved ::= `try @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 312: `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar white* @void
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
    { // 313: `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar [white*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
    { // 314: reserved ::= `volatile @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 315: ID ::= !reserved letter idChar** $$1 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 316: ID ::= !reserved letter idChar** [white*] @text
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 317: ID ::= !reserved letter !idChar [idChar**] $$1 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 318: ID ::= !reserved letter !idChar [idChar**] [white*] @text
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 319: stringChar ::= !"\" !'"' printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 320: STRING_LITERAL ::= '"' stringChar* $$2 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 321: STRING_LITERAL ::= '"' [stringChar*] $$2 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 322: CHAR_LITERAL ::= "'" stringChar "'" white* @returChar(char,char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 323: CHAR_LITERAL ::= "'" stringChar "'" [white*] @returChar(char,char,char)=>int
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 324: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 325: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // 326: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 327: idChar** ::= idChar* !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 328: stringChar* ::= stringChar* stringChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 329: stringChar* ::= [stringChar*] stringChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 330: white* ::= white* white @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 331: white* ::= [white*] white @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // 332: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 333: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 334: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 335: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 336: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 337: $$1 ::= white* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 338: $$2 ::= '"' white* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 339: $$2 ::= '"' [white*] @pass
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "", // start
    "stringChar* ::=", // stringChar*
    "idChar** ::= idChar* !idChar", // idChar**
    "token* ::=", // token*
    "idChar* ::=", // idChar*
    "white* ::=", // white*
    "", // $$start
    "# ::=", // #
    "", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // start
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // stringChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // idChar**
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // token*
    },
    { // idChar*
      ((1<<5)|0x9)/*emptyList:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
    1,
    1,
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
