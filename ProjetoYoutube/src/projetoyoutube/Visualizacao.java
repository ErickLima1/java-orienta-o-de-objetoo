package projetoyoutube;

//*@author Erick
public class Visualizacao {
    private Gafanhotos espectador;
    private Video filme;

    public Visualizacao(Gafanhotos espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setToAssitindo(this.espectador.getToAssitindo()+1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    public void avaliar() {
        this.filme.setAvalicao(5);
    }
    public void avaliar(int nota) {
        this.filme.setAvalicao(nota);
    }
    public void avaliar(float porc) {
        int tot = 0;
        if(porc <= 20) {
            tot = 3;
        }else if (porc <= 50) {
            tot = 5;
        }else if (porc <= 90) {
            tot = 9;
        }else {
            tot = 10;
        }
        this.filme.setAvalicao(tot);
    }

    public Gafanhotos getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhotos espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador = " + espectador + " filme = " + filme + '}';
        
    }
    
    
}
