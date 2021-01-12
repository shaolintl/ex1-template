package aup.cs;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

class Exercise1Tests {

	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	PrintStream ps = new PrintStream(baos);

	@BeforeEach
	void init() {
		System.setOut(ps);
	}

	@Test
	void test_printCharInt_1() {
		Exercise1.printCharInt('A');
		assertEquals("65", baos.toString());
	}

	@Test
  void test_printCharInt_2() {
		Exercise1.printCharInt('*');
		assertEquals("42", baos.toString());
	}

  @Test
	void test_printIntBase2_1() {
		Exercise1.printIntBase2(42);
		assertEquals("101010", baos.toString());
	}

	@Test
  void test_printIntBase2_2() {
		Exercise1.printIntBase2(65);
		assertEquals("1000001", baos.toString());
	}


  @Test
	void test_printBitArray_1() {
		Exercise1.printBitArray(new boolean[]{true, false, false, true});
		assertEquals("1001", baos.toString());
	}

	@Test
  void test_printBitArray_2() {
		Exercise1.printBitArray(new boolean[]{true, true, false, true});
		assertEquals("1101", baos.toString());
	}

  @Test
	void test_char2bitArray_1() {
    boolean[] arr1 = new boolean[16];
    arr1[10] = true;
    arr1[12] = true;
    arr1[14] = true;
		assertArrayEquals(arr1, Exercise1.char2bitArray('*'));
	}

	@Test
  void test_char2bitArray_2() {
    boolean[] arr1 = new boolean[16];
    arr1[9] = true;
    arr1[15] = true;
		assertArrayEquals(arr1, Exercise1.char2bitArray('A'));
  }

  @Test
	void test_bitArray2char_1() {
    boolean[] arr1 = new boolean[16];
    arr1[10] = true;
    arr1[12] = true;
    arr1[14] = true;
		assertEquals('*', Exercise1.bitArray2char(arr1));
	}

	@Test
  void test_bitArray2char_2() {
    boolean[] arr1 = new boolean[16];
    arr1[9] = true;
    arr1[15] = true;
		assertEquals('A', Exercise1.bitArray2char(arr1));
  }

  @Test
  void test_testCoding() {
		Exercise1.testCoding("Hello");
		assertEquals("Hello", baos.toString());
  }


  @Test
  void test_feedbackLfsr() {
    boolean[] arr1 = new boolean[4];
    arr1[2] = true;
    boolean[] arr2 = new boolean[4];
    arr2[0] = true;
    arr2[1] = true;
    arr2[3] = true;

		assertEquals(true, Exercise1.feedbackLfsr(arr1,arr2));
  }

  @Test
  void test_feedbackUpdateLfsr() {
    boolean[] arr1 = new boolean[4];
    arr1[2] = true;
    boolean[] arr2 = new boolean[4];
    arr2[0] = true;
    arr2[1] = true;
    arr2[3] = true;

		assertEquals(false, Exercise1.feedbackUpdateLfsr(arr1,arr2));
		assertEquals(false, Exercise1.feedbackUpdateLfsr(arr1,arr2));
		assertEquals(true, Exercise1.feedbackUpdateLfsr(arr1,arr2));
		assertEquals(false, Exercise1.feedbackUpdateLfsr(arr1,arr2));
		assertEquals(true, Exercise1.feedbackUpdateLfsr(arr1,arr2));
  }

  @Test
  void test_encodeCharLfsr() {
    boolean[] arr1 = new boolean[4];
    arr1[2] = true;
    boolean[] arr2 = new boolean[4];
    arr2[0] = true;
    arr2[1] = true;
    arr2[3] = true;
    boolean[] arr3 = new boolean[4];
    arr3[2] = true;

		assertEquals('*', Exercise1.encodeCharLfsr(Exercise1.encodeCharLfsr('*', arr1,arr2),arr3,arr2));
  }

  @Test
  void test_testLfsr() {
    boolean[] arr1 = new boolean[4];
    arr1[2] = true;
    boolean[] arr2 = new boolean[4];
    arr2[0] = true;
    arr2[1] = true;
    arr2[3] = true;
    Exercise1.testLfsr("Hello", arr1,arr2);
		assertEquals("Hello", baos.toString());
  }
}

