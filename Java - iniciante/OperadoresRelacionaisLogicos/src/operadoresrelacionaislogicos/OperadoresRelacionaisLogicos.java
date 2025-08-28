
package operadoresrelacionaislogicos;

import java.awt.BorderLayout;
import java.util.Scanner;

public class OperadoresRelacionaisLogicos {

    public static void main(String[] args) {
        int x = 10, y=10;
        boolean r;
        Scanner teclado = new Scanner(System.in);
        
        //x é maior que y E y é menor que x
        r = (x>y && y<x)?true:false;
        System.out.println("Resultado: "+r);
        
        //X é maior ou igual a Y, mas não é menor ou igual a Y
        r = (x>=y || x<=y)?true:false;
        System.out.println("Resultado: "+r);   
        
        //X é igual a Y
        r = (x==y)?true:false;
        System.out.println("Resultado: "+r);
        
        //X é diferente de Y
        r = (x!=y)?true:false;
        System.out.println("Resultado: "+r);
        
        //X é exclusivamente maior que Y ou exclusivamente menor que Y
        r = (x>y ^ x<y)?true:false;
        System.out.println("Resultado: "+r);
        
        System.out.print("\nDigite sua idade: ");
        int idade = teclado.nextInt();
        
        String voto = (idade>=18 && idade<=70)?"voto é obrigatório!":"voto é opcional!";
        System.out.println("De acordo com sua idade o "+voto);        
    }    
}
