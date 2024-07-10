package br.edu.ifsul.cstsi.biblioteca_tads.api.exemplar;

import br.edu.ifsul.cstsi.biblioteca_tads.api.cliente.Cliente;
import jakarta.persistence.*;

import java.util.List;

@Entity(name="Exemplar")
@Table(name="exemplares")
public class Exemplar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    private String nome;
    private int tipoExemplar;
}