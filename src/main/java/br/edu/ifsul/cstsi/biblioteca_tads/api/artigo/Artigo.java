package br.edu.ifsul.cstsi.biblioteca_tads.api.artigo;

import br.edu.ifsul.cstsi.biblioteca_tads.api.exemplar.Exemplar;
import jakarta.persistence.Entity;

@Entity
public class Artigo extends Exemplar {
    private String autor;
}
