package lastEfirstString;

import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class Screen {
	JTextField texto;
	JLabel  resposta;
	JFrame tela;
public Screen() {
	//Adicionando tela
	tela= new JFrame("Tela");
	tela.setSize(1000,500);

	tela.setLocationRelativeTo(null);
	tela.setLayout(null); // para posicionarmos o botão no lugar desejado
	
     //Adicionando botão
	JButton botao= new JButton("Verificar");
     
     botao.setBounds(400, 400, 200, 50); 
      botao.setFont(new Font("Arial",Font.BOLD,32));
      botao.setForeground(new Color(139,0,139));
      botao.setBackground(new Color(240,248,255));      
      tela.add(botao);     
      botao.addActionListener(this::palavras);
      
      //Criação do input texto
    texto= new JTextField();
    texto.setBounds(50,100 , 600, 50);
    texto.setFont(new Font("Arial",Font.ROMAN_BASELINE,28));
    //botao.addActionListener(this::strings);
    tela.add(texto);
    
    //Criação do titulado JLabel em cima da caixa de texto;
    JLabel titulo= new JLabel("Digite uma String");
    titulo.setFont(new Font("Arial",Font.BOLD,32));
    titulo.setForeground(new Color(139,0,139));
    titulo.setBounds(50,50,280,50);
    tela.add(titulo);
    
    //Criação do botão resposta
    resposta=new JLabel("Resposta:");
    resposta.setFont(new Font("Arial",Font.BOLD,23));
    resposta.setForeground(new Color(178,34,12));
    resposta.setBounds(50,240,900,30);
    tela.add(resposta);
    
    //Comando actionListener;
    
  	tela.setVisible(true);
}
private void palavras(ActionEvent actionevent1) {
	String palavra= texto.getText();
	String palavra2="ADS";
	String t;
	if(palavra.contains(palavra2)) {
		t="Sim";
	}
	else {
		t="Não";
	}
	resposta.setText( palavra2 +" está contido em: "+"{" + palavra +"}"+" ?: "+ t);

}
}
