package com.devsuperior.curso.primeiro.desafio.service;

import com.devsuperior.curso.primeiro.desafio.entity.Pedido;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    private final DescontoService descontoService;
    private final FreteService freteService;

    public PedidoService(DescontoService descontoService, FreteService freteService) {
        this.descontoService = descontoService;
        this.freteService = freteService;
    }

    public Double getValorTotal(Pedido pedido) {
        return descontoService.getSaldoComDesconto(pedido) + freteService.getFrete(pedido);
    }
}

