/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JComboBox;

/**
 *
 * @author user
 */
public class MenuSelecao extends MenuFormulario {
    public void CriarCampoDeSelecao(String Nome, Object Opcoes[]) {
        CriarComboBox(Nome, Opcoes);
        
        JComboBox ComboBox = (JComboBox) PegarCampo(Nome);
        ComboBox.setPreferredSize(new Dimension(180, 40));
    }
    
    
}
