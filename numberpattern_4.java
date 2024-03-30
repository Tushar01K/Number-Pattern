package pattern;

public class numberpattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int spacecnt = 4;
		for (int i = 1; i <= 5; i++) {
			int cnt = 5;
			for (int j = 1; j <= 5; j++) {
				if (j <= spacecnt) {

					System.out.print(" ");
				} else {
					System.out.print(cnt);
					cnt--;
				}
			}
			System.out.println();
			spacecnt--;
		}

	}

}
