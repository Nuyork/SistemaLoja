/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Entities.MenuFormulario;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        Estoque NovoEstoque = new Estoque();
        
        MenuFormulario MenuEstoque = NovoEstoque.getMenu();
        MenuEstoque.Mostrar();
        System.out.println(MenuEstoque.PegarValorDoCampo("Fornecedores"));
        
        
    }
}
