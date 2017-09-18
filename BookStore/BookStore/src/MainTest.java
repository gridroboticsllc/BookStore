package src;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Test;
public class MainTest {

	@Test
	public void testMain1() {
		Main Obj = new Main();
		Obj.initialBookPrice = 50;
		Obj.discountPrice = 4;//Obj.inputReader("Discount Price");
		Obj.basePrice= 25;// Obj.inputReader("Base Price");
		Obj.budget= 300;//Obj.inputReader("Budget");
	    assertEquals(" 8 books, $9 remaining",Obj.offerFunction());
	    
	}
	
	@Test 
	public void testMain2() {
		Main Obj = new Main();
		Obj.initialBookPrice = 50;
		Obj.discountPrice = 40;
		Obj.basePrice= 25;
		Obj.budget= 300;
	    assertEquals(" 11 books, $0 remaining",Obj.offerFunction());
	}

}
