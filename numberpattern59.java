package patternpractice;

public class numberpattern59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int scnt = 0;
		for (int i = 1; i <= 9; i++) {
			int cnt = 1;
		
			for (int j = 1; j <= 5; j++) {
				if (j <= scnt)
					System.out.print(" ");

				else {
					System.out.print(cnt);
					cnt++;
					
				}
			}

			System.out.println();

			if (i < 5)
				scnt++;
			else
				scnt--;
		}
	}
}
