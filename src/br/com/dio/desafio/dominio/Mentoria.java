package br.com.dio.desafio.dominio;

import java.time.LocalDate;

/**
 * Classe que representa uma Mentoria, que é um tipo de Conteudo.
 */
public class Mentoria extends Conteudo{

    private LocalDate data;

    /**
     * Construtor da classe Mentoria.
     */
    public Mentoria() {
    }

    /**
     * Calcula o XP da mentoria, somando o XP padrão com 20.
     *
     * @return XP da mentoria.
     */
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    /**
     * Retorna a data da mentoria.
     *
     * @return data da mentoria.
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * Define a data da mentoria.
     *
     * @param data data da mentoria.
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    /**
     * Retorna uma representação textual da mentoria.
     *
     * @return representação textual da mentoria.
     */
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}