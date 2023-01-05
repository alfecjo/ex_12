/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package br.jsf;

import br.data.model.Jogador;
import br.ejb.EjbRanking;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import lombok.Data;

/**
 *
 * @author samsung
 */
@Named(value = "jsfRanking")
@SessionScoped
@Data
public class JsfRanking implements Serializable {
    
    @EJB
    private EjbRanking ejbRanking;
    
    private String valor = "0";
    private String valor1 = "0";
    private String soma = "0";
    private String resultado = "";

    /**
     * Creates a new instance of JsfRanking
     */
    public JsfRanking() {
    }

    public void add(Jogador prod) {        
        ejbRanking.add(prod);
        verifica(prod);
    }
 
    public void verifica(Jogador prod) {        
        try {
            int i = Integer.valueOf(getSoma());
            int g = ejbRanking.calculo(Double.valueOf(getValor()), Double.valueOf(getValor1()));
            if (i - g == 0) {
                setResultado("Certa");
                prod.setId(prod.getId() + 1);
                ejbRanking.send(prod);
            } else {
                setResultado("Errada!");                
            }
        } catch (NumberFormatException e) {
            setResultado("Formato inválido!");
        }        
        valRandom();
    }
    
    public void valRandom() {
        setValor(String.valueOf((ejbRanking.valAleatorio())));
        setValor1(String.valueOf((ejbRanking.valAleatorio())));
    }    
}
