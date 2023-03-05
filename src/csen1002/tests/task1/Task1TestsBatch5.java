package csen1002.tests.task1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task1.RegExToNfa;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task1TestsBatch5 {

	@Test
	public void testRegEx1() {
		RegExToNfa regExToNfa= new RegExToNfa("i;j;s;u#jiu|s|.");
		assertEquals("0;1;2;3;4;5;6;7;8;9;11#i;j;s;u#0,j,1;1,e,6;1,e,8;2,i,3;3,e,7;4,u,5;5,e,7;6,e,2;6,e,4;7,e,11;8,s,9;9,e,11#0#11", regExToNfa.toString());
	}

	@Test
	public void testRegEx2() {
		RegExToNfa regExToNfa= new RegExToNfa("q;s;y#ys|se|.e|q|");
		assertEquals("0;1;2;3;4;5;6;7;8;9;11;12;13;14;15;16;17;18;19#q;s;y#0,y,1;1,e,5;2,s,3;3,e,5;4,e,0;4,e,2;5,e,6;5,e,8;6,s,7;7,e,11;8,e,9;9,e,11;11,e,15;12,e,13;13,e,15;14,e,4;14,e,12;15,e,19;16,q,17;17,e,19;18,e,14;18,e,16#18#19", regExToNfa.toString());
	}

	@Test
	public void testRegEx3() {
		RegExToNfa regExToNfa= new RegExToNfa("h;u#uh**|");
		assertEquals("0;1;2;3;4;5;6;7;8;9#h;u#0,u,1;1,e,9;2,h,3;3,e,2;3,e,5;4,e,2;4,e,5;5,e,4;5,e,7;6,e,4;6,e,7;7,e,9;8,e,0;8,e,6#8#9", regExToNfa.toString());
	}

	@Test
	public void testRegEx4() {
		RegExToNfa regExToNfa= new RegExToNfa("j;s;t;u;y#sjy.u*.t.|");
		assertEquals("0;1;2;3;5;6;7;9;11;12;13#j;s;t;u;y#0,s,1;1,e,13;2,j,3;3,y,5;5,e,6;5,e,9;6,u,7;7,e,6;7,e,9;9,t,11;11,e,13;12,e,0;12,e,2#12#13", regExToNfa.toString());
	}

	@Test
	public void testRegEx5() {
		RegExToNfa regExToNfa= new RegExToNfa("n;s;t#tns|.n.");
		assertEquals("0;1;2;3;4;5;7;9#n;s;t#0,t,1;1,e,2;1,e,4;2,n,3;3,e,7;4,s,5;5,e,7;7,n,9#0#9", regExToNfa.toString());
	}

	@Test
	public void testRegEx6() {
		RegExToNfa regExToNfa= new RegExToNfa("j;p;q;r#prj||qe||");
		assertEquals("0;1;2;3;4;5;6;7;8;9;10;11;12;13;14;15;16;17#j;p;q;r#0,p,1;1,e,9;2,r,3;3,e,7;4,j,5;5,e,7;6,e,2;6,e,4;7,e,9;8,e,0;8,e,6;9,e,17;10,q,11;11,e,15;12,e,13;13,e,15;14,e,10;14,e,12;15,e,17;16,e,8;16,e,14#16#17", regExToNfa.toString());
	}

	@Test
	public void testRegEx7() {
		RegExToNfa regExToNfa= new RegExToNfa("k;l;m;t;v#tvlm..k.*.*");
		assertEquals("0;1;2;3;5;7;9;11;12;13#k;l;m;t;v#0,t,1;1,e,2;1,e,11;2,v,3;3,l,5;5,m,7;7,k,9;9,e,2;9,e,11;11,e,0;11,e,13;12,e,0;12,e,13#12#13", regExToNfa.toString());
	}

	@Test
	public void testRegEx8() {
		RegExToNfa regExToNfa= new RegExToNfa("n;o#o*n|e*|");
		assertEquals("0;1;2;3;4;5;6;7;8;9;10;11;12;13#n;o#0,o,1;1,e,0;1,e,3;2,e,0;2,e,3;3,e,7;4,n,5;5,e,7;6,e,2;6,e,4;7,e,13;8,e,9;9,e,8;9,e,11;10,e,8;10,e,11;11,e,13;12,e,6;12,e,10#12#13", regExToNfa.toString());
	}

	@Test
	public void testRegEx9() {
		RegExToNfa regExToNfa= new RegExToNfa("b;j;u;z#jb|u.z|");
		assertEquals("0;1;2;3;4;5;7;8;9;10;11#b;j;u;z#0,j,1;1,e,5;2,b,3;3,e,5;4,e,0;4,e,2;5,u,7;7,e,11;8,z,9;9,e,11;10,e,4;10,e,8#10#11", regExToNfa.toString());
	}

	@Test
	public void testRegEx10() {
		RegExToNfa regExToNfa= new RegExToNfa("o;t#eote..*.");
		assertEquals("0;1;2;3;5;7;9#o;t#0,e,1;1,e,2;1,e,9;2,o,3;3,t,5;5,e,7;7,e,2;7,e,9#0#9", regExToNfa.toString());
	}

}