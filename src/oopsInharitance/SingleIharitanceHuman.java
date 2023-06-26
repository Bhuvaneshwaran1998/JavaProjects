package oopsInharitance;

    // inharitance is a relationship
    // like parent and child relation Ship

    //different types Single, multi, multiple, hybrid Inharitence

class GreandHuman{
	
	public String landDetils(String land, int price) {
		return land+price;
	}
	
	public String parpertie(String store, int price) {
		return store+price;
	}
	
	
}

class Dad extends GreandHuman {
	public String job(String job, int salary) {
		return job+salary;
	}
}

public class SingleIharitanceHuman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Dad d=new Dad();
		//String g1=g.
		System.out.println(d.landDetils("5000 feats", 500000));
		System.out.println(d.job("Army", 70000));
	}

}
