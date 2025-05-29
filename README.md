# Requisitos

Entender o papel das interfaces em Java, suas vantagens e quando utilizá-las na construção de sistemas orientados a objetos.

> - Leia o conteúdo do material da disciplina ou pesquise sobre:
> - O que são interfaces em Java;
> - Diferença entre interface e classe abstrata;
> - Suponha que você está criando um sistema de , que deve suportar diferentes formas de pagamento como CartaoCredito, Boleto, e Pix.
> - Crie uma interface Pagamento com o método processarPagamento().
> - Implemente essa interface em três classes diferentes, cada uma representando uma forma de pagamento.
> - Em seguida, crie uma classe Checkout que recebe um objeto do tipo Pagamento e chama o método processarPagamento().
> - Código-fonte em Java;
> - Pequeno texto respondendo:
> - Por que foi útil usar uma interface nesse exemplo?
> - Quais seriam as desvantagens se não usássemos interface?

## Porque foi útil usar a interface?

Ao fazer o uso de interfaces foi possível deixar o código mais organizado, flexível e facilitar sua manuntenção, pois esse modelo oculta os detalhes da implementação, expondo apenas o que é necessário, com este tipo de desacoplamento é possível separar melhor as responsabilidades de cada parte do código, além de permitir tratar diferentes classes de forma genérica e definir contratos comuns para várias classes.

## Quais seriam as desvantagens se não usássemos interface?

Na ausência de uma interface, é notório o inverso de todas as suas vantagens de uso, sendo assim, as classes dependeriam diretamente de implementações concretas, estabilizando um forte acoplamento no projeto inteiro, além disso, tornaria mais difícil modificar ou estender funcionalidades sem alterar várias partes do código, limitaria o reaproveitamento de código, fragilizaria o sistema a muidanças e anularia a vantagem do uso do polimorfismo.

### Grupo Provas

- Caio Vinicius Marinho  
- Josue Costa da Silva  
- Dayvson da Silva Farias  
- Matheus Aroxa Teixeira de Souza  
