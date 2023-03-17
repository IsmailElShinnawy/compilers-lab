package csen1002.tests.task3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task3.FallbackDfa;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task3TestsBatch1 {

	@Test
	public void testFallbackDfa1String1() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9;10;11;12#h;y#0,h,7;0,y,7;1,h,8;1,y,12;2,h,11;2,y,4;3,h,11;3,y,9;4,h,1;4,y,12;5,h,3;5,y,10;6,h,0;6,y,0;7,h,9;7,y,5;8,h,5;8,y,11;9,h,12;9,y,10;10,h,10;10,y,12;11,h,9;11,y,6;12,h,0;12,y,2#8#5;12");
		assertEquals("yhyhyyyyhhhh,12;hyhy,12;h,5;h,5", fallbackDfa.run("yhyhyyyyhhhhhyhyhh"));
	}

	@Test
	public void testFallbackDfa1String2() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9;10;11;12#h;y#0,h,7;0,y,7;1,h,8;1,y,12;2,h,11;2,y,4;3,h,11;3,y,9;4,h,1;4,y,12;5,h,3;5,y,10;6,h,0;6,y,0;7,h,9;7,y,5;8,h,5;8,y,11;9,h,12;9,y,10;10,h,10;10,y,12;11,h,9;11,y,6;12,h,0;12,y,2#8#5;12");
		assertEquals("hyyhyhyhy,12;yhyhy,12;h,5;y,11", fallbackDfa.run("hyyhyhyhyyhyhyhy"));
	}

	@Test
	public void testFallbackDfa1String3() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9;10;11;12#h;y#0,h,7;0,y,7;1,h,8;1,y,12;2,h,11;2,y,4;3,h,11;3,y,9;4,h,1;4,y,12;5,h,3;5,y,10;6,h,0;6,y,0;7,h,9;7,y,5;8,h,5;8,y,11;9,h,12;9,y,10;10,h,10;10,y,12;11,h,9;11,y,6;12,h,0;12,y,2#8#5;12");
		assertEquals("hyy,12;yhyhy,12;h,5;yh,9", fallbackDfa.run("hyyyhyhyhyh"));
	}

	@Test
	public void testFallbackDfa1String4() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9;10;11;12#h;y#0,h,7;0,y,7;1,h,8;1,y,12;2,h,11;2,y,4;3,h,11;3,y,9;4,h,1;4,y,12;5,h,3;5,y,10;6,h,0;6,y,0;7,h,9;7,y,5;8,h,5;8,y,11;9,h,12;9,y,10;10,h,10;10,y,12;11,h,9;11,y,6;12,h,0;12,y,2#8#5;12");
		assertEquals("yhhyhhhyhyhyy,5;h,5;h,5;y,11", fallbackDfa.run("yhhyhhhyhyhyyhhy"));
	}

	@Test
	public void testFallbackDfa1String5() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9;10;11;12#h;y#0,h,7;0,y,7;1,h,8;1,y,12;2,h,11;2,y,4;3,h,11;3,y,9;4,h,1;4,y,12;5,h,3;5,y,10;6,h,0;6,y,0;7,h,9;7,y,5;8,h,5;8,y,11;9,h,12;9,y,10;10,h,10;10,y,12;11,h,9;11,y,6;12,h,0;12,y,2#8#5;12");
		assertEquals("hhyhyhyhhy,5;hhyh,12;h,5;h,5", fallbackDfa.run("hhyhyhyhhyhhyhhh"));
	}

	@Test
	public void testFallbackDfa2String1() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9;10#a;l;y;z#0,a,8;0,l,0;0,y,6;0,z,5;1,a,5;1,l,0;1,y,7;1,z,10;2,a,3;2,l,9;2,y,9;2,z,3;3,a,2;3,l,3;3,y,8;3,z,0;4,a,6;4,l,10;4,y,1;4,z,7;5,a,1;5,l,10;5,y,2;5,z,4;6,a,10;6,l,4;6,y,5;6,z,2;7,a,1;7,l,8;7,y,1;7,z,6;8,a,0;8,l,0;8,y,0;8,z,8;9,a,3;9,l,7;9,y,7;9,z,6;10,a,7;10,l,6;10,y,4;10,z,2#1#4;10");
		assertEquals("aaayyzl,4;zlyzal,4;z,10;a,5", fallbackDfa.run("aaayyzlzlyzalza"));
	}

	@Test
	public void testFallbackDfa2String2() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9;10#a;l;y;z#0,a,8;0,l,0;0,y,6;0,z,5;1,a,5;1,l,0;1,y,7;1,z,10;2,a,3;2,l,9;2,y,9;2,z,3;3,a,2;3,l,3;3,y,8;3,z,0;4,a,6;4,l,10;4,y,1;4,z,7;5,a,1;5,l,10;5,y,2;5,z,4;6,a,10;6,l,4;6,y,5;6,z,2;7,a,1;7,l,8;7,y,1;7,z,6;8,a,0;8,l,0;8,y,0;8,z,8;9,a,3;9,l,7;9,y,7;9,z,6;10,a,7;10,l,6;10,y,4;10,z,2#1#4;10");
		assertEquals("zlyz,4;azazyzyz,4;z,10;z,10", fallbackDfa.run("zlyzazazyzyzzz"));
	}

	@Test
	public void testFallbackDfa2String3() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9;10#a;l;y;z#0,a,8;0,l,0;0,y,6;0,z,5;1,a,5;1,l,0;1,y,7;1,z,10;2,a,3;2,l,9;2,y,9;2,z,3;3,a,2;3,l,3;3,y,8;3,z,0;4,a,6;4,l,10;4,y,1;4,z,7;5,a,1;5,l,10;5,y,2;5,z,4;6,a,10;6,l,4;6,y,5;6,z,2;7,a,1;7,l,8;7,y,1;7,z,6;8,a,0;8,l,0;8,y,0;8,z,8;9,a,3;9,l,7;9,y,7;9,z,6;10,a,7;10,l,6;10,y,4;10,z,2#1#4;10");
		assertEquals("azly,4;ylyzl,10;al,10;aa,1", fallbackDfa.run("azlyylyzlalaa"));
	}

	@Test
	public void testFallbackDfa2String4() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9;10#a;l;y;z#0,a,8;0,l,0;0,y,6;0,z,5;1,a,5;1,l,0;1,y,7;1,z,10;2,a,3;2,l,9;2,y,9;2,z,3;3,a,2;3,l,3;3,y,8;3,z,0;4,a,6;4,l,10;4,y,1;4,z,7;5,a,1;5,l,10;5,y,2;5,z,4;6,a,10;6,l,4;6,y,5;6,z,2;7,a,1;7,l,8;7,y,1;7,z,6;8,a,0;8,l,0;8,y,0;8,z,8;9,a,3;9,l,7;9,y,7;9,z,6;10,a,7;10,l,6;10,y,4;10,z,2#1#4;10");
		assertEquals("lzl,10;z,10;al,10;z,10;z,10", fallbackDfa.run("lzlzalzz"));
	}

	@Test
	public void testFallbackDfa2String5() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9;10#a;l;y;z#0,a,8;0,l,0;0,y,6;0,z,5;1,a,5;1,l,0;1,y,7;1,z,10;2,a,3;2,l,9;2,y,9;2,z,3;3,a,2;3,l,3;3,y,8;3,z,0;4,a,6;4,l,10;4,y,1;4,z,7;5,a,1;5,l,10;5,y,2;5,z,4;6,a,10;6,l,4;6,y,5;6,z,2;7,a,1;7,l,8;7,y,1;7,z,6;8,a,0;8,l,0;8,y,0;8,z,8;9,a,3;9,l,7;9,y,7;9,z,6;10,a,7;10,l,6;10,y,4;10,z,2#1#4;10");
		assertEquals("zzyalayzll,10;al,10;z,10;z,10;a,5", fallbackDfa.run("zzyalayzllalzza"));
	}

}