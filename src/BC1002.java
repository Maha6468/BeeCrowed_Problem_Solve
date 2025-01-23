import java.util.Scanner;

public class BC1002 {
    public static void main(String[] args) {
            Scanner input=new Scanner (System.in);
            double R=input.nextDouble();
            //System.out.print("A=%.4f\n",(3.14159*R*R));   //why wrong
            //System.out.println("A=%.4f\n",(3.14159*R*R));  //why wrong
            //print,printf,println problem chilo.
            System.out.printf("A=%.4f\n",(3.14159*R*R)); //look akane kintu (,) use hoice (+) na

        }
}
