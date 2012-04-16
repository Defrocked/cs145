package pre3;

import java.util.Stack;

public class PostOps {

	public static void main(String[] args) {


	}

	public static boolean contains(String[] haystack, String Needle) {
		// searches for a string in the array, true if found
		for (int i = 0; i < haystack.length; i++) {
			if (Needle.equals(haystack[i])) {
				return true;
			}
		}
		return false;
	}

	public static double evaluate(String expression) {
		//uses a stack to keep track of things because the array thing i tried before failed miserably, returns a double of the evaluated expression
		String[] array = expression.split(" ");
		String[] functions = new String[7];
		functions[0] = "+";
		functions[1] = "-";
		functions[2] = "*";
		functions[3] = "/";
		functions[4] = "cos";
		functions[5] = "sin";
		functions[6] = "tan";
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double converted = 0.0;
		Stack<Double> operands = new Stack<Double>();
		for (int i = 0; i < array.length; i++) {
			if (!contains(functions, array[i])) {
				converted = Double.parseDouble(array[i]);
				operands.push(converted);
			} else {
				if (array[i].equals("+")) {
					b = operands.pop();
					a = operands.pop();
					c = a + b;
					operands.push(c);
				} else if (array[i].equals("-")) {
					b = operands.pop();
					a = operands.pop();
					c = a - b;
					operands.push(c);
				} else if (array[i].equals("*")) {
					b = operands.pop();
					a = operands.pop();
					c = a * b;
					operands.push(c);
				} else if (array[i].equals("/")) {
					b = operands.pop();
					a = operands.pop();
					c = a / b;
					operands.push(c);
				} else if (array[i].equals("sin")) {
					b = operands.pop();
					c = Math.sin(b);
					operands.push(c);
				} else if (array[i].equals("cos")) {
					b = operands.pop();
					c = Math.cos(b);
					operands.push(c);
				} else if (array[i].equals("tan")) {
					b = operands.pop();
					c = Math.tan(b);
					operands.push(c);
				}
			}
		}
		return operands.pop().doubleValue();
	}

	public static double[] evaluate(String[] expression) {
		// evaluates individual expressions within an array and returns those
		// results in a new array
		double[] temp = new double[expression.length];
		for (int i = 0; i < expression.length; i++) {
			temp[i] = evaluate(expression[i]);
		}
		return temp;
	}
}
