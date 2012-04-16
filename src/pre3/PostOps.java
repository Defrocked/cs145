package pre3;


public class PostOps {

	public static void main(String[] args) {

//		System.out.println(Math.sin(5));
//		System.out.println(evaluate("5 sin"));
//		System.out.println("");
//		System.out.println(Math.cos(0.57));
//		System.out.println(evaluate("0.57 cos"));
//		System.out.println("");
//		System.out.println(Math.tan(2));
//		System.out.println(evaluate("2 tan"));
//		System.out.println("");
//		System.out.println(Math.sin(-3));
//		System.out.println(evaluate("-3 sin"));
//		System.out.println("");
//		System.out.println(Math.cos(-3));
//		System.out.println(evaluate("-3 cos"));
//		System.out.println("");
//		System.out.println(Math.tan(-3));
//		System.out.println(evaluate("-3 tan"));
//		System.out.println("");
		System.out.println((5 + 7) );
		System.out.println(evaluate("5 7 + 3 8 * -"));
		System.out.println("");
		//5 7 + 3 8 * -
//		System.out.println(5);
//		System.out.println(evaluate("5"));
//		System.out.println("");
//		System.out.println(5 + 6);
//		System.out.println(evaluate("5 6 +"));
//		System.out.println("");
//		System.out.println(-3 - -4);
//		System.out.println(evaluate("-3 -4 -"));
//		System.out.println("");
//		System.out.println(0 * 100);
//		System.out.println(evaluate("0 100 *"));
//		System.out.println("");
//		System.out.println(2 + 8 );
//		System.out.println(evaluate("2 8 +"));
//		System.out.println("");
//		System.out.println(26 / 13);
//		System.out.println(evaluate("26 13 /"));
//		System.out.println("");
	}
	
	public static boolean contains(String[] haystack, String Needle){
		//searches for a string in the array, true if found
		for(int i = 0; i < haystack.length; i++){
			if (Needle.equals(haystack[i])){
				return true;
			}
		}
		return false;
	}
	
	public static double evaluate(String expression){
		String[] array = expression.split(" ");
		double[] operands = new double[array.length];
		String[] functions = new String[7];
		functions[0] = "+";
		functions[1] = "-";
		functions[2] = "*";
		functions[3] = "/";
		functions[4] = "cos";
		functions[5] = "sin";
		functions[6] = "tan";
		double converted = 0.0;
		double a = 0.0;
		double b = 0.0;
		for(int i = 0; i < array.length; i++){
			if (!contains(functions, array[i])){
				converted = Double.parseDouble(array[i]);
				operands[i] = converted;
			} else {

				if (array[i].equals("+")){
					b = operands[i - 1];
					a = operands[i - 2];
					operands[i - 2] = a + b;
					operands[i - 1] = 0.0;
				}else if (array[i].equals("-")){
					b = operands[i - 1];
					a = operands[i - 2];
					operands[i - 2] = a - b;
					operands[i - 1] = 0.0;
				}else if (array[i].equals("*")){
					b = operands[i - 1];
					a = operands[i - 2];
					operands[i - 2] = a * b;
					operands[i - 1] = 0.0;
				}else if (array[i].equals("/")){
					b = operands[i - 1];
					a = operands[i - 2];
					operands[i - 2] = a / b;
					operands[i - 1] = 0.0;
				}else if (array[i].equals("sin")){
					b = operands[i - 1];
					operands[i - 1] = Math.sin(b);
					operands[i - 1] = 0.0;
				}else if (array[i].equals("cos")){
					b = operands[i - 1];
					operands[i - 1] = Math.cos(b);
					operands[i - 1] = 0.0;
				}else {
					b = operands[i - 1];
					operands[i - 1] = Math.tan(b);
					operands[i - 1] = 0.0;
				}
				
			}
		}
		return operands[0];
	}
	
	public static double[] evaluate(String[] expression){
		
		
		return null;
	}
}
