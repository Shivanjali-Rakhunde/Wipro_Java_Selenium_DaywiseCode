package pkg_day4;




public class Main {
	
	public static void main(String[] args) {
		
		Order physicalOrder = new PhysicalProductOrder("10058");
		physicalOrder.process_order();
		physicalOrder.print_order_summary();
		System.out.println();
		
		Order digitalOrder = new DigitalProductOrder("20065");
		digitalOrder.process_order();
		digitalOrder.print_order_summary();
		System.out.println();
		
		Order serviceOrder = new ServiceOrder("30042");
		serviceOrder.process_order();
		serviceOrder.print_order_summary();
		System.out.println();
		
		
		
		
		
		
	}

}
