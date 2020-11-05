import java.util.Scanner;

public class StackManager {
	private int MAX, length;
	private String stringArray[];
	
	public StackManager() {
		MAX = 10;
		length = -1;
		stringArray = new String[MAX];
	}
	
	int length() { return length; }
	String pop() { return stringArray[length--]; }
	boolean push(String ob) {
		if (length == MAX-1) { 
			return false;
		} else {
			stringArray[++length] = ob;
			return true;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackManager sm = new StackManager();
		Scanner s = new Scanner(System.in);
		
		System.out.print(">>");
		for (int i=0; i<5; i++ )
			sm.push(s.next());
		for (int i=0; i<5; i++ )
			System.out.print(sm.pop() + " ");
	}
}
