/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;

import Entities.Produto;
import java.util.HashMap;

/**
 *
 * @author user
 */
public class Produtos {
    private static HashMap<String, Produto> ListaProdutos = new HashMap();
    
    public static void AdicionarProduto(Produto NovoProduto) {
        ListaProdutos.put(NovoProduto.getNome(), NovoProduto);
    }

    public static HashMap<String, Produto> getListaProdutos() {
        return ListaProdutos;
    }

    
}
