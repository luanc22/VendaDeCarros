/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vendadecarro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Aluno
 */
public class ControladorVenda {
    private ArrayList<Venda> vendas = new ArrayList<>();

    public ArrayList<Venda> getVendas() {
        return vendas;
    }
    
    public void registrarVendas(Venda venda){
        this.vendas.add(venda);
    }
    
    public Venda buscarPorCodigo(int codigo){
        for(Venda venda : vendas){
            if(venda.getCodigo() == codigo){
                return venda;
            }
        }
        return null;
    }

    public double somarValorVendas(){
        double somaTotal = 0;
        for(Venda venda : vendas){
            somaTotal = somaTotal + venda.getCarro().getValor();
        }
        return somaTotal;
    }
            
    public void removerPorCodigo(int codigo){
        Venda vendaRemover = buscarPorCodigo(codigo);
        if(vendaRemover != null){
            this.vendas.remove(vendaRemover);
        }
        else{
            System.out.println("Venda " + codigo + "não encontrado!");
        }
    }
    
    public void mostrarVendasDescrescente() {
        ArrayList<Venda> vendasOrdenadas = new ArrayList<>(vendas);
        Collections.sort(vendasOrdenadas, new Comparator<Venda>() {
            @Override
            public int compare(Venda venda1, Venda venda2) {
                return Double.valueOf(venda1.getCarro().getValor()).compareTo(Double.valueOf(venda2.getCarro().getValor()));
            }
        });

        for(Venda venda: vendasOrdenadas){
            System.out.println(venda.toString());
            System.out.println("-------------------");
        }
    }
}
