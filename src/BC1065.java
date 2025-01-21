import java.util.Scanner;

public class BC1065 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int i,N;
        int count=0;
        for( i=0;i<5;i++){
            N= input.nextInt();
            if(N%2==0) {
                count++;
            }
        }
        System.out.println(count+" valores pares");



    }
}
