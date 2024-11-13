package Controllers;

import Entities.MenuFormulario;
import Entities.Produto;
import Persistence.Produtos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MenuRelatoriosProdutos {
    private MenuFormulario Menu;
    
    public MenuRelatoriosProdutos() {
        Menu = new MenuFormulario();
        
        Menu.CriarLabel("Ver produtos de acordo com:");
        
        JButton BotaoPreco = Menu.CriarBotao("Preco");
        JButton BotaoMenor = Menu.CriarBotao("Menor qntd");
        JButton BotaoCategoria = Menu.CriarBotao("Categoria");
        JButton BotaoVendas = Menu.CriarBotao("Mais vendidos");
        
        /*Botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Selecionado = Menu.PegarValorDoCampo("Vendidos");
                
                if (Selecionado == null) {
                    return;
                }
                
                
            }
        });*/

        
    }
    
    public void Abrir() {
        Integer Opcao = Menu.Mostrar("Relatorios");

        if (Opcao == JOptionPane.OK_OPTION) {
            
        }
    }
    
    
}
