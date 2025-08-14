package pkg_day8;


//Using synchronized to control access to shared resource

 class Counter {
	 
	 private int count = 0;
	 
	 //synchronized method to avoid race condition
	 
	 public synchronized void increament() {
		 count++;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
