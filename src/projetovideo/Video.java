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
public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao, views, likes;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 0;
        this.views = 0;
        this.likes = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int novaAvaliacao;
        novaAvaliacao = (int) ((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = novaAvaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        if(!isReproduzindo()){
            this.setReproduzindo(true);
        }
    }

    @Override
    public void pause() {
        if(this.isReproduzindo()){
            this.setReproduzindo(false);
        }
    }

    @Override
    public void like() {
        this.setLikes(this.getLikes()+1);
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao 
                + "\n, views=" + views + ", likes=" + likes 
                + ", reproduzindo=" + reproduzindo + '}';
    }
}
