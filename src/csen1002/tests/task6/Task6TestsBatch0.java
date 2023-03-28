package csen1002.tests.task6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task6.CfgFirstFollow;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task6TestsBatch0 {

	@Test
	public void testCfg1First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;Z;I;P;B;J;W#b;f;i;m;n;p;s#S/PZb,S,iBbB;Z/II,If,P;I/B,JZPP,SPnJS,SWsI,bBPb,iB;P/JWWfP,S,Ss,e;B/e,pBPBb,sSP;J/BmPZ,Z,iP;W/bZ,mPnWb,pWBfB");
		assertEquals("S/bfimps;Z/befimps;I/befimps;P/befimps;B/eps;J/befimps;W/bmp", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg1Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;Z;I;P;B;J;W#b;f;i;m;n;p;s#S/PZb,S,iBbB;Z/II,If,P;I/B,JZPP,SPnJS,SWsI,bBPb,iB;P/JWWfP,S,Ss,e;B/e,pBPBb,sSP;J/BmPZ,Z,iP;W/bZ,mPnWb,pWBfB");
		assertEquals("S/$bfimnps;Z/bfimps;I/bfimps;P/$bfimnps;B/$bfimnps;J/bfimps;W/bfmps", cfgFirstFollow.follow());
	}

	@Test
	public void testCfg2First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;E;Q;N;C;F;Y#f;h;p;r;u;w#S/S,SE,SwFh,Y,rCr;E/CS,e,fCp;Q/NES,S,YCEwF,e;N/C,ChSuY,EhY,Q,QhEN,hN,rQCS;C/FNC,N,Q,SE,YrFp,pSSQ;F/FrCE,SEpC;Y/FpFYE,YFwE");
		assertEquals("S/r;E/efhpr;Q/efhpr;N/efhpr;C/efhpr;F/r;Y/r", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg2Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;E;Q;N;C;F;Y#f;h;p;r;u;w#S/S,SE,SwFh,Y,rCr;E/CS,e,fCp;Q/NES,S,YCEwF,e;N/C,ChSuY,EhY,Q,QhEN,hN,rQCS;C/FNC,N,Q,SE,YrFp,pSSQ;F/FrCE,SEpC;Y/FpFYE,YFwE");
		assertEquals("S/$fhpruw;E/$fhpruw;Q/fhprw;N/fhprw;C/fhprw;F/fhprw;Y/$fhpruw", cfgFirstFollow.follow());
	}

	@Test
	public void testCfg3First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;O;H;D;Z;X#a;k;p;s;t;w;x#S/SkSwO,pO,pZSt,tO;O/SOa,Z,e,sSp;H/OXt,XOD,ZOkOO,Zx,e,kZ;D/H,OaHk,S,SD,Z,ZkO,e,sDH;Z/O,Z,kXpO,x;X/HaZ,O,SXSH,SZ,pDaH,pDs");
		assertEquals("S/pt;O/ekpstx;H/aekpstx;D/aekpstx;Z/ekpstx;X/aekpstx", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg3Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;O;H;D;Z;X#a;k;p;s;t;w;x#S/SkSwO,pO,pZSt,tO;O/SOa,Z,e,sSp;H/OXt,XOD,ZOkOO,Zx,e,kZ;D/H,OaHk,S,SD,Z,ZkO,e,sDH;Z/O,Z,kXpO,x;X/HaZ,O,SXSH,SZ,pDaH,pDs");
		assertEquals("S/$akpstwx;O/$akpstwx;H/akpstx;D/akpstx;Z/$akpstwx;X/akpstx", cfgFirstFollow.follow());
	}

	@Test
	public void testCfg4First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;K;D;I;M;L#a;d;g;x;y#S/L,S,SDxS;K/D,Ly,gMgSK;D/K,KdL,e,gIxLS;I/DgS,K,S,SaS,aDSI,aDSL,gSyL;M/D,DIaIM,IIdMS,e,x;L/SaDL,SgDL,xDaDg");
		assertEquals("S/x;K/degx;D/degx;I/adegx;M/adegx;L/x", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg4Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;K;D;I;M;L#a;d;g;x;y#S/L,S,SDxS;K/D,Ly,gMgSK;D/K,KdL,e,gIxLS;I/DgS,K,S,SaS,aDSI,aDSL,gSyL;M/D,DIaIM,IIdMS,e,x;L/SaDL,SgDL,xDaDg");
		assertEquals("S/$adgxy;K/adgx;D/adgx;I/adgx;M/gx;L/$adgxy", cfgFirstFollow.follow());
	}

	@Test
	public void testCfg5First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;W;G;A;D;C;P#f;h;l;o;q;s;t#S/A,DPS,DqDDq,qAlS,qDPPo;W/e,lSD,tCShP;G/C,G,S,sDC,sS;A/fPlDf,o;D/PS,WAPs,e,oW,qD;C/G,PDP,PW,W;P/o,q");
		assertEquals("S/floqt;W/elt;G/efloqst;A/fo;D/efloqt;C/efloqst;P/oq", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg5Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;W;G;A;D;C;P#f;h;l;o;q;s;t#S/A,DPS,DqDDq,qAlS,qDPPo;W/e,lSD,tCShP;G/C,G,S,sDC,sS;A/fPlDf,o;D/PS,WAPs,e,oW,qD;C/G,PDP,PW,W;P/o,q");
		assertEquals("S/$fhloqst;W/floqst;G/floqt;A/$fhloqst;D/floqst;C/floqt;P/floqst", cfgFirstFollow.follow());
	}

}