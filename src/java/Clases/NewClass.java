/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Clases;

/**
 *
 * @author bryan
 */
public class NewClass {
    private String cod;
    private String primero;
    private String segundo;
    private String editorial;
    private String año;
    
    public NewClass(String cod, String primero, String segundo, String editorial, String año){
        this.cod=cod;
        this.primero=primero;
        this.segundo=segundo;
        this.editorial= editorial; 
        this.año=año;
    }


    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    
    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getPrimero() {
        return primero;
    }

    public void setPrimero(String primero) {
        this.primero = primero;
    }

    public String getSegundo() {
        return segundo;
    }

    public void setSegundo(String segundo) {
        this.segundo = segundo;
    }

    
    
}
