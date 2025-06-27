
package operadoresrelacionaislogicos;

public class OperadoresRelacionaisLogicos {

    public static void main(String[] args) {
        int x = 10, y=10;
        boolean r;
        
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
    }
    
}
