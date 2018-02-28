package q2;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.lang.Math;
class CarPaymentTest {

	@Test
	void test() 
	
	{
		CarPayment test=new CarPayment(35000,0,60,.1);
		Assertions.assertEquals(743.65, Math.round(100.0*test.monthly())/100.0);
		Assertions.assertEquals(9,618.79, Math.round(100.0*test.totalInterest())/100.);
	}

}
