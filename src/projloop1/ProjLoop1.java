package projloop1;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class ProjLoop1 {

    public static void main(String[] args) {
        //laços de repetições
        // while() - enquanto
        int cont, idade, contMaior, acIdade;
        cont = 0; //op.relacionais == > < >= <= !=
        idade = 0; contMaior = 0; acIdade = 0;
        while (idade >= 0 &&  idade <= 110 ) {//enquanto a condição for verdadeira repete
           idade = Integer.parseInt(JOptionPane.
                 showInputDialog("Digite uma idade;"
                         + "\n ou digite uma idade menor que zero "
                         + "ou maior que 110 para sair:"));
           if(idade >= 0 &&  idade <= 110){
            System.out.println("A idade digitada foi:"+idade);
            cont++;//cont = cont +1; contador
            acIdade = acIdade + idade;   //acumulador         
            if(idade >=18){
                contMaior++;// contMaior = contMaior + 1;
            }
           }
        }
        if(cont>0){
        JOptionPane.showMessageDialog(null, "Você digitou "+cont
                +" idade válidas, exitem "+contMaior+" adultos maiores ou"
                        + " iguais a 18 anos. Média de idade é"
                +(acIdade/cont));
        }else{
           JOptionPane.showMessageDialog(null,"Não existem idades digitadas");
        }
    }

}
