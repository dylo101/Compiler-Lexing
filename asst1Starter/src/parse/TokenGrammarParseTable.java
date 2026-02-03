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
public int getEofSym() { return 166; }
public int getNttSym() { return 167; }
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
"single",
"commentChar**",
"token*",
"commentChar*",
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
public int numSymbols() { return 168;}
private static final int MIN_REDUCTION = 1043;
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
0x80000000|763, // match move
0x80000000|602, // no-match move
0x80000000|575, // NT-test-match state for reserved
  }
,
{ // state 1
  }
,
{ // state 2
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 3
120,482, // "t"
  }
,
{ // state 4
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 5
0x80000000|1, // match move
0x80000000|197, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 6
103,342, // "d"
  }
,
{ // state 7
120,688, // "t"
  }
,
{ // state 8
0x80000000|1, // match move
0x80000000|947, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 9
167,MIN_REDUCTION+291, // $NT
  }
,
{ // state 10
0x80000000|1, // match move
0x80000000|487, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 11
2,125, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+236, // $NT
  }
,
{ // state 12
2,635, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 13
90,520, // "l"
  }
,
{ // state 14
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 15
91,803, // "a"
  }
,
{ // state 16
0x80000000|1, // match move
0x80000000|119, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 17
111,721, // "i"
  }
,
{ // state 18
2,979, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+266, // $NT
  }
,
{ // state 19
0x80000000|1, // match move
0x80000000|489, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 20
167,MIN_REDUCTION+189, // $NT
  }
,
{ // state 21
113,296, // "r"
  }
,
{ // state 22
0x80000000|1, // match move
0x80000000|264, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 23
113,435, // "r"
  }
,
{ // state 24
2,305, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 25
2,1015, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 26
0x80000000|1, // match move
0x80000000|126, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 27
2,349, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+209, // $NT
  }
,
{ // state 28
95,601, // "e"
  }
,
{ // state 29
119,819, // "n"
  }
,
{ // state 30
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 31
0x80000000|1, // match move
0x80000000|168, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 32
0x80000000|1, // match move
0x80000000|120, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 33
0x80000000|705, // match move
0x80000000|890, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 34
0x80000000|1, // match move
0x80000000|122, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 35
167,MIN_REDUCTION+186, // $NT
  }
,
{ // state 36
120,479, // "t"
  }
,
{ // state 37
92,1009, // "s"
120,241, // "t"
  }
,
{ // state 38
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+163, // $NT
  }
,
{ // state 39
104,32, // "g"
  }
,
{ // state 40
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 41
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 42
105,715, // "m"
110,593, // "f"
119,94, // "n"
  }
,
{ // state 43
167,MIN_REDUCTION+273, // $NT
  }
,
{ // state 44
2,628, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+221, // $NT
  }
,
{ // state 45
2,411, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 46
91,604, // "a"
  }
,
{ // state 47
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 48
89,908, // "c"
90,908, // "l"
91,908, // "a"
92,908, // "s"
95,908, // "e"
100,994, // letter
101,384, // digit
102,249, // "_"
103,908, // "d"
104,908, // "g"
105,908, // "m"
106,908, // "p"
107,908, // "v"
108,908, // "y"
109,908, // {"A".."Z" "j" "q"}
110,908, // "f"
111,908, // "i"
112,908, // "o"
113,908, // "r"
114,908, // "u"
115,908, // "x"
116,908, // "b"
117,908, // "h"
118,908, // "k"
119,908, // "n"
120,908, // "t"
121,908, // "w"
122,908, // "z"
123,397, // {"0".."9"}
  }
,
{ // state 49
106,404, // "p"
  }
,
{ // state 50
110,279, // "f"
  }
,
{ // state 51
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 52
111,850, // "i"
  }
,
{ // state 53
2,56, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 54
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 55
167,MIN_REDUCTION+183, // $NT
  }
,
{ // state 56
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 57
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 58
92,797, // "s"
  }
,
{ // state 59
167,MIN_REDUCTION+165, // $NT
  }
,
{ // state 60
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 61
119,1023, // "n"
  }
,
{ // state 62
2,371, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 63
105,216, // "m"
110,408, // "f"
119,37, // "n"
  }
,
{ // state 64
91,696, // "a"
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
0x80000000|328, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 67
111,450, // "i"
  }
,
{ // state 68
0x80000000|673, // match move
0x80000000|410, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 69
89,863, // "c"
90,863, // "l"
91,863, // "a"
92,863, // "s"
93,82, // idChar
95,863, // "e"
100,238, // letter
101,426, // digit
102,289, // "_"
103,863, // "d"
104,863, // "g"
105,863, // "m"
106,863, // "p"
107,863, // "v"
108,863, // "y"
109,863, // {"A".."Z" "j" "q"}
110,863, // "f"
111,863, // "i"
112,863, // "o"
113,863, // "r"
114,863, // "u"
115,863, // "x"
116,863, // "b"
117,863, // "h"
118,863, // "k"
119,863, // "n"
120,863, // "t"
121,863, // "w"
122,863, // "z"
123,68, // {"0".."9"}
  }
,
{ // state 70
2,334, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 71
107,660, // "v"
  }
,
{ // state 72
113,277, // "r"
  }
,
{ // state 73
123,397, // {"0".."9"}
  }
,
{ // state 74
0x80000000|1, // match move
0x80000000|180, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 75
167,MIN_REDUCTION+285, // $NT
  }
,
{ // state 76
2,577, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 77
0x80000000|1, // match move
0x80000000|18, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 78
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 79
89,790, // "c"
  }
,
{ // state 80
119,361, // "n"
  }
,
{ // state 81
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+295, // $NT
  }
,
{ // state 82
0x80000000|914, // match move
0x80000000|280, // no-match move
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
0x80000000|804, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 86
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 87
2,81, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+296, // $NT
  }
,
{ // state 88
0x80000000|885, // match move
0x80000000|800, // no-match move
// T-test match for "=":
97,
  }
,
{ // state 89
89,553, // "c"
  }
,
{ // state 90
119,749, // "n"
  }
,
{ // state 91
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 92
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 93
92,693, // "s"
  }
,
{ // state 94
92,108, // "s"
120,583, // "t"
  }
,
{ // state 95
120,337, // "t"
  }
,
{ // state 96
91,571, // "a"
  }
,
{ // state 97
104,10, // "g"
  }
,
{ // state 98
167,MIN_REDUCTION+107, // $NT
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 99
167,MIN_REDUCTION+264, // $NT
  }
,
{ // state 100
120,544, // "t"
  }
,
{ // state 101
89,610, // "c"
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
0x80000000|251, // match move
0x80000000|870, // no-match move
0x80000000|575, // NT-test-match state for reserved
  }
,
{ // state 107
116,703, // "b"
  }
,
{ // state 108
120,973, // "t"
  }
,
{ // state 109
95,50, // "e"
112,563, // "o"
  }
,
{ // state 110
119,353, // "n"
  }
,
{ // state 111
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 112
2,221, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 113
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 114
167,MIN_REDUCTION+234, // $NT
  }
,
{ // state 115
112,454, // "o"
  }
,
{ // state 116
120,887, // "t"
  }
,
{ // state 117
95,641, // "e"
  }
,
{ // state 118
167,MIN_REDUCTION+328, // $NT
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 119
2,669, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 120
2,57, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 121
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 122
2,78, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 123
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 124
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 125
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+235, // $NT
  }
,
{ // state 126
2,956, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 127
95,815, // "e"
  }
,
{ // state 128
117,278, // "h"
  }
,
{ // state 129
2,92, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 130
0x80000000|457, // match move
0x80000000|960, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 131
95,991, // "e"
  }
,
{ // state 132
103,596, // "d"
  }
,
{ // state 133
0x80000000|1, // match move
0x80000000|383, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 134
120,892, // "t"
  }
,
{ // state 135
114,600, // "u"
  }
,
{ // state 136
167,MIN_REDUCTION+243, // $NT
  }
,
{ // state 137
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 138
95,8, // "e"
  }
,
{ // state 139
129,522, // {10}
  }
,
{ // state 140
2,894, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 141
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
312, // token
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
983, // `!
148, // `!=
318, // `%
248, // `&&
142, // `*
471, // `(
104, // `)
445, // `{
414, // `}
559, // `-
287, // `+
174, // `=
587, // `==
911, // `[
665, // `]
882, // `||
467, // `<
156, // `<=
767, // `,
788, // `>
331, // `>=
538, // `.
476, // `;
137, // `++
986, // `--
359, // `/
51, // `:
982, // ID
308, // INT_LITERAL
706, // STRING_LITERAL
184, // CHAR_LITERAL
387, // "c"
387, // "l"
387, // "a"
387, // "s"
-1, // idChar
-1, // reserved
387, // "e"
88, // "!"
831, // "="
965, // "+"
181, // digit++
964, // letter
203, // digit
-1, // "_"
387, // "d"
387, // "g"
387, // "m"
387, // "p"
387, // "v"
387, // "y"
387, // {"A".."Z" "j" "q"}
387, // "f"
387, // "i"
387, // "o"
387, // "r"
387, // "u"
387, // "x"
387, // "b"
387, // "h"
387, // "k"
387, // "n"
387, // "t"
387, // "w"
387, // "z"
420, // {"0".."9"}
-1, // white
-1, // " "
-1, // {9 12}
-1, // eol
-1, // singleLineComment
-1, // {10}
-1, // {13}
-1, // printable
1006, // "["
382, // "-"
190, // "<"
275, // "|"
560, // "&"
388, // ")"
968, // ","
556, // "]"
428, // "/"
201, // ";"
567, // ">"
768, // "{"
572, // "%"
523, // "("
-1, // "\"
112, // "."
129, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
949, // "}"
849, // "'"
1004, // '"'
750, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
-1, // single
-1, // commentChar**
-1, // token*
-1, // commentChar*
621, // digit+
-1, // idChar*
MIN_REDUCTION+344, // $
-1, // $NT
  }
,
{ // state 142
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 143
117,1022, // "h"
  }
,
{ // state 144
103,5, // "d"
  }
,
{ // state 145
167,MIN_REDUCTION+91, // $NT
  }
,
{ // state 146
90,469, // "l"
91,714, // "a"
112,528, // "o"
117,336, // "h"
  }
,
{ // state 147
95,77, // "e"
  }
,
{ // state 148
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 149
0x80000000|1, // match move
0x80000000|367, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 150
95,743, // "e"
  }
,
{ // state 151
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 152
120,74, // "t"
  }
,
{ // state 153
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 154
119,1030, // "n"
  }
,
{ // state 155
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+247, // $NT
  }
,
{ // state 156
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 157
4,312, // token
5,902, // `boolean
6,171, // `class
7,246, // `extends
8,697, // `void
9,727, // `int
10,998, // `while
11,124, // `if
12,151, // `else
13,597, // `for
14,366, // `break
15,833, // `this
16,937, // `false
17,805, // `true
18,105, // `super
19,588, // `null
20,912, // `return
21,877, // `instanceof
22,441, // `new
23,720, // `abstract
24,592, // `assert
25,626, // `byte
26,83, // `case
27,1012, // `catch
28,446, // `char
29,585, // `const
30,838, // `continue
31,516, // `default
32,813, // `do
33,357, // `double
34,121, // `enum
35,770, // `final
36,781, // `finally
37,256, // `float
38,343, // `goto
39,614, // `implements
40,728, // `import
41,498, // `interface
42,319, // `long
43,30, // `native
44,1039, // `package
45,1005, // `private
46,931, // `protected
47,562, // `public
48,677, // `short
49,539, // `static
50,855, // `strictfp
51,91, // `switch
52,60, // `synchronized
53,239, // `throw
54,980, // `throws
55,554, // `transient
56,889, // `try
57,1013, // `volatile
89,292, // "c"
90,188, // "l"
91,919, // "a"
92,861, // "s"
95,915, // "e"
103,905, // "d"
104,758, // "g"
106,883, // "p"
107,996, // "v"
110,687, // "f"
111,63, // "i"
113,461, // "r"
116,950, // "b"
119,440, // "n"
120,167, // "t"
121,670, // "w"
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 158
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 159
0x80000000|1, // match move
0x80000000|754, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 160
89,618, // "c"
  }
,
{ // state 161
106,732, // "p"
  }
,
{ // state 162
2,881, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+281, // $NT
  }
,
{ // state 163
129,946, // {10}
  }
,
{ // state 164
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+259, // $NT
  }
,
{ // state 165
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 166
152,685, // '"'
158,756, // $$2
  }
,
{ // state 167
113,368, // "r"
117,231, // "h"
  }
,
{ // state 168
2,529, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 169
91,847, // "a"
  }
,
{ // state 170
90,927, // "l"
  }
,
{ // state 171
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 172
0x80000000|1, // match move
0x80000000|44, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 173
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+304, // $NT
  }
,
{ // state 174
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 175
112,617, // "o"
  }
,
{ // state 176
0x80000000|1, // match move
0x80000000|162, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 177
95,751, // "e"
  }
,
{ // state 178
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 179
120,627, // "t"
  }
,
{ // state 180
2,757, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 181
2,406, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 182
92,417, // "s"
  }
,
{ // state 183
2,814, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 184
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 185
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 186
95,436, // "e"
  }
,
{ // state 187
92,266, // "s"
116,787, // "b"
  }
,
{ // state 188
112,645, // "o"
  }
,
{ // state 189
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 190
0x80000000|802, // match move
0x80000000|880, // no-match move
// T-test match for "=":
97,
  }
,
{ // state 191
0x80000000|1, // match move
0x80000000|45, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 192
89,817, // "c"
90,817, // "l"
91,817, // "a"
92,817, // "s"
95,817, // "e"
96,817, // "!"
97,817, // "="
98,817, // "+"
102,817, // "_"
103,817, // "d"
104,817, // "g"
105,817, // "m"
106,817, // "p"
107,817, // "v"
108,817, // "y"
109,817, // {"A".."Z" "j" "q"}
110,817, // "f"
111,817, // "i"
112,817, // "o"
113,817, // "r"
114,817, // "u"
115,817, // "x"
116,817, // "b"
117,817, // "h"
118,817, // "k"
119,817, // "n"
120,817, // "t"
121,817, // "w"
122,817, // "z"
123,817, // {"0".."9"}
125,817, // " "
131,185, // printable
132,817, // "["
133,817, // "-"
134,817, // "<"
135,817, // "|"
136,817, // "&"
137,817, // ")"
138,817, // ","
139,817, // "]"
140,817, // "/"
141,817, // ";"
142,817, // ">"
143,817, // "{"
144,817, // "%"
145,817, // "("
146,817, // "\"
147,817, // "."
148,817, // ":"
149,817, // {"#".."$" "?".."@" "^" "`" "~"}
150,817, // "}"
151,817, // "'"
152,817, // '"'
153,817, // "*"
156,41, // stringChar
  }
,
{ // state 193
167,MIN_REDUCTION+279, // $NT
  }
,
{ // state 194
89,827, // "c"
  }
,
{ // state 195
2,644, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 196
111,395, // "i"
  }
,
{ // state 197
2,302, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+299, // $NT
  }
,
{ // state 198
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 199
89,579, // "c"
  }
,
{ // state 200
0x80000000|1, // match move
0x80000000|214, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 201
2,165, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 202
0x80000000|1, // match move
0x80000000|253, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 203
0x80000000|910, // match move
0x80000000|851, // no-match move
0x80000000|73, // NT-test-match state for digit
  }
,
{ // state 204
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 205
90,699, // "l"
  }
,
{ // state 206
120,924, // "t"
  }
,
{ // state 207
91,288, // "a"
95,729, // "e"
114,551, // "u"
  }
,
{ // state 208
89,403, // "c"
  }
,
{ // state 209
0x80000000|1, // match move
0x80000000|268, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 210
104,425, // "g"
  }
,
{ // state 211
89,658, // "c"
  }
,
{ // state 212
95,540, // "e"
  }
,
{ // state 213
120,379, // "t"
  }
,
{ // state 214
2,419, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 215
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 216
106,943, // "p"
  }
,
{ // state 217
167,MIN_REDUCTION+110, // $NT
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 218
0x80000000|1, // match move
0x80000000|791, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 219
111,335, // "i"
  }
,
{ // state 220
120,159, // "t"
  }
,
{ // state 221
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 222
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+283, // $NT
  }
,
{ // state 223
2,619, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
154,694, // idChar**
155,272, // $$1
160,904, // single
165,459, // idChar*
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 224
95,549, // "e"
  }
,
{ // state 225
113,654, // "r"
  }
,
{ // state 226
120,969, // "t"
  }
,
{ // state 227
105,866, // "m"
  }
,
{ // state 228
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+89, // $NT
  }
,
{ // state 229
90,257, // "l"
112,393, // "o"
  }
,
{ // state 230
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 231
111,753, // "i"
113,263, // "r"
  }
,
{ // state 232
2,638, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 233
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 234
120,533, // "t"
  }
,
{ // state 235
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+187, // $NT
  }
,
{ // state 236
91,29, // "a"
108,561, // "y"
114,951, // "u"
  }
,
{ // state 237
112,662, // "o"
  }
,
{ // state 238
0x80000000|775, // match move
0x80000000|123, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 239
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 240
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 241
0x80000000|1011, // match move
0x80000000|611, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 242
105,854, // "m"
  }
,
{ // state 243
0x80000000|1, // match move
0x80000000|11, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 244
103,26, // "d"
  }
,
{ // state 245
2,303, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+200, // $NT
  }
,
{ // state 246
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 247
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+286, // $NT
  }
,
{ // state 248
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 249
167,MIN_REDUCTION+103, // $NT
  }
,
{ // state 250
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+184, // $NT
  }
,
{ // state 251
3,4, // $$0
4,54, // token
5,902, // `boolean
6,171, // `class
7,246, // `extends
8,697, // `void
9,727, // `int
10,998, // `while
11,124, // `if
12,151, // `else
13,597, // `for
14,366, // `break
15,833, // `this
16,937, // `false
17,805, // `true
18,105, // `super
19,588, // `null
20,912, // `return
21,877, // `instanceof
22,441, // `new
23,720, // `abstract
24,592, // `assert
25,626, // `byte
26,83, // `case
27,1012, // `catch
28,446, // `char
29,585, // `const
30,838, // `continue
31,516, // `default
32,813, // `do
33,357, // `double
34,121, // `enum
35,770, // `final
36,781, // `finally
37,256, // `float
38,343, // `goto
39,614, // `implements
40,728, // `import
41,498, // `interface
42,319, // `long
43,30, // `native
44,1039, // `package
45,1005, // `private
46,931, // `protected
47,562, // `public
48,677, // `short
49,539, // `static
50,855, // `strictfp
51,91, // `switch
52,60, // `synchronized
53,239, // `throw
54,980, // `throws
55,554, // `transient
56,889, // `try
57,1013, // `volatile
89,292, // "c"
90,188, // "l"
91,919, // "a"
92,861, // "s"
95,915, // "e"
103,905, // "d"
104,758, // "g"
106,883, // "p"
107,996, // "v"
110,687, // "f"
111,63, // "i"
113,461, // "r"
116,950, // "b"
119,440, // "n"
120,167, // "t"
121,670, // "w"
162,591, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 252
167,MIN_REDUCTION+249, // $NT
  }
,
{ // state 253
2,713, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 254
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 255
119,632, // "n"
  }
,
{ // state 256
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 257
95,997, // "e"
  }
,
{ // state 258
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 259
157,711, // stringChar*
158,857, // $$2
  }
,
{ // state 260
113,580, // "r"
  }
,
{ // state 261
167,MIN_REDUCTION+252, // $NT
  }
,
{ // state 262
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 263
112,416, // "o"
  }
,
{ // state 264
2,499, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 265
95,629, // "e"
  }
,
{ // state 266
92,473, // "s"
  }
,
{ // state 267
152,685, // '"'
157,711, // stringChar*
158,857, // $$2
  }
,
{ // state 268
2,240, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 269
95,304, // "e"
  }
,
{ // state 270
120,578, // "t"
  }
,
{ // state 271
114,684, // "u"
  }
,
{ // state 272
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 273
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+301, // $NT
  }
,
{ // state 274
167,MIN_REDUCTION+255, // $NT
  }
,
{ // state 275
135,232, // "|"
  }
,
{ // state 276
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 277
0x80000000|1, // match move
0x80000000|709, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 278
0x80000000|1, // match move
0x80000000|356, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 279
91,507, // "a"
  }
,
{ // state 280
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 281
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+178, // $NT
  }
,
{ // state 282
95,985, // "e"
  }
,
{ // state 283
167,MIN_REDUCTION+222, // $NT
  }
,
{ // state 284
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 285
0x80000000|139, // match move
0x80000000|306, // no-match move
// T-test match for 10:
129,
  }
,
{ // state 286
2,453, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+263, // $NT
  }
,
{ // state 287
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 288
120,52, // "t"
  }
,
{ // state 289
0x80000000|830, // match move
0x80000000|832, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 290
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 291
111,702, // "i"
  }
,
{ // state 292
90,825, // "l"
91,999, // "a"
112,80, // "o"
117,574, // "h"
  }
,
{ // state 293
114,348, // "u"
  }
,
{ // state 294
90,842, // "l"
  }
,
{ // state 295
0x80000000|1, // match move
0x80000000|183, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 296
110,594, // "f"
  }
,
{ // state 297
95,717, // "e"
  }
,
{ // state 298
119,17, // "n"
  }
,
{ // state 299
120,686, // "t"
  }
,
{ // state 300
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+250, // $NT
  }
,
{ // state 301
112,900, // "o"
  }
,
{ // state 302
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+298, // $NT
  }
,
{ // state 303
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+199, // $NT
  }
,
{ // state 304
91,976, // "a"
  }
,
{ // state 305
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 306
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 307
113,95, // "r"
  }
,
{ // state 308
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 309
95,906, // "e"
  }
,
{ // state 310
2,608, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 311
2,222, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+284, // $NT
  }
,
{ // state 312
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 313
0x80000000|895, // match move
0x80000000|391, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 314
91,678, // "a"
  }
,
{ // state 315
119,746, // "n"
  }
,
{ // state 316
95,876, // "e"
  }
,
{ // state 317
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+310, // $NT
  }
,
{ // state 318
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 319
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 320
2,1016, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+173, // $NT
  }
,
{ // state 321
2,262, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 322
103,133, // "d"
  }
,
{ // state 323
95,206, // "e"
  }
,
{ // state 324
2,373, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+182, // $NT
  }
,
{ // state 325
120,836, // "t"
  }
,
{ // state 326
119,898, // "n"
  }
,
{ // state 327
89,884, // "c"
  }
,
{ // state 328
2,913, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 329
92,1000, // "s"
  }
,
{ // state 330
95,244, // "e"
  }
,
{ // state 331
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 332
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+289, // $NT
  }
,
{ // state 333
114,107, // "u"
  }
,
{ // state 334
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 335
120,875, // "t"
  }
,
{ // state 336
91,72, // "a"
  }
,
{ // state 337
0x80000000|1, // match move
0x80000000|725, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 338
0x80000000|1, // match move
0x80000000|463, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 339
95,605, // "e"
  }
,
{ // state 340
2,664, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 341
2,869, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 342
0x80000000|1, // match move
0x80000000|389, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 343
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 344
113,939, // "r"
  }
,
{ // state 345
90,103, // "l"
  }
,
{ // state 346
0x80000000|1, // match move
0x80000000|324, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 347
114,242, // "u"
  }
,
{ // state 348
113,933, // "r"
  }
,
{ // state 349
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+208, // $NT
  }
,
{ // state 350
113,422, // "r"
  }
,
{ // state 351
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 352
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 353
120,566, // "t"
  }
,
{ // state 354
0x80000000|1, // match move
0x80000000|87, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 355
0x80000000|1, // match move
0x80000000|712, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 356
2,405, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+224, // $NT
  }
,
{ // state 357
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 358
0x80000000|1, // match move
0x80000000|311, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 359
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 360
2,521, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 361
92,299, // "s"
120,926, // "t"
  }
,
{ // state 362
116,468, // "b"
  }
,
{ // state 363
167,MIN_REDUCTION+309, // $NT
  }
,
{ // state 364
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+244, // $NT
  }
,
{ // state 365
0x80000000|1, // match move
0x80000000|340, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 366
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 367
2,741, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+170, // $NT
  }
,
{ // state 368
91,255, // "a"
108,31, // "y"
114,839, // "u"
  }
,
{ // state 369
0x80000000|835, // match move
0x80000000|1029, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 370
2,698, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 371
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 372
0x80000000|258, // match move
0x80000000|352, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 373
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+181, // $NT
  }
,
{ // state 374
0x80000000|1, // match move
0x80000000|370, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 375
2,886, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 376
167,MIN_REDUCTION+240, // $NT
  }
,
{ // state 377
2,655, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 378
91,211, // "a"
  }
,
{ // state 379
95,672, // "e"
  }
,
{ // state 380
2,437, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 381
103,940, // "d"
  }
,
{ // state 382
0x80000000|801, // match move
0x80000000|377, // no-match move
// T-test match for "-":
133,
  }
,
{ // state 383
2,630, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 384
167,MIN_REDUCTION+102, // $NT
  }
,
{ // state 385
2,622, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 386
167,MIN_REDUCTION+198, // $NT
  }
,
{ // state 387
0x80000000|518, // match move
0x80000000|952, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 388
2,860, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 389
2,215, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 390
2,928, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 391
2,407, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 392
2,558, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 393
113,3, // "r"
  }
,
{ // state 394
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 395
90,1001, // "l"
  }
,
{ // state 396
91,220, // "a"
  }
,
{ // state 397
167,MIN_REDUCTION+105, // $NT
  }
,
{ // state 398
167,MIN_REDUCTION+315, // $NT
  }
,
{ // state 399
95,15, // "e"
  }
,
{ // state 400
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+217, // $NT
  }
,
{ // state 401
112,744, // "o"
  }
,
{ // state 402
119,607, // "n"
  }
,
{ // state 403
117,564, // "h"
  }
,
{ // state 404
0x80000000|1, // match move
0x80000000|647, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 405
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+223, // $NT
  }
,
{ // state 406
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 407
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 408
0x80000000|1, // match move
0x80000000|24, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 409
89,863, // "c"
90,863, // "l"
91,863, // "a"
92,863, // "s"
93,372, // idChar
95,863, // "e"
100,238, // letter
101,426, // digit
102,289, // "_"
103,863, // "d"
104,863, // "g"
105,863, // "m"
106,863, // "p"
107,863, // "v"
108,863, // "y"
109,863, // {"A".."Z" "j" "q"}
110,863, // "f"
111,863, // "i"
112,863, // "o"
113,863, // "r"
114,863, // "u"
115,863, // "x"
116,863, // "b"
117,863, // "h"
118,863, // "k"
119,863, // "n"
120,863, // "t"
121,863, // "w"
122,863, // "z"
123,68, // {"0".."9"}
154,694, // idChar**
165,459, // idChar*
  }
,
{ // state 410
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 411
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 412
95,154, // "e"
  }
,
{ // state 413
167,MIN_REDUCTION+168, // $NT
  }
,
{ // state 414
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 415
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 416
121,313, // "w"
  }
,
{ // state 417
95,848, // "e"
  }
,
{ // state 418
98,341, // "+"
  }
,
{ // state 419
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 420
0x80000000|158, // match move
0x80000000|102, // no-match move
0x80000000|73, // NT-test-match state for digit
  }
,
{ // state 421
127,903, // eol
129,865, // {10}
130,285, // {13}
  }
,
{ // state 422
91,769, // "a"
  }
,
{ // state 423
2,527, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+197, // $NT
  }
,
{ // state 424
120,218, // "t"
  }
,
{ // state 425
95,737, // "e"
  }
,
{ // state 426
0x80000000|84, // match move
0x80000000|653, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 427
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 428
2,153, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 429
92,1036, // "s"
  }
,
{ // state 430
0x80000000|1, // match move
0x80000000|310, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 431
95,824, // "e"
  }
,
{ // state 432
89,178, // "c"
90,178, // "l"
91,178, // "a"
92,178, // "s"
95,178, // "e"
96,178, // "!"
97,178, // "="
98,178, // "+"
102,178, // "_"
103,178, // "d"
104,178, // "g"
105,178, // "m"
106,178, // "p"
107,178, // "v"
108,178, // "y"
109,178, // {"A".."Z" "j" "q"}
110,178, // "f"
111,178, // "i"
112,178, // "o"
113,178, // "r"
114,178, // "u"
115,178, // "x"
116,178, // "b"
117,178, // "h"
118,178, // "k"
119,178, // "n"
120,178, // "t"
121,178, // "w"
122,178, // "z"
123,178, // {"0".."9"}
125,178, // " "
131,609, // printable
132,178, // "["
133,178, // "-"
134,178, // "<"
135,178, // "|"
136,178, // "&"
137,178, // ")"
138,178, // ","
139,178, // "]"
140,178, // "/"
141,178, // ";"
142,178, // ">"
143,178, // "{"
144,178, // "%"
145,178, // "("
146,178, // "\"
147,178, // "."
148,178, // ":"
149,178, // {"#".."$" "?".."@" "^" "`" "~"}
150,178, // "}"
151,178, // "'"
152,178, // '"'
153,178, // "*"
156,519, // stringChar
  }
,
{ // state 433
2,351, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 434
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+271, // $NT
  }
,
{ // state 435
0x80000000|1, // match move
0x80000000|509, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 436
0x80000000|1, // match move
0x80000000|573, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 437
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 438
2,164, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+260, // $NT
  }
,
{ // state 439
91,818, // "a"
113,291, // "r"
  }
,
{ // state 440
91,546, // "a"
95,707, // "e"
114,13, // "u"
  }
,
{ // state 441
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 442
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 443
113,543, // "r"
  }
,
{ // state 444
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 445
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 446
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 447
90,186, // "l"
  }
,
{ // state 448
167,MIN_REDUCTION+231, // $NT
  }
,
{ // state 449
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 450
107,1035, // "v"
  }
,
{ // state 451
95,46, // "e"
  }
,
{ // state 452
129,217, // {10}
  }
,
{ // state 453
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+262, // $NT
  }
,
{ // state 454
90,399, // "l"
  }
,
{ // state 455
119,132, // "n"
  }
,
{ // state 456
89,891, // "c"
  }
,
{ // state 457
92,545, // "s"
  }
,
{ // state 458
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+292, // $NT
  }
,
{ // state 459
0x80000000|69, // match move
0x80000000|233, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 460
120,93, // "t"
  }
,
{ // state 461
95,878, // "e"
  }
,
{ // state 462
2,570, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 463
2,740, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+167, // $NT
  }
,
{ // state 464
110,542, // "f"
  }
,
{ // state 465
0x80000000|1, // match move
0x80000000|438, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 466
111,954, // "i"
113,967, // "r"
  }
,
{ // state 467
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 468
90,760, // "l"
  }
,
{ // state 469
91,58, // "a"
  }
,
{ // state 470
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 471
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 472
111,101, // "i"
  }
,
{ // state 473
95,307, // "e"
  }
,
{ // state 474
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 475
120,970, // "t"
  }
,
{ // state 476
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 477
2,708, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 478
121,130, // "w"
  }
,
{ // state 479
0x80000000|1, // match move
0x80000000|462, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 480
113,236, // "r"
117,466, // "h"
  }
,
{ // state 481
112,260, // "o"
  }
,
{ // state 482
0x80000000|1, // match move
0x80000000|286, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 483
110,295, // "f"
  }
,
{ // state 484
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+202, // $NT
  }
,
{ // state 485
2,734, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+212, // $NT
  }
,
{ // state 486
167,MIN_REDUCTION+171, // $NT
  }
,
{ // state 487
2,494, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+269, // $NT
  }
,
{ // state 488
167,MIN_REDUCTION+297, // $NT
  }
,
{ // state 489
2,679, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+314, // $NT
  }
,
{ // state 490
167,MIN_REDUCTION+94, // $NT
  }
,
{ // state 491
101,616, // digit
123,420, // {"0".."9"}
  }
,
{ // state 492
91,79, // "a"
113,742, // "r"
114,362, // "u"
  }
,
{ // state 493
0x80000000|1, // match move
0x80000000|502, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 494
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+268, // $NT
  }
,
{ // state 495
167,MIN_REDUCTION+276, // $NT
  }
,
{ // state 496
90,656, // "l"
  }
,
{ // state 497
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 498
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 499
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 500
116,953, // "b"
  }
,
{ // state 501
0x80000000|1, // match move
0x80000000|477, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 502
2,536, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+233, // $NT
  }
,
{ // state 503
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 504
114,227, // "u"
  }
,
{ // state 505
89,226, // "c"
  }
,
{ // state 506
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+256, // $NT
  }
,
{ // state 507
114,170, // "u"
  }
,
{ // state 508
107,799, // "v"
  }
,
{ // state 509
2,620, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 510
2,812, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+254, // $NT
  }
,
{ // state 511
95,169, // "e"
  }
,
{ // state 512
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 513
2,317, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+311, // $NT
  }
,
{ // state 514
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 515
0x80000000|1, // match move
0x80000000|433, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 516
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 517
89,339, // "c"
  }
,
{ // state 518
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 519
151,195, // "'"
  }
,
{ // state 520
90,739, // "l"
  }
,
{ // state 521
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 522
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 523
2,764, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 524
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+190, // $NT
  }
,
{ // state 525
111,116, // "i"
  }
,
{ // state 526
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 527
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+196, // $NT
  }
,
{ // state 528
119,942, // "n"
  }
,
{ // state 529
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 530
111,941, // "i"
  }
,
{ // state 531
117,374, // "h"
  }
,
{ // state 532
0x80000000|1, // match move
0x80000000|485, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 533
0x80000000|1, // match move
0x80000000|510, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 534
0x80000000|704, // match move
0x80000000|844, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 535
111,160, // "i"
  }
,
{ // state 536
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+232, // $NT
  }
,
{ // state 537
120,28, // "t"
  }
,
{ // state 538
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 539
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 540
0x80000000|1, // match move
0x80000000|650, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 541
2,777, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 542
91,271, // "a"
  }
,
{ // state 543
0x80000000|1, // match move
0x80000000|680, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 544
110,974, // "f"
  }
,
{ // state 545
0x80000000|1, // match move
0x80000000|747, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 546
120,67, // "t"
  }
,
{ // state 547
167,MIN_REDUCTION+288, // $NT
  }
,
{ // state 548
0x80000000|1, // match move
0x80000000|380, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 549
113,598, // "r"
  }
,
{ // state 550
0x80000000|1, // match move
0x80000000|944, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 551
90,874, // "l"
  }
,
{ // state 552
97,321, // "="
  }
,
{ // state 553
118,64, // "k"
  }
,
{ // state 554
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 555
90,369, // "l"
  }
,
{ // state 556
2,198, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 557
2,281, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+179, // $NT
  }
,
{ // state 558
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 559
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 560
136,671, // "&"
  }
,
{ // state 561
0x80000000|1, // match move
0x80000000|513, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 562
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 563
0x80000000|333, // match move
0x80000000|966, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 564
0x80000000|1, // match move
0x80000000|375, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 565
0x80000000|1, // match move
0x80000000|613, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 566
92,465, // "s"
  }
,
{ // state 567
0x80000000|552, // match move
0x80000000|392, // no-match move
// T-test match for "=":
97,
  }
,
{ // state 568
2,427, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 569
0x80000000|1, // match move
0x80000000|586, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 570
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 571
120,196, // "t"
  }
,
{ // state 572
2,442, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 573
2,716, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+176, // $NT
  }
,
{ // state 574
91,443, // "a"
  }
,
{ // state 575
5,59, // `boolean
6,145, // `class
7,413, // `extends
8,486, // `void
9,923, // `int
10,834, // `while
11,841, // `if
12,490, // `else
13,55, // `for
14,35, // `break
15,20, // `this
16,872, // `false
17,637, // `true
18,386, // `super
19,643, // `null
20,736, // `return
21,811, // `instanceof
22,1021, // `new
23,666, // `abstract
24,615, // `assert
25,888, // `byte
26,283, // `case
27,1007, // `catch
28,930, // `char
29,448, // `const
30,114, // `continue
31,649, // `default
32,376, // `do
33,136, // `double
34,773, // `enum
35,252, // `final
36,261, // `finally
37,274, // `float
38,1002, // `goto
39,576, // `implements
40,99, // `import
41,794, // `interface
42,701, // `long
43,43, // `native
44,495, // `package
45,193, // `private
46,823, // `protected
47,75, // `public
48,547, // `short
49,9, // `static
50,659, // `strictfp
51,488, // `switch
52,862, // `synchronized
53,776, // `throw
54,993, // `throws
55,363, // `transient
56,879, // `try
57,398, // `volatile
89,146, // "c"
90,957, // "l"
91,187, // "a"
92,695, // "s"
95,837, // "e"
103,109, // "d"
104,1028, // "g"
106,492, // "p"
107,237, // "v"
110,853, // "f"
111,42, // "i"
113,323, // "r"
116,1010, // "b"
119,207, // "n"
120,480, // "t"
121,852, // "w"
  }
,
{ // state 576
167,MIN_REDUCTION+261, // $NT
  }
,
{ // state 577
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 578
111,345, // "i"
  }
,
{ // state 579
95,961, // "e"
  }
,
{ // state 580
120,569, // "t"
  }
,
{ // state 581
2,47, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 582
95,505, // "e"
  }
,
{ // state 583
0x80000000|623, // match move
0x80000000|320, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 584
2,779, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+206, // $NT
  }
,
{ // state 585
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 586
2,247, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+287, // $NT
  }
,
{ // state 587
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 588
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 589
91,210, // "a"
  }
,
{ // state 590
2,250, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+185, // $NT
  }
,
{ // state 591
0x80000000|157, // match move
0x80000000|141, // no-match move
0x80000000|575, // NT-test-match state for reserved
  }
,
{ // state 592
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 593
0x80000000|1, // match move
0x80000000|557, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 594
91,963, // "a"
  }
,
{ // state 595
0x80000000|1, // match move
0x80000000|975, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 596
92,338, // "s"
  }
,
{ // state 597
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 598
0x80000000|1, // match move
0x80000000|423, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 599
166,MIN_REDUCTION+0, // $
  }
,
{ // state 600
95,493, // "e"
  }
,
{ // state 601
89,134, // "c"
  }
,
{ // state 602
-1, // $$start
599, // start
106, // white*
762, // $$0
54, // token
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
983, // `!
148, // `!=
318, // `%
248, // `&&
142, // `*
471, // `(
104, // `)
445, // `{
414, // `}
559, // `-
287, // `+
174, // `=
587, // `==
911, // `[
665, // `]
882, // `||
467, // `<
156, // `<=
767, // `,
788, // `>
331, // `>=
538, // `.
476, // `;
137, // `++
986, // `--
359, // `/
51, // `:
982, // ID
308, // INT_LITERAL
706, // STRING_LITERAL
184, // CHAR_LITERAL
387, // "c"
387, // "l"
387, // "a"
387, // "s"
-1, // idChar
-1, // reserved
387, // "e"
88, // "!"
831, // "="
965, // "+"
181, // digit++
964, // letter
203, // digit
-1, // "_"
387, // "d"
387, // "g"
387, // "m"
387, // "p"
387, // "v"
387, // "y"
387, // {"A".."Z" "j" "q"}
387, // "f"
387, // "i"
387, // "o"
387, // "r"
387, // "u"
387, // "x"
387, // "b"
387, // "h"
387, // "k"
387, // "n"
387, // "t"
387, // "w"
387, // "z"
420, // {"0".."9"}
809, // white
470, // " "
470, // {9 12}
785, // eol
394, // singleLineComment
865, // {10}
285, // {13}
-1, // printable
1006, // "["
382, // "-"
190, // "<"
275, // "|"
560, // "&"
388, // ")"
968, // ","
556, // "]"
428, // "/"
201, // ";"
567, // ">"
768, // "{"
572, // "%"
523, // "("
-1, // "\"
112, // "."
129, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
949, // "}"
849, // "'"
1004, // '"'
750, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
421, // single
-1, // commentChar**
591, // token*
-1, // commentChar*
621, // digit+
-1, // idChar*
MIN_REDUCTION+1, // $
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
{ // state 603
120,127, // "t"
  }
,
{ // state 604
119,209, // "n"
  }
,
{ // state 605
112,868, // "o"
  }
,
{ // state 606
167,MIN_REDUCTION+337, // $NT
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 607
89,143, // "c"
  }
,
{ // state 608
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 609
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 610
0x80000000|1, // match move
0x80000000|634, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 611
2,873, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 612
117,354, // "h"
  }
,
{ // state 613
2,228, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+90, // $NT
  }
,
{ // state 614
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 615
167,MIN_REDUCTION+216, // $NT
  }
,
{ // state 616
0x80000000|738, // match move
0x80000000|636, // no-match move
0x80000000|73, // NT-test-match state for digit
  }
,
{ // state 617
119,530, // "n"
  }
,
{ // state 618
120,782, // "t"
  }
,
{ // state 619
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 620
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 621
0x80000000|491, // match move
0x80000000|497, // no-match move
0x80000000|73, // NT-test-match state for digit
  }
,
{ // state 622
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 623
95,21, // "e"
  }
,
{ // state 624
120,350, // "t"
  }
,
{ // state 625
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 626
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 627
112,1027, // "o"
  }
,
{ // state 628
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+220, // $NT
  }
,
{ // state 629
0x80000000|1, // match move
0x80000000|793, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 630
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 631
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 632
92,981, // "s"
  }
,
{ // state 633
111,412, // "i"
  }
,
{ // state 634
2,935, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 635
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 636
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 637
167,MIN_REDUCTION+195, // $NT
  }
,
{ // state 638
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 639
2,364, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+245, // $NT
  }
,
{ // state 640
2,111, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 641
113,1025, // "r"
  }
,
{ // state 642
95,172, // "e"
  }
,
{ // state 643
167,MIN_REDUCTION+201, // $NT
  }
,
{ // state 644
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 645
119,39, // "n"
  }
,
{ // state 646
92,475, // "s"
  }
,
{ // state 647
2,458, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+293, // $NT
  }
,
{ // state 648
111,447, // "i"
  }
,
{ // state 649
167,MIN_REDUCTION+237, // $NT
  }
,
{ // state 650
2,864, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+278, // $NT
  }
,
{ // state 651
0x80000000|1, // match move
0x80000000|640, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 652
92,150, // "s"
  }
,
{ // state 653
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 654
110,922, // "f"
  }
,
{ // state 655
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 656
95,200, // "e"
  }
,
{ // state 657
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+193, // $NT
  }
,
{ // state 658
120,16, // "t"
  }
,
{ // state 659
167,MIN_REDUCTION+294, // $NT
  }
,
{ // state 660
91,1017, // "a"
  }
,
{ // state 661
2,810, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+93, // $NT
  }
,
{ // state 662
90,990, // "l"
111,1038, // "i"
  }
,
{ // state 663
0x80000000|1, // match move
0x80000000|584, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 664
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 665
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 666
167,MIN_REDUCTION+213, // $NT
  }
,
{ // state 667
2,945, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+275, // $NT
  }
,
{ // state 668
95,110, // "e"
  }
,
{ // state 669
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 670
117,808, // "h"
  }
,
{ // state 671
2,631, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 672
0x80000000|1, // match move
0x80000000|828, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 673
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 674
89,501, // "c"
  }
,
{ // state 675
0x80000000|1, // match move
0x80000000|385, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 676
0x80000000|452, // match move
0x80000000|826, // no-match move
// T-test match for 10:
129,
  }
,
{ // state 677
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 678
119,199, // "n"
  }
,
{ // state 679
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+313, // $NT
  }
,
{ // state 680
2,2, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 681
167,MIN_REDUCTION+109, // $NT
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 682
95,595, // "e"
  }
,
{ // state 683
0x80000000|1, // match move
0x80000000|765, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 684
90,820, // "l"
  }
,
{ // state 685
2,925, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 686
0x80000000|1, // match move
0x80000000|541, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 687
90,959, // "l"
91,205, // "a"
111,326, // "i"
112,344, // "o"
  }
,
{ // state 688
0x80000000|1, // match move
0x80000000|581, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 689
113,61, // "r"
  }
,
{ // state 690
111,508, // "i"
112,537, // "o"
  }
,
{ // state 691
113,346, // "r"
  }
,
{ // state 692
0x80000000|1, // match move
0x80000000|590, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 693
0x80000000|1, // match move
0x80000000|840, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 694
2,619, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
155,719, // $$1
160,904, // single
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 695
108,402, // "y"
114,988, // "u"
117,481, // "h"
120,995, // "t"
121,525, // "w"
  }
,
{ // state 696
104,265, // "g"
  }
,
{ // state 697
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 698
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 699
92,795, // "s"
  }
,
{ // state 700
2,657, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+194, // $NT
  }
,
{ // state 701
167,MIN_REDUCTION+270, // $NT
  }
,
{ // state 702
89,100, // "c"
  }
,
{ // state 703
90,431, // "l"
  }
,
{ // state 704
90,867, // "l"
  }
,
{ // state 705
114,500, // "u"
  }
,
{ // state 706
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 707
121,1034, // "w"
  }
,
{ // state 708
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 709
2,899, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+227, // $NT
  }
,
{ // state 710
0x80000000|1, // match move
0x80000000|700, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 711
0x80000000|771, // match move
0x80000000|759, // no-match move
// T-test match for "\":
146,
  }
,
{ // state 712
2,113, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 713
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 714
92,642, // "s"
120,958, // "t"
  }
,
{ // state 715
106,229, // "p"
  }
,
{ // state 716
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+175, // $NT
  }
,
{ // state 717
0x80000000|1, // match move
0x80000000|783, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 718
120,138, // "t"
  }
,
{ // state 719
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 720
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 721
122,1024, // "z"
  }
,
{ // state 722
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+307, // $NT
  }
,
{ // state 723
112,298, // "o"
  }
,
{ // state 724
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 725
2,761, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+215, // $NT
  }
,
{ // state 726
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 727
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 728
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 729
121,65, // "w"
  }
,
{ // state 730
113,175, // "r"
  }
,
{ // state 731
2,415, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 732
95,23, // "e"
  }
,
{ // state 733
127,118, // eol
129,681, // {10}
130,676, // {13}
  }
,
{ // state 734
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+211, // $NT
  }
,
{ // state 735
111,1031, // "i"
  }
,
{ // state 736
167,MIN_REDUCTION+204, // $NT
  }
,
{ // state 737
0x80000000|1, // match move
0x80000000|667, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 738
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 739
0x80000000|1, // match move
0x80000000|774, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 740
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+166, // $NT
  }
,
{ // state 741
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+169, // $NT
  }
,
{ // state 742
111,71, // "i"
112,858, // "o"
  }
,
{ // state 743
0x80000000|1, // match move
0x80000000|661, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 744
113,36, // "r"
  }
,
{ // state 745
92,117, // "s"
  }
,
{ // state 746
114,907, // "u"
  }
,
{ // state 747
2,173, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+305, // $NT
  }
,
{ // state 748
2,235, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+188, // $NT
  }
,
{ // state 749
91,829, // "a"
  }
,
{ // state 750
2,780, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 751
105,282, // "m"
  }
,
{ // state 752
119,517, // "n"
  }
,
{ // state 753
92,202, // "s"
  }
,
{ // state 754
2,932, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 755
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 756
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 757
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 758
112,325, // "o"
  }
,
{ // state 759
0x80000000|166, // match move
0x80000000|192, // no-match move
// T-test match for '"':
152,
  }
,
{ // state 760
111,1003, // "i"
  }
,
{ // state 761
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+214, // $NT
  }
,
{ // state 762
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 763
1,599, // start
2,106, // white*
3,762, // $$0
4,54, // token
5,902, // `boolean
6,171, // `class
7,246, // `extends
8,697, // `void
9,727, // `int
10,998, // `while
11,124, // `if
12,151, // `else
13,597, // `for
14,366, // `break
15,833, // `this
16,937, // `false
17,805, // `true
18,105, // `super
19,588, // `null
20,912, // `return
21,877, // `instanceof
22,441, // `new
23,720, // `abstract
24,592, // `assert
25,626, // `byte
26,83, // `case
27,1012, // `catch
28,446, // `char
29,585, // `const
30,838, // `continue
31,516, // `default
32,813, // `do
33,357, // `double
34,121, // `enum
35,770, // `final
36,781, // `finally
37,256, // `float
38,343, // `goto
39,614, // `implements
40,728, // `import
41,498, // `interface
42,319, // `long
43,30, // `native
44,1039, // `package
45,1005, // `private
46,931, // `protected
47,562, // `public
48,677, // `short
49,539, // `static
50,855, // `strictfp
51,91, // `switch
52,60, // `synchronized
53,239, // `throw
54,980, // `throws
55,554, // `transient
56,889, // `try
57,1013, // `volatile
89,292, // "c"
90,188, // "l"
91,919, // "a"
92,861, // "s"
95,915, // "e"
103,905, // "d"
104,758, // "g"
106,883, // "p"
107,996, // "v"
110,687, // "f"
111,63, // "i"
113,461, // "r"
116,950, // "b"
119,440, // "n"
120,167, // "t"
121,670, // "w"
162,591, // token*
166,MIN_REDUCTION+1, // $
  }
,
{ // state 764
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 765
2,300, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+251, // $NT
  }
,
{ // state 766
0x80000000|1, // match move
0x80000000|245, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 767
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 768
2,806, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 769
89,984, // "c"
  }
,
{ // state 770
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 771
158,756, // $$2
  }
,
{ // state 772
0x80000000|1, // match move
0x80000000|748, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 773
167,MIN_REDUCTION+246, // $NT
  }
,
{ // state 774
2,789, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 775
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 776
167,MIN_REDUCTION+303, // $NT
  }
,
{ // state 777
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 778
95,455, // "e"
  }
,
{ // state 779
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+205, // $NT
  }
,
{ // state 780
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 781
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 782
110,49, // "f"
  }
,
{ // state 783
2,726, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 784
0x80000000|1, // match move
0x80000000|432, // no-match move
// T-test match for '"':
152,
  }
,
{ // state 785
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 786
167,MIN_REDUCTION+108, // $NT
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 787
92,624, // "s"
  }
,
{ // state 788
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 789
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 790
118,589, // "k"
  }
,
{ // state 791
2,977, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+230, // $NT
  }
,
{ // state 792
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 793
2,204, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 794
167,MIN_REDUCTION+267, // $NT
  }
,
{ // state 795
95,651, // "e"
  }
,
{ // state 796
167,MIN_REDUCTION+336, // $NT
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 797
92,565, // "s"
  }
,
{ // state 798
2,524, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+191, // $NT
  }
,
{ // state 799
91,718, // "a"
  }
,
{ // state 800
2,276, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 801
133,12, // "-"
  }
,
{ // state 802
97,76, // "="
  }
,
{ // state 803
119,1020, // "n"
  }
,
{ // state 804
2,971, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 805
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 806
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 807
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 808
111,496, // "i"
  }
,
{ // state 809
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 810
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+92, // $NT
  }
,
{ // state 811
167,MIN_REDUCTION+207, // $NT
  }
,
{ // state 812
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+253, // $NT
  }
,
{ // state 813
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 814
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 815
119,381, // "n"
  }
,
{ // state 816
120,778, // "t"
  }
,
{ // state 817
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 818
120,472, // "t"
  }
,
{ // state 819
92,633, // "s"
  }
,
{ // state 820
120,859, // "t"
  }
,
{ // state 821
2,332, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+290, // $NT
  }
,
{ // state 822
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+238, // $NT
  }
,
{ // state 823
167,MIN_REDUCTION+282, // $NT
  }
,
{ // state 824
0x80000000|1, // match move
0x80000000|916, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 825
91,429, // "a"
  }
,
{ // state 826
167,MIN_REDUCTION+111, // $NT
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 827
0x80000000|1, // match move
0x80000000|821, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 828
2,893, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 829
90,534, // "l"
  }
,
{ // state 830
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 831
0x80000000|938, // match move
0x80000000|390, // no-match move
// T-test match for "=":
97,
  }
,
{ // state 832
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 833
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 834
167,MIN_REDUCTION+177, // $NT
  }
,
{ // state 835
90,934, // "l"
  }
,
{ // state 836
112,66, // "o"
  }
,
{ // state 837
90,652, // "l"
115,816, // "x"
119,504, // "n"
  }
,
{ // state 838
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 839
95,675, // "e"
  }
,
{ // state 840
2,474, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 841
167,MIN_REDUCTION+180, // $NT
  }
,
{ // state 842
111,674, // "i"
  }
,
{ // state 843
119,97, // "n"
  }
,
{ // state 844
2,155, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+248, // $NT
  }
,
{ // state 845
2,444, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 846
0x80000000|1, // match move
0x80000000|70, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 847
118,692, // "k"
  }
,
{ // state 848
0x80000000|1, // match move
0x80000000|798, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 849
0x80000000|1, // match move
0x80000000|784, // no-match move
// T-test match for "\":
146,
  }
,
{ // state 850
107,682, // "v"
  }
,
{ // state 851
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 852
117,648, // "h"
  }
,
{ // state 853
90,856, // "l"
91,1026, // "a"
111,90, // "i"
112,691, // "o"
  }
,
{ // state 854
0x80000000|1, // match move
0x80000000|845, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 855
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 856
112,921, // "o"
  }
,
{ // state 857
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 858
120,582, // "t"
  }
,
{ // state 859
0x80000000|1, // match move
0x80000000|53, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 860
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 861
108,987, // "y"
114,161, // "u"
117,401, // "h"
120,439, // "t"
121,219, // "w"
  }
,
{ // state 862
167,MIN_REDUCTION+300, // $NT
  }
,
{ // state 863
0x80000000|189, // match move
0x80000000|230, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 864
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+277, // $NT
  }
,
{ // state 865
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 866
0x80000000|1, // match move
0x80000000|639, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 867
108,683, // "y"
  }
,
{ // state 868
110,663, // "f"
  }
,
{ // state 869
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 870
-1, // $$start
-1, // start
-1, // white*
4, // $$0
54, // token
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
983, // `!
148, // `!=
318, // `%
248, // `&&
142, // `*
471, // `(
104, // `)
445, // `{
414, // `}
559, // `-
287, // `+
174, // `=
587, // `==
911, // `[
665, // `]
882, // `||
467, // `<
156, // `<=
767, // `,
788, // `>
331, // `>=
538, // `.
476, // `;
137, // `++
986, // `--
359, // `/
51, // `:
982, // ID
308, // INT_LITERAL
706, // STRING_LITERAL
184, // CHAR_LITERAL
387, // "c"
387, // "l"
387, // "a"
387, // "s"
-1, // idChar
-1, // reserved
387, // "e"
88, // "!"
831, // "="
965, // "+"
181, // digit++
964, // letter
203, // digit
-1, // "_"
387, // "d"
387, // "g"
387, // "m"
387, // "p"
387, // "v"
387, // "y"
387, // {"A".."Z" "j" "q"}
387, // "f"
387, // "i"
387, // "o"
387, // "r"
387, // "u"
387, // "x"
387, // "b"
387, // "h"
387, // "k"
387, // "n"
387, // "t"
387, // "w"
387, // "z"
420, // {"0".."9"}
724, // white
470, // " "
470, // {9 12}
785, // eol
394, // singleLineComment
865, // {10}
285, // {13}
-1, // printable
1006, // "["
382, // "-"
190, // "<"
275, // "|"
560, // "&"
388, // ")"
968, // ","
556, // "]"
428, // "/"
201, // ";"
567, // ">"
768, // "{"
572, // "%"
523, // "("
-1, // "\"
112, // "."
129, // ":"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
949, // "}"
849, // "'"
1004, // '"'
750, // "*"
-1, // idChar**
-1, // $$1
-1, // stringChar
-1, // stringChar*
-1, // $$2
-1, // commentChar
421, // single
-1, // commentChar**
591, // token*
-1, // commentChar*
621, // digit+
-1, // idChar*
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 871
167,MIN_REDUCTION+106, // $NT
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 872
167,MIN_REDUCTION+192, // $NT
  }
,
{ // state 873
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 874
90,766, // "l"
  }
,
{ // state 875
89,531, // "c"
  }
,
{ // state 876
0x80000000|1, // match move
0x80000000|62, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 877
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 878
120,293, // "t"
  }
,
{ // state 879
167,MIN_REDUCTION+312, // $NT
  }
,
{ // state 880
2,807, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 881
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+280, // $NT
  }
,
{ // state 882
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 883
91,89, // "a"
113,690, // "r"
114,1040, // "u"
  }
,
{ // state 884
95,896, // "e"
  }
,
{ // state 885
97,140, // "="
  }
,
{ // state 886
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 887
89,612, // "c"
  }
,
{ // state 888
167,MIN_REDUCTION+219, // $NT
  }
,
{ // state 889
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 890
2,755, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 891
117,730, // "h"
  }
,
{ // state 892
95,322, // "e"
  }
,
{ // state 893
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 894
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 895
92,22, // "s"
  }
,
{ // state 896
0x80000000|1, // match move
0x80000000|25, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 897
90,96, // "l"
111,6, // "i"
  }
,
{ // state 898
91,555, // "a"
  }
,
{ // state 899
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+226, // $NT
  }
,
{ // state 900
90,451, // "l"
  }
,
{ // state 901
120,948, // "t"
  }
,
{ // state 902
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 903
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 904
127,254, // eol
129,503, // {10}
130,989, // {13}
  }
,
{ // state 905
95,464, // "e"
112,33, // "o"
  }
,
{ // state 906
119,152, // "n"
  }
,
{ // state 907
95,365, // "e"
  }
,
{ // state 908
167,MIN_REDUCTION+104, // $NT
  }
,
{ // state 909
103,176, // "d"
  }
,
{ // state 910
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 911
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 912
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 913
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 914
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 915
90,329, // "l"
115,603, // "x"
119,347, // "n"
  }
,
{ // state 916
2,972, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+242, // $NT
  }
,
{ // state 917
0x80000000|267, // match move
0x80000000|1041, // no-match move
// T-test match for '"':
152,
  }
,
{ // state 918
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 919
92,745, // "s"
116,646, // "b"
  }
,
{ // state 920
2,400, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+218, // $NT
  }
,
{ // state 921
91,234, // "a"
  }
,
{ // state 922
91,327, // "a"
  }
,
{ // state 923
167,MIN_REDUCTION+174, // $NT
  }
,
{ // state 924
114,689, // "u"
  }
,
{ // state 925
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 926
111,315, // "i"
  }
,
{ // state 927
120,243, // "t"
  }
,
{ // state 928
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 929
0x80000000|1, // match move
0x80000000|1014, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 930
167,MIN_REDUCTION+228, // $NT
  }
,
{ // state 931
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 932
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 933
119,355, // "n"
  }
,
{ // state 934
108,846, // "y"
  }
,
{ // state 935
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 936
2,38, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+164, // $NT
  }
,
{ // state 937
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 938
97,731, // "="
  }
,
{ // state 939
0x80000000|1, // match move
0x80000000|568, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 940
92,548, // "s"
  }
,
{ // state 941
122,330, // "z"
  }
,
{ // state 942
92,424, // "s"
120,735, // "t"
  }
,
{ // state 943
90,177, // "l"
112,1008, // "o"
  }
,
{ // state 944
2,40, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 945
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+274, // $NT
  }
,
{ // state 946
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 947
2,978, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 948
111,194, // "i"
  }
,
{ // state 949
2,918, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 950
108,213, // "y"
112,301, // "o"
113,269, // "r"
  }
,
{ // state 951
95,710, // "e"
  }
,
{ // state 952
102,MIN_REDUCTION+104, // "_"
154,MIN_REDUCTION+104, // idChar**
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 953
90,297, // "l"
  }
,
{ // state 954
92,772, // "s"
  }
,
{ // state 955
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 956
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 957
112,843, // "o"
  }
,
{ // state 958
89,128, // "c"
  }
,
{ // state 959
112,396, // "o"
  }
,
{ // state 960
2,273, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+302, // $NT
  }
,
{ // state 961
112,483, // "o"
  }
,
{ // state 962
120,131, // "t"
  }
,
{ // state 963
89,147, // "c"
  }
,
{ // state 964
0x80000000|409, // match move
0x80000000|223, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 965
0x80000000|418, // match move
0x80000000|360, // no-match move
// T-test match for "+":
98,
  }
,
{ // state 966
2,822, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+239, // $NT
  }
,
{ // state 967
112,478, // "o"
  }
,
{ // state 968
2,955, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 969
95,909, // "e"
  }
,
{ // state 970
113,378, // "r"
  }
,
{ // state 971
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 972
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+241, // $NT
  }
,
{ // state 973
91,752, // "a"
  }
,
{ // state 974
106,929, // "p"
  }
,
{ // state 975
2,434, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+272, // $NT
  }
,
{ // state 976
118,191, // "k"
  }
,
{ // state 977
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+229, // $NT
  }
,
{ // state 978
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 979
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+265, // $NT
  }
,
{ // state 980
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 981
111,309, // "i"
  }
,
{ // state 982
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 983
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 984
120,532, // "t"
  }
,
{ // state 985
119,460, // "n"
  }
,
{ // state 986
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 987
119,456, // "n"
  }
,
{ // state 988
106,224, // "p"
  }
,
{ // state 989
0x80000000|163, // match move
0x80000000|290, // no-match move
// T-test match for 10:
129,
  }
,
{ // state 990
91,270, // "a"
  }
,
{ // state 991
0x80000000|1, // match move
0x80000000|920, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 992
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 993
167,MIN_REDUCTION+306, // $NT
  }
,
{ // state 994
167,MIN_REDUCTION+101, // $NT
  }
,
{ // state 995
91,901, // "a"
113,535, // "r"
  }
,
{ // state 996
112,897, // "o"
  }
,
{ // state 997
105,668, // "m"
  }
,
{ // state 998
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 999
92,316, // "s"
120,208, // "t"
  }
,
{ // state 1000
95,85, // "e"
  }
,
{ // state 1001
95,34, // "e"
  }
,
{ // state 1002
167,MIN_REDUCTION+258, // $NT
  }
,
{ // state 1003
89,358, // "c"
  }
,
{ // state 1004
0x80000000|259, // match move
0x80000000|917, // no-match move
// T-test match for "\":
146,
  }
,
{ // state 1005
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 1006
2,449, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 1007
167,MIN_REDUCTION+225, // $NT
  }
,
{ // state 1008
113,7, // "r"
  }
,
{ // state 1009
120,314, // "t"
  }
,
{ // state 1010
108,962, // "y"
112,115, // "o"
113,511, // "r"
  }
,
{ // state 1011
95,225, // "e"
  }
,
{ // state 1012
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 1013
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 1014
2,14, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 1015
124,625, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 1016
124,796, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+172, // $NT
  }
,
{ // state 1017
120,212, // "t"
  }
,
{ // state 1018
2,722, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+308, // $NT
  }
,
{ // state 1019
0x80000000|1, // match move
0x80000000|1018, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 1020
0x80000000|1, // match move
0x80000000|936, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 1021
167,MIN_REDUCTION+210, // $NT
  }
,
{ // state 1022
113,723, // "r"
  }
,
{ // state 1023
0x80000000|1, // match move
0x80000000|1032, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 1024
95,144, // "e"
  }
,
{ // state 1025
120,550, // "t"
  }
,
{ // state 1026
90,182, // "l"
  }
,
{ // state 1027
0x80000000|1, // match move
0x80000000|1037, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 1028
112,179, // "o"
  }
,
{ // state 1029
2,514, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1030
120,1019, // "t"
  }
,
{ // state 1031
119,135, // "n"
  }
,
{ // state 1032
2,484, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+203, // $NT
  }
,
{ // state 1033
2,526, // white*
124,284, // white
125,992, // " "
126,992, // {9 12}
127,512, // eol
128,792, // singleLineComment
129,503, // {10}
130,989, // {13}
160,904, // single
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 1034
0x80000000|1, // match move
0x80000000|1033, // no-match move
0x80000000|48, // NT-test-match state for idChar
  }
,
{ // state 1035
95,430, // "e"
  }
,
{ // state 1036
92,515, // "s"
  }
,
{ // state 1037
2,506, // white*
124,606, // white
125,871, // " "
126,871, // {9 12}
127,98, // eol
128,786, // singleLineComment
129,681, // {10}
130,676, // {13}
160,733, // single
167,MIN_REDUCTION+257, // $NT
  }
,
{ // state 1038
103,149, // "d"
  }
,
{ // state 1039
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 1040
116,294, // "b"
  }
,
{ // state 1041
89,817, // "c"
90,817, // "l"
91,817, // "a"
92,817, // "s"
95,817, // "e"
96,817, // "!"
97,817, // "="
98,817, // "+"
102,817, // "_"
103,817, // "d"
104,817, // "g"
105,817, // "m"
106,817, // "p"
107,817, // "v"
108,817, // "y"
109,817, // {"A".."Z" "j" "q"}
110,817, // "f"
111,817, // "i"
112,817, // "o"
113,817, // "r"
114,817, // "u"
115,817, // "x"
116,817, // "b"
117,817, // "h"
118,817, // "k"
119,817, // "n"
120,817, // "t"
121,817, // "w"
122,817, // "z"
123,817, // {"0".."9"}
125,817, // " "
131,185, // printable
132,817, // "["
133,817, // "-"
134,817, // "<"
135,817, // "|"
136,817, // "&"
137,817, // ")"
138,817, // ","
139,817, // "]"
140,817, // "/"
141,817, // ";"
142,817, // ">"
143,817, // "{"
144,817, // "%"
145,817, // "("
146,817, // "\"
147,817, // "."
148,817, // ":"
149,817, // {"#".."$" "?".."@" "^" "`" "~"}
150,817, // "}"
151,817, // "'"
152,817, // '"'
153,817, // "*"
156,86, // stringChar
157,711, // stringChar*
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[1042][];
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
// white ::= singleLineComment
(124<<16)+1,
// eol ::= {10}
(127<<16)+1,
// eol ::= {13} {10}
(127<<16)+2,
// eol ::= {13} !10
(127<<16)+1,
// printable ::= {" ".."~"}
(131<<16)+1,
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
(156<<16)+1,
// STRING_LITERAL ::= '"' stringChar* $$2
(87<<16)+3,
// STRING_LITERAL ::= '"' $$2
(87<<16)+2,
// CHAR_LITERAL ::= "'" stringChar "'" white*
(88<<16)+4,
// CHAR_LITERAL ::= "'" stringChar "'"
(88<<16)+3,
// commentChar ::= !eol printable
(159<<16)+1,
// single ::= !"/" "/" "/" commentChar**
(160<<16)+3,
// single ::= !"/" "/" "/" !commentChar
(160<<16)+2,
// singleLineComment ::= single eol
(128<<16)+2,
// token* ::= token* token
(162<<16)+2,
// token* ::= token
(162<<16)+1,
// commentChar** ::= commentChar* !commentChar
(161<<16)+1,
// digit++ ::= digit+ !digit
(99<<16)+1,
// idChar** ::= idChar* !idChar
(154<<16)+1,
// stringChar* ::= stringChar* stringChar
(157<<16)+2,
// stringChar* ::= stringChar
(157<<16)+1,
// white* ::= white* white
(2<<16)+2,
// white* ::= white
(2<<16)+1,
// digit+ ::= digit
(164<<16)+1,
// digit+ ::= digit+ digit
(164<<16)+2,
// commentChar* ::= commentChar* commentChar
(163<<16)+2,
// commentChar* ::= commentChar
(163<<16)+1,
// idChar* ::= idChar* idChar
(165<<16)+2,
// idChar* ::= idChar
(165<<16)+1,
// $$0 ::= token*
(3<<16)+1,
// $$1 ::= white*
(155<<16)+1,
// $$2 ::= '"' white*
(158<<16)+2,
// $$2 ::= '"'
(158<<16)+1,
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
129, // 10
-1, // 11
126, // 12
130, // 13
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
152, // '"'
149, // "#"
149, // "$"
144, // "%"
136, // "&"
151, // "'"
145, // "("
137, // ")"
153, // "*"
98, // "+"
138, // ","
133, // "-"
147, // "."
140, // "/"
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
148, // ":"
141, // ";"
134, // "<"
97, // "="
142, // ">"
149, // "?"
149, // "@"
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
132, // "["
146, // "\"
139, // "]"
149, // "^"
102, // "_"
149, // "`"
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
143, // "{"
135, // "|"
150, // "}"
149, // "~"
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
"token* ::= token* token", // 329
"token* ::= token* token", // 330
"commentChar** ::= commentChar* !commentChar", // 331
"digit++ ::= digit+ !digit", // 332
"idChar** ::= idChar* !idChar", // 333
"stringChar* ::= stringChar* stringChar", // 334
"stringChar* ::= stringChar* stringChar", // 335
"white* ::= white* white", // 336
"white* ::= white* white", // 337
"digit+ ::= digit", // 338
"digit+ ::= digit+ digit", // 339
"commentChar* ::= commentChar* commentChar", // 340
"commentChar* ::= commentChar* commentChar", // 341
"idChar* ::= idChar* idChar", // 342
"idChar* ::= idChar* idChar", // 343
"", // 344
"", // 345
"", // 346
"", // 347
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 4: start ::= [white*] $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
    },
    { // 5: token ::= [#] `boolean @sawBoolean(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 6: token ::= [#] `class @sawClass(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 7: token ::= [#] `extends @sawExtends(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 8: token ::= [#] `void @sawVoid(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: token ::= [#] `int @sawInt(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: token ::= [#] `while @sawWhile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: token ::= [#] `if @sawIf(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: token ::= [#] `else @sawElse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: token ::= [#] `for @sawFor(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 14: token ::= [#] `break @sawBreak(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 15: token ::= [#] `this @sawThis(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 16: token ::= [#] `false @sawFalse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 17: token ::= [#] `true @sawTrue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 18: token ::= [#] `super @sawSuper(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 19: token ::= [#] `null @sawNull(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 20: token ::= [#] `return @sawReturn(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 21: token ::= [#] `instanceof @sawInstanceof(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 22: token ::= [#] `new @sawNew(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 23: token ::= [#] `abstract @sawAbstract(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 24: token ::= [#] `assert @sawAssert(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 25: token ::= [#] `byte @sawByte(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 26: token ::= [#] `case @sawCase(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 27: token ::= [#] `catch @sawCatch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 28: token ::= [#] `char @sawChar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 29: token ::= [#] `const @sawConst(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 30: token ::= [#] `continue @sawContinue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 31: token ::= [#] `default @sawDefault(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 32: token ::= [#] `do @sawDo(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 33: token ::= [#] `double @sawDouble(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 34: token ::= [#] `enum @sawEnum(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 35: token ::= [#] `final @sawFinal(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 36: token ::= [#] `finally @sawFinally(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 37: token ::= [#] `float @sawFloat(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 38: token ::= [#] `goto @sawGoto(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 39: token ::= [#] `implements @sawImplements(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 40: token ::= [#] `import @sawImport(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 41: token ::= [#] `interface @sawInterface(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 42: token ::= [#] `long @sawLong(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 43: token ::= [#] `native @sawNative(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 44: token ::= [#] `package @sawPackage(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 45: token ::= [#] `private @sawPrivate(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 46: token ::= [#] `protected @sawProtected(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 47: token ::= [#] `public @sawPublic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 48: token ::= [#] `short @sawShort(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 49: token ::= [#] `static @sawStatic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 50: token ::= [#] `strictfp @sawStrictfp(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 51: token ::= [#] `switch @sawSwitch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 52: token ::= [#] `synchronized @sawSynchronized(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 53: token ::= [#] `throw @sawThrow(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 54: token ::= [#] `throws @sawThrows(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 55: token ::= [#] `transient @sawTransient(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 56: token ::= [#] `try @sawTry(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 57: token ::= [#] `volatile @sawVolatile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 58: token ::= [#] `! @sawNot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 59: token ::= [#] `!= @sawNotEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 60: token ::= [#] `% @sawRemainder(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 61: token ::= [#] `&& @sawAnd(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 62: token ::= [#] `* @sawTimes(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 63: token ::= [#] `( @sawLpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 64: token ::= [#] `) @sawRpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 65: token ::= [#] `{ @sawLbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 66: token ::= [#] `} @sawRbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 67: token ::= [#] `- @sawMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 68: token ::= [#] `+ @sawPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 69: token ::= [#] `= @sawAssign(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
    { // 70: token ::= [#] `== @sawEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((65<<5)|0x5)/*methodCall:65*/,
    },
    { // 71: token ::= [#] `[ @sawLbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 72: token ::= [#] `] @sawRbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 73: token ::= [#] `|| @sawOr(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((68<<5)|0x5)/*methodCall:68*/,
    },
    { // 74: token ::= [#] `< @sawLess(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 75: token ::= [#] `<= @sawLessEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((70<<5)|0x5)/*methodCall:70*/,
    },
    { // 76: token ::= [#] `, @sawComma(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((71<<5)|0x5)/*methodCall:71*/,
    },
    { // 77: token ::= [#] `> @sawGreater(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((72<<5)|0x5)/*methodCall:72*/,
    },
    { // 78: token ::= [#] `>= @sawGreaterEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((73<<5)|0x5)/*methodCall:73*/,
    },
    { // 79: token ::= [#] `. @sawDot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((74<<5)|0x5)/*methodCall:74*/,
    },
    { // 80: token ::= [#] `; @sawSemi(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((75<<5)|0x5)/*methodCall:75*/,
    },
    { // 81: token ::= [#] `++ @sawPlusPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((76<<5)|0x5)/*methodCall:76*/,
    },
    { // 82: token ::= [#] `-- @sawMinusMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((77<<5)|0x5)/*methodCall:77*/,
    },
    { // 83: token ::= [#] `/ @sawSlash(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((78<<5)|0x5)/*methodCall:78*/,
    },
    { // 84: token ::= [#] `: @sawColon(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((79<<5)|0x5)/*methodCall:79*/,
    },
    { // 85: token ::= [#] ID @identifier(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((80<<5)|0x5)/*methodCall:80*/,
    },
    { // 86: token ::= [#] INT_LITERAL @intLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((81<<5)|0x5)/*methodCall:81*/,
    },
    { // 87: token ::= [#] STRING_LITERAL @stringLit(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((82<<5)|0x5)/*methodCall:82*/,
    },
    { // 88: token ::= [#] CHAR_LITERAL @charLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 99: INT_LITERAL ::= [#] digit++ white* @convertToInt(int,List<Character>)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 100: INT_LITERAL ::= [#] digit++ [white*] @convertToInt(int,List<Character>)=>int
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
    { // 108: white ::= singleLineComment @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 109: eol ::= {10} [registerNewline] @void
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 110: eol ::= {13} {10} [registerNewline] @void
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 111: eol ::= {13} !10 [registerNewline] @void
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 112: printable ::= {" ".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 113: `! ::= "!" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 114: `! ::= "!" !"=" [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 115: `% ::= "%" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 116: `% ::= "%" [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 117: `&& ::= "&" "&" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 118: `&& ::= "&" "&" [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 119: `* ::= "*" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 120: `* ::= "*" [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 121: `( ::= "(" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 122: `( ::= "(" [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 123: `) ::= ")" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 124: `) ::= ")" [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 125: `{ ::= "{" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 126: `{ ::= "{" [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 127: `} ::= "}" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 128: `} ::= "}" [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 129: `- ::= "-" !"-" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 130: `- ::= "-" !"-" [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 131: `= ::= "=" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 132: `= ::= "=" !"=" [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 133: `== ::= "=" "=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 134: `== ::= "=" "=" [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 135: `[ ::= "[" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 136: `[ ::= "[" [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 137: `] ::= "]" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 138: `] ::= "]" [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 139: `|| ::= "|" "|" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 140: `|| ::= "|" "|" [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 141: `< ::= "<" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 142: `< ::= "<" !"=" [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 143: `<= ::= "<" "=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 144: `<= ::= "<" "=" [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 145: `, ::= "," white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 146: `, ::= "," [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 147: `> ::= ">" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 148: `> ::= ">" !"=" [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 149: `>= ::= ">" "=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 150: `>= ::= ">" "=" [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 151: `: ::= ":" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 152: `: ::= ":" [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 153: `. ::= "." white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 154: `. ::= "." [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 155: `; ::= ";" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 156: `; ::= ";" [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 157: `++ ::= "+" "+" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 158: `++ ::= "+" "+" [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 159: `-- ::= "-" "-" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 160: `-- ::= "-" "-" [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 161: `/ ::= "/" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 162: `/ ::= "/" [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 163: `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar white* @void
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
    { // 164: `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 165: reserved ::= `boolean @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 166: `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar white* @void
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
    { // 167: `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 168: reserved ::= `extends @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 169: `void ::= "v" "o" "i" "d" !idChar white* @void
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
    { // 170: `void ::= "v" "o" "i" "d" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
    { // 171: reserved ::= `void @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 172: `int ::= "i" "n" "t" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 173: `int ::= "i" "n" "t" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 174: reserved ::= `int @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 175: `while ::= "w" "h" "i" "l" "e" !idChar white* @void
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
    { // 176: `while ::= "w" "h" "i" "l" "e" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 177: reserved ::= `while @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 178: `if ::= "i" "f" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 179: `if ::= "i" "f" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 180: reserved ::= `if @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 181: `for ::= "f" "o" "r" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 182: `for ::= "f" "o" "r" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 183: reserved ::= `for @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 184: `break ::= "b" "r" "e" "a" "k" !idChar white* @void
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
    { // 185: `break ::= "b" "r" "e" "a" "k" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 186: reserved ::= `break @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 187: `this ::= "t" "h" "i" "s" !idChar white* @void
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
    { // 188: `this ::= "t" "h" "i" "s" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
    { // 189: reserved ::= `this @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 190: `false ::= "f" "a" "l" "s" "e" !idChar white* @void
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
    { // 191: `false ::= "f" "a" "l" "s" "e" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 192: reserved ::= `false @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 193: `true ::= "t" "r" "u" "e" !idChar white* @void
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
    { // 194: `true ::= "t" "r" "u" "e" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
    { // 195: reserved ::= `true @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 196: `super ::= "s" "u" "p" "e" "r" !idChar white* @void
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
    { // 197: `super ::= "s" "u" "p" "e" "r" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 198: reserved ::= `super @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 199: `null ::= "n" "u" "l" "l" !idChar white* @void
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
    { // 200: `null ::= "n" "u" "l" "l" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
    { // 201: reserved ::= `null @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 202: `return ::= "r" "e" "t" "u" "r" "n" !idChar white* @void
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
    { // 203: `return ::= "r" "e" "t" "u" "r" "n" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 204: reserved ::= `return @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 205: `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar white* @void
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
    { // 206: `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 207: reserved ::= `instanceof @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 208: `new ::= "n" "e" "w" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 209: `new ::= "n" "e" "w" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 210: reserved ::= `new @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 211: `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar white* @void
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
    { // 212: `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 213: reserved ::= `abstract @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 214: `assert ::= "a" "s" "s" "e" "r" "t" !idChar white* @void
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
    { // 215: `assert ::= "a" "s" "s" "e" "r" "t" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 216: reserved ::= `assert @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 217: `byte ::= "b" "y" "t" "e" !idChar white* @void
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
    { // 218: `byte ::= "b" "y" "t" "e" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
    { // 219: reserved ::= `byte @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 220: `case ::= "c" "a" "s" "e" !idChar white* @void
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
    { // 221: `case ::= "c" "a" "s" "e" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
    { // 222: reserved ::= `case @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 223: `catch ::= "c" "a" "t" "c" "h" !idChar white* @void
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
    { // 224: `catch ::= "c" "a" "t" "c" "h" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 225: reserved ::= `catch @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 226: `char ::= "c" "h" "a" "r" !idChar white* @void
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
    { // 227: `char ::= "c" "h" "a" "r" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
    { // 228: reserved ::= `char @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 229: `const ::= "c" "o" "n" "s" "t" !idChar white* @void
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
    { // 230: `const ::= "c" "o" "n" "s" "t" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 231: reserved ::= `const @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 232: `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar white* @void
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
    { // 233: `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 234: reserved ::= `continue @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 235: `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar white* @void
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
    { // 236: `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 237: reserved ::= `default @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 238: `do ::= "d" "o" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 239: `do ::= "d" "o" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 240: reserved ::= `do @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 241: `double ::= "d" "o" "u" "b" "l" "e" !idChar white* @void
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
    { // 242: `double ::= "d" "o" "u" "b" "l" "e" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 243: reserved ::= `double @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 244: `enum ::= "e" "n" "u" "m" !idChar white* @void
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
    { // 245: `enum ::= "e" "n" "u" "m" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
    { // 246: reserved ::= `enum @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 247: `final ::= "f" "i" "n" "a" "l" !idChar white* @void
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
    { // 248: `final ::= "f" "i" "n" "a" "l" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 249: reserved ::= `final @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 250: `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar white* @void
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
    { // 251: `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 252: reserved ::= `finally @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 253: `float ::= "f" "l" "o" "a" "t" !idChar white* @void
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
    { // 254: `float ::= "f" "l" "o" "a" "t" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 255: reserved ::= `float @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 256: `goto ::= "g" "o" "t" "o" !idChar white* @void
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
    { // 257: `goto ::= "g" "o" "t" "o" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
    { // 258: reserved ::= `goto @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 259: `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar white* @void
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
    { // 260: `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 261: reserved ::= `implements @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 262: `import ::= "i" "m" "p" "o" "r" "t" !idChar white* @void
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
    { // 263: `import ::= "i" "m" "p" "o" "r" "t" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 264: reserved ::= `import @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 265: `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar white* @void
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
    { // 266: `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 267: reserved ::= `interface @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 268: `long ::= "l" "o" "n" "g" !idChar white* @void
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
    { // 269: `long ::= "l" "o" "n" "g" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
    { // 270: reserved ::= `long @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 271: `native ::= "n" "a" "t" "i" "v" "e" !idChar white* @void
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
    { // 272: `native ::= "n" "a" "t" "i" "v" "e" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 273: reserved ::= `native @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 274: `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar white* @void
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
    { // 275: `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 276: reserved ::= `package @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 277: `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar white* @void
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
    { // 278: `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 279: reserved ::= `private @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 280: `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar white* @void
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
    { // 281: `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 282: reserved ::= `protected @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 283: `public ::= "p" "u" "b" "l" "i" "c" !idChar white* @void
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
    { // 284: `public ::= "p" "u" "b" "l" "i" "c" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 285: reserved ::= `public @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 286: `short ::= "s" "h" "o" "r" "t" !idChar white* @void
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
    { // 287: `short ::= "s" "h" "o" "r" "t" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 288: reserved ::= `short @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 289: `static ::= "s" "t" "a" "t" "i" "c" !idChar white* @void
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
    { // 290: `static ::= "s" "t" "a" "t" "i" "c" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 291: reserved ::= `static @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 292: `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar white* @void
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
    { // 293: `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 294: reserved ::= `strictfp @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 295: `switch ::= "s" "w" "i" "t" "c" "h" !idChar white* @void
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
    { // 296: `switch ::= "s" "w" "i" "t" "c" "h" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 297: reserved ::= `switch @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 298: `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar white* @void
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
    { // 299: `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 300: reserved ::= `synchronized @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 301: `throw ::= "t" "h" "r" "o" "w" !idChar white* @void
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
    { // 302: `throw ::= "t" "h" "r" "o" "w" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 303: reserved ::= `throw @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 304: `throws ::= "t" "h" "r" "o" "w" "s" !idChar white* @void
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
    { // 305: `throws ::= "t" "h" "r" "o" "w" "s" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 306: reserved ::= `throws @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 307: `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar white* @void
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
    { // 308: `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 309: reserved ::= `transient @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 310: `try ::= "t" "r" "y" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 311: `try ::= "t" "r" "y" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 312: reserved ::= `try @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 313: `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar white* @void
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
    { // 314: `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 315: reserved ::= `volatile @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 316: ID ::= !reserved letter idChar** $$1 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 317: ID ::= !reserved letter idChar** [white*] @text
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 318: ID ::= !reserved letter !idChar [idChar**] $$1 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 319: ID ::= !reserved letter !idChar [idChar**] [white*] @text
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 320: stringChar ::= !"\" !'"' printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 321: STRING_LITERAL ::= '"' stringChar* $$2 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 322: STRING_LITERAL ::= '"' [stringChar*] $$2 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 323: CHAR_LITERAL ::= "'" stringChar "'" white* @returChar(char,char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 324: CHAR_LITERAL ::= "'" stringChar "'" [white*] @returChar(char,char,char)=>int
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 325: commentChar ::= !eol printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 326: single ::= !"/" "/" "/" commentChar** @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 327: single ::= !"/" "/" "/" !commentChar [commentChar**] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 328: singleLineComment ::= single eol @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 329: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 330: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // 331: commentChar** ::= commentChar* !commentChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 332: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 333: idChar** ::= idChar* !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 334: stringChar* ::= stringChar* stringChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 335: stringChar* ::= [stringChar*] stringChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 336: white* ::= white* white @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 337: white* ::= [white*] white @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
    },
    { // 338: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 339: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 340: commentChar* ::= commentChar* commentChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 341: commentChar* ::= [commentChar*] commentChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 342: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 343: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 344: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 345: $$1 ::= white* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 346: $$2 ::= '"' white* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 347: $$2 ::= '"' [white*] @pass
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "", // start
    "commentChar* ::=", // commentChar*
    "commentChar** ::= commentChar* !commentChar", // commentChar**
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // commentChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // commentChar**
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // stringChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // idChar**
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
    1,
    0,
    1,
    0,
    1,
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
