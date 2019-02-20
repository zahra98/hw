package hw;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyTest {

	@Test
	 public void count() {
	
	assertTrue(0 == add.books.size()) ;

}
	@Test
	public void testadd() {
		
		
		add.addBook( 127,"java", 1);
		assertTrue(1==add.books.size()) ;
		assertTrue(127 == add.books.get(0).price) ;

	}
	@Test
	public void testAddBook2() {
	
		
		add.addBook(100,"java", 1);
		
		assertTrue(2==add.books.size()) ;
		assertTrue(227 == add.getcount()) ;
		
	}
}
