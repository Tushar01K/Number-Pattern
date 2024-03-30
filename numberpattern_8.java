package pattern;

public class numberpattern_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int spcnt = 4;
		int cnt = 5;
		for (int i = 1; i <= 5; i++) {
			 int cnt2=cnt;

			for (int j = 1; j <= 5; j++) {

				if (j <=spcnt) {

					System.out.print(" ");
				} else {
					System.out.print(cnt2+" ");
					cnt2++;
				}

			}
			System.out.println();
			cnt--;
			spcnt--;
		}

	}

}
