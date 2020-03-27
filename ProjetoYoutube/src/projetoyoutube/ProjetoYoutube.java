package projetoyoutube;

 //*@author Erick
public class ProjetoYoutube {

    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 De banco de dados");
        v[1] = new Video("Aula 1 De JavaScript iniciante");
        v[2] = new Video("Aula 1 De Java Avançado");
        
        Gafanhotos g[] = new Gafanhotos[3];
        g[0] = new Gafanhotos("Erick", 20, "Homen", "Lima");
        g[1] = new Gafanhotos("Luiza", 22, "Mulher", "Luizinha");

        Visualizacao vi[] = new Visualizacao[5];
        vi[0] = new Visualizacao(g[0],v[0]);
        vi[0].avaliar();
        v[0].Like();
        v[0].Like();
        System.out.println(vi[0].toString());
        
        System.out.println();
        
        vi[1] = new Visualizacao(g[1],v[1]);
        vi[1].avaliar(87.0f);
        v[1].Like();
        v[1].play();
        System.out.println(vi[1].toString());
        
        
       //  v[0].Like();
       //  v[0].dislike();
      //   v[0].play();
       // System.out.println(v[0].toString());
       // System.out.println(g[0].toString());
        //System.out.println("");
        
       // v[1].Like();
       // v[1].play();
       // v[1].Like();
      //  v[1].setAvalicao(3);
       // v[1].setViews(20);
        //System.out.println(v[1].toString());
        //System.out.println(g[1].toString());
        
       
        
    }
    
}
