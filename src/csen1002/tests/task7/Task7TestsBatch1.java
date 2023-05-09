package csen1002.tests.task7;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task7.CfgLl1Parser;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task7TestsBatch1 {

    @Test
    public void testCfg1String1() {
        CfgLl1Parser cfgLl1Parser = new CfgLl1Parser(
                "S;F;G;T;X#g;l;o;p;u;y;z#S/FFTz,yS;F/lG,gF;G/yX,uS,e;T/oXTz,g,pSpG,e;X/pSlS,zS#S/gl,y;F/l,g;G/y,u,e;T/o,g,p,e;X/p,z#S/$glopz;F/gl;G/glz;T/z;X/glopz");
        assertEquals("S;yS;yyS;yyFFTz;yylGFTz;yylFTz;yyllGTz;ERROR", cfgLl1Parser.parse("yyllpgllzpz"));
    }

    @Test
    public void testCfg1String2() {
        CfgLl1Parser cfgLl1Parser = new CfgLl1Parser(
                "S;F;G;T;X#g;l;o;p;u;y;z#S/FFTz,yS;F/lG,gF;G/yX,uS,e;T/oXTz,g,pSpG,e;X/pSlS,zS#S/gl,y;F/l,g;G/y,u,e;T/o,g,p,e;X/p,z#S/$glopz;F/gl;G/glz;T/z;X/glopz");
        assertEquals(
                "S;FFTz;lGFTz;lFTz;llGTz;lluSTz;lluFFTzTz;llulGFTzTz;llulFTzTz;llullGTzTz;llullTzTz;llullzTz;llullzz",
                cfgLl1Parser.parse("llullzz"));
    }

    @Test
    public void testCfg1String3() {
        CfgLl1Parser cfgLl1Parser = new CfgLl1Parser(
                "S;F;G;T;X#g;l;o;p;u;y;z#S/FFTz,yS;F/lG,gF;G/yX,uS,e;T/oXTz,g,pSpG,e;X/pSlS,zS#S/gl,y;F/l,g;G/y,u,e;T/o,g,p,e;X/p,z#S/$glopz;F/gl;G/glz;T/z;X/glopz");
        assertEquals("S;yS;yyS;yyFFTz;yylGFTz;yylFTz;yyllGTz;yyllTz;yyllz;ERROR", cfgLl1Parser.parse("yyllzozl"));
    }

    @Test
    public void testCfg1String4() {
        CfgLl1Parser cfgLl1Parser = new CfgLl1Parser(
                "S;F;G;T;X#g;l;o;p;u;y;z#S/FFTz,yS;F/lG,gF;G/yX,uS,e;T/oXTz,g,pSpG,e;X/pSlS,zS#S/gl,y;F/l,g;G/y,u,e;T/o,g,p,e;X/p,z#S/$glopz;F/gl;G/glz;T/z;X/glopz");
        assertEquals("S;yS;yFFTz;ylGFTz;ylFTz;yllGTz;yllTz;yllz;ERROR", cfgLl1Parser.parse("yllzypgg"));
    }

    @Test
    public void testCfg1String5() {
        CfgLl1Parser cfgLl1Parser = new CfgLl1Parser(
                "S;F;G;T;X#g;l;o;p;u;y;z#S/FFTz,yS;F/lG,gF;G/yX,uS,e;T/oXTz,g,pSpG,e;X/pSlS,zS#S/gl,y;F/l,g;G/y,u,e;T/o,g,p,e;X/p,z#S/$glopz;F/gl;G/glz;T/z;X/glopz");
        assertEquals("S;FFTz;gFFTz;ggFFTz;gggFFTz;ggglGFTz;ggglFTz;gggllGTz;gggllTz;gggllz",
                cfgLl1Parser.parse("gggllz"));
    }

    @Test
    public void testCfg2String1() {
        CfgLl1Parser cfgLl1Parser = new CfgLl1Parser(
                "S;Y;Q;M;W;D#d;i;j;k;s;t#S/iWiD,jYMi;Y/tQk,iMi,e;Q/kQ,M;M/d,DS;W/dQiM,j,kYDM,e;D/s,jD#S/i,j;Y/t,i,e;Q/k,djs;M/d,js;W/d,j,k,e;D/s,j#S/$ik;Y/djs;Q/ik;M/ik;W/i;D/$dijks");
        assertEquals("S;jYMi;jMi;jDSi;jsSi;jsiWiDi;jsiiDi;jsiijDi;jsiijjDi;jsiijjsi", cfgLl1Parser.parse("jsiijjsi"));
    }

    @Test
    public void testCfg2String2() {
        CfgLl1Parser cfgLl1Parser = new CfgLl1Parser(
                "S;Y;Q;M;W;D#d;i;j;k;s;t#S/iWiD,jYMi;Y/tQk,iMi,e;Q/kQ,M;M/d,DS;W/dQiM,j,kYDM,e;D/s,jD#S/i,j;Y/t,i,e;Q/k,djs;M/d,js;W/d,j,k,e;D/s,j#S/$ik;Y/djs;Q/ik;M/ik;W/i;D/$dijks");
        assertEquals(
                "S;iWiD;ikYDMiD;iktQkDMiD;iktMkDMiD;iktdkDMiD;iktdksMiD;iktdksdiD;iktdksdijD;iktdksdijjD;iktdksdijjs",
                cfgLl1Parser.parse("iktdksdijjs"));
    }

    @Test
    public void testCfg2String3() {
        CfgLl1Parser cfgLl1Parser = new CfgLl1Parser(
                "S;Y;Q;M;W;D#d;i;j;k;s;t#S/iWiD,jYMi;Y/tQk,iMi,e;Q/kQ,M;M/d,DS;W/dQiM,j,kYDM,e;D/s,jD#S/i,j;Y/t,i,e;Q/k,djs;M/d,js;W/d,j,k,e;D/s,j#S/$ik;Y/djs;Q/ik;M/ik;W/i;D/$dijks");
        assertEquals("S;iWiD;ikYDMiD;ikDMiD;iksMiD;iksDSiD;ikssSiD;ikssiWiDiD;ikssiiDiD;ikssiisiD;ikssiisis",
                cfgLl1Parser.parse("ikssiisis"));
    }

    @Test
    public void testCfg2String4() {
        CfgLl1Parser cfgLl1Parser = new CfgLl1Parser(
                "S;Y;Q;M;W;D#d;i;j;k;s;t#S/iWiD,jYMi;Y/tQk,iMi,e;Q/kQ,M;M/d,DS;W/dQiM,j,kYDM,e;D/s,jD#S/i,j;Y/t,i,e;Q/k,djs;M/d,js;W/d,j,k,e;D/s,j#S/$ik;Y/djs;Q/ik;M/ik;W/i;D/$dijks");
        assertEquals("S;iWiD;iiD;iijD;iijjD;iijjjD;iijjjjD;iijjjjjD;iijjjjjjD;iijjjjjjs",
                cfgLl1Parser.parse("iijjjjjjs"));
    }

    @Test
    public void testCfg2String5() {
        CfgLl1Parser cfgLl1Parser = new CfgLl1Parser(
                "S;Y;Q;M;W;D#d;i;j;k;s;t#S/iWiD,jYMi;Y/tQk,iMi,e;Q/kQ,M;M/d,DS;W/dQiM,j,kYDM,e;D/s,jD#S/i,j;Y/t,i,e;Q/k,djs;M/d,js;W/d,j,k,e;D/s,j#S/$ik;Y/djs;Q/ik;M/ik;W/i;D/$dijks");
        assertEquals("S;jYMi;jtQkMi;jtMkMi;jtDSkMi;jtjDSkMi;jtjsSkMi;jtjsiWiDkMi;jtjsiiDkMi;jtjsiiskMi;jtjsiiskdi",
                cfgLl1Parser.parse("jtjsiiskdi"));
    }

}