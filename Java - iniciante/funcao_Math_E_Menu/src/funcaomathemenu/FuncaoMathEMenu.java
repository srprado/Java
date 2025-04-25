
package funcaomathemenu;

import java.util.Scanner;

public class FuncaoMathEMenu {

    public static void main(String[] args) {
        //A função aqui são os métodos da classe. Chamei de função por habito.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1 - Operadores unários");
        System.out.println("2 - Operadores de atribuição");
        System.out.println("3 - Classe Math: PI");
        System.out.println("4 - Classe Math: Exponenciação");
        System.out.println("5 - Classe Math: Raiz quadrada");
        System.out.println("6 - Classe Math: Raiz cúbica");
        System.out.println("7 - Classe Math: Arredondamento valor absoluto");
        System.out.println("8 - Classe Math: Arredondamento para baixo");
        System.out.println("9 - Classe Math: Arredondamento para cima");
        System.out.println("10 - Classe Math: Arredondamento aritmético");
        System.out.println("11 - Classe Math: Valor aleatório");
        System.out.println("12 - Classe Math: valor aleatório entre período");
        System.out.print("Escolha uma opção: ");
        int op = teclado.nextInt(); 
        
        switch (op) {
            case 1:
                OpUnario(); 
                break;
            case 2:
                opAtribuicao();
                break;
            case 3:
                opPpi();
                break;
            case 4:
                opExpo();
                break;
            case 5:
                opRaizQuad();
                break;
            case 6:
                opRaisCub();
                break;
            case 7:
                opVlrAbsoluto();
                break;
            case 8:
                opArRBaixo();
                break;
            case 9:
                opArrCima();
                break;
            case 10:
                opArrAritmetico();
                break;
            case 11:
                opVlrAleatorio();
                break;
            case 12:
                opVlrAleatorioIntervalo(); 
                break;
            default:
                System.out.println("⚠️ Opção inválida! Digite apenas opções de 1 a 12.");
                break;
        }
    }
    
    public static int OpUnario(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor inteiro: ");
        int numero = teclado.nextInt();
        //Aqui ele imprime o número e depois ele incrementa
        System.out.printf("Incremento numero++: %d \n",numero++);
        //Aqui o numero já tem o valor incrementado do print anterior, então incrementa + 1
        System.out.printf("++numero: %d \n", ++numero);
        //Aqui é o valo do último print, então ele imprime o msm valor do print anterior e depois decrementa
        System.out.printf("Decremento numero--: %d \n", numero--);
        //Aqui ele tem o valor decrementado já e decremenra mais uma vez
        System.out.printf("--numero: %d \n", --numero);   
        /*Se quiser deixar mais fácil o entendimento recomendo criar uma variável para cada incremente/decremento que for printar,
        assim fica mais fácil entender a lógica do pré e pós incremento/decremento.*/
        return 0;        
    }
    
    public static int opAtribuicao(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor inteiro: ");
        int numero = teclado.nextInt();
        
        System.out.printf("+=1 %d \n", numero+=1);
        //o número sempre assume o valor da operação feita anteriormente
        System.out.printf("-=1 %d \n", numero-=1);
        System.out.printf("*=2 %d \n", numero*=2);
        System.out.printf("/=2 %d \n", numero/=2);   
        return 0;
    }
    
    public static double opPpi(){
        //Aqui usaremos a classe Math, ela permite fazer algumas operações além das op. básicas.
        System.out.printf("Valor PI: %.6f \n",Math.PI);
        System.out.printf("Valor de PI+1: %.6f \n", 1 + Math.PI);
        return 0;
    }
    
    public static double opExpo(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor da base: ");
        int base = teclado.nextInt();
        System.out.print("Digite o expoente: ");
        int expo = teclado.nextInt();
        System.out.printf("%d ^ %d = %.0f \n", base, expo, Math.pow(base, expo));        
        return 0;
    }
    
    public static float opRaizQuad(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();
        System.out.println("Raiz quadrada: "+ Math.sqrt(numero));
        return 0;
    }
    
    public static float opRaisCub(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();
        System.out.println("Raiz cúbica: "+ Math.cbrt(numero));
        return 0;
    }
    
    public static float opVlrAbsoluto(){
        Scanner teclado = new Scanner(System.in);
        //Para quando se tem valores negativos
        System.out.print("Digite um número negativo: ");
        float numero = teclado.nextFloat();
        System.out.println("valor absoluto: "+ Math.abs(numero));
        return 0;
    }
    
    public static float opArRBaixo(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número decimal: ");
        float numero = teclado.nextFloat();
        System.out.println("valor arredondado p/ baixo: "+ Math.floor(numero));
        return 0;
    }
    
    public static float opArrCima(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número decimal: ");
        float numero = teclado.nextFloat();
        System.out.println("valor arredondado p/ cima: "+ Math.ceil(numero));
        return 0;
    }
    
    public static float opArrAritmetico(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número decimal: ");
        float numero = teclado.nextFloat();
        //Número acima de x.5 arredonda para cima e abaixo de x.5 para baixo
        System.out.println("valor arredondado aritmeticamente: "+ Math.round(numero));
        return 0;
    }
    
    public static void opVlrAleatorio(){
        //O número aleatório do random é entre 0.0 e 1.0
        System.out.println("Valor aleatório: "+Math.random());
    }
    
    public static float opVlrAleatorioIntervalo(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o número inicial: ");
        float nI = teclado.nextFloat();
        System.out.print("Digite o número final: ");
        float nF = teclado.nextFloat();
        float resultado = (float) (nI * Math.random() * (nF-nI));
        System.out.println("Valor aleatório entre intervalo: "+resultado);
        return 0;
    }
    
}
