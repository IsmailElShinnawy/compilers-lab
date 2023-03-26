package csen1002.tests.task5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task5.CfgLeftRecElim;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task5TestsBatch1 {

	@Test
	public void testCfgLeftRecursionElimination1() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;A;H;G;P#c;j;o;v#S/GvPA,cPA,jPP;A/AP,SGHvH,jHj,vSH;H/HAG,HoS,SAS,SPvS;G/AHc,GoHo,HPSoS,PGH,o;P/GjGjS,PSoP,PvP,jHA");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;A;H;G;P;A';H';G';P'#c;j;o;v#S/GvPA,cPA,jPP;A/GvPAGHvHA',cPAGHvHA',jPPGHvHA',jHjA',vSHA';H/GvPAASH',cPAASH',jPPASH',GvPAPvSH',cPAPvSH',jPPPvSH';G/cPAGHvHA'HcG',jPPGHvHA'HcG',jHjA'HcG',vSHA'HcG',cPAASH'PSoSG',jPPASH'PSoSG',cPAPvSH'PSoSG',jPPPvSH'PSoSG',PGHG',oG';P/cPAGHvHA'HcG'jGjSP',jPPGHvHA'HcG'jGjSP',jHjA'HcG'jGjSP',vSHA'HcG'jGjSP',cPAASH'PSoSG'jGjSP',jPPASH'PSoSG'jGjSP',cPAPvSH'PSoSG'jGjSP',jPPPvSH'PSoSG'jGjSP',oG'jGjSP',jHAP';A'/PA',e;H'/AGH',oSH',e;G'/vPAGHvHA'HcG',oHoG',vPAASH'PSoSG',vPAPvSH'PSoSG',e;P'/GHG'jGjSP',SoPP',vPP',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination2() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;W;K;L;Y;V;I#a;c;l;r;v#S/SvIl,WvYW,aV,cVlIS,r,vSl;W/IvLS,WKr,WlY,rWLv,vI;K/WKlIW,aW,c,cKL,r;L/KVSaV,LWl,c,cYL;Y/KKSL,LLc,LS,v;V/SrSYc,VLYS,VS,WIa,aIVcK,lY;I/LlYr,l,rSK,vWY");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;W;K;L;Y;V;I;S';W';L';V';I'#a;c;l;r;v#S/WvYWS',aVS',cVlISS',rS',vSlS';W/IvLSW',rWLvW',vIW';K/IvLSW'KlIW,rWLvW'KlIW,vIW'KlIW,aW,c,cKL,r;L/IvLSW'KlIWVSaVL',rWLvW'KlIWVSaVL',vIW'KlIWVSaVL',aWVSaVL',cVSaVL',cKLVSaVL',rVSaVL',cL',cYLL';Y/IvLSW'KlIWKSL,rWLvW'KlIWKSL,vIW'KlIWKSL,aWKSL,cKSL,cKLKSL,rKSL,IvLSW'KlIWVSaVL'Lc,rWLvW'KlIWVSaVL'Lc,vIW'KlIWVSaVL'Lc,aWVSaVL'Lc,cVSaVL'Lc,cKLVSaVL'Lc,rVSaVL'Lc,cL'Lc,cYLL'Lc,IvLSW'KlIWVSaVL'S,rWLvW'KlIWVSaVL'S,vIW'KlIWVSaVL'S,aWVSaVL'S,cVSaVL'S,cKLVSaVL'S,rVSaVL'S,cL'S,cYLL'S,v;V/IvLSW'vYWS'rSYcV',rWLvW'vYWS'rSYcV',vIW'vYWS'rSYcV',aVS'rSYcV',cVlISS'rSYcV',rS'rSYcV',vSlS'rSYcV',IvLSW'IaV',rWLvW'IaV',vIW'IaV',aIVcKV',lYV';I/rWLvW'KlIWVSaVL'lYrI',vIW'KlIWVSaVL'lYrI',aWVSaVL'lYrI',cVSaVL'lYrI',cKLVSaVL'lYrI',rVSaVL'lYrI',cL'lYrI',cYLL'lYrI',lI',rSKI',vWYI';S'/vIlS',e;W'/KrW',lYW',e;L'/WlL',e;V'/LYSV',SV',e;I'/vLSW'KlIWVSaVL'lYrI',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination3() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;X;K;G;D#c;l;v#S/SlKvG,Sv,XDl,c,vD;X/DSXv,XG,XSX,cXDvD,vGDG;K/SX,SvDSX;G/cS,lXG,vGl;D/GD,SDl,XGcS,XXGD,c");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;X;K;G;D;S';X';D'#c;l;v#S/XDlS',cS',vDS';X/DSXvX',cXDvDX',vGDGX';K/DSXvX'DlS'X,cXDvDX'DlS'X,vGDGX'DlS'X,cS'X,vDS'X,DSXvX'DlS'vDSX,cXDvDX'DlS'vDSX,vGDGX'DlS'vDSX,cS'vDSX,vDS'vDSX;G/cS,lXG,vGl;D/cSDD',lXGDD',vGlDD',cXDvDX'DlS'DlD',vGDGX'DlS'DlD',cS'DlD',vDS'DlD',cXDvDX'GcSD',vGDGX'GcSD',cXDvDX'XGDD',vGDGX'XGDD',cD';S'/lKvGS',vS',e;X'/GX',SXX',e;D'/SXvX'DlS'DlD',SXvX'GcSD',SXvX'XGDD',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination4() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;K;C;H;N;V;I#b;g;k;y#S/HH,IVySC,Sb,SgCIS,kNyV,yII;K/IIH,NbIk,gKHC,kKH,yH,yKkIK;C/HCgCN,KHgI,NgVSb,bSS,yNkS;H/CbSKS,HkNS,NVbC,SNN;N/HHVC,NSkN;V/yNyC,yVSHg;I/ICHS,ICgCk,VVVy,Vk,kSHI,y");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;K;C;H;N;V;I;S';H';N';I'#b;g;k;y#S/HHS',IVySCS',kNyVS',yIIS';K/IIH,NbIk,gKHC,kKH,yH,yKkIK;C/HCgCN,IIHHgI,NbIkHgI,gKHCHgI,kKHHgI,yHHgI,yKkIKHgI,NgVSb,bSS,yNkS;H/IIHHgIbSKSH',NbIkHgIbSKSH',gKHCHgIbSKSH',kKHHgIbSKSH',yHHgIbSKSH',yKkIKHgIbSKSH',NgVSbbSKSH',bSSbSKSH',yNkSbSKSH',NVbCH',IVySCS'NNH',kNyVS'NNH',yIIS'NNH';N/IIHHgIbSKSH'HVCN',gKHCHgIbSKSH'HVCN',kKHHgIbSKSH'HVCN',yHHgIbSKSH'HVCN',yKkIKHgIbSKSH'HVCN',bSSbSKSH'HVCN',yNkSbSKSH'HVCN',IVySCS'NNH'HVCN',kNyVS'NNH'HVCN',yIIS'NNH'HVCN';V/yNyC,yVSHg;I/yNyCVVyI',yVSHgVVyI',yNyCkI',yVSHgkI',kSHII',yI';S'/bS',gCISS',e;H'/CgCNbSKSH',kNSH',HS'NNH',e;N'/bIkHgIbSKSH'HVCN',gVSbbSKSH'HVCN',VbCH'HVCN',SkNN',e;I'/CHSI',CgCkI',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination5() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;M;V;X;Q#c;d;j;l#S/Qc,l;M/MSdV,MV,QVSl,VjS,lXQVQ;V/MS,MVc,SQlM,VM,VdQS,lVVc;X/QQc,SX,dSl,dVXlX;Q/XcS,XlM,dXlV");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;M;V;X;Q;M';V';Q'#c;d;j;l#S/Qc,l;M/QVSlM',VjSM',lXQVQM';V/QVSlM'SV',lXQVQM'SV',QVSlM'VcV',lXQVQM'VcV',QcQlMV',lQlMV',lVVcV';X/QQc,QcX,lX,dSl,dVXlX;Q/lXcSQ',dSlcSQ',dVXlXcSQ',lXlMQ',dSllMQ',dVXlXlMQ',dXlVQ';M'/SdVM',VM',e;V'/jSM'SV',jSM'VcV',MV',dQSV',e;Q'/QccSQ',cXcSQ',QclMQ',cXlMQ',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination6() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;Y;V;Z;A#j;p;v;x;y#S/SxY,VSZ,VVYYp,pSjA,xZjVZ,yVvV;Y/ASjVA,ApZp,YV,Yv,xZSAv,yVjY;V/SY,VAvAj,VxSV,ZASx,jSV,jY;Z/VYAAV,VpYYZ,ZVx,pV;A/AZAxS,VxYAy,ZSZ,jAjSS,v");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;Y;V;Z;A;S';Y';V';Z';A'#j;p;v;x;y#S/VSZS',VVYYpS',pSjAS',xZjVZS',yVvVS';Y/ASjVAY',ApZpY',xZSAvY',yVjYY';V/pSjAS'YV',xZjVZS'YV',yVvVS'YV',ZASxV',jSVV',jYV';Z/pSjAS'YV'YAAVZ',xZjVZS'YV'YAAVZ',yVvVS'YV'YAAVZ',jSVV'YAAVZ',jYV'YAAVZ',pSjAS'YV'pYYZZ',xZjVZS'YV'pYYZZ',yVvVS'YV'pYYZZ',jSVV'pYYZZ',jYV'pYYZZ',pVZ';A/pSjAS'YV'xYAyA',xZjVZS'YV'xYAyA',yVvVS'YV'xYAyA',pSjAS'YV'YAAVZ'ASxV'xYAyA',xZjVZS'YV'YAAVZ'ASxV'xYAyA',yVvVS'YV'YAAVZ'ASxV'xYAyA',jSVV'YAAVZ'ASxV'xYAyA',jYV'YAAVZ'ASxV'xYAyA',pSjAS'YV'pYYZZ'ASxV'xYAyA',xZjVZS'YV'pYYZZ'ASxV'xYAyA',yVvVS'YV'pYYZZ'ASxV'xYAyA',jSVV'pYYZZ'ASxV'xYAyA',jYV'pYYZZ'ASxV'xYAyA',pVZ'ASxV'xYAyA',jSVV'xYAyA',jYV'xYAyA',pSjAS'YV'YAAVZ'SZA',xZjVZS'YV'YAAVZ'SZA',yVvVS'YV'YAAVZ'SZA',jSVV'YAAVZ'SZA',jYV'YAAVZ'SZA',pSjAS'YV'pYYZZ'SZA',xZjVZS'YV'pYYZZ'SZA',yVvVS'YV'pYYZZ'SZA',jSVV'pYYZZ'SZA',jYV'pYYZZ'SZA',pVZ'SZA',jAjSSA',vA';S'/xYS',e;Y'/VY',vY',e;V'/SZS'YV',VYYpS'YV',AvAjV',xSVV',e;Z'/ASxV'YAAVZ',ASxV'pYYZZ',VxZ',e;A'/ZAxSA',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination7() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;R;N;Z;M;B#f;h;i#S/BhN,MShS,ZSRhZ,h,iSNiM;R/BZNiB,RN,RfNSi,SZiN,iZ;N/NiS,RfSM,SZRi,i,iNfRR,iZRM;Z/SZMZ,SfBhR,hBSM;M/fBiR,fNf,fR;B/BMMhB,BiNi,SBiR,ZZ");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;R;N;Z;M;B;R';N';Z';B'#f;h;i#S/BhN,MShS,ZSRhZ,h,iSNiM;R/BZNiBR',BhNZiNR',MShSZiNR',ZSRhZZiNR',hZiNR',iSNiMZiNR',iZR';N/BZNiBR'fSMN',BhNZiNR'fSMN',MShSZiNR'fSMN',ZSRhZZiNR'fSMN',hZiNR'fSMN',iSNiMZiNR'fSMN',iZR'fSMN',BhNZRiN',MShSZRiN',ZSRhZZRiN',hZRiN',iSNiMZRiN',iN',iNfRRN',iZRMN';Z/BhNZMZZ',MShSZMZZ',hZMZZ',iSNiMZMZZ',BhNfBhRZ',MShSfBhRZ',hfBhRZ',iSNiMfBhRZ',hBSMZ';M/fBiR,fNf,fR;B/fBiRShSBiRB',fNfShSBiRB',fRShSBiRB',fBiRShSZMZZ'SRhZBiRB',fNfShSZMZZ'SRhZBiRB',fRShSZMZZ'SRhZBiRB',hZMZZ'SRhZBiRB',iSNiMZMZZ'SRhZBiRB',fBiRShSfBhRZ'SRhZBiRB',fNfShSfBhRZ'SRhZBiRB',fRShSfBhRZ'SRhZBiRB',hfBhRZ'SRhZBiRB',iSNiMfBhRZ'SRhZBiRB',hBSMZ'SRhZBiRB',hBiRB',iSNiMBiRB',fBiRShSZMZZ'ZB',fNfShSZMZZ'ZB',fRShSZMZZ'ZB',hZMZZ'ZB',iSNiMZMZZ'ZB',fBiRShSfBhRZ'ZB',fNfShSfBhRZ'ZB',fRShSfBhRZ'ZB',hfBhRZ'ZB',iSNiMfBhRZ'ZB',hBSMZ'ZB';R'/NR',fNSiR',e;N'/iSN',e;Z'/SRhZZMZZ',SRhZfBhRZ',e;B'/MMhBB',iNiB',hNBiRB',hNZMZZ'SRhZBiRB',hNfBhRZ'SRhZBiRB',hNZMZZ'ZB',hNfBhRZ'ZB',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination8() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;X;N;G;V#c;i;l;r;v#S/NS,NSr;X/XVrS,c;N/NNNl,NcG,SN,XG,cSv;G/NVGG,SViGv,iGGV,rXSVS;V/VGG,Vc,Vl,XXN");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;X;N;G;V;X';N';V'#c;i;l;r;v#S/NS,NSr;X/cX';N/cX'GN',cSvN';G/cX'GN'VGG,cSvN'VGG,cX'GN'SViGv,cSvN'SViGv,cX'GN'SrViGv,cSvN'SrViGv,iGGV,rXSVS;V/cX'XNV';X'/VrSX',e;N'/NNlN',cGN',SNN',SrNN',e;V'/GGV',cV',lV',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination9() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;E;A;Z;Y#s;w;z#S/SYY,Zs,zEA;E/AYY,EY,EwE,ZS,ZsE;A/AAzA,AZSES,AsZYz,ZAwAs,ZEZZ,zZzA;Z/ASZw,SsYY,z;Y/EEsY,SSAYs,w,zASSA");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;E;A;Z;Y;S';E';A';Z'#s;w;z#S/ZsS',zEAS';E/AYYE',ZSE',ZsEE';A/ZAwAsA',ZEZZA',zZzAA';Z/zZzAA'SZwZ',zEAS'sYYZ',zZ';Y/zZzAA'SZwZ'AwAsA'YYE'EsY,zEAS'sYYZ'AwAsA'YYE'EsY,zZ'AwAsA'YYE'EsY,zZzAA'SZwZ'EZZA'YYE'EsY,zEAS'sYYZ'EZZA'YYE'EsY,zZ'EZZA'YYE'EsY,zZzAA'YYE'EsY,zZzAA'SZwZ'SE'EsY,zEAS'sYYZ'SE'EsY,zZ'SE'EsY,zZzAA'SZwZ'sEE'EsY,zEAS'sYYZ'sEE'EsY,zZ'sEE'EsY,zZzAA'SZwZ'sS'SAYs,zEAS'sYYZ'sS'SAYs,zZ'sS'SAYs,zEAS'SAYs,w,zASSA;S'/YYS',e;E'/YE',wEE',e;A'/AzAA',ZSESA',sZYzA',e;Z'/AwAsA'SZwZ',EZZA'SZwZ',sS'sYYZ',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination10() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;G;I;R;Y;X#m;o;s;u#S/SIIu,mIGu,uYGuR;G/GSGs,GX,IIu,oR,sGX;I/GuYRS,XG,XRXu,oIXS;R/GYRuX,IoG,SXYRo,mSsIo,sI;Y/GGsIY,RoImR;X/Xo,XoS,mRm,s,u,uX");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;G;I;R;Y;X;S';G';I';X'#m;o;s;u#S/mIGuS',uYGuRS';G/IIuG',oRG',sGXG';I/oRG'uYRSI',sGXG'uYRSI',XGI',XRXuI',oIXSI';R/oRG'uYRSI'IuG'YRuX,sGXG'uYRSI'IuG'YRuX,XGI'IuG'YRuX,XRXuI'IuG'YRuX,oIXSI'IuG'YRuX,oRG'YRuX,sGXG'YRuX,oRG'uYRSI'oG,sGXG'uYRSI'oG,XGI'oG,XRXuI'oG,oIXSI'oG,mIGuS'XYRo,uYGuRS'XYRo,mSsIo,sI;Y/oRG'uYRSI'IuG'GsIY,sGXG'uYRSI'IuG'GsIY,XGI'IuG'GsIY,XRXuI'IuG'GsIY,oIXSI'IuG'GsIY,oRG'GsIY,sGXG'GsIY,oRG'uYRSI'IuG'YRuXoImR,sGXG'uYRSI'IuG'YRuXoImR,XGI'IuG'YRuXoImR,XRXuI'IuG'YRuXoImR,oIXSI'IuG'YRuXoImR,oRG'YRuXoImR,sGXG'YRuXoImR,oRG'uYRSI'oGoImR,sGXG'uYRSI'oGoImR,XGI'oGoImR,XRXuI'oGoImR,oIXSI'oGoImR,mIGuS'XYRooImR,uYGuRS'XYRooImR,mSsIooImR,sIoImR;X/mRmX',sX',uX',uXX';S'/IIuS',e;G'/SGsG',XG',e;I'/IuG'uYRSI',e;X'/oX',oSX',e", cfgLeftRecElim.toString());
	}

}