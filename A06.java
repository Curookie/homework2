import java.util.*;

public class A06 {

	public static void main(String[] args) {

		A06 a = new A06();
		a.start();
	}

	private void start() {
		
		Scanner s = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);

		System.out.print("이름 : ");
		String name =s.nextLine();
		System.out.print("국어점수 입력 : ");
		int kor = s.nextInt();
		System.out.print("수학점수 입력 : ");
		int mat = s.nextInt();
		System.out.print("영어점수 입력 : ");
		int eng = s.nextInt();
		double avg = Double.parseDouble(String.format("%.1f",(kor + mat + eng) / 3.0));
		System.out.println("===========================");
		System.out.println("["+name+"]"+"님은");
		System.out.println("평균은 "+avg+"이고,");
		check(avg);

	}

	private void check(double a) {
		String sco = "F";
		
		if(a>=95.0) {
			sco="A+";
			System.out.println("학점은 "+sco+"입니다.");
		} else if (a>=90.0) {
			sco="A";
			System.out.println("학점은 "+sco+"입니다.");
		} else if (a>=85.0) {
			sco="B+";
			System.out.println("학점은 "+sco+"입니다.");
		} else if (a>=80.0) {
			sco="B";
			System.out.println("학점은 "+sco+"입니다.");
		} else if (a>=75.0) {
			sco="C+";
			System.out.println("학점은 "+sco+"입니다.");
		} else if (a>=70.0) {
			sco="C";
			System.out.println("학점은 "+sco+"입니다.");
		} else if (a>=65.0) {
			sco="D+";
			System.out.println("학점은 "+sco+"입니다.");
		} else if (a>=60.0) {
			sco="D+";
			System.out.println("학점은 "+sco+"입니다.");
		} else {
			System.out.println("학점은 "+sco+"입니다.");
		}
	}
}
