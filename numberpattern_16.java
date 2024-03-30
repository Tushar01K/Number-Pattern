package pattern;

public class numberpattern_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=1;
		int end=1;
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=end;j++) {
				System.out.print(cnt);
				cnt++;
			}
			System.out.println();
			end++;
		}

	}

}
