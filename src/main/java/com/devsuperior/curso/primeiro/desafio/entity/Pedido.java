package com.devsuperior.curso.primeiro.desafio.entity;

public class Pedido {

    private int id;
    private Double base;
    private Double desconto;

    public Pedido(int id, Double base, Double desconto) {
        this.base = base;
        this.desconto = desconto;
        this.id = id;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
