/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.controlador;

import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Cordinador {
    public String menuCelular(){
        String op=JOptionPane.showInputDialog("Opciones para celular\n"
                + "1.-Asignar valores\n"
                + "2.-Retornar valores\n"
                + "3.-Salir");
        return op;
    }
        
    public String ingresoCelular(){
        String op=JOptionPane.showInputDialog("Opciones para celular\n"
                + "1.-Asignar nombre \n"
                + "2.-Asignar color\n"
                + "3.-Asignar marca\n"
                + "4.-Asignar modelo\n"
                + "5.-Asignar color\n"
                + "6.-Asignar Numero de serie \n");
        return op;
    }
    
    public String retornoCelular(){
        String op=JOptionPane.showInputDialog("Opciones para Celular\n"
                + "1.-Retornar nombre\n"
                + "2.-Retornar color\n"
                + "3.-Retornar marca\n"
                + "4.-Retornar modelo\n"
                + "5.-Retornar color\n"
                + "6.-Retornar Numero de serie \n");
        return op;
    }
    
    public String menuComputador(){
        String op=JOptionPane.showInputDialog("Opciones para Computador\n"
                + "1.-Asignar valores\n"
                + "2.-Retornar valores\n"
                + "3.-Salir");
        return op;
    }
        
    public String ingresoComputador(){
        String op=JOptionPane.showInputDialog("Opciones para computador\n"
                + "1.-Asignar nombre \n"
                + "2.-Asignar color\n"
                + "3.-Asignar marca\n"
                + "4.-Asignar modelo\n"
                + "5.-Asignar color\n"
                + "6.-Asignar Numero de serie \n");
        return op;
    }
    
    public String retornoComputador(){
        String op=JOptionPane.showInputDialog("Opciones Computador\n"
                + "1.-Retornar nombre\n"
                + "2.-Retornar color\n"
                + "3.-Retornar marca\n"
                + "4.-Retornar modelo\n"
                + "5.-Retornar color\n"
                + "6.-Retornar Numero de serie \n");
        return op;
    }
    
    
    public String menuTelevisor(){
        String op=JOptionPane.showInputDialog("Opciones para Teleisor\n"
                + "1.-Asignar valores\n"
                + "2.-Retornar valores\n"
                + "3.-Salir");
        return op;
    }
        
    public String ingresoTelevisor(){
        String op=JOptionPane.showInputDialog("Opciones para Televisor\n"
                + "1.-Asignar nombre \n"
                + "2.-Asignar color\n"
                + "3.-Asignar marca\n"
                + "4.-Asignar modelo\n"
                + "5.-Asignar color\n"
                + "6.-Asignar Numero de serie \n");
        return op;
    }
    
    public String retornoTelevisor(){
        String op=JOptionPane.showInputDialog("Opciones para televisor\n"
                + "1.-Retornar nombre\n"
                + "2.-Retornar color\n"
                + "3.-Retornar marca\n"
                + "4.-Retornar modelo\n"
                + "5.-Retornar color\n"
                + "6.-Retornar Numero de serie \n");
        return op;
    }
    
    
    
    public String menuPrimario(){
        String op=JOptionPane.showInputDialog("Escoja una opcion :\n"
                + "1.-Celular\n"
                + "2.-Computador\n"
                + "3.-Televisor\n"
                + "4.-salir\n"
                );
        return op;
    }
    
     public void menuPrincipal(){
        String op="";
        
        do{
            op=menuPrimario();
            switch(op){
                case "1":
                    menuCelular();
                    break;
                case "2":
                    menuComputador();
                case "3":
                    menuTelevisor();
                    break;
                 
            }
            
        }while(!op.equals("4"));
    }
     
     public void menuPrincipalCelular(){
        String op="";
        do{
            op=menuPrimario();
            switch(op){
                case "1":
                    ingresoCelular();
                    break;
                case "2":
                    retornoCelular();
                    break;
            }
            
        }while(!op.equals("3"));
    }
     
      
  
  public void menuPrincipalComputador(){
        String op="";
        do{
            op=menuPrimario();
            switch(op){
                case "1":
                    ingresoComputador();
                    break;
                case "2":
                    retornoComputador();
                    break;
                
                    
            }
            
        }while(!op.equals("3"));
    }
  
  public void menuPrincipalTelevisor(){
        String op="";
        do{
            op=menuPrimario();
            switch(op){
                case "1":
                    ingresoTelevisor();
                    break;
                case "2":
                    retornoTelevisor();
                    break;
            }
            
        }while(!op.equals("3"));
    }
  
  
}



