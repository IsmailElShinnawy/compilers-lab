package csen1002.tests.task1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task1.RegExToNfa;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task1TestsBatch1 {

	@Test
	public void testRegEx1() {
		RegExToNfa regExToNfa= new RegExToNfa("m;p;q#qemqe||p|..");
		assertEquals("0;1;3;4;5;6;7;8;9;10;11;12;13;14;15;17#m;p;q#0,q,1;1,e,3;3,e,12;3,e,14;4,m,5;5,e,13;6,q,7;7,e,11;8,e,9;9,e,11;10,e,6;10,e,8;11,e,13;12,e,4;12,e,10;13,e,17;14,p,15;15,e,17#0#17", regExToNfa.toString());
	}

	@Test
	public void testRegEx2() {
		RegExToNfa regExToNfa= new RegExToNfa("f;m;o#mfo*..");
		assertEquals("0;1;3;4;5;7#f;m;o#0,m,1;1,f,3;3,e,4;3,e,7;4,o,5;5,e,4;5,e,7#0#7", regExToNfa.toString());
	}

	@Test
	public void testRegEx3() {
		RegExToNfa regExToNfa= new RegExToNfa("h;r;x;y#r*x*h|ye||.");
		assertEquals("0;1;2;3;4;5;6;7;8;9;10;11;12;13;14;15;16;17;19#h;r;x;y#0,r,1;1,e,0;1,e,3;2,e,0;2,e,3;3,e,10;3,e,16;4,x,5;5,e,4;5,e,7;6,e,4;6,e,7;7,e,11;8,h,9;9,e,11;10,e,6;10,e,8;11,e,19;12,y,13;13,e,17;14,e,15;15,e,17;16,e,12;16,e,14;17,e,19#2#19", regExToNfa.toString());
	}

	@Test
	public void testRegEx4() {
		RegExToNfa regExToNfa= new RegExToNfa("h;j;p;z#hz*pzj||||");
		assertEquals("0;1;2;3;4;5;6;7;8;9;10;11;12;13;14;15;16;17;18;19#h;j;p;z#0,h,1;1,e,19;2,z,3;3,e,2;3,e,5;4,e,2;4,e,5;5,e,17;6,p,7;7,e,15;8,z,9;9,e,13;10,j,11;11,e,13;12,e,8;12,e,10;13,e,15;14,e,6;14,e,12;15,e,17;16,e,4;16,e,14;17,e,19;18,e,0;18,e,16#18#19", regExToNfa.toString());
	}

	@Test
	public void testRegEx5() {
		RegExToNfa regExToNfa= new RegExToNfa("m;y#m*y|y*.");
		assertEquals("0;1;2;3;4;5;6;7;8;9;11#m;y#0,m,1;1,e,0;1,e,3;2,e,0;2,e,3;3,e,7;4,y,5;5,e,7;6,e,2;6,e,4;7,e,8;7,e,11;8,y,9;9,e,8;9,e,11#6#11", regExToNfa.toString());
	}

	@Test
	public void testRegEx6() {
		RegExToNfa regExToNfa= new RegExToNfa("a;c;f;j;x#jac|xf||.");
		assertEquals("0;1;2;3;4;5;6;7;8;9;10;11;12;13;15#a;c;f;j;x#0,j,1;1,e,6;1,e,12;2,a,3;3,e,7;4,c,5;5,e,7;6,e,2;6,e,4;7,e,15;8,x,9;9,e,13;10,f,11;11,e,13;12,e,8;12,e,10;13,e,15#0#15", regExToNfa.toString());
	}

	@Test
	public void testRegEx7() {
		RegExToNfa regExToNfa= new RegExToNfa("c;h#c*c|h*.*");
		assertEquals("0;1;2;3;4;5;6;7;8;9;11;12;13#c;h#0,c,1;1,e,0;1,e,3;2,e,0;2,e,3;3,e,7;4,c,5;5,e,7;6,e,2;6,e,4;7,e,8;7,e,11;8,h,9;9,e,8;9,e,11;11,e,6;11,e,13;12,e,6;12,e,13#12#13", regExToNfa.toString());
	}

	@Test
	public void testRegEx8() {
		RegExToNfa regExToNfa= new RegExToNfa("b;d;f;m;r#dfbfr...m..");
		assertEquals("0;1;3;5;7;9;11#b;d;f;m;r#0,d,1;1,f,3;3,b,5;5,f,7;7,r,9;9,m,11#0#11", regExToNfa.toString());
	}

	@Test
	public void testRegEx9() {
		RegExToNfa regExToNfa= new RegExToNfa("c;j;n;t#te*cn.j|||");
		assertEquals("0;1;2;3;4;5;6;7;9;10;11;12;13;14;15;16;17#c;j;n;t#0,t,1;1,e,17;2,e,3;3,e,2;3,e,5;4,e,2;4,e,5;5,e,15;6,c,7;7,n,9;9,e,13;10,j,11;11,e,13;12,e,6;12,e,10;13,e,15;14,e,4;14,e,12;15,e,17;16,e,0;16,e,14#16#17", regExToNfa.toString());
	}

	@Test
	public void testRegEx10() {
		RegExToNfa regExToNfa= new RegExToNfa("h;n;v;w;x#hnw|xv..|");
		assertEquals("0;1;2;3;4;5;6;7;9;11;12;13#h;n;v;w;x#0,h,1;1,e,13;2,n,3;3,e,7;4,w,5;5,e,7;6,e,2;6,e,4;7,x,9;9,v,11;11,e,13;12,e,0;12,e,6#12#13", regExToNfa.toString());
	}

}