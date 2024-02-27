package Practice1;

public class CanadaTrafficRule implements CentralTraffic, ContinentalTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		CentralTraffic ct=new CanadaTrafficRule();
		ct.greenGo();
		ct.redStop();
		ct.yellowslow();
		
		CanadaTrafficRule c=new CanadaTrafficRule();
		c.Walkon();
		
		ContinentalTraffic t=new CanadaTrafficRule();
		t.TrainSignal();
	}
	
	
	
	public void Walkon()
	{
		System.out.println("White means walk on");
	}
	
	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green means to Go");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red means to Stop");
	}

	@Override
	public void yellowslow() {
		// TODO Auto-generated method stub
		System.out.println("Yellow means to Slow Down");
	}



	@Override
	public void TrainSignal() {
		// TODO Auto-generated method stub
		System.out.println("Check for Train signals");
	}
	
}
