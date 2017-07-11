/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder_pattern_example;

/**
 *
 * @author asher.ansari
 */
public interface Item {
    Pack getPack();
    String getName();
    float amount();
}
