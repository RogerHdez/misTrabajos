/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcmasterrace;

/**
 *
 * @author roger
 */
public class testPc {

    public static void main(String[] pony) {
        ModelosVideo nvidia = new ModelosVideo();
        ModelosProcesador mod = new ModelosProcesador();
        PcMasterRace hp = new PcMasterRace("intel",2.4,"DDR3",3);
        Video video = new Video(mod.intel(),2.4,"DDR3",8,nvidia.nvidia1080());
        System.out.println(hp);
        System.out.println(video);
        
    }
}
