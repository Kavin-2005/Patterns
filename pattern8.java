public class Dynamicpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int count=6;
		int n=6;
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=n-(i-1);j++) {
				System.out.print(n-i+1);
			}System.out.println();
		}

	}

}
