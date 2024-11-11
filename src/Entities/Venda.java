/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.util.HashMap;

/**
 *
 * @author user
 */
public class Venda {
    private Integer Valor;
    private Integer QuantidadeProdutos;
    private HashMap<String, Integer> ProdutosVendidos;

    public Integer getValor() {
        return Valor;
    }

    public void setValor(Integer Valor) {
        this.Valor = Valor;
    }

    public Integer getQuantidadeProdutos() {
        return QuantidadeProdutos;
    }

    public void setQuantidadeProdutos(Integer QuantidadeProdutos) {
        this.QuantidadeProdutos = QuantidadeProdutos;
    }

    public HashMap<String, Integer> getProdutosVendidos() {
        return ProdutosVendidos;
    }

    public void setProdutosVendidos(HashMap<String, Integer> ProdutosVendidos) {
        this.ProdutosVendidos = ProdutosVendidos;
    }
    
    
}
