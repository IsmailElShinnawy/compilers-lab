package csen1002.tests.task8;

import static org.junit.jupiter.api.Assertions.*;

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
public class Task8TestsBatch7 {
	
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
		assertEquals("iF,IF;UTlGg0MVfe6ictEV6,ID;fssyBnQCKlSZQ,ID;If,IF;\"\\\"\",LIT;ELSE,ELSE;elSE,ELSE;!=,COMP;If,IF;>,COMP;ELSe,ELSE;\"%zicF\",LIT;eLSE,ELSE;==,COMP;ElSE,ELSE;(,LP;28495574497.3E278,NUM;\"\\\"%\\\\\",LIT;),RP;(,LP;),RP;\"0lr=;fRTv\",LIT;15018211398,NUM;Else,ELSE;170088330993915202153,NUM;\"-\",LIT;),RP;\"\\\\\",LIT;\"Ac?\",LIT;If,IF;(,LP;iF,IF;if,IF;8623039068,NUM;!=,COMP;8,NUM;else,ELSE;Kl3x3C665cyp0v4,ID;Fu5,ID;\"Z\",LIT;>,COMP;iF,IF;(,LP;14280055483.42,NUM;(,LP;Else,ELSE;35854092366730E3,NUM;>,COMP;\"mfZ=GG)g''\",LIT;KhwawMvKcQI3z,ID;PY5ormwNIEAxyY5IvG,ID;IF,IF;ELse,ELSE;Y0focJlX6oA,ID;IF,IF;\"Q!\\\"\\\\\",LIT;(,LP;42578238729329.9E92,NUM;JjCTMxDz9,ID;\"$OocWX\",LIT;!=,COMP;If,IF;if,IF;(,LP;IF,IF;!=,COMP;Ly2y,ID;if,IF;\"s`\",LIT;>,COMP;\"S?@\",LIT;<,COMP;),RP;89692.78,NUM;),RP;),RP;!=,COMP;WodTkFnEyuEtf1HHAVKFPL358,ID;if,IF;Vvx1GGKpKE,ID;\"@*\\\\\",LIT", tokenStream("iF    UTlGg0MVfe6ictEV6 fssyBnQCKlSZQ If   \"\\\"\"ELSE    elSE     !=If   >    ELSe   \"%zicF\"eLSE     ==ElSE (28495574497.3E278\"\\\"%\\\\\"  )  ()\"0lr=;fRTv\"    15018211398Else   170088330993915202153      \"-\" )\"\\\\\"\"Ac?\"If(iF     if 8623039068!=8else      Kl3x3C665cyp0v4   Fu5\"Z\"   >    iF(    14280055483.42(Else     35854092366730E3    >  \"mfZ=GG)g''\"      KhwawMvKcQI3z    PY5ormwNIEAxyY5IvG      IF     ELse  Y0focJlX6oA   IF   \"Q!\\\"\\\\\"(42578238729329.9E92     JjCTMxDz9      \"$OocWX\"!= If   if( IF      !=Ly2y   if     \"s`\"     >\"S?@\"<)89692.78  )    )!=  WodTkFnEyuEtf1HHAVKFPL358    if      Vvx1GGKpKE  \"@*\\\\\""));
	}

	@Test
	public void testString2() {
		assertEquals("(,LP;),RP;6843653949797.296,NUM;==,COMP;!=,COMP;eLSe,ELSE;),RP;\"Le`9e\",LIT;(,LP;If,IF;\"X!y\\\\\\\"\",LIT;bp,ID;elsE,ELSE;\"o\\\"}'\",LIT;if,IF;ryhO4wAMi,ID;If,IF;ElSE,ELSE;eLSe,ELSE;31933054.4E-9602147890,NUM;k8RVH8vp,ID;elsE,ELSE;jgqkhPkTcz3sgU9lCOM7SB,ID;iF,IF;qPEpyTEVMCP1,ID;(,LP;Else,ELSE;ElSE,ELSE;UH,ID;S4PRflDEjErP,ID;iE1QaI0,ID;tpQ1St56O7h,ID;),RP;),RP;543406E368608547,NUM;If,IF;eLsE,ELSE;ELse,ELSE;),RP;elSe,ELSE;Else,ELSE;(,LP;J_4YH,ID;>,COMP;984061e41,NUM;\"V[+F\\\"\",LIT;tmlREjgt,ID;\"R\",LIT;187205578726,NUM;eLSE,ELSE;else,ELSE;\"\\\"|\",LIT;KMNCYuRZ,ID;ElSe,ELSE;vfmg,ID;eLsE,ELSE;\"j^q\",LIT;ZN,ID;ElSE,ELSE;227.89864,NUM;else,ELSE;fQqHsAUKTyVm,ID;if,IF;else,ELSE;<,COMP;),RP;\"H)N\\\"\",LIT;),RP;\"D[1I.`\",LIT;if,IF;547,NUM;CIkHaJb,ID;),RP;If,IF;==,COMP;3954554742358.11,NUM;8538820E170849,NUM;),RP;<,COMP;(,LP;442.8337,NUM;>=,COMP;HDdKilujjjfvj0,ID;==,COMP;32439490365.77493,NUM;==,COMP;biy,ID;!=,COMP;),RP", tokenStream("()6843653949797.296==!=   eLSe)     \"Le`9e\"(If \"X!y\\\\\\\"\"bp     elsE\"o\\\"}'\" if ryhO4wAMi     If      ElSE    eLSe    31933054.4E-9602147890k8RVH8vp     elsE jgqkhPkTcz3sgU9lCOM7SB      iF    qPEpyTEVMCP1( Else  ElSE      UH     S4PRflDEjErP    iE1QaI0  tpQ1St56O7h))     543406E368608547If      eLsE   ELse   )      elSe Else  (J_4YH  >    984061e41    \"V[+F\\\"\" tmlREjgt\"R\"187205578726 eLSE    else\"\\\"|\"  KMNCYuRZ    ElSe vfmg  eLsE\"j^q\"      ZN ElSE  227.89864   else   fQqHsAUKTyVm     if  else      <  )\"H)N\\\"\"     )     \"D[1I.`\"     if      547CIkHaJb    )If   ==    3954554742358.11      8538820E170849      )<    (     442.8337      >= HDdKilujjjfvj0   ==     32439490365.77493      ==     biy!=)"));
	}

	@Test
	public void testString3() {
		assertEquals("!=,COMP;\":\\\\5\",LIT;>=,COMP;\"wIpz\",LIT;(,LP;8119,NUM;(,LP;2,NUM;\"2]5OI7\",LIT;),RP;(,LP;508371691.55109,NUM;),RP;\"\\\"\\\\J\",LIT;\"<~\",LIT;\"\\\"e\",LIT;If,IF;If,IF;\"_\\\\\",LIT;D9aW,ID;\"nT1&A:\",LIT;\"6\",LIT;tkb6OksdQLR,ID;wCq17P94qix,ID;),RP;>,COMP;!=,COMP;(,LP;\"L0>@0M\",LIT;oSc8Och0bdMt,ID;ELsE,ELSE;07114,NUM;iF,IF;if,IF;!=,COMP;IF,IF;728925408922.9,NUM;31430528723e-9,NUM;IF,IF;(,LP;<,COMP;!=,COMP;(,LP;),RP;732406437,NUM;>,COMP;55E8962,NUM;(,LP;>=,COMP;\"h`N47Q!*j\",LIT;if,IF;IF,IF;iF,IF;\"H\",LIT;(,LP;),RP;),RP;29099728751.0,NUM;ALzXG551ugGay,ID;\"m\\\"\",LIT;(,LP;\"=6nAT=\",LIT;<,COMP;ELSe,ELSE;mxuqKY2KNBW,ID;<,COMP;if,IF;),RP;\"\\\"\\\"\\\\\",LIT;(,LP;(,LP;<=,COMP;==,COMP;),RP;\"(\\\\\",LIT;),RP;\"ky7-+h{\",LIT;ELSE,ELSE;10659106.571533548,NUM;509624948197848,NUM;ELSe,ELSE;\"o\",LIT;\"7\\\\\",LIT;172634E746320093,NUM;(,LP;),RP;(,LP;kk7NlYK,ID;),RP;0384873480507.3762,NUM;(,LP;\"1M(W)6I\",LIT;>=,COMP;),RP;80.536654617459,NUM;if,IF;(,LP;abuFELTsLB,ID;\"v4B<x'L]lh\",LIT;IF,IF;<,COMP", tokenStream("!=  \":\\\\5\">=\"wIpz\"      (8119 (   2\"2]5OI7\")      (  508371691.55109)\"\\\"\\\\J\"\"<~\"\"\\\"e\"If      If\"_\\\\\"  D9aW\"nT1&A:\"  \"6\"   tkb6OksdQLR    wCq17P94qix )>    !=   ( \"L0>@0M\"oSc8Och0bdMt      ELsE     07114iF      if   !=IF      728925408922.9   31430528723e-9     IF     (   <      !=   ()    732406437>55E8962 (>=   \"h`N47Q!*j\"if  IF    iF      \"H\"()) 29099728751.0ALzXG551ugGay\"m\\\"\"  (\"=6nAT=\"    <ELSe  mxuqKY2KNBW<      if)\"\\\"\\\"\\\\\"(      (<=   ==      )   \"(\\\\\" )    \"ky7-+h{\"  ELSE  10659106.571533548   509624948197848ELSe   \"o\"\"7\\\\\"172634E746320093()(kk7NlYK)     0384873480507.3762(\"1M(W)6I\">=    )      80.536654617459if      (abuFELTsLB    \"v4B<x'L]lh\"IF <"));
	}

	@Test
	public void testString4() {
		assertEquals("==,COMP;(,LP;ELse,ELSE;IF,IF;If,IF;\"gg{Xz\",LIT;IF,IF;),RP;\"&\",LIT;elSE,ELSE;IF,IF;\"\\\\\",LIT;\"xu#v?@\",LIT;>,COMP;<=,COMP;==,COMP;!=,COMP;\"bUfE\\\"\",LIT;3569379963983.89,NUM;>=,COMP;89930070E1822019,NUM;ELSE,ELSE;(,LP;eLse,ELSE;182.951634,NUM;else,ELSE;zZBMK,ID;ElSE,ELSE;Else,ELSE;(,LP;if,IF;(,LP;SWm4CErR0W2,ID;(,LP;),RP;==,COMP;),RP;\"vC4*IN/\",LIT;HUzWA,ID;<=,COMP;(,LP;iF,IF;),RP;If,IF;(,LP;\"u\\\"\",LIT;672605233141044320108245.9,NUM;ELSe,ELSE;ElSE,ELSE;iF,IF;(,LP;eLsE,ELSE;IF,IF;iF,IF;63378120276749151884e8,NUM;Else,ELSE;Else,ELSE;342071E+5838,NUM;==,COMP;(,LP;\"[O)\\\\\\\\\",LIT;<,COMP;),RP;eLse,ELSE;ElsE,ELSE;TR1UcSHuGBF,ID;991398232.0,NUM;\"\",LIT;!=,COMP;If,IF;\"eW Lw\",LIT;==,COMP;(,LP;!=,COMP;IF,IF;95273499342e-1834,NUM;xctDTmYjB,ID;4797475566145,NUM;1703135738157.476,NUM;==,COMP;6494276.1e2,NUM;(,LP;>=,COMP;),RP;(,LP;285353456,NUM;elsE,ELSE;\"%OZz>~`\",LIT;==,COMP;eLSe,ELSE;(,LP;(,LP;),RP;192278466835693832,NUM;),RP;),RP;dUcZ,ID;!=,COMP;\"BFc\",LIT;eLSe,ELSE;89208777e446,NUM;(,LP;IF,IF;15164e+93731,NUM;>,COMP;h,ID;(,LP;),RP;(,LP", tokenStream("==(ELse   IF If \"gg{Xz\"IF)\"&\"      elSE    IF   \"\\\\\"\"xu#v?@\"   >     <===!=  \"bUfE\\\"\"    3569379963983.89      >=89930070E1822019ELSE    (  eLse    182.951634      else  zZBMK     ElSE     Else(   if (      SWm4CErR0W2   ()     ==   ) \"vC4*IN/\"     HUzWA<=  (iF )If   (\"u\\\"\"  672605233141044320108245.9ELSe     ElSE     iF   (eLsE    IF      iF 63378120276749151884e8 Else     Else     342071E+5838==( \"[O)\\\\\\\\\"   < )   eLse     ElsE TR1UcSHuGBF   991398232.0   \"\"!=      If\"eW Lw\"    ==   (!=      IF     95273499342e-1834xctDTmYjB    4797475566145    1703135738157.476==      6494276.1e2      (>=   )(   285353456    elsE     \"%OZz>~`\" ==   eLSe(    ()  192278466835693832)    )dUcZ!=\"BFc\"      eLSe   89208777e446  (      IF     15164e+93731>   h  (      )("));
	}

	@Test
	public void testString5() {
		assertEquals("ELsE,ELSE;if,IF;(,LP;ELse,ELSE;),RP;\"VS\",LIT;!=,COMP;ElSe,ELSE;ElSe,ELSE;>,COMP;(,LP;if,IF;QMeCyAaH78,ID;),RP;elSE,ELSE;23443070,NUM;(,LP;iF,IF;92e-3064,NUM;!=,COMP;if,IF;(,LP;\",\\\\\",LIT;!=,COMP;FrJ_bL,ID;Else,ELSE;FGEAAusa0,ID;48463149400.604e3,NUM;==,COMP;),RP;2699579.6E0833,NUM;),RP;(,LP;iF,IF;),RP;>,COMP;247422330334703347,NUM;IZfF,ID;xS5,ID;\"(3t@83\",LIT;ELsE,ELSE;(,LP;),RP;\"\\\"X\\\\\",LIT;If,IF;(,LP;k0o,ID;<,COMP;765.3933e0378588,NUM;eLSe,ELSE;\"N[\",LIT;<,COMP;984215,NUM;<,COMP;IF,IF;mGGaoWQvR1lmiT62,ID;8329992302582.3,NUM;(,LP;(,LP;GzohN,ID;If,IF;<,COMP;\"1\\\"\",LIT;57024279906,NUM;!=,COMP;489675e+133213885,NUM;\"J\",LIT;\"\",LIT;s5MwtXIrnlQcT,ID;eLSe,ELSE;(,LP;<=,COMP;(,LP;eLse,ELSE;IF,IF;),RP;(,LP;(,LP;9532807194780,NUM;6260684.86974186,NUM;),RP;DQV2ui,ID;(,LP;XQu2mn_56KCAkBhorrO,ID;),RP;goJzqTMqrEO,ID;bgZrrd,ID;elSE,ELSE;A19uR_9FWfYjA1,ID;iF,IF;(,LP;\"`NBPFJ\",LIT;if,IF;\"+%}Z\",LIT;==,COMP;),RP;ElsE,ELSE;IF,IF;),RP;ElSe,ELSE;eLse,ELSE;(,LP;==,COMP;If,IF;IF,IF;If,IF;),RP;(,LP;\"o&x\\\"\",LIT;4.51078174e8,NUM;),RP;iF,IF;),RP;eLSE,ELSE;(,LP;==,COMP;j6xMIJZQaN,ID;),RP", tokenStream("ELsE     if (     ELse)      \"VS\"     !=   ElSe   ElSe    >    (      if  QMeCyAaH78      ) elSE    23443070  (iF    92e-3064!=if( \",\\\\\"!=  FrJ_bL      Else      FGEAAusa0    48463149400.604e3     ==      ) 2699579.6E0833)     (      iF   )    >247422330334703347   IZfF  xS5    \"(3t@83\"ELsE      (      )      \"\\\"X\\\\\"If(k0o<   765.3933e0378588eLSe\"N[\"<984215     <IF     mGGaoWQvR1lmiT62      8329992302582.3(   (GzohN      If<\"1\\\"\"  57024279906    !=489675e+133213885\"J\"      \"\"  s5MwtXIrnlQcT  eLSe(<=    (eLse    IF  )(     (9532807194780    6260684.86974186)      DQV2ui   (XQu2mn_56KCAkBhorrO)    goJzqTMqrEO      bgZrrd     elSE     A19uR_9FWfYjA1 iF(      \"`NBPFJ\"   if   \"+%}Z\"==)ElsE      IF     )      ElSe     eLse(    ==If    IF      If      )      (\"o&x\\\"\"4.51078174e8)  iF) eLSE(== j6xMIJZQaN )"));
	}

	@Test
	public void testString6() {
		assertEquals(">,COMP;(,LP;\"Sy\\\\\",LIT;(,LP;),RP;If,IF;),RP;),RP;E,ID;),RP;>,COMP;55,NUM;s4aJrvHvTBdqAzdL,ID;>=,COMP;ELSe,ELSE;ELsE,ELSE;iF,IF;eLSe,ELSE;If,IF;),RP;SzAce,ID;!=,COMP;\"A[tSr+mT\",LIT;(,LP;elSE,ELSE;(,LP;ELsE,ELSE;\"\\\"\",LIT;Else,ELSE;\"\",LIT;<=,COMP;YBdExrlEx,ID;(,LP;<,COMP;\"Q!w/}.s#^}\",LIT;If,IF;>=,COMP;\"E(=~:J\",LIT;\"$.4<Ka\",LIT;s7w,ID;N,ID;544864313768,NUM;If,IF;iF,IF;(,LP;),RP;If,IF;3244E+7,NUM;280442842,NUM;eLSe,ELSE;<=,COMP;qhEZPAc9DIQMrk,ID;SwCYC1tmaddcWBo7w,ID;),RP;zuWDR0a,ID;6967675649333e0783,NUM;ELSE,ELSE;eLSe,ELSE;==,COMP;eLSE,ELSE;ELSe,ELSE;),RP;TQXn,ID;\"SXI\\\"\",LIT;ELSe,ELSE;eLSe,ELSE;\"gp;,Z\",LIT;FgQ,ID;),RP;iF,IF;\"j4ypa}\",LIT;<=,COMP;68386473101359.0,NUM;elSe,ELSE;ELse,ELSE;iF,IF;),RP;29348517,NUM;\"\\\\\\\"\",LIT;!=,COMP;354386672.4E-03039,NUM;K2j,ID;9320390385e86,NUM;eLsE,ELSE;if,IF;ELSE,ELSE;\"\",LIT;8579.08922880644,NUM;(,LP;),RP;\"~\\\"_P\",LIT", tokenStream(">(      \"Sy\\\\\"    ()If ))  E)>     55      s4aJrvHvTBdqAzdL      >=ELSe  ELsE iF     eLSe    If)SzAce!=    \"A[tSr+mT\"(elSE(ELsE    \"\\\"\"      Else   \"\"<=   YBdExrlEx(<     \"Q!w/}.s#^}\"If>=\"E(=~:J\" \"$.4<Ka\"s7w  N    544864313768If iF()   If   3244E+7    280442842     eLSe   <=qhEZPAc9DIQMrk  SwCYC1tmaddcWBo7w )zuWDR0a  6967675649333e0783ELSE     eLSe==  eLSE ELSe     )TQXn    \"SXI\\\"\"ELSe  eLSe\"gp;,Z\"FgQ)iF \"j4ypa}\"<=68386473101359.0elSe     ELse    iF     )   29348517 \"\\\\\\\"\"    !=  354386672.4E-03039K2j   9320390385e86eLsE     if    ELSE\"\"      8579.08922880644(  )\"~\\\"_P\""));
	}

	@Test
	public void testString7() {
		assertEquals("),RP;eLse,ELSE;MDavBzDPHv0,ID;672400,NUM;iF,IF;(,LP;ElSE,ELSE;(,LP;<=,COMP;(,LP;ELSe,ELSE;),RP;if,IF;562745e2677615541,NUM;283e+1,NUM;),RP;CzwPw_z8JuHdUp,ID;),RP;\"i)h\",LIT;),RP;),RP;(,LP;eLsE,ELSE;iF,IF;If,IF;z5DCOWLn,ID;\"\\\"\",LIT;==,COMP;\"o\\\\\",LIT;i45d,ID;ElsE,ELSE;),RP;\"\\\"\",LIT;elSe,ELSE;eLse,ELSE;(,LP;If,IF;),RP;485007109,NUM;50840E11752,NUM;eLse,ELSE;(,LP;iF,IF;iF,IF;60844633297321230674e5,NUM;\"u0L-\\\"\",LIT;\"7DbR(A\",LIT;(,LP;\"k9w9ZG-\",LIT;),RP;\"\",LIT;),RP;3405514552046517,NUM;eLSe,ELSE;eLse,ELSE;EnL1r67,ID;(,LP;),RP;If,IF;>=,COMP;==,COMP;(,LP;),RP;M2LJHPXOMumLuR,ID;!=,COMP;==,COMP;80481931264106637,NUM;\"Yl|ITB@aj\",LIT;iF,IF;eLSe,ELSE;(,LP;\"\\\\\\\"\",LIT;),RP;(,LP;g4QYksv4AC61,ID;),RP;30527894283,NUM;elSE,ELSE;iF,IF;MZDvquTLMZRMhzi9Pq,ID;\"\\\\M\",LIT;),RP;879292063341007,NUM;(,LP;57874648.84,NUM;\"\",LIT;W4hx9JZ,ID;(,LP;YDVZGARktqw8E,ID;==,COMP;iF,IF;),RP;\"\\\"\\\"\",LIT;),RP", tokenStream(")      eLse MDavBzDPHv0      672400     iF(ElSE (<=     (ELSe   )  if      562745e2677615541  283e+1)  CzwPw_z8JuHdUp) \"i)h\"))(eLsE    iF      If  z5DCOWLn \"\\\"\" ==    \"o\\\\\" i45d    ElsE     )\"\\\"\"elSe   eLse    (If      )      485007109      50840E11752   eLse(      iF iF     60844633297321230674e5  \"u0L-\\\"\"    \"7DbR(A\"(\"k9w9ZG-\"    )\"\"    )3405514552046517 eLSe  eLse    EnL1r67     (      )If     >===      ()    M2LJHPXOMumLuR   !=  ==     80481931264106637   \"Yl|ITB@aj\"iF    eLSe(\"\\\\\\\"\")( g4QYksv4AC61)30527894283elSE    iF    MZDvquTLMZRMhzi9Pq\"\\\\M\"   )   879292063341007(  57874648.84  \"\"W4hx9JZ   (  YDVZGARktqw8E==    iF)   \"\\\"\\\"\")"));
	}

	@Test
	public void testString8() {
		assertEquals("\"\",LIT;),RP;!=,COMP;if,IF;(,LP;\"K|\",LIT;\"p\\\"\",LIT;If,IF;kmUiyYIpiiKLIVR,ID;37707200,NUM;TPIoIvncUwM,ID;\"\\\"\",LIT;53281280,NUM;If,IF;if,IF;),RP;(,LP;(,LP;!=,COMP;Jd,ID;8.7153671E-8,NUM;n_EEF7R2P9,ID;ELse,ELSE;\"\",LIT;(,LP;(,LP;),RP;<,COMP;_aWRCyeGBs71,ID;\":wGM\",LIT;),RP;\" Zei-li\",LIT;3911,NUM;84557092418885519.5,NUM;DkRhqELT11WTHu6owiVn,ID;Q,ID;ELSe,ELSE;4619328741590536.0,NUM;if,IF;\"$\\\\\",LIT;IF,IF;IF,IF;ELSE,ELSE;),RP;eLse,ELSE;Fobb7tj7nK_6ARUoUwGoU,ID;If,IF;927931,NUM;(,LP;),RP;(,LP;),RP;),RP;IF,IF;\"\\\"\",LIT;lDmfhgN9KPYBj2x6I,ID;<,COMP;),RP;9493587848e2,NUM;iF,IF;\"k^q#iY\",LIT;136528523305e1894,NUM;>,COMP;),RP;==,COMP;UHWG7h42d,ID;>,COMP;_VBP_ny,ID;(,LP;1783481027970440.14770,NUM;EeRw_,ID;jHJC7mnxJC0i,ID;eLsE,ELSE;if,IF;boGKll5Tq_BElgnP89EpV,ID;\"~c|C1\",LIT;ElSe,ELSE;fW8M1vXEQk,ID;(,LP;4015532526858,NUM;\"rUlL9zx@<\",LIT;(,LP;),RP;>,COMP;),RP;elsE,ELSE;(,LP;(,LP;(,LP;iF,IF;eLse,ELSE;),RP;elsE,ELSE;\"<7Lc}5z[4N\",LIT;else,ELSE", tokenStream("\"\" )      !=if   ( \"K|\"    \"p\\\"\"   If      kmUiyYIpiiKLIVR   37707200TPIoIvncUwM   \"\\\"\" 53281280  If if)      ((!=      Jd 8.7153671E-8n_EEF7R2P9 ELse\"\"(   ()  <  _aWRCyeGBs71\":wGM\")\" Zei-li\"  3911   84557092418885519.5DkRhqELT11WTHu6owiVn  Q  ELSe   4619328741590536.0if\"$\\\\\"    IF      IF   ELSE      )eLse    Fobb7tj7nK_6ARUoUwGoU  If 927931  (   )( ))   IF \"\\\"\"  lDmfhgN9KPYBj2x6I<)   9493587848e2      iF    \"k^q#iY\"   136528523305e1894>) ==   UHWG7h42d>_VBP_ny     (     1783481027970440.14770EeRw_ jHJC7mnxJC0i  eLsE      if      boGKll5Tq_BElgnP89EpV  \"~c|C1\"ElSe    fW8M1vXEQk(4015532526858\"rUlL9zx@<\"(   )>  )elsE(      ((iF eLse)   elsE\"<7Lc}5z[4N\"else"));
	}

	@Test
	public void testString9() {
		assertEquals("F0EoG,ID;(,LP;>,COMP;elSe,ELSE;(,LP;),RP;!=,COMP;iF,IF;(,LP;(,LP;ELSe,ELSE;<=,COMP;>,COMP;==,COMP;),RP;(,LP;(,LP;ElSE,ELSE;),RP;IF,IF;IF,IF;ELsE,ELSE;IF,IF;zcd9FdeGHZe8y9B,ID;),RP;vwnX,ID;<=,COMP;ELse,ELSE;(,LP;(,LP;\"n\\\\\\\"\",LIT;>=,COMP;<=,COMP;),RP;(,LP;\"\\\"\\\\\",LIT;),RP;<,COMP;38124134413766,NUM;\"AFV?\\\"\",LIT;(,LP;\"\",LIT;(,LP;trn1v5Bmju,ID;),RP;ElsE,ELSE;(,LP;\"GRDQ\",LIT;>,COMP;ELSe,ELSE;!=,COMP;eLSe,ELSE;>,COMP;\"\\\"%\\\"\",LIT;),RP;==,COMP;978104.041,NUM;),RP;\"K!5`(%>@ A\",LIT;39798559257495,NUM;(,LP;25745.2,NUM;\"\\\"\",LIT;If,IF;),RP;ELsE,ELSE;eLSe,ELSE;IF,IF;!=,COMP;ELse,ELSE;\"fC.u+F^>\",LIT;TbteDk99,ID;791827073057420,NUM;IF,IF;059703005,NUM;),RP;8281094343512,NUM;U,ID;\"R(7+uG\",LIT;>=,COMP;\"\\\"#\",LIT;\"U^E(:cjo1\",LIT;\"\\\"\\\\\\\"Q\",LIT;elSe,ELSE;iTK9kxHKf5O8,ID;<,COMP;DH,ID;!=,COMP;(,LP;If,IF;\"4\\\"\",LIT;),RP;else,ELSE;<,COMP;<,COMP;(,LP;),RP;!=,COMP;),RP", tokenStream("F0EoG(>      elSe    ( )   !=iF(      (ELSe <=> ==)(      (ElSE      )IF     IF  ELsE IF   zcd9FdeGHZe8y9B)  vwnX      <=      ELse    (      (\"n\\\\\\\"\">=<=  )    (\"\\\"\\\\\")<   38124134413766      \"AFV?\\\"\"(\"\"   (trn1v5Bmju ) ElsE     (\"GRDQ\">     ELSe     !=eLSe    >\"\\\"%\\\"\")  ==     978104.041)\"K!5`(%>@ A\"39798559257495(25745.2\"\\\"\"If   )      ELsE  eLSe     IF    !=ELse \"fC.u+F^>\" TbteDk99  791827073057420   IF   059703005   )8281094343512    U     \"R(7+uG\"   >=     \"\\\"#\"      \"U^E(:cjo1\"\"\\\"\\\\\\\"Q\" elSe  iTK9kxHKf5O8<DH!=  (      If\"4\\\"\"   )    else<<(      )  != )"));
	}

	@Test
	public void testString10() {
		assertEquals("3.031e845020,NUM;92951464657,NUM;(,LP;(,LP;\"I\",LIT;\"\\\\\\\\\",LIT;16757,NUM;==,COMP;==,COMP;ElSe,ELSE;\".45rA4\",LIT;66.998e30145937,NUM;==,COMP;122E-628107007,NUM;hOV,ID;v95dbU,ID;),RP;!=,COMP;elSe,ELSE;\"\\\"\\\\\",LIT;wqVXFwZXj8vTaeDI,ID;(,LP;),RP;74.7857,NUM;(,LP;IF,IF;!=,COMP;3322e-333353871,NUM;lTLx7,ID;\"\\\\\",LIT;),RP;N5WDDShuaSZ,ID;==,COMP;(,LP;eLSe,ELSE;7095110.217e1990,NUM;86822.7,NUM;\"ELFgX%J\",LIT;elSE,ELSE;<=,COMP;if,IF;747.192,NUM;if,IF;),RP;4260561,NUM;\"nCT[@\",LIT;cOC_0PHejNHe91hy5,ID;),RP;(,LP;),RP;ElSe,ELSE;iF,IF;(,LP;(,LP;\"9S#F\",LIT;ImB1Rg4FP8Ih7nP,ID;\"K0d V/%Q\",LIT;(,LP;at,ID;6.641679,NUM;\".w--NXYk\",LIT;!=,COMP;64.4503761416078,NUM;),RP;(,LP;else,ELSE;ElsE,ELSE;k0jdSQ5j,ID;else,ELSE;elSe,ELSE;elsE,ELSE;<=,COMP;(,LP;elSE,ELSE;>,COMP;(,LP;if,IF;IF,IF;),RP;elSE,ELSE;C7xMi1Gaak12KI,ID;elSe,ELSE;\"$L\\\"\",LIT;),RP;\"i\",LIT;334.8,NUM;If,IF;\"\",LIT;==,COMP;If,IF;IF,IF;tM_QhYsNflYF,ID;QPWQ3f4Fue,ID;16487966998.9,NUM;eLSE,ELSE;(,LP;(,LP", tokenStream("3.031e845020   92951464657( (      \"I\"    \"\\\\\\\\\" 16757 ====ElSe  \".45rA4\"    66.998e30145937==  122E-628107007  hOV      v95dbU)    !=   elSe     \"\\\"\\\\\"      wqVXFwZXj8vTaeDI(    )     74.7857(IF!=3322e-333353871lTLx7\"\\\\\"   )      N5WDDShuaSZ==      (eLSe    7095110.217e1990 86822.7\"ELFgX%J\"     elSE<= if  747.192 if)      4260561\"nCT[@\" cOC_0PHejNHe91hy5)(  )ElSe    iF    ((  \"9S#F\"    ImB1Rg4FP8Ih7nP     \"K0d V/%Q\"(     at      6.641679\".w--NXYk\"!=64.4503761416078 )    (else  ElsE     k0jdSQ5j else  elSe elsE<= ( elSE>      (if     IF)elSE  C7xMi1Gaak12KI    elSe   \"$L\\\"\")\"i\"     334.8If  \"\"   ==  If    IF   tM_QhYsNflYF    QPWQ3f4Fue 16487966998.9eLSE    (    ("));
	}

}