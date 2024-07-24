package br.edu.ifsul.cstsi.biblioteca_tads.api.periodico;

import br.edu.ifsul.cstsi.biblioteca_tads.api.exemplar.Exemplar;
import jakarta.persistence.Entity;

@Entity
public class Periodico extends Exemplar {
    private String editora;
}
