package com.company;
import java.util.*;
import java.lang.Object;

/**
 * 
 */
public class Asteroid {
    public Asteroid() {

    }

    private boolean isEmpty;
    private int layers;
    private Set<Character> characters;
    private Set<AsteroidBelt> asteroids;
    private Set<DestinationObject> neighbours;
   // private Material material;
    public void Accept(Character c) {
        // TODO implement here
    }
    public void Remove(Character c) {
        // TODO implement here
    }
    public void Step() {
        // TODO implement here
    }
    public void Drilled() {
        // TODO implement here
    }
//    public Material Mined() {
//        // TODO implement here
//        return null;
//    }
    public void AddNeighbour(DestinationObject d) {
        // TODO implement here
    }

    /**
     * @param n
     */
    public void RemoveNeighbour(Asteroid n) {
        // TODO implement here
    }
//    public boolean AddMaterial(Material m) {
//        // TODO implement here
//        return null;
//    }

//    public void RemoveMaterial(Material m) {
//        // TODO implement here
//    }

    public DestinationObject GetNeighbour(int id) {
        // TODO implement here
        return null;
    }

    public int GetRandNeighbour() {
        // TODO implement here
        return 0;
    }

    public void SetSunProximity() {
        // TODO implement here
    }

//    public boolean GetSunProximity() {
//        // TODO implement here
//        return null;
//    }


    public void HitBySunstorm() {
        // TODO implement here
    }


    public void HitByExplosion(Asteroid a) {
        // TODO implement here
    }


    public void Explode() {
        // TODO implement here
    }

}