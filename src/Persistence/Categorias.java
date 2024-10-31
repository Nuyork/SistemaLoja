/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;

import Entities.Fornecedor;
import Entities.Categoria;
import java.util.HashMap;

/**
 *
 * @author user
 */
public class Categorias {
    private static HashMap<String, Categoria> ListaCategorias = new HashMap();    
    
    
    public static void AdicionarCategoria(Categoria NovaCategoria) {
        ListaCategorias.put(NovaCategoria.getNome(), NovaCategoria);
    }

    public static HashMap<String, Categoria> getListaCategorias() {
        return ListaCategorias;
    }
    
}
