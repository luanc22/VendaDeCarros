/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vendadecarro;

/**
 *
 * @author Aluno
 */
public enum AcessoriosEnum {
    VIDRO_ELETRICO(400),AR_CONDICIONADO(5000),ALARME(600),RODA_DE_LIGA(1000);
    
    private double valor;

   
    private AcessoriosEnum(double valor){
        this.valor = valor;
    }
     public double getValor() {
        return valor;
    }
    
}