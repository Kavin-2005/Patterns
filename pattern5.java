public class pattern01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int value=1;
		for(int i=1;i<=n;i++) {
			value=i%2==0?1:0;
			for(int j=1;j<=i;j++) {
				System.out.print(value);
				value=(value==0)?1:0;
			}
			System.out.println();
		}

	}

}

output:
0
10
010
1010
01010
101010
