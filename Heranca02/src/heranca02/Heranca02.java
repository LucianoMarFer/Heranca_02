/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heranca02;

/**
 *
 * @author Luciano Martinez
 */
public class Heranca02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Hello world!");
        
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        
        //System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setIdade(23);
        a1.setMatricula(0111);
        a1.setCurso("Informatica");
        a1.setSexo("M");
        
        a1.pagarMensalidade();
        //System.out.println(a1.toString());
        System.out.println("--------------");
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        
        
        
    }
    
}
