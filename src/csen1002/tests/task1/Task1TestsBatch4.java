package csen1002.tests.task1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task1.RegExToNfa;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task1TestsBatch4 {

	@Test
	public void testRegEx1() {
		RegExToNfa regExToNfa= new RegExToNfa("h;l;o;s;v#so.h*.l|v.");
		assertEquals("0;1;3;4;5;7;8;9;10;11;13#h;l;o;s;v#0,s,1;1,o,3;3,e,4;3,e,7;4,h,5;5,e,4;5,e,7;7,e,11;8,l,9;9,e,11;10,e,0;10,e,8;11,v,13#10#13", regExToNfa.toString());
	}

	@Test
	public void testRegEx2() {
		RegExToNfa regExToNfa= new RegExToNfa("a;b;c;r;y#ayb.c.c.r|.");
		assertEquals("0;1;2;3;5;7;9;10;11;13#a;b;c;r;y#0,a,1;1,e,2;1,e,10;2,y,3;3,b,5;5,c,7;7,c,9;9,e,13;10,r,11;11,e,13#0#13", regExToNfa.toString());
	}

	@Test
	public void testRegEx3() {
		RegExToNfa regExToNfa= new RegExToNfa("p;u;y#ey.pu..y.");
		assertEquals("0;1;3;5;7;9#p;u;y#0,e,1;1,y,3;3,p,5;5,u,7;7,y,9#0#9", regExToNfa.toString());
	}

	@Test
	public void testRegEx4() {
		RegExToNfa regExToNfa= new RegExToNfa("r;s;z#zr.s*zs..|");
		assertEquals("0;1;3;4;5;6;7;9;11;12;13#r;s;z#0,z,1;1,r,3;3,e,13;4,s,5;5,e,4;5,e,7;6,e,4;6,e,7;7,z,9;9,s,11;11,e,13;12,e,0;12,e,6#12#13", regExToNfa.toString());
	}

	@Test
	public void testRegEx5() {
		RegExToNfa regExToNfa= new RegExToNfa("g;h;i#eh|gi*..");
		assertEquals("0;1;2;3;4;5;7;8;9;11#g;h;i#0,e,1;1,e,5;2,h,3;3,e,5;4,e,0;4,e,2;5,g,7;7,e,8;7,e,11;8,i,9;9,e,8;9,e,11#4#11", regExToNfa.toString());
	}

	@Test
	public void testRegEx6() {
		RegExToNfa regExToNfa= new RegExToNfa("f;p;q;v;x#pq*x.fv..|");
		assertEquals("0;1;2;3;4;5;7;9;11;12;13#f;p;q;v;x#0,p,1;1,e,13;2,q,3;3,e,2;3,e,5;4,e,2;4,e,5;5,x,7;7,f,9;9,v,11;11,e,13;12,e,0;12,e,4#12#13", regExToNfa.toString());
	}

	@Test
	public void testRegEx7() {
		RegExToNfa regExToNfa= new RegExToNfa("m;z#m*zm||");
		assertEquals("0;1;2;3;4;5;6;7;8;9;10;11#m;z#0,m,1;1,e,0;1,e,3;2,e,0;2,e,3;3,e,11;4,z,5;5,e,9;6,m,7;7,e,9;8,e,4;8,e,6;9,e,11;10,e,2;10,e,8#10#11", regExToNfa.toString());
	}

	@Test
	public void testRegEx8() {
		RegExToNfa regExToNfa= new RegExToNfa("a;i;j;r;v#avj|i||r.");
		assertEquals("0;1;2;3;4;5;6;7;8;9;10;11;12;13;15#a;i;j;r;v#0,a,1;1,e,13;2,v,3;3,e,7;4,j,5;5,e,7;6,e,2;6,e,4;7,e,11;8,i,9;9,e,11;10,e,6;10,e,8;11,e,13;12,e,0;12,e,10;13,r,15#12#15", regExToNfa.toString());
	}

	@Test
	public void testRegEx9() {
		RegExToNfa regExToNfa= new RegExToNfa("b;r;w;y#er.w**b|.y.");
		assertEquals("0;1;3;4;5;6;7;8;9;10;11;13;15#b;r;w;y#0,e,1;1,r,3;3,e,8;3,e,10;4,w,5;5,e,4;5,e,7;6,e,4;6,e,7;7,e,6;7,e,9;8,e,6;8,e,9;9,e,13;10,b,11;11,e,13;13,y,15#0#15", regExToNfa.toString());
	}

	@Test
	public void testRegEx10() {
		RegExToNfa regExToNfa= new RegExToNfa("c;r;v#rcvve...|*");
		assertEquals("0;1;2;3;5;7;9;10;11;12;13#c;r;v#0,r,1;1,e,11;2,c,3;3,v,5;5,v,7;7,e,9;9,e,11;10,e,0;10,e,2;11,e,10;11,e,13;12,e,10;12,e,13#12#13", regExToNfa.toString());
	}

}