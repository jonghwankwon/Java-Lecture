package Openchallenge06_01;

public class Song {
	public String title, artist, album;
	public String composer[];
	public int year, track;

	Song() { this(null, null, null, null, 0, 0); }


	public Song(String title, String artist, String album, String[] composer, int year, int track) {
		super();
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}

	void show() {
		System.out.println("제목 : " + title);
		System.out.println("가수 : " + artist);
		System.out.println("앨범 제목 : " + album);
		for(int i=0; i<composer.length; i++)
			System.out.println("작곡가 : " + composer[i]);
		System.out.println("발표 연도 : " + year);
		System.out.println("트랙 번호 : " + track);
	}
}