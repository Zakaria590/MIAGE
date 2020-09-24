package production;

/**
 * @author EL HASSANI Younes
 * Interface implemented by ProductionUnit
 */
public interface ManufacturedProducts {
	public int getProductionDuration();
	public void increaseProductionDuration(int d);
	public void transformBy(ProductionUnit unit);
	public int requiredResourceQuantity();
}
