import java.util.*;

public class A05 {

	public static void main(String[] args) {
		
		A05 a = new A05();
		a.start();
	}	

	private void start() {
		
		Scanner s = new Scanner(System.in);
		System.out.print("태어난 년도를 입력하세요 : ");
		int birth_year = s.nextInt();
		check(birth_year);
	}

	private void check(int b) {
		
		int age = 2012 - b + 1;
		String str = null;
		if(age >= 60) str = "노년";
		else if(age >= 30) str = "중년";
		else if(age >= 20) str = "청년";
		else if(age >= 13) str = "청소년";
		else if(age >= 7 ) str = "어린이";
		else str = "유아";
		
		System.out.println(str+" 입니다.");
	}
}

