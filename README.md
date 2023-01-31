# ⚡ PROJETO - Calculadora de Resistência Equivalente
Uma calculadora capaz de calcular a resistência equivalente de resistores pertencentes à um circuito elétrico

## 💽 Tech Stack
  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)

## 📁 A estrutura do projeto

 - `bin` - pasta com as classes binárias criadas pelo Java;
 - `lib` - contém as bibliotecas utilizadas no projeto;
 - `src` - contém os códigos fontes do projeto;

 
 ## 📜 Descrição
 
 Com esta calculadora, é possível calcular a resistência equivalente de um circuito a partir de parâmetros fornecidos pelo usuário como o tipo de associação entre os resistores, o número de resistores por associação e o valor da resistência de cada um em ***ohms* (Ω)**.
 
 As operações matemáticas são realizadas com base nas equações básicas para o cálculo da resistência equivalente:
 - **Associação em Sequência**: $Req = R1 + R2 + R3 + ... + Rn$
 - **Associação em Paralelo**: ${1\over Req} = {1\over R1} + {1\over R2} + {1\over R3} + ... + {1\over Rn}$
