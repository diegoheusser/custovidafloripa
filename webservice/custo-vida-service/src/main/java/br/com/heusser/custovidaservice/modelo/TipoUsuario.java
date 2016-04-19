package br.com. heusser.custovidaservice.modelo;

import java.util.List;
import java.util.ArrayList;
import br.com.heusser.custovidaservice.modelo.Usuario;

public class TipoUsuario {

    private int tipoUsuarioid;

    private String descricao;

    private List<Usuario> usuarios;

    public TipoUsuario() {
        this.usuarios = new ArrayList<>();
    }

    public int getTipoUsuarioid() {
        return tipoUsuarioid;
    }

    public void setTipoUsuarioid(int tipoUsuarioid) {
        this.tipoUsuarioid = tipoUsuarioid;
    }

    public void setId(int id) {
        this.tipoUsuarioid = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void addUsuario(Usuario usuario){
        this.usuarios.add(usuario);
    }

}
