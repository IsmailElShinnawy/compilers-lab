package csen1002.tests.task5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task5.CfgLeftRecElim;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task5TestsBatch2 {

	@Test
	public void testCfgLeftRecursionElimination1() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;B;I;H;C#b;h;o;q;r#S/IhIHh,SCrH,SqSIS,qBIS,rHCoI;B/bISS,qHBHr;I/BISCC,Sq;H/SbCCS,oCSBh,rBS;C/CCq,CIhI,CqHh,II,Io");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;B;I;H;C;S';I';C'#b;h;o;q;r#S/IhIHhS',qBISS',rHCoIS';B/bISS,qHBHr;I/bISSISCCI',qHBHrISCCI',qBISS'qI',rHCoIS'qI';H/bISSISCCI'hIHhS'bCCS,qHBHrISCCI'hIHhS'bCCS,qBISS'qI'hIHhS'bCCS,rHCoIS'qI'hIHhS'bCCS,qBISS'bCCS,rHCoIS'bCCS,oCSBh,rBS;C/bISSISCCI'IC',qHBHrISCCI'IC',qBISS'qI'IC',rHCoIS'qI'IC',bISSISCCI'oC',qHBHrISCCI'oC',qBISS'qI'oC',rHCoIS'qI'oC';S'/CrHS',qSISS',e;I'/hIHhS'qI',e;C'/CqC',IhIC',qHhC',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination2() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;M;K;D;F#d;f;i#S/Di,SMfSF,SSiSd,SiMSD,dSFD;M/DfFfS,FM,FMKd,FfK,SMf,f;K/Df,KM,KiSd,SSD,f,i;D/KFiSS,MMFfD,fDKDM,iFf,iKDK,iMfD;F/DKd,SdKD,dDSK,fK");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;M;K;D;F;S';K';D';F'#d;f;i#S/DiS',dSFDS';M/DfFfS,FM,FMKd,FfK,DiS'Mf,dSFDS'Mf,f;K/DfK',DiS'SDK',dSFDS'SDK',fK',iK';D/dSFDS'SDK'FiSSD',fK'FiSSD',iK'FiSSD',FMMFfDD',FMKdMFfDD',FfKMFfDD',dSFDS'MfMFfDD',fMFfDD',fDKDMD',iFfD',iKDKD',iMfDD';F/dSFDS'SDK'FiSSD'KdF',fK'FiSSD'KdF',iK'FiSSD'KdF',dSFDS'MfMFfDD'KdF',fMFfDD'KdF',fDKDMD'KdF',iFfD'KdF',iKDKD'KdF',iMfDD'KdF',dSFDS'SDK'FiSSD'iS'dKDF',fK'FiSSD'iS'dKDF',iK'FiSSD'iS'dKDF',dSFDS'MfMFfDD'iS'dKDF',fMFfDD'iS'dKDF',fDKDMD'iS'dKDF',iFfD'iS'dKDF',iKDKD'iS'dKDF',iMfDD'iS'dKDF',dSFDS'dKDF',dDSKF',fKF';S'/MfSFS',SiSdS',iMSDS',e;K'/MK',iSdK',e;D'/fK'FiSSD',iS'SDK'FiSSD',fFfSMFfDD',iS'MfMFfDD',e;F'/MMFfDD'KdF',MKdMFfDD'KdF',fKMFfDD'KdF',MMFfDD'iS'dKDF',MKdMFfDD'iS'dKDF',fKMFfDD'iS'dKDF',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination3() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;X;O;B;Y;M#g;k;y;z#S/MyMzM,yXY;X/yBOXk,zXOSX;O/MSMOz,SByB,XYM,gXkB,yMSOB,yOOk;B/BSO,BX,MBgMY,OS,OSzOz,SgM;Y/SYS,XB,XzBzX,yOM;M/MXSyO,Mk,OyB,Yg,zSOyO,zXzSB");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;X;O;B;Y;M;B';M'#g;k;y;z#S/MyMzM,yXY;X/yBOXk,zXOSX;O/MSMOz,MyMzMByB,yXYByB,yBOXkYM,zXOSXYM,gXkB,yMSOB,yOOk;B/MBgMYB',MSMOzSB',MyMzMByBSB',yXYByBSB',yBOXkYMSB',zXOSXYMSB',gXkBSB',yMSOBSB',yOOkSB',MSMOzSzOzB',MyMzMByBSzOzB',yXYByBSzOzB',yBOXkYMSzOzB',zXOSXYMSzOzB',gXkBSzOzB',yMSOBSzOzB',yOOkSzOzB',MyMzMgMB',yXYgMB';Y/MyMzMYS,yXYYS,yBOXkB,zXOSXB,yBOXkzBzX,zXOSXzBzX,yOM;M/yXYByByBM',yBOXkYMyBM',zXOSXYMyBM',gXkByBM',yMSOByBM',yOOkyBM',yXYYSgM',yBOXkBgM',zXOSXBgM',yBOXkzBzXgM',zXOSXzBzXgM',yOMgM',zSOyOM',zXzSBM';B'/SOB',XB',e;M'/XSyOM',kM',SMOzyBM',yMzMByByBM',yMzMYSgM',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination4() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;B;H;W;I#c;d;f;n;q#S/WBWHq,f,fBW;B/BdHHq,IB,dSW;H/BIB,BIS,HHqWS,HfSc,IBcH,nH;W/BWIq,ISdB,SSSW,WBc,WdScB,cHIS;I/BH,BWSI,SHcHI,WcI,cIIH,nB");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;B;H;W;I;B';H';W';I'#c;d;f;n;q#S/WBWHq,f,fBW;B/IBB',dSWB';H/IBB'IBH',dSWB'IBH',IBB'ISH',dSWB'ISH',IBcHH',nHH';W/IBB'WIqW',dSWB'WIqW',ISdBW',fSSWW',fBWSSWW',cHISW';I/dSWB'HI',dSWB'WSII',dSWB'WIqW'BWHqHcHII',fSSWW'BWHqHcHII',fBWSSWW'BWHqHcHII',cHISW'BWHqHcHII',fHcHII',fBWHcHII',dSWB'WIqW'cII',fSSWW'cII',fBWSSWW'cII',cHISW'cII',cIIHI',nBI';B'/dHHqB',e;H'/HqWSH',fScH',e;W'/BWHqSSWW',BcW',dScBW',e;I'/BB'HI',BB'WSII',BB'WIqW'BWHqHcHII',SdBW'BWHqHcHII',BB'WIqW'cII',SdBW'cII',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination5() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;W;R;T;J#d;k;u;y#S/JTJTS,WkW,WyWJ,d,y;W/RyJT,uRyT,uW;R/RkTkS,RyRk,TR,kT,yWJ;T/JSWu,RdTR,SRJyJ,TJJy,TSy,uRRST;J/JRW,JWR,RW,RWWd");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;W;R;T;J;R';T';J'#d;k;u;y#S/JTJTS,WkW,WyWJ,d,y;W/RyJT,uRyT,uW;R/TRR',kTR',yWJR';T/JSWuT',kTR'dTRT',yWJR'dTRT',JTJTSRJyJT',kTR'yJTkWRJyJT',yWJR'yJTkWRJyJT',uRyTkWRJyJT',uWkWRJyJT',kTR'yJTyWJRJyJT',yWJR'yJTyWJRJyJT',uRyTyWJRJyJT',uWyWJRJyJT',dRJyJT',yRJyJT',uRRSTT';J/kTR'dTRT'RR'WJ',yWJR'dTRT'RR'WJ',kTR'yJTkWRJyJT'RR'WJ',yWJR'yJTkWRJyJT'RR'WJ',uRyTkWRJyJT'RR'WJ',uWkWRJyJT'RR'WJ',kTR'yJTyWJRJyJT'RR'WJ',yWJR'yJTyWJRJyJT'RR'WJ',uRyTyWJRJyJT'RR'WJ',uWyWJRJyJT'RR'WJ',dRJyJT'RR'WJ',yRJyJT'RR'WJ',uRRSTT'RR'WJ',kTR'WJ',yWJR'WJ',kTR'dTRT'RR'WWdJ',yWJR'dTRT'RR'WWdJ',kTR'yJTkWRJyJT'RR'WWdJ',yWJR'yJTkWRJyJT'RR'WWdJ',uRyTkWRJyJT'RR'WWdJ',uWkWRJyJT'RR'WWdJ',kTR'yJTyWJRJyJT'RR'WWdJ',yWJR'yJTyWJRJyJT'RR'WWdJ',uRyTyWJRJyJT'RR'WWdJ',uWyWJRJyJT'RR'WWdJ',dRJyJT'RR'WWdJ',yRJyJT'RR'WWdJ',uRRSTT'RR'WWdJ',kTR'WWdJ',yWJR'WWdJ';R'/kTkSR',yRkR',e;T'/RR'dTRT',RR'yJTkWRJyJT',RR'yJTyWJRJyJT',JJyT',SyT',e;J'/RWJ',WRJ',SWuT'RR'WJ',TJTSRJyJT'RR'WJ',SWuT'RR'WWdJ',TJTSRJyJT'RR'WWdJ',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination6() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;R;V;X;Q#k;n;p;t#S/SXtQ,kR,kSRkR,nXS,pSnQt;R/QVRSn,RQRkR,RR,k,kX,tStR;V/RS,RX,t;X/StSS,VSRS,VX,tV;Q/QkRX,QtXRn,RXnQ,VVkXk");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;R;V;X;Q;S';R';Q'#k;n;p;t#S/kRS',kSRkRS',nXSS',pSnQtS';R/QVRSnR',kR',kXR',tStRR';V/QVRSnR'S,kR'S,kXR'S,tStRR'S,QVRSnR'X,kR'X,kXR'X,tStRR'X,t;X/kRS'tSS,kSRkRS'tSS,nXSS'tSS,pSnQtS'tSS,QVRSnR'SSRS,kR'SSRS,kXR'SSRS,tStRR'SSRS,QVRSnR'XSRS,kR'XSRS,kXR'XSRS,tStRR'XSRS,tSRS,QVRSnR'SX,kR'SX,kXR'SX,tStRR'SX,QVRSnR'XX,kR'XX,kXR'XX,tStRR'XX,tX,tV;Q/kR'XnQQ',kXR'XnQQ',tStRR'XnQQ',kR'SVkXkQ',kXR'SVkXkQ',tStRR'SVkXkQ',kR'XVkXkQ',kXR'XVkXkQ',tStRR'XVkXkQ',tVkXkQ';S'/XtQS',e;R'/QRkRR',RR',e;Q'/kRXQ',tXRnQ',VRSnR'XnQQ',VRSnR'SVkXkQ',VRSnR'XVkXkQ',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination7() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;M;L;Z;U#a;f;x;z#S/SS,SZ,SZL,UZ;M/MZSxS,SM,UfUL,a;L/LLM,LLf,fM;Z/LSZZU,MMZ;U/Lf,MaUfM,aZ,zLx");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;M;L;Z;U;S';M';L';U'#a;f;x;z#S/UZS';M/UZS'MM',UfULM',aM';L/fML';Z/fML'SZZU,UZS'MM'MZ,UfULM'MZ,aM'MZ;U/fML'fU',aM'aUfMU',aZU',zLxU';S'/SS',ZS',ZLS',e;M'/ZSxSM',e;L'/LML',LfL',e;U'/ZS'MM'aUfMU',fULM'aUfMU',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination8() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;U;P;T;N;H#f;k;n;p#S/HUnHn,NSkT,ST,SkUf;U/NpSpP,nUUSS,pNfNU;P/TnHHS,UpS,f,fSS,kNSH,pP;T/ST,UH,p;N/NUPN,NkHN,Uk;H/HT,NUkUU,TfSk,pT");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;U;P;T;N;H;S';N';H'#f;k;n;p#S/HUnHnS',NSkTS';U/NpSpP,nUUSS,pNfNU;P/TnHHS,NpSpPpS,nUUSSpS,pNfNUpS,f,fSS,kNSH,pP;T/HUnHnS'T,NSkTS'T,NpSpPH,nUUSSH,pNfNUH,p;N/nUUSSkN',pNfNUkN';H/nUUSSkN'UkUUH',pNfNUkN'UkUUH',nUUSSkN'SkTS'TfSkH',pNfNUkN'SkTS'TfSkH',nUUSSkN'pSpPHfSkH',pNfNUkN'pSpPHfSkH',nUUSSHfSkH',pNfNUHfSkH',pfSkH',pTH';S'/TS',kUfS',e;N'/UPNN',kHNN',pSpPkN',e;H'/TH',UnHnS'TfSkH',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination9() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;T;D;W;U#d;k;m;x#S/DUxD,SSmTd,UTTS,kDd;T/SSSdD,Sx,TDTD,TTk,UTT,mSm;D/TSmT,d,kUTDx,x,xW;W/UD,UkW,k;U/TS,UU,UdSS,WTkW,xDDx");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;T;D;W;U;S';T';D';U'#d;k;m;x#S/DUxDS',UTTSS',kDdS';T/DUxDS'SSdDT',UTTSS'SSdDT',kDdS'SSdDT',DUxDS'xT',UTTSS'xT',kDdS'xT',UTTT',mSmT';D/UTTSS'SSdDT'SmTD',kDdS'SSdDT'SmTD',UTTSS'xT'SmTD',kDdS'xT'SmTD',UTTT'SmTD',mSmT'SmTD',dD',kUTDxD',xD',xWD';W/UD,UkW,k;U/kDdS'SSdDT'SmTD'UxDS'SSdDT'SU',kDdS'xT'SmTD'UxDS'SSdDT'SU',mSmT'SmTD'UxDS'SSdDT'SU',dD'UxDS'SSdDT'SU',kUTDxD'UxDS'SSdDT'SU',xD'UxDS'SSdDT'SU',xWD'UxDS'SSdDT'SU',kDdS'SSdDT'SU',kDdS'SSdDT'SmTD'UxDS'xT'SU',kDdS'xT'SmTD'UxDS'xT'SU',mSmT'SmTD'UxDS'xT'SU',dD'UxDS'xT'SU',kUTDxD'UxDS'xT'SU',xD'UxDS'xT'SU',xWD'UxDS'xT'SU',kDdS'xT'SU',mSmT'SU',kTkWU',xDDxU';S'/SmTdS',e;T'/DTDT',TkT',e;D'/UxDS'SSdDT'SmTD',UxDS'xT'SmTD',e;U'/TTSS'SSdDT'SmTD'UxDS'SSdDT'SU',TTSS'xT'SmTD'UxDS'SSdDT'SU',TTT'SmTD'UxDS'SSdDT'SU',TTSS'SSdDT'SU',TTSS'SSdDT'SmTD'UxDS'xT'SU',TTSS'xT'SmTD'UxDS'xT'SU',TTT'SmTD'UxDS'xT'SU',TTSS'xT'SU',TTT'SU',UU',dSSU',DTkWU',kWTkWU',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination10() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;P;Z;B;I;A#r;w;y#S/AyP,PASBZ,SAZIw,SIZIS,rZ,rZPwI;P/BI,yP,ySwP;Z/BII,PrS,SIA,ZZSA,rArBw,w;B/ASIrP,BIw,wAZ,yZZwA;I/IB,IZr,IrIIA,wPrAA;A/IrIPI,IwSy,PZBA,wIrB,wZZy,wZrZy");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;P;Z;B;I;A;S';Z';B';I';A'#r;w;y#S/AyPS',PASBZS',rZS',rZPwIS';P/BI,yP,ySwP;Z/BIIZ',BIrSZ',yPrSZ',ySwPrSZ',AyPS'IAZ',BIASBZS'IAZ',yPASBZS'IAZ',ySwPASBZS'IAZ',rZS'IAZ',rZPwIS'IAZ',rArBwZ',wZ';B/ASIrPB',wAZB',yZZwAB';I/wPrAAI';A/wPrAAI'rIPIA',wPrAAI'wSyA',wAZB'IZBAA',yZZwAB'IZBAA',yPZBAA',ySwPZBAA',wIrBA',wZZyA',wZrZyA';S'/AZIwS',IZISS',e;Z'/ZSAZ',e;B'/IwB',e;I'/BI',ZrI',rIIAI',e;A'/SIrPB'IZBAA',e", cfgLeftRecElim.toString());
	}

}