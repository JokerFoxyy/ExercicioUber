/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.time.LocalDateTime;
/**
 *
 * @author Arthur
 */
public class Corrida {
    private Double valor;
    private LocalDateTime inicio;
    private LocalDateTime termino;
    private Passageiro passageiro;
    private Motorista  motorista;
    private TaxiFrota taxiFrota;
    public Double getValor() {
        return this.valor;
    }
    
    public void setValor(Double value) {
        if(valor != 0){
           this.valor = value;
        }
    }
      public LocalDateTime getInicio() {
        return this.inicio;
    }
    
    public void setInicio(LocalDateTime begin) {
           this.inicio = begin;
    }

    public LocalDateTime getTermino() {
          return this.termino;
    }

    public void setTermino(LocalDateTime finished) {

           this.termino = finished;
    }
    public Corrida(Double value, LocalDateTime begining, LocalDateTime finished, Passageiro passenger, Motorista driver, TaxiFrota taxiFrotaP) {
     this.valor      = value;
     this.inicio     = begining;
     this.termino    = finished;
     this.passageiro = passenger;
     this.motorista = driver;
     this.taxiFrota = taxiFrotaP;
    }
}
    
