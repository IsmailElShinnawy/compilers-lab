package csen1002.tests.task4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task4.CfgEpsUnitElim;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task4TestsBatch4 {

	@Test
	public void testCfgEpsilonRuleElimination1() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;H;R;T;I#b;l;u#S/RlRu,TSlHI;H/H,HS,lTSbR,u;R/H,HlHbT,S,TST,e,uIlHI;T/H,e,uH,uSTIT,uTu;I/Iu,TuT");
		cfgEpsUnitElim.eliminateEpsilonRules();
		assertEquals("S;H;R;T;I#b;l;u#S/RlRu,Rlu,SlHI,TSlHI,lRu,lu;H/H,HS,lSb,lSbR,lTSb,lTSbR,u;R/H,HlHb,HlHbT,S,ST,TS,TST,uIlHI;T/H,uH,uSI,uSIT,uSTI,uSTIT,uTu,uu;I/Iu,Tu,TuT,u,uT", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonRuleElimination2() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;Y;N;I;F;V;L#k;o;q;t;v#S/kIY,qV,qYV,vVV;Y/N,NFIkV,Vo,e,kLt,v;N/F,SS,StS;I/V,Y,e,kYY,t;F/LSv,LYFIN,Sq,Y,e;V/FY,IoSSI,L,S;L/NNtY,VFvV,qIk");
		cfgEpsUnitElim.eliminateEpsilonRules();
		assertEquals("S;Y;N;I;F;V;L#k;o;q;t;v#S/k,kI,kIY,kY,q,qV,qY,qYV,v,vV,vVV;Y/FIk,FIkV,Fk,FkV,Ik,IkV,N,NFIk,NFIkV,NFk,NFkV,NIk,NIkV,Nk,NkV,Vo,k,kLt,kV,o,v;N/F,SS,StS;I/V,Y,k,kY,kYY,t;F/L,LF,LFI,LFIN,LFN,LI,LIN,LN,LSv,LY,LYF,LYFI,LYFIN,LYFN,LYI,LYIN,LYN,Sq,Y;V/F,FY,IoSS,IoSSI,L,S,Y,oSS,oSSI;L/Fv,FvV,NNt,NNtY,Nt,NtY,VFv,VFvV,Vv,VvV,qIk,qk,t,tY,v,vV", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonRuleElimination3() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;I;F;L;G#u;x;y#S/S,uFIyS,y;I/I,L,LGuLu,S;F/F,L,SSuFu,e,xL;L/F,GFIxF,Ix,e;G/I,IISG,xL,xSSu");
		cfgEpsUnitElim.eliminateEpsilonRules();
		assertEquals("S;I;F;L;G#u;x;y#S/S,uFIyS,uFyS,uIyS,uyS,y;I/GuLu,Guu,I,L,LGuLu,LGuu,LuLu,Luu,S,uLu,uu;F/F,L,SSuFu,SSuu,x,xL;L/F,FIx,FIxF,Fx,FxF,GFIx,GFIxF,GFx,GFxF,GIx,GIxF,Gx,GxF,Ix,IxF,x,xF;G/I,IIS,IISG,IS,ISG,S,SG,x,xL,xSSu", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgUnitRuleElimination1() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;D;I;Z;P;F#i;p;v;x;z#S/I,pSiZ,vIF;D/D,DpP,IDz;I/IpP,iF;Z/Di,SvD,ZFpPv;P/IS,S,v,zIDv;F/pSSD,xFDD");
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;D;I;Z;P;F#i;p;v;x;z#S/IpP,iF,pSiZ,vIF;D/DpP,IDz;I/IpP,iF;Z/Di,SvD,ZFpPv;P/IS,IpP,iF,pSiZ,v,vIF,zIDv;F/pSSD,xFDD", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgUnitRuleElimination2() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;B;O;E;J;Z#f;l;m;y#S/EOJZ,O,f,mJ,y;B/SSfJO,lOE,m,ySOS;O/Ef,ElOEO,S,ZBJ,lZlBB;E/Bf,O,Sf,fZSES,yS;J/B,BBSEf,O;Z/J,O");
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;B;O;E;J;Z#f;l;m;y#S/EOJZ,Ef,ElOEO,ZBJ,f,lZlBB,mJ,y;B/SSfJO,lOE,m,ySOS;O/EOJZ,Ef,ElOEO,ZBJ,f,lZlBB,mJ,y;E/Bf,EOJZ,Ef,ElOEO,Sf,ZBJ,f,fZSES,lZlBB,mJ,y,yS;J/BBSEf,EOJZ,Ef,ElOEO,SSfJO,ZBJ,f,lOE,lZlBB,m,mJ,y,ySOS;Z/BBSEf,EOJZ,Ef,ElOEO,SSfJO,ZBJ,f,lOE,lZlBB,m,mJ,y,ySOS", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgUnitRuleElimination3() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;T;F;E;H;Z#o;v;w#S/FTHoZ,S,SFZS;T/F,S,T,TZF,ZoZvH;F/S,TTSHv,Zw;E/FH,H,SoF,o,oE;H/EoF,H,T,ZS,Zo,oZ;Z/T,vTEFo");
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;T;F;E;H;Z#o;v;w#S/FTHoZ,SFZS;T/FTHoZ,SFZS,TTSHv,TZF,ZoZvH,Zw;F/FTHoZ,SFZS,TTSHv,Zw;E/EoF,FH,FTHoZ,SFZS,SoF,TTSHv,TZF,ZS,Zo,ZoZvH,Zw,o,oE,oZ;H/EoF,FTHoZ,SFZS,TTSHv,TZF,ZS,Zo,ZoZvH,Zw,oZ;Z/FTHoZ,SFZS,TTSHv,TZF,ZoZvH,Zw,vTEFo", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination1() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;Y;G;C;J;U;I#k;n;p;u#S/I,ISk,S,uS;Y/S,YuJYp,uIU,uS;G/C,Y,e,nCkG;C/GCkJ,Ip,SIYS,e,pC;J/S,Y,e,k,pGUuY;U/Yu,p,uY;I/CUS,UkSU,kJ,nCnJI");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;Y;G;C;J;U;I#k;n;p;u#S/CUS,ISk,US,UkSU,k,kJ,nCnI,nCnJI,nnI,nnJI,uS;Y/CUS,ISk,US,UkSU,YuJYp,YuYp,k,kJ,nCnI,nCnJI,nnI,nnJI,uIU,uS;G/CUS,Ck,CkJ,GCk,GCkJ,Gk,GkJ,ISk,Ip,SIYS,US,UkSU,YuJYp,YuYp,k,kJ,nCk,nCkG,nCnI,nCnJI,nk,nkG,nnI,nnJI,p,pC,uIU,uS;C/Ck,CkJ,GCk,GCkJ,Gk,GkJ,Ip,SIYS,k,kJ,p,pC;J/CUS,ISk,US,UkSU,YuJYp,YuYp,k,kJ,nCnI,nCnJI,nnI,nnJI,pGUuY,pUuY,uIU,uS;U/Yu,p,uY;I/CUS,US,UkSU,k,kJ,nCnI,nCnJI,nnI,nnJI", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination2() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;A;R;Y;L;H;U#c;k;l;m#S/ASlUS,m;A/RUUSS,S,e,l,lYmRY;R/HRUUS,R,Rm,e;Y/A,SH,kUAAc,lYmA,m;L/A,Ak,YlARc;H/SLRH,c,m;U/UR,l,lY");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;A;R;Y;L;H;U#c;k;l;m#S/ASlUS,SlUS,m;A/ASlUS,RUUSS,SlUS,UUSS,l,lYm,lYmR,lYmRY,lYmY,lm,lmR,lmRY,lmY,m;R/HRUUS,HUUS,Rm,m;Y/ASlUS,RUUSS,SH,SlUS,UUSS,kUAAc,kUAc,kUc,l,lYm,lYmA,lYmR,lYmRY,lYmY,lm,lmA,lmR,lmRY,lmY,m;L/ASlUS,Ak,RUUSS,SlUS,UUSS,YlARc,YlAc,YlRc,Ylc,k,l,lARc,lAc,lRc,lYm,lYmR,lYmRY,lYmY,lc,lm,lmR,lmRY,lmY,m;H/SH,SLH,SLRH,SRH,c,m;U/UR,l,lY", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination3() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;F;R;Y;L;M#g;t;u;w;y#S/MgY,S,StFF,YtFRL,gS;F/R,SL,e,tMMML;R/FYYuY,RMyRF,S,e;Y/L,S,gF,uSYL;L/SyS,YwSRL;M/LLgL,MwYw,gS");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;F;R;Y;L;M#g;t;u;w;y#S/MgY,St,StF,StFF,YtFL,YtFRL,YtL,YtRL,gS;F/FYYuY,MgY,My,MyF,MyR,MyRF,RMy,RMyF,RMyR,RMyRF,SL,St,StF,StFF,YYuY,YtFL,YtFRL,YtL,YtRL,gS,tMMML;R/FYYuY,MgY,My,MyF,MyR,MyRF,RMy,RMyF,RMyR,RMyRF,St,StF,StFF,YYuY,YtFL,YtFRL,YtL,YtRL,gS;Y/MgY,St,StF,StFF,SyS,YtFL,YtFRL,YtL,YtRL,YwSL,YwSRL,g,gF,gS,uSYL;L/SyS,YwSL,YwSRL;M/LLgL,MwYw,gS", cfgEpsUnitElim.toString());
	}

	@Test
	public void testCfgEpsilonUnitRuleElimination4() {
		CfgEpsUnitElim cfgEpsUnitElim= new CfgEpsUnitElim("S;P;A;Q;F;K#c;h;i;o;z#S/QoS,SzFh;P/P,hAh,iKcA,oK;A/Q,S,cSP,e,hAQzS;Q/A,F,KzQ,e;F/A,KhQ,P,SAS;K/QA,h");
		cfgEpsUnitElim.eliminateEpsilonRules();
		cfgEpsUnitElim.eliminateUnitRules();
		assertEquals("S;P;A;Q;F;K#c;h;i;o;z#S/QoS,SzFh,Szh,oS;P/hAh,hh,iKc,iKcA,ic,icA,o,oK;A/Kh,KhQ,Kz,KzQ,QoS,SAS,SS,SzFh,Szh,cSP,h,hAQzS,hAh,hAzS,hQ,hQzS,hh,hzS,iKc,iKcA,ic,icA,o,oK,oS,z,zQ;Q/Kh,KhQ,Kz,KzQ,QoS,SAS,SS,SzFh,Szh,cSP,h,hAQzS,hAh,hAzS,hQ,hQzS,hh,hzS,iKc,iKcA,ic,icA,o,oK,oS,z,zQ;F/Kh,KhQ,Kz,KzQ,QoS,SAS,SS,SzFh,Szh,cSP,h,hAQzS,hAh,hAzS,hQ,hQzS,hh,hzS,iKc,iKcA,ic,icA,o,oK,oS,z,zQ;K/Kh,KhQ,Kz,KzQ,QA,QoS,SAS,SS,SzFh,Szh,cSP,h,hAQzS,hAh,hAzS,hQ,hQzS,hh,hzS,iKc,iKcA,ic,icA,o,oK,oS,z,zQ", cfgEpsUnitElim.toString());
	}

}