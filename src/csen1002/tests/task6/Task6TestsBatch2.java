package csen1002.tests.task6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task6.CfgFirstFollow;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task6TestsBatch2 {

	@Test
	public void testCfg1First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;H;C;U;L;K;Y#f;h;k;m;q;s#S/LSLkY,S,kUq;H/CHS,H,LH,mKS,sYSs,sYm;C/CY,H,L,U;U/e,k,mSYhK;L/Ch,LHfH,SKKh,UU,e,hHY,sUqU;K/CYsYf,H,LHqL,U,UsUC,YUUK,sYHkK;Y/UYsH,qUhY");
		assertEquals("S/hkmqs;H/hkmqs;C/ehkmqs;U/ekm;L/ehkmqs;K/ehkmqs;Y/kmq", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg1Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;H;C;U;L;K;Y#f;h;k;m;q;s#S/LSLkY,S,kUq;H/CHS,H,LH,mKS,sYSs,sYm;C/CY,H,L,U;U/e,k,mSYhK;L/Ch,LHfH,SKKh,UU,e,hHY,sUqU;K/CYsYf,H,LHqL,U,UsUC,YUUK,sYHkK;Y/UYsH,qUhY");
		assertEquals("S/$fhkmqs;H/$fhkmqs;C/hkmqs;U/hkmqs;L/hkmqs;K/hkmqs;Y/$fhkmqs", cfgFirstFollow.follow());
	}

	@Test
	public void testCfg2First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;W;B;E;T;V;D#k;p;q;t;w#S/W,pTTtS,qT;W/S,W,e,qD,qETt;B/B,E,ESkVD,TpD,WDED,e,wSpD;E/DwED,S,SBk,VpWtB,W,qTqSD,wST;T/pDk,qWqT,tS;V/S,TDSD,TVpW,WTp,WVTWt,kDVW,q;D/DBSVD,Dw,tTt");
		assertEquals("S/epq;W/epq;B/ekpqtw;E/ekpqtw;T/pqt;V/ekpqt;D/t", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg2Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;W;B;E;T;V;D#k;p;q;t;w#S/W,pTTtS,qT;W/S,W,e,qD,qETt;B/B,E,ESkVD,TpD,WDED,e,wSpD;E/DwED,S,SBk,VpWtB,W,qTqSD,wST;T/pDk,qWqT,tS;V/S,TDSD,TVpW,WTp,WVTWt,kDVW,q;D/DBSVD,Dw,tTt");
		assertEquals("S/$kpqtw;W/$kpqtw;B/kpqt;E/kpqt;T/$kpqtw;V/pqt;D/$kpqtw", cfgFirstFollow.follow());
	}

	@Test
	public void testCfg3First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;C;K;T;N;Z;I#a;f;g;j;n;o;w#S/ISIf,N,wSS;C/II,NS,a,e,jIaI;K/N,NwSIj,SIa,Z,e,fN,gNSo;T/C,KgSo,N,SgZwT,SnZ,ZIKj,ZNfSf,jIfTS;N/NwNw,o;Z/NZI,So,T,TNjIg,Z;I/NfTS,gZTf");
		assertEquals("S/gow;C/aegjo;K/aefgjow;T/aefgjow;N/o;Z/aefgjow;I/go", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg3Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;C;K;T;N;Z;I#a;f;g;j;n;o;w#S/ISIf,N,wSS;C/II,NS,a,e,jIaI;K/N,NwSIj,SIa,Z,e,fN,gNSo;T/C,KgSo,N,SgZwT,SnZ,ZIKj,ZNfSf,jIfTS;N/NwNw,o;Z/NZI,So,T,TNjIg,Z;I/NfTS,gZTf");
		assertEquals("S/$afgjnow;C/afgjow;K/gj;T/afgjow;N/$afgjnow;Z/afgjow;I/afgjow", cfgFirstFollow.follow());
	}

	@Test
	public void testCfg4First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;K;I;N;W;H;V#g;j;l;m;o;w#S/Kj,N,g,wVWwV;K/S,Wj,e,gSj,wNS;I/KNI,NmHSl,lNNlW;N/KWN,w;W/HoINj,K,N,SVVg,W,WSwV,j,jW;H/HwS,e,gN;V/H,mIw");
		assertEquals("S/gjow;K/egjow;I/gjlow;N/gjow;W/egjow;H/egw;V/egmw", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg4Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;K;I;N;W;H;V#g;j;l;m;o;w#S/Kj,N,g,wVWwV;K/S,Wj,e,gSj,wNS;I/KNI,NmHSl,lNNlW;N/KWN,w;W/HoINj,K,N,SVVg,W,WSwV,j,jW;H/HwS,e,gN;V/H,mIw");
		assertEquals("S/$gjlmow;K/gjow;I/gjow;N/$gjlmow;W/gjow;H/$gjlmow;V/$gjlmow", cfgFirstFollow.follow());
	}

	@Test
	public void testCfg5First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;P;C;K;Z;U;J#c;j;p;r;x#S/JKc,UUSxZ;P/ZCPSP,ZcJj;C/P,Z,cKZc,e,jSxS,rUJSp,xZ;K/C,PU,S,xPSj;Z/P,U,c,e,rKJPr;U/U,e,x,xScS;J/CCCx,K,KJcZJ,SrKPj");
		assertEquals("S/cjrx;P/cjrx;C/cejrx;K/cejrx;Z/cejrx;U/ex;J/cejrx", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg5Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;P;C;K;Z;U;J#c;j;p;r;x#S/JKc,UUSxZ;P/ZCPSP,ZcJj;C/P,Z,cKZc,e,jSxS,rUJSp,xZ;K/C,PU,S,xPSj;Z/P,U,c,e,rKJPr;U/U,e,x,xScS;J/CCCx,K,KJcZJ,SrKPj");
		assertEquals("S/$cjprx;P/$cjprx;C/cjrx;K/cjrx;Z/$cjprx;U/$cjprx;J/cjrx", cfgFirstFollow.follow());
	}

}