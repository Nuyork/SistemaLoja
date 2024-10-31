/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;

import Entities.Fornecedor;
import java.util.HashMap;

/**
 *
 * @author user
 */
public class Fornecedores {
    private static HashMap<String, Fornecedor> ListaFornecedores = new HashMap();
    
    public static void AdicionarFornecedor(Fornecedor NovoFornecedor) {
        ListaFornecedores.put(NovoFornecedor.getName(), NovoFornecedor);
    }

    public static HashMap<String, Fornecedor> getListaFornecedores() {
        return ListaFornecedores;
    }
    
}
