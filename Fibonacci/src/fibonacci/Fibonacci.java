package fibonacci;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;


public class Fibonacci {

    public static void GeraFibonacci (int num){
        String Serie="0";
        int anterior=0;
        int atual=1;
        int i=0;
        
        while (i<(num-1)){
            Serie = Serie + " "+ String.valueOf(atual);
            atual = atual + anterior;
            anterior = atual - anterior;
            i++;
        }
        System.out.println("Serie Fibonacci com "+num+" termos");
        
        JOptionPane.showMessageDialog(null, Serie, "Serie Fibonacci com "+num+" termos:",
                INFORMATION_MESSAGE);
                //ERROR_MESSAGE
                //WARNING_MESSAGE
                //QUESTION_MESSAGE
        
    }
    
    
    public static void main(String[] args) {
        Integer [] opcoes = {6, 8, 12, 15, 24, 36, 48};
        int n;
        n = (Integer) JOptionPane.showInputDialog(null, "Selecione a quantidade de Termos",
                "Fibonacci", QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        GeraFibonacci(n);
    }
    
}
