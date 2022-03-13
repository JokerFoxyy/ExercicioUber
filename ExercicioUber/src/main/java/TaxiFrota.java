/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Victor
 */
public class TaxiFrota implements Frota{
    Integer numero;
    Double valorAluguel;
    
    public Double aluguel() {
        return this.valorAluguel;
    }
    public TaxiFrota(Integer numero, Double preco) {
        this.numero = numero;
        this.valorAluguel = preco;
    }
}
