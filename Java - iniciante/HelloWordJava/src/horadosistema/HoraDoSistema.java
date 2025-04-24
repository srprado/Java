package horadosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

public class HoraDoSistema {
    public static void main(String[] args) {
////        System.out.println("Hello word!");
        System.out.println("Configurações do sistema:");
        Date relogio = new Date();
        Locale idiomaSitema = Locale.getDefault();
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = (int)tela.getWidth();
        int altura = (int)tela.getHeight();
        
        System.out.println("A hora do sistema é: "+relogio.toString());
        System.out.println("O idioma do sistema está em "+idiomaSitema.getDisplayLanguage() +" - "+idiomaSitema.getLanguage()); 
        System.out.println("Dimensões da tela: "+largura+" X "+altura);
    }    
}
