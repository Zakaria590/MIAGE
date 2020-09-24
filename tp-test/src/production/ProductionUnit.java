package production;

/**
 * @author EL HASSANI Younes
 * This class implements an interface (ManufacturedProducts)
 * It basically manipulating the Products 
 */

public abstract class ProductionUnit implements ManufacturedProducts{
	protected int proocessedProducts;
	protected int availableResources;
	public ProductionUnit() {}
	public abstract int getProductionDuration();
	protected abstract void handleProductProcess(ManufacturedProducts mp);
	/**
	 * @return current AvailableResources (int)
	 */
	public int getAvailableResources() {
		return this.availableResources;
	}
	/**
	 * @return Current porcessed products (int)
	 */
	public int getNbProcessedProducts() {
		return this.proocessedProducts;
	}
	/**
	 * @param n (int) available resources to add to the current number
	 */
	public void addAvailableResources(int n) {
		this.availableResources+=n;
	}
	/**
	 * @param mp (ManufacturedProcuts) a product
	 * @throws ProductionProblemException (Exception) if the products has not the required resources
	 */
	public void process(ManufacturedProducts mp) throws ProductionProblemException{
		if(this.availableResources<mp.requiredResourceQuantity()) {
			throw new ProductionProblemException();
		}else {
			this.availableResources=mp.requiredResourceQuantity()-this.availableResources;
			mp.increaseProductionDuration(this.requiredResourceQuantity());
		}
	}
	
	/**
	 * @param mp (ManufacturedProducts) 
	 */
	public void operate(ManufacturedProducts mp) {
		try{
			this.process(mp);
			this.proocessedProducts+=1;
		}
		catch(ProductionProblemException e) {
			System.out.println("Not Enough Resources :/ ...");
		}
	}
	
}
