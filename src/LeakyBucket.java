public class LeakyBucket {

	public static void main(String[] args) {
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.println("Enter the number of time intervals");
		int n = scanner.nextInt();
		
		int [] t = new int[n];
		System.out.println("Enter the time intervals");
		
		for(int i = 0; i < n; i++) 
			t[i] = scanner.nextInt();
		
		System.out.println("Enter the packet inter-arrival time");
		int i = scanner.nextInt();
		
		System.out.println("Enter the burstiness in traffic");
		int l = scanner.nextInt();
		
		int x1, x = 0, lct = t[0];
		for(int j = 0; j < n; j++) {
			x1 = x - (t[j] - lct);
			
			if(x1 > l) {
				System.out.println("At time t = " + t[j] + " the packet is non-confirming!");
			}
			else {
				x = x1 + i;
				lct = t[j];
				System.out.println("At time t = " + t[j] + " the packet is confirming, so bucket size = " + x);
			}
		}
			
		scanner.close();
	}

}
