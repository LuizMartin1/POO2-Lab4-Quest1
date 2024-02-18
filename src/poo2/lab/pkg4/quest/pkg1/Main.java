/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo2.lab.pkg4.quest.pkg1;

/**
 *
 * @author Luiz Henrique
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //CRIANDO UM PATO DOMESTICO
        Pato patoDomestico = new PatoDomestico();
        Ave pato1 = new AdapterAvePato(patoDomestico);
        habilidadeAveGerada(pato1);
        
        
        
        //CRIANDO UM PAVAO AZUL
        Pavao pavaoAzul = new PavaoAzul();
        Ave pavao1 = new AdapterAvePavao(pavaoAzul);
        habilidadeAveGerada(pavao1); 
    }
    public static void habilidadeAveGerada(Ave ave){
            ave.emitirSom();
            ave.voar();
        }
    
}
