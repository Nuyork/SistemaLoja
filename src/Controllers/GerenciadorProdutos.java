/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Entities.Categoria;
import Entities.Fornecedor;
import Entities.Produto;
import Persistence.Categorias;
import Persistence.Produtos;

/**
 *
 * @author User
 */
public class GerenciadorProdutos {

    public static void AdicionarProduto(String Nome, Float Quantidade, Float Minimo, Float Preco, String Codigo, Fornecedor FornecedorSelecionado, Categoria CategoriaSelecionada) {
        Produto NovoProduto = new Produto(Nome, Quantidade, Minimo, Preco, Codigo, FornecedorSelecionado, CategoriaSelecionada);
        Produtos.AdicionarProduto(NovoProduto);
    }
    
    public static void RemoverProduto(String Nome) {
        if (Produtos.getListaProdutos().containsKey(Nome)) {
            Produtos.getListaProdutos().remove(Nome);
        }
    }
    
    public static void EditarProduto(Produto ProdutoSelecionado, String Codigo, Float Quantidade, Float Minimo, Float Preco, Fornecedor FornecedorSelecionado, Categoria CategoriaSelecionada) {
        ProdutoSelecionado.setCodigo(Codigo);
        ProdutoSelecionado.setQuantidade(Quantidade);
        ProdutoSelecionado.setMinimo(Minimo);
        ProdutoSelecionado.setPreco(Preco);
        ProdutoSelecionado.setFornecedor(FornecedorSelecionado);
        ProdutoSelecionado.setCategoria(CategoriaSelecionada);
    }
    
    public static void CriarCategoria(String Nome) {
        Categoria NovaCategoria = new Categoria(Nome);
        Categorias.AdicionarCategoria(NovaCategoria);
    }
    
}
