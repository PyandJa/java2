/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 抽象类;

//import Animalcallsimulator.Simulator.Dog;

/**
 *
 * @author 13340
 */
public class Application {
   public static void main(String[]args){     
        Simulator sim=new Simulator();
        sim.playSound(new Dog());
        sim.playSound(new Cat());
    }
}
