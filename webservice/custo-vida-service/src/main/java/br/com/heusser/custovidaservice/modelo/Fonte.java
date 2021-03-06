package br.com.heusser.custovidaservice.modelo;

import java.util.ArrayList;
import java.util.List;
import br.com.heusser.custovidaservice.modelo.Usuario;
import br.com.heusser.custovidaservice.modelo.PesquisaControle;

public class Fonte {

    private int fonteid;

    private String descricao;

    private String localizacao;
    
    private List<Usuario> usuarios;
    
    private List<PesquisaControle> pesquisaControles;
    
    public Fonte() {
        super();
		pesquisaControles = new ArrayList<>();
    }
    

    public int getFonteid() {
        return fonteid;
    }

    public void setFonteid(int fonteid) {
        this.fonteid = fonteid;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<PesquisaControle> getPesquisaControles() {
        return pesquisaControles;
    }

    public void setPesquisaControles(List<PesquisaControle> pesquisaControles) {
        this.pesquisaControles = pesquisaControles;
    }

}
