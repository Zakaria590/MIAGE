package services;

public class MockServiceOne extends Service{
	public static final int COUT = 5;
	private int nbUse = super.getNumberOfUse();
	public MockServiceOne() {
		super();
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return COUT;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.nbUse+=1;
		
		
	}

}
