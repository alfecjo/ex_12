/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatefulEjbClass.java to edit this template
 */
package br.ejb;

import br.data.model.Jogador;
import br.data.model.Ranking;
import java.util.ArrayList;
import javax.ejb.Stateful;
import java.util.Random;
import javax.annotation.Resource;
import javax.jms.ConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Queue;

/**
 *
 * @author samsung
 */
@Stateful
public class EjbRanking {

    @Resource(lookup = "java:comp/DefaultJMSConnectionFactory")
    private ConnectionFactory connectionFactory;

    @Resource(lookup = "java/Fila")
    private Queue fila;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    private final ArrayList<Ranking> lRanking;
    private final Random random = new Random();   

    public EjbRanking() {
        lRanking = new ArrayList<>();
    }

    public void add(Jogador prod) {
        for (Ranking ranking : lRanking) {
            if (ranking.getJogador().getId() == prod.getId()) {
                ranking.setQuantidadePontos(ranking.getQuantidadePontos() + 1);                
                break;
            } else {
                ranking = new Ranking(prod, 1);
                lRanking.add(ranking);
            }           
        }
    }

    public int calculo(Double num, Double num1) {
        return (int) (num + num1);
    }

    public int valAleatorio() {
        int i = random.nextInt(10);
        return i;
    }

    public void send(Jogador prod) {        
        try {

            JMSContext context = connectionFactory.createContext();
            context.createProducer().send(fila, prod.getDescricao());

        } catch (Exception e) {
            System.out.println("ERRO");
            System.out.println(e.getMessage());
        }
    }

}
