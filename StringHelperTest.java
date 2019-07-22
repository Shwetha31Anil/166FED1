package com.mphasis.training.testcases;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mphasis.training.assignment.StringHelper;

public class StringHelperTest {
		StringHelper helper;
	@Before
	public void setUp() throws Exception {
		helper=new StringHelper();
	}

	@After
	public void tearDown() throws Exception {
		helper=null;
	}

	@Test
	public void testTruncateInFirst2Positions() {
		assertEquals("BC", helper.truncateInFirst2Positions("AABC"));
		assertEquals("BCD", helper.truncateInFirst2Positions("ABCD"));
		assertEquals("BCAD", helper.truncateInFirst2Positions("BCAD"));
		assertEquals("MVA", helper.truncateInFirst2Positions("MAVA"));
		assertEquals("JVA", helper.truncateInFirst2Positions("JAVA"));
		assertEquals("KVA", helper.truncateInFirst2Positions("KAVA"));
		assertEquals("", helper.truncateInFirst2Positions("A"));
		assertEquals("", helper.truncateInFirst2Positions("AA"));
	}

	@Test
	public void testAreFirst2charsAndLast2charsSame() {
		
		assertEquals(false, helper.areFirst2charsAndLast2charsSame("ADBCE"));
		assertFalse(helper.areFirst2charsAndLast2charsSame("ADBCE"));
		assertFalse(helper.areFirst2charsAndLast2charsSame("SHRUTHIA"));
		assertTrue(helper.areFirst2charsAndLast2charsSame("MAMA"));
		assertTrue(helper.areFirst2charsAndLast2charsSame("ABCDAB"));
		
	}
	
	@Test(expected=NullPointerException.class)
	public void testArray() {
		int[] numbers= null;
		Arrays.sort(numbers);
	}
	
	@Test
	public void testArray1() {
		int[] numbers= {34,2,12,56,78};
		Arrays.sort(numbers);
		int[] expected= {2,12,34,56,78};
		assertArrayEquals(expected, numbers);	
	}
	@Test(timeout=149)
	public void testTimimg() {
		for(int i=0;i<10000000;i++) {
			int[] numbers= {i,i-1,i+1};
			Arrays.sort(numbers);
		}
	}
	
	

}
