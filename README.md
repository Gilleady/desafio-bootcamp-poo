## README.md

### Projeto Acadêmico: Sistema de Gerenciamento de Bootcamp

Este projeto acadêmico consiste em um sistema básico de gerenciamento de Bootcamp, 
utilizando a linguagem Java. O objetivo é simular a inscrição de devs em um Bootcamp, o 
progresso em seus conteúdos (cursos e mentorias) e o cálculo do XP acumulado.

**Funcionalidades:**

* **Bootcamp:** Criação de um Bootcamp com nome, descrição, data de início e término, 
  lista de devs inscritos e conteúdos.
* **Conteúdos:** Modelagem de cursos e mentorias, ambos com título, descrição e
  método para calcular XP. Cursos possuem carga horária e mentorias possuem data.
* **Dev:** Representação de um desenvolvedor, com nome, lista de conteúdos inscritos 
  e concluídos, e método para calcular XP total.
* **Inscrição:** Devs podem se inscrever em um Bootcamp, recebendo acesso a todos os
  conteúdos.
* **Progressão:** Devs podem progredir em seus conteúdos, marcando-os como concluídos.
* **Cálculo de XP:**  O XP de cada conteúdo é calculado e somado para determinar o XP
  total de um Dev.

**Exemplo de uso:**

O código `Main.java` demonstra um exemplo básico de como usar as classes:

1. Criação de cursos, mentorias e um Bootcamp.
2. Inscrição de dois devs no Bootcamp.
3. Progressão dos devs em seus conteúdos.
4. Cálculo do XP total dos devs.

### Observações

* Este projeto é um exemplo básico e pode ser expandido com mais funcionalidades.
* O código é bem documentado com comentários para melhor compreensão.