package services;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class isUsedByServiceTwoTest {
	MockServiceTwo ms2;
	ServiceUser user1;
	ServiceUser user2;
	@Before 
	public void init() {
		ms2 = new MockServiceTwo();
	}
	
	@Test
	public void isUsedByServiceOneTestWhenOk() throws NotEnoughMoneyException {
		user1 = new ServiceUser(20);
		ms2.isUsedBy(user1);
		assertEquals(0,user1.getMoney());//VRAI 20-20=0
		assertTrue(ms2.getNumberOfUse()==1);
	}
	@Test (expected = NotEnoughMoneyException.class)
	public void isUsedByServiceOneTestWhenNotOk() throws NotEnoughMoneyException{
		user2 = new ServiceUser(1);
		ms2.isUsedBy(user2);
		assertFalse(user2.getMoney()==(user2.getMoney()-ms2.cost()));
		assertEquals(ms2.getNumberOfUse(),0);
	}
}
