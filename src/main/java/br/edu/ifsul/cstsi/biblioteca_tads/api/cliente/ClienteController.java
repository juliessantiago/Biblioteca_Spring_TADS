package br.edu.ifsul.cstsi.biblioteca_tads.api.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/clientes")
public class ClienteController {
    @Autowired //injeção de dependência
    private ClienteService service;

    public ResponseEntity<Page<ClienteDTO>> selectAll(@PageableDefault(size = 50, sort = "nome") Pageable paginacao) {
        return ResponseEntity.ok(service.getClientes(paginacao).map(ClienteDTO::new));
    }

    @PostMapping
    public ResponseEntity<URI> insert(@RequestBody ClienteDTO clienteDTO, UriComponentsBuilder uriBuilder){
        var cliente = service.insert(new Cliente(
                null,
                clienteDTO.nome(),
                clienteDTO.telefone(),
                clienteDTO.endereco(),
                clienteDTO.tipoCliente()
        ));
        var location = uriBuilder.path("api/v1/clientes/{id}").buildAndExpand(cliente.getCodigo()).toUri();
        return ResponseEntity.created(location).build();
    }

    @GetMapping("/nome/{nome}")
    public ResponseEntity<List<ClienteDTO>> selectByNome(@PathVariable("nome") String nome) {
        var clientes = service.getClienteByNome(nome);
        return clientes.isEmpty() ?
                ResponseEntity.noContent().build() :
                ResponseEntity.ok(clientes.stream().map(ClienteDTO::new).collect(Collectors.toList()));
    }


}
