package br.senai.model;

public class Cartão {

    private String nomett;
    private int numerott;
    private int cv;
    private String cpf;
    private String operadora;

    public String getNomett() {
        return nomett;
    }

    public void setNomett(String nomett) {
        this.nomett = nomett;
    }

    public int getNumerott() {
        return numerott;
    }

    public void setNumerott(int numerott) {
        this.numerott = numerott;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }
}
