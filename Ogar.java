import java.util.*;
import java.io.*;


public class Ogar{

    private String name;
    private int health;
    private int damage;

    public Ogar(String n){
        name = n;
    }

    public Ogar() {

    }

    public void OgarHealth(int h){
        health= h;
    }

    public void OgarDmg(int d){
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
