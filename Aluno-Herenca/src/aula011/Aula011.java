package aula011;
 
 //@author Erick
 
public class Aula011 {

      public static void main(String[] args) {
      Visitante v1 = new Visitante();
      v1.setNome("Maria");
      v1.setIdade(21);
      v1.setSexo("Mulher");
      System.out.println(v1.toString());
      v1.info();
      
      
      
      Aluno a1 = new Aluno();
      a1.setNome("Erick");
      a1.setIdade(20);
      a1.setSexo("Homen");
      a1.setMatricula(40029);
      System.out.println(a1.toString());
      a1.setCurso("Ciencia Da Computação");
      a1.pagarmatricula();
      a1.cursoo();
      
      
      Bolsista b1 = new Bolsista();
      b1.setNome("Jess");
      b1.setIdade(20);
      b1.setBolsa(600);
      b1.setSexo("Mulher");
      b1.setCurso("Engenharia de computação");
      System.out.println(b1.toString());
      b1.renovarbolsa();
      b1.cursoo();
      
      Professor p1 = new Professor();
      p1.setNome("Luiz carlos ");
      p1.setIdade(60);
      p1.setMatricula(146181988);
      p1.setSexo("Homen");
      System.out.println(p1.toString());
      p1.setMateria("Programação avançada");
      p1.setSalario(3500);
      p1.sala();
      p1.materia();
     
      
          
      }
    
}
