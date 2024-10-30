/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Entities.GerenciadorProdutos;
import Entities.MenuFormulario;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        GerenciadorProdutos ControladorProdutos = new GerenciadorProdutos();
        
        String Opcoes[] = {"Adicionar produto", "Editar produto", "Remover produto"};
        
        int Selecao = JOptionPane.showOptionDialog(null, "Escolha uma opcao", "Gerenciador", 0, 0, null, Opcoes, null);
        
        if (Selecao == 0) {
            ControladorProdutos.AbrirCriacaoProduto();
            
            
        }
        
    }
}
