import java.util.*;
import java.io.*;


public class Skellabone {

    private String name;
    private int health;
    private int damage;

    public Skellabone(String n){
        name = n;
    }

    public Skellabone() {

    }

    public void SkellaboneHealth(int h){
        health= h;
    }

    public void SkellaboneDmg(int d){
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
