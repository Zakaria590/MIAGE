/**
 * 
 */
package production;

/**
 * @author EL HASSANI Younes
 *
 */
public class ProductionUnitTypeA extends ProductionUnit{
	protected int proocessedProducts=0;
	protected int availableResources=50;
	protected int duration =0;
	public ProductionUnitTypeA() {
		super();
	}
	@Override
	public void increaseProductionDuration(int d) {
		this.duration+=d;
		
	}

	@Override
	public void transformBy(ProductionUnit unit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int requiredResourceQuantity() {
		// TODO Auto-generated method stub
		return 20 ;
	}

	@Override
	public int getProductionDuration() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	protected void handleProductProcess(ManufacturedProducts mp) {
		// TODO Auto-generated method stub
		
	}

}
