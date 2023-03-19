package csen1002.tests.task4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task4.CfgEpsUnitElim;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task4TestsBatch1 {

	@Test
	public void testCfgEpsilonRuleElimination1() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;P;J;T;O;A#a;k;p;v;x#S/S,TpPPx,aTp,k;P/OxSP,PASpA,S,x,xTx;J/PaA,S,TJpO,e,kTPa;T/AaASS,J,SkP,a,e;O/TSPT,aTJO,kJ,vPOv;A/JA,JxTaJ,k");
		cfgEpsUnitElim.eliminateEpsilonRules();
		assertEquals("S;P;J;T;O;A#a;k;p;v;x#S/S,TpPPx,aTp,ap,k,pPPx;P/OxSP,PASpA,S,x,xTx,xx;J/JpO,PaA,S,TJpO,TpO,kPa,kTPa,pO;T/AaASS,J,SkP,a;O/SP,SPT,TSP,TSPT,aJO,aO,aTJO,aTO,k,kJ,vPOv;A/A,JA,JxTa,JxTaJ,Jxa,JxaJ,k,xTa,xTaJ,xa,xaJ", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonRuleElimination2() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;Y;A;O;G;L;K#c;j;x#S/OAjG,SOxLL;Y/A,LOj,S,Y,e;A/A,GScSY,GcSK,OcSx;O/K,LcY,Y,e,xA;G/KGc,LjLxY,SGcO,YcAxY;L/GSAKx,O,S,SxGA,Y,e,xKcGj;K/KOGG,LGxYj,LxOj,OjA");
		cfgEpsUnitElim.eliminateEpsilonRules();
		assertEquals("S;Y;A;O;G;L;K#c;j;x#S/AjG,OAjG,SOx,SOxL,SOxLL,Sx,SxL,SxLL;Y/A,LOj,Lj,Oj,S,Y,j;A/A,GScS,GScSY,GcSK,OcSx,cSx;O/K,Lc,LcY,Y,c,cY,xA;G/KGc,LjLx,LjLxY,Ljx,LjxY,SGc,SGcO,YcAx,YcAxY,cAx,cAxY,jLx,jLxY,jx,jxY;L/GSAKx,O,S,SxGA,Y,xKcGj;K/GxYj,Gxj,KGG,KOGG,LGxYj,LGxj,LxOj,Lxj,OjA,jA,xOj,xj", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonRuleElimination3() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;F;C;N;L;A;K#a;j;k;p;s#S/AAL,SLSKS,a,kL;F/A,C,CAAC,FjA,L,jFAj;C/LC,N,e,jCjNS,s;N/K,KLp,LNa,S,kNK;L/F,KCa,LCF,e,sK;A/CpFpF,aKsNK,j;K/AsSaF,FF");
		cfgEpsUnitElim.eliminateEpsilonRules();
		assertEquals("S;F;C;N;L;A;K#a;j;k;p;s#S/AA,AAL,SLSKS,SLSS,SSKS,SSS,a,k,kL;F/A,AA,AAC,C,CAA,CAAC,FjA,L,jA,jAj,jFAj;C/C,L,LC,N,jCjNS,jCjS,jjNS,jjS,s;N/K,KLp,Kp,LNa,La,Lp,Na,S,a,k,kK,kN,kNK,p;L/C,CF,Ca,F,KCa,Ka,L,LC,LCF,LF,a,s,sK;A/CpFp,CpFpF,Cpp,CppF,aKs,aKsK,aKsN,aKsNK,as,asK,asN,asNK,j,pFp,pFpF,pp,ppF;K/AsSa,AsSaF,F,FF", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgUnitRuleElimination1() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;X;P;V;R#i;u;y#S/iSiSy,uSXV;X/PyVu,VPX,VuVV;P/PuSR,R,X;V/P,S,SRXi,iP,iPXS,uVVuP;R/SRPiR,VPPu");
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;X;P;V;R#i;u;y#S/iSiSy,uSXV;X/PyVu,VPX,VuVV;P/PuSR,PyVu,SRPiR,VPPu,VPX,VuVV;V/PuSR,PyVu,SRPiR,SRXi,VPPu,VPX,VuVV,iP,iPXS,iSiSy,uSXV,uVVuP;R/SRPiR,VPPu", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgUnitRuleElimination2() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;D;Q;Y;K;U;R#d;j;t#S/QDj,SDdD,Y;D/K,QQQS,SDDSj,YY,tS;Q/DKRd,SQd,t;Y/QDtRQ,Y,dDRYD;K/K,KQDDt,U,d,jQDtU;U/RRS,SS,SSjS,U;R/SdYDK,UdRU,jRR,jUt");
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;D;Q;Y;K;U;R#d;j;t#S/QDj,QDtRQ,SDdD,dDRYD;D/KQDDt,QQQS,RRS,SDDSj,SS,SSjS,YY,d,jQDtU,tS;Q/DKRd,SQd,t;Y/QDtRQ,dDRYD;K/KQDDt,RRS,SS,SSjS,d,jQDtU;U/RRS,SS,SSjS;R/SdYDK,UdRU,jRR,jUt", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgUnitRuleElimination3() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;I;W;N;V;J;H#m;t;w#S/SNHHJ,W,t,wItNI;I/HJSw,HNmJ,NN,w;W/HtVm,IJm,NItVm;N/HwVNw,V,m,wW;V/J,SJwV,VmImH,mS,tSJ;J/Nm,WW,tH;H/SWI,t");
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;I;W;N;V;J;H#m;t;w#S/HtVm,IJm,NItVm,SNHHJ,t,wItNI;I/HJSw,HNmJ,NN,w;W/HtVm,IJm,NItVm;N/HwVNw,Nm,SJwV,VmImH,WW,m,mS,tH,tSJ,wW;V/Nm,SJwV,VmImH,WW,mS,tH,tSJ;J/Nm,WW,tH;H/SWI,t", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination1() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;I;D;N;L#f;m;q;u;z#S/LIfN,LmSD;I/D,DzNfN,I,N,e,u;D/IfI,S,SfNmI,e;N/D,ILLLD,LNNLI,e,mSqDI;L/LqSI,S");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;I;D;N;L#f;m;q;u;z#S/LIf,LIfN,Lf,LfN,LmS,LmSD;I/DzNf,DzNfN,Dzf,DzfN,ILLL,ILLLD,If,IfI,LIf,LIfN,LL,LLI,LLL,LLLD,LNL,LNLI,LNNL,LNNLI,Lf,LfN,LmS,LmSD,SfNm,SfNmI,Sfm,SfmI,f,fI,mSq,mSqD,mSqDI,mSqI,u,zNf,zNfN,zf,zfN;D/If,IfI,LIf,LIfN,Lf,LfN,LmS,LmSD,SfNm,SfNmI,Sfm,SfmI,f,fI;N/ILLL,ILLLD,If,IfI,LIf,LIfN,LL,LLI,LLL,LLLD,LNL,LNLI,LNNL,LNNLI,Lf,LfN,LmS,LmSD,SfNm,SfNmI,Sfm,SfmI,f,fI,mSq,mSqD,mSqDI,mSqI;L/LIf,LIfN,Lf,LfN,LmS,LmSD,LqS,LqSI", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination2() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;I;W;O;N#d;k;l#S/SlIO,dO,lO,lSk;I/I,N,Wl,dO,e;W/I,SlO,WIl,e,kON;O/IlO,O,Od,e;N/OOW,OlI,dIk,lS");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;I;W;O;N#d;k;l#S/Sl,SlI,SlIO,SlO,d,dO,l,lO,lSk;I/Il,IlO,OO,OOW,OW,Od,Ol,OlI,Sl,SlO,WIl,Wl,d,dIk,dO,dk,k,kN,kO,kON,l,lI,lO,lS;W/Il,IlO,OO,OOW,OW,Od,Ol,OlI,Sl,SlO,WIl,Wl,d,dIk,dO,dk,k,kN,kO,kON,l,lI,lO,lS;O/Il,IlO,Od,d,l,lO;N/Il,IlO,OO,OOW,OW,Od,Ol,OlI,Sl,SlO,WIl,Wl,d,dIk,dO,dk,k,kN,kO,kON,l,lI,lO,lS", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination3() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;I;Z;K;R;M#a;c;i;s;y#S/RKi,SaSi,ZIMRS,c;I/Z,ZKyKi,e;Z/IyR,MaMZc,SMySa,e;K/I,S,aRIs,yI;R/S,Z,aRKsS,cIKIS,e,s;M/IyK,Ms,ZKi,ySyI");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;I;Z;K;R;M#a;c;i;s;y#S/IMRS,IMS,Ki,MRS,MS,RKi,Ri,SaSi,ZIMRS,ZIMS,ZMRS,ZMS,c,i;I/Iy,IyR,KyKi,Kyi,MaMZc,MaMc,SMySa,ZKyKi,ZKyi,ZyKi,Zyi,y,yKi,yR,yi;Z/Iy,IyR,MaMZc,MaMc,SMySa,y,yR;K/IMRS,IMS,Iy,IyR,Ki,KyKi,Kyi,MRS,MS,MaMZc,MaMc,RKi,Ri,SMySa,SaSi,ZIMRS,ZIMS,ZKyKi,ZKyi,ZMRS,ZMS,ZyKi,Zyi,aIs,aRIs,aRs,as,c,i,y,yI,yKi,yR,yi;R/IMRS,IMS,Iy,IyR,Ki,MRS,MS,MaMZc,MaMc,RKi,Ri,SMySa,SaSi,ZIMRS,ZIMS,ZMRS,ZMS,aKsS,aRKsS,aRsS,asS,c,cIIS,cIKIS,cIKS,cIS,cKIS,cKS,cS,i,s,y,yR;M/Iy,IyK,Ki,Ms,ZKi,Zi,i,y,yK,ySy,ySyI", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination4() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;M;A;V;L;R;F#k;n;o#S/RkR,kS,oRVAV;M/RnVV,S,oFkF;A/A,L,e,oLk;V/R,VnVVF,nMnM;L/FML,R,VnR,kRAL;R/LRoRn,e,oLFLV;F/Fk,kMAo,kSnSn,o");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;M;A;V;L;R;F#k;n;o#S/Rk,RkR,k,kR,kS,o,oA,oAV,oR,oRA,oRAV,oRV,oRVA,oRVAV,oRVV,oV,oVA,oVAV,oVV;M/Rk,RkR,Rn,RnV,RnVV,k,kR,kS,n,nV,nVV,o,oA,oAV,oFkF,oR,oRA,oRAV,oRV,oRVA,oRVAV,oRVV,oV,oVA,oVAV,oVV;A/FM,FML,LRoRn,LRon,LoRn,Lon,RoRn,Ron,Vn,VnR,k,kA,kAL,kL,kR,kRA,kRAL,kRL,n,nR,oF,oFL,oFLV,oFV,oLF,oLFL,oLFLV,oLFV,oLk,oRn,ok,on;V/LRoRn,LRon,LoRn,Lon,RoRn,Ron,VnF,VnVF,VnVVF,nF,nMnM,nVF,nVVF,oF,oFL,oFLV,oFV,oLF,oLFL,oLFLV,oLFV,oRn,on;L/FM,FML,LRoRn,LRon,LoRn,Lon,RoRn,Ron,Vn,VnR,k,kA,kAL,kL,kR,kRA,kRAL,kRL,n,nR,oF,oFL,oFLV,oFV,oLF,oLFL,oLFLV,oLFV,oRn,on;R/LRoRn,LRon,LoRn,Lon,RoRn,Ron,oF,oFL,oFLV,oFV,oLF,oLFL,oLFLV,oLFV,oRn,on;F/Fk,kMAo,kMo,kSnSn,o", cfgEpsUnitElim.toString());
	}

}