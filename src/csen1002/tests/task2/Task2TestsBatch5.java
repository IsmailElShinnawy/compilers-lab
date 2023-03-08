package csen1002.tests.task2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task2.NfaToDfa;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task2TestsBatch5 {

	@Test
	public void testNfa1() {
		NfaToDfa nfaToDfa= new NfaToDfa("0;1;2;3;4;5;6;7;8;9;10;11;12#a;g;m;z#0,a,1;1,e,12;2,m,3;3,e,4;3,e,8;4,z,5;5,e,10;6,g,7;7,e,6;7,e,9;8,e,6;8,e,9;9,e,10;10,e,12;11,e,0;11,e,2#11#12");
		assertEquals("-1;0/2/11;1/12;3/4/6/8/9/10/12;5/10/12;6/7/9/10/12#a;g;m;z#-1,a,-1;-1,g,-1;-1,m,-1;-1,z,-1;0/2/11,a,1/12;0/2/11,g,-1;0/2/11,m,3/4/6/8/9/10/12;0/2/11,z,-1;1/12,a,-1;1/12,g,-1;1/12,m,-1;1/12,z,-1;3/4/6/8/9/10/12,a,-1;3/4/6/8/9/10/12,g,6/7/9/10/12;3/4/6/8/9/10/12,m,-1;3/4/6/8/9/10/12,z,5/10/12;5/10/12,a,-1;5/10/12,g,-1;5/10/12,m,-1;5/10/12,z,-1;6/7/9/10/12,a,-1;6/7/9/10/12,g,6/7/9/10/12;6/7/9/10/12,m,-1;6/7/9/10/12,z,-1#0/2/11#1/12;3/4/6/8/9/10/12;5/10/12;6/7/9/10/12", nfaToDfa.toString());
	}

	@Test
	public void testNfa2() {
		NfaToDfa nfaToDfa= new NfaToDfa("0;1;2;3;4;5;6;7;8;9#a;g;p;t#0,a,1;1,e,2;1,e,4;2,t,3;3,e,2;3,e,4;4,e,5;4,e,8;5,p,6;6,g,7;7,e,5;7,e,8;8,g,9#0#9");
		assertEquals("-1;0;1/2/4/5/8;2/3/4/5/8;5/7/8;6;9#a;g;p;t#-1,a,-1;-1,g,-1;-1,p,-1;-1,t,-1;0,a,1/2/4/5/8;0,g,-1;0,p,-1;0,t,-1;1/2/4/5/8,a,-1;1/2/4/5/8,g,9;1/2/4/5/8,p,6;1/2/4/5/8,t,2/3/4/5/8;2/3/4/5/8,a,-1;2/3/4/5/8,g,9;2/3/4/5/8,p,6;2/3/4/5/8,t,2/3/4/5/8;5/7/8,a,-1;5/7/8,g,9;5/7/8,p,6;5/7/8,t,-1;6,a,-1;6,g,5/7/8;6,p,-1;6,t,-1;9,a,-1;9,g,-1;9,p,-1;9,t,-1#0#9", nfaToDfa.toString());
	}

	@Test
	public void testNfa3() {
		NfaToDfa nfaToDfa= new NfaToDfa("0;1;2;3;4;5;6;7;8;9;10;11;12#f;o#0,f,0;0,f,4;0,f,3;0,f,10;0,f,8;0,f,11;0,f,7;0,o,2;0,o,1;0,o,3;0,o,4;0,o,10;1,f,10;1,f,6;1,f,5;1,f,2;1,f,8;1,f,7;1,f,12;1,o,5;1,o,3;1,o,6;1,o,12;1,o,10;1,o,11;1,o,1;2,f,0;2,f,7;2,f,6;2,f,9;2,f,10;2,f,5;2,f,1;2,o,7;2,o,1;2,o,10;2,o,0;2,o,5;2,o,3;2,o,11;3,f,6;3,f,12;3,f,11;3,f,3;3,f,0;3,o,3;3,o,10;3,o,7;3,o,11;3,o,1;3,o,5;3,o,0;4,f,12;4,f,0;4,f,9;4,f,6;4,o,4;4,o,9;4,o,2;4,o,8;5,f,1;5,f,4;5,f,2;5,f,7;5,f,8;5,f,5;5,f,6;5,o,8;5,o,9;5,o,3;5,o,1;5,o,10;6,f,11;6,f,10;6,f,5;6,f,3;6,f,1;6,f,8;6,o,9;6,o,6;6,o,7;6,o,1;6,o,11;7,f,2;7,f,3;7,f,12;7,f,4;7,f,11;7,f,0;7,o,8;7,o,9;7,o,2;7,o,5;7,o,6;7,o,11;7,o,10;8,f,4;8,f,9;8,f,6;8,f,3;8,f,7;8,f,5;8,o,10;8,o,11;8,o,9;8,o,8;8,o,1;8,o,6;9,f,7;9,f,1;9,f,12;9,f,9;9,o,1;9,o,7;9,o,9;9,o,3;9,o,10;9,o,4;9,o,2;10,f,7;10,f,12;10,f,4;10,f,5;10,f,6;10,o,9;10,o,5;10,o,2;10,o,7;10,o,8;10,o,11;11,f,9;11,f,4;11,f,7;11,f,2;11,f,10;11,o,9;11,o,4;11,o,3;11,o,1;11,o,6;12,f,1;12,f,0;12,f,11;12,f,9;12,o,0;12,o,7;12,o,5;12,o,9;12,o,8#5#7;10;11");
		assertEquals("0/1/2/3/4/5/6/7/8/9/10/11/12;1/2/4/5/6/7/8;1/3/8/9/10;5#f;o#0/1/2/3/4/5/6/7/8/9/10/11/12,f,0/1/2/3/4/5/6/7/8/9/10/11/12;0/1/2/3/4/5/6/7/8/9/10/11/12,o,0/1/2/3/4/5/6/7/8/9/10/11/12;1/2/4/5/6/7/8,f,0/1/2/3/4/5/6/7/8/9/10/11/12;1/2/4/5/6/7/8,o,0/1/2/3/4/5/6/7/8/9/10/11/12;1/3/8/9/10,f,0/1/2/3/4/5/6/7/8/9/10/11/12;1/3/8/9/10,o,0/1/2/3/4/5/6/7/8/9/10/11/12;5,f,1/2/4/5/6/7/8;5,o,1/3/8/9/10#5#0/1/2/3/4/5/6/7/8/9/10/11/12;1/2/4/5/6/7/8;1/3/8/9/10", nfaToDfa.toString());
	}

	@Test
	public void testNfa4() {
		NfaToDfa nfaToDfa= new NfaToDfa("0;1;2;3;4;5;6;7#s;t;y#0,s,1;1,e,2;1,e,4;2,s,3;3,e,6;4,t,5;5,e,6;6,y,7#0#7");
		assertEquals("-1;0;1/2/4;3/6;5/6;7#s;t;y#-1,s,-1;-1,t,-1;-1,y,-1;0,s,1/2/4;0,t,-1;0,y,-1;1/2/4,s,3/6;1/2/4,t,5/6;1/2/4,y,-1;3/6,s,-1;3/6,t,-1;3/6,y,7;5/6,s,-1;5/6,t,-1;5/6,y,7;7,s,-1;7,t,-1;7,y,-1#0#7", nfaToDfa.toString());
	}

	@Test
	public void testNfa5() {
		NfaToDfa nfaToDfa= new NfaToDfa("0;1;2;3;4;5;6;7;8#g;h;s#0,g,8;0,g,6;0,g,2;0,g,1;0,h,8;0,h,4;0,h,1;0,h,3;0,s,0;0,s,6;0,s,2;0,s,8;0,s,7;1,g,2;1,g,0;1,g,4;1,g,6;1,g,8;1,g,7;1,g,3;1,h,4;1,h,0;1,h,6;1,h,3;1,h,1;1,s,4;1,s,0;1,s,5;1,s,6;1,s,3;1,s,2;1,s,7;2,g,3;2,g,1;2,g,8;2,g,2;2,g,4;2,g,0;2,h,2;2,h,0;2,h,3;2,h,8;2,s,4;2,s,6;2,s,5;2,s,2;2,s,7;2,s,0;2,s,1;3,g,4;3,g,5;3,g,3;3,g,2;3,g,7;3,g,0;3,g,6;3,h,0;3,h,4;3,h,7;3,h,2;3,h,6;3,h,8;3,h,3;3,s,0;3,s,5;3,s,3;3,s,2;3,s,8;4,g,8;4,g,6;4,g,2;4,g,3;4,h,7;4,h,0;4,h,2;4,h,1;4,h,5;4,s,1;4,s,8;4,s,3;4,s,0;4,s,4;4,s,6;4,s,5;5,g,3;5,g,8;5,g,7;5,g,4;5,h,6;5,h,8;5,h,2;5,h,0;5,h,1;5,h,5;5,s,4;5,s,0;5,s,3;5,s,8;6,g,7;6,g,6;6,g,5;6,g,3;6,g,0;6,g,1;6,g,4;6,h,5;6,h,0;6,h,8;6,h,3;6,h,2;6,s,3;6,s,2;6,s,0;6,s,8;6,s,7;7,g,5;7,g,6;7,g,7;7,g,3;7,g,8;7,g,1;7,g,0;7,h,5;7,h,7;7,h,0;7,h,2;7,s,0;7,s,8;7,s,5;7,s,1;7,s,7;7,s,6;8,g,8;8,g,6;8,g,3;8,g,2;8,g,7;8,g,1;8,h,6;8,h,0;8,h,5;8,h,2;8,h,8;8,s,8;8,s,1;8,s,3;8,s,2;8,s,4;8,s,5#1#1;7");
		assertEquals("0/1/2/3/4/5/6/7/8;0/1/3/4/6;0/2/3/4/5/6/7;0/2/3/4/6/7/8;1#g;h;s#0/1/2/3/4/5/6/7/8,g,0/1/2/3/4/5/6/7/8;0/1/2/3/4/5/6/7/8,h,0/1/2/3/4/5/6/7/8;0/1/2/3/4/5/6/7/8,s,0/1/2/3/4/5/6/7/8;0/1/3/4/6,g,0/1/2/3/4/5/6/7/8;0/1/3/4/6,h,0/1/2/3/4/5/6/7/8;0/1/3/4/6,s,0/1/2/3/4/5/6/7/8;0/2/3/4/5/6/7,g,0/1/2/3/4/5/6/7/8;0/2/3/4/5/6/7,h,0/1/2/3/4/5/6/7/8;0/2/3/4/5/6/7,s,0/1/2/3/4/5/6/7/8;0/2/3/4/6/7/8,g,0/1/2/3/4/5/6/7/8;0/2/3/4/6/7/8,h,0/1/2/3/4/5/6/7/8;0/2/3/4/6/7/8,s,0/1/2/3/4/5/6/7/8;1,g,0/2/3/4/6/7/8;1,h,0/1/3/4/6;1,s,0/2/3/4/5/6/7#1#0/1/2/3/4/5/6/7/8;0/1/3/4/6;0/2/3/4/5/6/7;0/2/3/4/6/7/8;1", nfaToDfa.toString());
	}

	@Test
	public void testNfa6() {
		NfaToDfa nfaToDfa= new NfaToDfa("0;1;2;3;4;5;6;7;8;9;10;11;12#l;n#0,l,1;0,l,0;0,l,7;0,l,4;0,l,2;0,l,12;0,l,11;0,n,6;0,n,3;0,n,0;0,n,11;0,n,12;1,l,2;1,l,3;1,l,10;1,l,11;1,l,9;1,l,5;1,n,0;1,n,12;1,n,1;1,n,11;1,n,4;1,n,10;2,l,5;2,l,0;2,l,2;2,l,10;2,l,9;2,l,4;2,n,6;2,n,5;2,n,4;2,n,11;2,n,10;2,n,1;2,n,12;3,l,6;3,l,8;3,l,0;3,l,12;3,l,4;3,n,5;3,n,11;3,n,7;3,n,12;3,n,10;3,n,8;4,l,2;4,l,11;4,l,0;4,l,12;4,n,4;4,n,9;4,n,2;4,n,0;4,n,3;4,n,11;4,n,6;5,l,11;5,l,8;5,l,2;5,l,7;5,l,6;5,l,3;5,n,5;5,n,12;5,n,8;5,n,4;5,n,9;5,n,6;5,n,1;6,l,2;6,l,11;6,l,3;6,l,10;6,l,5;6,l,0;6,n,11;6,n,9;6,n,8;6,n,7;6,n,0;6,n,5;6,n,3;7,l,12;7,l,3;7,l,5;7,l,2;7,l,1;7,l,6;7,l,10;7,n,12;7,n,1;7,n,2;7,n,6;7,n,10;7,n,4;8,l,12;8,l,4;8,l,9;8,l,3;8,l,8;8,l,6;8,l,7;8,n,0;8,n,9;8,n,1;8,n,4;9,l,2;9,l,7;9,l,3;9,l,8;9,l,10;9,l,11;9,n,9;9,n,12;9,n,6;9,n,4;9,n,1;10,l,1;10,l,2;10,l,12;10,l,10;10,l,0;10,l,9;10,l,6;10,n,5;10,n,4;10,n,3;10,n,1;10,n,2;10,n,7;10,n,9;11,l,4;11,l,11;11,l,9;11,l,7;11,l,0;11,l,6;11,l,10;11,n,10;11,n,9;11,n,11;11,n,8;11,n,1;12,l,8;12,l,3;12,l,6;12,l,12;12,l,7;12,n,8;12,n,0;12,n,12;12,n,3;12,n,5;12,n,9#1#3;12");
		assertEquals("0/1/2/3/4/5/6/7/8/9/10/11/12;0/1/4/10/11/12;1;1/2/3/4/5/6/7/8/9/10/11/12;2/3/5/9/10/11#l;n#0/1/2/3/4/5/6/7/8/9/10/11/12,l,0/1/2/3/4/5/6/7/8/9/10/11/12;0/1/2/3/4/5/6/7/8/9/10/11/12,n,0/1/2/3/4/5/6/7/8/9/10/11/12;0/1/4/10/11/12,l,0/1/2/3/4/5/6/7/8/9/10/11/12;0/1/4/10/11/12,n,0/1/2/3/4/5/6/7/8/9/10/11/12;1,l,2/3/5/9/10/11;1,n,0/1/4/10/11/12;1/2/3/4/5/6/7/8/9/10/11/12,l,0/1/2/3/4/5/6/7/8/9/10/11/12;1/2/3/4/5/6/7/8/9/10/11/12,n,0/1/2/3/4/5/6/7/8/9/10/11/12;2/3/5/9/10/11,l,0/1/2/3/4/5/6/7/8/9/10/11/12;2/3/5/9/10/11,n,1/2/3/4/5/6/7/8/9/10/11/12#1#0/1/2/3/4/5/6/7/8/9/10/11/12;0/1/4/10/11/12;1/2/3/4/5/6/7/8/9/10/11/12;2/3/5/9/10/11", nfaToDfa.toString());
	}

	@Test
	public void testNfa7() {
		NfaToDfa nfaToDfa= new NfaToDfa("0;1;2;3;4;5;6;7;8;9;10#f;k#0,f,4;0,f,9;0,f,0;0,f,3;0,f,8;0,f,6;0,k,5;0,k,4;0,k,1;0,k,0;0,k,2;1,f,4;1,f,0;1,f,9;1,f,8;1,f,1;1,f,10;1,f,5;1,k,3;1,k,1;1,k,7;1,k,2;1,k,9;1,k,10;2,f,6;2,f,9;2,f,3;2,f,5;2,k,3;2,k,6;2,k,5;2,k,4;2,k,7;2,k,10;3,f,9;3,f,3;3,f,1;3,f,4;3,f,5;3,k,0;3,k,9;3,k,5;3,k,10;3,k,3;4,f,2;4,f,8;4,f,1;4,f,5;4,f,6;4,f,10;4,k,8;4,k,5;4,k,2;4,k,4;4,k,6;4,k,0;5,f,5;5,f,9;5,f,2;5,f,10;5,f,4;5,f,7;5,k,9;5,k,6;5,k,0;5,k,7;5,k,2;5,k,5;6,f,6;6,f,7;6,f,5;6,f,1;6,f,0;6,f,9;6,f,3;6,k,3;6,k,10;6,k,0;6,k,6;7,f,4;7,f,5;7,f,3;7,f,9;7,f,10;7,f,0;7,f,1;7,k,8;7,k,1;7,k,6;7,k,7;7,k,3;8,f,9;8,f,5;8,f,8;8,f,2;8,f,4;8,f,3;8,f,0;8,k,6;8,k,0;8,k,3;8,k,1;8,k,7;9,f,0;9,f,8;9,f,1;9,f,2;9,f,10;9,k,4;9,k,1;9,k,9;9,k,8;9,k,0;9,k,5;10,f,3;10,f,2;10,f,5;10,f,1;10,f,0;10,f,10;10,f,9;10,k,9;10,k,2;10,k,0;10,k,3;10,k,10;10,k,1;10,k,5#4#1;6;9");
		assertEquals("0/1/2/3/4/5/6/7/8/9/10;0/1/2/3/4/5/6/7/9/10;0/2/4/5/6/8;1/2/5/6/8/10;4#f;k#0/1/2/3/4/5/6/7/8/9/10,f,0/1/2/3/4/5/6/7/8/9/10;0/1/2/3/4/5/6/7/8/9/10,k,0/1/2/3/4/5/6/7/8/9/10;0/1/2/3/4/5/6/7/9/10,f,0/1/2/3/4/5/6/7/8/9/10;0/1/2/3/4/5/6/7/9/10,k,0/1/2/3/4/5/6/7/8/9/10;0/2/4/5/6/8,f,0/1/2/3/4/5/6/7/8/9/10;0/2/4/5/6/8,k,0/1/2/3/4/5/6/7/8/9/10;1/2/5/6/8/10,f,0/1/2/3/4/5/6/7/8/9/10;1/2/5/6/8/10,k,0/1/2/3/4/5/6/7/9/10;4,f,1/2/5/6/8/10;4,k,0/2/4/5/6/8#4#0/1/2/3/4/5/6/7/8/9/10;0/1/2/3/4/5/6/7/9/10;0/2/4/5/6/8;1/2/5/6/8/10", nfaToDfa.toString());
	}

	@Test
	public void testNfa8() {
		NfaToDfa nfaToDfa= new NfaToDfa("0;1;2;3;4;5;6;7#i;l;p;t#0,l,1;1,p,2;2,e,6;3,t,4;4,e,6;5,e,0;5,e,3;6,i,7#5#7");
		assertEquals("-1;0/3/5;1;2/6;4/6;7#i;l;p;t#-1,i,-1;-1,l,-1;-1,p,-1;-1,t,-1;0/3/5,i,-1;0/3/5,l,1;0/3/5,p,-1;0/3/5,t,4/6;1,i,-1;1,l,-1;1,p,2/6;1,t,-1;2/6,i,7;2/6,l,-1;2/6,p,-1;2/6,t,-1;4/6,i,7;4/6,l,-1;4/6,p,-1;4/6,t,-1;7,i,-1;7,l,-1;7,p,-1;7,t,-1#0/3/5#7", nfaToDfa.toString());
	}

	@Test
	public void testNfa9() {
		NfaToDfa nfaToDfa= new NfaToDfa("0;1;2;3;4;5;6;7#m;p#0,m,3;0,m,4;0,m,2;0,m,7;0,m,1;0,m,0;0,m,6;0,p,0;0,p,2;0,p,7;0,p,5;1,m,5;1,m,1;1,m,2;1,m,4;1,p,0;1,p,4;1,p,7;1,p,5;1,p,3;2,m,5;2,m,4;2,m,0;2,m,6;2,m,7;2,p,2;2,p,3;2,p,1;2,p,0;2,p,5;3,m,2;3,m,1;3,m,4;3,m,6;3,m,5;3,m,7;3,p,1;3,p,3;3,p,5;3,p,2;3,p,0;4,m,3;4,m,5;4,m,1;4,m,4;4,m,0;4,m,2;4,m,6;4,p,7;4,p,4;4,p,3;4,p,6;4,p,2;5,m,2;5,m,0;5,m,6;5,m,5;5,m,4;5,m,7;5,p,0;5,p,4;5,p,5;5,p,3;5,p,7;5,p,1;5,p,2;6,m,5;6,m,4;6,m,0;6,m,2;6,m,7;6,p,6;6,p,7;6,p,3;6,p,5;6,p,1;7,m,0;7,m,3;7,m,7;7,m,2;7,m,5;7,m,4;7,p,6;7,p,4;7,p,1;7,p,3;7,p,0;7,p,2;7,p,7#4#2;4;5;6;7");
		assertEquals("0/1/2/3/4/5/6;0/1/2/3/4/5/6/7;2/3/4/6/7;4#m;p#0/1/2/3/4/5/6,m,0/1/2/3/4/5/6/7;0/1/2/3/4/5/6,p,0/1/2/3/4/5/6/7;0/1/2/3/4/5/6/7,m,0/1/2/3/4/5/6/7;0/1/2/3/4/5/6/7,p,0/1/2/3/4/5/6/7;2/3/4/6/7,m,0/1/2/3/4/5/6/7;2/3/4/6/7,p,0/1/2/3/4/5/6/7;4,m,0/1/2/3/4/5/6;4,p,2/3/4/6/7#4#0/1/2/3/4/5/6;0/1/2/3/4/5/6/7;2/3/4/6/7;4", nfaToDfa.toString());
	}

	@Test
	public void testNfa10() {
		NfaToDfa nfaToDfa= new NfaToDfa("0;1;2;3;4;5;6#q;u#0,u,1;1,e,2;1,e,4;2,q,3;3,e,6;4,q,5;5,e,6#0#6");
		assertEquals("-1;0;1/2/4;3/5/6#q;u#-1,q,-1;-1,u,-1;0,q,-1;0,u,1/2/4;1/2/4,q,3/5/6;1/2/4,u,-1;3/5/6,q,-1;3/5/6,u,-1#0#3/5/6", nfaToDfa.toString());
	}

}