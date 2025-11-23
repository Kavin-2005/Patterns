public class jpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		
		for(int i=1;i<=(n*2)-1;i++) {
			int rowchange=i>n?((2*n)-i):i;
			for(int j=1;j<=rowchange;j++) {
				System.out.print("*");
			}System.out.println();

}
		}
}
output:
*
**
***
****
*****
******
*****
****
***
**
*
