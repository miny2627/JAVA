
public class Player {
	private String name, word;
	
	public Player(String name) {
		this.name = name;
	}
	
	public String getName() { return name; }
	
	public void sayWord(String word) {
		this.word = word;
	}
	
	public boolean succeed(char lastchar) {
		if (word.charAt(0) == lastchar) {
			return true;
		}else {
			return false;
		}
	}
}
