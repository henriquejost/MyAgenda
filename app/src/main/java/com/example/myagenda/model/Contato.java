package com.example.myagenda.model;

import java.io.Serializable;

public class Contato implements Serializable {

    private int id;
    private String nome;
    private String email;    // Mudei a ordem aqui para ficar organizado
    private String telefone;
    private String foto;

    // Construtor vazio
    public Contato() {
    }

    // CONSTRUTOR 1: Para ADICIONAR (sem ID)
    // ATENÇÃO: Corrigi a ordem para (nome, email, telefone) igual ao seu Controller
    public Contato(String nome, String email, String telefone, String foto) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.foto = foto;
    }

    // CONSTRUTOR 2: Para ATUALIZAR (com ID)
    // Este é o construtor que estava faltando e causava o erro
    public Contato(int id, String nome, String email, String telefone, String foto) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.foto = foto;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    // Método toString() é útil para visualizar o nome na lista simples se usar ArrayAdapter padrão
    @Override
    public String toString() {
        return nome;
    }
}