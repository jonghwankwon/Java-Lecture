package Openchallenge07_01;

public class SongLyrics extends Song {
	
	//필드
	public String lyrics;
	
	//생성자
	public SongLyrics(String title, String artist, String album, String[] composer, int year, int track, String lyrics) {
		super(title, artist, album, composer, year, track); //부모 생성자 호출
		this.lyrics = lyrics;
	}
	@Override
	public void show() {
		super.show();
		System.out.println("가사");
		System.out.println(lyrics);
	}
}