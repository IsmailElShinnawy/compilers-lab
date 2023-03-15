package csen1002.tests.task4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task4.CfgEpsUnitElim;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task4TestsBatch0 {

	@Test
	public void testCfgEpsilonRuleElimination1() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;O;T;A;K;V#c;g;h;s;t#S/gAVA,tOKh;O/A,SsOAO,T,V,e,tVVO;T/A,KTVK,e;A/AThO,K,OSc,S,SOKt,TtTOs;K/A,AgTSs,V,e,gOOO;V/KVKK,cTA");
		cfgEpsUnitElim.eliminateEpsilonRules();
		assertEquals("S;O;T;A;K;V#c;g;h;s;t#S/gAV,gAVA,gV,gVA,tKh,tOKh,tOh,th;O/A,Ss,SsA,SsAO,SsO,SsOA,SsOAO,SsOO,T,V,tVV,tVVO;T/A,KTV,KTVK,KV,KVK,TV,TVK,V,VK;A/ATh,AThO,Ah,AhO,K,OSc,S,SKt,SOKt,SOt,Sc,St,Th,ThO,TtOs,TtTOs,TtTs,Tts,h,hO,tOs,tTOs,tTs,ts;K/A,AgSs,AgTSs,V,g,gO,gOO,gOOO,gSs,gTSs;V/KV,KVK,KVKK,V,VK,VKK,c,cA,cT,cTA", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonRuleElimination2() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;J;W;L;Q;G;D#l;o;u;x#S/D,x,xWl;J/J,JWG,L,SoLSQ,WxDo,e;W/J,SLJ,e,lD,x,xGJ;L/G,GxQQ,S,o;Q/GDQo,Lo,S,lQWGu;G/L,lQ,o,xSJQG;D/WJJQ,oG,xG");
		cfgEpsUnitElim.eliminateEpsilonRules();
		assertEquals("S;J;W;L;Q;G;D#l;o;u;x#S/D,x,xWl,xl;J/G,J,JG,JWG,L,SoLSQ,WG,WxDo,xDo;W/J,SL,SLJ,lD,x,xG,xGJ;L/G,GxQQ,S,o;Q/GDQo,Lo,S,lQGu,lQWGu;G/L,lQ,o,xSJQG,xSQG;D/JJQ,JQ,Q,WJJQ,WJQ,WQ,oG,xG", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonRuleElimination3() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;X;C;B;Z;H;M#a;d;h;t;x#S/BM,Hd,S,ShSdC,xBx;X/Bt,CBtXH,d,e,x;C/e,tBhMt,xXZtX;B/S,e,xHMBC;Z/B,MaB,SC,SSMd,aSCCH;H/H,Sx,a,tXaCS;M/BXZBS,BhCdZ,ZStH,tHx");
		cfgEpsUnitElim.eliminateEpsilonRules();
		assertEquals("S;X;C;B;Z;H;M#a;d;h;t;x#S/BM,Hd,M,S,ShSd,ShSdC,xBx,xx;X/Bt,BtH,BtXH,CBtH,CBtXH,CtH,CtXH,d,t,tH,tXH,x;C/tBhMt,thMt,xXZt,xXZtX,xXt,xXtX,xZt,xZtX,xt,xtX;B/S,xHM,xHMB,xHMBC,xHMC;Z/B,Ma,MaB,S,SC,SSMd,aSCCH,aSCH,aSH;H/H,Sx,a,tXaCS,tXaS,taCS,taS;M/BBS,BS,BXBS,BXS,BXZBS,BXZS,BZBS,BZS,BhCd,BhCdZ,Bhd,BhdZ,S,StH,XBS,XS,XZBS,XZS,ZBS,ZS,ZStH,hCd,hCdZ,hd,hdZ,tHx", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgUnitRuleElimination1() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;D;M;T;H;J;Z#f;l;z#S/H,HDlH,J,fMlMl,zZzHZ;D/D,JzSzZ,M,MzTlM;M/D,H,TfH;T/DlZS,M;H/MHz,zDHS,zDJZz;J/D,H,SHTD,TfDzZ;Z/SlJSH,lSfS");
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;D;M;T;H;J;Z#f;l;z#S/HDlH,JzSzZ,MHz,MzTlM,SHTD,TfDzZ,TfH,fMlMl,zDHS,zDJZz,zZzHZ;D/JzSzZ,MHz,MzTlM,TfH,zDHS,zDJZz;M/JzSzZ,MHz,MzTlM,TfH,zDHS,zDJZz;T/DlZS,JzSzZ,MHz,MzTlM,TfH,zDHS,zDJZz;H/MHz,zDHS,zDJZz;J/JzSzZ,MHz,MzTlM,SHTD,TfDzZ,TfH,zDHS,zDJZz;Z/SlJSH,lSfS", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgUnitRuleElimination2() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;V;I;F;Q;T;X#g;l;s#S/T,VVl,g,gXVX;V/Q,QFX,SSs,T,V,VXX;I/S,SsQsS,sXVlX;F/TVTXX,XlTT,lIIQg,sSsIl;Q/TVQ,s;T/lVlIF,sTFF,sTl;X/TFIgV,l,lFsXl,sS");
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;V;I;F;Q;T;X#g;l;s#S/VVl,g,gXVX,lVlIF,sTFF,sTl;V/QFX,SSs,TVQ,VXX,lVlIF,s,sTFF,sTl;I/SsQsS,VVl,g,gXVX,lVlIF,sTFF,sTl,sXVlX;F/TVTXX,XlTT,lIIQg,sSsIl;Q/TVQ,s;T/lVlIF,sTFF,sTl;X/TFIgV,l,lFsXl,sS", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgUnitRuleElimination3() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;J;E;M;A;D#b;n;q#S/AbDqD,DAJAb,J,nEbJ;J/A,DbSbS,EqD,JDSJ;E/EJb,bJAnA;M/MnSJJ,nESJ,nMn;A/DSbE,M,nASb;D/DAMb,DD");
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;J;E;M;A;D#b;n;q#S/AbDqD,DAJAb,DSbE,DbSbS,EqD,JDSJ,MnSJJ,nASb,nESJ,nEbJ,nMn;J/DSbE,DbSbS,EqD,JDSJ,MnSJJ,nASb,nESJ,nMn;E/EJb,bJAnA;M/MnSJJ,nESJ,nMn;A/DSbE,MnSJJ,nASb,nESJ,nMn;D/DAMb,DD", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination1() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;A;E;C;O#d;g;l#S/C,S,SCdA,SlOAO,l;A/CdCS,SlOCA,dA,dCEgS,e;E/A,C,E,O,S,e,l;C/dCE,gCl;O/dOg,lOA");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;A;E;C;O#d;g;l#S/SCd,SCdA,SlOAO,SlOO,dC,dCE,gCl,l;A/CdCS,SlOC,SlOCA,d,dA,dCEgS,dCgS;E/CdCS,SCd,SCdA,SlOAO,SlOC,SlOCA,SlOO,d,dA,dC,dCE,dCEgS,dCgS,dOg,gCl,l,lO,lOA;C/dC,dCE,gCl;O/dOg,lO,lOA", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination2() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;R;X;A;C#d;l;n;o#S/Xo,nRXlX,nSoS;R/A,CX,X,e,lCS,lXXXo;X/A,AdRX,dCR,e;A/X,XR,e,nCd;C/CoAo,n,nR");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;R;X;A;C#d;l;n;o#S/Xo,nRXl,nRXlX,nRl,nRlX,nSoS,nXl,nXlX,nl,nlX,o;R/Ad,AdR,AdRX,AdX,CX,CoAo,Coo,XR,d,dC,dCR,dR,dRX,dX,lCS,lXXXo,lXXo,lXo,lo,n,nCd,nR;X/Ad,AdR,AdRX,AdX,CX,CoAo,Coo,XR,d,dC,dCR,dR,dRX,dX,lCS,lXXXo,lXXo,lXo,lo,n,nCd,nR;A/Ad,AdR,AdRX,AdX,CX,CoAo,Coo,XR,d,dC,dCR,dR,dRX,dX,lCS,lXXXo,lXXo,lXo,lo,n,nCd,nR;C/CoAo,Coo,n,nR", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination3() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;H;N;K;O;Z;F#c;f;q;x#S/cOfO,cZ,xScOF;H/K,O,SxK,e,fSNq,x;N/KZc,Z,f,xOFc;K/cN,q;O/Nx,O,e,fNOc,qSSx;Z/HZq,K,O,e,xHc;F/FqZ,NNS,cHNH,xS");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;H;N;K;O;Z;F#c;f;q;x#S/c,cOf,cOfO,cZ,cf,cfO,xScF,xScOF;H/Nx,SxK,c,cN,fNOc,fNc,fOc,fSNq,fSq,fc,q,qSSx,x;N/HZq,Hq,KZc,Kc,Nx,Zq,c,cN,f,fNOc,fNc,fOc,fc,q,qSSx,x,xFc,xHc,xOFc,xc;K/c,cN,q;O/Nx,fNOc,fNc,fOc,fc,qSSx,x;Z/HZq,Hq,Nx,Zq,c,cN,fNOc,fNc,fOc,fc,q,qSSx,x,xHc,xc;F/Fq,FqZ,NNS,NS,c,cH,cHH,cHN,cHNH,cN,cNH,cOf,cOfO,cZ,cf,cfO,xS,xScF,xScOF", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination4() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;G;F;B;W;J#h;j;x;y#S/GxG,S,hFhS,x;G/WSh,e,jShW;F/J,JyGW,x,yJ;B/FW,SSS,e;W/B,G,S,W,WJhG,e,xBFWS;J/hFxFj,hGBj,x");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;G;F;B;W;J#h;j;x;y#S/Gx,GxG,hFhS,x,xG;G/Sh,WSh,jSh,jShW;F/Jy,JyG,JyGW,JyW,hBj,hFxFj,hGBj,hGj,hj,x,yJ;B/FW,Jy,JyG,JyGW,JyW,SSS,hBj,hFxFj,hGBj,hGj,hj,x,yJ;W/FW,Gx,GxG,Jh,JhG,Jy,JyG,JyGW,JyW,SSS,Sh,WJh,WJhG,WSh,hBj,hFhS,hFxFj,hGBj,hGj,hj,jSh,jShW,x,xBFS,xBFWS,xFS,xFWS,xG,yJ;J/hBj,hFxFj,hGBj,hGj,hj,x", cfgEpsUnitElim.toString());
	}

}