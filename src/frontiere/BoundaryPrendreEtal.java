package frontiere;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		boolean nomVendeurConnu = controlPrendreEtal.verifierIdentite(nomVendeur);
		if(!nomVendeurConnu) {
			System.out.println("je suis désolée " + nomVendeur + " mais il faut être un habitant de notre village pour commencer ici");
		}else {
			System.out.println("Bonjour " + nomVendeur + " ,je vais regarder si je peux vous trouver un étal");
			boolean etalDisponible = controlPrendreEtal.resteEtals();
			if(!etalDisponible) {
				System.out.println("Désolée "+ nomVendeur + " je n'ai plus d'étal qui ne soit pas déja occupé.");
			}else {
				installerVendeur(nomVendeur);
			}
		}
	}

	private void installerVendeur(String nomVendeur) {
		System.out.println("C'est parfait, il me reste un étal pour vous !");
		System.out.println("Il me faudrait quelques renseignements.");
		System.out.println("Quel produit souhaitez-vous vendre ?");
		String produit = "";
		Clavier.entrerEntier(String.valueOf(produit));
		System.out.println("Combien souhaitez-vous en vendre ?");
		int nbProduit = 0;
		Clavier.entrerEntier(String.valueOf(nbProduit));
		int numeroEtal = controlPrendreEtal.prendreEtal(nomVendeur, produit, nbProduit);
		if(numeroEtal != 1) {
			System.out.println("Le Vendeur " + nomVendeur + " s'est installé a l'étal n°" + numeroEtal );
		}
	}
}
