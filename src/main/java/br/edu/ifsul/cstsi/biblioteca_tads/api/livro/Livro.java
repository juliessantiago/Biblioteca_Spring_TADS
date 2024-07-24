package br.edu.ifsul.cstsi.biblioteca_tads.api.livro;

import br.edu.ifsul.cstsi.biblioteca_tads.api.exemplar.Exemplar;
import jakarta.persistence.Entity;

@Entity
public class Livro extends Exemplar {
    private String autor;
    private String editora;
    private Integer edicao;
}
