package variables;

public class ManipulationVariables {

	public static void main(String[] args) {

		int epargne = 500;
		int revenus = 2000;

		epargne += 100;

		revenus -= 50;

		int nombreDeJoursEpargne = (5000 - revenus) / 500;

		revenus = revenus + (30 - 10) * 7;

		System.out.println("Epargne = " + epargne);
		System.out.println("Revenus = " + revenus);
	}

}
