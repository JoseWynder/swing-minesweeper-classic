<h1 align="center">Swing Minesweeper Classic</h1>

<p align="center">
Implementação do clássico Campo Minado utilizando Java puro e Swing.
</p>

---

## <p align="center">📌 Sobre</p>

<p align="center">
Projeto desktop desenvolvido com foco em fundamentos de programação orientada a objetos,
modelagem de regras de negócio e construção de interfaces gráficas utilizando Swing.
</p>

<p align="center">
A aplicação representa uma versão funcional do jogo Campo Minado,
estruturada com separação clara entre modelo e visão.
</p>

---

## <p align="center">⚙️ Tecnologias Utilizadas</p>

<p align="center">
Java • Swing • Programação Orientada a Objetos • Padrão Observer
</p>

<p align="center">
Não utiliza frameworks ou ferramentas de build como Maven ou Gradle.
</p>

---

## <p align="center">🧱 Arquitetura</p>

<p align="center">
<strong>Modelo</strong><br>
Responsável pela regra de negócio do jogo, incluindo controle de estado dos campos, 
distribuição de minas, lógica de abertura de campos adjacentes e emissão de eventos.
</p>

<p align="center">
<strong>Visão</strong><br>
Responsável pela interface gráfica, contemplando a representação visual dos campos, 
interação do usuário e atualização da interface com base nos eventos emitidos pelo modelo.
</p>

<p align="center">
A comunicação entre as camadas ocorre por meio do padrão <strong>Observer</strong>, 
permitindo desacoplamento entre lógica de domínio e interface gráfica.
</p>

---

## <p align="center">🎯 Conceitos Trabalhados</p>

<p align="center">
Modelagem de domínio • Encapsulamento • Coesão • Tratamento de eventos •
Controle de estado • Separação de responsabilidades • GUI com Swing
</p>

---

## <p align="center">🔍 Pontos de Evolução Identificados</p>

<p align="center">
Durante o desenvolvimento, foram identificadas possíveis melhorias na lógica do jogo:
</p>

<p align="center">
• Garantir que o primeiro clique nunca seja em uma mina<br>
• Garantir que o primeiro clique abra a maior área possível<br>
• Evitar estados logicamente inconsistentes onde não há decisão segura possível
</p>

<p align="center">
Essas melhorias não foram implementadas nesta versão, mas foram analisadas como exercício
de reflexão sobre modelagem e regras de negócio.
</p>

---

## <p align="center">🚀 Objetivo do Projeto</p>

<p align="center">
Consolidar fundamentos sólidos em Java, lógica de programação e construção
de aplicações desktop organizadas de forma clara e coesa.
</p>

---

<p align="center">
<em>Uma implementação clássica para reforçar base técnica em Java e arquitetura simples para aplicações desktop.</em>
</p>
