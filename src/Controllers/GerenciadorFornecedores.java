/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Entities.Fornecedor;
import Persistence.Fornecedores;

/**
 *
 * @author User
 */
public class GerenciadorFornecedores {
    public static void CriarFornecedor(String Nome) {
        Fornecedor NovoFornecedor = new Fornecedor(Nome);
            
        Fornecedores.AdicionarFornecedor(NovoFornecedor);
    }
}
