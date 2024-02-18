/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.lab.pkg4.quest.pkg1;

/**
 *
 * @author Luiz Henrique
 */
public class AdapterAvePato implements Ave {
    
    private Pato pato;
    
    
    public AdapterAvePato(Pato pato){
        this.pato = pato;
 
    }

    @Override
    public void voar() {
        pato.voar();
    }

    @Override
    public void emitirSom() {
        pato.grasnar();
    }

}
