package br.com.heusser.custovidaservice.modelo;

import java.util.Date;
import br.com.heusser.custovidaservice.modelo.Fonte;
import br.com.heusser.custovidaservice.modelo.Usuario;

public class PesquisaControle {
    
    private int pesquisacontroleid;
    
    private Date dataEmissao;
    
    private Date dataEntrega;
    
    private boolean aberto;
    
    private boolean semanal;
    
    private int semana;
    
    private int mes;
    
    private int ano;
    
    private Fonte fonte;
    
    private Usuario usuario;

    public int getPesquisacontroleid() {
        return pesquisacontroleid;
    }

    public void setPesquisacontroleid(int pesquisacontroleid) {
        this.pesquisacontroleid = pesquisacontroleid;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public boolean isSemanal() {
        return semanal;
    }

    public void setSemanal(boolean semanal) {
        this.semanal = semanal;
    }

    public int getSemana() {
        return semana;
    }

    public void setSemana(int semana) {
        this.semana = semana;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Fonte getFonte() {
        return fonte;
    }

    public void setFonte(Fonte fonte) {
        this.fonte = fonte;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
