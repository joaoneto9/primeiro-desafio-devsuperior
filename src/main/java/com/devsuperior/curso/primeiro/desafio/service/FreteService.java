package com.devsuperior.curso.primeiro.desafio.service;

import com.devsuperior.curso.primeiro.desafio.entity.Pedido;
import org.springframework.stereotype.Service;

@Service
public class FreteService {

    public Double getFrete(Pedido pedido) {
        if (pedido.getBase() >= 200) {
            return 0.0;
        }
        else if (pedido.getBase() >= 100) {
            return 12.0;
        }
        return 20.0;
    }
}
