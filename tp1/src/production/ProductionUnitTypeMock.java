package production;

/**
 * @author EL HASSANI Younes
 * A ProductionUnit of type MOCK (example of manipulation)
 */
public class ProductionUnitTypeMock extends ProductionUnit{
	protected int proocessedProducts=0;
	protected int availableResources=50;
	protected int duration =0;
	public ProductionUnitTypeMock() {
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
		return 25;
	}

	@Override
	public int getProductionDuration() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	protected void handleProductProcess(ManufacturedProducts mp) {
		// TODO Auto-generated method stub
		
	}
}
