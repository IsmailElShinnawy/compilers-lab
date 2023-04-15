package csen1002.tests.task5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task5.CfgLeftRecElim;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task5TestsBatch7 {

	@Test
	public void testCfgLeftRecursionElimination1() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;L;Y;M;H#c;f;h;m;z#S/MSL,YzSS,YzYH,zYS;L/HMfLL,LSY,Lm;Y/LhMM,ML,SSHH,YL,YSH,m;M/fLHm,m;H/MfSf,SYLLS,Sm,cYYfH");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;L;Y;M;H;L';Y';H'#c;f;h;m;z#S/MSL,YzSS,YzYH,zYS;L/HMfLLL';Y/HMfLLL'hMMY',MLY',MSLSHHY',zYSSHHY',mY';M/fLHm,m;H/fLHmfSfH',mfSfH',fLHmSLYLLSH',mSLYLLSH',fLHmLY'zSSYLLSH',mLY'zSSYLLSH',fLHmSLSHHY'zSSYLLSH',mSLSHHY'zSSYLLSH',zYSSHHY'zSSYLLSH',mY'zSSYLLSH',fLHmLY'zYHYLLSH',mLY'zYHYLLSH',fLHmSLSHHY'zYHYLLSH',mSLSHHY'zYHYLLSH',zYSSHHY'zYHYLLSH',mY'zYHYLLSH',zYSYLLSH',fLHmSLmH',mSLmH',fLHmLY'zSSmH',mLY'zSSmH',fLHmSLSHHY'zSSmH',mSLSHHY'zSSmH',zYSSHHY'zSSmH',mY'zSSmH',fLHmLY'zYHmH',mLY'zYHmH',fLHmSLSHHY'zYHmH',mSLSHHY'zYHmH',zYSSHHY'zYHmH',mY'zYHmH',zYSmH',cYYfHH';L'/SYL',mL',e;Y'/zSSSHHY',zYHSHHY',LY',SHY',e;H'/MfLLL'hMMY'zSSYLLSH',MfLLL'hMMY'zYHYLLSH',MfLLL'hMMY'zSSmH',MfLLL'hMMY'zYHmH',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination2() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;J;X;L;C;E#a;c;g;j#S/SEX,SJ,c,cC;J/LjSLc,SjLSa,aEjC;X/ESJg,jECC;L/Ec,LEX,LLJg,SXaE,a,j;C/CgJa,EXcX,JXEjJ,LaScL,XJcJC,XS;E/ESaJL,JaES,Sc,jX");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;J;X;L;C;E;S';L';C';E'#a;c;g;j#S/cS',cCS';J/LjSLc,cS'jLSa,cCS'jLSa,aEjC;X/ESJg,jECC;L/EcL',cS'XaEL',cCS'XaEL',aL',jL';C/EXcXC',EcL'jSLcXEjJC',cS'XaEL'jSLcXEjJC',cCS'XaEL'jSLcXEjJC',aL'jSLcXEjJC',jL'jSLcXEjJC',cS'jLSaXEjJC',cCS'jLSaXEjJC',aEjCXEjJC',EcL'aScLC',cS'XaEL'aScLC',cCS'XaEL'aScLC',aL'aScLC',jL'aScLC',ESJgJcJCC',jECCJcJCC',ESJgSC',jECCSC';E/cS'XaEL'jSLcaESE',cCS'XaEL'jSLcaESE',aL'jSLcaESE',jL'jSLcaESE',cS'jLSaaESE',cCS'jLSaaESE',aEjCaESE',cS'cE',cCS'cE',jXE';S'/EXS',JS',e;L'/EXL',LJgL',e;C'/gJaC',e;E'/SaJLE',cL'jSLcaESE',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination3() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;X;B;J;Z#d;s;v#S/BBv,Xd,XsXS,sJ,vSB;X/SZsS,Ss,SvBdS,XB,XZs,vSsBv;B/BJBvB,BdBs,dSsS;J/ZB,sBdJ;Z/BsB,JdSsX");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;X;B;J;Z;X';B';Z'#d;s;v#S/BBv,Xd,XsXS,sJ,vSB;X/BBvZsSX',sJZsSX',vSBZsSX',BBvsX',sJsX',vSBsX',BBvvBdSX',sJvBdSX',vSBvBdSX',vSsBvX';B/dSsSB';J/ZB,sBdJ;Z/dSsSB'sBZ',sBdJdSsXZ';X'/dZsSX',sXSZsSX',dsX',sXSsX',dvBdSX',sXSvBdSX',BX',ZsX',e;B'/JBvBB',dBsB',e;Z'/BdSsXZ',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination4() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;J;K;Q;I;T#l;m;o;z#S/lKmJQ,mSQl,oJ;J/QzIl,TJoK;K/JT,KT,KTzSK,Sl,mIIJo,oSQ;Q/QlI,zQoJJ;I/IQJz,IzIoK,JSIK,Sm,TzQzI,oS;T/JK,SmQ,TmTz,lTSS,oI");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;J;K;Q;I;T;K';Q';I';T'#l;m;o;z#S/lKmJQ,mSQl,oJ;J/QzIl,TJoK;K/QzIlTK',TJoKTK',lKmJQlK',mSQllK',oJlK',mIIJoK',oSQK';Q/zQoJJQ';I/zQoJJQ'zIlSIKI',TJoKSIKI',lKmJQmI',mSQlmI',oJmI',TzQzII',oSI';T/zQoJJQ'zIlKT',lKmJQmQT',mSQlmQT',oJmQT',lTSST',oIT';K'/TK',TzSKK',e;Q'/lIQ',e;I'/QJzI',zIoKI',e;T'/JoKKT',mTzT',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination5() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;E;R;J;D#b;n;r#S/DJrJ,SnE,bJED,bJRnD,rS;E/EJEnD,ESRSJ,nRn,rES;R/DnD,RJ,RRDrD,SEnRR;J/SREb,SrEJE,bEn,rJrSr;D/DbJJ,Rb,RnRDr,b,n,nS");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;E;R;J;D;S';E';R';D'#b;n;r#S/DJrJS',bJEDS',bJRnDS',rSS';E/nRnE',rESE';R/DnDR',DJrJS'EnRRR',bJEDS'EnRRR',bJRnDS'EnRRR',rSS'EnRRR';J/DJrJS'REb,bJEDS'REb,bJRnDS'REb,rSS'REb,DJrJS'rEJE,bJEDS'rEJE,bJRnDS'rEJE,rSS'rEJE,bEn,rJrSr;D/bJEDS'EnRRR'bD',bJRnDS'EnRRR'bD',rSS'EnRRR'bD',bJEDS'EnRRR'nRDrD',bJRnDS'EnRRR'nRDrD',rSS'EnRRR'nRDrD',bD',nD',nSD';S'/nES',e;E'/JEnDE',SRSJE',e;R'/JR',RDrDR',e;D'/bJJD',nDR'bD',JrJS'EnRRR'bD',nDR'nRDrD',JrJS'EnRRR'nRDrD',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination6() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;Q;E;D;L#a;r;u;x;z#S/LrEr,u,uDzEu,uE;Q/LD,Sx,rD,xSrLz;E/EEL,EQ,aS;D/DSQa,DaDuD,Qu,SDzD,SLQSS,xSrQD;L/DDaDa,SxQ,uS");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;Q;E;D;L;E';D';L'#a;r;u;x;z#S/LrEr,u,uDzEu,uE;Q/LD,LrErx,ux,uDzEux,uEx,rD,xSrLz;E/aSE';D/LDuD',LrErxuD',uxuD',uDzEuxuD',uExuD',rDuD',xSrLzuD',LrErDzDD',uDzDD',uDzEuDzDD',uEDzDD',LrErLQSSD',uLQSSD',uDzEuLQSSD',uELQSSD',xSrQDD';L/uxuD'DaDaL',uDzEuxuD'DaDaL',uExuD'DaDaL',rDuD'DaDaL',xSrLzuD'DaDaL',uDzDD'DaDaL',uDzEuDzDD'DaDaL',uEDzDD'DaDaL',uLQSSD'DaDaL',uDzEuLQSSD'DaDaL',uELQSSD'DaDaL',xSrQDD'DaDaL',uxQL',uDzEuxQL',uExQL',uSL';E'/ELE',QE',e;D'/SQaD',aDuDD',e;L'/DuD'DaDaL',rErxuD'DaDaL',rErDzDD'DaDaL',rErLQSSD'DaDaL',rErxQL',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination7() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;F;L;A;H#a;d;m;o#S/Ha,HoF,LoSd,aHoA;F/Fd,FmSmS,aFoFd,mF,mHLSa;L/LA,LFHLF,mH,o,oSAaH;A/FaS,FoFo,HH,LLm,m;H/AAF,FS");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;F;L;A;H;F';L';H'#a;d;m;o#S/Ha,HoF,LoSd,aHoA;F/aFoFdF',mFF',mHLSaF';L/mHL',oL',oSAaHL';A/aFoFdF'aS,mFF'aS,mHLSaF'aS,aFoFdF'oFo,mFF'oFo,mHLSaF'oFo,HH,mHL'Lm,oL'Lm,oSAaHL'Lm,m;H/aFoFdF'aSAFH',mFF'aSAFH',mHLSaF'aSAFH',aFoFdF'oFoAFH',mFF'oFoAFH',mHLSaF'oFoAFH',mHL'LmAFH',oL'LmAFH',oSAaHL'LmAFH',mAFH',aFoFdF'SH',mFF'SH',mHLSaF'SH';F'/dF',mSmSF',e;L'/AL',FHLFL',e;H'/HAFH',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination8() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;L;B;H;N#a;h;r;s;u#S/BBrBh,Ns,a,sH,sLuHN,sSaB;L/Bs,LN,LSHB,aHBL,hBN;B/LHrSH,LLHN,LNH;H/BNHHS,HhS,Hu,LHaNB,SNHN;N/SH,hNH");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;L;B;H;N;L';B';H';N'#a;h;r;s;u#S/BBrBh,Ns,a,sH,sLuHN,sSaB;L/BsL',aHBLL',hBNL';B/aHBLL'HrSHB',hBNL'HrSHB',aHBLL'LHNB',hBNL'LHNB',aHBLL'NHB',hBNL'NHB';H/aHBLL'HrSHB'NHHSH',hBNL'HrSHB'NHHSH',aHBLL'LHNB'NHHSH',hBNL'LHNB'NHHSH',aHBLL'NHB'NHHSH',hBNL'NHB'NHHSH',aHBLL'HrSHB'sL'HaNBH',hBNL'HrSHB'sL'HaNBH',aHBLL'LHNB'sL'HaNBH',hBNL'LHNB'sL'HaNBH',aHBLL'NHB'sL'HaNBH',hBNL'NHB'sL'HaNBH',aHBLL'HaNBH',hBNL'HaNBH',aHBLL'HrSHB'BrBhNHNH',hBNL'HrSHB'BrBhNHNH',aHBLL'LHNB'BrBhNHNH',hBNL'LHNB'BrBhNHNH',aHBLL'NHB'BrBhNHNH',hBNL'NHB'BrBhNHNH',NsNHNH',aNHNH',sHNHNH',sLuHNNHNH',sSaBNHNH';N/aHBLL'HrSHB'BrBhHN',hBNL'HrSHB'BrBhHN',aHBLL'LHNB'BrBhHN',hBNL'LHNB'BrBhHN',aHBLL'NHB'BrBhHN',hBNL'NHB'BrBhHN',aHN',sHHN',sLuHNHN',sSaBHN',hNHN';L'/NL',SHBL',e;B'/sL'HrSHB',sL'LHNB',sL'NHB',e;H'/hSH',uH',e;N'/sHN',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination9() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;M;H;I;W#b;c;n#S/HHn,HWnSI,Hc,SI,SnHSb,WWW;M/SWbM,cSbS;H/bHcWM,nSM;I/HM,ISWIM,InM,MS,WSSH,cIIHb;W/HcS,MnSb,c,cIbS,nIH");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;M;H;I;W;S';I';W'#b;c;n#S/HHnS',HWnSIS',HcS',WWWS';M/HHnS'WbM,HWnSIS'WbM,HcS'WbM,WWWS'WbM,cSbS;H/bHcWM,nSM;I/bHcWMMI',nSMMI',bHcWMHnS'WbMSI',nSMHnS'WbMSI',bHcWMWnSIS'WbMSI',nSMWnSIS'WbMSI',bHcWMcS'WbMSI',nSMcS'WbMSI',WWWS'WbMSI',cSbSSI',WSSHI',cIIHbI';W/bHcWMcSW',nSMcSW',bHcWMHnS'WbMnSbW',nSMHnS'WbMnSbW',bHcWMWnSIS'WbMnSbW',nSMWnSIS'WbMnSbW',bHcWMcS'WbMnSbW',nSMcS'WbMnSbW',cSbSnSbW',cW',cIbSW',nIHW';S'/IS',nHSbS',e;I'/SWIMI',nMI',e;W'/WWS'WbMnSbW',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination10() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;F;R;D;G#q;r;z#S/DG,DSDq;F/rRzSS,zDzG;R/RDG,RSGq,SFz,SqD,zSD;D/FSSr,RrGRq,RrSGz,qFGF,r,zSDSr;G/GqSz,GrR,RqDRr");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;F;R;D;G;R';D';G'#q;r;z#S/DG,DSDq;F/rRzSS,zDzG;R/DGFzR',DSDqFzR',DGqDR',DSDqqDR',zSDR';D/rRzSSSSrD',zDzGSSrD',zSDR'rGRqD',zSDR'rSGzD',qFGFD',rD',zSDSrD';G/rRzSSSSrD'GFzR'qDRrG',zDzGSSrD'GFzR'qDRrG',zSDR'rGRqD'GFzR'qDRrG',zSDR'rSGzD'GFzR'qDRrG',qFGFD'GFzR'qDRrG',rD'GFzR'qDRrG',zSDSrD'GFzR'qDRrG',rRzSSSSrD'SDqFzR'qDRrG',zDzGSSrD'SDqFzR'qDRrG',zSDR'rGRqD'SDqFzR'qDRrG',zSDR'rSGzD'SDqFzR'qDRrG',qFGFD'SDqFzR'qDRrG',rD'SDqFzR'qDRrG',zSDSrD'SDqFzR'qDRrG',rRzSSSSrD'GqDR'qDRrG',zDzGSSrD'GqDR'qDRrG',zSDR'rGRqD'GqDR'qDRrG',zSDR'rSGzD'GqDR'qDRrG',qFGFD'GqDR'qDRrG',rD'GqDR'qDRrG',zSDSrD'GqDR'qDRrG',rRzSSSSrD'SDqqDR'qDRrG',zDzGSSrD'SDqqDR'qDRrG',zSDR'rGRqD'SDqqDR'qDRrG',zSDR'rSGzD'SDqqDR'qDRrG',qFGFD'SDqqDR'qDRrG',rD'SDqqDR'qDRrG',zSDSrD'SDqqDR'qDRrG',zSDR'qDRrG';R'/DGR',SGqR',e;D'/GFzR'rGRqD',SDqFzR'rGRqD',GqDR'rGRqD',SDqqDR'rGRqD',GFzR'rSGzD',SDqFzR'rSGzD',GqDR'rSGzD',SDqqDR'rSGzD',e;G'/qSzG',rRG',e", cfgLeftRecElim.toString());
	}

}