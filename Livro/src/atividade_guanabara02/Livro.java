
package atividade_guanabara02;


public class Livro implements Publicacaojava {
  private String livro;
  private String autor;
  private int totalpagina;
  private int paginatual;
  private boolean aberto;
  private Pessoa leitor;

  
    public String detalhes() {
     return "Livro{" + "livro = " + livro + "\n autor = " + autor + "\n totalpagina = " + totalpagina + "\n paginatual = " + paginatual + "\n aberto = " + aberto + "\n leitor= " + leitor.getNome() 
             + "\n idade = " + leitor.getIdade() + "|| Sexo = ===========================================" + leitor.getSexo() + '}';
     
    }
    
    
    public Livro(String livro, String autor, int totalpagina, Pessoa leitor) {
        this.livro = livro;
        this.autor = autor;
        this.totalpagina = totalpagina;
        this.aberto = false;
        this.paginatual = 0;
        this.leitor = leitor;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalpagina() {
        return totalpagina;
    }

    public void setTotalpagina(int totalpagina) {
        this.totalpagina = totalpagina;
    }

    public int getPaginatual() {
        return paginatual;
    }

    public void setPaginatual(int paginatual) {
        this.paginatual = paginatual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
      this.aberto = true;
      
    }

    @Override
    public void fechar() {
      this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if(p > this.totalpagina) {
          this.paginatual = 0;
        }else {
        this.paginatual = p;
        }
    }

    @Override
    public void avancarpag() {
        this.paginatual++;
    }

    @Override
    public void voltapag() {
        this.paginatual--;
    }
 
}