package Openchallenge07_01;

public class SongLyricsExample {
	public static void main(String[] args) {
		String lyrics = "Love of my life, you've hurt me\r\n" + 
				"You've broken my heart and now you leave me\r\n" + 
				"Love of my life, can't you see?\r\n" + 
				"Bring it back, bring it back\r\n" + 
				"Don't take it away from me, because you don't know\r\n" + 
				"What it means to me\r\n" + 
				"Love of my life, don't leave me\r\n" + 
				"You've stolen my love, you now desert me\r\n" + 
				"Love of my life, can't you see?\r\n" + 
				"Bring it back, bring it back (back)\r\n" + 
				"Don't take it away from me\r\n" + 
				"Because you don't know\r\n" + 
				"What it means to me\r\n" + 
				"Obrigado";
		String[] composer = new String[] {"Freddie Mercury"};

		SongLyrics Queen = new SongLyrics("Love of My Life", "Queen", 
				"A Night at the Opera", composer, 1975, 9, lyrics);
		Queen.show();
	}
}
