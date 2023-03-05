package csen1002.tests.task1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task1.RegExToNfa;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task1TestsBatch3 {

	@Test
	public void testRegEx1() {
		RegExToNfa regExToNfa= new RegExToNfa("b;i;o#iboe**|e|.|");
		assertEquals("0;1;2;3;4;5;6;7;8;9;10;11;12;13;14;15;17;18;19#b;i;o#0,i,1;1,e,19;2,b,3;3,e,12;3,e,14;4,o,5;5,e,13;6,e,7;7,e,6;7,e,9;8,e,6;8,e,9;9,e,8;9,e,11;10,e,8;10,e,11;11,e,13;12,e,4;12,e,10;13,e,17;14,e,15;15,e,17;17,e,19;18,e,0;18,e,2#18#19", regExToNfa.toString());
	}

	@Test
	public void testRegEx2() {
		RegExToNfa regExToNfa= new RegExToNfa("r;u#ru.*eu**..*");
		assertEquals("0;1;3;4;5;7;8;9;10;11;13;14;15#r;u#0,r,1;1,u,3;3,e,0;3,e,5;4,e,0;4,e,5;5,e,7;7,e,10;7,e,13;8,u,9;9,e,8;9,e,11;10,e,8;10,e,11;11,e,10;11,e,13;13,e,4;13,e,15;14,e,4;14,e,15#14#15", regExToNfa.toString());
	}

	@Test
	public void testRegEx3() {
		RegExToNfa regExToNfa= new RegExToNfa("d;o;t#todoo.||*.");
		assertEquals("0;1;2;3;4;5;6;7;9;10;11;12;13;15#d;o;t#0,t,1;1,e,12;1,e,15;2,o,3;3,e,13;4,d,5;5,e,11;6,o,7;7,o,9;9,e,11;10,e,4;10,e,6;11,e,13;12,e,2;12,e,10;13,e,12;13,e,15#0#15", regExToNfa.toString());
	}

	@Test
	public void testRegEx4() {
		RegExToNfa regExToNfa= new RegExToNfa("b;c;d;f;k#bkfc|d|.|*");
		assertEquals("0;1;2;3;4;5;6;7;8;9;10;11;13;14;15;16;17#b;c;d;f;k#0,b,1;1,e,15;2,k,3;3,e,8;3,e,10;4,f,5;5,e,9;6,c,7;7,e,9;8,e,4;8,e,6;9,e,13;10,d,11;11,e,13;13,e,15;14,e,0;14,e,2;15,e,14;15,e,17;16,e,14;16,e,17#16#17", regExToNfa.toString());
	}

	@Test
	public void testRegEx5() {
		RegExToNfa regExToNfa= new RegExToNfa("f;q;s;y#s*q.e.f.y|");
		assertEquals("0;1;2;3;5;7;9;10;11;12;13#f;q;s;y#0,s,1;1,e,0;1,e,3;2,e,0;2,e,3;3,q,5;5,e,7;7,f,9;9,e,13;10,y,11;11,e,13;12,e,2;12,e,10#12#13", regExToNfa.toString());
	}

	@Test
	public void testRegEx6() {
		RegExToNfa regExToNfa= new RegExToNfa("i;k#ike*|i*.|");
		assertEquals("0;1;2;3;4;5;6;7;8;9;10;11;13;14;15#i;k#0,i,1;1,e,15;2,k,3;3,e,9;4,e,5;5,e,4;5,e,7;6,e,4;6,e,7;7,e,9;8,e,2;8,e,6;9,e,10;9,e,13;10,i,11;11,e,10;11,e,13;13,e,15;14,e,0;14,e,8#14#15", regExToNfa.toString());
	}

	@Test
	public void testRegEx7() {
		RegExToNfa regExToNfa= new RegExToNfa("c;j;v#c*j.v.");
		assertEquals("0;1;2;3;5;7#c;j;v#0,c,1;1,e,0;1,e,3;2,e,0;2,e,3;3,j,5;5,v,7#2#7", regExToNfa.toString());
	}

	@Test
	public void testRegEx8() {
		RegExToNfa regExToNfa= new RegExToNfa("k;p;t;z#ztz.z|.p|k|");
		assertEquals("0;1;2;3;5;6;7;9;10;11;12;13;14;15;16;17#k;p;t;z#0,z,1;1,e,2;1,e,6;2,t,3;3,z,5;5,e,9;6,z,7;7,e,9;9,e,13;10,p,11;11,e,13;12,e,0;12,e,10;13,e,17;14,k,15;15,e,17;16,e,12;16,e,14#16#17", regExToNfa.toString());
	}

	@Test
	public void testRegEx9() {
		RegExToNfa regExToNfa= new RegExToNfa("c;r#ce*r.c.|");
		assertEquals("0;1;2;3;4;5;7;9;10;11#c;r#0,c,1;1,e,11;2,e,3;3,e,2;3,e,5;4,e,2;4,e,5;5,r,7;7,c,9;9,e,11;10,e,0;10,e,4#10#11", regExToNfa.toString());
	}

	@Test
	public void testRegEx10() {
		RegExToNfa regExToNfa= new RegExToNfa("a;i;k;n;s#aks.**|n|i.");
		assertEquals("0;1;2;3;5;6;7;8;9;10;11;12;13;14;15;17#a;i;k;n;s#0,a,1;1,e,11;2,k,3;3,s,5;5,e,2;5,e,7;6,e,2;6,e,7;7,e,6;7,e,9;8,e,6;8,e,9;9,e,11;10,e,0;10,e,8;11,e,15;12,n,13;13,e,15;14,e,10;14,e,12;15,i,17#14#17", regExToNfa.toString());
	}

}