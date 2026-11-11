# Conta Bancária em Java

Projeto de estudo desenvolvido durante o curso **Java Itaú na DIO (Digital Innovation One)**, para praticar **Programação Orientada a Objetos (POO)** e lógica de programação.

O programa simula uma conta bancária com cheque especial, controlada por um menu interativo no terminal.

## Funcionalidades

1. Consultar saldo
2. Consultar cheque especial
3. Depositar dinheiro
4. Sacar dinheiro
5. Pagar boleto
6. Verificar se a conta está usando o cheque especial
7. Sair

## Regras de negócio

- O **limite do cheque especial** é definido na criação da conta, a partir do depósito inicial:
  - Depósito de até R$ 500,00: limite de **R$ 50,00**.
  - Depósito acima de R$ 500,00: limite de **50% do valor depositado**.
- O **saldo disponível** é o saldo da conta somado ao limite do cheque especial.
- Saques e pagamentos de boleto só são realizados se o valor for **maior que zero** e **não ultrapassar o saldo disponível**.
- Se o cheque especial for utilizado (saldo negativo), a conta cobra uma **taxa de 20% sobre o valor usado**.
- Depósitos só aceitam valores maiores que zero.

### Exemplo

Conta aberta com R$ 100,00 (limite de R$ 50,00):

- Saque de R$ 130,00 → saldo de -R$ 30,00 (R$ 30,00 de cheque especial usado).
- Taxa de 20% sobre R$ 30,00 = R$ 6,00 → saldo final de **-R$ 36,00**.

## Estrutura do projeto

```
Conta_Bancaria/
├── ContaBancaria.java   # Classe com atributos, construtor e regras da conta
└── Main.java            # Menu interativo (Scanner + while)
```

### Conceitos praticados

- Classes, objetos, atributos e métodos
- Construtor
- Encapsulamento (atributos `private`)
- Estruturas condicionais (`if / else if / else`)
- Laço de repetição (`while`)
- Leitura de dados com `Scanner`

## Como executar

Pré-requisito: **JDK 11 ou superior** instalado.

```bash
# Na pasta que contém Conta_Bancaria/
javac Conta_Bancaria/*.java
java Conta_Bancaria.Main
```

Ou abra a pasta no VS Code (com a extensão Java) e execute a classe `Main`.

## Melhorias futuras

- Tratar entradas inválidas (letras no lugar de números) com exceções.
- Separar as mensagens de erro (valor inválido x saldo insuficiente).
- Cobrar a taxa apenas sobre o valor novo do cheque usado.
- Testes automatizados com JUnit.

## Autor

Projeto de estudo desenvolvido por **Junior Menezes** durante minha formação para atuar como desenvolvedor Java Júnior / Back-End.
