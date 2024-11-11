/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Entities.Fornecedor;
import Entities.MenuFormulario;
import Entities.MenuFormulario;
import Persistence.Fornecedores;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class MenuFornecedores {
    private MenuFormulario Menu;

    public MenuFornecedores() {
        Menu = new MenuFormulario();
        
        Menu.CriarCampoDeTexto("Nome");
    }
    
    public void AbrirCriacaoDeFornecedor() {
        Integer Opcao = Menu.Mostrar("Criando novo fornecedor");
        
        if (Opcao == JOptionPane.YES_OPTION) {
            String Nome = Menu.PegarValorDoCampo("Nome");
            
            if (Nome.isBlank()) {
                System.out.println("Nome nao pode ser vazio");
            }
            
            GerenciadorFornecedores.CriarFornecedor(Nome);
        }
    }
    
    
}
