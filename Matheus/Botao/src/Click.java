import javax.swing.JFrame;

public class Botao  {
 public static void main(String[] args) {
  Botao botao1 = new Botao();
  
  botao1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  botao1.setSize(350,80);
  botao1.setVisible(true);
 }
}

Botao.java
import javax.swing.JFrame;
import javax.swing.JButton;

public class Botao extends JFrame{
 private JButton ok;
 
 public Botao(){
  super("Criando botões");

  ok = new JButton("OK");
  add(ok);
 }

}

