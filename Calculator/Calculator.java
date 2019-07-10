
public class Calculator{
	
	int num1 = 0, num2 = 0, val = 0;

	public static void main(String[] args){
		Calculator c = new Calculator();
		Calculator.Adder add1 = c.new Adder(2.5,3);

	}

	class Adder{
		public Adder(){
			System.out.println(add());
		}

		public Adder(int num1, int num2){
			System.out.println(add(num1, num2));
		}

		public Adder(double num1, double num2){
			System.out.println(add(num1, num2));
		}

		int add(){
			return num1 + num2;
		}

		int add(int num1, int num2){
			return num1 + num2;
		}

		double add(double num1, double num2){
			return num1 + num2;
		}
	}

	class Subtractor{
		public Subtractor(){
			System.out.println(subtract());
		}

		public Subtractor(int num1, int num2){
			System.out.println(subtract(num1, num2));
		}

		public Subtractor(double num1, double num2){
			System.out.println(subtract(num1, num2));
		}

		int subtract(){
			return num1 - num2;
		}

		int subtract(int num1, int num2){
			return num1 - num2;
		}

		double subtract(double num1, double num2){
			return num1 - num2;
		}
	}

	class Multiplier{
		public Multiplier(){
			System.out.println(multiply());
		}

		public Multiplier(int num1, int num2){
			System.out.println(multiply(num1, num2));
		}

		public Multiplier(double num1, double num2){
			System.out.println(multiply(num1, num2));
		}

		int multiply(){
			return num1 * num2;
		}

		int multiply(int num1, int num2){
			return num1 * num2;
		}

		double multiply(double num1, double num2){
			return num1 * num2;
		}
	}

	/*class Divider{

	}*/



}