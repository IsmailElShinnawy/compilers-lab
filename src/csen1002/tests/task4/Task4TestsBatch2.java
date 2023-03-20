package csen1002.tests.task4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task4.CfgEpsUnitElim;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task4TestsBatch2 {

	@Test
	public void testCfgEpsilonRuleElimination1() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;W;Q;Z;U;J;M#g;n;t;u#S/SgM,uMnQJ;W/Q,S,SQgZ,e,uQZW;Q/J,e,nW,nWtMZ,t,uMuSZ;Z/Q,SuZg,UJgJS;U/J,JnQ,MnStU,t;J/JJgSS,S,WuW;M/QuQ,SQZ,UnU,WQ");
		cfgEpsUnitElim.eliminateEpsilonRules();
		assertEquals("S;W;Q;Z;U;J;M#g;n;t;u#S/Sg,SgM,uMnJ,uMnQJ,unJ,unQJ;W/Q,S,SQg,SQgZ,Sg,SgZ,u,uQ,uQW,uQZ,uQZW,uW,uZ,uZW;Q/J,n,nW,nWt,nWtM,nWtMZ,nWtZ,nt,ntM,ntMZ,ntZ,t,uMuS,uMuSZ,uuS,uuSZ;Z/Q,SuZg,Sug,UJgJS;U/J,Jn,JnQ,MnStU,nStU,t;J/JJgSS,S,Wu,WuW,u,uW;M/Q,Qu,QuQ,S,SQ,SQZ,SZ,UnU,W,WQ,u,uQ", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonRuleElimination2() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;M;T;U;H;F#f;g;q#S/FMFgU,FSHfH,H,S,fT;M/FSS,H,e,qSgM;T/HgTTg,M,T,q,qUSf;U/H,T,TqF,U,e,g;H/MqUUT,UUHq,UqHUF,gF;F/UgH,g,q");
		cfgEpsUnitElim.eliminateEpsilonRules();
		assertEquals("S;M;T;U;H;F#f;g;q#S/FFg,FFgU,FMFg,FMFgU,FSHfH,H,S,f,fT;M/FSS,H,qSg,qSgM;T/HgTTg,HgTg,Hgg,M,T,q,qSf,qUSf;U/H,T,TqF,U,g,qF;H/Hq,Mq,MqT,MqU,MqUT,MqUU,MqUUT,UHq,UUHq,UqHF,UqHUF,gF,q,qHF,qHUF,qT,qU,qUT,qUU,qUUT;F/UgH,g,gH,q", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonRuleElimination3() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;M;Z;O;K;H;X#c;j;l;o;t#S/MlZ,OKl;M/H,K,M,McKo,Xt,e,j;Z/K,MjKtM,e,j,tSZH;O/SHKX,jZZ;K/H,e,jS;H/H,HMXcM,KS;X/OlHMM,ZXZ,jZ,lOX");
		cfgEpsUnitElim.eliminateEpsilonRules();
		assertEquals("S;M;Z;O;K;H;X#c;j;l;o;t#S/Ml,MlZ,OKl,Ol,l,lZ;M/H,K,M,McKo,Mco,Xt,cKo,co,j;Z/K,MjKt,MjKtM,Mjt,MjtM,j,jKt,jKtM,jt,jtM,tSH,tSZH;O/SHKX,SHX,j,jZ,jZZ;K/H,jS;H/H,HMXc,HMXcM,HXc,HXcM,KS,S;X/OlH,OlHM,OlHMM,X,XZ,ZX,ZXZ,j,jZ,lOX", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgUnitRuleElimination1() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;G;Q;F;Z;M#a;d;p;u;w#S/GuMw,QFa,pFS;G/S,SQS,pM,uFS,wM;Q/Z,dMpG;F/F,SG,SpF,Z,aM;Z/G,aG,dSGwQ,uZaMS,wSMd;M/S,aQdS");
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;G;Q;F;Z;M#a;d;p;u;w#S/GuMw,QFa,pFS;G/GuMw,QFa,SQS,pFS,pM,uFS,wM;Q/GuMw,QFa,SQS,aG,dMpG,dSGwQ,pFS,pM,uFS,uZaMS,wM,wSMd;F/GuMw,QFa,SG,SQS,SpF,aG,aM,dSGwQ,pFS,pM,uFS,uZaMS,wM,wSMd;Z/GuMw,QFa,SQS,aG,dSGwQ,pFS,pM,uFS,uZaMS,wM,wSMd;M/GuMw,QFa,aQdS,pFS", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgUnitRuleElimination2() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;C;Y;R;V;B;O#c;n;p;v#S/V,VcYv,Vv,cC;C/C,RBYV,cO,nY;Y/B,CBR,VBYSC,nRYYv;R/CO,Y,vR;V/cOn,cYSnS;B/VVBnB,VvYR,Y,pRYnV;O/B,SScSO,VY,pBY");
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;C;Y;R;V;B;O#c;n;p;v#S/VcYv,Vv,cC,cOn,cYSnS;C/RBYV,cO,nY;Y/CBR,VBYSC,VVBnB,VvYR,nRYYv,pRYnV;R/CBR,CO,VBYSC,VVBnB,VvYR,nRYYv,pRYnV,vR;V/cOn,cYSnS;B/CBR,VBYSC,VVBnB,VvYR,nRYYv,pRYnV;O/CBR,SScSO,VBYSC,VVBnB,VY,VvYR,nRYYv,pBY,pRYnV", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgUnitRuleElimination3() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;L;A;Y;B#a;r;z#S/BSYr,L,Y,z,zLrB;L/A,Br,LA,SAYz;A/AA,AzLSL,L,Yz,rS;Y/S,YzA,zBaYA,zLrLS;B/Aa,a,aA,rB");
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;L;A;Y;B#a;r;z#S/AA,AzLSL,BSYr,Br,LA,SAYz,Yz,YzA,rS,z,zBaYA,zLrB,zLrLS;L/AA,AzLSL,Br,LA,SAYz,Yz,rS;A/AA,AzLSL,Br,LA,SAYz,Yz,rS;Y/AA,AzLSL,BSYr,Br,LA,SAYz,Yz,YzA,rS,z,zBaYA,zLrB,zLrLS;B/Aa,a,aA,rB", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination1() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;B;A;P;O;X#k;l;y#S/B,kAA,kPyXX;B/S,lSSkA,lSlS,yA,yOBX;A/Ay,O,SyO,k,kXSBk;P/A,B,BkO,e,lOk;O/S,SO,e,y;X/OPP,lAXyB,lXlXk,yB");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;B;A;P;O;X#k;l;y#S/k,kA,kAA,kPy,kPyX,kPyXX,ky,kyX,kyXX,lSSk,lSSkA,lSlS,y,yA,yB,yBX,yOB,yOBX;B/k,kA,kAA,kPy,kPyX,kPyXX,ky,kyX,kyXX,lSSk,lSSkA,lSlS,y,yA,yB,yBX,yOB,yOBX;A/Ay,SO,Sy,SyO,k,kA,kAA,kPy,kPyX,kPyXX,kSBk,kXSBk,ky,kyX,kyXX,lSSk,lSSkA,lSlS,y,yA,yB,yBX,yOB,yOBX;P/Ay,Bk,BkO,SO,Sy,SyO,k,kA,kAA,kPy,kPyX,kPyXX,kSBk,kXSBk,ky,kyX,kyXX,lOk,lSSk,lSSkA,lSlS,lk,y,yA,yB,yBX,yOB,yOBX;O/SO,k,kA,kAA,kPy,kPyX,kPyXX,ky,kyX,kyXX,lSSk,lSSkA,lSlS,y,yA,yB,yBX,yOB,yOBX;X/Ay,Bk,BkO,OP,OPP,PP,SO,Sy,SyO,k,kA,kAA,kPy,kPyX,kPyXX,kSBk,kXSBk,ky,kyX,kyXX,lAXyB,lAyB,lOk,lSSk,lSSkA,lSlS,lXlXk,lXlk,lXyB,lk,llXk,llk,lyB,y,yA,yB,yBX,yOB,yOBX", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination2() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;R;K;O;D;C;E#n;o;w;y#S/KoKEO,S,SwCyR,oCRwC,ySo;R/DEwKo,KKn,e,w,y;K/D,DSC,O,S,e;O/EC,K,OoKCw;D/CyKwK,O,e,nOE,nS;C/nSD,oE;E/ERSo,KDyD,oK,yR");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;R;K;O;D;C;E#n;o;w;y#S/KoE,KoEO,KoKE,KoKEO,SwCy,SwCyR,oCRwC,oCwC,oE,oEO,oKE,oKEO,ySo;R/DEwKo,DEwo,EwKo,Ewo,KKn,Kn,n,w,y;K/CyKw,CyKwK,Cyw,CywK,DSC,EC,KoE,KoEO,KoKE,KoKEO,OoCw,OoKCw,SC,SwCy,SwCyR,nE,nOE,nS,oCRwC,oCw,oCwC,oE,oEO,oKCw,oKE,oKEO,ySo;O/CyKw,CyKwK,Cyw,CywK,DSC,EC,KoE,KoEO,KoKE,KoKEO,OoCw,OoKCw,SC,SwCy,SwCyR,nE,nOE,nS,oCRwC,oCw,oCwC,oE,oEO,oKCw,oKE,oKEO,ySo;D/CyKw,CyKwK,Cyw,CywK,DSC,EC,KoE,KoEO,KoKE,KoKEO,OoCw,OoKCw,SC,SwCy,SwCyR,nE,nOE,nS,oCRwC,oCw,oCwC,oE,oEO,oKCw,oKE,oKEO,ySo;C/nS,nSD,oE;E/Dy,DyD,ERSo,ESo,KDy,KDyD,Ky,KyD,o,oK,y,yD,yR", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination3() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;O;B;M;N#p;q;u;y#S/BSN,NSBSu,u;O/M,OqB,S,e;B/NuO,S,SyBqS,pMyMu,qSyB;M/ByNO,M,N,e;N/NO,ONM,pOOu,uOpSB");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;O;B;M;N#p;q;u;y#S/BSN,NSBSu,u;O/BSN,ByN,ByNO,NM,NO,NSBSu,ON,ONM,OqB,pOOu,pOu,pu,qB,u,uOpSB,upSB;B/BSN,NSBSu,Nu,NuO,SyBqS,pMyMu,pMyu,pyMu,pyu,qSyB,u;M/ByN,ByNO,NM,NO,ON,ONM,pOOu,pOu,pu,uOpSB,upSB;N/NM,NO,ON,ONM,pOOu,pOu,pu,uOpSB,upSB", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination4() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;Y;O;I;J;G#c;g;h#S/S,c,cGJJ,cGSO,h;Y/IgJ,O,S,gIhOc;O/I,J,OhOIg,e;I/OIYhY,ShGJ,e,gYYg;J/ScYg,cYYIh;G/IIhSc,Yh");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;Y;O;I;J;G#c;g;h#S/c,cGJJ,cGS,cGSO,h;Y/IYh,IYhY,IgJ,Ih,IhY,OIYh,OIYhY,OIh,OIhY,OYh,OYhY,Oh,OhIg,OhOIg,OhOg,OhY,Ohg,ScYg,Scg,ShGJ,Yh,YhY,c,cGJJ,cGS,cGSO,cIh,cYIh,cYYIh,cYYh,cYh,ch,gIhOc,gIhc,gJ,gYYg,gYg,gg,ghOc,ghc,h,hIg,hOIg,hOg,hY,hg;O/IYh,IYhY,Ih,IhY,OIYh,OIYhY,OIh,OIhY,OYh,OYhY,Oh,OhIg,OhOIg,OhOg,OhY,Ohg,ScYg,Scg,ShGJ,Yh,YhY,cIh,cYIh,cYYIh,cYYh,cYh,ch,gYYg,gYg,gg,h,hIg,hOIg,hOg,hY,hg;I/IYh,IYhY,Ih,IhY,OIYh,OIYhY,OIh,OIhY,OYh,OYhY,Oh,OhY,ShGJ,Yh,YhY,gYYg,gYg,gg,h,hY;J/ScYg,Scg,cIh,cYIh,cYYIh,cYYh,cYh,ch;G/IIhSc,IhSc,Yh,h,hSc", cfgEpsUnitElim.toString());
	}

}