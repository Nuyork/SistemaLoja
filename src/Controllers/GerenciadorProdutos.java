/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Controllers.Estoque;
import Entities.Categoria;
import Entities.Fornecedor;
import Entities.MenuFormulario;
import Entities.MenuSelecao;
import Entities.Produto;
import Persistence.Categorias;
import Persistence.Fornecedores;
import Persistence.Produtos;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class GerenciadorProdutos {
    private final MenuFormulario Menu;
    private final MenuSelecao MenuProdutos;
    
    public GerenciadorProdutos() {
        Menu = new MenuFormulario();
        MenuProdutos = new MenuSelecao();
        
        String Opcoes[] = {};
        
        Menu.CriarCampoDeTexto("Nome");
        Menu.CriarCampoDeTexto("Preco");
        Menu.CriarCampoDeTexto("Quantidade");
        Menu.CriarCampoDeTexto("Minimo");
        Menu.CriarCampoDeTexto("Codigo");
        Menu.CriarComboBox("Fornecedor", Opcoes);
        Menu.CriarComboBox("Categoria", Opcoes);
        MenuProdutos.CriarCampoDeSelecao("Produtos", Opcoes);
    }
    
    public MenuFormulario GetMenu() {
        return Menu;
    }
    
    public void AtualizarCampoDeFornecedores() {
        JComboBox CampoFornecedores = (JComboBox) Menu.PegarCampo("Fornecedores");
        DefaultComboBoxModel FornecedoresModel = (DefaultComboBoxModel) CampoFornecedores.getModel();
        FornecedoresModel.removeAllElements();
        
        for (Map.Entry<String, Fornecedor> en : Fornecedores.getListaFornecedores().entrySet()) {
            Fornecedor Value = en.getValue();
            
            FornecedoresModel.addElement(Value.getNome());
        }
    }
    
    public void AtualizarCampoDeCategorias() {
        JComboBox CampoCategorias = (JComboBox) Menu.PegarCampo("Categorias");
        DefaultComboBoxModel CategoriasModel = (DefaultComboBoxModel) CampoCategorias.getModel();
        CategoriasModel.removeAllElements();
        
        /*for (Map.Entry<String, Categoria> en : Categoria.getListaFornecedores().entrySet()) {
            String Key = en.getKey();
            Fornecedor Value = en.getValue();
            
            CategoriasModel.addElement(Value.getName());
        }*/
    }
         
    public void AbrirCriacaoProduto() {
        Menu.AtualizarComboBox("Fornecedor", Fornecedores.getListaFornecedores().values().toArray());
        Menu.AtualizarComboBox("Categoria", Categorias.getListaCategorias().values().toArray());
        
        Menu.ToggleCampo("Nome", true);
        Menu.LimparCampos();
        
        Integer Opcao = Menu.Mostrar("Criando produto");

        if (Opcao == JOptionPane.YES_OPTION) {
            String Nome = Menu.PegarValorDoCampo("Nome");
            String Codigo = Menu.PegarValorDoCampo("Codigo");
            String NomeFornecedor = Menu.PegarValorDoCampo("Fornecedor");
            String NomeCategoria = Menu.PegarValorDoCampo("Categoria");
            Float Preco = null;
            Float Quantidade = null;
            Float Minimo = null;
            
            Fornecedor FornecedorSelecionado = Fornecedores.getListaFornecedores().get(NomeFornecedor);
            Categoria CategoriaSelecionada = Categorias.getListaCategorias().get(NomeCategoria);
            
            try{
                Preco = Float.valueOf(Menu.PegarValorDoCampo("Preco"));
                Minimo = Float.valueOf(Menu.PegarValorDoCampo("Minimo"));
                Quantidade = Float.valueOf(Menu.PegarValorDoCampo("Quantidade"));
            }catch(Exception Ex) {
                if (Preco == null) {
                    Preco = 0f;
                }
                
                if (Quantidade == null) {
                    Quantidade = 0f;
                }
                
                if (Minimo == null) {
                    Minimo = 0f;
                }
            }

            if (Nome.isBlank()) {
                System.out.println("Nome nao pode ser vazio");
            }
            
            
            Produto NovoProduto = new Produto(Nome, Quantidade, Minimo, Preco, Codigo, FornecedorSelecionado, CategoriaSelecionada);
            Produtos.AdicionarFornecedor(NovoProduto);
        }
    }
    
    public void AbrirEdicaoDeProduto() {
        MenuProdutos.AtualizarComboBox("Produtos", Produtos.getListaProdutos().values().toArray());
        
        int Opcao = MenuProdutos.Mostrar("Selecione um produto para editar");
        
        if (Opcao != JOptionPane.OK_OPTION) {
            return;
        }
        
        Produto ProdutoSelecionado = Produtos.getListaProdutos().get(MenuProdutos.PegarValorDoCampo("Produtos"));
        
        JTextField NomeCampo = (JTextField) Menu.PegarCampo("Nome");
        NomeCampo.setEditable(false);
        
        Menu.ToggleCampo("Nome", false);
        
        Menu.EditarCampoDeTexto("Nome", ProdutoSelecionado.getNome());
        Menu.EditarCampoDeTexto("Codigo", ProdutoSelecionado.getCodigo());
        Menu.EditarCampoDeTexto("Preco", ProdutoSelecionado.getPreco().toString());
        Menu.EditarCampoDeTexto("Minimo", ProdutoSelecionado.getMinimo().toString());
        Menu.EditarCampoDeTexto("Quantidade", ProdutoSelecionado.getQuantidade().toString());
        Menu.EditarComboBox("Fornecedor", ProdutoSelecionado.getFornecedor().getNome());
        
        Opcao = Menu.Mostrar("Editando produto: " + ProdutoSelecionado.getNome());
        
        if (Opcao != JOptionPane.OK_OPTION) {
            return;
        }
        
        //String Nome = Menu.PegarValorDoCampo("Nome");
        String Codigo = Menu.PegarValorDoCampo("Codigo");
        String NomeFornecedor = Menu.PegarValorDoCampo("Fornecedor");
        String NomeCategoria = Menu.PegarValorDoCampo("Categoria");
        Float Preco = null;
        Float Quantidade = null;
        Float Minimo = null;

        Fornecedor FornecedorSelecionado = Fornecedores.getListaFornecedores().get(NomeFornecedor);
        Categoria CategoriaSelecionada = Categorias.getListaCategorias().get(NomeCategoria);

        try{
            Preco = Float.valueOf(Menu.PegarValorDoCampo("Preco"));
            Minimo = Float.valueOf(Menu.PegarValorDoCampo("Minimo"));
            Quantidade = Float.valueOf(Menu.PegarValorDoCampo("Quantidade"));
        }catch(Exception Ex) {
            if (Preco == null) {
                Preco = 0f;
            }

            if (Quantidade == null) {
                Quantidade = 0f;
            }

            if (Minimo == null) {
                Minimo = 0f;
            }
        }

        /*if (Nome.isBlank()) {
            System.out.println("Nome nao pode ser vazio");
        }*/
        
        //ProdutoSelecionado.setNome(Nome);
        ProdutoSelecionado.setCodigo(Codigo);
        ProdutoSelecionado.setQuantidade(Quantidade);
        ProdutoSelecionado.setMinimo(Minimo);
        ProdutoSelecionado.setPreco(Preco);
        ProdutoSelecionado.setFornecedor(FornecedorSelecionado);
        ProdutoSelecionado.setCategoria(CategoriaSelecionada);
    }
}
