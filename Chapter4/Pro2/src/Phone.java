import java.util.Scanner;

public class Phone {
	private String name, tel;
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public String getName() { return this.name; }
	public String getTel() { return this.tel; }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		Phone p[] = new Phone[2];
		for (int i =0; i<2; i++) {
			System.out.print("이름과 전화번호 입력 >>");
			String n = s.next();
			String t = s.next();
			p[i] = new Phone(n,t);
		}
		
		for (int i =0; i<2; i++) {
			System.out.println(p[i].getName()+ "의 번호 " + p[i].getTel());
		}
	}
}
