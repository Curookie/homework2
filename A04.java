import java.util.*;

public class A04 {

	public static void main(String[] args) {

		A04 a = new A04();
		a.start();
	}

	private void start() {
		
		Scanner s = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요 : ");
		int kor = s.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		int eng = s.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		int mat = s.nextInt();

		int total = kor + eng + mat ;
		double avg = Double.parseDouble(String.format("%.1f", total/3.0));
		System.out.println("입력하신 점수의 총점은 "+total+"이고,");
		System.out.println("평균은 "+avg+"입니다.");
		check(kor, eng, mat);
	}

	private void check(int k, int e, int m) {
		
		if(k>=90) System.out.println("국어 점수가 우수합니다.");
		if(e>=90) System.out.println("영어 점수가 우수합니다.");
		if(m>=90) System.out.println("수학 점수가 우수합니다.");
	}
}


