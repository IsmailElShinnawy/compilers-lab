package csen1002.tests.task5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task5.CfgLeftRecElim;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task5TestsBatch5 {

	@Test
	public void testCfgLeftRecursionElimination1() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;U;T;H;E;Z#b;i;j;o#S/EHU,iES,jZH;U/SEiH,SHT,UUjS,b,bUHE,jEbU;T/ETbZ,TE,ToU,Zo,bZiU;H/HbH,HbZi,UjEZE,iU;E/Hi,HoUEH,oHHb,oZiT;Z/Si,bS");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;U;T;H;E;Z;U';T';H';E'#b;i;j;o#S/EHU,iES,jZH;U/EHUEiHU',iESEiHU',jZHEiHU',EHUHTU',iESHTU',jZHHTU',bU',bUHEU',jEbUU';T/ETbZT',ZoT',bZiUT';H/EHUEiHU'jEZEH',iESEiHU'jEZEH',jZHEiHU'jEZEH',EHUHTU'jEZEH',iESHTU'jEZEH',jZHHTU'jEZEH',bU'jEZEH',bUHEU'jEZEH',jEbUU'jEZEH',iUH';E/iESEiHU'jEZEH'iE',jZHEiHU'jEZEH'iE',iESHTU'jEZEH'iE',jZHHTU'jEZEH'iE',bU'jEZEH'iE',bUHEU'jEZEH'iE',jEbUU'jEZEH'iE',iUH'iE',iESEiHU'jEZEH'oUEHE',jZHEiHU'jEZEH'oUEHE',iESHTU'jEZEH'oUEHE',jZHHTU'jEZEH'oUEHE',bU'jEZEH'oUEHE',bUHEU'jEZEH'oUEHE',jEbUU'jEZEH'oUEHE',iUH'oUEHE',oHHbE',oZiTE';Z/iESEiHU'jEZEH'iE'HUi,jZHEiHU'jEZEH'iE'HUi,iESHTU'jEZEH'iE'HUi,jZHHTU'jEZEH'iE'HUi,bU'jEZEH'iE'HUi,bUHEU'jEZEH'iE'HUi,jEbUU'jEZEH'iE'HUi,iUH'iE'HUi,iESEiHU'jEZEH'oUEHE'HUi,jZHEiHU'jEZEH'oUEHE'HUi,iESHTU'jEZEH'oUEHE'HUi,jZHHTU'jEZEH'oUEHE'HUi,bU'jEZEH'oUEHE'HUi,bUHEU'jEZEH'oUEHE'HUi,jEbUU'jEZEH'oUEHE'HUi,iUH'oUEHE'HUi,oHHbE'HUi,oZiTE'HUi,iESi,jZHi,bS;U'/UjSU',e;T'/ET',oUT',e;H'/bHH',bZiH',e;E'/HUEiHU'jEZEH'iE',HUHTU'jEZEH'iE',HUEiHU'jEZEH'oUEHE',HUHTU'jEZEH'oUEHE',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination2() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;P;W;R;H#m;o;z#S/PzWzR,SPWzR,SPoS,SWm,SmSPS,zSoWW;P/Hm,RS,RzPR,SR,SW,mSRzW;W/HHHPo,HS,WPmH,WPmHz,Wm;R/SPzR,WP;H/RPRPS,m");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;P;W;R;H;S';P';W';R';H'#m;o;z#S/PzWzRS',zSoWWS';P/HmP',RSP',RzPRP',zSoWWS'RP',zSoWWS'WP',mSRzWP';W/HHHPoW',HSW';R/HmP'zWzRS'PzRR',zSoWWS'RP'zWzRS'PzRR',zSoWWS'WP'zWzRS'PzRR',mSRzWP'zWzRS'PzRR',zSoWWS'PzRR',HHHPoW'PR',HSW'PR';H/zSoWWS'RP'zWzRS'PzRR'PRPSH',zSoWWS'WP'zWzRS'PzRR'PRPSH',mSRzWP'zWzRS'PzRR'PRPSH',zSoWWS'PzRR'PRPSH',mH';S'/PWzRS',PoSS',WmS',mSPSS',e;P'/zWzRS'RP',zWzRS'WP',e;W'/PmHW',PmHzW',mW',e;R'/SP'zWzRS'PzRR',zPRP'zWzRS'PzRR',e;H'/mP'zWzRS'PzRR'PRPSH',HHPoW'PR'PRPSH',SW'PR'PRPSH',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination3() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;D;R;C;O#p;q;t;u;x#S/RDO,RqD,qCS,qD,qSR,xDDp;D/DxCu,DxOq,OCtC,RS,RSqS,SDCD;R/RS,RuOt,p,uDRR;C/CS,DtDx,SSp,tD;O/RS,SOtS,SRu,tO");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;D;R;C;O;D';R';C'#p;q;t;u;x#S/RDO,RqD,qCS,qD,qSR,xDDp;D/OCtCD',RSD',RSqSD',RDODCDD',RqDDCDD',qCSDCDD',qDDCDD',qSRDCDD',xDDpDCDD';R/pR',uDRRR';C/OCtCD'tDxC',pR'SD'tDxC',uDRRR'SD'tDxC',pR'SqSD'tDxC',uDRRR'SqSD'tDxC',pR'DODCDD'tDxC',uDRRR'DODCDD'tDxC',pR'qDDCDD'tDxC',uDRRR'qDDCDD'tDxC',qCSDCDD'tDxC',qDDCDD'tDxC',qSRDCDD'tDxC',xDDpDCDD'tDxC',pR'DOSpC',uDRRR'DOSpC',pR'qDSpC',uDRRR'qDSpC',qCSSpC',qDSpC',qSRSpC',xDDpSpC',tDC';O/pR'S,uDRRR'S,pR'DOOtS,uDRRR'DOOtS,pR'qDOtS,uDRRR'qDOtS,qCSOtS,qDOtS,qSROtS,xDDpOtS,pR'DORu,uDRRR'DORu,pR'qDRu,uDRRR'qDRu,qCSRu,qDRu,qSRRu,xDDpRu,tO;D'/xCuD',xOqD',e;R'/SR',uOtR',e;C'/SC',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination4() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;P;J;M;N;W#n;o;s;t#S/SNJt,o,oSs;P/PnP,Ps,PsNMP,WSNsN,oN,oWWJ;J/MsWsN,StSW,WWnSM;M/JSnPn,MS,MoPSt,StPPn,Ws,sNNtJ;N/JMSS,PnW,PoS,PsJ,Wn,nW;W/MMs,Wn,oJ,oWM,tP");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;P;J;M;N;W;S';P';M';W'#n;o;s;t#S/oS',oSsS';P/WSNsNP',oNP',oWWJP';J/MsWsN,oS'tSW,oSsS'tSW,WWnSM;M/oS'tSWSnPnM',oSsS'tSWSnPnM',WWnSMSnPnM',oS'tPPnM',oSsS'tPPnM',WsM',sNNtJM';N/oS'tSWSnPnM'sWsNMSS,oSsS'tSWSnPnM'sWsNMSS,WWnSMSnPnM'sWsNMSS,oS'tPPnM'sWsNMSS,oSsS'tPPnM'sWsNMSS,WsM'sWsNMSS,sNNtJM'sWsNMSS,oS'tSWMSS,oSsS'tSWMSS,WWnSMMSS,WSNsNP'nW,oNP'nW,oWWJP'nW,WSNsNP'oS,oNP'oS,oWWJP'oS,WSNsNP'sJ,oNP'sJ,oWWJP'sJ,Wn,nW;W/oS'tSWSnPnM'MsW',oSsS'tSWSnPnM'MsW',oS'tPPnM'MsW',oSsS'tPPnM'MsW',sNNtJM'MsW',oJW',oWMW',tPW';S'/NJtS',e;P'/nPP',sP',sNMPP',e;M'/sWsNSnPnM',SM',oPStM',e;W'/WnSMSnPnM'MsW',sM'MsW',nW',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination5() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;O;Q;W;U;D#n;q;u;w;y#S/SQ,SS,n,nQn;O/QqS,u,uQ,wO,wQU;Q/yU,yWDqU;W/QnDw,qS,uOW,w,y,yD;U/OwS,QSuS,UQWqS,qUSu,qWyO,yU;D/DQQ,DQUU,OQU,OwUnO,SUU,y");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;O;Q;W;U;D;S';U';D'#n;q;u;w;y#S/nS',nQnS';O/QqS,u,uQ,wO,wQU;Q/yU,yWDqU;W/yUnDw,yWDqUnDw,qS,uOW,w,y,yD;U/yUqSwSU',yWDqUqSwSU',uwSU',uQwSU',wOwSU',wQUwSU',yUSuSU',yWDqUSuSU',qUSuU',qWyOU',yUU';D/yUqSQUD',yWDqUqSQUD',uQUD',uQQUD',wOQUD',wQUQUD',yUqSwUnOD',yWDqUqSwUnOD',uwUnOD',uQwUnOD',wOwUnOD',wQUwUnOD',nS'UUD',nQnS'UUD',yD';S'/QS',SS',e;U'/QWqSU',e;D'/QQD',QUUD',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination6() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;Y;W;M;X#g;i;s;u;x#S/SXi,SiMi,WXYsX,xSY;Y/MSW,uSXuY;W/YS,gMi,x;M/Mi,Mx,SMWX,Wu,sY;X/MS,YWS,gWY,gX,iMu");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;Y;W;M;X;S';M'#g;i;s;u;x#S/WXYsXS',xSYS';Y/MSW,uSXuY;W/MSWS,uSXuYS,gMi,x;M/uSXuYSXYsXS'MWXM',gMiXYsXS'MWXM',xXYsXS'MWXM',xSYS'MWXM',uSXuYSuM',gMiuM',xuM',sYM';X/uSXuYSXYsXS'MWXM'S,gMiXYsXS'MWXM'S,xXYsXS'MWXM'S,xSYS'MWXM'S,uSXuYSuM'S,gMiuM'S,xuM'S,sYM'S,uSXuYSXYsXS'MWXM'SWWS,gMiXYsXS'MWXM'SWWS,xXYsXS'MWXM'SWWS,xSYS'MWXM'SWWS,uSXuYSuM'SWWS,gMiuM'SWWS,xuM'SWWS,sYM'SWWS,uSXuYWS,gWY,gX,iMu;S'/XiS',iMiS',e;M'/iM',xM',SWSXYsXS'MWXM',SWSuM',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination7() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;A;P;D;W#d;j;n#S/PdDjA,SADWW,SSSW,dWDn,dWPAj;A/SA,SPj,jDW;P/DWnA,PjAPS,PjAdS,SjPn,dSj;D/ADjS,PdAPn;W/jPjPS,jSjA");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;A;P;D;W;S';P';D'#d;j;n#S/PdDjAS',dWDnS',dWPAjS';A/PdDjAS'A,dWDnS'A,dWPAjS'A,PdDjAS'Pj,dWDnS'Pj,dWPAjS'Pj,jDW;P/DWnAP',dWDnS'jPnP',dWPAjS'jPnP',dSjP';D/dWDnS'jPnP'dDjAS'ADjSD',dWPAjS'jPnP'dDjAS'ADjSD',dSjP'dDjAS'ADjSD',dWDnS'ADjSD',dWPAjS'ADjSD',dWDnS'jPnP'dDjAS'PjDjSD',dWPAjS'jPnP'dDjAS'PjDjSD',dSjP'dDjAS'PjDjSD',dWDnS'PjDjSD',dWPAjS'PjDjSD',jDWDjSD',dWDnS'jPnP'dAPnD',dWPAjS'jPnP'dAPnD',dSjP'dAPnD';W/jPjPS,jSjA;S'/ADWWS',SSWS',e;P'/jAPSP',jAdSP',dDjAS'jPnP',e;D'/WnAP'dDjAS'ADjSD',WnAP'dDjAS'PjDjSD',WnAP'dAPnD',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination8() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;K;Y;B;L#b;t;u#S/LKB,Lb,Lu,Sb,SuY,bSSu;K/BSBu,BYL,KY,KYBL,u;Y/YLBY,tL,uSBbS;B/KtKb,LLbSb,YY,b,t;L/BYu,LSuKS,Yu,tSLB,u,uYKLb");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;K;Y;B;L;S';K';Y';B';L'#b;t;u#S/LKBS',LbS',LuS',bSSuS';K/BSBuK',BYLK',uK';Y/tLY',uSBbSY';B/uK'tKbB',LLbSbB',tLY'YB',uSBbSY'YB',bB',tB';L/uK'tKbB'YuL',tLY'YB'YuL',uSBbSY'YB'YuL',bB'YuL',tB'YuL',tLY'uL',uSBbSY'uL',tSLBL',uL',uYKLbL';S'/bS',uYS',e;K'/YK',YBLK',e;Y'/LBYY',e;B'/SBuK'tKbB',YLK'tKbB',e;L'/LbSbB'YuL',SuKSL',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination9() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;F;V;E;K#d;o;q;u;v#S/FKSK,KdF,SFd,q,uK,v;F/FK,uS,vFuV;V/FKvE,VFoFV,v;E/EEd,EqEo,FE,FS;K/FFS,KEd,KS,SFoSV,VE,o");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;F;V;E;K;S';F';V';E';K'#d;o;q;u;v#S/FKSKS',KdFS',qS',uKS',vS';F/uSF',vFuVF';V/uSF'KvEV',vFuVF'KvEV',vV';E/uSF'EE',vFuVF'EE',uSF'SE',vFuVF'SE';K/uSF'FSK',vFuVF'FSK',uSF'KSKS'FoSVK',vFuVF'KSKS'FoSVK',qS'FoSVK',uKS'FoSVK',vS'FoSVK',uSF'KvEV'EK',vFuVF'KvEV'EK',vV'EK',oK';S'/FdS',e;F'/KF',e;V'/FoFVV',e;E'/EdE',qEoE',e;K'/EdK',SK',dFS'FoSVK',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination10() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;L;Y;W;H#b;m;q;u#S/LYu,mHm,mWHS,qW;L/LLYS,LY,WqWSW;Y/HHqHL,WWmY,bYSmS,qLSH;W/HLLY,LbWWS,LmW,SWu,uHLmH;H/HYqYW,HqLWW,LWu,WW,bSWW,u");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;L;Y;W;H;L';W';H'#b;m;q;u#S/LYu,mHm,mWHS,qW;L/WqWSWL';Y/HHqHL,WWmY,bYSmS,qLSH;W/HLLYW',mHmWuW',mWHSWuW',qWWuW',uHLmHW';H/mHmWuW'qWSWL'WuH',mWHSWuW'qWSWL'WuH',qWWuW'qWSWL'WuH',uHLmHW'qWSWL'WuH',mHmWuW'WH',mWHSWuW'WH',qWWuW'WH',uHLmHW'WH',bSWWH',uH';L'/LYSL',YL',e;W'/qWSWL'bWWSW',qWSWL'mWW',qWSWL'YuWuW',e;H'/YqYWH',qLWWH',LLYW'qWSWL'WuH',LLYW'WH',e", cfgLeftRecElim.toString());
	}

}