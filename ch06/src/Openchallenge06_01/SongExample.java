package Openchallenge06_01;

public class SongExample {
	public static void main(String[] args) {
		Song ABBA = new Song("Dancing Queen", "ABBA", "Arrival", new String[] 
				{ "Benny Andersson", "Bjorn Ulvaeus", "Stig Anderson" }, 100,
				1976);

		ABBA.show();
	}
}
