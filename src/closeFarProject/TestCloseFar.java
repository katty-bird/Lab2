package closeFarProject;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class TestCloseFar {
	
	@Test
	public void test1() {
		assertEquals(false, CloseFar.calculateCloseFar(1,2,3));
	}
	
	@Test
	public void test2() {
		assertEquals(false, CloseFar.calculateCloseFar(8,9,7));
	}
	
	@Test
	public void test3() {
		assertEquals(true, CloseFar.calculateCloseFar(1,2,10));
	}
	
	@Test
	public void test4() {
		assertEquals(true, CloseFar.calculateCloseFar(4,1,3));
	}
	
	@Test
	public void test5() {
		assertEquals(true, CloseFar.calculateCloseFar(-1,10,0));
	}
	
	@Test
	public void test6() {
		assertEquals(false, CloseFar.calculateCloseFar(10,8,9));
	}
	
	@Test
	public void test7() {
		assertEquals(false, CloseFar.calculateCloseFar(8,9,7));
	}	
}
