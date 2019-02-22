/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4009luisgonzalez;

import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class Actividad4009 {
    public Actividad4009(){
    
    }
    public String encontrarPalabraRepetida(ArrayList<String> palabras)     {
        // Escribe tu código a continuación...
        String palabra=null;
        ArrayList<String> temp=new ArrayList();
        for(int i=0;i<palabras.size();i++){
            for(int x=0;x<temp.size();x++){
                if(!palabras.get(i).equalsIgnoreCase(temp.get(x))){
                    //Si es distinto...
                    temp.add(palabras.get(i));
                }
                else{
                    //Si coincide...
                    palabra=palabras.get(i);
                }
            }
        }
    return palabra;
    
}

}

