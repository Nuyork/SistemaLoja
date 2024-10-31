/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author user
 */
public class Produto {
    private String Nome;
    private Float Quantidade;
    private Float Minimo;
    private Float Preco;
    private String Codigo;
    private Fornecedor Fornecedor;
    private Categoria Categoria;

    public Produto() {
    }

    public Produto(String Nome, Float Quantidade, Float Minimo, Float Preco, String Codigo, Fornecedor Fornecedor, Categoria Categoria) {
        this.Nome = Nome;
        this.Quantidade = Quantidade;
        this.Minimo = Minimo;
        this.Preco = Preco;
        this.Codigo = Codigo;
        this.Fornecedor = Fornecedor;
        this.Categoria = Categoria;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Float getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(Float Quantidade) {
        this.Quantidade = Quantidade;
    }

    public Float getMinimo() {
        return Minimo;
    }

    public void setMinimo(Float Minimo) {
        this.Minimo = Minimo;
    }

    public Float getPreco() {
        return Preco;
    }

    public void setPreco(Float Preco) {
        this.Preco = Preco;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public Fornecedor getFornecedor() {
        return Fornecedor;
    }

    public void setFornecedor(Fornecedor Fornecedor) {
        this.Fornecedor = Fornecedor;
    }

    public Categoria getCategoria() {
        return Categoria;
    }

    public void setCategoria(Categoria Categoria) {
        this.Categoria = Categoria;
    }

    
    
    
}
