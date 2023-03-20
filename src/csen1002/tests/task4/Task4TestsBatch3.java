package csen1002.tests.task4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task4.CfgEpsUnitElim;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task4TestsBatch3 {

	@Test
	public void testCfgEpsilonRuleElimination1() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;G;A;Q;Y#j;m;v;z#S/GQj,Q,QAmSQ;G/GGm,QzSYj,S,e,j;A/GA,Q,S,e,jQS,mQjYj,vAmGm;Q/Q,QGYSS,S,SG,YGA,mG;Y/YvQ,mQS");
		cfgEpsUnitElim.eliminateEpsilonRules();
		assertEquals("S;G;A;Q;Y#j;m;v;z#S/GQj,Q,QAmSQ,Qj,QmSQ;G/GGm,Gm,QzSYj,S,j,m;A/A,G,GA,Q,S,jQS,mQjYj,vAmGm,vAmm,vmGm,vmm;Q/Q,QGYSS,QYSS,S,SG,Y,YA,YG,YGA,m,mG;Y/YvQ,mQS", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonRuleElimination2() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;J;G;D;V;K;Z#l;q;w;x;z#S/VDZD,Z;J/GlVlJ,V,ZqJ,e;G/S,SS,wJSw;D/K,KJ,ZSGDz,ZZlDG;V/D,G,J,KV,KxDG,e,qDKq;K/S,SqDZ,lZ,qDx;Z/qGx,wSKVZ");
		cfgEpsUnitElim.eliminateEpsilonRules();
		assertEquals("S;J;G;D;V;K;Z#l;q;w;x;z#S/DZD,VDZD,Z;J/GlVl,GlVlJ,Gll,GllJ,V,Zq,ZqJ;G/S,SS,wJSw,wSw;D/K,KJ,ZSGDz,ZZlDG;V/D,G,J,K,KV,KxDG,qDKq;K/S,SqDZ,lZ,qDx;Z/qGx,wSKVZ,wSKZ", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonRuleElimination3() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;Y;R;F;B#b;d;i;k;z#S/F,RRk,S,SYzRF,bFBR,d;Y/R,S,Y,bS,e,kR,z;R/BkFb,S,Y,e,z;F/Fd,dSRF,iBYi,iYiBz;B/Y,bSSSR");
		cfgEpsUnitElim.eliminateEpsilonRules();
		assertEquals("S;Y;R;F;B#b;d;i;k;z#S/F,RRk,Rk,S,SYzF,SYzRF,SzF,SzRF,bF,bFB,bFBR,bFR,d,k;Y/R,S,Y,bS,k,kR,z;R/BkFb,S,Y,kFb,z;F/Fd,dSF,dSRF,iBYi,iBi,iYi,iYiBz,iYiz,ii,iiBz,iiz;B/Y,bSSS,bSSSR", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgUnitRuleElimination1() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;H;W;F;A;G;N#i;k;s;t;z#S/GAkAW,NFAkN,tA;H/FWN,HFzFz,WsG;W/A,GkW,kSWWW,sSiFF,sWNN;F/H,zSGFN;A/HA,W,sGFt;G/AiSSs,At,S,W;N/AsN,GHFHN,sSWAz");
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;H;W;F;A;G;N#i;k;s;t;z#S/GAkAW,NFAkN,tA;H/FWN,HFzFz,WsG;W/GkW,HA,kSWWW,sGFt,sSiFF,sWNN;F/FWN,HFzFz,WsG,zSGFN;A/GkW,HA,kSWWW,sGFt,sSiFF,sWNN;G/AiSSs,At,GAkAW,GkW,HA,NFAkN,kSWWW,sGFt,sSiFF,sWNN,tA;N/AsN,GHFHN,sSWAz", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgUnitRuleElimination2() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;X;N;J;G#b;c;o;r#S/GrX,J,NNrJ,SGNG,cJr;X/N,bGXNS,bS,cS;N/N,SoN,SrSX,XJSbX,cSb;J/J,N,S,o,oSJ,rNNJ;G/GN,N,NNrN,SoXJJ");
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;X;N;J;G#b;c;o;r#S/GrX,NNrJ,SGNG,SoN,SrSX,XJSbX,cJr,cSb,o,oSJ,rNNJ;X/SoN,SrSX,XJSbX,bGXNS,bS,cS,cSb;N/SoN,SrSX,XJSbX,cSb;J/GrX,NNrJ,SGNG,SoN,SrSX,XJSbX,cJr,cSb,o,oSJ,rNNJ;G/GN,NNrN,SoN,SoXJJ,SrSX,XJSbX,cSb", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgUnitRuleElimination3() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;E;W;D;K#d;f;u#S/D,dDW,dWfED,fDE;E/ESDD,S,W,u,uEDdS;W/E,K,S,uDK;D/E,KWK,S,dSDf;K/DK,dSKS,uEEu");
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;E;W;D;K#d;f;u#S/DK,ESDD,KWK,dDW,dSDf,dSKS,dWfED,fDE,u,uDK,uEDdS,uEEu;E/DK,ESDD,KWK,dDW,dSDf,dSKS,dWfED,fDE,u,uDK,uEDdS,uEEu;W/DK,ESDD,KWK,dDW,dSDf,dSKS,dWfED,fDE,u,uDK,uEDdS,uEEu;D/DK,ESDD,KWK,dDW,dSDf,dSKS,dWfED,fDE,u,uDK,uEDdS,uEEu;K/DK,dSKS,uEEu", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination1() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;Y;G;E;J;R;D#h;j;o;u#S/EoRhG,jEh,jRJo;Y/EYo,G,J,JhS,RJ,e;G/DEJ,J,Ju,e;E/GoYY,SEEjD,SSuJS,YSjJG,e;J/G,Y,YhR;R/GoS,S,hRj,oGjY;D/EYjJh,S,uGoG,uYR");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;Y;G;E;J;R;D#h;j;o;u#S/EoRh,EoRhG,jEh,jRJo,jRo,jh,oRh,oRhG;Y/DE,DEJ,DJ,EYjJh,EYjh,EYo,EjJh,Ejh,Eo,EoRh,EoRhG,GoS,JhS,Ju,RJ,YhR,YjJh,Yjh,Yo,hR,hRj,hS,jEh,jJh,jRJo,jRo,jh,o,oGj,oGjY,oRh,oRhG,oS,oj,ojY,u,uGo,uGoG,uR,uYR,uo,uoG;G/DE,DEJ,DJ,EYjJh,EYjh,EYo,EjJh,Ejh,Eo,EoRh,EoRhG,GoS,JhS,Ju,RJ,YhR,YjJh,Yjh,Yo,hR,hRj,hS,jEh,jJh,jRJo,jRo,jh,o,oGj,oGjY,oRh,oRhG,oS,oj,ojY,u,uGo,uGoG,uR,uYR,uo,uoG;E/Go,GoY,GoYY,SEEjD,SEjD,SSuJS,SSuS,Sj,SjD,SjG,SjJ,SjJG,YSj,YSjG,YSjJ,YSjJG,o,oY,oYY;J/DE,DEJ,DJ,EYjJh,EYjh,EYo,EjJh,Ejh,Eo,EoRh,EoRhG,GoS,JhS,Ju,RJ,YhR,YjJh,Yjh,Yo,hR,hRj,hS,jEh,jJh,jRJo,jRo,jh,o,oGj,oGjY,oRh,oRhG,oS,oj,ojY,u,uGo,uGoG,uR,uYR,uo,uoG;R/EoRh,EoRhG,GoS,hRj,jEh,jRJo,jRo,jh,oGj,oGjY,oRh,oRhG,oS,oj,ojY;D/EYjJh,EYjh,EjJh,Ejh,EoRh,EoRhG,YjJh,Yjh,jEh,jJh,jRJo,jRo,jh,oRh,oRhG,uGo,uGoG,uR,uYR,uo,uoG", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination2() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;G;X;D;H;T;N#a;j;o;p;u#S/DS,X,j,oNoN,p;G/G,aHHDo,e,o,pHSaT,uDuN;X/D,HN;D/D,HHj,S,SH,X,u;H/STXpX,e,uXuNu;T/T,XSGaX,e,pGaHH;N/HHo,THoT,pNN,uGS");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;G;X;D;H;T;N#a;j;o;p;u#S/DS,HHj,HHo,HN,Hj,Ho,HoT,SH,THo,THoT,To,ToT,j,o,oNoN,oT,p,pNN,u,uGS,uS;G/aDo,aHDo,aHHDo,o,pHSa,pHSaT,pSa,pSaT,uDuN;X/DS,HHj,HHo,HN,Hj,Ho,HoT,SH,THo,THoT,To,ToT,j,o,oNoN,oT,p,pNN,u,uGS,uS;D/DS,HHj,HHo,HN,Hj,Ho,HoT,SH,THo,THoT,To,ToT,j,o,oNoN,oT,p,pNN,u,uGS,uS;H/STXpX,SXpX,uXuNu;T/XSGaX,XSaX,pGa,pGaH,pGaHH,pa,paH,paHH;N/HHo,Ho,HoT,THo,THoT,To,ToT,o,oT,pNN,uGS,uS", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination3() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;J;X;W;L;T#d;s;t;z#S/JWJdS,S,WzTTL;J/T,XzX,e,sS;X/StXLT,zSJsW;W/J,LSJS,X,XtS,tLWd;L/J,e,sLWWs,tW,zXsLL;T/LXsJd,WsLW,XtJ,zSz");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;J;X;W;L;T#d;s;t;z#S/JJdS,JWJdS,JWdS,JdS,WJdS,WdS,WzTT,WzTTL,dS,zTT,zTTL;J/LXsJd,LXsd,Ws,WsL,WsLW,WsW,XsJd,Xsd,Xt,XtJ,XzX,s,sL,sLW,sS,sW,zSz;X/StXLT,StXT,zSJs,zSJsW,zSs,zSsW;W/LSJS,LSS,LXsJd,LXsd,SJS,SS,StXLT,StXT,Ws,WsL,WsLW,WsW,XsJd,Xsd,Xt,XtJ,XtS,XzX,s,sL,sLW,sS,sW,tLWd,tLd,tWd,td,zSJs,zSJsW,zSs,zSsW,zSz;L/LXsJd,LXsd,Ws,WsL,WsLW,WsW,XsJd,Xsd,Xt,XtJ,XzX,s,sL,sLW,sLWWs,sLWs,sLs,sS,sW,sWWs,sWs,ss,t,tW,zSz,zXs,zXsL,zXsLL;T/LXsJd,LXsd,Ws,WsL,WsLW,WsW,XsJd,Xsd,Xt,XtJ,s,sL,sLW,sW,zSz", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination4() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;U;N;R;F;A#g;m;s;t;u#S/Ag,AsUS,USt,mNsU;U/N,gAtFN,mNtA,mU,uUFS;N/NmR,NuNsA,U;R/AtSR,S,U,UU,e,sSNNg;F/A,NuF,e;A/NSSg,m,mRR,uRmAs");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;U;N;R;F;A#g;m;s;t;u#S/Ag,AsUS,USt,mNsU;U/Nm,NmR,NuNsA,gAtFN,gAtN,mNtA,mU,uUFS,uUS;N/Nm,NmR,NuNsA,gAtFN,gAtN,mNtA,mU,uUFS,uUS;R/Ag,AsUS,AtS,AtSR,Nm,NmR,NuNsA,USt,UU,gAtFN,gAtN,mNsU,mNtA,mU,sSNNg,uUFS,uUS;F/NSSg,Nu,NuF,m,mR,mRR,uRmAs,umAs;A/NSSg,m,mR,mRR,uRmAs,umAs", cfgEpsUnitElim.toString());
	}

}