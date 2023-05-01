package csen1002.tests.task6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task6.CfgFirstFollow;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task6TestsBatch3 {

	@Test
	public void testCfg1First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;U;Z;H;X;M;J#b;c;o;t;v;w#S/bZ,bZZZ,t;U/bHbXX,e,wX;Z/M,S,e,w;H/H,U,oUZb,w,wXJc;X/H,S,UMHX,cZSJ,e,oHw,oSM,wH,wMJ;M/M,XMM,tZvXb;J/Z,ZZZtS");
		assertEquals("S/bt;U/bew;Z/bceotw;H/beow;X/bceotw;M/bcotw;J/bceotw", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg1Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;U;Z;H;X;M;J#b;c;o;t;v;w#S/bZ,bZZZ,t;U/bHbXX,e,wX;Z/M,S,e,w;H/H,U,oUZb,w,wXJc;X/H,S,UMHX,cZSJ,e,oHw,oSM,wH,wMJ;M/M,XMM,tZvXb;J/Z,ZZZtS");
		assertEquals("S/$bcotvw;U/bcotw;Z/$bcotvw;H/bcotw;X/bcotw;M/$bcotvw;J/bcotw", cfgFirstFollow.follow());
	}

	@Test
	public void testCfg2First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;P;F;Z;C;Y;W#b;g;j;l;p;r;x#S/CSZS,WSSSb,lZjP,pFx,xCxW;P/P,lPlP,pP,rFZj;F/FlSr,SrZb,e,gW,gWP,pPF,pSP;Z/F,FSrPF,Yl,bCYb,pPSSW,xCYb;C/C,F,FgYZZ,P,Y,Z,e,gFPYp,pFZWF;Y/PrF,Z,pPj,xF;W/PWx,bZr");
		assertEquals("S/bglprx;P/lpr;F/beglprx;Z/beglprx;C/beglprx;Y/beglprx;W/blpr", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg2Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;P;F;Z;C;Y;W#b;g;j;l;p;r;x#S/CSZS,WSSSb,lZjP,pFx,xCxW;P/P,lPlP,pP,rFZj;F/FlSr,SrZb,e,gW,gWP,pPF,pSP;Z/F,FSrPF,Yl,bCYb,pPSSW,xCYb;C/C,F,FgYZZ,P,Y,Z,e,gFPYp,pFZWF;Y/PrF,Z,pPj,xF;W/PWx,bZr");
		assertEquals("S/$bglprx;P/$bgjlprx;F/bgjlprx;Z/bgjlprx;C/bglprx;Y/bglprx;W/$bgjlprx", cfgFirstFollow.follow());
	}

	@Test
	public void testCfg3First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;C;E;J;L;G#n;r;s;v;y;z#S/CsEyS,Js,S,SsSCv,nC;C/S,e,nS;E/L,SnSv,e,rC,sG,sS,zGGC;J/C,SzJLS,sSJsC;L/E,GCE,S,Sn,nSsLr,zL;G/LS,SSzS,rESL,sJGz");
		assertEquals("S/ns;C/ens;E/enrsz;J/ens;L/enrsz;G/nrsz", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg3Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;C;E;J;L;G#n;r;s;v;y;z#S/CsEyS,Js,S,SsSCv,nC;C/S,e,nS;E/L,SnSv,e,rC,sG,sS,zGGC;J/C,SzJLS,sSJsC;L/E,GCE,S,Sn,nSsLr,zL;G/LS,SSzS,rESL,sJGz");
		assertEquals("S/$nrsvyz;C/$nrsvyz;E/nrsyz;J/nrsz;L/nrsyz;G/nrsyz", cfgFirstFollow.follow());
	}

	@Test
	public void testCfg4First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;N;Z;D;B#b;h;o;p;w#S/N,S,ZZ,pZZDh;N/N,Z,ZNo,bNZ,e,wZ;Z/D,ZZhBb,hShZ;D/D,ZZbD,e,hD,pD;B/h,p,pD,pZBhB");
		assertEquals("S/behopw;N/behopw;Z/behp;D/behp;B/hp", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg4Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;N;Z;D;B#b;h;o;p;w#S/N,S,ZZ,pZZDh;N/N,Z,ZNo,bNZ,e,wZ;Z/D,ZZhBb,hShZ;D/D,ZZbD,e,hD,pD;B/h,p,pD,pZBhB");
		assertEquals("S/$h;N/$bhop;Z/$bhopw;D/$bhopw;B/bh", cfgFirstFollow.follow());
	}

	@Test
	public void testCfg5First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;J;P;W;I;K;V#i;k;n;o;w;x;y#S/Jw,P,PWw,S,VWVo,y;J/KoJ,S,V,i,iJV,wSSP,xIJVJ;P/I,IiSw,P,VVn,e;W/VPVkI,WVP,Wy,e,iIK,xJkSy;I/iWK,kSk,ySi;K/i,y;V/VWWIK,kIJx,ySIK");
		assertEquals("S/eikwxy;J/eikwxy;P/eiky;W/eikxy;I/iky;K/iy;V/ky", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg5Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;J;P;W;I;K;V#i;k;n;o;w;x;y#S/Jw,P,PWw,S,VWVo,y;J/KoJ,S,V,i,iJV,wSSP,xIJVJ;P/I,IiSw,P,VVn,e;W/VPVkI,WVP,Wy,e,iIK,xJkSy;I/iWK,kSk,ySi;K/i,y;V/VWWIK,kIJx,ySIK");
		assertEquals("S/$ikwxy;J/kwxy;P/$ikwxy;W/ikwxy;I/$ikwxy;K/$iknowxy;V/iknowxy", cfgFirstFollow.follow());
	}

}