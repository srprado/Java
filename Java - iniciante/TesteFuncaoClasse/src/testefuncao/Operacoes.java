
package testefuncao;

public class Operacoes {
    
    private String contador(int inicio, int fim){
        String s = "";
        for(int c=inicio; c<=fim; c++){
            s += c + " ";
        }  
        return s;
    }  
    
    public String getContador(int inicio, int fim){
        return contador(inicio, fim);
    }
    
    
}
