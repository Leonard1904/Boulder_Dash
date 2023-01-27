package Main;
import Contract.IView;
import View.ViewPanel;

/**
 * Classe de démarrage de l'application
 * @author KAMDEM KAMDEM JOSEPH LEONARD
 *@see Ivew
 *
 */


public class Main implements IView{
	
	ViewPanel panel = new ViewPanel();
	
	/**
	 * La méthode main est statique, elle est chargée en mémoire
	 * au démarrage de l'application et peut donc être utlilisée avant
	 * la création de tout objet
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		IView.Iview();
        
    }
}

