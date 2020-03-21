
package aula011;

 //@author Erick
public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    
    public void pagarmatricula() {
        System.out.println("Pagando Mensalidade do Aluno " + this.getNome());
        
    }
    public void cursoo() {
        System.out.println(this.getNome() + " Ta cursando o Curso De " + this.getCurso());
        System.out.println("=============================================================");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
