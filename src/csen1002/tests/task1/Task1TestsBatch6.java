package csen1002.tests.task1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task1.RegExToNfa;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task1TestsBatch6 {

	@Test
	public void testRegEx1() {
		RegExToNfa regExToNfa= new RegExToNfa("h;o;r;v#hrvo*|.e.|");
		assertEquals("0;1;2;3;4;5;6;7;8;9;11;13;14;15#h;o;r;v#0,h,1;1,e,15;2,r,3;3,e,4;3,e,8;4,v,5;5,e,11;6,o,7;7,e,6;7,e,9;8,e,6;8,e,9;9,e,11;11,e,13;13,e,15;14,e,0;14,e,2#14#15", regExToNfa.toString());
	}

	@Test
	public void testRegEx2() {
		RegExToNfa regExToNfa= new RegExToNfa("k;q;v;z#z*keqv...*|");
		assertEquals("0;1;2;3;4;5;7;9;11;12;13;14;15#k;q;v;z#0,z,1;1,e,0;1,e,3;2,e,0;2,e,3;3,e,15;4,k,5;5,e,7;7,q,9;9,v,11;11,e,4;11,e,13;12,e,4;12,e,13;13,e,15;14,e,2;14,e,12#14#15", regExToNfa.toString());
	}

	@Test
	public void testRegEx3() {
		RegExToNfa regExToNfa= new RegExToNfa("c;y#ccey*.||");
		assertEquals("0;1;2;3;4;5;6;7;9;10;11;12;13#c;y#0,c,1;1,e,13;2,c,3;3,e,11;4,e,5;5,e,6;5,e,9;6,y,7;7,e,6;7,e,9;9,e,11;10,e,2;10,e,4;11,e,13;12,e,0;12,e,10#12#13", regExToNfa.toString());
	}

	@Test
	public void testRegEx4() {
		RegExToNfa regExToNfa= new RegExToNfa("d;o;s;t;u#tsd|suo|.||");
		assertEquals("0;1;2;3;4;5;6;7;8;9;10;11;12;13;15;16;17;18;19#d;o;s;t;u#0,t,1;1,e,19;2,s,3;3,e,7;4,d,5;5,e,7;6,e,2;6,e,4;7,e,17;8,s,9;9,e,10;9,e,12;10,u,11;11,e,15;12,o,13;13,e,15;15,e,17;16,e,6;16,e,8;17,e,19;18,e,0;18,e,16#18#19", regExToNfa.toString());
	}

	@Test
	public void testRegEx5() {
		RegExToNfa regExToNfa= new RegExToNfa("d;m#emde|*.|");
		assertEquals("0;1;2;3;4;5;6;7;8;9;11;12;13#d;m#0,e,1;1,e,13;2,m,3;3,e,8;3,e,11;4,d,5;5,e,9;6,e,7;7,e,9;8,e,4;8,e,6;9,e,8;9,e,11;11,e,13;12,e,0;12,e,2#12#13", regExToNfa.toString());
	}

	@Test
	public void testRegEx6() {
		RegExToNfa regExToNfa= new RegExToNfa("j;p;x#p*ej|.px|.");
		assertEquals("0;1;2;3;4;5;6;7;9;10;11;12;13;15#j;p;x#0,p,1;1,e,0;1,e,3;2,e,0;2,e,3;3,e,4;3,e,6;4,e,5;5,e,9;6,j,7;7,e,9;9,e,10;9,e,12;10,p,11;11,e,15;12,x,13;13,e,15#2#15", regExToNfa.toString());
	}

	@Test
	public void testRegEx7() {
		RegExToNfa regExToNfa= new RegExToNfa("j;l;n;o;p#onl.|jp|l|.");
		assertEquals("0;1;2;3;5;6;7;8;9;10;11;12;13;14;15;17#j;l;n;o;p#0,o,1;1,e,7;2,n,3;3,l,5;5,e,7;6,e,0;6,e,2;7,e,12;7,e,14;8,j,9;9,e,13;10,p,11;11,e,13;12,e,8;12,e,10;13,e,17;14,l,15;15,e,17#6#17", regExToNfa.toString());
	}

	@Test
	public void testRegEx8() {
		RegExToNfa regExToNfa= new RegExToNfa("j;p;z#jpj.z|p.|");
		assertEquals("0;1;2;3;5;6;7;8;9;11;12;13#j;p;z#0,j,1;1,e,13;2,p,3;3,j,5;5,e,9;6,z,7;7,e,9;8,e,2;8,e,6;9,p,11;11,e,13;12,e,0;12,e,8#12#13", regExToNfa.toString());
	}

	@Test
	public void testRegEx9() {
		RegExToNfa regExToNfa= new RegExToNfa("k;n;z#zn*k.|");
		assertEquals("0;1;2;3;4;5;7;8;9#k;n;z#0,z,1;1,e,9;2,n,3;3,e,2;3,e,5;4,e,2;4,e,5;5,k,7;7,e,9;8,e,0;8,e,4#8#9", regExToNfa.toString());
	}

	@Test
	public void testRegEx10() {
		RegExToNfa regExToNfa= new RegExToNfa("a;f;m;z#fzma...");
		assertEquals("0;1;3;5;7#a;f;m;z#0,f,1;1,z,3;3,m,5;5,a,7#0#7", regExToNfa.toString());
	}

}