package pattern;

public class numberpattern_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space = 4;
		for (int i = 1; i <= 5; i++) {
			int cnt=1;
			for(int j=1;j<=5;j++) {
				
				if(j<=space) 
					
					System.out.print(" ");
				else {
					System.out.print(cnt+" ");
					cnt++;}
				
			}
			System.out.println();
			space--;
		}
	}

}
