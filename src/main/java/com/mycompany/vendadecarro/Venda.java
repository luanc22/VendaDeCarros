/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vendadecarro;

/**
 *
 * @author Aluno
 */
public class Venda {
    private int codigo;
    private Carro carro;
    private Cliente cliente;

    public Venda(int codigo, Carro carro, Cliente cliente) {
        this.codigo = codigo;
        this.carro = carro;
        this.cliente = cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Venda " + codigo + "\n\n" + carro.toString() + "\n\n" + cliente.toString()+ "\n";
    }    
}
