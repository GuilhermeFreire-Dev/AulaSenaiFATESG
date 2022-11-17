package br.com.aulapdv.syspdv.domain;

import java.sql.Date;

public class Pedido {
    
    private Integer id;
    private Date instance;
    private Endereco endereco;
    private Cliente cliente;
    private Pagamento pagamento;
    private ItemPedido itemPedido;

    public Pedido() {
    }

    public Pedido(Integer id, Date instance, Endereco endereco, Cliente cliente, Pagamento pagamento,
            ItemPedido itemPedido) {
        this.id = id;
        this.instance = instance;
        this.endereco = endereco;
        this.cliente = cliente;
        this.pagamento = pagamento;
        this.itemPedido = itemPedido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getInstance() {
        return instance;
    }

    public void setInstance(Date instance) {
        this.instance = instance;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public ItemPedido getItemPedido() {
        return itemPedido;
    }

    public void setItemPedido(ItemPedido itemPedido) {
        this.itemPedido = itemPedido;
    }
    
}
