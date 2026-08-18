package br.com.senai.patrimonio.model;

import jakarta.persistence.Embedded;

public class Bloco {

    private Long id;
    private String nome;

    public Bloco(){}

    public Bloco (Long id, String nome){
        this.id = id;
        this.nome = nome;
    }
    @Embedded
    private Empresa empresa;
}


