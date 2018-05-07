package com.github.it115_Brambory.Semestralni_prace_APZS.ui;

import com.github.it115_Brambory.Semestralni_prace_APZS.logika.*;

import java.util.Observer;
import java.util.Observable;
import javafx.scene.layout.GridPane;

/**
 * Kontroler, který zprostředkovává komunikaci mezi grafikou
 * a logikou adventury (měl by... :D )
 * 
 * @author Filip Vencovsky, Libor Zíka
 *
 */
public class HomeController extends GridPane implements Observer {
	
	private IBuddyAplikace buddyAplikace;
	
	/**
     *  Metoda k inicializaci hry. Načte všechny potřebné prvky
     *  GUI a přidá observery.
     */
	public void inicializuj(IBuddyAplikace buddyAplikace) {
		//ToDo
		this.buddyAplikace = buddyAplikace;
		//ToDo
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
	
}
