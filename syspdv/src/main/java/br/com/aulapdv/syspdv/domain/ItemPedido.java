package br.com.aulapdv.syspdv.domain;

import java.util.List;

public class ItemPedido {
    
    private Double desconto;
    private Integer quantidade;
    private Double preco;
    private List<Produto> produtos;
    private List<Pedido> pedidos;

    public ItemPedido() {
    }

    public ItemPedido(Double desconto, Integer quantidade, Double preco) {
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
