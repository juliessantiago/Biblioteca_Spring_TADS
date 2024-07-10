package br.edu.ifsul.cstsi.biblioteca_tads.api.emprestimo;

import br.edu.ifsul.cstsi.biblioteca_tads.api.cliente.Cliente;
import br.edu.ifsul.cstsi.biblioteca_tads.api.exemplar.Exemplar;
import jakarta.persistence.*;

@Entity(name="Emprestimo")
@Table(name="emprestimos")
public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    private Cliente cliente;
    @OneToOne
    private Exemplar exemplar;
}
