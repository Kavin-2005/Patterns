import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=(i*2)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

output
  5
*********
 *******
  *****
   ***
    *
