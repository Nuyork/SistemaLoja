/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class MenuFormulario {
    private JPanel Pane;
    private HashMap<String, Object> Campos;

    public MenuFormulario() {
        Pane = new JPanel();

        GridLayout Grid = new GridLayout(5, 4, 25, 1);
        
        Pane.setLayout(Grid);
        Pane.setPreferredSize(new Dimension(500, 300));
        
        Campos = new HashMap<>();
    }
    
    public void Mostrar() {
        JOptionPane.showConfirmDialog(null, Pane, "Adicionando produto", 0);
    }
    
    public void CriarCampoDeTexto(String Nome) {
        JPanel PaneCampo = new JPanel();
        
        JLabel NomeCampo = new JLabel(Nome);
        JTextField Campo = new JTextField();
        
        NomeCampo.setPreferredSize(new Dimension(100, 15));
        Campo.setPreferredSize(new Dimension(120, 30));
        
        PaneCampo.add(NomeCampo);
        PaneCampo.add(Campo);
        
        Pane.add(PaneCampo);
        
        Campos.put(Nome, Campo);
    }
    
    public String PegarValorDoCampo(String Nome) {
        
        if (Campos.get(Nome) instanceof JTextField) {
            JTextField Campo = (JTextField) Campos.get(Nome);

            return Campo.getText();
        }else if (Campos.get(Nome) instanceof JList) {
            JList Campo;
            Campo = (JList) Campos.get(Nome);
            
            return (String) Campo.getSelectedValue();
        }
        
        return "";
    }
    
    public void CriarCampoDeOpcoes(String Nome, String Opcoes[]) {
        JPanel PaneCampo = new JPanel();
        
        DefaultListModel ListModel = new DefaultListModel();
        
        JList Lista = new JList(ListModel);
        JLabel NomeCampo = new JLabel(Nome);
        
        NomeCampo.setPreferredSize(new Dimension(100, 15));

        JScrollPane Scroll = new JScrollPane(Lista);
        Scroll.setPreferredSize(new Dimension(120, 30));

        PaneCampo.add(NomeCampo);
        PaneCampo.add(Scroll);
        
        for (String Opcao : Opcoes) {
            ListModel.addElement(Opcao);
        }
        
        Pane.add(PaneCampo);
        
        Campos.put(Nome, Lista);        
    };
    
}
