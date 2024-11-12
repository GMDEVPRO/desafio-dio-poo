package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHorario;

    @Override
    public double calcularxp() {
        return  XP_PADRAO * cargaHorario;
    }

    public Curso() {
    }

    public int getCargaHorario(int i) {
        return cargaHorario;
    }

    public void setCargaHorario(int cargaHorario) {
        this.cargaHorario = cargaHorario;
    }

    @java.lang.Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHorario=" + cargaHorario +
                '}';
    }

}
