package collection;
import character.Hero;
import character.LOL;
import property.Item;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestCollection {
  /*  public static void main(String[] args) {
        Hero heros[]=new Hero[10];
        heros[0]= new Hero("gailun");
        heros[20]= new Hero("teemo");
    }*/
 /* public static void main(String[] args) {
      ArrayList heros = new ArrayList();
      heros.add(new Hero("gaulun"));
      System.out.println(heros.size());
      heros.add(new Hero("teemo"));
      System.out.println(heros.size());
  }*/
/*  public static void main(String[] args) {
      ArrayList heros = new ArrayList();
      for (int i = 0; i < 5; i++) {
          heros.add(new Hero("hero " + i));
      }
 *//*     Hero specialHero = new Hero("Special Hero");
      heros.add(specialHero);
      heros.remove(2);
      heros.set(4,"hero 5");
      System.out.println(heros);
      System.out.println(heros.contains(new Hero("hero 1")));
      System.out.println(heros.contains(specialHero));
    // System.out.println(heros.get(6));
      //System.out.println(heros.get(5));
     // System.out.println(heros.indexOf(specialHero));
      System.out.println(heros.indexOf(new Hero("hero 1")));
      System.out.println(heros.size());*//*
     *//* Hero hs[]=(Hero[])heros.toArray(new Hero[]{});
      System.out.println(hs);*//*
   *//*  ArrayList anotherHeros = new ArrayList();
     anotherHeros.add(new Hero("hero a"));
     anotherHeros.add(new Hero("hero b"));
     anotherHeros.add(new Hero("hero c" ));
      System.out.println(anotherHeros);
      heros.addAll(anotherHeros);
      System.out.println(heros);
      heros.clear();
      System.out.println(heros);
  }*//*
   String name = "hero 1";
   for (int i = 0;i<heros.size();i++){
       Hero h = (Hero)heros.get(i);
       if (name.equals(h.name )){
           System.out.println(name);
           break;
       }
   }
  }*/
  /*public static void main(String[] args) {
      List heros = new ArrayList();
      heros.add(new Hero("garen"));
      System.out.println(heros.size());
  }*/
/*  public static void main(String[] args) {
      List<Hero> genericheros = new ArrayList<>();
}*/
 /* public static void main(String[] args) {
      List<LOL> lol = new ArrayList<>();
      lol.add(new Hero("garen"));
      lol.add(new Item("mana"));
      Hero h1 = (Hero)heros.get
  }*/
/*  public static void main(String[] args) {
      List<Hero>heros = new ArrayList<>();
      for (int i = 0;i<5;i++){
          heros.add(new Hero("hero name "+i));}
         *//* System.out.println("for循环");
          for (int i =0;i<heros.size();i++){
              Hero h = heros.get(i);
              System.out.println(h);
          }*//*
     *//* System.out.println("iterator");
      Iterator<Hero> it = heros.iterator();
      while (it.hasNext()){
          Hero h = it.next();
          System.out.println(h);
      }*//*
     *//* System.out.println("iterator的for写法");
      for (Iterator<Hero>its = heros.iterator();its.hasNext();){
          Hero hero = (Hero)its.next();
          System.out.println(hero);
      }*//*
      System.out.println("iterator的for each");
      for (Hero h: heros){
          System.out.println(h);
      }
      }*/
  public static void main(String[] args) {
      List<Hero> heros = new ArrayList<>();
      for (int i = 0; i < 100; i++) {
          heros.add(new Hero("hero " + i));
      }
      List<Hero> deleteHeros = new ArrayList<>();
      for (Hero h : heros) {
          int id = Integer.parseInt(h.name.substring(5));
          if (0 == id % 8) {
              deleteHeros.add(h);
          }
      }
      for (Hero h : deleteHeros) {
          heros.remove(h);
      }
      System.out.println(heros);
  }
  }


