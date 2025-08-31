package testefuncao;

public class TesteFuncao {

    //como o método main é static, o método que ele chama tem que ser static também, pois pertence à classe e não a uma instância específica (objeto) dessa classe.
    public static void soma(int a, int b){
        int s = a + b;
        System.out.println("Resultado da soma: "+ s);
    }
    
    public static int somaReturn(int a, int b){
        int s = a + b;
        return s;
    }
    
    public static void main(String[] args) {
        System.out.println("Inicio do program...\n");
        soma(5,2);
        //poderia atribuir em uma variável e imprimir a variável
        System.out.println("Valor de S: " + somaReturn(8, 8));
        
        //chamada de método de outra classe
        //Se o método da outra classe é publico não precisa instanciar a classe
        //Agora se o método for privado é necessário um get e criar uma instância da classe
        Operacoes op = new Operacoes();
        System.out.println(op.getContador(1, 10));
    }
    
}
