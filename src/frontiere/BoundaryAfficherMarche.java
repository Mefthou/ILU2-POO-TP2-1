package frontiere;

import controleur.ControlAfficherMarche;

public class BoundaryAfficherMarche {
	private ControlAfficherMarche controlAfficherMarche;

	public BoundaryAfficherMarche(ControlAfficherMarche controlAfficherMarche) {
		this.controlAfficherMarche = controlAfficherMarche;
	}

	public void afficherMarche(String nomAcheteur) {
		String[] infosMarcher = controlAfficherMarche.donnerInfosMarche();
		if(infosMarcher.length == 0) {
			System.out.println("Le marche est vide, revenez plus tard");
		}else {
			System.out.println(nomAcheteur + ",vous trouverez au marche");
			for(int i=0, j=0; i< infosMarcher.length; i++){
				String vendeur = infosMarcher[j];
				j++;
				String quantite = infosMarcher[j];
				j++;
				String produit = infosMarcher[j];
				System.out.println("-"+ vendeur + " qui vend " + quantite + " " + produit);
			}
		}
	}
}
