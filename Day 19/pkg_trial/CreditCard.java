package pkg_trial;



class CreditCardPayment {
	
    public void makePayment(double amount) {
			System.out.println("Credit card payment of $ "+amount+" processsed.");
		}
	}
	
	class PayPalPayment{
		public void makePayment(double amount) {
			System.out.println("PayPal payment of $ "+amount+ "processed.");
		}
	
		
	
		

	}
public class CreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreditCardPayment creditCard = new CreditCardPayment();
		PayPalPayment payPal = new PayPalPayment();
		
		creditCard.makePayment(1000);
		payPal.makePayment(2000);

	}

}
