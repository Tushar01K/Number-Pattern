package patternpractice;

public class numberpattern_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scnt=0;
	int cnt=1;
		for(int i=1;i<=5;i++) {
			int cnt2=cnt;
			for(int j=1;j<=5;j++) {
				if(j<=scnt) {
					System.out.print("");
				}
				else {
				System.out.print(cnt2);
				cnt2++;
				}
			}
			System.out.println("");
			scnt++;
			cnt++;
			
			
			
		}

	}

}
