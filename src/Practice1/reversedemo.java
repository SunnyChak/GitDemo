package Practice1;

public class reversedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s=new String("sunny");
		String d=new String("");
		String r=new String("");
		for(int i=s.length()-1; i>=0; i--)
		{
			//System.out.println(s.charAt(i));
			d=d + s.charAt(i);
		}
			System.out.println(d);
			System.out.println(s);
		
		//for(int i=s.length(); i>=0; i++)
		//{
			//r=r + s.charAt(i);
		//}
		//System.out.println(r);
		
		if(s.equals(d))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
		
		
	}

}
