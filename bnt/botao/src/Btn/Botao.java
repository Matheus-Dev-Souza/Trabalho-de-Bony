/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Btn;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bruno Rocha Sampaio
 */
public class Botao implements IBotao {
    
    private List<IClick> click = new ArrayList();
    private Acao a;
    
    @Override
    public void registrarClick(IClick i) {
        click.add(i);
    }

    @Override
    public void removerClick(IClick i) {
        click.remove(i);
    }

    @Override
    public void notificarClick() {
       for(IClick i : click)
           i.update(a);
    }
    
    public void setAcao(Acao a){
        this.a = a;
    }
    
}
