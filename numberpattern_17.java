package pattern;

public class numberpattern_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int end=1;
		 int cnt=1;
		 
		 for(int i=1;i<=5;i++) {
			 int cnt2=cnt;
			 int dif=4;
			 
			 for(int j=1;j<=end;j++) {
				 
				 System.out.print(cnt2);
				  cnt2 =cnt2+dif;
			 }
			 System.out.println();
			 end++;
			 cnt++;
		 }
		 
		

	}

}
