package observerPull;

public class Sprechstunde {

	public Sprechstunde(String lehrer, String raumnummer, int wochentag, String begin, String end) {
		this.lehrer = lehrer;
		this.raumnummer = raumnummer;
		this.wochentag = wochentag;
		this.begin = begin;
		this.end = end;
	}

	private String lehrer;

	private String raumnummer;

	private int wochentag;

	private String begin;

	private String end;

	public String getLehrer() {
		return lehrer;
	}

	public String getRaumnummer() {
		return raumnummer;
	}

	public int getWochentag() {
		return wochentag;
	}

	public String getBegin() {
		return begin;
	}

	public String getEnd() {
		return end;
	}
}
