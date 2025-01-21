import java.util.Scanner;

public class BC1045 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        double temp;
        if(A<B){
            temp=A;
            A=B;
            B=temp;
        }
        if(A<C){
            temp=A;
            A=C;
            C=temp;
        }
        if(B<C){
            temp=B;
            B=C;
            C=temp;
        }

        if(A>=B+C){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else{
            if((A*A)==((B*B)+(C*C)))
                System.out.println("TRIANGULO RETANGULO");
            if((A*A)>((B*B)+(C*C)))
                System.out.println("TRIANGULO OBTUSANGULO");
            if((A*A)<((B*B)+(C*C)))
                System.out.println("TRIANGULO ACUTANGULO");
            if(A==B&&B==C)
                System.out.println("TRIANGULO EQUILATERO");
           else if(A==B||B==C||C==A)
                System.out.println("TRIANGULO ISOSCELES");
        }


    }
}

