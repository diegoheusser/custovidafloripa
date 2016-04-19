package br.com.heusser.custovidaservice.modelo;

import java.util.List;
import br.com.heusser.custovidaservice.modelo.Produto;
import br.com.heusser.custovidaservice.modelo.Pesquisa;
import br.com.heusser.custovidaservice.modelo.Variacao;

public class Item {

    private int itemid;

    private String descricao;

    private String identificador;

    private Produto produto;

    private List<Pesquisa> pesquisas;

    private boolean semanal;

    private List<Variacao> variacoes;

    public Item() {
        this.semanal = true;
        this.produto = new Produto();
    }

    public List<Variacao> getVariacoes() {
        return variacoes;
    }

    public void setVariacoes(List<Variacao> variacoes) {
        this.variacoes = variacoes;
    }

    public boolean isSemanal() {
        return semanal;
    }

    public void setSemanal(boolean semanal) {
        this.semanal = semanal;
    }

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public List<Pesquisa> getPesquisas() {
        return pesquisas;
    }

    public void setPesquisas(List<Pesquisa> pesquisas) {
        this.pesquisas = pesquisas;
    }

}
