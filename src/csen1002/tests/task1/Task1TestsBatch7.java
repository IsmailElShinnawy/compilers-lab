package csen1002.tests.task1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task1.RegExToNfa;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task1TestsBatch7 {

	@Test
	public void testRegEx1() {
		RegExToNfa regExToNfa= new RegExToNfa("d;h;y#hydd.|.");
		assertEquals("0;1;2;3;4;5;7;9#d;h;y#0,h,1;1,e,2;1,e,4;2,y,3;3,e,9;4,d,5;5,d,7;7,e,9#0#9", regExToNfa.toString());
	}

	@Test
	public void testRegEx2() {
		RegExToNfa regExToNfa= new RegExToNfa("s;u#uss||e.s*|");
		assertEquals("0;1;2;3;4;5;6;7;8;9;11;12;13;14;15;16;17#s;u#0,u,1;1,e,9;2,s,3;3,e,7;4,s,5;5,e,7;6,e,2;6,e,4;7,e,9;8,e,0;8,e,6;9,e,11;11,e,17;12,s,13;13,e,12;13,e,15;14,e,12;14,e,15;15,e,17;16,e,8;16,e,14#16#17", regExToNfa.toString());
	}

	@Test
	public void testRegEx3() {
		RegExToNfa regExToNfa= new RegExToNfa("b;j;x#be*.j.xb||");
		assertEquals("0;1;2;3;5;7;8;9;10;11;12;13;14;15#b;j;x#0,b,1;1,e,2;1,e,5;2,e,3;3,e,2;3,e,5;5,j,7;7,e,15;8,x,9;9,e,13;10,b,11;11,e,13;12,e,8;12,e,10;13,e,15;14,e,0;14,e,12#14#15", regExToNfa.toString());
	}

	@Test
	public void testRegEx4() {
		RegExToNfa regExToNfa= new RegExToNfa("b;i;m;x#ixb|.m.");
		assertEquals("0;1;2;3;4;5;7;9#b;i;m;x#0,i,1;1,e,2;1,e,4;2,x,3;3,e,7;4,b,5;5,e,7;7,m,9#0#9", regExToNfa.toString());
	}

	@Test
	public void testRegEx5() {
		RegExToNfa regExToNfa= new RegExToNfa("a;k;l;q#ak|lq|q.*|*");
		assertEquals("0;1;2;3;4;5;6;7;8;9;10;11;13;14;15;16;17;18;19#a;k;l;q#0,a,1;1,e,5;2,k,3;3,e,5;4,e,0;4,e,2;5,e,17;6,l,7;7,e,11;8,q,9;9,e,11;10,e,6;10,e,8;11,q,13;13,e,10;13,e,15;14,e,10;14,e,15;15,e,17;16,e,4;16,e,14;17,e,16;17,e,19;18,e,16;18,e,19#18#19", regExToNfa.toString());
	}

	@Test
	public void testRegEx6() {
		RegExToNfa regExToNfa= new RegExToNfa("h;m;v#ve|*m.e|h.*");
		assertEquals("0;1;2;3;4;5;6;7;9;10;11;12;13;15;16;17#h;m;v#0,v,1;1,e,5;2,e,3;3,e,5;4,e,0;4,e,2;5,e,4;5,e,7;6,e,4;6,e,7;7,m,9;9,e,13;10,e,11;11,e,13;12,e,6;12,e,10;13,h,15;15,e,12;15,e,17;16,e,12;16,e,17#16#17", regExToNfa.toString());
	}

	@Test
	public void testRegEx7() {
		RegExToNfa regExToNfa= new RegExToNfa("i;s;w#s*i.i.w.e.*");
		assertEquals("0;1;2;3;5;7;9;11;12;13#i;s;w#0,s,1;1,e,0;1,e,3;2,e,0;2,e,3;3,i,5;5,i,7;7,w,9;9,e,11;11,e,2;11,e,13;12,e,2;12,e,13#12#13", regExToNfa.toString());
	}

	@Test
	public void testRegEx8() {
		RegExToNfa regExToNfa= new RegExToNfa("h;u;w#eweh|.u|.");
		assertEquals("0;1;2;3;4;5;6;7;9;10;11;13#h;u;w#0,e,1;1,e,2;1,e,10;2,w,3;3,e,4;3,e,6;4,e,5;5,e,9;6,h,7;7,e,9;9,e,13;10,u,11;11,e,13#0#13", regExToNfa.toString());
	}

	@Test
	public void testRegEx9() {
		RegExToNfa regExToNfa= new RegExToNfa("r;u#ru**.");
		assertEquals("0;1;2;3;4;5;7#r;u#0,r,1;1,e,4;1,e,7;2,u,3;3,e,2;3,e,5;4,e,2;4,e,5;5,e,4;5,e,7#0#7", regExToNfa.toString());
	}

	@Test
	public void testRegEx10() {
		RegExToNfa regExToNfa= new RegExToNfa("c;s;t;v#tc|v|*s|");
		assertEquals("0;1;2;3;4;5;6;7;8;9;10;11;12;13;14;15#c;s;t;v#0,t,1;1,e,5;2,c,3;3,e,5;4,e,0;4,e,2;5,e,9;6,v,7;7,e,9;8,e,4;8,e,6;9,e,8;9,e,11;10,e,8;10,e,11;11,e,15;12,s,13;13,e,15;14,e,10;14,e,12#14#15", regExToNfa.toString());
	}

}