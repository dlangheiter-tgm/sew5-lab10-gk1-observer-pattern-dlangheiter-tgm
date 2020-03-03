import java.util.ArrayList;

public class SprechstundenListe implements Subject {

	private ArrayList<Observer> observers;

	private ArrayList<Sprechstunde> list;

	public void addSprechstunde(Sprechstunde stunde) {
		this.list.add(stunde);
	}

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

	public ArrayList<Sprechstunde> getList() {
		return list;
	}
}
