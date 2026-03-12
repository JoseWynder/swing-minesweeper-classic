<h1 align="center">Swing Minesweeper Classic</h1>

<p align="center">
Implementação do clássico Campo Minado utilizando Java puro e Swing.
</p>

---

## 📌 Sobre o Projeto

Este projeto consiste em uma implementação do clássico jogo Campo Minado utilizando Java e Swing para construção da interface gráfica.

A aplicação foi inicialmente desenvolvida em versão console e posteriormente evoluída para uma interface desktop, permitindo trabalhar tanto a lógica do jogo quanto conceitos de organização de código orientado a objetos.

O projeto foi estruturado com separação entre modelo e visão, permitindo que a lógica de domínio permaneça desacoplada da interface gráfica.

---

## ⚙️ Tecnologias Utilizadas

* Java
* Swing
* Programação Orientada a Objetos
* Padrão Observer

O projeto não utiliza frameworks ou ferramentas de build como Maven ou Gradle, sendo construído apenas com recursos nativos da linguagem.

---

## 🧱 Arquitetura

A aplicação foi organizada em duas camadas principais:

**Modelo**

Responsável pelas regras de negócio do jogo, incluindo:

* controle de estado dos campos
* distribuição de minas
* lógica de abertura de campos adjacentes
* emissão de eventos para atualização da interface

**Visão**

Responsável pela interface gráfica da aplicação, incluindo:

* renderização visual dos campos
* interação do usuário com o tabuleiro
* atualização da interface com base nos eventos emitidos pelo modelo

A comunicação entre as camadas ocorre através do padrão **Observer**, permitindo desacoplamento entre lógica de domínio e interface.

---

## 🗂️ Estrutura do Projeto

```
src
 └─ br.com.josewynder.campominado
     │
     ├─ CampoMinado.java
     │
     ├─ modelo
     │   ├─ Campo.java
     │   ├─ CampoEvento.java
     │   ├─ CampoObservador.java
     │   ├─ ResultadoEvento.java
     │   └─ Tabuleiro.java
     │
     ├─ visao
     │   ├─ BotaoCampo.java
     │   └─ PainelTabuleiro.java
     │
     └─ resources
         └─ images
             ├─ bomb.png
             └─ minesweeper_flag.png
```

---

## 🖼️ Demonstração

### Execução do jogo

Exemplo do jogo em execução com campos já revelados durante uma partida.

<img width="999" height="577" alt="Captura de tela 2026-02-20 181805" src="https://github.com/user-attachments/assets/98681e16-50e2-4188-8fa4-c723657fb72b" />

---

### Resultados possíveis

Exemplo das telas exibidas quando o jogador vence ou perde a partida.

<img width="999" height="1138" alt="Captura de tela 2026-02-22 231549" src="https://github.com/user-attachments/assets/44ad40f7-6417-4774-911c-8fc0cbccd43c" />

---

### Fluxo arquitetural e eventos

Diagrama representando o fluxo de interação entre usuário, interface gráfica e lógica do jogo.

O fluxo segue o seguinte processo:

1. O usuário interage com um campo da interface
2. O botão correspondente dispara um evento para o modelo
3. O campo atualiza seu estado e notifica os observadores
4. A interface gráfica atualiza a representação visual
5. O tabuleiro verifica as condições globais de vitória ou derrota
6. O resultado é propagado para a interface

<img width="1342" height="929" alt="Captura de tela 2026-02-23 195710" src="https://github.com/user-attachments/assets/58ec41b7-d7ec-4d4d-b687-7a9b665f88bb" />

---

## 🎯 Objetivo do Projeto

Este projeto foi desenvolvido como exercício para reforçar fundamentos de programação em Java, incluindo modelagem de domínio, tratamento de eventos e organização de aplicações desktop utilizando Swing.

A implementação do Campo Minado serviu como base para experimentar conceitos de arquitetura simples, separação de responsabilidades e comunicação orientada a eventos entre componentes da aplicação.
