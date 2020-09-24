package services;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author EL HASSANI Younes
 * Testing ServiceOne Functions
 */
public class isUsedByServiceOneTest {
	MockServiceOne ms1;
	ServiceUser user1;
	ServiceUser user2;
	@Before 
	public void init() {
		ms1 = new MockServiceOne();
	}
	
	@Test
	public void isUsedByServiceOneTestWhenOk() throws NotEnoughMoneyException {
		user1 = new ServiceUser(10);
		ms1.isUsedBy(user1);
		assertEquals(5,user1.getMoney());//VRAI 10-5 =5
		assertTrue(ms1.getNumberOfUse()==1);
	}
	@Test (expected = NotEnoughMoneyException.class)
	public void isUsedByServiceOneTestWhenNotOk() throws NotEnoughMoneyException{
		user2 = new ServiceUser(1);
		ms1.isUsedBy(user2);
		assertFalse(user2.getMoney()==(user2.getMoney()-ms1.cost()));
		assertEquals(ms1.getNumberOfUse(),0);
	}
}
