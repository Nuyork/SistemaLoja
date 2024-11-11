/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;

import Entities.Venda;
import java.util.HashMap;

/**
 *
 * @author user
 */
public class Vendas {
    private static HashMap<String, Venda> ListaVenda = new HashMap();
    
    public static void AdicionarVenda(Venda NovaVenda) {
        Integer Code = NovaVenda.hashCode();
        
        ListaVenda.put(Code.toString(), NovaVenda);
    }

    public static HashMap<String, Venda> getListaVenda() {
        return ListaVenda;
    }
    
}
