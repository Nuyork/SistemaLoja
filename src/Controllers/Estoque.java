/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Entities.Produto;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author user 
 */
public class Estoque {
    private JPanel Pane;
    
    public Estoque() {
        Pane = new JPanel();
        
        GridLayout Grid = new GridLayout(5, 1, 0, 5);
        JTextField Name = new JTextField(30);
        Pane.setLayout(Grid);
        Pane.add(new JLabel("Name"));
        Pane.add(Name);
        
        JTextField Amount = new JTextField(30);
        Pane.add(new JLabel("Amount"));

        Amount.setAlignmentY(SwingConstants.BOTTOM);
        Pane.add(Amount);    
   }
    
    
    public void Show() {
        String Opcoes[] = {"Adicionar produto", "Remover produto"};
        
        JOptionPane.showConfirmDialog(null, Pane);
        
        int Selecionado = 0;
        //int Selected = JOptionPane.showOptionDialog(null, "Choose an option", "Product Manager", 0, 0, null, Options, this);
        
        if (Selecionado == 0) {
            Produto NovoProduto = new Produto();
     
            
            
        }
    }
}
