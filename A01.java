import java.util.*;

class A01 {
	public static void main(String[] args) {
		
		A01 a = new A01();
		a.start();
	}

	void start() {
		Scanner s = new Scanner(System.in);
		System.out.print("태어난 년도를 입력하세요 : ");
		int birth_year = s.nextInt();
		int age = 2014 - birth_year + 1;
		if(check(age)) {
			System.out.print("미성년자가 아닙니다.");
		} else {
			System.out.print("미성년자 입니다.");
		}
	}

	boolean check(int a) {
		if(a>=20) return true;
		return false;
	}
}
