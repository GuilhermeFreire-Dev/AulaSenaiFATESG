package br.com.aulapdv.syspdv.domain;

import java.util.List;

public class Produto {
    
    private Integer id;
    private String nome;
    private Double preco;
    private List<Categoria> categorias;
    private ItemPedido itemPedido;

    public Produto(Integer id, String nome, Double preco, List<Categoria> categorias, ItemPedido itemPedido) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.categorias = categorias;
        this.itemPedido = itemPedido;
    }

    public Produto() {
    }

    public ItemPedido getItemPedido() {
        return itemPedido;
    }

    public void setItemPedido(ItemPedido itemPedido) {
        this.itemPedido = itemPedido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }
}
