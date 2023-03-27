package csen1002.tests.task5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task5.CfgLeftRecElim;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task5TestsBatch3 {

	@Test
	public void testCfgLeftRecursionElimination1() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;I;X;Y;R;E;H#h;k;l;w;z#S/HwER,SRhR,SYSI;I/IXkX,Rh,SkSR,wEl;X/hHHR,zR,zRh;Y/YYzI,kY,wI,wRh,z;R/EwXRR,Hl,YHw,YlSH,hEhX;E/Hz,XzXXS,YE,hEY;H/HEHEI,HH,XR,XhRwS,h,wERY");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;I;X;Y;R;E;H;S';I';Y';H'#h;k;l;w;z#S/HwERS';I/RhI',HwERS'kSRI',wElI';X/hHHR,zR,zRh;Y/kYY',wIY',wRhY',zY';R/EwXRR,Hl,kYY'Hw,wIY'Hw,wRhY'Hw,zY'Hw,kYY'lSH,wIY'lSH,wRhY'lSH,zY'lSH,hEhX;E/Hz,hHHRzXXS,zRzXXS,zRhzXXS,kYY'E,wIY'E,wRhY'E,zY'E,hEY;H/hHHRRH',zRRH',zRhRH',hHHRhRwSH',zRhRwSH',zRhhRwSH',hH',wERYH';S'/RhRS',YSIS',e;I'/XkXI',e;Y'/YzIY',e;H'/EHEIH',HH',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination2() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;I;N;O;T#h;p;w;y#S/NwNST,TN,hS,hTNhS;I/TITS,TpSy,hSyN;N/IINS,NTIhN,NwTS,TNp,h;O/NhSS,NwSwO,OIO,OTyIy,Op,SwIO;T/ISOpS,NhTIw,SIOIp,SwNI");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;I;N;O;T;N';O';T'#h;p;w;y#S/NwNST,TN,hS,hTNhS;I/TITS,TpSy,hSyN;N/TITSINSN',TpSyINSN',hSyNINSN',TNpN',hN';O/TITSINSN'hSSO',TpSyINSN'hSSO',hSyNINSN'hSSO',TNpN'hSSO',hN'hSSO',TITSINSN'wSwOO',TpSyINSN'wSwOO',hSyNINSN'wSwOO',TNpN'wSwOO',hN'wSwOO',TITSINSN'wNSTwIOO',TpSyINSN'wNSTwIOO',hSyNINSN'wNSTwIOO',TNpN'wNSTwIOO',hN'wNSTwIOO',TNwIOO',hSwIOO',hTNhSwIOO';T/hSyNSOpST',hSyNINSN'hTIwT',hN'hTIwT',hSyNINSN'wNSTIOIpT',hN'wNSTIOIpT',hSIOIpT',hTNhSIOIpT',hSyNINSN'wNSTwNIT',hN'wNSTwNIT',hSwNIT',hTNhSwNIT';N'/TIhNN',wTSN',e;O'/IOO',TyIyO',pO',e;T'/ITSSOpST',pSySOpST',ITSINSN'hTIwT',pSyINSN'hTIwT',NpN'hTIwT',ITSINSN'wNSTIOIpT',pSyINSN'wNSTIOIpT',NpN'wNSTIOIpT',NIOIpT',ITSINSN'wNSTwNIT',pSyINSN'wNSTwNIT',NpN'wNSTwNIT',NwNIT',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination3() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;O;Y;Q;R;D#c;n;v;y#S/DYy,nY;O/DYYS,OSROv,OcS,cYQ,ySYvO;Y/DQR,OQ,Rn,Sc,cSQDv,yRyQy;Q/DY,DYO,QDYQn,QcQQ,vOSS,yQ;R/QR,YnSR,cYO,yD;D/cD,nQvO");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;O;Y;Q;R;D;O';Q';R'#c;n;v;y#S/DYy,nY;O/DYYSO',cYQO',ySYvOO';Y/DQR,DYYSO'Q,cYQO'Q,ySYvOO'Q,Rn,DYyc,nYc,cSQDv,yRyQy;Q/DYQ',DYOQ',vOSSQ',yQQ';R/DYQ'RR',DYOQ'RR',vOSSQ'RR',yQQ'RR',DQRnSRR',DYYSO'QnSRR',cYQO'QnSRR',ySYvOO'QnSRR',DYycnSRR',nYcnSRR',cSQDvnSRR',yRyQynSRR',cYOR',yDR';D/cD,nQvO;O'/SROvO',cSO',e;Q'/DYQnQ',cQQQ',e;R'/nnSRR',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination4() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;W;C;E;Y;J;R#a;b;d;z#S/CYzRz,WR,bSY;W/JREzJ,WEzSY,zEEC;C/JbE,RCbCR;E/aYRSJ,z;Y/Ed,YCaS,Yb,b,bCRES,zEERb;J/RzSJd,SCCb,SRCYa,dY;R/JCa,JRzCb,RRzYE,Rd,YJYb,aWb");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;W;C;E;Y;J;R;W';Y';J';R'#a;b;d;z#S/CYzRz,WR,bSY;W/JREzJW',zEECW';C/JbE,RCbCR;E/aYRSJ,z;Y/aYRSJdY',zdY',bY',bCRESY',zEERbY';J/RzSJdJ',RCbCRYzRzCCbJ',zEECW'RCCbJ',bSYCCbJ',RCbCRYzRzRCYaJ',zEECW'RRCYaJ',bSYRCYaJ',dYJ';R/zEECW'RCCbJ'CaR',bSYCCbJ'CaR',zEECW'RRCYaJ'CaR',bSYRCYaJ'CaR',dYJ'CaR',zEECW'RCCbJ'RzCbR',bSYCCbJ'RzCbR',zEECW'RRCYaJ'RzCbR',bSYRCYaJ'RzCbR',dYJ'RzCbR',aYRSJdY'JYbR',zdY'JYbR',bY'JYbR',bCRESY'JYbR',zEERbY'JYbR',aWbR';W'/EzSYW',e;Y'/CaSY',bY',e;J'/bEYzRzCCbJ',REzJW'RCCbJ',bEYzRzRCYaJ',REzJW'RRCYaJ',e;R'/zSJdJ'CaR',CbCRYzRzCCbJ'CaR',CbCRYzRzRCYaJ'CaR',zSJdJ'RzCbR',CbCRYzRzCCbJ'RzCbR',CbCRYzRzRCYaJ'RzCbR',RzYER',dR',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination5() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;A;E;W;P#c;l;x#S/AlASW,SAlA,SSlS,cASlS,cAWlP,x;A/El,c;E/EcWW,WPxE;W/EEWE,ExWEP,Pl,c;P/ElW,Pl,PlWx,SPESS,WcAP,cPWWc");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;A;E;W;P;S';E';W';P'#c;l;x#S/AlASWS',cASlSS',cAWlPS',xS';A/El,c;E/WPxEE';W/PlW',cW';P/cW'PxEE'lWP',cW'PxEE'llASWS'PESSP',clASWS'PESSP',cASlSS'PESSP',cAWlPS'PESSP',xS'PESSP',cW'cAPP',cPWWcP';S'/AlAS',SlSS',e;E'/cWWE',e;W'/PxEE'EWEW',PxEE'xWEPW',e;P'/lW'PxEE'lWP',lP',lWxP',lW'PxEE'llASWS'PESSP',lW'cAPP',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination6() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;K;B;T;G#h;j;q;w#S/GS,KBjKq,TBq,jT;K/KShSq,KhKqG,h,hBSTq,jGST,wTB;B/BBGw,BTwS,KKwTh,KjB,TBhG,TTqK;T/KG,TTG,hGBS,qG;G/SG,TBTj");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;K;B;T;G;K';B';T';G'#h;j;q;w#S/GS,KBjKq,TBq,jT;K/hK',hBSTqK',jGSTK',wTBK';B/hK'KwThB',hBSTqK'KwThB',jGSTK'KwThB',wTBK'KwThB',hK'jBB',hBSTqK'jBB',jGSTK'jBB',wTBK'jBB',TBhGB',TTqKB';T/hK'GT',hBSTqK'GT',jGSTK'GT',wTBK'GT',hGBST',qGT';G/hK'BjKqGG',hBSTqK'BjKqGG',jGSTK'BjKqGG',wTBK'BjKqGG',hK'GT'BqGG',hBSTqK'GT'BqGG',jGSTK'GT'BqGG',wTBK'GT'BqGG',hGBST'BqGG',qGT'BqGG',jTGG',hK'GT'BTjG',hBSTqK'GT'BTjG',jGSTK'GT'BTjG',wTBK'GT'BTjG',hGBST'BTjG',qGT'BTjG';K'/ShSqK',hKqGK',e;B'/BGwB',TwSB',e;T'/TGT',e;G'/SGG',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination7() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;J;K;E;Z;U;M#g;i;q;w#S/KgSiZ,SMMM,SUqKZ,iUq,wSS;J/gMwJw,wZMJ;K/JgZ,JqJ,SSi,iZZE,wM;E/JSi,MEw;Z/UgMKg,ZUSZ,ZgZqE,gZMw,qE,wJ;U/Eg,Sw,gEi;M/EgS,MKK,MiE,qK");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;J;K;E;Z;U;M;S';K';Z';M'#g;i;q;w#S/KgSiZS',iUqS',wSSS';J/gMwJw,wZMJ;K/gMwJwgZK',wZMJgZK',gMwJwqJK',wZMJqJK',iUqS'SiK',wSSS'SiK',iZZEK',wMK';E/gMwJwSi,wZMJSi,MEw;Z/UgMKgZ',gZMwZ',qEZ',wJZ';U/gMwJwSig,wZMJSig,MEwg,gMwJwgZK'gSiZS'w,wZMJgZK'gSiZS'w,gMwJwqJK'gSiZS'w,wZMJqJK'gSiZS'w,iUqS'SiK'gSiZS'w,wSSS'SiK'gSiZS'w,iZZEK'gSiZS'w,wMK'gSiZS'w,iUqS'w,wSSS'w,gEi;M/gMwJwSigSM',wZMJSigSM',qKM';S'/MMMS',UqKZS',e;K'/gSiZS'SiK',e;Z'/USZZ',gZqEZ',e;M'/EwgSM',KKM',iEM',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination8() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;A;I;J;G;R#f;n;r;z#S/RA,n;A/AnAJ,Ar,RR,zSzJG;I/JSfIr,f,fR;J/IfIA,SAn;G/GG,GI,SfI,SfR,SzI,zSz;R/RIfSn,SrGfG,fJf,n,rGA");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;A;I;J;G;R;A';J';G';R'#f;n;r;z#S/RA,n;A/RRA',zSzJGA';I/JSfIr,f,fR;J/ffIAJ',fRfIAJ',RAAnJ',nAnJ';G/RAfIG',nfIG',RAfRG',nfRG',RAzIG',nzIG',zSzG';R/nrGfGR',fJfR',nR',rGAR';A'/nAJA',rA',e;J'/SfIrfIAJ',e;G'/GG',IG',e;R'/IfSnR',ArGfGR',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination9() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;M;V;E;J;K;X#i;q;t;v;x#S/MiE,XvE,i;M/VMvMV,XEMM;V/iSKSJ,q,v;E/EEvS,Ex,SExVV,iM,vS;J/MK,SS;K/KS,KvMVX,XEV,XVMV;X/EVxKv,VK,XKv,tX,xK");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;M;V;E;J;K;X;E';K';X'#i;q;t;v;x#S/MiE,XvE,i;M/VMvMV,XEMM;V/iSKSJ,q,v;E/iSKSJMvMViEExVVE',qMvMViEExVVE',vMvMViEExVVE',XEMMiEExVVE',XvEExVVE',iExVVE',iME',vSE';J/iSKSJMvMVK,qMvMVK,vMvMVK,XEMMK,iSKSJMvMViES,qMvMViES,vMvMViES,XEMMiES,XvES,iS;K/XEVK',XVMVK';X/iSKSJMvMViEExVVE'VxKvX',qMvMViEExVVE'VxKvX',vMvMViEExVVE'VxKvX',iExVVE'VxKvX',iME'VxKvX',vSE'VxKvX',iSKSJKX',qKX',vKX',tXX',xKX';E'/EvSE',xE',e;K'/SK',vMVXK',e;X'/EMMiEExVVE'VxKvX',vEExVVE'VxKvX',KvX',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination10() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;X;U;J;T;C;D#c;m;s;w#S/CJTSC,XJ;X/XJTwD,XTsS,wJS;U/CSUTw,JJU,TSw,UD,Um,mXD;J/c,mDDcJ;T/DmUS,XwJmS,m,mSUs,sJD;C/UU,XJTwT;D/CC,CmTcD,s,sUsU,wUX");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;X;U;J;T;C;D;X';U';C';D'#c;m;s;w#S/CJTSC,XJ;X/wJSX';U/CSUTwU',JJUU',TSwU',mXDU';J/c,mDDcJ;T/DmUS,wJSX'wJmS,m,mSUs,sJD;C/cJUU'UC',mDDcJJUU'UC',DmUSSwU'UC',wJSX'wJmSSwU'UC',mSwU'UC',mSUsSwU'UC',sJDSwU'UC',mXDU'UC',wJSX'JTwTC';D/cJUU'UC'CD',mDDcJJUU'UC'CD',wJSX'wJmSSwU'UC'CD',mSwU'UC'CD',mSUsSwU'UC'CD',sJDSwU'UC'CD',mXDU'UC'CD',wJSX'JTwTC'CD',cJUU'UC'mTcDD',mDDcJJUU'UC'mTcDD',wJSX'wJmSSwU'UC'mTcDD',mSwU'UC'mTcDD',mSUsSwU'UC'mTcDD',sJDSwU'UC'mTcDD',mXDU'UC'mTcDD',wJSX'JTwTC'mTcDD',sD',sUsUD',wUXD';X'/JTwDX',TsSX',e;U'/DU',mU',e;C'/SUTwU'UC',e;D'/mUSSwU'UC'CD',mUSSwU'UC'mTcDD',e", cfgLeftRecElim.toString());
	}

}