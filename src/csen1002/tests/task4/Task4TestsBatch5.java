package csen1002.tests.task4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task4.CfgEpsUnitElim;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task4TestsBatch5 {

	@Test
	public void testCfgEpsilonRuleElimination1() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;H;G;L;O;A;U#a;g;s#S/AsLGS,aS;H/AGSLS,G,LgOHA,OHSL,e;G/A,HsUaH,OsGSs,sS;L/S,UAaOO,gS;O/GgS,OSsGg,e;A/G,O,S,aSaGU,gAg;U/gAS,gHaA,gL,sLUL");
		cfgEpsUnitElim.eliminateEpsilonRules();
		assertEquals("S;H;G;L;O;A;U#a;g;s#S/AsLGS,AsLS,aS,sLGS,sLS;H/AGSLS,ASLS,G,GSLS,HSL,Lg,LgA,LgH,LgHA,LgO,LgOA,LgOH,LgOHA,OHSL,OSL,SL,SLS;G/A,HsUa,HsUaH,OsGSs,OsSs,sGSs,sS,sSs,sUa,sUaH;L/S,UAa,UAaO,UAaOO,Ua,UaO,UaOO,gS;O/GgS,OSsGg,OSsg,SsGg,Ssg,gS;A/G,O,S,aSaGU,aSaU,gAg,gg;U/gAS,gHa,gHaA,gL,gS,ga,gaA,sLUL", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonRuleElimination2() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;B;R;O;C#c;p;q;t;u#S/cSqC,pOOtC,tBtS;B/C,S,pCO,tRBu;R/B,CuCRq,e,qOtCB;O/BS,O,RpOcC,e,qOpOu;C/R,SqCO,pC,tRqC");
		cfgEpsUnitElim.eliminateEpsilonRules();
		assertEquals("S;B;R;O;C#c;p;q;t;u#S/cSq,cSqC,pOOt,pOOtC,pOt,pOtC,pt,ptC,tBtS,ttS;B/C,S,p,pC,pCO,pO,tBu,tRBu,tRu,tu;R/B,CuCRq,CuCq,CuRq,Cuq,qOt,qOtB,qOtC,qOtCB,qt,qtB,qtC,qtCB,uCRq,uCq,uRq,uq;O/BS,O,RpOc,RpOcC,Rpc,RpcC,S,pOc,pOcC,pc,pcC,qOpOu,qOpu,qpOu,qpu;C/R,Sq,SqC,SqCO,SqO,p,pC,tRq,tRqC,tq,tqC", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonRuleElimination3() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;X;H;W;U#d;r;x;y#S/HUXXx,S,WWdXX,rUUr;X/H,S,SUS,W,WWUX,e;H/S,XSUX,dHSr,e;W/H,W,WHX,XHH,XXxS,e,xHUxS;U/SW,WHy,WXUXx,XrU");
		cfgEpsUnitElim.eliminateEpsilonRules();
		assertEquals("S;X;H;W;U#d;r;x;y#S/HUXXx,HUXx,HUx,S,UXXx,UXx,Ux,WWd,WWdX,WWdXX,Wd,WdX,WdXX,d,dX,dXX,rUUr;X/H,S,SUS,U,UX,W,WU,WUX,WWU,WWUX;H/S,SU,SUX,XSU,XSUX,dHSr,dSr;W/H,HH,HX,W,WH,WHX,WX,X,XH,XHH,XXxS,XxS,xHUxS,xS,xUxS;U/Hy,S,SW,UXx,Ux,WHy,WUXx,WUx,WXUXx,WXUx,Wy,XUXx,XUx,XrU,rU,y", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgUnitRuleElimination1() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;P;Y;D;T;N#c;d;i;k;q#S/DSD,P;P/Dd,NkYT,S,dSqDk;Y/NkND,T,cDN,cSqSP,k;D/D,TTS,Y,cDkD;T/S,dTqDq,iT;N/NiPD,SP,d");
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;P;Y;D;T;N#c;d;i;k;q#S/DSD,Dd,NkYT,dSqDk;P/DSD,Dd,NkYT,dSqDk;Y/DSD,Dd,NkND,NkYT,cDN,cSqSP,dSqDk,dTqDq,iT,k;D/DSD,Dd,NkND,NkYT,TTS,cDN,cDkD,cSqSP,dSqDk,dTqDq,iT,k;T/DSD,Dd,NkYT,dSqDk,dTqDq,iT;N/NiPD,SP,d", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgUnitRuleElimination2() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;W;Q;D;G;R#b;l;r;s;w#S/G,Ql,SSl,SWr;W/D,DR,WW,rWG;Q/Q,SR,r,rGRQ;D/G,SwQQs,sQG;G/GQDD,S,SsQGG,rDlS;R/GDb,GlGSR,W");
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;W;Q;D;G;R#b;l;r;s;w#S/GQDD,Ql,SSl,SWr,SsQGG,rDlS;W/DR,GQDD,Ql,SSl,SWr,SsQGG,SwQQs,WW,rDlS,rWG,sQG;Q/SR,r,rGRQ;D/GQDD,Ql,SSl,SWr,SsQGG,SwQQs,rDlS,sQG;G/GQDD,Ql,SSl,SWr,SsQGG,rDlS;R/DR,GDb,GQDD,GlGSR,Ql,SSl,SWr,SsQGG,SwQQs,WW,rDlS,rWG,sQG", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgUnitRuleElimination3() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;T;I;E;V#a;c;g;l;t#S/I,S,T,V,cST,gSVVI,gVlT;T/E,Ea,I,cV;I/I,V,VgEVl,cS;E/E,EVV,S,TTtE,aIaVE;V/I,Vc");
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;T;I;E;V#a;c;g;l;t#S/EVV,Ea,TTtE,Vc,VgEVl,aIaVE,cS,cST,cV,gSVVI,gVlT;T/EVV,Ea,TTtE,Vc,VgEVl,aIaVE,cS,cST,cV,gSVVI,gVlT;I/Vc,VgEVl,cS;E/EVV,Ea,TTtE,Vc,VgEVl,aIaVE,cS,cST,cV,gSVVI,gVlT;V/Vc,VgEVl,cS", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination1() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;L;P;Z;J#i;s;y#S/LJP,SyZyL;L/L,P,e,iSSPJ,yZZJy;P/J,JJS,S,ZZL,e;Z/JPPSP,LPi,P,S,sPSi;J/ZSs,iJ,sLPZs");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;L;P;Z;J#i;s;y#S/JP,LJ,LJP,Ss,SyZy,SyZyL,Syy,SyyL,ZSs,iJ,sLPZs,sLPs,sLZs,sLs,sPZs,sPs,sZs,ss;L/JJS,JP,JPPS,JPPSP,JPS,JPSP,JS,JSP,LJ,LJP,LPi,Li,Pi,Ss,SyZy,SyZyL,Syy,SyyL,ZL,ZSs,ZZ,ZZL,i,iJ,iSSJ,iSSPJ,sLPZs,sLPs,sLZs,sLs,sPSi,sPZs,sPs,sSi,sZs,ss,yJy,yZJy,yZZJy;P/JJS,JP,JPPS,JPPSP,JPS,JPSP,JS,JSP,LJ,LJP,LPi,Li,Pi,Ss,SyZy,SyZyL,Syy,SyyL,ZL,ZSs,ZZ,ZZL,i,iJ,iSSJ,iSSPJ,sLPZs,sLPs,sLZs,sLs,sPSi,sPZs,sPs,sSi,sZs,ss,yJy,yZJy,yZZJy;Z/JJS,JP,JPPS,JPPSP,JPS,JPSP,JS,JSP,LJ,LJP,LPi,Li,Pi,Ss,SyZy,SyZyL,Syy,SyyL,ZL,ZSs,ZZ,ZZL,i,iJ,iSSJ,iSSPJ,sLPZs,sLPs,sLZs,sLs,sPSi,sPZs,sPs,sSi,sZs,ss,yJy,yZJy,yZZJy;J/Ss,ZSs,iJ,sLPZs,sLPs,sLZs,sLs,sPZs,sPs,sZs,ss", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination2() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;A;B;N;R;J;E#b;w;y#S/A,bNJw,wE;A/A,AEw,RwSS;B/bAbN,e,wNB;N/JR,NJyJ;R/NEBE,NwJw,e,wRwE,yR;J/A,BwB,N,RJB,S,wA;E/Ab,R");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;A;B;N;R;J;E#b;w;y#S/AEw,Aw,RwSS,bNJw,w,wE,wSS;A/AEw,Aw,RwSS,wSS;B/bAbN,wN,wNB;N/AEw,Aw,Bw,BwB,JB,JR,NJyJ,RJ,RJB,RwSS,bNJw,w,wA,wB,wE,wSS;R/AEw,Aw,Bw,BwB,JB,JR,NB,NBE,NE,NEB,NEBE,NEE,NJyJ,NwJw,RJ,RJB,RwSS,bNJw,w,wA,wB,wE,wRw,wRwE,wSS,ww,wwE,y,yR;J/AEw,Aw,Bw,BwB,JB,JR,NJyJ,RJ,RJB,RwSS,bNJw,w,wA,wB,wE,wSS;E/AEw,Ab,Aw,Bw,BwB,JB,JR,NB,NBE,NE,NEB,NEBE,NEE,NJyJ,NwJw,RJ,RJB,RwSS,bNJw,w,wA,wB,wE,wRw,wRwE,wSS,ww,wwE,y,yR", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination3() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;H;M;K;L#b;d;o#S/HKHS,d;H/H,KMKo,SbL,d,e;M/HL,S,bS,dMSL,e;K/K,d,e,oKoLd,oMM;L/HHSoL,KSLdS,bMHo");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;H;M;K;L#b;d;o#S/HHS,HKHS,HKS,HS,KHS,KS,d;H/KKo,KMKo,KMo,Ko,MKo,Mo,SbL,d,o;M/HHS,HHSoL,HKHS,HKS,HL,HS,HSoL,KHS,KS,KSLdS,SLdS,SoL,bHo,bMHo,bMo,bS,bo,d,dMSL,dSL;K/d,o,oKoLd,oM,oMM,ooLd;L/HHSoL,HSoL,KSLdS,SLdS,SoL,bHo,bMHo,bMo,bo", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination4() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;M;Y;Z;L;G#c;d;f;n;s#S/LSfGf,S,YfY,cLG,cZcMS;M/GnML,L,MsGsY,SGY,nZGfS;Y/LLSL,Y,ZGM,dLSSf,e;Z/MLfLZ,MsZ,e,f;L/M,S,Y,e,fMMY,fZc;G/Lf,f,fSY");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;M;Y;Z;L;G#c;d;f;n;s#S/LSfGf,SfGf,Yf,YfY,cG,cLG,cZcMS,cZcS,ccMS,ccS,f,fY;M/GM,Gn,GnL,GnM,GnML,LLS,LLSL,LS,LSL,LSfGf,Lf,MsGs,MsGsY,SG,SGY,SL,SfGf,Yf,YfY,ZG,ZGM,cG,cLG,cZcMS,cZcS,ccMS,ccS,dLSSf,dSSf,f,fM,fMM,fMMY,fMY,fS,fSY,fY,fZc,fc,nGfS,nZGfS,sGs,sGsY;Y/GM,LLS,LLSL,LS,LSL,LSfGf,Lf,SL,SfGf,Yf,YfY,ZG,ZGM,cG,cLG,cZcMS,cZcS,ccMS,ccS,dLSSf,dSSf,f,fS,fSY,fY;Z/Lf,LfL,LfLZ,LfZ,MLf,MLfL,MLfLZ,MLfZ,Mf,MfL,MfLZ,MfZ,Ms,MsZ,f,fL,fLZ,fZ,s,sZ;L/GM,Gn,GnL,GnM,GnML,LLS,LLSL,LS,LSL,LSfGf,Lf,MsGs,MsGsY,SG,SGY,SL,SfGf,Yf,YfY,ZG,ZGM,cG,cLG,cZcMS,cZcS,ccMS,ccS,dLSSf,dSSf,f,fM,fMM,fMMY,fMY,fS,fSY,fY,fZc,fc,nGfS,nZGfS,sGs,sGsY;G/Lf,f,fS,fSY", cfgEpsUnitElim.toString());
	}

}