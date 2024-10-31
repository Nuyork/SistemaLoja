/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
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
        Pane.setPreferredSize(new Dimension(500, 150));
        
        Campos = new HashMap<>();
    }
    
    public int Mostrar(String Header) {
        return JOptionPane.showConfirmDialog(null, Pane, Header, 2);
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
    
    public Object PegarCampo(String Nome) {
        return Campos.get(Nome);
    }
    
    public String PegarValorDoCampo(String Nome) {
        
        if (Campos.get(Nome) instanceof JTextField) {
            JTextField Campo = (JTextField) Campos.get(Nome);

            return Campo.getText();
        }else if (Campos.get(Nome) instanceof JComboBox) {
            JComboBox Campo = (JComboBox) Campos.get(Nome);
            
            return (String) Campo.getSelectedItem();
        }
        
        return "";
    }
    
    public void CriarComboBox(String Nome, Object Opcoes[]) {
        JPanel PaneCampo = new JPanel();
        
        DefaultComboBoxModel Model = new DefaultComboBoxModel();
        
        JComboBox Combo = new JComboBox(Opcoes);
        Combo.setModel(Model);
        
        JLabel NomeCampo = new JLabel(Nome);
        
        NomeCampo.setPreferredSize(new Dimension(100, 15));
        Combo.setPreferredSize(new Dimension(120, 30));

        PaneCampo.add(NomeCampo);
        PaneCampo.add(Combo);
        
        Pane.add(PaneCampo);
        
        Campos.put(Nome, Combo);
    }
    
    public void AtualizarComboBox(String Nome, Object Opcoes[]) {
        JComboBox Campo = (JComboBox) PegarCampo(Nome);
        DefaultComboBoxModel Model = (DefaultComboBoxModel) Campo.getModel();
        
        Campo.removeAllItems();
        
        for (Object Opcao : Opcoes) {
            Model.addElement(Opcao);
        }
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
    
    public void EditarCampoDeTexto(String NomeCampo, String Valor) {
        JTextField Campo = (JTextField) PegarCampo(NomeCampo);
        
        Campo.setText(Valor);
    }
    
    public void EditarCampoDeOpcoes(String NomeCampo, Object Valor) {
        JList Campo = (JList) PegarCampo(NomeCampo);
    
        Campo.setSelectedValue(Valor, true);
    }
    
    
}
