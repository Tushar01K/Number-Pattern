package pattern;

public class numberpattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int end = 1;
		int cnt = 1;
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= end; j++) {
				System.out.print(cnt);

			}
			System.out.println();
			end++;
			cnt++;
		}

	}

}
