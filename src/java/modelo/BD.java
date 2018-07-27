/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Labing I5
 */
public class BD {
    private ArrayList<persona> personas;
    public BD(){
       this.personas=new ArrayList();
       this.personas.add(new persona("luis","rojas"));
       this.personas.add(new persona("paco","perez"));
       this.personas.add(new persona("hugo","flores"));
    }

    public ArrayList<persona> getPersonas() {
        return personas;
    }

    public void addPersonas(persona personas) {
        this.personas.add(personas);
    }
}
