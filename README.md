# Sistema de Registro de Férias em Java

<img src="https://user-images.githubusercontent.com/74038190/212284115-f47cd8ff-2ffb-4b04-b5bf-4d1c14c0247f.gif" width="1000">

## Descrição

Este projeto visa criar um sistema de registro de férias usando Java. O sistema utiliza a enumeração (`enum`) para diferenciar os tipos de feriados (municipal, estadual, nacional) e o encapsulamento para gerenciar as informações de cada feriado. O projeto inclui uma interface de teste para instanciar e visualizar feriados reais com suas respectivas datas.

## Funcionalidades

- **Enumeração de Tipos de Feriados:** Utiliza `enum` para definir e distinguir entre tipos de feriados (municipal, estadual, nacional).
- **Encapsulamento:** Gerencia as informações de cada feriado através de uma classe que encapsula detalhes como data e tipo de feriado.
- **Interface de Teste:** Permite a criação e visualização de feriados reais com suas datas e tipos.

## Instruções para Execução

1. **Clonar o Repositório:**
    ```bash
    git clone https://github.com/Matz-Turing/EnumHolidayRegistryJava.git
    ```

2. **Compilar o Projeto:**
    Navegue até o diretório do projeto e compile o código Java:
    ```bash
    javac -d bin src/*.java
    ```

3. **Executar a Interface de Teste:**
    ```bash
    java -cp bin TesteFeriado
    ```

## Créditos

Desenvolvido por Mateus S.  
GitHub: [Matz-Turing](https://github.com/Matz-Turing)
