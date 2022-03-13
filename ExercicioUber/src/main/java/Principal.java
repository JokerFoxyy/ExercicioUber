/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.time.LocalDateTime;
import java.util.*;
import java.time.Duration;
/**
 *
 * @author Arthur
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Motorista motorista = new Motorista("Pijas");
       TaxiFrota taxiFrota = new TaxiFrota(841, 157.85);
       
       Passageiro passageiro1 = new Passageiro("Barcos");
       Passageiro passageiro2 = new Passageiro("Marmore");
       
       Corrida corrida1 = new Corrida(18.67, LocalDateTime.of(2021, 6, 7, 6, 6), LocalDateTime.of(2021, 6, 7, 7, 26), passageiro1, motorista, taxiFrota);
       Corrida corrida2 = new Corrida(27.29, LocalDateTime.of(2021, 6, 8, 6, 6), LocalDateTime.of(2021, 6, 8, 7, 8), passageiro2, motorista, taxiFrota);
       Corrida corrida3 = new Corrida(88.17, LocalDateTime.of(2021, 6, 9, 6, 6), LocalDateTime.of(2021, 6, 9, 7, 10), passageiro1, motorista, taxiFrota);
       Corrida corrida4 = new Corrida(98.43, LocalDateTime.of(2021, 6, 10, 6, 6), LocalDateTime.of(2021, 6,10, 7, 25), passageiro2, motorista, taxiFrota);
       Corrida corrida5 = new Corrida(87.44, LocalDateTime.of(2021, 6, 11, 6, 6), LocalDateTime.of(2021, 6, 11, 7, 5), passageiro1, motorista, taxiFrota);
       List<Corrida> corridaList = new ArrayList<Corrida>();
       corridaList.add(corrida1);
       corridaList.add(corrida2);
       corridaList.add(corrida3);
       corridaList.add(corrida4);
       corridaList.add(corrida5);
       
       for(Corrida corrida : corridaList ) {
           Duration  duracao = Duration.between(corrida.getInicio(), corrida.getTermino());
           System.out.printf("Custo: " + corrida.getValor()+ " Tempo de viagem : " + duracao.toHours() + ":" + duracao.toMinutes() + ":" + duracao.toSeconds() + "\n");
       }
    }
    
}
