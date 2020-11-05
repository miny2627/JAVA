import java.util.Scanner;

public class example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		while(true) {
			int target = (int)(Math.random()*100);
			System.out.println("수를 결정하였습니다. 맞추어보세요");
			int min = 0;
			int max = 99;
			int count = 1;
			while(true){
				System.out.println(min + "-" + max);
				System.out.print(count + ">>");
				int num = s.nextInt();
				if (num > target){
					System.out.println("더 낮게");
					max = num;
				}else if (num < target){
					System.out.println("더 높게");
					min = num;
				}else{
					System.out.println("맞았습니다.");
					break;
				}
				count += 1;
			}
		System.out.print("다시 하시겠습니까(y/n)>>");
		String a = s.next();
		if (a.equals("n"))
			break;
		}
	}
}
