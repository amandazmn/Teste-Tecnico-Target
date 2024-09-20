# Teste-Tecnico-Target

1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência. <br>
IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

[Resposta](https://github.com/amandazmn/Teste-Tecnico-Target/blob/main/Prova/src/desafio1/Desafio1.java)

2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre. <br>
IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

[Resposta](https://github.com/amandazmn/Teste-Tecnico-Target/blob/main/Prova/src/desafio2/Desafio2.java)

3) Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA); <br>
Ao final do processamento, qual será o valor da variável SOMA?

O valor da soma será 77. [Verificar código](https://github.com/amandazmn/Teste-Tecnico-Target/blob/main/Prova/src/desafio3/Desafio3.java)

4) Descubra a lógica e complete o próximo elemento:
-  1, 3, 5, 7, <strong>9</strong>
-  2, 4, 8, 16, 32, 64, <strong>128</strong>
-  1, 4, 9, 16, 25, 36, <strong>49</strong>
-  4, 16, 36, 64, <strong>256</strong>
-  1, 1, 2, 3, 5, 8, <strong>13</strong>
-  2,10, 12, 16, 17, 18, 19, <strong>0</strong>

5) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?

Considerando que são lâmpadas incandescentes, eu ligaria o primeiro interruptor, aguardaria 10 minutos e desligaria, então ligaria o segundo interruptor e iria para a primeira sala. Caso a lâmpada estivesse acesa, então a lâmpada da sala um corresponde ao segundo interruptor. Mas se a lâmpada estivesse apagada e quente, a sala um corresponde ao interruptor um. Se a lâmpada estivesse apaga e fria, então a lâmpada da sala um está ligada ao terceiro interruptor. <br>
Voltaria para a sala com os interruptores, apagaria o segundo e ligaria o terceiro, então seguiria para a sala dois. Caso a lâmpada estivesse acesa, o interruptor três está ligado a sala dois. Se estivesse apagado e quente, o interruptor dois corresponde a lâmpada da sala dois. Mas, se estivesse apagado e frio, o interruptor um está ligado a sala dois. <br>
Assim formamos os seguintes cenários:
1) Sala um acesa e sala dois apagada e fria. Interruptor 1 - Sala 3, Interruptor 2 - Sala 1, Interruptor 3 - Sala 2
2) Sala um acesa e sala dois acesa. Interruptor 1 - Sala 3, Interruptor 2 - Sala 1, Interruptor 3 - Sala 2
3) Sala um apagada e quente e sala dois acesa. Interruptor 1 - Sala 1, Interruptor 2 - Sala 3, Interruptor 3 - Sala 2
4) Sala um apagada e quente e sala dois apagada e quente. Interruptor 1 - Sala 1, Interruptor 2 - Sala 2, Interruptor 3 - Sala 3
5) Sala um apagada e fria e sala dois apagada e fria. Interruptor 1 - Sala 2, Interruptor 2 - Sala 3, Interruptor 3 - Sala 1
6) Sala um apagada e fria e sala dois apagada e quente. Interruptor 1 - Sala 3, Interruptor 2 - Sala 2, Interruptor 3 - Sala 1.

   Dessa forma, cobrimos todas as possibilidades e encontramos uma resposta correta.
