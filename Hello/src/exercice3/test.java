package exercice3;

public class test {

	public static void main(String[] args) {
		Satellite03 t= new Satellite03(20.5,3.3,"lol");
		t.impulsion(101.0,25.0);
		double res=t.energie();
		System.out.println("l'energie est :"+res);
	}

	}

 

