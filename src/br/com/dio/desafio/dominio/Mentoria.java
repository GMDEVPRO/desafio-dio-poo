package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    @Override
    public double calcularxp() {
        return  XP_PADRAO + 20d;
    }
    public Mentoria() {
    }

    public LocalDate getDate(LocalDate data) {
        return data;
    }


    public void setDate(java.time.LocalDate data) {
        this.date = data;
    }

    public java.time.LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", date=" + date +
                '}';
    }


}