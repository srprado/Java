
package operadoresaritmeticos;

import java.util.Scanner;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in);
        //Incremento feito depois da soma, por isso valor=10
        //o decremento (--) tem a msm lógica
        int numero1 = 5;
        int valor1 = 5 + numero1--;
        System.out.println("valor1: "+valor1);
        System.out.println("numero1: "+numero1);
        
        //incremento feito antes da soma, por isso valor=11
        int numero2 = 5;
        int valor2 = 5 + --numero2;
        System.out.println("valor2: "+valor2);
        System.out.println("numero2: "+numero2);
        
        System.out.print("Digite o primeiro número: ");
        int n1 = teclado.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = teclado.nextInt();
        
        int adicao = n1+n2;
        int subtracao = n1-n2;
        int multiplicacao = n1*n2;
        float divisao = (float)n1/n2;
        int restoDiv = n1%n2;
        float media = (n1+n2)/2.0f;
        
        System.out.println("A soma dos números é igual a: "+adicao);
        System.out.format("O resultado da subtração de %d - %d é igual a %d: \n", n1, n2, subtracao);
        System.out.println("O resultado da multiplicação dos dois números é igual a: "+multiplicacao);
        System.out.format("O resultado da divisão de %d / %d é igual a %.2f\n", n1, n2, divisao);
        System.out.format("O resto da divisão de %d / %d é igual a %d\n", n1, n2, restoDiv);
        System.out.println("A média dos dois números é igual a: "+media);
        
    }
    
}
