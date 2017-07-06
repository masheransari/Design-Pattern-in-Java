/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter.pattern.pkg1;

/**
 *
 * @author asher.ansari
 */
public class AdapterPattern1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AudioPlayer ap = new AudioPlayer();
        ap.play("mp3", "abc.mp3");
        ap.play("mp4", "def.mp4");
        ap.play("avi", "ghi.avi");
        ap.play("3gp", "jkl.3gp");
        ap.play("mp4", "mno.mp4");
        ap.play("mp3", "pqr.mp3");
    }

}
