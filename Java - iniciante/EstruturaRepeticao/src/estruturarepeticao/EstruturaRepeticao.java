
package estruturarepeticao;

import java.util.Scanner;
/* A principal diferença entre o FOR e WHILE é que o loop for é usado quando o número de repetições é conhecido previamente, como ao percorrer todos os elementos de uma 
    lista, enquanto o loop while é usado quando não sei quantas vezes vai se repetir, isto é, depende de uma condição específica se tornar falsa, já o DO-WHILE é quando não
    sei a quantidade que vai se repetir, a parada depende de uma condição específica, porém eu preciso que se repita pelo menos uma vez.
*/

public class EstruturaRepeticao {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);          
        int op;
        //executa pelo menos uma vez
        do{
            System.out.println("\nMENU");
            System.out.println("1- For");
            System.out.println("2- While");
            System.out.println("3- While com break e continue");
            System.out.print("Opção desejada: ");
            op = teclado.nextInt();
            switch(op){
                case 1:
                    estruturaFor();
                    break;
                case 2:
                    estruturaWhile();
                    break;
                case 3:
                    continueBreak();
                break;
                default:
                    System.out.println("Escolha entra as opções 1, 2 e 3 ou 0 para sair;");                
            } 
        }while(op!=0);
        System.out.println("Programa encerrado!");
    }
    
    public static void estruturaFor(){        
        for(int i=0;i<4;i++){
            System.out.println("Valor do contador: " + i);            
        }
    }
    
    public static void estruturaWhile(){
        int contador=0;
        while(contador<4){
            System.out.println("Valor do contador: " + contador);
            contador++;
            //poderia ser contador = contador +1
        }
    }
    
    public static void continueBreak(){
        int cc=0;
        while(cc<10){
            cc++;
            if(cc==2 || cc==3 || cc==4)
                continue;//quando só tem uma linha não precisa de chaves. O continue faz com que volte ao começo do laço;
            if(cc==7)
                break; //Interrompe o laço idependente da condição inicial.
            System.out.println("Valor do contador: " + cc);
        }
    }    
}
