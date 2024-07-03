package br.edu.ifsul.cstsi.biblioteca_tads.api.cliente;

import jakarta.persistence.*;

/*indicando que classe vai virar tabela no banco*/
@Entity(name="Cliente")

public class Cliente {
    /*indicando qual é a chave primária*/
    @Id
    /*definindo estratégia de geração de valor da chave*/
    /*identity -> autoincrement*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private String nome;
    private int telefone;
    private String endereco;
    private int tipoCliente;
}
