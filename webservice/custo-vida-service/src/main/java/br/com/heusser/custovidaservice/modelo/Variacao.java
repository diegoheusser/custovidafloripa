package br.com.heusser.custovidaservice.modelo;

import java.util.Date;
import br.com.heusser.custovidaservice.modelo.Item;

public class Variacao {
    
    private int variacaoid;
    
    private int ano;
    
    private int mes;
    
    private Item item;
    
    private Date datafechamento;
    
    private double media;
    
    private double indiceacumulado;

    public int getVariacaoid() {
        return variacaoid;
    }

    public void setVariacaoid(int variacaoid) {
        this.variacaoid = variacaoid;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Date getDatafechamento() {
        return datafechamento;
    }

    public void setDatafechamento(Date datafechamento) {
        this.datafechamento = datafechamento;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getIndiceacumulado() {
        return indiceacumulado;
    }

    public void setIndiceacumulado(double indiceacumulado) {
        this.indiceacumulado = indiceacumulado;
    }
   
}
