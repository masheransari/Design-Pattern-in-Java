/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter.pattern_example;

/**
 *
 * @author asher.ansari
 */
public class AdapterPattern_example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AudioPlayer player = new AudioPlayer();
        player.play("mp3", "beyond the horizon.mp3");
        player.play("mp4", "alone.mp4");
        player.play("vlc", "far far away.vlc");
        player.play("avi", "mind me.avi");
    }

}
