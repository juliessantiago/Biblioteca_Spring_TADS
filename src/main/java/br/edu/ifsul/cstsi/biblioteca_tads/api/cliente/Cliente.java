package br.edu.ifsul.cstsi.biblioteca_tads.api.cliente;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Cliente")
@Table(name = "clientes")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Cliente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  codigo;
    private String nome;
    private Integer telefone;
    private String endereco;
    private Integer tipoCliente; //abordagem de herança SINGLE_TABLE
    //1-> aluno
    //2-> pai de aluno

}
