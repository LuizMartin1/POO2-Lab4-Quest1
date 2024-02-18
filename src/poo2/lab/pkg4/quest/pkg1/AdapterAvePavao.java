/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.lab.pkg4.quest.pkg1;

/**
 *
 * @author Luiz Henrique
 */
public class AdapterAvePavao implements Ave {
    
    private Pavao pavao;
    
    public AdapterAvePavao(Pavao pavao){
        this.pavao = pavao;
    }

    @Override
    public void voar() {
        System.out.println("Pavao nao voa.");
    }

    @Override
    public void emitirSom() {
       pavao.cantar();
    }
    
}
