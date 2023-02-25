package csen1002.tests.task1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task1.RegExToNfa;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task1TestsBatch0 {

	@Test
	public void testRegEx1() {
		RegExToNfa regExToNfa = new RegExToNfa("a;o;z#za|*o.");
		assertEquals("0;1;2;3;4;5;6;7;9#a;o;z#0,z,1;1,e,5;2,a,3;3,e,5;4,e,0;4,e,2;5,e,4;5,e,7;6,e,4;6,e,7;7,o,9#6#9",
				regExToNfa.toString());
	}

	@Test
	public void testRegEx2() {
		RegExToNfa regExToNfa = new RegExToNfa("c;o;u#ce*u..o|");
		assertEquals(
				"0;1;2;3;5;7;8;9;10;11#c;o;u#0,c,1;1,e,2;1,e,5;2,e,3;3,e,2;3,e,5;5,u,7;7,e,11;8,o,9;9,e,11;10,e,0;10,e,8#10#11",
				regExToNfa.toString());
	}

	@Test
	public void testRegEx3() {
		RegExToNfa regExToNfa = new RegExToNfa("b;f;l;p#lf|f|bl|p.|");
		assertEquals(
				"0;1;2;3;4;5;6;7;8;9;10;11;12;13;14;15;17;18;19#b;f;l;p#0,l,1;1,e,5;2,f,3;3,e,5;4,e,0;4,e,2;5,e,9;6,f,7;7,e,9;8,e,4;8,e,6;9,e,19;10,b,11;11,e,15;12,l,13;13,e,15;14,e,10;14,e,12;15,p,17;17,e,19;18,e,8;18,e,14#18#19",
				regExToNfa.toString());
	}

	@Test
	public void testRegEx4() {
		RegExToNfa regExToNfa = new RegExToNfa("c;f;n;r#c*fr.|nr||*");
		assertEquals(
				"0;1;2;3;4;5;7;8;9;10;11;12;13;14;15;16;17;18;19#c;f;n;r#0,c,1;1,e,0;1,e,3;2,e,0;2,e,3;3,e,9;4,f,5;5,r,7;7,e,9;8,e,2;8,e,4;9,e,17;10,n,11;11,e,15;12,r,13;13,e,15;14,e,10;14,e,12;15,e,17;16,e,8;16,e,14;17,e,16;17,e,19;18,e,16;18,e,19#18#19",
				regExToNfa.toString());
	}

	@Test
	public void testRegEx5() {
		RegExToNfa regExToNfa = new RegExToNfa("d;g;i;r;w#ge|wir|d..|");
		assertEquals(
				"0;1;2;3;4;5;6;7;8;9;10;11;13;15;16;17#d;g;i;r;w#0,g,1;1,e,5;2,e,3;3,e,5;4,e,0;4,e,2;5,e,17;6,w,7;7,e,8;7,e,10;8,i,9;9,e,13;10,r,11;11,e,13;13,d,15;15,e,17;16,e,4;16,e,6#16#17",
				regExToNfa.toString());
	}

	@Test
	public void testRegEx6() {
		RegExToNfa regExToNfa = new RegExToNfa("b;d;o;q#dq|b.do||");
		assertEquals(
				"0;1;2;3;4;5;7;8;9;10;11;12;13;14;15#b;d;o;q#0,d,1;1,e,5;2,q,3;3,e,5;4,e,0;4,e,2;5,b,7;7,e,15;8,d,9;9,e,13;10,o,11;11,e,13;12,e,8;12,e,10;13,e,15;14,e,4;14,e,12#14#15",
				regExToNfa.toString());
	}

	@Test
	public void testRegEx7() {
		RegExToNfa regExToNfa = new RegExToNfa("q;w;z#qez|e.w|.");
		assertEquals(
				"0;1;2;3;4;5;6;7;9;10;11;13#q;w;z#0,q,1;1,e,6;1,e,10;2,e,3;3,e,7;4,z,5;5,e,7;6,e,2;6,e,4;7,e,9;9,e,13;10,w,11;11,e,13#0#13",
				regExToNfa.toString());
	}

	@Test
	public void testRegEx8() {
		RegExToNfa regExToNfa = new RegExToNfa("i;u;v;z#vuiz*|||");
		assertEquals(
				"0;1;2;3;4;5;6;7;8;9;10;11;12;13;14;15#i;u;v;z#0,v,1;1,e,15;2,u,3;3,e,13;4,i,5;5,e,11;6,z,7;7,e,6;7,e,9;8,e,6;8,e,9;9,e,11;10,e,4;10,e,8;11,e,13;12,e,2;12,e,10;13,e,15;14,e,0;14,e,12#14#15",
				regExToNfa.toString());
	}

	@Test
	public void testRegEx9() {
		RegExToNfa regExToNfa = new RegExToNfa("a;i;m#iam.*.*");
		assertEquals("0;1;2;3;5;7;8;9#a;i;m#0,i,1;1,e,2;1,e,7;2,a,3;3,m,5;5,e,2;5,e,7;7,e,0;7,e,9;8,e,0;8,e,9#8#9",
				regExToNfa.toString());
	}

	@Test
	public void testRegEx10() {
		RegExToNfa regExToNfa = new RegExToNfa("o;s#os|*");
		assertEquals("0;1;2;3;4;5;6;7#o;s#0,o,1;1,e,5;2,s,3;3,e,5;4,e,0;4,e,2;5,e,4;5,e,7;6,e,4;6,e,7#6#7",
				regExToNfa.toString());
	}

}