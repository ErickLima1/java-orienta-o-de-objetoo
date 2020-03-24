
package aula12;

 //@author Erick
public class Aula12 {

    public static void main(String[] args) {
        Mamiferos m = new Mamiferos();
        Repetil r = new Repetil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        
        Canguru c = new Canguru();
        
        c.setNome("Canguru");
        c.setIdade(3);
        c.setCorPelo("Marrom");
        c.setMembros(4);
        c.setPeso(55);
        c.locomover();
        c.UsarBolsa();
        c.status();
        System.out.println("================");
        
        Cachorro k = new Cachorro();
        k.setNome("Cachorro");
        k.setIdade(5);
        k.setMembros(4);
        k.setPeso(5);
        k.locomover();
        k.emitirSom();
        k.status();
        System.out.println("================");
        
        Cobra co = new Cobra();
        co.setNome("Cobra");
        co.setIdade(4);
        co.setPeso(23);
        co.setMembros(1);
        co.locomover();
        co.status();
        System.out.println("================");
        
        Tartaruga t = new Tartaruga();
        t.setNome("Tartaruga");
        t.setIdade(10);
        t.setPeso(20);
        t.setMembros(4);
        t.locomover();
        t.alimentar();
        t.status();
        System.out.println("=================");
        
        GoldFish g = new GoldFish();
        g.setNome("PeixeOuro");
        g.setIdade(3);
        g.setPeso(02);
        g.setMembros(1);
        g.locomover();
        g.alimentar();
        g.status();
        System.out.println("=================");
        Arara ara = new Arara();
        ara.setNome("Arara Azul");
        ara.setIdade(6);
        ara.setPeso(12);
        ara.setMembros(2);
        ara.locomover();
        ara.alimentar();
        ara.fazerNinho();
        ara.status();
        
        
        
    }
    
}
