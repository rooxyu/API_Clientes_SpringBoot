package com.exemplo.clientes.service;

import com.exemplo.clientes.model.Cliente;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {
    private final List<Cliente> clientes = new ArrayList<>();
    private Long nextId = 1L;

    public synchronized List<Cliente> listar() {
        return new ArrayList<>(clientes);
    }

    public synchronized Cliente criar(Cliente cliente) {
        cliente.setId(nextId++);
        clientes.add(cliente);
        return cliente;
    }

    public synchronized Cliente buscarPorId(Long id) {
        return clientes.stream()
                .filter(cliente -> cliente.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public synchronized boolean remover(Long id) {
        return clientes.removeIf(cliente -> cliente.getId().equals(id));
    }

    public synchronized Cliente atualizar(Long id, Cliente novo) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId().equals(id)) {
                novo.setId(id);
                clientes.set(i, novo);
                return novo;
            }
        }
        return null;
    }
}
