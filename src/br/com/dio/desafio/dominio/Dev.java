package br.com.dio.desafio.dominio;

import java.util.*;

/**
 * Classe que representa um Dev, que pode se inscrever em um Bootcamp, progredir em seus conteúdos
 * e calcular seu XP total.
 */
public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    /**
     * Método para inscrever um Dev em um Bootcamp.
     *
     * @param bootcamp Bootcamp a ser inscrito.
     */
    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    /**
     * Método para progredir um Dev em seus conteúdos, marcando o conteúdo atual como concluído
     * e removendo-o da lista de conteúdos inscritos.
     */
    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    /**
     * Método para calcular o XP total de um Dev, somando o XP de todos os conteúdos concluídos.
     *
     * @return XP total do Dev.
     */
    public double calcularTotalXp() {
        Iterator<Conteudo> iterator = this.conteudosConcluidos.iterator();
        double soma = 0;
        while(iterator.hasNext()){
            double next = iterator.next().calcularXp();
            soma += next;
        }
        return soma;

        /*return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();*/
    }


    /**
     * Retorna o nome do Dev.
     *
     * @return nome do Dev.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do Dev.
     *
     * @param nome nome do Dev.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o conjunto de conteúdos inscritos do Dev.
     *
     * @return conjunto de conteúdos inscritos do Dev.
     */
    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    /**
     * Define o conjunto de conteúdos inscritos do Dev.
     *
     * @param conteudosInscritos conjunto de conteúdos inscritos do Dev.
     */
    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    /**
     * Retorna o conjunto de conteúdos concluídos do Dev.
     *
     * @return conjunto de conteúdos concluídos do Dev.
     */
    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    /**
     * Define o conjunto de conteúdos concluídos do Dev.
     *
     * @param conteudosConcluidos conjunto de conteúdos concluídos do Dev.
     */
    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    /**
     * Verifica se o objeto é igual a outro.
     *
     * @param o objeto a ser comparado.
     * @return true se os objetos forem iguais, false caso contrário.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    /**
     * Retorna o código hash do objeto.
     *
     * @return código hash do objeto.
     */
    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}