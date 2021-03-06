import java.util.Scanner;

public class PhoneManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("인원수>>");
		int num = s.nextInt();
		Phone PhoneArray[] = new Phone[num];
		
		for (int i=0; i<num; i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력) >>");
			String name = s.next(); 
			String tel = s.next();
			PhoneArray[i] = new Phone(name, tel);
		}
		
		System.out.println("저장되었습니다...");
		
		while(true){
			System.out.print("검색할 이름>>");
			String name = s.next();
			if (name.equals("exit"))
				break;
			
			int idx = -1;
			
			for (int i=0; i<num; i++) {
				if (name.equals(PhoneArray[i].getName())) {
					idx = i;
					break;
				}
			}
			
			if (idx != -1) {
				System.out.println(name + "의 번호는 " + PhoneArray[idx].getTel() + " 입니다.");
			}else {
				System.out.println(name + "이 없습니다.");
			}
		}
	}

}
