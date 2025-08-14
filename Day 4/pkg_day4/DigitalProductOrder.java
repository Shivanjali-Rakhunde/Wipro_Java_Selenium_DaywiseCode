package pkg_day4;

 class DigitalProductOrder extends Order {

	public DigitalProductOrder(String order_id) {
		super(order_id);
		
	}

	@Override
	public void process_order() {
		System.out.println("Sending download link for order "+ order_id + ".");
		
	}

}
