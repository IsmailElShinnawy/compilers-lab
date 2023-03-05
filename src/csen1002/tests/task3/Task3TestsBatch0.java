package csen1002.tests.task3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task3.FallbackDfa;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task3TestsBatch0 {

	@Test
	public void testFallbackDfa1String1() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9;10;11;12;13#r;t;x#0,r,3;0,t,10;0,x,1;1,r,8;1,t,12;1,x,6;2,r,0;2,t,4;2,x,9;3,r,2;3,t,2;3,x,4;4,r,6;4,t,11;4,x,11;5,r,4;5,t,6;5,x,5;6,r,5;6,t,13;6,x,5;7,r,11;7,t,9;7,x,3;8,r,6;8,t,0;8,x,8;9,r,4;9,t,9;9,x,4;10,r,13;10,t,0;10,x,6;11,r,8;11,t,6;11,x,2;12,r,7;12,t,6;12,x,0;13,r,8;13,t,6;13,x,2#12#3;9");
		assertEquals("xttttrrrr,3;xr,3;rt,9;rttt,9;rxrx,9;rt,9", fallbackDfa.run("xttttrrrrxrrtrtttrxrxrt"));
	}

	@Test
	public void testFallbackDfa1String2() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9;10;11;12;13#r;t;x#0,r,3;0,t,10;0,x,1;1,r,8;1,t,12;1,x,6;2,r,0;2,t,4;2,x,9;3,r,2;3,t,2;3,x,4;4,r,6;4,t,11;4,x,11;5,r,4;5,t,6;5,x,5;6,r,5;6,t,13;6,x,5;7,r,11;7,t,9;7,x,3;8,r,6;8,t,0;8,x,8;9,r,4;9,t,9;9,x,4;10,r,13;10,t,0;10,x,6;11,r,8;11,t,6;11,x,2;12,r,7;12,t,6;12,x,0;13,r,8;13,t,6;13,x,2#12#3;9");
		assertEquals("rxtrr,3;rt,9;rt,9;rtt,9;rrrx,8", fallbackDfa.run("rxtrrrtrtrttrrrx"));
	}

	@Test
	public void testFallbackDfa1String3() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9;10;11;12;13#r;t;x#0,r,3;0,t,10;0,x,1;1,r,8;1,t,12;1,x,6;2,r,0;2,t,4;2,x,9;3,r,2;3,t,2;3,x,4;4,r,6;4,t,11;4,x,11;5,r,4;5,t,6;5,x,5;6,r,5;6,t,13;6,x,5;7,r,11;7,t,9;7,x,3;8,r,6;8,t,0;8,x,8;9,r,4;9,t,9;9,x,4;10,r,13;10,t,0;10,x,6;11,r,8;11,t,6;11,x,2;12,r,7;12,t,6;12,x,0;13,r,8;13,t,6;13,x,2#12#3;9");
		assertEquals("xr,3;xr,3;xtxtxx,9;rx,3", fallbackDfa.run("xrxrxtxtxxrx"));
	}

	@Test
	public void testFallbackDfa1String4() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9;10;11;12;13#r;t;x#0,r,3;0,t,10;0,x,1;1,r,8;1,t,12;1,x,6;2,r,0;2,t,4;2,x,9;3,r,2;3,t,2;3,x,4;4,r,6;4,t,11;4,x,11;5,r,4;5,t,6;5,x,5;6,r,5;6,t,13;6,x,5;7,r,11;7,t,9;7,x,3;8,r,6;8,t,0;8,x,8;9,r,4;9,t,9;9,x,4;10,r,13;10,t,0;10,x,6;11,r,8;11,t,6;11,x,2;12,r,7;12,t,6;12,x,0;13,r,8;13,t,6;13,x,2#12#3;9");
		assertEquals("rt,9;xr,3;xr,3;trxrxxrxtxr,3;rt,9", fallbackDfa.run("rtxrxrtrxrxxrxtxrrt"));
	}

	@Test
	public void testFallbackDfa1String5() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9;10;11;12;13#r;t;x#0,r,3;0,t,10;0,x,1;1,r,8;1,t,12;1,x,6;2,r,0;2,t,4;2,x,9;3,r,2;3,t,2;3,x,4;4,r,6;4,t,11;4,x,11;5,r,4;5,t,6;5,x,5;6,r,5;6,t,13;6,x,5;7,r,11;7,t,9;7,x,3;8,r,6;8,t,0;8,x,8;9,r,4;9,t,9;9,x,4;10,r,13;10,t,0;10,x,6;11,r,8;11,t,6;11,x,2;12,r,7;12,t,6;12,x,0;13,r,8;13,t,6;13,x,2#12#3;9");
		assertEquals("ttrxttrxttxx,9;rt,9;rxtx,9;xr,3;r,7", fallbackDfa.run("ttrxttrxttxxrtrxtxxrr"));
	}

	@Test
	public void testFallbackDfa2String1() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9;10;11;12#h;k;r;x#0,h,12;0,k,0;0,r,4;0,x,5;1,h,12;1,k,6;1,r,2;1,x,8;2,h,5;2,k,5;2,r,1;2,x,8;3,h,10;3,k,0;3,r,7;3,x,9;4,h,1;4,k,7;4,r,5;4,x,4;5,h,2;5,k,8;5,r,2;5,x,12;6,h,4;6,k,8;6,r,3;6,x,4;7,h,8;7,k,12;7,r,5;7,x,10;8,h,12;8,k,12;8,r,1;8,x,6;9,h,9;9,k,0;9,r,2;9,x,10;10,h,7;10,k,12;10,r,10;10,x,10;11,h,0;11,k,11;11,r,10;11,x,1;12,h,10;12,k,8;12,r,11;12,x,4#5#0;2;6;10;11");
		assertEquals("hhxxxkrh,2;hkr,2;hxxrkrhk,6;h,2;k,8", fallbackDfa.run("hhxxxkrhhkrhxxrkrhkhk"));
	}

	@Test
	public void testFallbackDfa2String2() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9;10;11;12#h;k;r;x#0,h,12;0,k,0;0,r,4;0,x,5;1,h,12;1,k,6;1,r,2;1,x,8;2,h,5;2,k,5;2,r,1;2,x,8;3,h,10;3,k,0;3,r,7;3,x,9;4,h,1;4,k,7;4,r,5;4,x,4;5,h,2;5,k,8;5,r,2;5,x,12;6,h,4;6,k,8;6,r,3;6,x,4;7,h,8;7,k,12;7,r,5;7,x,10;8,h,12;8,k,12;8,r,1;8,x,6;9,h,9;9,k,0;9,r,2;9,x,10;10,h,7;10,k,12;10,r,10;10,x,10;11,h,0;11,k,11;11,r,10;11,x,1;12,h,10;12,k,8;12,r,11;12,x,4#5#0;2;6;10;11");
		assertEquals("xxrkxrrkkrk,6;h,2;r,2;xkk,12", fallbackDfa.run("xxrkxrrkkrkhrxkk"));
	}

	@Test
	public void testFallbackDfa2String3() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9;10;11;12#h;k;r;x#0,h,12;0,k,0;0,r,4;0,x,5;1,h,12;1,k,6;1,r,2;1,x,8;2,h,5;2,k,5;2,r,1;2,x,8;3,h,10;3,k,0;3,r,7;3,x,9;4,h,1;4,k,7;4,r,5;4,x,4;5,h,2;5,k,8;5,r,2;5,x,12;6,h,4;6,k,8;6,r,3;6,x,4;7,h,8;7,k,12;7,r,5;7,x,10;8,h,12;8,k,12;8,r,1;8,x,6;9,h,9;9,k,0;9,r,2;9,x,10;10,h,7;10,k,12;10,r,10;10,x,10;11,h,0;11,k,11;11,r,10;11,x,1;12,h,10;12,k,8;12,r,11;12,x,4#5#0;2;6;10;11");
		assertEquals("hrxhkrhxkhkrrrkhkhr,10;h,2;r,2;x,12", fallbackDfa.run("hrxhkrhxkhkrrrkhkhrhrx"));
	}

	@Test
	public void testFallbackDfa2String4() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9;10;11;12#h;k;r;x#0,h,12;0,k,0;0,r,4;0,x,5;1,h,12;1,k,6;1,r,2;1,x,8;2,h,5;2,k,5;2,r,1;2,x,8;3,h,10;3,k,0;3,r,7;3,x,9;4,h,1;4,k,7;4,r,5;4,x,4;5,h,2;5,k,8;5,r,2;5,x,12;6,h,4;6,k,8;6,r,3;6,x,4;7,h,8;7,k,12;7,r,5;7,x,10;8,h,12;8,k,12;8,r,1;8,x,6;9,h,9;9,k,0;9,r,2;9,x,10;10,h,7;10,k,12;10,r,10;10,x,10;11,h,0;11,k,11;11,r,10;11,x,1;12,h,10;12,k,8;12,r,11;12,x,4#5#0;2;6;10;11");
		assertEquals("xxxhhkrhhkhhkkhh,10;h,2;kx,6;xh,10;h,2", fallbackDfa.run("xxxhhkrhhkhhkkhhhkxxhh"));
	}

	@Test
	public void testFallbackDfa2String5() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9;10;11;12#h;k;r;x#0,h,12;0,k,0;0,r,4;0,x,5;1,h,12;1,k,6;1,r,2;1,x,8;2,h,5;2,k,5;2,r,1;2,x,8;3,h,10;3,k,0;3,r,7;3,x,9;4,h,1;4,k,7;4,r,5;4,x,4;5,h,2;5,k,8;5,r,2;5,x,12;6,h,4;6,k,8;6,r,3;6,x,4;7,h,8;7,k,12;7,r,5;7,x,10;8,h,12;8,k,12;8,r,1;8,x,6;9,h,9;9,k,0;9,r,2;9,x,10;10,h,7;10,k,12;10,r,10;10,x,10;11,h,0;11,k,11;11,r,10;11,x,1;12,h,10;12,k,8;12,r,11;12,x,4#5#0;2;6;10;11");
		assertEquals("r,2;r,2;hxx,6;xh,10", fallbackDfa.run("rrhxxxh"));
	}

}