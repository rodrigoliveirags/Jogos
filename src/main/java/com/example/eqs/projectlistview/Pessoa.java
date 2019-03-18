package com.example.eqs.projectlistview;

public class Pessoa {
    private Integer id;
    private String nome;
    private int idade;
    private String cpf;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getId() {

        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public Pessoa(Integer id, String nome, int idade, String cpf) {

        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public Pessoa() {

    }
    @Override
    public String toString(){
        return ("Nome:" + nome +"\n" + "CPF:" + cpf);
    }
}
