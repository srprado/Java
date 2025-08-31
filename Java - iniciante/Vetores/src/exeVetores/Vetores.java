
package exeVetores;

import java.util.Arrays;

public class Vetores {

    public static void main(String[] args) {
        System.out.println("EXEMPLO 1:");
        vetor01();
        System.out.println("\nEXEMPLO 2: ");
        vetor02();
        System.out.println("\nEXEMPLO 3: ");
        vetor03();
        System.out.println("\nEXEMPLO 5: ");
        vetor4();
        
        
    }
    
    public static void vetor01(){
        int n[] = {3,2,8,7,5,4}; //vetor com 6 posições, do 0 ao 5
        System.out.println("Total de casas de n: "+ n.length);        
        //aqui poderia ir até n.length-1
        for(int i=0; i<=5; i++){
            System.out.println("Valor "+ n[i]+ " está na posição "+ i +" do vetor n.");
        }
    }
    
    public static void vetor02(){
        String mes[] = {"janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int total[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        for(int i=0; i<mes.length; i++){
            System.out.format("O mês de %s tem %d dias\n", mes[i], total[i]);
        }
    }
    
    public static void vetor03(){
        double num[] = {3.5 , 5.0, 1.8, 8.0, 4};
        for(double valor: num){
            System.out.println("Valor: "+ valor);
        }
        Arrays.sort(num);
        System.out.println("\nVetor ordenado:");
        for(double valor: num){
            System.out.print(valor + " - ");
        }
        //aqui não pega o vetor ordenado, são as posições inicias de quando o vetor foi declarado
        System.out.println("\n\nBusca por valor:");
        int pos = Arrays.binarySearch(num, 8);
        System.out.println("O valor 8 está na posição "+ pos);             
    }    
    
    public static void vetor4(){
        //vetor com 5 posições
        int num[] = new int[5];
        //vai preencher todas as posições com o número 8
        Arrays.fill(num, 8);        
        for(int i=0; i<num.length; i++){
            System.out.format("Valor %d na posição %d\n",num[i], i);
        }
        int pos = Arrays.binarySearch(num, 8);
        System.out.println("O valor 8 está na posição "+ pos); 
        
    }
}
