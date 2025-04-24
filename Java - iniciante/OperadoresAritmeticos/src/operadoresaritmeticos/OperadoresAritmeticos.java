
package operadoresaritmeticos;

import java.util.Scanner;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in);
        
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
