package Controllers;

import Entities.MenuFormulario;
import Entities.Produto;
import Persistence.Produtos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MenuVendas {
    private MenuFormulario Menu;
    private HashMap<String, Float> ProdutosVendidos;
    private Float ValorCompra;
    private Integer QuantidadeProdutos;
    
    public MenuVendas() {
        Menu = new MenuFormulario();
        ProdutosVendidos = new HashMap();
        ValorCompra = 0f;
        
        Menu.CriarCampoDeOpcoes("Estoque");
        JButton Adicionar = Menu.CriarBotao("Adicionar");
        
        Menu.CriarCampoDeOpcoes("Vendidos");
        JButton Botao = Menu.CriarBotao("Remover");
        
        JTextField CampoValor = Menu.CriarCampoDeTexto("Valor da compra: ");
        CampoValor.setEditable(false);
        
        Botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Selecionado = Menu.PegarValorDoCampo("Vendidos");
                
                if (Selecionado == null) {
                    return;
                }
                
                Produto ProdutoSelecionado = Produtos.getListaProdutos().get(Selecionado);
                
                JList VendidosOpcoes = (JList) Menu.PegarCampo("Vendidos");
                DefaultListModel Model = (DefaultListModel) VendidosOpcoes.getModel();
                
                Model.removeElement(Selecionado);
                
                QuantidadeProdutos -= 1;
                ValorCompra -= ProdutoSelecionado.getPreco();
                Menu.EditarCampoDeTexto("Valor da compra: ", ValorCompra + "R$");
            }
        });

        Adicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Selecionado = Menu.PegarValorDoCampo("Estoque");
                
                if (Selecionado == null) {
                    return;
                }
                
                Produto ProdutoSelecionado = Produtos.getListaProdutos().get(Selecionado);
                
                JList VendidosOpcoes = (JList) Menu.PegarCampo("Vendidos");
                DefaultListModel Model = (DefaultListModel) VendidosOpcoes.getModel();
                Model.add(0, Selecionado);
                
                QuantidadeProdutos += 1;
                ValorCompra += ProdutoSelecionado.getPreco();
                Menu.EditarCampoDeTexto("Valor da compra: ", ValorCompra + "R$");
                
                System.out.println("Button clicked!");
            }
        });
    }
    
    public void AbrirCaixa() {
        Menu.AtualizarCampoDeOpcoes("Estoque", Produtos.getListaProdutos().values().toArray());
        Integer Opcao = Menu.Mostrar("Realizando uma venda");

        if (Opcao == JOptionPane.OK_OPTION) {
            GerenciadorVendas.RegistrarVenda(ProdutosVendidos, ValorCompra, QuantidadeProdutos);
        }
    }
    
    
}
