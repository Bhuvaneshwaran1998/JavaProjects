package oopsInharitance;

//it accept more class

class BasicMobile{
	public String call(String name, int number) {
		return name+number;
	}
	
}

class AdMobile extends BasicMobile{
	public String games(String name, String userdId) {
		return name+userdId;
	}
}

class SmartMobile extends AdMobile{
	public String lotOfApps(String name, int password) {
		return name+password;
	}
}

public class MultiMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartMobile sm=new SmartMobile();
	    String	basicMobile=sm.call("Bhuvi", 950040);
		String adMobiles =sm.lotOfApps("App Name", 12345);
		System.out.println(adMobiles);

	}

}
