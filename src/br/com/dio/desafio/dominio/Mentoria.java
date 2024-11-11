package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    public Object setDate;
    private String titulo;
    private String descricao;
    private LocalDate date;

    public Mentoria() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + date +
                '}';
    }


    public void setDate(java.time.LocalDate date) {
        this.date = date;
    }

    public java.time.LocalDate getDate() {
        return date;
    }
}