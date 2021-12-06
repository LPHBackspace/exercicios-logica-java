package javaswing;

import javax.swing.JFrame;
import javax.swing.JButton;

public class Exemplo01 {

    public static void main(String[]args){

        JFrame f = new JFrame("Botão Validar");

        JButton b= new JButton("Clique Aqui!");

        b.setBounds(130,100,140,50);

        f.add(b);

        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
