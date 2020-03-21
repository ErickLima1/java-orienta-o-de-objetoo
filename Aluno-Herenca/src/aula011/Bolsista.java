package aula011;

 // @author Erick
public class Bolsista  extends  Aluno{
  private float bolsa;
  
  public void renovarbolsa() {
      System.out.println("Renovando a bolsa De " + this.getNome());
  }
  @Override
  public void pagarmatricula() {
       System.out.println(this.getNome() + "É Bolsista! Pagamente Realizado");
  }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }



  
}
