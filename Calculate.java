public class Calculate {

	public static void calc(long first, long second, String operation) {
		double rezult = 0;
		if (operation .equals("+")) 
			rezult = first + second;
		else if (operation .equals("-"))
			rezult = first - second;
		else if (operation .equals("*"))
			rezult = first * second;
		else if (operation .equals(":") || operation .equals("/"))
			rezult = (double)first / second;
		else if (operation .equals("^"))
			rezult = Math.pow(first, second);
 				
		System.out.println(first + " " + operation + " " + second + " = " + rezult);   
	} 
	public static void calc(double first, double second, String operation) {
		double rezult = 0;
		if (operation .equals("+")) 
			rezult = first + second;
		else if (operation .equals("-"))
			rezult = first - second;
		else if (operation .equals("*"))
			rezult = first * second;
		else if (operation .equals(":") || operation .equals("/"))
			rezult = first / second;
		else if (operation .equals("^"))
			rezult = Math.pow(first, second);
 				
		System.out.println(first + " " + operation + " " + second + " = " + rezult);  
	} 

	public static void main(String[] arg) {
		System.out.println("Calculate...");
                String operation = String.valueOf(arg[1]);

		if (arg[0].indexOf(".") >= 0 || arg[2].indexOf(".") >= 0) {
			double first = Double.valueOf(arg[0]);
			double second = Double.valueOf(arg[2]);
			calc(first, second, operation);
		}
		else	{
			long first = Long.valueOf(arg[0]);
			long second = Long.valueOf(arg[2]);
			calc(first, second, operation);
		}
    }

}