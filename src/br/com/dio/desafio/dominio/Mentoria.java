package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    private String titulo;
    private String descricao;

    public Mentoria() {
    }

    private  int LocalDate;



    public int getLocalDate() {
        return LocalDate;
    }

    public void setLocalDate(int localDate) {
        LocalDate = localDate;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", LocalDate=" + LocalDate +
                '}';
    }

    public void setData(java.time.LocalDate now) {
    }
}
