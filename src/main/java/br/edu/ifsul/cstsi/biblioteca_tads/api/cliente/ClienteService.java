package br.edu.ifsul.cstsi.biblioteca_tads.api.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;
@Service// adicionei por causa de erro no Autowired do controller
//  Service-> manipula as  entidades
public class ClienteService {
    @Autowired //injeção de dependência
    private ClienteRepository repository;

    public Page<Cliente> getClientes(Pageable paginacao) {
        return repository.findAll(paginacao);
    }

    public Cliente getProdutoById(Long codigo) {
        return repository.findByCodigo(codigo);
    }

    public List<Cliente> getClienteByNome(String nome) {
        return repository.findByNome(nome+"%");
    }
    public Cliente insert(Cliente cliente) {
        Assert.isNull(cliente.getCodigo(),"Não foi possível inserir novo cliente");
        return repository.save(cliente);
    }
    public Optional<Cliente> getClienteById(Integer id) { //tipo Optional??
        return repository.findById(id);
    }

}
