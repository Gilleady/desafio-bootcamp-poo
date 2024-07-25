package br.com.dio.desafio.dominio;

/**
 * Classe abstrata que representa um conteúdo, como um curso ou mentoria.
 */
public abstract class Conteudo {

    /**
     * XP padrão para um conteúdo.
     */
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    /**
     * Método abstrato para calcular o XP de um conteúdo.
     *
     * @return XP do conteúdo.
     */
    public abstract double calcularXp();

    /**
     * Retorna o título do conteúdo.
     *
     * @return título do conteúdo.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define o título do conteúdo.
     *
     * @param titulo título do conteúdo.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Retorna a descrição do conteúdo.
     *
     * @return descrição do conteúdo.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do conteúdo.
     *
     * @param descricao descrição do conteúdo.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}