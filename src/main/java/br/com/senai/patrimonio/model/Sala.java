package br.com.senai.patrimonio.model;

public class Sala {
    private Long id;
    private String nome;
    private String qrCode;
    private Bloco Bloco;
    private Empresa Empresa;


    public Sala(){}
    public Sala (Long id, String nome, String qrCode, Bloco bloco, Empresa empresa){
        this.id = id;
        this.nome = nome;
        this.qrCode = qrCode;
        this.Bloco = bloco;
        this.Empresa= empresa;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public Bloco getBloco() {
        return Bloco;
    }

    public void setBloco(Bloco bloco) {
        Bloco = bloco;
    }

    public Empresa getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(Empresa empresa) {
        Empresa = empresa;
    }
}