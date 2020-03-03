public interface Subject extends Observer {

	private Observer[] observer;

	public abstract void attach(Observer observer);

	public abstract void remove(Observer observer);

	public abstract void notify();

}
