package pattern;

public class numberpattern_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int spacecnt=5;
		for(int i=1;i<=5;i++) {
			int cnt=1;
			for(int j=1;j<=5;j++) {
				
			if(j<=spacecnt) {
				
				System.out.println(" ");}
				else {
					System.out.print(cnt);
				cnt++;
				}
			}
			}
			System.out.println();
			spacecnt--;
		}
	}


