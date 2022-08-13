/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author bryan
 */
public class LibroController {
      NewClass[] tablaALumno;
    int indiceArray;
    
    public LibroController(){
        this.tablaALumno = new NewClass[100];
        this.indiceArray=0;
    }
    
     public void guardarAlumno(NewClass alumno){
        this.tablaALumno[this.indiceArray]=alumno;  
        this.indiceArray=this.indiceArray+1;
    }
    
    public NewClass[] getAlumnos(){
        return this.tablaALumno;
    }
    
}