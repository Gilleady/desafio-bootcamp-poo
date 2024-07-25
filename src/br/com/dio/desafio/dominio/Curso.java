package br.com.dio.desafio.dominio;

/**
 * Classe que representa um Curso, que é um tipo de Conteudo.
 */
public class Curso extends Conteudo{

    private int cargaHoraria;

    /**
     * Construtor da classe Curso.
     */
    public Curso() {
    }

    /**
     * Calcula o XP do curso, multiplicando o XP padrão pela carga horária.
     *
     * @return XP do curso.
     */
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    /**
     * Retorna a carga horária do curso.
     *
     * @return carga horária do curso.
     */
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * Define a carga horária do curso.
     *
     * @param cargaHoraria carga horária do curso.
     */
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    /**
     * Retorna uma representação textual do curso.
     *
     * @return representação textual do curso.
     */
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}