
package estruturascondicionais;

import java.util.Scanner;

public class EstruturasCondicionais {

    public static void main(String[] args) {
        System.out.println("OPÇÕES:\n");
       Scanner teclado = new Scanner(System.in);
        System.out.println("1 - Condição IF;");
        
        System.out.print("\nDigite sua opção: ");
        int op = teclado.nextInt();
        switch(op){
            case 1:
                condicaoIf();
                break;
            default:
            System.out.println("⚠️ Opção inválida! Digite apenas opções de 1 a ...");
            break;
        }
    }
    
    public static void condicaoIf(){
        System.out.println("\nCONDIÇÃO IF");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a nota 1: ");
        float n1 = teclado.nextFloat();
        System.out.print("Digite a nota 2: ");
        float n2 = teclado.nextFloat();
        
        float m = (n1+n2)/2;
        
        System.out.print("Sua média é: "+m+". ");
        
        if(m>8){
            System.out.print("Parabéns!\n");
        }else if(m>=6){
            System.out.print("Nota OK!\n");
        }else{
            System.out.print("Precisa estudar mais!\n");
        }        
    }
}
