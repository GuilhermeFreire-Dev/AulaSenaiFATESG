package br.com.aulapdv.syspdv.domain;

import java.time.LocalDate;
import java.util.List;

public class Pedido {
    
    private Integer id;
    private LocalDate instance;
    private Endereco enderecoDeEntrega;
    private Cliente cliente;
    private Pagamento pagamento;
    private List<ItemPedido> itemPedidos;

    public Pedido() {
    }

    public Pedido(Integer id, LocalDate instance, Endereco endereco, Cliente cliente, Pagamento pagamento) {
        this.id = id;
        this.instance = instance;
        this.enderecoDeEntrega = endereco;
        this.cliente = cliente;
        this.pagamento = pagamento;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getInstance() {
        return instance;
    }

    public void setInstance(LocalDate instance) {
        this.instance = instance;
    }

    public Endereco getEndereco() {
        return enderecoDeEntrega;
    }

    public void setEndereco(Endereco endereco) {
        this.enderecoDeEntrega = endereco;
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

    public List<ItemPedido> getItemPedidos() {
        return itemPedidos;
    }

    public void setItemPedidos(List<ItemPedido> itemPedidos) {
        this.itemPedidos = itemPedidos;
    }
    
}
