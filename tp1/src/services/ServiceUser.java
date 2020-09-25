package services;

public class ServiceUser {
	private int money;
	public ServiceUser(int m) {
		this.money = m;
	}
	public int getMoney() {
		return this.money;
	}
	public void decreaseMoney(int n) {
		this.money-=n;
	}
}
