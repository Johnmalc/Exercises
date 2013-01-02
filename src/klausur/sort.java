package klausur;

public class sort implements Comparable {
	String wort;

	public sort(String wortd) {
		this.wort = wortd;
	}

	public int compareTo(Object obj) {
		sort o = (sort) obj;
		
		if (o.lenght() < o.lenght()) {
			return -1;
		} else if (o.lenght() > o.lenght()) {
			return 1;
		} else {
			return 0;
		}

	}

	public int lenght() {
		return wort.length();
	}

	public String toString() {
		return wort;
	}
}
