
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
		Song yourSong = new Song("������Ÿ��");
		System.out.println("�� �뷡 ��" + mySong.getTitle());
		System.out.println("�� �뷡 ��" + yourSong.getTitle());
	}
}