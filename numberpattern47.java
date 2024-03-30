package patternpractice;

public class numberpattern47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int end=1;
		for(int i=1;i<=9;i++) {
			int cnt=9;
			for(int j=1;j<=end;j++) {
				System.out.print(cnt);
				cnt--;
			}
			System.out.println("");
			end++;
			
		}

	}

}
