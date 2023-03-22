package main;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class LibraryTester {

	@Test // Annotation. The following function is treated as test. 
	public void mySort() {
		int[] input = new int[] {2, 3, 1, 4, 5};
		int[] expected = new int[] {1, 2, 3, 4, 5};
		int[] actual = Library.mySort(input);
		assertArrayEquals(expected, actual);
	}

	@Test
	public void detectEven1() {
		
		int input1 = 1; 
		boolean expect1 = true;
		boolean actual1 = Library.detectOdd(input1);

		assertEquals(expect1, actual1);
		
	}
	
	@Test
	public void detectEven2() {
		
		int input2 = 2; 
		boolean expect2 = true;
		boolean actual2 = Library.detectOdd(input2);

		assertEquals(expect2, actual2);
		
	}

	
}