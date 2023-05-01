package csen1002.tests.task6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task6.CfgFirstFollow;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task6TestsBatch1 {

	@Test
	public void testCfg1First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;A;Q;O;J;E;P#i;o;r;s;u#S/AAQs,Ao,ESPJ,rS;A/e,iOJ,rQO;Q/OAiP,S,SAAS,iJJu;O/A,E,J,O,OPEA,oQQPP,rA,sAEr;J/QoS,S,SrQP,e,oQSS;E/A,EoPo,S,SSO,e,s;P/J,Ps,S,r");
		assertEquals("S/iors;A/eir;Q/iors;O/eiors;J/eiors;E/eiors;P/eiors", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg1Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;A;Q;O;J;E;P#i;o;r;s;u#S/AAQs,Ao,ESPJ,rS;A/e,iOJ,rQO;Q/OAiP,S,SAAS,iJJu;O/A,E,J,O,OPEA,oQQPP,rA,sAEr;J/QoS,S,SrQP,e,oQSS;E/A,EoPo,S,SSO,e,s;P/J,Ps,S,r");
		assertEquals("S/$iorsu;A/iors;Q/$iorsu;O/iors;J/$iorsu;E/iors;P/$iorsu", cfgFirstFollow.follow());
	}

	@Test
	public void testCfg2First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;B;Y;J;G;R;O#b;h;k;l;r;v#S/YYlSG,kB;B/B,BlS,S,e,l;Y/BhGGG,ShO,Y;J/R,RrORS,S,bGhGO,r;G/B,Ol,e,rOk;R/J,SvRJ,e,r,rS;O/BBBB,JJbS,kYS");
		assertEquals("S/hkl;B/ehkl;Y/hkl;J/behklr;G/behklr;R/behklr;O/behklr", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg2Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;B;Y;J;G;R;O#b;h;k;l;r;v#S/YYlSG,kB;B/B,BlS,S,e,l;Y/BhGGG,ShO,Y;J/R,RrORS,S,bGhGO,r;G/B,Ol,e,rOk;R/J,SvRJ,e,r,rS;O/BBBB,JJbS,kYS");
		assertEquals("S/$bhklrv;B/$bhklrv;Y/hkl;J/bhklr;G/$bhklrv;R/bhklr;O/bhklr", cfgFirstFollow.follow());
	}

	@Test
	public void testCfg3First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;G;C;Z;X;I;V#a;c;d;g;w;x;z#S/VSw,Z,wS,wZGzI;G/CI,XdXa,aCc,e;C/I,VCwXa,VICd;Z/CzZ,SaSC;X/Id,VdSCz,X,XzIa,gCcZ;I/C,I,S,aCdI,d,e,x,zICaS;V/Ca,I,IZC,xVZ");
		assertEquals("S/adwxz;G/adegwxz;C/adewxz;Z/adwxz;X/adgwxz;I/adewxz;V/adewxz", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg3Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;G;C;Z;X;I;V#a;c;d;g;w;x;z#S/VSw,Z,wS,wZGzI;G/CI,XdXa,aCc,e;C/I,VCwXa,VICd;Z/CzZ,SaSC;X/Id,VdSCz,X,XzIa,gCcZ;I/C,I,S,aCdI,d,e,x,zICaS;V/Ca,I,IZC,xVZ");
		assertEquals("S/$acdgwxz;G/z;C/$acdgwxz;Z/$acdgwxz;X/adz;I/$acdgwxz;V/adwxz", cfgFirstFollow.follow());
	}

	@Test
	public void testCfg4First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;Z;F;T;D;V#m;p;q;v;y#S/VpDvV,pTvV;Z/D,DD,F,FVVF,pZSTV,vZ;F/D,FmFFy,Z,pVVDV,pZ;T/DZ,FD,FTFqS,S,T,TF,V,e;D/D,SSp,V,VFV,VTVm,e,q;V/qFqV,v");
		assertEquals("S/pqv;Z/empqv;F/empqv;T/empqv;D/epqv;V/qv", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg4Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;Z;F;T;D;V#m;p;q;v;y#S/VpDvV,pTvV;Z/D,DD,F,FVVF,pZSTV,vZ;F/D,FmFFy,Z,pVVDV,pZ;T/DZ,FD,FTFqS,S,T,TF,V,e;D/D,SSp,V,VFV,VTVm,e,q;V/qFqV,v");
		assertEquals("S/$mpqv;Z/mpqvy;F/mpqvy;T/mpqv;D/mpqvy;V/$mpqvy", cfgFirstFollow.follow());
	}

	@Test
	public void testCfg5First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;O;P;C;T;E#h;j;k;q;s;u;w#S/EPEEu,EhE,O,S,j;O/e,jSsTE,s;P/CCOu,OSkPu,S,SO,jTs;C/ESS,PTqE,S,TS,TTu,e;T/E,T,TESw,TSTE,TkTE,kCSTT,s;E/Ew,T,hOwEw");
		assertEquals("S/ehjks;O/ejs;P/ehjksu;C/ehjksu;T/hks;E/hks", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg5Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;O;P;C;T;E#h;j;k;q;s;u;w#S/EPEEu,EhE,O,S,j;O/e,jSsTE,s;P/CCOu,OSkPu,S,SO,jTs;C/ESS,PTqE,S,TS,TTu,e;T/E,T,TESw,TSTE,TkTE,kCSTT,s;E/Ew,T,hOwEw");
		assertEquals("S/$hjksuw;O/$hjksuw;P/hksu;C/hjksu;T/$hjkqsuw;E/$hjkqsuw", cfgFirstFollow.follow());
	}

}