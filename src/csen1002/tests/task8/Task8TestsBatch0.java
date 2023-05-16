package csen1002.tests.task8;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.StringJoiner;
import java.util.concurrent.TimeUnit;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task8.Task8Lexer;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task8TestsBatch0 {

	/**
	 * Returns a string of tokenized lexemes.
	 *
	 * @param input is the string to be tokenized.
	 * @return Returns a formatted string representation of the list of tokens. The
	 *         string representation follows the one in the task description
	 */
	public static String tokenStream(String input) {
		// In case Task8Lexer is not defined correctly:
		// 1- If you modified the grammar in the g4 file, regenerate the ANTLR
		// recognizer to make sure that the latest grammar is generated
		// 2- Make sure that the location and the package are configured properly
		Task8Lexer lexer = new Task8Lexer(CharStreams.fromString(input));
		Vocabulary vocabulary = lexer.getVocabulary();
		List<? extends Token> tokens = lexer.getAllTokens();
		StringJoiner stringJoiner = new StringJoiner(";");
		for (Token token : tokens) {
			stringJoiner.add(token.getText() + "," + vocabulary.getSymbolicName(token.getType()));
		}
		return stringJoiner.toString();
	}

	@Test
	public void testString1() {
		assertEquals(
				"eLse,ELSE;(,LP;1883980.67647E91,NUM;<=,COMP;),RP;>,COMP;74025892e+9,NUM;),RP;JREGjEm,ID;ptp,ID;6508946300207.1,NUM;),RP;\"\\\"\\\\\",LIT;\"]\\\"\",LIT;==,COMP;\"\",LIT;==,COMP;(,LP;WCNPOdemD7T,ID;IF,IF;eLse,ELSE;ELse,ELSE;>=,COMP;mihSmXsTYWph,ID;<,COMP;\"]\\\\\",LIT;Else,ELSE;\":<\",LIT;748936.7415E-7,NUM;==,COMP;4330180805.920,NUM;),RP;ELSe,ELSE;),RP;elSE,ELSE;(,LP;(,LP;RAFGs1hLlohtT0,ID;664278295.6E+72690,NUM;\"|ji>3\",LIT;ELse,ELSE;sJ40,ID;65,NUM;1082866.1626e-395086445,NUM;>=,COMP;IF,IF;(,LP;!=,COMP;else,ELSE;),RP;<,COMP;elSE,ELSE;==,COMP;<=,COMP;),RP;elSE,ELSE;),RP;),RP;(,LP;elSe,ELSE;smT,ID;elSE,ELSE;elSE,ELSE;!=,COMP;\"Sc\\\\\",LIT;eLse,ELSE;MODHAQ3Lcgd6,ID;else,ELSE;uYi1ejd8vN,ID;eLsE,ELSE;If,IF;),RP;),RP;Else,ELSE;ElSe,ELSE;>=,COMP;ELsE,ELSE;\"3,MZ \",LIT;135997986.284,NUM;(,LP;(,LP;\"k\",LIT;(,LP;),RP;27565083700603.72,NUM;),RP;(,LP;if,IF;(,LP;JuuLqsE3YqG,ID;),RP;==,COMP;),RP;bZ,ID;If,IF;\"\\\\\",LIT;(,LP;ElsE,ELSE;<,COMP;PZbDwqjxbhMtWk5,ID;),RP;t2QL3Gq,ID;),RP;wmpIo4I,ID;ElSE,ELSE;\"\\\\\",LIT;==,COMP;else,ELSE;(,LP;eLse,ELSE;(,LP;4070315559509750.85,NUM;315306621.9,NUM;iF,IF;iF,IF;\"\\\\U9\\\\\",LIT;!=,COMP;euhVLK,ID;<=,COMP",
				tokenStream(
						"eLse( 1883980.67647E91 <=    )  >74025892e+9)JREGjEm     ptp  6508946300207.1)    \"\\\"\\\\\"      \"]\\\"\"      ==\"\"      ==      (     WCNPOdemD7T    IF    eLse     ELse>=  mihSmXsTYWph <\"]\\\\\"Else    \":<\"748936.7415E-7==4330180805.920      )   ELSe)elSE      ((RAFGs1hLlohtT0 664278295.6E+72690\"|ji>3\"  ELse  sJ40    65     1082866.1626e-395086445 >=    IF (  !=      else)<elSE    ==<=)elSE))(elSe   smT     elSE      elSE    !=   \"Sc\\\\\"    eLse   MODHAQ3Lcgd6   else   uYi1ejd8vN      eLsE   If)     )Else   ElSe>=ELsE      \"3,MZ \"135997986.284((\"k\"     ()   27565083700603.72    )(     if(      JuuLqsE3YqG)      ==)     bZ      If\"\\\\\"      (      ElsE     <  PZbDwqjxbhMtWk5)t2QL3Gq)  wmpIo4I      ElSE\"\\\\\"==  else (  eLse     (4070315559509750.85    315306621.9iF    iF\"\\\\U9\\\\\"    !=   euhVLK    <="));
	}

	@Test
	public void testString2() {
		assertEquals(
				"),RP;),RP;(,LP;!=,COMP;(,LP;if,IF;ElsE,ELSE;JYw2z,ID;==,COMP;==,COMP;ELSE,ELSE;ElSE,ELSE;cefcxbuq,ID;1E-10,NUM;\"~A~Y \",LIT;mGiFvdY,ID;ElsE,ELSE;jhbp84R3,ID;9923996,NUM;(,LP;(,LP;IF,IF;),RP;),RP;),RP;KZhNAJclQKI,ID;eLSe,ELSE;iF,IF;IF,IF;IF,IF;046515,NUM;elSE,ELSE;(,LP;!=,COMP;IF,IF;If,IF;<=,COMP;(,LP;6891889221842E8869,NUM;iF,IF;<=,COMP;321591e739454,NUM;==,COMP;q5BOKDYR38URbb,ID;!=,COMP;<=,COMP;If,IF;eLSE,ELSE;),RP;ELsE,ELSE;RnOboof,ID;7.03082278,NUM;\"Mp}v#\",LIT;\"\\\"4\",LIT;eLSE,ELSE;>,COMP;\"< %tyNU\",LIT;\"\\\"\\\"\",LIT;ElsE,ELSE;If,IF;\"y-~j`\",LIT;\"\\\\`\",LIT;iGXiD,ID;IF,IF;k9lgHI,ID;(,LP;),RP;),RP;4,NUM;!=,COMP;2150E+672,NUM;),RP;(,LP;(,LP;(,LP;!=,COMP;hvc,ID;\"\",LIT;a_,ID;ElsE,ELSE;),RP;07861273008554,NUM;yJaIgBe4Bw1t,ID;),RP;9258583601098505433.6,NUM;(,LP;iF,IF;),RP;>,COMP;),RP;If,IF;ELsE,ELSE;(,LP;15.22551070910,NUM;\"6($+Zc\",LIT;==,COMP;==,COMP;(,LP;),RP;129814153602.0224,NUM;else,ELSE;\"`\\\"\",LIT;9071330,NUM;if,IF;iF,IF;\"e0)J)2\",LIT;Else,ELSE;\"i\\\"Ly\",LIT;KTb,ID;IF,IF;Q7im,ID;iF,IF;if,IF;\"SapFuG\",LIT;Else,ELSE;8.7754969236643,NUM;(,LP;==,COMP;96321265e-3646,NUM",
				tokenStream(
						")) (!=(   if   ElsE    JYw2z   ==   ==  ELSE      ElSE   cefcxbuq     1E-10\"~A~Y \"mGiFvdY   ElsE jhbp84R3 9923996( (  IF)   ))    KZhNAJclQKI      eLSe      iF      IF      IF  046515   elSE(  !=     IF If  <=(6891889221842E8869iF<=321591e739454==q5BOKDYR38URbb!=<=If   eLSE)   ELsE      RnOboof   7.03082278     \"Mp}v#\"    \"\\\"4\"  eLSE>  \"< %tyNU\"   \"\\\"\\\"\"    ElsE   If\"y-~j`\"    \"\\\\`\"iGXiD IF k9lgHI () )4!=2150E+672)(    (  (!=hvc  \"\"   a_  ElsE)     07861273008554yJaIgBe4Bw1t     )      9258583601098505433.6    (iF)   >)    If     ELsE(15.22551070910\"6($+Zc\"====(     )    129814153602.0224else\"`\\\"\"9071330    if      iF\"e0)J)2\"    Else\"i\\\"Ly\"KTb  IF Q7im  iF   if \"SapFuG\"  Else      8.7754969236643     (   ==   96321265e-3646"));
	}

	@Test
	public void testString3() {
		assertEquals(
				"eLSE,ELSE;eLse,ELSE;),RP;\"s\\\\\\\"\",LIT;<,COMP;\"bA!\\\\hJ\",LIT;>,COMP;(,LP;18751932.2e4,NUM;),RP;),RP;(,LP;A0zBp_xpa_NolIr3C,ID;IF,IF;>,COMP;==,COMP;elsE,ELSE;<=,COMP;5950420.798E9,NUM;<,COMP;(,LP;322673.7,NUM;ElSe,ELSE;(,LP;>,COMP;ElsE,ELSE;else,ELSE;<,COMP;40081707,NUM;iF,IF;eLSe,ELSE;),RP;8117182.40E1,NUM;FoVgpf96SrvLFouOsFVZXU5AG,ID;if,IF;(,LP;(,LP;(,LP;),RP;\"\\\\\\\"\",LIT;),RP;>=,COMP;(,LP;),RP;e,ID;>=,COMP;<=,COMP;caOFOME,ID;IF,IF;else,ELSE;>=,COMP;8,NUM;!=,COMP;eLse,ELSE;\"n%$\\\"\\\\\",LIT;>,COMP;(,LP;(,LP;\"\\\"\",LIT;048891373203,NUM;\"9,dgIvMU\",LIT;<=,COMP;\"3LT.\",LIT;iF,IF;OUJ,ID;xAJbVSlAIDChUuiH_El,ID;(,LP;),RP;<,COMP;Else,ELSE;),RP;eLSE,ELSE;(,LP;5812598453262.40e6,NUM;Ho,ID;ElSe,ELSE;(,LP;elSe,ELSE;),RP;IF,IF;IF,IF;64269501678.6,NUM;u,ID;),RP;(,LP;),RP;NkcW,ID;78688134589730,NUM;eLSE,ELSE;059095730558,NUM;\"st_RMs/[\",LIT;Else,ELSE;if,IF;51162371444,NUM;!=,COMP;rNcFVD8i,ID;eLSe,ELSE;tudD4Dkwk4uj_336TN,ID;361085948376534,NUM;64303048101946608471521.4,NUM",
				tokenStream(
						"eLSE     eLse)    \"s\\\\\\\"\"     < \"bA!\\\\hJ\">    (18751932.2e4   )   )    (A0zBp_xpa_NolIr3C     IF   >    ==elsE<=     5950420.798E9     <(322673.7ElSe(>ElsE     else<40081707    iF     eLSe      )   8117182.40E1FoVgpf96SrvLFouOsFVZXU5AG     if (     ((     )    \"\\\\\\\"\"     )     >=   ()e>=<=   caOFOME    IF else>=8!=    eLse    \"n%$\\\"\\\\\">     ((      \"\\\"\"     048891373203 \"9,dgIvMU\"   <=      \"3LT.\"iF      OUJ    xAJbVSlAIDChUuiH_El()< Else)    eLSE   (5812598453262.40e6  Ho    ElSe   (    elSe      )IF IF    64269501678.6u)()NkcW  78688134589730eLSE    059095730558    \"st_RMs/[\"   Else    if   51162371444!=rNcFVD8i      eLSe   tudD4Dkwk4uj_336TN 361085948376534   64303048101946608471521.4"));
	}

	@Test
	public void testString4() {
		assertEquals(
				"<=,COMP;41269689,NUM;17987124,NUM;iF,IF;),RP;(,LP;ELse,ELSE;if,IF;==,COMP;ELsE,ELSE;(,LP;>=,COMP;),RP;ElsE,ELSE;iF,IF;),RP;\"\",LIT;If,IF;\"}C!`]Gl\",LIT;if,IF;D,ID;oJDVLlTpv56aLfcpMRir,ID;),RP;q8bfk5S2hbKlgjUmgI,ID;65292,NUM;mok8P,ID;97E+8903,NUM;),RP;(,LP;uayvHMb8,ID;I_RmCAr,ID;==,COMP;\"y(fcivfrK[\",LIT;8271854327.3e2231,NUM;kb45n,ID;<=,COMP;==,COMP;),RP;ELSE,ELSE;),RP;\"\\\\\\\"\",LIT;\":!eve6\",LIT;>,COMP;Cowaii_s,ID;iF,IF;xIO_n0,ID;cB2FLXoX,ID;elSE,ELSE;<=,COMP;uDLWhNQiz1ORxq,ID;6990662646567,NUM;==,COMP;\"\",LIT;(,LP;(,LP;eLsE,ELSE;TX,ID;(,LP;),RP;084782E7302388,NUM;!=,COMP;),RP;(,LP;UWKyaEVFTs,ID;\"+7&v;^k*$A\",LIT;4900.31113835,NUM;<,COMP;eLSE,ELSE;(,LP;\"\\\\\",LIT;dajtmW1rD1szmr,ID;_AX7xpo,ID;BlyR07DwkFwn,ID;!=,COMP;Uv8wnAo,ID;\"qY/Ra/\",LIT;eLSe,ELSE;),RP;If,IF;==,COMP;ELse,ELSE;agyqhlA0RBdOT,ID;\"zNa4'|e5\",LIT;(,LP;1638245054715E-528,NUM;4471e+64256,NUM;>=,COMP;==,COMP;if,IF;\"d\\\"\",LIT;45667377170,NUM;\"\\\\\",LIT",
				tokenStream(
						"<=  41269689 17987124iF  )(     ELse  if==      ELsE    (>=)  ElsE    iF   )    \"\"   If      \"}C!`]Gl\"if D    oJDVLlTpv56aLfcpMRir)    q8bfk5S2hbKlgjUmgI     65292  mok8P   97E+8903)(   uayvHMb8   I_RmCAr      ==  \"y(fcivfrK[\"8271854327.3e2231kb45n<===    )ELSE)      \"\\\\\\\"\"\":!eve6\"  >Cowaii_s iF      xIO_n0  cB2FLXoX elSE<=uDLWhNQiz1ORxq   6990662646567==   \"\"(   (eLsE    TX(  ) 084782E7302388!=    )   (UWKyaEVFTs      \"+7&v;^k*$A\"4900.31113835<eLSE (      \"\\\\\"     dajtmW1rD1szmr    _AX7xpo  BlyR07DwkFwn!=    Uv8wnAo\"qY/Ra/\"   eLSe      )  If==    ELse     agyqhlA0RBdOT\"zNa4'|e5\"(   1638245054715E-528    4471e+64256 >===   if    \"d\\\"\"45667377170   \"\\\\\""));
	}

	@Test
	public void testString5() {
		assertEquals(
				"40622.505518,NUM;\"!Vp-o2rM\",LIT;),RP;ELSE,ELSE;\"H$nl},z*t\",LIT;(,LP;),RP;G0FxQQ9PvQ39Y,ID;\"\",LIT;),RP;0349141,NUM;IzL9,ID;\"kI3S)J8f=\",LIT;bGDK647F,ID;IF,IF;!=,COMP;),RP;58719.92062141242,NUM;If,IF;ElsE,ELSE;elSE,ELSE;NNGpCV8u3,ID;),RP;eLSe,ELSE;),RP;\"8~(W?GHi\",LIT;\"iLV`&\",LIT;ObLtMm,ID;16.2400787504e17466402,NUM;(,LP;IF,IF;ElSe,ELSE;W67_C3CymU,ID;3533e49,NUM;),RP;\"E\\\"b\",LIT;\"|\",LIT;!=,COMP;>,COMP;hIptu_oOrxm,ID;(,LP;IF,IF;if,IF;),RP;\"J?^3\",LIT;),RP;\"|%XDvtC4*@\",LIT;elsE,ELSE;<,COMP;),RP;81066579,NUM;(,LP;82593551.445982,NUM;>=,COMP;elSe,ELSE;),RP;<=,COMP;),RP;ek0w_b3t4L,ID;801408944461770,NUM;>=,COMP;!=,COMP;(,LP;Cb6FB,ID;If,IF;\"lyfTJx=e\",LIT;iF,IF;!=,COMP;if,IF;\"RP)(K+2\",LIT;71,NUM;JlIvgjUr,ID;ELSE,ELSE;\"8VS'RNA`P\",LIT;584534497980,NUM;>=,COMP;Else,ELSE;32398057.8153,NUM;>,COMP;\"b@]xQ\\\"\",LIT;),RP;\"p\\\"|\\\\\",LIT;if,IF",
				tokenStream(
						"40622.505518\"!Vp-o2rM\")ELSE\"H$nl},z*t\"     (      )  G0FxQQ9PvQ39Y  \"\" )0349141 IzL9      \"kI3S)J8f=\"     bGDK647F      IF!=)      58719.92062141242If    ElsE elSE  NNGpCV8u3    )     eLSe)\"8~(W?GHi\"\"iLV`&\"  ObLtMm  16.2400787504e17466402 (IF     ElSe     W67_C3CymU     3533e49)  \"E\\\"b\"     \"|\"!= >hIptu_oOrxm (IF if)     \"J?^3\")  \"|%XDvtC4*@\" elsE< )81066579(82593551.445982>=elSe)<=)ek0w_b3t4L   801408944461770     >=!=( Cb6FB  If\"lyfTJx=e\"  iF   !=if     \"RP)(K+2\" 71   JlIvgjUr  ELSE    \"8VS'RNA`P\"584534497980   >=  Else      32398057.8153>     \"b@]xQ\\\"\")   \"p\\\"|\\\\\"      if"));
	}

	@Test
	public void testString6() {
		assertEquals(
				"(,LP;20066169,NUM;),RP;),RP;(,LP;If,IF;(,LP;),RP;40398,NUM;),RP;ElsE,ELSE;<=,COMP;epMYZ,ID;ZDSk,ID;(,LP;\"\\\"\\\"\",LIT;>,COMP;!=,COMP;IF,IF;If,IF;(,LP;),RP;),RP;),RP;6753123.7703451E102,NUM;\"vt9 \\\"R\",LIT;eLSe,ELSE;\"\\\\\",LIT;54347864868511940.491493,NUM;(,LP;if,IF;),RP;001475192.60,NUM;iF,IF;iF,IF;72E-3,NUM;\"~KC\\\\\\\"\",LIT;eLSE,ELSE;eLSe,ELSE;If,IF;d_MJ3,ID;),RP;ElsE,ELSE;IF,IF;\"r*\\\\\\\"\",LIT;Lp9Bb2ka5,ID;yzL0oSGrHwb9q6m5,ID;16888754e+7239,NUM;41447763893403572594657,NUM;==,COMP;(,LP;\"\",LIT;iF,IF;If,IF;),RP;If,IF;SOyS4OFJVWQgvFU56cc,ID;iF,IF;(,LP;>=,COMP;iF,IF;ELSE,ELSE;06323902915894E5,NUM;),RP;24443E8435730,NUM;08402,NUM;),RP;\"[]\",LIT;63898,NUM;If,IF;if,IF;==,COMP;\"\\\\\",LIT;!=,COMP;ELSe,ELSE;8925.80356301e+5,NUM;566E-50287,NUM;TZGsjKRkn8vDeP3i,ID;128e764,NUM;eLSE,ELSE;tofzSsCjZZxUdZA,ID;(,LP;),RP;(,LP;iF,IF;70116932796014537,NUM;\"C=Kd}&C\",LIT;ELse,ELSE;(,LP;_iJrG1p,ID;ElSE,ELSE;40881888987862,NUM;If,IF;ELSe,ELSE;74347034.55,NUM;\"i\\\\\",LIT;ELse,ELSE;),RP;!=,COMP;ElsE,ELSE",
				tokenStream(
						"(   20066169)     )      (If( )40398 )ElsE<=epMYZ     ZDSk( \"\\\"\\\"\">!=  IF      If   (     ))     )6753123.7703451E102    \"vt9 \\\"R\"eLSe  \"\\\\\"54347864868511940.491493   (if)   001475192.60 iF  iF 72E-3\"~KC\\\\\\\"\" eLSE    eLSe     If     d_MJ3)ElsE   IF   \"r*\\\\\\\"\"Lp9Bb2ka5      yzL0oSGrHwb9q6m5    16888754e+7239      41447763893403572594657  ==     (  \"\"     iF If    )If SOyS4OFJVWQgvFU56cc      iF(>=    iF   ELSE  06323902915894E5   )      24443E8435730      08402     )\"[]\"  63898    If    if   ==\"\\\\\"!=   ELSe      8925.80356301e+5      566E-50287 TZGsjKRkn8vDeP3i     128e764eLSE     tofzSsCjZZxUdZA()  (   iF   70116932796014537\"C=Kd}&C\"ELse( _iJrG1p    ElSE   40881888987862      If ELSe  74347034.55    \"i\\\\\"     ELse)!=ElsE"));
	}

	@Test
	public void testString7() {
		assertEquals(
				"GRj4oztJbf0mF5rQny,ID;eLSE,ELSE;),RP;IF,IF;),RP;(,LP;),RP;),RP;else,ELSE;79761999901819758213,NUM;\"\\\"\",LIT;),RP;044946624445,NUM;If,IF;\"2nrp,h\",LIT;uMKRZcZp4u,ID;),RP;1876168647814,NUM;iF,IF;If,IF;IF,IF;41.4786905773768,NUM;IF,IF;<,COMP;978810366113294967,NUM;092,NUM;\"EElE\\\\\",LIT;(,LP;),RP;),RP;5,NUM;161473129188046.982,NUM;\"t>z)&7^gAXK\",LIT;1161E-2148270573964,NUM;),RP;elSe,ELSE;9329850456.319853623,NUM;89,NUM;),RP;eLsE,ELSE;if,IF;Else,ELSE;elsE,ELSE;\"S|O<i<C)L\",LIT;(,LP;(,LP;2.492160027,NUM;),RP;173028e3,NUM;==,COMP;),RP;\"/]SnEp\",LIT;),RP;P2UCuDxt4dnp,ID;),RP;>=,COMP;<=,COMP;If,IF;\"6t?[c)2A_\",LIT;8815445661669912084,NUM;),RP;),RP;\"\\\"\",LIT;49470729775074608E056854,NUM;eLSe,ELSE;\"Z]CXB#\",LIT;gf2ZRdxFEcw,ID;(,LP;ElSE,ELSE;317723.20266E0,NUM;246066310629718864e4,NUM;HBx1K,ID;(,LP;E7O3zvnCR7lZ4768s,ID;(,LP;if,IF;5e035097075,NUM;(,LP;r2,ID;IF,IF",
				tokenStream(
						"GRj4oztJbf0mF5rQny  eLSE     )  IF)      () )else    79761999901819758213\"\\\"\"   )044946624445  If\"2nrp,h\"uMKRZcZp4u)1876168647814iF      If   IF   41.4786905773768IF<      978810366113294967      092\"EElE\\\\\"   (   )   )    5   161473129188046.982\"t>z)&7^gAXK\" 1161E-2148270573964)elSe   9329850456.319853623 89     )eLsE     if      Else elsE     \"S|O<i<C)L\"(     (2.492160027  )173028e3==)    \"/]SnEp\"   )P2UCuDxt4dnp)  >=<=    If\"6t?[c)2A_\"   8815445661669912084     )    )\"\\\"\"49470729775074608E056854  eLSe  \"Z]CXB#\"gf2ZRdxFEcw (ElSE     317723.20266E0  246066310629718864e4      HBx1K    (E7O3zvnCR7lZ4768s     (if    5e035097075 (r2    IF"));
	}

	@Test
	public void testString8() {
		assertEquals(
				"),RP;(,LP;(,LP;lpQ4Uz,ID;(,LP;_H5tNwVp,ID;80822228931.945,NUM;==,COMP;eLsE,ELSE;\"p=ZR?n;\",LIT;Else,ELSE;!=,COMP;),RP;),RP;elSe,ELSE;\"i^}D\\\\\\\"\",LIT;if,IF;(,LP;\".F`Zs\",LIT;>,COMP;(,LP;!=,COMP;if,IF;),RP;524,NUM;),RP;68827.0,NUM;If,IF;if,IF;IF,IF;ELSe,ELSE;If,IF;<=,COMP;ElSE,ELSE;(,LP;(,LP;>=,COMP;),RP;),RP;sjj2OvWFvTKDBA_D_,ID;ELsE,ELSE;\"g.+.\\\\\",LIT;zDCJ1kvT,ID;>,COMP;(,LP;iF,IF;98688892810,NUM;>=,COMP;654166,NUM;If,IF;ElsE,ELSE;\"_'~n\\\"\",LIT;(,LP;\".4{S%\",LIT;\"U-\\\\\",LIT;Ei1fhKTPx5YxOP7t,ID;iTq5zrWqyYbPWeaUzNuMRk,ID;),RP;==,COMP;\"u|Q{\",LIT;eLse,ELSE;p0z,ID;001374357982739,NUM;1.38,NUM;ELsE,ELSE;CyQR_EmVnd8lXu,ID;),RP;2584924905315360.6e+150,NUM;),RP;If,IF;ElSe,ELSE;\"Dt+UUm82DP6\",LIT;A2FljiFf5yw9kz,ID;),RP;18236,NUM;DAj,ID;baAZ6D7tUna8ejlKv4,ID;(,LP;b7zVJ,ID;(,LP;73413827.3391863206,NUM;YCW1D1dEbTcQ,ID;Fs,ID;If,IF;\"R %IvG{$\",LIT;\"\\\\\\\\\",LIT;eLSe,ELSE;(,LP;if,IF;>,COMP;(,LP;If,IF;>,COMP;CsehxhTintVT,ID;OXLtC7oZDYKZ,ID;),RP;0039736217.275713,NUM;eLSE,ELSE;(,LP;ElSE,ELSE",
				tokenStream(
						")( (lpQ4Uz(_H5tNwVp    80822228931.945==eLsE\"p=ZR?n;\"    Else     !=))elSe\"i^}D\\\\\\\"\"   if(\".F`Zs\"> (!=if   )524)     68827.0If  if   IF      ELSe    If<=    ElSE((      >=)     )  sjj2OvWFvTKDBA_D_    ELsE\"g.+.\\\\\"     zDCJ1kvT>     (iF    98688892810    >=    654166If      ElsE   \"_'~n\\\"\"     (\".4{S%\"   \"U-\\\\\"      Ei1fhKTPx5YxOP7t     iTq5zrWqyYbPWeaUzNuMRk)==   \"u|Q{\"      eLse    p0z    001374357982739      1.38      ELsE      CyQR_EmVnd8lXu)      2584924905315360.6e+150    )If      ElSe\"Dt+UUm82DP6\"A2FljiFf5yw9kz    )18236DAj     baAZ6D7tUna8ejlKv4    (    b7zVJ   (73413827.3391863206YCW1D1dEbTcQ      Fs      If\"R %IvG{$\"\"\\\\\\\\\"    eLSe(  if      >      (If      >CsehxhTintVT      OXLtC7oZDYKZ     )    0039736217.275713 eLSE(ElSE"));
	}

	@Test
	public void testString9() {
		assertEquals(
				"(,LP;67268410420,NUM;),RP;99173141169,NUM;5527038.455,NUM;!=,COMP;IF,IF;29e-268468,NUM;==,COMP;elsE,ELSE;0494e5,NUM;4e-29173491503,NUM;),RP;66791296690079108.7710861,NUM;iF,IF;If,IF;elsE,ELSE;\":&\\\"\",LIT;\"Aa~v\\\"\",LIT;\"I;\\\"\",LIT;>=,COMP;ELse,ELSE;if,IF;\"~.c[25z:\",LIT;),RP;If,IF;elsE,ELSE;elSe,ELSE;mRonYTjRpILZPn,ID;\"\\\\\",LIT;\"\\\\\",LIT;iF,IF;),RP;\"x!;\",LIT;(,LP;IF,IF;hIpJq,ID;\"c$j#\\\"\",LIT;eLSE,ELSE;\"+))<4r%|\",LIT;if,IF;101.838791269E7941060,NUM;eLSe,ELSE;B_cLiRbjTE,ID;),RP;Jf8UPLUFzz,ID;),RP;),RP;),RP;\"\\\\\\\\/w\\\"\",LIT;78422395140125.30,NUM;<=,COMP;121473054619828,NUM;),RP;),RP;\"P>\",LIT;!=,COMP;07528092574389815699.496,NUM;_8Waxgq0pcF,ID;<=,COMP;h,ID;\"8\\\\\\\"\",LIT;Else,ELSE;elsE,ELSE;ELSE,ELSE;ELSE,ELSE;iF,IF;0E27098,NUM;),RP;),RP;else,ELSE;(,LP;),RP;7565677323.17,NUM;\"\\\"\\\\\",LIT;==,COMP;if,IF;(,LP;==,COMP;If,IF;!=,COMP;IF,IF;(,LP;775,NUM;!=,COMP;>,COMP;DSyFr,ID;QoWUSR0eU75ix,ID;\"\\\\\\\"\\\\\",LIT;12450209293560977323,NUM;(,LP;iF,IF;eLSe,ELSE;\"'?0F-?%_0`FV_\",LIT;414032.97629E1,NUM;462373441.7,NUM;if,IF;zVHGxFW9Atel,ID;eLSe,ELSE;),RP;elsE,ELSE",
				tokenStream(
						"(     67268410420)99173141169      5527038.455     !=IF 29e-268468==elsE     0494e5     4e-29173491503)  66791296690079108.7710861iF   If      elsE     \":&\\\"\"    \"Aa~v\\\"\"      \"I;\\\"\">=ELse   if\"~.c[25z:\"   ) If     elsE elSe   mRonYTjRpILZPn\"\\\\\"     \"\\\\\"iF)\"x!;\"  (  IF     hIpJq  \"c$j#\\\"\"eLSE \"+))<4r%|\"if      101.838791269E7941060  eLSe B_cLiRbjTE)Jf8UPLUFzz)      ))\"\\\\\\\\/w\\\"\"   78422395140125.30   <= 121473054619828     ))\"P>\"!=  07528092574389815699.496_8Waxgq0pcF  <= h  \"8\\\\\\\"\"Else   elsE ELSE  ELSE      iF      0E27098))     else(     )    7565677323.17   \"\\\"\\\\\"  ==if (   ==If!= IF(775!=      >     DSyFr     QoWUSR0eU75ix\"\\\\\\\"\\\\\"12450209293560977323      (iF   eLSe     \"'?0F-?%_0`FV_\"414032.97629E1   462373441.7if     zVHGxFW9Atel   eLSe)elsE"));
	}

	@Test
	public void testString10() {
		assertEquals(
				"),RP;\"}^E8\",LIT;\"JgR\",LIT;(,LP;),RP;iF,IF;if,IF;),RP;ELse,ELSE;\"\\\"\",LIT;>,COMP;),RP;IF,IF;Else,ELSE;IF,IF;ELse,ELSE;63228782321e09,NUM;96358.2585e540,NUM;(,LP;elSe,ELSE;\"Jl|Ou\",LIT;\"\\\"&\",LIT;(,LP;elsE,ELSE;\"lx !Z\",LIT;829,NUM;),RP;(,LP;8212750.94186679,NUM;2197.3271424,NUM;(,LP;elsE,ELSE;\"(V;;s\",LIT;if,IF;),RP;ElsE,ELSE;iF,IF;\"4SCdPQV\",LIT;\"mG`z{\\\\\",LIT;<=,COMP;<,COMP;If,IF;(,LP;),RP;If,IF;(,LP;0130390676.4,NUM;If,IF;fDU,ID;!=,COMP;),RP;),RP;eLsE,ELSE;!=,COMP;\"a8__;S^\",LIT;),RP;IF,IF;(,LP;\"a\",LIT;else,ELSE;),RP;),RP;3115636258e-4068355,NUM;==,COMP;),RP;(,LP;),RP;iF,IF;xNgvP,ID;(,LP;!=,COMP;A5k5snmh,ID;),RP;eLSe,ELSE;),RP;\"\",LIT;Ko5_4OpZ1jZPE20,ID;(,LP;else,ELSE;(,LP;bfftxmCnao,ID;eLsE,ELSE;\"\\\\A\\\\J\",LIT;!=,COMP;ZTaU6pkeadq,ID;),RP;2459.23025,NUM;\"\",LIT;G,ID;UsVhCwGFrraTl,ID;>=,COMP;if,IF;383.25642,NUM;IF,IF;8543977296510243063203,NUM;<,COMP;),RP;\"[,[$ @\",LIT;>,COMP",
				tokenStream(
						")  \"}^E8\"\"JgR\"()    iF  if)  ELse  \"\\\"\">     )  IF      Else IF  ELse     63228782321e09   96358.2585e540(elSe\"Jl|Ou\"\"\\\"&\"  (  elsE  \"lx !Z\"  829)(8212750.94186679  2197.3271424  (elsE   \"(V;;s\"     if   )ElsE     iF  \"4SCdPQV\"\"mG`z{\\\\\"    <=      <      If()If(0130390676.4 If      fDU!=)   )eLsE    !=     \"a8__;S^\")IF(\"a\"   else)) 3115636258e-4068355     ==  )   ( ) iF   xNgvP(     !=A5k5snmh    )eLSe     )      \"\"Ko5_4OpZ1jZPE20(else(     bfftxmCnao eLsE\"\\\\A\\\\J\"!=   ZTaU6pkeadq)2459.23025\"\"G    UsVhCwGFrraTl>=if  383.25642IF   8543977296510243063203<      )    \"[,[$ @\"   >"));
	}

}