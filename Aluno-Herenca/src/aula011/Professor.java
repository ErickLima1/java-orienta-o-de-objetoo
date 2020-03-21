package aula011;

 //@author Erick
public class Professor extends Aluno{
   private String materia;
   private double salario;
   
   public void materia() {
       System.out.println("A Materia do professor é " + this.getMateria());
       
   }
   public void sala() {
       System.out.println("Salario do professor é " + this.getSalario()+" R$");
   }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
   
}
