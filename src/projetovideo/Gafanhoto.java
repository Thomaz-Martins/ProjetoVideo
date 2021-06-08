/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetovideo;

/**
 *
 * @author Hell
 */
public class Gafanhoto extends Pessoa {
    private String login;
    private int totalAssistido;

    public Gafanhoto(String nome, int idade, String login) {
        super(nome, idade);
        this.login = login;
        this.totalAssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }
    
    public void viuMaisUm(){
        this.setTotalAssistido(this.getTotalAssistido()+1);
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "\nlogin=" + login 
                + ", totalAssistido=" + totalAssistido + '}';
    }
}
