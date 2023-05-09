package csen1002.tests.task7;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task7.CfgLl1Parser;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task7TestsBatch4 {

	@Test
	public void testCfg1String1() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;F;N;Y;Z#c;g;h;j;v;z#S/gS,cN;F/vS,cN;N/jF,zSgZ,e;Y/g,zN,hFg,e;Z/zYcY,cF#S/g,c;F/v,c;N/j,z,e;Y/g,z,h,e;Z/z,c#S/$cg;F/$cg;N/$cg;Y/c;Z/$cg");
		assertEquals("S;gS;gcN;gczSgZ;gczgSgZ;gczggSgZ;gczgggSgZ;ERROR", cfgLl1Parser.parse("gczggghg"));
	}

	@Test
	public void testCfg1String2() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;F;N;Y;Z#c;g;h;j;v;z#S/gS,cN;F/vS,cN;N/jF,zSgZ,e;Y/g,zN,hFg,e;Z/zYcY,cF#S/g,c;F/v,c;N/j,z,e;Y/g,z,h,e;Z/z,c#S/$cg;F/$cg;N/$cg;Y/c;Z/$cg");
		assertEquals("S;cN;czSgZ;czgSgZ;czggSgZ;czgggSgZ;czggggSgZ;czggggcNgZ;czggggczSgZgZ;ERROR", cfgLl1Parser.parse("czggggcz"));
	}

	@Test
	public void testCfg1String3() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;F;N;Y;Z#c;g;h;j;v;z#S/gS,cN;F/vS,cN;N/jF,zSgZ,e;Y/g,zN,hFg,e;Z/zYcY,cF#S/g,c;F/v,c;N/j,z,e;Y/g,z,h,e;Z/z,c#S/$cg;F/$cg;N/$cg;Y/c;Z/$cg");
		assertEquals("S;cN;czSgZ;czcNgZ;czczSgZgZ;czczgSgZgZ;czczggSgZgZ;czczggcNgZgZ;czczggczSgZgZgZ;ERROR", cfgLl1Parser.parse("czczggcz"));
	}

	@Test
	public void testCfg1String4() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;F;N;Y;Z#c;g;h;j;v;z#S/gS,cN;F/vS,cN;N/jF,zSgZ,e;Y/g,zN,hFg,e;Z/zYcY,cF#S/g,c;F/v,c;N/j,z,e;Y/g,z,h,e;Z/z,c#S/$cg;F/$cg;N/$cg;Y/c;Z/$cg");
		assertEquals("S;cN;czSgZ;czgSgZ;czggSgZ;czggcNgZ;czggcgZ;ERROR", cfgLl1Parser.parse("czggcccj"));
	}

	@Test
	public void testCfg1String5() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;F;N;Y;Z#c;g;h;j;v;z#S/gS,cN;F/vS,cN;N/jF,zSgZ,e;Y/g,zN,hFg,e;Z/zYcY,cF#S/g,c;F/v,c;N/j,z,e;Y/g,z,h,e;Z/z,c#S/$cg;F/$cg;N/$cg;Y/c;Z/$cg");
		assertEquals("S;gS;ggS;gggS;ggggS;gggggS;ggggggS;ERROR", cfgLl1Parser.parse("ggggggvz"));
	}

	@Test
	public void testCfg2String1() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;H;N;A;J#f;l;r;u;v;w#S/rHr,v;H/lAJu,f,e;N/wSl,vJ,e;A/r,J;J/fS,lN#S/r,v;H/l,f,e;N/w,v,e;A/r,fl;J/f,l#S/$flu;H/r;N/flu;A/fl;J/flu");
		assertEquals("S;rHr;rlAJur;rlJJur;rlfSJur;rlfvJur;rlfvlNur;rlfvlwSlur;rlfvlwvlur;ERROR", cfgLl1Parser.parse("rlfvlwvw"));
	}

	@Test
	public void testCfg2String2() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;H;N;A;J#f;l;r;u;v;w#S/rHr,v;H/lAJu,f,e;N/wSl,vJ,e;A/r,J;J/fS,lN#S/r,v;H/l,f,e;N/w,v,e;A/r,fl;J/f,l#S/$flu;H/r;N/flu;A/fl;J/flu");
		assertEquals("S;rHr;rlAJur;rlJJur;rlfSJur;rlfvJur;rlfvlNur;rlfvlwSlur;rlfvlwvlur", cfgLl1Parser.parse("rlfvlwvlur"));
	}

	@Test
	public void testCfg2String3() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;H;N;A;J#f;l;r;u;v;w#S/rHr,v;H/lAJu,f,e;N/wSl,vJ,e;A/r,J;J/fS,lN#S/r,v;H/l,f,e;N/w,v,e;A/r,fl;J/f,l#S/$flu;H/r;N/flu;A/fl;J/flu");
		assertEquals("S;rHr;rlAJur;rlJJur;rllNJur;rllJur;rlllNur;rlllur;ERROR", cfgLl1Parser.parse("rlllurlw"));
	}

	@Test
	public void testCfg2String4() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;H;N;A;J#f;l;r;u;v;w#S/rHr,v;H/lAJu,f,e;N/wSl,vJ,e;A/r,J;J/fS,lN#S/r,v;H/l,f,e;N/w,v,e;A/r,fl;J/f,l#S/$flu;H/r;N/flu;A/fl;J/flu");
		assertEquals("S;rHr;rlAJur;rlJJur;rllNJur;rllvJJur;rllvfSJur;ERROR", cfgLl1Parser.parse("rllvfulu"));
	}

	@Test
	public void testCfg2String5() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;H;N;A;J#f;l;r;u;v;w#S/rHr,v;H/lAJu,f,e;N/wSl,vJ,e;A/r,J;J/fS,lN#S/r,v;H/l,f,e;N/w,v,e;A/r,fl;J/f,l#S/$flu;H/r;N/flu;A/fl;J/flu");
		assertEquals("S;rHr;rlAJur;rlJJur;rllNJur;rllJur;rlllNur;rlllvJur;rlllvfSur;rlllvfrHrur;rlllvfrfrur", cfgLl1Parser.parse("rlllvfrfrur"));
	}

}