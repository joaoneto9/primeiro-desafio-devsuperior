package com.devsuperior.curso.primeiro.desafio.service;

import com.devsuperior.curso.primeiro.desafio.entity.Pedido;
import org.springframework.stereotype.Service;

@Service
public class DescontoService {

    public Double getSaldoComDesconto(Pedido pedido) {
        return pedido.getBase() * ((100.0 - pedido.getDesconto()) * 0.01);
    }

}
