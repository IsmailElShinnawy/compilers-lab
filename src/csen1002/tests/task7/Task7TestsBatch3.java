package csen1002.tests.task7;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task7.CfgLl1Parser;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task7TestsBatch3 {

	@Test
	public void testCfg1String1() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;X;G;O;Y#b;f;m;n;s;v;y#S/XsX,v,yY;X/bGbG,f,sO;G/mSXb,s,e;O/nSfX,vSsS,e;Y/m,s#S/bfs,v,y;X/b,f,s;G/m,s,e;O/n,v,e;Y/m,s#S/$bfs;X/bs;G/b;O/bs;Y/$bfs");
		assertEquals("S;XsX;bGbGsX;bmSXbbGsX;bmyYXbbGsX;bmymXbbGsX;bmymsObbGsX;bmymsbbGsX;bmymsbbssX;ERROR", cfgLl1Parser.parse("bmymsbbsf"));
	}

	@Test
	public void testCfg1String2() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;X;G;O;Y#b;f;m;n;s;v;y#S/XsX,v,yY;X/bGbG,f,sO;G/mSXb,s,e;O/nSfX,vSsS,e;Y/m,s#S/bfs,v,y;X/b,f,s;G/m,s,e;O/n,v,e;Y/m,s#S/$bfs;X/bs;G/b;O/bs;Y/$bfs");
		assertEquals("S;XsX;fsX;fssO;fssnSfX;fssnyYfX;fssnymfX;fssnymfbGbG;fssnymfbbG;fssnymfbbs", cfgLl1Parser.parse("fssnymfbbs"));
	}

	@Test
	public void testCfg1String3() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;X;G;O;Y#b;f;m;n;s;v;y#S/XsX,v,yY;X/bGbG,f,sO;G/mSXb,s,e;O/nSfX,vSsS,e;Y/m,s#S/bfs,v,y;X/b,f,s;G/m,s,e;O/n,v,e;Y/m,s#S/$bfs;X/bs;G/b;O/bs;Y/$bfs");
		assertEquals("S;XsX;bGbGsX;bbGsX;bbmSXbsX;bbmXsXXbsX;bbmfsXXbsX;ERROR", cfgLl1Parser.parse("bbmfbnff"));
	}

	@Test
	public void testCfg1String4() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;X;G;O;Y#b;f;m;n;s;v;y#S/XsX,v,yY;X/bGbG,f,sO;G/mSXb,s,e;O/nSfX,vSsS,e;Y/m,s#S/bfs,v,y;X/b,f,s;G/m,s,e;O/n,v,e;Y/m,s#S/$bfs;X/bs;G/b;O/bs;Y/$bfs");
		assertEquals("S;XsX;bGbGsX;bmSXbbGsX;bmXsXXbbGsX;bmfsXXbbGsX;bmfssOXbbGsX;bmfssXbbGsX;bmfssbGbGbbGsX;ERROR", cfgLl1Parser.parse("bmfssbvf"));
	}

	@Test
	public void testCfg1String5() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;X;G;O;Y#b;f;m;n;s;v;y#S/XsX,v,yY;X/bGbG,f,sO;G/mSXb,s,e;O/nSfX,vSsS,e;Y/m,s#S/bfs,v,y;X/b,f,s;G/m,s,e;O/n,v,e;Y/m,s#S/$bfs;X/bs;G/b;O/bs;Y/$bfs");
		assertEquals("S;XsX;sOsX;snSfXsX;snXsXfXsX;snsOsXfXsX;snsnSfXsXfXsX;ERROR", cfgLl1Parser.parse("snsnmnv"));
	}

	@Test
	public void testCfg2String1() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;I;C;A;L;F#b;d;m;s;u;y;z#S/bFu,dFyF;I/mAy,y;C/u,zLC;A/zId,uS,mL,e;L/mC,sL,e;F/bCCm,y,dI#S/b,d;I/m,y;C/u,z;A/z,u,m,e;L/m,s,e;F/b,y,d#S/$y;I/duy;C/uyz;A/y;L/uyz;F/uy");
		assertEquals("S;dFyF;ddIyF;ddmAyyF;ddmzIdyyF;ddmzmAydyyF;ddmzmuSydyyF;ERROR", cfgLl1Parser.parse("ddmzmuys"));
	}

	@Test
	public void testCfg2String2() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;I;C;A;L;F#b;d;m;s;u;y;z#S/bFu,dFyF;I/mAy,y;C/u,zLC;A/zId,uS,mL,e;L/mC,sL,e;F/bCCm,y,dI#S/b,d;I/m,y;C/u,z;A/z,u,m,e;L/m,s,e;F/b,y,d#S/$y;I/duy;C/uyz;A/y;L/uyz;F/uy");
		assertEquals("S;dFyF;dbCCmyF;dbzLCCmyF;dbzsLCCmyF;dbzsCCmyF;dbzsuCmyF;ERROR", cfgLl1Parser.parse("dbzsubbd"));
	}

	@Test
	public void testCfg2String3() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;I;C;A;L;F#b;d;m;s;u;y;z#S/bFu,dFyF;I/mAy,y;C/u,zLC;A/zId,uS,mL,e;L/mC,sL,e;F/bCCm,y,dI#S/b,d;I/m,y;C/u,z;A/z,u,m,e;L/m,s,e;F/b,y,d#S/$y;I/duy;C/uyz;A/y;L/uyz;F/uy");
		assertEquals("S;bFu;bbCCmu;bbzLCCmu;bbzCCmu;bbzzLCCmu;bbzzsLCCmu;ERROR", cfgLl1Parser.parse("bbzzsbmd"));
	}

	@Test
	public void testCfg2String4() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;I;C;A;L;F#b;d;m;s;u;y;z#S/bFu,dFyF;I/mAy,y;C/u,zLC;A/zId,uS,mL,e;L/mC,sL,e;F/bCCm,y,dI#S/b,d;I/m,y;C/u,z;A/z,u,m,e;L/m,s,e;F/b,y,d#S/$y;I/duy;C/uyz;A/y;L/uyz;F/uy");
		assertEquals("S;dFyF;dyyF;dyydI;dyydmAy;dyydmmLy;dyydmmsLy;dyydmmsy", cfgLl1Parser.parse("dyydmmsy"));
	}

	@Test
	public void testCfg2String5() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;I;C;A;L;F#b;d;m;s;u;y;z#S/bFu,dFyF;I/mAy,y;C/u,zLC;A/zId,uS,mL,e;L/mC,sL,e;F/bCCm,y,dI#S/b,d;I/m,y;C/u,z;A/z,u,m,e;L/m,s,e;F/b,y,d#S/$y;I/duy;C/uyz;A/y;L/uyz;F/uy");
		assertEquals("S;dFyF;dbCCmyF;dbzLCCmyF;dbzmCCCmyF;dbzmzLCCCmyF;dbzmzsLCCCmyF;dbzmzsCCCmyF;dbzmzszLCCCmyF;dbzmzszCCCmyF;ERROR", cfgLl1Parser.parse("dbzmzszy"));
	}

}