package com.github.it115_Brambory.Semestralni_prace_APZS.logika;

import java.util.Map;

import com.github.it115_Brambory.Semestralni_prace_APZS.logika.*;

public class BuddyAplikace implements IBuddyAplikace {
	
	private boolean konecBuddyAplikace = false;
	private Map<Integer, Buddy> seznamBuddy;
	private Map<Integer, Exchange> seznamExchange;
	private Map<Integer, Admin> seznamAdminu;
	private Map<Integer, Akce> seznamAkci;
	private Map<Integer, Request> seznamRequestu;
	private Map<Integer, VztahStudentu> seznamVztahuStudentu;
	private Uzivatel aktualniUzivatel;
	
	/**
     *  Konstruktor buddyAplikace. Načte data z databáze do patřičných seznamů
     *  
     */
	public BuddyAplikace() {
		// TODO načíst data z databáze
	}
	
	public boolean ulozData() {
		//když proběhlo uložení dobře
		if (true){
		//uložit všechna data do databáze
		//bude se tak dít po stisknutní tlačítka "uložit", nebo před koncem aplikace, kdy se
		//ve vyskakovacím okně zeptáme uživatele, zda si přeje uložit.
	}
		return false;
	}
	//----------------------------------------------------------------------------
	//Metody pro práci s daty z tabulek
	//----------------------------------------------------------------------------
	//Obecné metody
	public boolean logIn(String email, String heslo){
		
		if (kontrolaPritomnostiAdmina(seznamAdminu, email, heslo)) {//když je email v tabulce admin tak zkontroluj heslo a pak nastav aktualniho uzivatele a access
			//TODO
			return true;
		}else if (kontrolaPritomnostiExchange(seznamExchange, email, heslo)) {//když je email v tabulce buddy tak zkontroluj heslo a pak nastav aktualniho uzivatele a access
			//TODO
			return true;
		}else if (kontrolaPritomnostiBuddy(seznamBuddy, email, heslo)) {//když je email v tabulce exchange tak zkontroluj heslo a pak nastav aktualniho uzivatele a access
			//TODO
			return true;
		}else {
			return false;
		}
	}
	public boolean kontrolaPritomnostiAdmina(Map<Integer, Admin> tabulka, String email, String heslo) {
		//TODO
		//if (je v tabulce && se shoduje heslo)
		//tak return true;
		return false;
	}
	public boolean kontrolaPritomnostiExchange(Map<Integer, Exchange> tabulka, String email, String heslo) {
		//TODO
		//if (je v tabulce && se shoduje heslo)
		//tak return true;
		return false;
	}
	public boolean kontrolaPritomnostiBuddy(Map<Integer, Buddy> tabulka, String email, String heslo) {
		//TODO
		//if (je v tabulce && se shoduje heslo)
		//tak return true;
		return false;
	}
	
	public boolean logOut(){
		//TODO
		//dotaz na uložení
		return true;
	}
	
	//getter na aktualne prihlaseneho uzivatele, v UI se pak schvaluje akce
	public Uzivatel getAktualniUzivatel() {
		return aktualniUzivatel;
	}
	//Metody pro Studenta
	//přehled akcí - getter, zpráva pro admina - getter
	public Map<Integer, Request> getSeznamRequestu() {
		return seznamRequestu;
	}
	public Map<Integer, Akce> getSeznamAkci() {
		return seznamAkci;
	}
	
	//Metody pro admina
	public Map<Integer, Buddy> getSeznamBuddy() {
		return seznamBuddy;
	}
	public Map<Integer, Exchange> getSeznamExchange() {
		return seznamExchange;
	}
	
	//----------------------------------------------------------------------------
	//----------------------------------------------------------------------------
	/**
     *  Nastaví, že je konec aplikace,
     *  mohou ji použít i další implementace rozhraní ?asi?snad? IBuddyAplikace.
     *  
     *  @param  konecBuddyAplikace hodnota false = konec aplikace, true = aplikace pokračuje
     */
    void setKonecBuddyAplikace(boolean konecBuddyAplikace) {
        this.konecBuddyAplikace = konecBuddyAplikace;
    }
	
    /**
     *  Tento getter je asi k ničemu :D, ale kdyby náhodou :D
     */
	@Override
	public BuddyAplikace getBuddyAplikace() {
		return this;
	}

	//tohle asi pak dát do observera kvůli konci programu. Před koncem vyskočí okno, že uložit
	@Override
	public boolean konecBuddyAplikace() {
		return konecBuddyAplikace;
	}

}
