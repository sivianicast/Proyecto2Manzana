/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2manzana;

import entidades.Manzana;
import javax.swing.JOptionPane;

/**
 *
 * @author siviany
 */
public class Proyecto2Manzana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String color = "Verde";
        String sabor = "acido";
        Manzana obj1 = new Manzana();
        obj1.dividir();
        Manzana obj2 = new Manzana(color);
        Manzana obj3 = new Manzana(color, sabor);
        JOptionPane.showMessageDialog(null,obj2.getColor());
        obj2.setColor("rojo");
        JOptionPane.showMessageDialog(null,obj2.getColor());
    }
}
