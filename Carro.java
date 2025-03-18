/******** PROGRAMAÇÃO ORIENTADA A OBJETOS ************/


// CLASSE TEM QUALIDADES(ATRIBUTOS), METODOS(AÇÕES)..
// ATRIBUTOS DE UM CARRO: COR, MODELO, NUMERO DE PASSAGEIROS...

import java.text.DecimalFormat;

public class Carro{

    String cor;
    String modelo;
    int numPassageiro;
    double maxCombustivel;
    double consumoCombustivel;
    
    // construtor -- usado para inicializar 
    
    /* public Carro(String cor, String modelo, int numPassageiro,double maxCombustivel,
    double consumoCombustivel){
        this.cor = cor;
        this.modelo = modelo;
        this.numPassageiro = numPassageiro; // this referencia os atributos e metos da classe
        this.maxCombustivel = maxCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    
    
    }
    */


    // metodo
    void ExibirAutonomia(){
        System.out.println("A autonomia do carro e: " + consumoCombustivel * maxCombustivel );
    }
    
    // metodo com retorno
    double obterAutonomia(){
        System.out.println();

        return maxCombustivel * consumoCombustivel;
    }

    // metodo com parametro
    double calCombustivel(double km){

        double qtdCombustivel = km/consumoCombustivel;

        return qtdCombustivel;
    }
    
    
    public static void main(String[] args){
        Carro van = new Carro();
        van.cor = "fiat";
        van.modelo = "ducato";
        van.numPassageiro = 10;
        van.maxCombustivel = 100;
        van.consumoCombustivel = 1.2;

        System.out.println();
        System.out.println(van.modelo);

        van.ExibirAutonomia();       

        double autonomia = van.obterAutonomia(); 
        System.out.println("Autonomia com return: " + autonomia);

        double qtdCombustivel = van.calCombustivel(10);
        System.out.println(String.format("Quantidade de combustível: %.2f", qtdCombustivel));

    }


   
}