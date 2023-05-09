package csen1002.tests.task7;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task7.CfgLl1Parser;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task7TestsBatch5 {

	@Test
	public void testCfg1String1() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;B;M;P;J#a;b;d;j;m;v;w#S/mP,vSa,b;B/wSvS,jMbS,e;M/vM,J,e;P/vJd,jB;J/wSS,mMj#S/m,v,b;B/w,j,e;M/v,mw,e;P/v,j;J/w,m#S/$abmv;B/$abmv;M/bj;P/$abmv;J/bdj");
		assertEquals("S;mP;mjB;mjjMbS;mjjvMbS;mjjvJbS;mjjvmMjbS;mjjvmJjbS;mjjvmmMjjbS;mjjvmmjjbS;mjjvmmjjbb", cfgLl1Parser.parse("mjjvmmjjbb"));
	}

	@Test
	public void testCfg1String2() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;B;M;P;J#a;b;d;j;m;v;w#S/mP,vSa,b;B/wSvS,jMbS,e;M/vM,J,e;P/vJd,jB;J/wSS,mMj#S/m,v,b;B/w,j,e;M/v,mw,e;P/v,j;J/w,m#S/$abmv;B/$abmv;M/bj;P/$abmv;J/bdj");
		assertEquals("S;vSa;vmPa;vmjBa;vmjjMbSa;vmjjJbSa;vmjjwSSbSa;vmjjwbSbSa;vmjjwbbbSa;vmjjwbbbba", cfgLl1Parser.parse("vmjjwbbbba"));
	}

	@Test
	public void testCfg1String3() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;B;M;P;J#a;b;d;j;m;v;w#S/mP,vSa,b;B/wSvS,jMbS,e;M/vM,J,e;P/vJd,jB;J/wSS,mMj#S/m,v,b;B/w,j,e;M/v,mw,e;P/v,j;J/w,m#S/$abmv;B/$abmv;M/bj;P/$abmv;J/bdj");
		assertEquals("S;vSa;vvSaa;vvmPaa;vvmjBaa;vvmjjMbSaa;vvmjjbSaa;vvmjjbvSaaa;vvmjjbvbaaa;ERROR", cfgLl1Parser.parse("vvmjjbvb"));
	}

	@Test
	public void testCfg1String4() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;B;M;P;J#a;b;d;j;m;v;w#S/mP,vSa,b;B/wSvS,jMbS,e;M/vM,J,e;P/vJd,jB;J/wSS,mMj#S/m,v,b;B/w,j,e;M/v,mw,e;P/v,j;J/w,m#S/$abmv;B/$abmv;M/bj;P/$abmv;J/bdj");
		assertEquals("S;mP;mvJd;mvwSSd;mvwmPSd;mvwmjBSd;mvwmjSd;mvwmjmPd;ERROR", cfgLl1Parser.parse("mvwmjmab"));
	}

	@Test
	public void testCfg1String5() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;B;M;P;J#a;b;d;j;m;v;w#S/mP,vSa,b;B/wSvS,jMbS,e;M/vM,J,e;P/vJd,jB;J/wSS,mMj#S/m,v,b;B/w,j,e;M/v,mw,e;P/v,j;J/w,m#S/$abmv;B/$abmv;M/bj;P/$abmv;J/bdj");
		assertEquals("S;vSa;vmPa;vmvJda;vmvmMjda;vmvmvMjda;vmvmvJjda;vmvmvwSSjda;vmvmvwbSjda;vmvmvwbbjda", cfgLl1Parser.parse("vmvmvwbbjda"));
	}

	@Test
	public void testCfg2String1() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;Z;H;E;V#b;c;f;i;k;l;u#S/fE,u;Z/l,uHkZ;H/uHk,lV,b,e;E/fZcZ,iZi,lH,e;V/c,iE#S/f,u;Z/l,u;H/u,l,b,e;E/f,i,l,e;V/c,i#S/$;Z/ci;H/$k;E/$k;V/$k");
		assertEquals("S;fE;flH;fluHk;flulVk;fluliEk;fluliiZik;ERROR", cfgLl1Parser.parse("fluliifi"));
	}

	@Test
	public void testCfg2String2() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;Z;H;E;V#b;c;f;i;k;l;u#S/fE,u;Z/l,uHkZ;H/uHk,lV,b,e;E/fZcZ,iZi,lH,e;V/c,iE#S/f,u;Z/l,u;H/u,l,b,e;E/f,i,l,e;V/c,i#S/$;Z/ci;H/$k;E/$k;V/$k");
		assertEquals("S;fE;flH;fllV;flliE;fllilH;fllil;ERROR", cfgLl1Parser.parse("fllilklb"));
	}

	@Test
	public void testCfg2String3() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;Z;H;E;V#b;c;f;i;k;l;u#S/fE,u;Z/l,uHkZ;H/uHk,lV,b,e;E/fZcZ,iZi,lH,e;V/c,iE#S/f,u;Z/l,u;H/u,l,b,e;E/f,i,l,e;V/c,i#S/$;Z/ci;H/$k;E/$k;V/$k");
		assertEquals("S;fE;ffZcZ;fflcZ;fflcuHkZ;fflcuuHkkZ;fflcuukkZ;fflcuukkl", cfgLl1Parser.parse("fflcuukkl"));
	}

	@Test
	public void testCfg2String4() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;Z;H;E;V#b;c;f;i;k;l;u#S/fE,u;Z/l,uHkZ;H/uHk,lV,b,e;E/fZcZ,iZi,lH,e;V/c,iE#S/f,u;Z/l,u;H/u,l,b,e;E/f,i,l,e;V/c,i#S/$;Z/ci;H/$k;E/$k;V/$k");
		assertEquals("S;fE;fiZi;fiuHkZi;fiubkZi;fiubkuHkZi;fiubkuuHkkZi;fiubkuukkZi;ERROR", cfgLl1Parser.parse("fiubkuu"));
	}

	@Test
	public void testCfg2String5() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;Z;H;E;V#b;c;f;i;k;l;u#S/fE,u;Z/l,uHkZ;H/uHk,lV,b,e;E/fZcZ,iZi,lH,e;V/c,iE#S/f,u;Z/l,u;H/u,l,b,e;E/f,i,l,e;V/c,i#S/$;Z/ci;H/$k;E/$k;V/$k");
		assertEquals("S;fE;ffZcZ;fflcZ;fflcuHkZ;fflcubkZ;fflcubkuHkZ;fflcubkukZ;fflcubkukl", cfgLl1Parser.parse("fflcubkukl"));
	}

}