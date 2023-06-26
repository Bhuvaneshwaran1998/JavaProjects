package forLoop;

public class MaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7};
		int temp=0;
		int count=0;
		for(int i=0; i<=a.length-1; i++) {
			
			for(int j=i+1; j<=a.length-1; j++) {
				
				if(a[i]>a[j]) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		//return temp[];
		System.out.println(a);

	}

}
