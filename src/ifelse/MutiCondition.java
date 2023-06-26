package ifelse;

public class MutiCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bhuviAge=24;
		int lolitaAge=25;
		int marriageAge =27;
		
		if(marriageAge<lolitaAge && marriageAge<bhuviAge ) {
			System.out.println("ready to marriage age");
		}
		else if(marriageAge>lolitaAge && marriageAge>bhuviAge) {
			System.out.println("not ready to marriage");
		}
		else
			System.out.println("no marriage");

	}

}
