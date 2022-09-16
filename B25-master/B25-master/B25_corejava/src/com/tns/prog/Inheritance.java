package first_program;
class withdraw //base class
{
	int amt_withdraw = 2000;
}

public class Inheritance extends withdraw{ //child class
	int amt_left = 6000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance obj = new Inheritance(); // always create an object of child class
		System.out.println("amount_withdraw"+obj.amt_withdraw);

	}

}