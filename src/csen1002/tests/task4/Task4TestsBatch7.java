package csen1002.tests.task4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task4.CfgEpsUnitElim;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task4TestsBatch7 {

	@Test
	public void testCfgEpsilonRuleElimination1() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;Z;P;J;D;W;G#a;i;k;s;t#S/GZi,GaSJs,S,W,aD,tWi;Z/DJ,PaJ,aGtJ,aZW;P/GPJ,GPZk,PS,SPs,e;J/D,DJ,PkSa,WaGaD,Z,e;D/GZG,JW,S,e;W/W,kDSDk,kZZ,sSGG,tPZaZ;G/DDkW,aD,aPsGs,sJWs");
		cfgEpsUnitElim.eliminateEpsilonRules();
		assertEquals("S;Z;P;J;D;W;G#a;i;k;s;t#S/GZi,GaSJs,GaSs,Gi,S,W,a,aD,tWi;Z/D,DJ,J,Pa,PaJ,a,aGt,aGtJ,aJ,aW,aZW;P/G,GJ,GP,GPJ,GPZk,GPk,GZk,Gk,PS,S,SPs,Ss;J/D,DJ,J,PkSa,WaGa,WaGaD,Z,kSa;D/GG,GZG,JW,S,W;W/W,k,kDSDk,kDSk,kSDk,kSk,kZ,kZZ,sSGG,tPZa,tPZaZ,tPa,tPaZ,tZa,tZaZ,ta,taZ;G/DDkW,DkW,a,aD,aPsGs,asGs,kW,sJWs,sWs", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonRuleElimination2() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;G;M;E;B#p;s;t;y#S/Mp,S,Sy,tE;G/B,MB,MG,S,e,s;M/G,GtG,M,pBtS,t,tGSsM;E/E,Es,MEBGp,MMSGB,StSGS,e;B/EtGyS,pGy,t,tGBEp");
		cfgEpsUnitElim.eliminateEpsilonRules();
		assertEquals("S;G;M;E;B#p;s;t;y#S/Mp,S,Sy,p,t,tE;G/B,G,M,MB,MG,S,s;M/G,Gt,GtG,M,pBtS,t,tG,tGSs,tGSsM,tSs,tSsM;E/BGp,Bp,E,EBGp,EBp,Es,MBGp,MBp,MEBGp,MEBp,MMSB,MMSGB,MSB,MSGB,SB,SGB,StSGS,StSS,s;B/EtGyS,EtyS,pGy,py,t,tBEp,tBp,tGBEp,tGBp,tGyS,tyS", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonRuleElimination3() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;P;U;V;J#b;o;t;x#S/VJtU,bJPx,xStS;P/J,P,PPPJ,UxS,e;U/JtPPS,P,PP,bSbS,e,tVU;V/JS,S,U,e;J/PVS,UbSUx,oJtS,tVtP");
		cfgEpsUnitElim.eliminateEpsilonRules();
		assertEquals("S;P;U;V;J#b;o;t;x#S/Jt,JtU,VJt,VJtU,bJPx,bJx,xStS;P/J,P,PJ,PPJ,PPPJ,UxS,xS;U/JtPPS,JtPS,JtS,P,PP,bSbS,t,tU,tV,tVU;V/JS,S,U;J/PS,PVS,S,UbSUx,UbSx,VS,bSUx,bSx,oJtS,tVt,tVtP,tt,ttP", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgUnitRuleElimination1() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;B;O;E;Y;N;Z#a;f;m;w;x#S/B,BYOmB,OON;B/OxB,S,fYBmB,wYx;O/OmSm,Y,ZwBB;E/B,E,SY,Zf,wO;Y/EYaY,wBmEB;N/aS,xO;Z/O,Y,aE");
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;B;O;E;Y;N;Z#a;f;m;w;x#S/BYOmB,OON,OxB,fYBmB,wYx;B/BYOmB,OON,OxB,fYBmB,wYx;O/EYaY,OmSm,ZwBB,wBmEB;E/BYOmB,OON,OxB,SY,Zf,fYBmB,wO,wYx;Y/EYaY,wBmEB;N/aS,xO;Z/EYaY,OmSm,ZwBB,aE,wBmEB", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgUnitRuleElimination2() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;Y;R;Q;P;L#d;h;l;q#S/Q,Y,qQh;Y/R,SSSQ,Y,dSLP,qPYlP;R/Q,RqYYQ,Y,YqRS,lL;Q/QRqR,RLY,S,Y,hSdSd;P/Q,Rd,YdLSQ,lP;L/QQSd,hY");
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;Y;R;Q;P;L#d;h;l;q#S/QRqR,RLY,RqYYQ,SSSQ,YqRS,dSLP,hSdSd,lL,qPYlP,qQh;Y/QRqR,RLY,RqYYQ,SSSQ,YqRS,dSLP,hSdSd,lL,qPYlP,qQh;R/QRqR,RLY,RqYYQ,SSSQ,YqRS,dSLP,hSdSd,lL,qPYlP,qQh;Q/QRqR,RLY,RqYYQ,SSSQ,YqRS,dSLP,hSdSd,lL,qPYlP,qQh;P/QRqR,RLY,Rd,RqYYQ,SSSQ,YdLSQ,YqRS,dSLP,hSdSd,lL,lP,qPYlP,qQh;L/QQSd,hY", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgUnitRuleElimination3() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;J;I;H;W;M#l;r;s;y#S/I,M,MlIM,ySsI;J/HSrS,MI,MSS,yWr;I/WyJ,lSHSJ,rS;H/S,r,sISH,sSSs;W/HS,J,WlJ,l;M/HIr,MM,yH,yJWJH");
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;J;I;H;W;M#l;r;s;y#S/HIr,MM,MlIM,WyJ,lSHSJ,rS,yH,yJWJH,ySsI;J/HSrS,MI,MSS,yWr;I/WyJ,lSHSJ,rS;H/HIr,MM,MlIM,WyJ,lSHSJ,r,rS,sISH,sSSs,yH,yJWJH,ySsI;W/HS,HSrS,MI,MSS,WlJ,l,yWr;M/HIr,MM,yH,yJWJH", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination1() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;T;K;U;M;N#j;k;m;p;r#S/Kr,NNU,S,UKMj,jU;T/TSUKT,e,jS;K/KKr,MKpT,S,U,UmNUN,e;U/SMkT,k,kKS,kTM;M/MT,S,T,Tk,TmKpN,pTjN;N/KNU,SU,SUK,Tj");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;T;K;U;M;N#j;k;m;p;r#S/Kr,NNU,UKMj,UKj,UMj,Uj,jU,r;T/SU,SUK,SUKT,SUT,TSU,TSUK,TSUKT,TSUT,jS;K/KKr,Kp,KpT,Kr,MKp,MKpT,Mp,MpT,NNU,SMk,SMkT,Sk,SkT,UKMj,UKj,UMj,Uj,UmNUN,jU,k,kKS,kM,kS,kT,kTM,p,pT,r;U/SMk,SMkT,Sk,SkT,k,kKS,kM,kS,kT,kTM;M/Kr,MT,NNU,SU,SUK,SUKT,SUT,TSU,TSUK,TSUKT,TSUT,Tk,TmKpN,TmpN,UKMj,UKj,UMj,Uj,jS,jU,k,mKpN,mpN,pTjN,pjN,r;N/KNU,NU,SU,SUK,Tj,j", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination2() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;M;G;H;C;I;V#a;f;x#S/GI,a,fMCxM;M/GHaS,IIHV,MGfVM,S,e;G/G,I,VxSf,a,e,fHG,fSGx;H/G,GfVG,S,VMfM;C/H,Sx,e;I/ISI,S;V/GIaCG,S,xVaGf");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;M;G;H;C;I;V#a;f;x#S/GI,ISI,a,fCx,fCxM,fMCx,fMCxM,fMx,fMxM,fx,fxM;M/GHaS,GI,GaS,GfV,GfVM,HaS,IIHV,IIV,ISI,MGfV,MGfVM,MfV,MfVM,a,aS,fCx,fCxM,fMCx,fMCxM,fMx,fMxM,fV,fVM,fx,fxM;G/GI,ISI,VxSf,a,f,fCx,fCxM,fG,fH,fHG,fMCx,fMCxM,fMx,fMxM,fSGx,fSx,fx,fxM;H/GI,GfV,GfVG,ISI,VMf,VMfM,Vf,VfM,VxSf,a,f,fCx,fCxM,fG,fH,fHG,fMCx,fMCxM,fMx,fMxM,fSGx,fSx,fV,fVG,fx,fxM;C/GI,GfV,GfVG,ISI,Sx,VMf,VMfM,Vf,VfM,VxSf,a,f,fCx,fCxM,fG,fH,fHG,fMCx,fMCxM,fMx,fMxM,fSGx,fSx,fV,fVG,fx,fxM;I/GI,ISI,a,fCx,fCxM,fMCx,fMCxM,fMx,fMxM,fx,fxM;V/GI,GIa,GIaC,GIaCG,GIaG,ISI,Ia,IaC,IaCG,IaG,a,fCx,fCxM,fMCx,fMCxM,fMx,fMxM,fx,fxM,xVaGf,xVaf", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination3() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;E;C;X;M;Z;B#l;p;x#S/SS,SSZlS,p;E/B,SSZS;C/Mx,Xp,e;X/e,lEXl,lSXx,pSxXC;M/C,S,Z,pMXXx;Z/BSpE,E,S,XSpE,e,l,pE;B/BSpE,E");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;E;C;X;M;Z;B#l;p;x#S/SS,SSZlS,SSlS,p;E/BSpE,SSS,SSZS;C/Mx,Xp,p,x;X/lEXl,lEl,lSXx,lSx,pSx,pSxC,pSxX,pSxXC;M/BSpE,Mx,SS,SSS,SSZS,SSZlS,SSlS,SpE,XSpE,Xp,l,p,pE,pMXXx,pMXx,pMx,pXXx,pXx,px,x;Z/BSpE,SS,SSS,SSZS,SSZlS,SSlS,SpE,XSpE,l,p,pE;B/BSpE,SSS,SSZS", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination4() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;T;I;B;O;K#d;i;k;r#S/KkBB,S,iS,kKOr;T/SOBI,d;I/B,I,O,S,SdOTT,T,e,r,rId;B/O,dO,e,r;O/IiK,KIOTK,T,e;K/IOdI,SI,TiO,dKkO");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;T;I;B;O;K#d;i;k;r#S/Kk,KkB,KkBB,iS,kKOr,kKr;T/Kk,KkB,KkBB,SB,SBI,SI,SO,SOB,SOBI,SOI,d,iS,kKOr,kKr;I/IiK,KIOTK,KITK,KOTK,KTK,Kk,KkB,KkBB,SB,SBI,SI,SO,SOB,SOBI,SOI,SdOTT,SdTT,d,dO,iK,iS,kKOr,kKr,r,rId,rd;B/IiK,KIOTK,KITK,KOTK,KTK,Kk,KkB,KkBB,SB,SBI,SI,SO,SOB,SOBI,SOI,d,dO,iK,iS,kKOr,kKr,r;O/IiK,KIOTK,KITK,KOTK,KTK,Kk,KkB,KkBB,SB,SBI,SI,SO,SOB,SOBI,SOI,d,iK,iS,kKOr,kKr;K/IOd,IOdI,Id,IdI,Kk,KkB,KkBB,Od,OdI,SI,Ti,TiO,d,dI,dKk,dKkO,iS,kKOr,kKr", cfgEpsUnitElim.toString());
	}

}