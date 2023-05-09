package csen1002.tests.task7;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task7.CfgLl1Parser;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task7TestsBatch2 {

	@Test
	public void testCfg1String1() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;A;F;I;P#f;g;i;o;t;w;y#S/gIi,wSw,iAP;A/o,fASw;F/y,f,e;I/yF,w,gFP,e;P/gF,tP#S/g,w,i;A/o,f;F/y,f,e;I/y,w,g,e;P/g,t#S/$w;A/gitw;F/$gitw;I/i;P/$iw");
		assertEquals("S;wSw;wiAPw;wifASwPw;wifoSwPw;wifowSwwPw;wifowiAPwwPw;ERROR", cfgLl1Parser.parse("wifowigf"));
	}

	@Test
	public void testCfg1String2() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;A;F;I;P#f;g;i;o;t;w;y#S/gIi,wSw,iAP;A/o,fASw;F/y,f,e;I/yF,w,gFP,e;P/gF,tP#S/g,w,i;A/o,f;F/y,f,e;I/y,w,g,e;P/g,t#S/$w;A/gitw;F/$gitw;I/i;P/$iw");
		assertEquals("S;wSw;wgIiw;wggFPiw;wggyPiw;wggygFiw;wggygiw;ERROR", cfgLl1Parser.parse("wggygwio"));
	}

	@Test
	public void testCfg1String3() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;A;F;I;P#f;g;i;o;t;w;y#S/gIi,wSw,iAP;A/o,fASw;F/y,f,e;I/yF,w,gFP,e;P/gF,tP#S/g,w,i;A/o,f;F/y,f,e;I/y,w,g,e;P/g,t#S/$w;A/gitw;F/$gitw;I/i;P/$iw");
		assertEquals("S;gIi;ggFPi;ggyPi;ggytPi;ggyttPi;ggytttPi;ggyttttPi;ggyttttgFi;ggyttttgfi", cfgLl1Parser.parse("ggyttttgfi"));
	}

	@Test
	public void testCfg1String4() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;A;F;I;P#f;g;i;o;t;w;y#S/gIi,wSw,iAP;A/o,fASw;F/y,f,e;I/yF,w,gFP,e;P/gF,tP#S/g,w,i;A/o,f;F/y,f,e;I/y,w,g,e;P/g,t#S/$w;A/gitw;F/$gitw;I/i;P/$iw");
		assertEquals("S;wSw;wwSww;wwgIiww;wwggFPiww;wwggPiww;wwgggFiww;wwgggiww;ERROR", cfgLl1Parser.parse("wwgggigw"));
	}

	@Test
	public void testCfg1String5() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;A;F;I;P#f;g;i;o;t;w;y#S/gIi,wSw,iAP;A/o,fASw;F/y,f,e;I/yF,w,gFP,e;P/gF,tP#S/g,w,i;A/o,f;F/y,f,e;I/y,w,g,e;P/g,t#S/$w;A/gitw;F/$gitw;I/i;P/$iw");
		assertEquals("S;wSw;wwSww;wwgIiww;wwggFPiww;wwggPiww;wwggtPiww;wwggtgFiww;wwggtgyiww", cfgLl1Parser.parse("wwggtgyiww"));
	}

	@Test
	public void testCfg2String1() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;B;P;G;O#j;k;m;r;s#S/mP,kPj,j,rS;B/jOO,m,kPG,e;P/rBs,jP,k,mOk;G/rBs,jG,e;O/j,k#S/m,k,j,r;B/j,m,k,e;P/r,j,k,m;G/r,j,e;O/j,k#S/$;B/s;P/$jrs;G/s;O/jk");
		assertEquals("S;mP;mjP;mjrBs;mjrkPGs;mjrkmOkGs;mjrkmkkGs;ERROR", cfgLl1Parser.parse("mjrkmkrs"));
	}

	@Test
	public void testCfg2String2() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;B;P;G;O#j;k;m;r;s#S/mP,kPj,j,rS;B/jOO,m,kPG,e;P/rBs,jP,k,mOk;G/rBs,jG,e;O/j,k#S/m,k,j,r;B/j,m,k,e;P/r,j,k,m;G/r,j,e;O/j,k#S/$;B/s;P/$jrs;G/s;O/jk");
		assertEquals("S;mP;mrBs;mrkPGs;mrkrBsGs;mrkrsGs;mrkrsrBss;mrkrsrss", cfgLl1Parser.parse("mrkrsrss"));
	}

	@Test
	public void testCfg2String3() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;B;P;G;O#j;k;m;r;s#S/mP,kPj,j,rS;B/jOO,m,kPG,e;P/rBs,jP,k,mOk;G/rBs,jG,e;O/j,k#S/m,k,j,r;B/j,m,k,e;P/r,j,k,m;G/r,j,e;O/j,k#S/$;B/s;P/$jrs;G/s;O/jk");
		assertEquals("S;rS;rmP;rmrBs;rmrkPGs;rmrkjPGs;rmrkjjPGs;rmrkjjjPGs;rmrkjjjkGs;rmrkjjjks", cfgLl1Parser.parse("rmrkjjjks"));
	}

	@Test
	public void testCfg2String4() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;B;P;G;O#j;k;m;r;s#S/mP,kPj,j,rS;B/jOO,m,kPG,e;P/rBs,jP,k,mOk;G/rBs,jG,e;O/j,k#S/m,k,j,r;B/j,m,k,e;P/r,j,k,m;G/r,j,e;O/j,k#S/$;B/s;P/$jrs;G/s;O/jk");
		assertEquals("S;mP;mjP;mjjP;mjjrBs;mjjrkPGs;mjjrkkGs;mjjrkks", cfgLl1Parser.parse("mjjrkks"));
	}

	@Test
	public void testCfg2String5() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;B;P;G;O#j;k;m;r;s#S/mP,kPj,j,rS;B/jOO,m,kPG,e;P/rBs,jP,k,mOk;G/rBs,jG,e;O/j,k#S/m,k,j,r;B/j,m,k,e;P/r,j,k,m;G/r,j,e;O/j,k#S/$;B/s;P/$jrs;G/s;O/jk");
		assertEquals("S;rS;rrS;rrkPj;rrkjPj;rrkjjPj;rrkjjmOkj;rrkjjmkkj", cfgLl1Parser.parse("rrkjjmkkj"));
	}

}