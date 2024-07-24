package br.edu.ifsul.cstsi.biblioteca_tads.api.cliente;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ClienteDTO(
       @NotBlank(message="Campo nome não pode ser vazio")
       @Size(min = 1, max = 50, message = "Campo nome pode ter no máximo 50 caracteres")
       String nome,
        int telefone,
        String endereco,
       @NotBlank(message = "Campo tipoCliente não pode ser vazio")
       int tipoCliente
) {
       public ClienteDTO(Cliente cliente){
              this(cliente.getNome(), cliente.getTelefone(), cliente.getEndereco(), cliente.getTipoCliente());
       }

}
