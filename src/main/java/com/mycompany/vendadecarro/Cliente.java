
package com.mycompany.vendadecarro;

public class Cliente {
    private int codigo;
    private String nome;
    private String telefone;
    private String cpf;
    private String rg;
    private String dataNascimento;
    static int contador = 1;
    
    public Cliente(String nome, String telefone, String cpf, String rg, String dataNascimento) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento; 
        if(contador == 1){
            codigo = contador;
        }else{
            codigo = contador + 1;   
        }
        contador += 9;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Cliente " + codigo + ": \n\n" + "Nome: " + nome + ".\n" + "Telefone: " + telefone + ".\n" + "CPF: " + cpf + ".\n" + "RG: " + rg + ".\n" + "Data de Nascimento: " + dataNascimento + ".\n";
    }
    
    
    
    
}
