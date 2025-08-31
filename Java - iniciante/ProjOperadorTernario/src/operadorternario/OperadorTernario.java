package operadorternario;

import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {
        int n1, n2, resultado;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número qualquer: ");
        n1 = teclado.nextInt();
        System.out.print("Digite outro número qualquer: ");
        n2 = teclado.nextInt();
        //expressão?valor se verdadeiro:valor se falso
        resultado = n1>n2?n1:n2;
        
        System.out.printf("O maior número é: %d\n",resultado);
        
        //Operadores ternários aceitam fórmulas também
        resultado = n1>n2?n1-n2:n2-n1;
        System.out.printf("O maior número menos o menor é: %d", resultado);
        
        
        System.out.println("\n");
        //OPERADOR TERNÁRIO COM STRING
        //Diferença entre == e .equals
        String nome1 = "S";
        String nome2 = new String("S");
        String res;       
        //Compara tipo e conteúdo
        res = nome1==nome2?"igual":"diferente";
        System.out.println("nome1 == nome2?: "+res);
        
        //Comprara o conteúdo
        res = nome1.equals(nome2)?"igual":"diferente";
        System.out.println("nome1.equals(nome2)?: "+res);
                
        
    }
    
}
