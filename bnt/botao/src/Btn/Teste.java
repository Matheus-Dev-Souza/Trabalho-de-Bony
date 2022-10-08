/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Btn;

public class Teste {
    public static void main(String[] args) {
       
        Botao b = new Botao();
        
        Click c1 = new Click(" O botão sair, ", b);
        Click c2 = new Click(" O botão seguinte, ", b);
        
        Acao a1 = new Acao();
        a1.setInfoAcao(".......");
        
        b.setAcao(a1);
        
        b.notificarClick();
    }
}
