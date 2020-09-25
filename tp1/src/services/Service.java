package services;

public abstract class Service {
	private int nbUse;
	public Service() {
		
	}
	public abstract int cost();
	public abstract void execute();
	public int getNumberOfUse() {
		return this.nbUse;
	}
	public void isUsedBy(ServiceUser user) throws NotEnoughMoneyException{
		if(user.getMoney()>=this.cost()) {
			user.decreaseMoney(this.cost());
			this.nbUse+=1;
		}else {
			throw new NotEnoughMoneyException(":/...");
		}
	}
}
