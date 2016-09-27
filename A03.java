import java.util.*;

public class A03 {
	
	public static void main(String[] args) {
		
		A03 a = new A03();
		a.start();
	}

	private void start() {
		
		Scanner s = new Scanner(System.in);

		System.out.print("날 수를 입력하세요 : ");
		int days = s.nextInt();
		int seconds = days * 24 * 60 * 60;
		System.out.println("날 수에 해당되는 기간은 모두 "+seconds+"초 입니다.");
		int m_count = seconds / 1000000 ;
		if(check(m_count)) System.out.println("100만 초가 모두 "+m_count+"번이나 포함됩니다.");
	}

	private boolean check(int c) {
		return (c>0);	
	}
}
