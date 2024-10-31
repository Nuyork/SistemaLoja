/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author user
 */
public class Fornecedor {
    private String Nome;

    public Fornecedor(String Name) {
        this.Nome = Name;
    }    

    public String getNome() {
        return Nome;
    }

    @Override
    public String toString() {
        return getNome();
    }
    
    
    
    
}
