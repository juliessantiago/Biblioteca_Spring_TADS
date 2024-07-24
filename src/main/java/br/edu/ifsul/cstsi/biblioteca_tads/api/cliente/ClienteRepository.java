package br.edu.ifsul.cstsi.biblioteca_tads.api.cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//JpaRepository<Cliente, Integer>
//preciso indicar a qual model esse repository vai referenciar e qual tipo identificador dessa model
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    List<Cliente> findByNome(String nome);
    Cliente findByCodigo(Long codigo);
}
