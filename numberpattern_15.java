package pattern;

public class numberpattern_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int end = 5;
		int scnt = 4;
		for (int i = 1; i <= 5; i++) {
			int cnt = 1;
			for (int j = 1; j <= end; j++) {

				if (j <= scnt) {
					System.out.print(" ");
				} else {
					System.out.print(cnt);

					if (j < 5)
						cnt++;
					else
						cnt--;
				}
			}

			System.out.println();

			if (i < 5)
				scnt--;
			end++;

		}

	}
}
