/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Btn;

/**
 *
 * @author Bruno Rocha Sampaio
 */
public class Click implements IClick {
    
    private String nomebtn;
    
    public Click(String nomebtn, IBotao b){
     this.nomebtn = nomebtn;
     b.registrarClick(this);
    }
    @Override
    public void update(Acao a) {
        System.out.println(nomebtn+"Foi pressionado"+ a.getInfoAcao());
    }
    
}
