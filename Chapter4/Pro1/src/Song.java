
public class Song {
	private String title;
	
	public Song(String t) {
		this.title = t;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song mySong = new Song("let it go");
		Song yourSong = new Song("강남스타일");
		System.out.println("내 노래 는" + mySong.getTitle());
		System.out.println("너 노래 는" + yourSong.getTitle());
	}
}
