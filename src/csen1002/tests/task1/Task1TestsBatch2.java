package csen1002.tests.task1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task1.RegExToNfa;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task1TestsBatch2 {

	@Test
	public void testRegEx1() {
		RegExToNfa regExToNfa= new RegExToNfa("l;s;v#vvl||s*.");
		assertEquals("0;1;2;3;4;5;6;7;8;9;10;11;13#l;s;v#0,v,1;1,e,9;2,v,3;3,e,7;4,l,5;5,e,7;6,e,2;6,e,4;7,e,9;8,e,0;8,e,6;9,e,10;9,e,13;10,s,11;11,e,10;11,e,13#8#13", regExToNfa.toString());
	}

	@Test
	public void testRegEx2() {
		RegExToNfa regExToNfa= new RegExToNfa("c;j;s#jsc|.");
		assertEquals("0;1;2;3;4;5;7#c;j;s#0,j,1;1,e,2;1,e,4;2,s,3;3,e,7;4,c,5;5,e,7#0#7", regExToNfa.toString());
	}

	@Test
	public void testRegEx3() {
		RegExToNfa regExToNfa= new RegExToNfa("b;m;w#mmw.|wb..");
		assertEquals("0;1;2;3;5;6;7;9;11#b;m;w#0,m,1;1,e,7;2,m,3;3,w,5;5,e,7;6,e,0;6,e,2;7,w,9;9,b,11#6#11", regExToNfa.toString());
	}

	@Test
	public void testRegEx4() {
		RegExToNfa regExToNfa= new RegExToNfa("m;q;y#ym.yq||*");
		assertEquals("0;1;3;4;5;6;7;8;9;10;11;12;13#m;q;y#0,y,1;1,m,3;3,e,11;4,y,5;5,e,9;6,q,7;7,e,9;8,e,4;8,e,6;9,e,11;10,e,0;10,e,8;11,e,10;11,e,13;12,e,10;12,e,13#12#13", regExToNfa.toString());
	}

	@Test
	public void testRegEx5() {
		RegExToNfa regExToNfa= new RegExToNfa("i;k;s;y#k*syi..|");
		assertEquals("0;1;2;3;4;5;7;9;10;11#i;k;s;y#0,k,1;1,e,0;1,e,3;2,e,0;2,e,3;3,e,11;4,s,5;5,y,7;7,i,9;9,e,11;10,e,2;10,e,4#10#11", regExToNfa.toString());
	}

	@Test
	public void testRegEx6() {
		RegExToNfa regExToNfa= new RegExToNfa("d;i;l#dil|.");
		assertEquals("0;1;2;3;4;5;7#d;i;l#0,d,1;1,e,2;1,e,4;2,i,3;3,e,7;4,l,5;5,e,7#0#7", regExToNfa.toString());
	}

	@Test
	public void testRegEx7() {
		RegExToNfa regExToNfa= new RegExToNfa("d;n;y#dy|en|.");
		assertEquals("0;1;2;3;4;5;6;7;8;9;11#d;n;y#0,d,1;1,e,5;2,y,3;3,e,5;4,e,0;4,e,2;5,e,6;5,e,8;6,e,7;7,e,11;8,n,9;9,e,11#4#11", regExToNfa.toString());
	}

	@Test
	public void testRegEx8() {
		RegExToNfa regExToNfa= new RegExToNfa("b;c;d;k;r#kd|bcr.|.");
		assertEquals("0;1;2;3;4;5;6;7;8;9;11;13#b;c;d;k;r#0,k,1;1,e,5;2,d,3;3,e,5;4,e,0;4,e,2;5,e,6;5,e,8;6,b,7;7,e,13;8,c,9;9,r,11;11,e,13#4#13", regExToNfa.toString());
	}

	@Test
	public void testRegEx9() {
		RegExToNfa regExToNfa= new RegExToNfa("r;v#vr|*");
		assertEquals("0;1;2;3;4;5;6;7#r;v#0,v,1;1,e,5;2,r,3;3,e,5;4,e,0;4,e,2;5,e,4;5,e,7;6,e,4;6,e,7#6#7", regExToNfa.toString());
	}

	@Test
	public void testRegEx10() {
		RegExToNfa regExToNfa= new RegExToNfa("c;d;h;l;z#eclhd.z.|.|");
		assertEquals("0;1;2;3;4;5;6;7;9;11;13;14;15#c;d;h;l;z#0,e,1;1,e,15;2,c,3;3,e,4;3,e,6;4,l,5;5,e,13;6,h,7;7,d,9;9,z,11;11,e,13;13,e,15;14,e,0;14,e,2#14#15", regExToNfa.toString());
	}

}