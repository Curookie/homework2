import java.util.*;

class A02 {
	
	static boolean fcheck=false;

	public static void main(String args[]) {
		
		A02 a = new A02();
		a.start();
	}

	void start() {
		
		Scanner s = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		System.out.print("온도를 입력하세요 : ");
		double input_degree = s.nextInt();
		System.out.print("입력하신 온도가 섭씨온도이면 C를, 화씨온도이면 F를 입력하세요 : ");
		String kind = s2.nextLine();
		double output_degree;
		
		if(check(kind)&&fcheck==false) { 
			output_degree = (input_degree - 32)/1.8;
			System.out.println("변환된 온도는 "+output_degree+" 입니다.");
		}

		else if(check(kind)&&fcheck==true) {
			output_degree = input_degree * 1.8 + 32;
			System.out.println("변환된 온도는 "+output_degree+" 입니다.");
		}

		else System.out.println("똑바로 입력하세요");
	}

	boolean check(String k) {
		if(k.equals("F")) return true;
		if(k.equals("C")) { fcheck=true; return true; }
		return false;
	}
}

