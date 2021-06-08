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
public class ProjetoVideo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Video vid[] = new Video[3];
        vid[0] = new Video("Aula 11 Java POO");
        
        vid[1] = new Video("Aula 12 Java POO");
        
        vid[2] = new Video("Aula 13 Java POO");
        
        
        Gafanhoto gaf[] = new Gafanhoto[2];
        gaf[0] = new Gafanhoto("Marcos", 23, "marquinho");
        
        gaf[1] = new Gafanhoto("Giovani", 27, "giiiozito");
        
        
        System.out.println("----------------Visualizações-----------------");
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(gaf[0], vid[0]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        System.out.println("");
        
        vis[1] = new Visualizacao(gaf[0], vid[1]);
        vis[1].avaliar(55);
        System.out.println(vis[1].toString());
        System.out.println("");
        
        vis[2] = new Visualizacao(gaf[1], vid[1]);
        vis[2].avaliar(80.0f);
        System.out.println(vis[2].toString());
        System.out.println("");
        
        vis[3] = new Visualizacao(gaf[1], vid[2]);
        vis[3].avaliar(100.0f);
        System.out.println(vis[3].toString());
        System.out.println("");
        
        vis[4] = new Visualizacao(gaf[0], vid[2]);
        vis[4].avaliar(100);
        System.out.println(vis[4].toString());
        System.out.println("");
    }
    
}
