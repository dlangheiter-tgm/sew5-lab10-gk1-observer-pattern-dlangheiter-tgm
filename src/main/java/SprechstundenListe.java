import java.util.ArrayList;

public class SprechstundenListe implements Subject {

	private ArrayList<Observer> observers;

	private ArrayList<Sprechstunde> list;

	public void addSprechstunde(Sprechstunde stunde) {
	}

	public void removeSprechstunde(Sprechstunde stunde) {

	}


	/**
	 * @see Subject#attach(Observer)
	 */
	public void attach(Observer observer) {

	}


	/**
	 * @see Subject#remove(Observer)
	 */
	public void remove(Observer observer) {

	}


	/**
	 * @see Subject#sendUpdate()
	 */
	public void sendUpdate() {

	}

	public ArrayList<Sprechstunde> getList() {
		return list;
	}
}
