/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author siviany
 */
public class Manzana {
    private String color;
    private String sabor;
    private String forma;
    private double peso;
    public Manzana() {
    }
    public Manzana(String color) {
        this.color = color;
    }
    public Manzana(String color, String sabor) {
        this.color = color;
        this.sabor = sabor;
    }
    public Manzana(String color, String sabor, String forma) {
        this.color = color;
        this.sabor = sabor;
        this.forma = forma;
    }
    public Manzana(String color, String sabor, String forma, double peso) {
        this.color = color;
        this.sabor = sabor;
        this.forma = forma;
        this.peso = peso;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getSabor() {
        return sabor;
    }
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public String getForma() {
        return forma;
    }
    public void setForma(String forma) {
        this.forma = forma;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void oxidar(){
        JOptionPane.showMessageDialog(null, "Mazana oxidada");
    }
    public void dividir(){
        JOptionPane.showMessageDialog(null, "Dividir Manzana");
    }
}
