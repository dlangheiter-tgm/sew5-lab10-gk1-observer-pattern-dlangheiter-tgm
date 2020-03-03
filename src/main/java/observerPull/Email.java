package observerPull;

public class Email implements Observer {

	private Subject subject;

	public Email(Subject subject) {
		this.subject = subject;
	}

	/**
	 * @see Observer#update()
	 */
	public void update() {
		System.out.println("UPDATE EMAIL " + subject.getState().size());
	}

}
