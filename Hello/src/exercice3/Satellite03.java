package exercice3;

public class Satellite03 {
		private int masse;
		private int vitesse;	
		public String nom;
		Satellite03(Double ma,Double vi,String nm){
			this.masse=ma.intValue();
			this.vitesse=vi.intValue();
			this.nom=nm;
		}
		public void impulsion(Double force,Double duree) {
			double res=(force*duree)/masse;
			System.out.println("l'impulsion du sattelite est : "+res);
		}
		public double energie() {
			double en=this.masse*this.vitesse*this.vitesse/2;
			return en;
		}
		public static void main(String[] args) {
			Satellite03 test = new Satellite03(20.5,3.3,"lol");
			test.impulsion(100.0,25.0);
			double res=test.energie();
			System.out.println("l'energie est :"+res);
		}
		
}


