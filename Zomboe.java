import java.util.*;
import java.io.*;


public class Zomboe {

    private String name;
    private int health;
    private int damage;

    public Zomboe(String n){
        name = n;
    }

    public Zomboe() {

    }

    public void ZomboeHealth(int h){
        health= h;
    }

    public void ZomboeDmg(int d){
        damage = d;
    }
    public int  GetHealth( ){
        return health;
    }
    public String GetName(){
        return name;
    }

    public int GetDamage(){
        return damage;
    }

    public void TakeDamage(int d){
        health -= d;
    }
    public int Attack(){
        return damage;
    }

}
