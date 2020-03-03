package observerPush;

import java.util.ArrayList;

/**
 * Klasse zur sammlung von Sprechstunden (Liste) + Subject
 */
public class SprechstundenListe implements Subject {

	private ArrayList<Observer> observers;

	private ArrayList<Sprechstunde> list;

	public SprechstundenListe() {
		this.observers = new ArrayList<>();
		this.list = new ArrayList<>();
	}

	/**
	 * Fügt eine neue Sprechstunde hinzu
	 * @param stunde Die Sprechstunde zum hinzufügen
	 */
	public void addSprechstunde(Sprechstunde stunde) {
		this.list.add(stunde);
	}

	/**
	 * Löscht eine Sprechstunde aus der liste
	 * @param stunde Die Sprechstunde die entfernt werden soll
	 */
	public void removeSprechstunde(Sprechstunde stunde) {
		this.list.remove(stunde);
	}

	/**
	 * @see Subject#attach(Observer)
	 */
	public void attach(Observer observer) {
		this.observers.add(observer);
	}

	/**
	 * @see Subject#remove(Observer)
	 */
	public void remove(Observer observer) {
		this.observers.remove(observer);
	}

	/**
	 * @see Subject#sendUpdate()
	 */
	public void sendUpdate() {
		for(Observer observer : observers) {
			observer.update(this);
		}
	}

	/**
	 * getter für die Sprechstunden Liste
	 * @return Die Liste der sprechstunden
	 */
	public ArrayList<Sprechstunde> getList() {
		return list;
	}
}
