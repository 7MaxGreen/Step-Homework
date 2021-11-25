public class IteratingInts {
	
	public static void main(String[] args) {
		
		int num = 200; int j;
		
		for(int i = 1; i <= num; i++) {
			
			j = 0;
			
			while(j < i) {
				
				System.out.print(i);
				
				j++;
			}
			
			System.out.println();
		}
	}
}