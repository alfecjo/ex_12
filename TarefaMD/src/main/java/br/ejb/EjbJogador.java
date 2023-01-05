/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package br.ejb;

import br.data.model.Jogador;
import java.util.ArrayList;
import java.util.Random;
import javax.ejb.Stateless;

/**
 *
 * @author samsung
 */
@Stateless
public class EjbJogador {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    private ArrayList<Jogador> lJogador;
    private final Random random = new Random();

    public EjbJogador() {
        lJogador = new ArrayList<>();
    }

    public void add(Jogador jogador) {
        lJogador.add(jogador);
    }

    public ArrayList<Jogador> getAll() {
        return lJogador;
    }
}
