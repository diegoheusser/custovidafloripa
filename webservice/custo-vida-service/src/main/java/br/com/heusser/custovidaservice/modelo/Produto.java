package br.com.heusser.custovidaservice.modelo;

import br.com.heusser.custovidaservice.modelo.Classe;

public class Produto {

    private int produtoid;
    
    private String descricao;
    
    private String identificador;
    
    private Classe classe;
    
    public Produto() {        
        this.classe = new Classe();
    }
    
    public int getProdutoid() {
        return this.produtoid;
    }

    public void setProdutoid(int produtoid) {
        this.produtoid = produtoid;
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

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }
       
}
