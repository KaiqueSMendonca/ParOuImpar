
package parouimpar;
import java.util.Scanner;


public class ParOuImpar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double num1 = entrada.nextDouble();
        
        if (num1%2==0)
                System.out.println("O número "+num1+" é par");
        else
            System.out.println("O número "+num1+"é ímpar");
            
    }
    
}
