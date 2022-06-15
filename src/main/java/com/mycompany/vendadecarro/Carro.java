/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vendadecarro;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Aluno
 */
public class Carro {
    private int anoModelo;
    private int anoFabricacao;
    private double valorOriginal;
    private MarcasEnum marca;
    private ArrayList<AcessoriosEnum> acessorios;

    public Carro(int anoModelo, int anoFabricacao, double valorOriginal, MarcasEnum marca) {
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
        this.valorOriginal = valorOriginal;
        this.marca = marca;
    }
    

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getValorOriginal() {
        return valorOriginal;
    }

    public void setValorOriginal(double valorOriginal) {
        this.valorOriginal = valorOriginal;
    }

    public MarcasEnum getMarca() {
        return marca;
    }

    public void setMarca(MarcasEnum marca) {
        this.marca = marca;
    }

     public void setAcessoriosEnum(AcessoriosEnum... acessorios) {
        this.acessorios = new ArrayList<>(Arrays.asList(acessorios));
    }
    
    public void addAcessoriosEnum(AcessoriosEnum acessorio) {
        this.acessorios.add(acessorio);
    }
    
    public double getValor() {
        double soma = valorOriginal;
        
        for (AcessoriosEnum acessorio : this.acessorios) {
            soma += acessorio.getValor();
        }
        
        return soma;
    }

    @Override
    public String toString() {
        return "Carro: \nAno de Modelo: " + anoModelo + "\n Ano de Fabricação: " + anoFabricacao + "\n Valor Original: " + valorOriginal + "\n Marca: " + marca + "\n Acessorios: " + acessorios;
    }
    
    
}

