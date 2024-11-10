/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

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
import Entities.Fornecedor;
import java.util.Map;
import javax.swing.JButton;

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
        Pane.setPreferredSize(new Dimension(500, 260));
        
        Campos = new HashMap<>();
    }
    
    public int Mostrar(String Header) {
        return JOptionPane.showConfirmDialog(null, Pane, Header, 2);
    }
    
    public JTextField CriarCampoDeTexto(String Nome) {
        JPanel PaneCampo = new JPanel();
        
        JLabel NomeCampo = new JLabel(Nome);
        JTextField Campo = new JTextField();
        
        NomeCampo.setPreferredSize(new Dimension(120, 15));
        Campo.setPreferredSize(new Dimension(180, 30));
        
        PaneCampo.add(NomeCampo);
        PaneCampo.add(Campo);
        
        Pane.add(PaneCampo);
        
        Campos.put(Nome, Campo);
        
        return Campo;
    }
    
    public void LimparCampos() {
        for (Map.Entry<String, Object> entry : Campos.entrySet()) {
            Object Valor = entry.getValue();
            
            if (Valor instanceof JTextField) {
                ((JTextField) Valor).setText("");
            }else if (Valor instanceof JComboBox) {
                ((JComboBox) Valor).setSelectedIndex(0);
            }
        }
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
        }else if (Campos.get(Nome) instanceof JList) {
            JList Campo = (JList) Campos.get(Nome);
            
            return (String) Campo.getSelectedValue().toString();
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
    
    public JButton CriarBotao(String Nome) {
        JPanel PaneCampo = new JPanel();
        
        JButton Botao = new JButton(Nome);
        Botao.setPreferredSize(new Dimension(120, 24));
        
        PaneCampo.add(Botao);
        
        Pane.add(PaneCampo);
        
        Campos.put(Nome, Botao);
        
        return Botao;
    }
    
    public void AtualizarComboBox(String Nome, Object Opcoes[]) {
        JComboBox Campo = (JComboBox) PegarCampo(Nome);
        DefaultComboBoxModel Model = (DefaultComboBoxModel) Campo.getModel();
        
        Campo.removeAllItems();
        
        for (Object Opcao : Opcoes) {
            Model.addElement(Opcao.toString()); 
        }
    }
    
    public void AtualizarCampoDeOpcoes(String Nome, Object Opcoes[]) {
        JList Campo = (JList) PegarCampo(Nome);
        
        Campo.removeAll();
        
        DefaultListModel Model = (DefaultListModel) Campo.getModel();
        
        for (Object Opcao : Opcoes) {
            Model.addElement(Opcao);   
        }
    }
    
    public void CriarCampoDeOpcoes(String Nome) {
        JPanel PaneCampo = new JPanel();
        
        DefaultListModel ListModel = new DefaultListModel();
        
        JList Lista = new JList(ListModel);
        JLabel NomeCampo = new JLabel(Nome);
        
        NomeCampo.setPreferredSize(new Dimension(100, 15));

        JScrollPane Scroll = new JScrollPane(Lista);
        Scroll.setPreferredSize(new Dimension(120, 30));

        PaneCampo.add(NomeCampo);
        PaneCampo.add(Scroll);
        
        Pane.add(PaneCampo);
        
        Campos.put(Nome, Lista);
    };
    
    public void ToggleCampo(String NomeDoCampo, Boolean Ativo) {
        JTextField Campo = (JTextField) PegarCampo(NomeDoCampo);
        
        Campo.setEditable(Ativo);
    }
    
    public void EditarCampoDeTexto(String NomeCampo, String Valor) {
        JTextField Campo = (JTextField) PegarCampo(NomeCampo);
        
        Campo.setText(Valor);
    }
    
    public void EditarComboBox(String NomeCampo, Object Valor) {
        JComboBox Campo = (JComboBox) PegarCampo(NomeCampo);
    
        Campo.setSelectedItem(Valor);
    }
    
    
}
