
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab01_215
 */
public class MediaClasse {
    public static void main(String[] args) {
       int cont=0;
       double nota=0,soma=0,media;
       while(nota!=-1){//o laço do parará de excecutar quando a nota for -1
        nota=Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno:"));
        if (nota!=-1){
         soma=nota+soma; //acumulador de soma das notas
         cont=cont+1;//contador das notas
         
         }
       }
       media=soma/cont;//media da classe
       JOptionPane.showMessageDialog(null,"Média da classe:"+ Double.toString(media));
    }
}
