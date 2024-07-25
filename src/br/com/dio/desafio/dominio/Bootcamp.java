package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Classe que representa um Bootcamp, contendo informações sobre o nome, descrição,
 * data de início, data de término, devs inscritos e conteúdos.
 */
public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    /**
     * Retorna o nome do Bootcamp.
     *
     * @return nome do Bootcamp.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do Bootcamp.
     *
     * @param nome nome do Bootcamp.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna a descrição do Bootcamp.
     *
     * @return descrição do Bootcamp.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do Bootcamp.
     *
     * @param descricao descrição do Bootcamp.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Retorna a data de início do Bootcamp.
     *
     * @return data de início do Bootcamp.
     */
    public LocalDate getDataInicial() {
        return dataInicial;
    }

    /**
     * Retorna a data de término do Bootcamp.
     *
     * @return data de término do Bootcamp.
     */
    public LocalDate getDataFinal() {
        return dataFinal;
    }

    /**
     * Retorna o conjunto de devs inscritos no Bootcamp.
     *
     * @return conjunto de devs inscritos no Bootcamp.
     */
    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    /**
     * Define o conjunto de devs inscritos no Bootcamp.
     *
     * @param devsInscritos conjunto de devs inscritos no Bootcamp.
     */
    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    /**
     * Retorna o conjunto de conteúdos do Bootcamp.
     *
     * @return conjunto de conteúdos do Bootcamp.
     */
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    /**
     * Define o conjunto de conteúdos do Bootcamp.
     *
     * @param conteudos conjunto de conteúdos do Bootcamp.
     */
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
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
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    /**
     * Retorna o código hash do objeto.
     *
     * @return código hash do objeto.
     */
    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }
}