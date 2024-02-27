package Inheritance;

public class ChildClass extends ParentClass{

	public void Engine()
	{
		System.out.println("New engine code");
	}
	public void clr()
	{
		System.out.println(clr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildClass cd=new ChildClass();
		cd.clr();
		cd.Brakes();
		cd.Gear();
		cd.Engine();
	}

}
