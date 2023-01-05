/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package br.jsf;

import br.data.model.Jogador;
import br.ejb.EjbJogador;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import lombok.Data;

/**
 *
 * @author samsung
 */
@Named(value = "jsfJogador")
@RequestScoped
@Data
public class JsfJogador {

    @EJB
    private EjbJogador ejbJogador;

    private int id;
    private String descricao;

    /**
     * Creates a new instance of JsfJogador
     */
    public JsfJogador() {
    }
    
    public ArrayList<Jogador> getAll(){
        return ejbJogador.getAll();
    }

    public void add() {
        if (!this.descricao.isBlank()) {
            Jogador jogador = new Jogador(id, descricao);
            ejbJogador.add(jogador);
        }
    }
}
