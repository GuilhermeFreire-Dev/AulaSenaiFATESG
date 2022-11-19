package br.com.aulapdv.syspdv.domain;

import br.com.aulapdv.syspdv.repository.ItemPedidoPK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class ItemPedido {
    
    private Double desconto;
    private Integer quantidade;
    private Double preco;
    private Produto produto;
    private Pedido pedido;

    @EmbeddedId
    private ItemPedidoPK id;

    public ItemPedido(Double desconto, Integer quantidade, Double preco, Produto produto, Pedido pedido) {
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public ItemPedido() {
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
