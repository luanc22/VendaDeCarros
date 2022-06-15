/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.vendadecarro;

/**
 *
 * @author Aluno
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ControladorVenda vendas = new ControladorVenda();
       
        Cliente cliente1 = new Cliente("Anderson", "99999-9999", "123.123.123-01", "999.999.999-1", "01/01/1990");
        
        Cliente cliente2 = new Cliente("Luan", "29999-9999", "123.123.123-02", "999.999.999-2", "01/01/1991");
        
        Carro carro1 = new Carro(2012, 2012, 30000, MarcasEnum.FIAT);
        carro1.setAcessoriosEnum(AcessoriosEnum.AR_CONDICIONADO, AcessoriosEnum.RODA_DE_LIGA);
        
        Carro carro2 = new Carro(2022, 2022, 100000, MarcasEnum.CHEVROLET);
        carro2.setAcessoriosEnum(AcessoriosEnum.AR_CONDICIONADO, AcessoriosEnum.ALARME);
        
        Venda venda1 = new Venda(1, carro1, cliente1);
        
        Venda venda2 = new Venda(2, carro2, cliente2);
        
        vendas.registrarVendas(venda1);
        
        vendas.registrarVendas(venda2);
        
        System.out.println("Duas vendas que foram registradas: ");
        vendas.mostrarVendasDescrescente();
        
        System.out.println("Soma das vendas: " + vendas.somarValorVendas());
        
        vendas.removerPorCodigo(1);
        
        System.out.println("");
        
        System.out.println("Vendas sem a venda 1 que foi removida: ");
        vendas.mostrarVendasDescrescente();
        
        System.out.println("Fim.");             
    }   
}
