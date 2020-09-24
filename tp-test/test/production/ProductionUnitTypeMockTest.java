/**
 * 
 */
package production;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author EL HASSANI Younes
 *
 */
public class ProductionUnitTypeMockTest {
	static ProductionUnitTypeMock mp;
	static ProductionUnitTypeMock mpp;
	static ProductionUnitTypeA mpa;
	static ProductionUnitTypeB mpb;
	@Before
	public void init() {
		mpp = new ProductionUnitTypeMock();
		mp = new ProductionUnitTypeMock();
		mpb = new ProductionUnitTypeB();
		mpa = new ProductionUnitTypeA();
	}

	@Test
	public void ProductionUnitTypeMockTestOperateWhenOk() {
		mpp.operate(mpa);
		assertFalse(mpp.getAvailableResources()==30);
		assertNotEquals(mpp.getProductionDuration(),0);
		assertFalse(mp.getNbProcessedProducts()==1);
	}
	
	
	@Test (expected = ProductionProblemException.class)
	public void ProductionUnitTypeMockTestProcessWhenNotOk() throws ProductionProblemException {
		mp.process(mpb);
		assertTrue(mp.getAvailableResources()==30);
		assertEquals(mp.getProductionDuration(),0);
		assertFalse(mp.getNbProcessedProducts()==1);
	}

}
