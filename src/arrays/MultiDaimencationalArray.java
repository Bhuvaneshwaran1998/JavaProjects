package arrays;

public class MultiDaimencationalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// mutiDaimentonal array is not but array contains multipul arrays
		
		int nums[][]= {{2,4,6,7},{3,6,4,5},{2,3,3,4}};
		
		System.out.println(nums[0][0]);
		System.out.println(nums[0][1]);
		System.out.println(nums[0][2]);
		System.out.println(nums[1][0]);
		System.out.println(nums[1][1]);
		System.out.println(nums[1][2]);
		System.out.println(nums[1][3]);
		
		System.out.println(".................");
		
		for(int i=0; i<=2;i++) {
			
			for(int j=0; j<=3; j++) {
				
				System.out.print(nums[i][j]+ " ");
			}
			
			System.out.println();
		}
	
		System.out.println("...........Automatic...........");
		
		int n[][]=new int[4][4];
		
		for(int i=0; i<=3; i++) {
			
			for(int j=0; j<=3; j++) {
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("...........String............");
		
		String s[][]= {{"bhuvi","lolita","bhuvanesh","lalita"},{"love","friend","bestie","betterHafe"}};
		
		for(int i=0; i<=s.length-1; i++) {
			for(int j=0; j<=s.length-1; j++) {
				System.out.print(s[i][j]+ " ");
			}
			System.out.println();
		}
		

	}

}
