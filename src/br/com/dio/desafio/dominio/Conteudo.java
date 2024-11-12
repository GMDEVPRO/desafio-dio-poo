package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public abstract class Conteudo {

    protected   static final double XP_PADRAO = 10d;
    protected LocalDate date;
    protected Object data;


    private  String titulo;
    private  String descricao;

    public abstract double calcularxp();


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescrcao(String descricao) {
        this.descricao = descricao;
    }


}


