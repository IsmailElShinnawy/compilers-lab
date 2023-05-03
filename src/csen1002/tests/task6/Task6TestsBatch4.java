package csen1002.tests.task6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task6.CfgFirstFollow;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task6TestsBatch4 {

	@Test
	public void testCfg1First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;X;Q;W;R;F#a;g;i;n;y;z#S/Q,R,S,i,nFn;X/Sg,W,e,iR,nFi,yXR;Q/y,yRi;W/FaFiQ,Q,R,RRz,S,SQ,SSS,a,iF;R/Q,a,e;F/FnRFy,WzFiX,WzWR");
		assertEquals("S/aeiny;X/aeginyz;Q/y;W/aeinyz;R/aey;F/ainyz", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg1Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;X;Q;W;R;F#a;g;i;n;y;z#S/Q,R,S,i,nFn;X/Sg,W,e,iR,nFi,yXR;Q/y,yRi;W/FaFiQ,Q,R,RRz,S,SQ,SSS,a,iF;R/Q,a,e;F/FnRFy,WzFiX,WzWR");
		assertEquals("S/$aginyz;X/ainyz;Q/$aginyz;W/ainyz;R/$aginyz;F/ainyz", cfgFirstFollow.follow());
	}

	@Test
	public void testCfg2First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;V;U;Z;Y;B#g;i;j;k;r;u;z#S/VkZY,Y,Yi,Z,iBuSY;V/VV,jB;U/BuV,UYY,V,YV,e,j;Z/S,kVz,kYBB;Y/e,gB,gBVVi;B/UVr,Y,ZSVi");
		assertEquals("S/egijk;V/j;U/egijku;Z/egijk;Y/eg;B/egijku", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg2Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;V;U;Z;Y;B#g;i;j;k;r;u;z#S/VkZY,Y,Yi,Z,iBuSY;V/VV,jB;U/BuV,UYY,V,YV,e,j;Z/S,kVz,kYBB;Y/e,gB,gBVVi;B/UVr,Y,ZSVi");
		assertEquals("S/$gijk;V/gijkrz;U/gj;Z/$gijk;Y/$gijkruz;B/$gijkruz", cfgFirstFollow.follow());
	}

	@Test
	public void testCfg3First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;G;W;V;T;I;M#b;f;n;o;q;s;v#S/nSb,sI;G/GSoSG,IVs,oIv,v;W/G,GW,I,S,SIGT,oSG;V/G,SIGS,SS,V,VV,e;T/IoSoT,STb,V,Wo,qM;I/ISGf,bMq,e;M/MbMSG,TfWoW");
		assertEquals("S/ns;G/bnosv;W/benosv;V/benosv;T/benoqsv;I/bens;M/bfnoqsv", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg3Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;G;W;V;T;I;M#b;f;n;o;q;s;v#S/nSb,sI;G/GSoSG,IVs,oIv,v;W/G,GW,I,S,SIGT,oSG;V/G,SIGS,SS,V,VV,e;T/IoSoT,STb,V,Wo,qM;I/ISGf,bMq,e;M/MbMSG,TfWoW");
		assertEquals("S/$bfnoqsv;G/bfnoqsv;W/bfnoqs;V/bfnoqsv;T/bfnoqs;I/$bfnoqsv;M/bfnoqs", cfgFirstFollow.follow());
	}

	@Test
	public void testCfg4First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;Q;H;O;K;P;R#d;i;j;o;r;y#S/O,P,iP;Q/PQ,Q,j,r;H/K,O,OiSS,e,i;O/P,e,j,jKQ;K/P,Q,j;P/O,S,dHQ,e,iRHRy;R/HrKH,O,RK,jSySo");
		assertEquals("S/deij;Q/dijr;H/deijr;O/deij;K/deijr;P/deij;R/deijr", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg4Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;Q;H;O;K;P;R#d;i;j;o;r;y#S/O,P,iP;Q/PQ,Q,j,r;H/K,O,OiSS,e,i;O/P,e,j,jKQ;K/P,Q,j;P/O,S,dHQ,e,iRHRy;R/HrKH,O,RK,jSySo");
		assertEquals("S/$dijory;Q/$dijory;H/dijry;O/$dijory;K/dijry;P/$dijory;R/dijry", cfgFirstFollow.follow());
	}

	@Test
	public void testCfg5First() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;Y;F;A;G;Z;V#h;j;k;n;u;w;z#S/GGAY,VAASS,nF,nGSFA;Y/FzY,GjVSn,Sh,SkGA,VY,hYFYY;F/FjA,SF,e,jZZVS,kZAw,uA,zVSSA;A/j,kGYS;G/F,G,Y,YV,ZnF,kFFGA;Z/A,Z,ZGFj,e,hZFh;V/YAAuV,YGnGn,Z,jAVS,kGhAA,nZ");
		assertEquals("S/hjknuz;Y/hjknuz;F/ehjknuz;A/jk;G/ehjknuz;Z/ehjknuz;V/ehjknuz", cfgFirstFollow.first());
	}
	
	@Test
	public void testCfg5Follow() {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;Y;F;A;G;Z;V#h;j;k;n;u;w;z#S/GGAY,VAASS,nF,nGSFA;Y/FzY,GjVSn,Sh,SkGA,VY,hYFYY;F/FjA,SF,e,jZZVS,kZAw,uA,zVSSA;A/j,kGYS;G/F,G,Y,YV,ZnF,kFFGA;Z/A,Z,ZGFj,e,hZFh;V/YAAuV,YGnGn,Z,jAVS,kGhAA,nZ");
		assertEquals("S/$hjknuwz;Y/$hjknuwz;F/$hjknuwz;A/$hjknuwz;G/hjknuz;Z/hjknuz;V/hjknuz", cfgFirstFollow.follow());
	}

}