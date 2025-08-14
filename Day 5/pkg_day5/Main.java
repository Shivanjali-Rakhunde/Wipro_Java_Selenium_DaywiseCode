package pkg_day5;

public class Main {

	public static void main(String[] args) {
	    
		InterestCalculator interest = new InterestCalculator() {
			public double calculate(double principal, double rate, double time) {
				return (principal*rate*time)/100;
			}
		};
		
		EMICalculator emi = new EMICalculator() {
            public double calculate(double principal, double annualRate, int months) {
                double monthlyRate = annualRate / (12 * 100);
                return (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) /
                       (Math.pow(1 + monthlyRate, months) - 1);
            }
        };
        
        
        CurrencyConverter converter = new CurrencyConverter() {
            public double convert(double inrAmount) {
                double usdRate = 0.012; // I1 INR = 0.012 USD
                return inrAmount * usdRate;
            }
        };
		
		System.out.println("Simple Interest : Rs." + interest.calculate(20000, 7, 3));
		System.out.println("Loan EMI: Rs." + emi.calculate(70000, 8.5, 50));
		System.out.println("INR to USD: $"+ converter.convert(20000));

	}

}
