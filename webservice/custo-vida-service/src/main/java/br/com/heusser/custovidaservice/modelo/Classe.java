package br.com.heusser.custovidaservice.modelo;

import br.com.heusser.custovidaservice.modelo.Subgrupo;

public class Classe {

    private int classeid;
    
    private String descricao;
    
    private String identificador;
    
    private Subgrupo subgrupo;    

    public Classe() {
        this.subgrupo = new Subgrupo();
    }
    
    public int getClasseid() {
        return classeid;
    }

    public void setClasseid(int classeid) {
        this.classeid = classeid;
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

    public Subgrupo getSubgrupo() {
        return subgrupo;
    }

    public void setSubgrupo(Subgrupo subgrupo) {
        this.subgrupo = subgrupo;
    }
    
    @Override
    public String toString() {
        return descricao;
    }
   
}
