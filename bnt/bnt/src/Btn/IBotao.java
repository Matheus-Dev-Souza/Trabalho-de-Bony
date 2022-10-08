/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Btn;

/**
 *
 * @author Bruno Rocha Sampaio
 */
public interface IBotao {
    
    void registrarClick(IClick i);
    void removerClick(IClick i);
    void notificarClick();
        
}
