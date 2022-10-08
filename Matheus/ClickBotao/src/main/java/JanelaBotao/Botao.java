package JanelaBotao;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Botao extends JFrame {
    
    private final JLabel labelFilme;
    private final JTextField textFilme;
    private final JButton botaoSalvarFilme;
    
    public Botao(){
        super();
        
        this.setTitle(" Click ");
        this.setSize(400, 200);
        
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        labelFilme = new JLabel("Click ");
        textFilme= new JTextField();
        textFilme.setPreferredSize(new Dimension(250,20));
        botaoSalvarFilme = new JButton("Salvar");
        
        botaoSalvarFilme.addActionListener((ActionEvent e) -> {
            
            JOptionPane.showMessageDialog(null, "Click  Salvo com sucesso!");
        });
        
        this.add(labelFilme);
        this.add(textFilme);
        this.add(botaoSalvarFilme);
        
        this.setVisible(true);
        
    }
}

//Crie uma classe que simule o click de um botão. Para isso, deve-se criar uma classe
//chamada “Botao” e os métodos de click e de configuração de ações de clicks. Disponibilize
//ações que devem ser executadas quando o método "click" do botão for disparado