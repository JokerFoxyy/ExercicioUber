/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Victor
 */
public class Motorista {
     private String nome;
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        if(nome.length() != 0){
           this.nome = nome;
        }
       
    }
    public Motorista(String nome) {
         if(nome.length() != 0){
           this.nome = nome;
        }
    }
}
