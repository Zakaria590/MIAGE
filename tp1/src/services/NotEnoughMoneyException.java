package services;

public class NotEnoughMoneyException extends Exception {
	public NotEnoughMoneyException(String msg) {
		super(msg);
	}
	
	public NotEnoughMoneyException() {
		super();
	}
}
