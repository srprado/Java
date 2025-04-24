package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//        String nome = "Maria";
//        float nota = 8.5f;
        System.out.print("Seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Sua nota: ");
        float nota = teclado.nextFloat();
//        System.out.println("A nota do tipo float é "+nota);
//        //OU
//        System.out.printf("Nota formatada com 2 casas decimais: %.2f \n",nota);
        System.out.format("A nota de %s é %.1f \n", nome, nota);
        
        //Transformando tipos
        String valor = "30";
        int idade  = Integer.parseInt(valor);
        System.out.println(valor);
        
        System.out.print("Digite o valor de A: ");
        int A = teclado.nextInt();
        System.out.print("Digite o valor de B: ");
        int B = teclado.nextInt();
        int total = A+B;
        System.out.format("Soma de %d + %d = %d \n", A, B, total);
        
        
    }
    
}
