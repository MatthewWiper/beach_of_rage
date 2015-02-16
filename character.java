package assignment_3;

// All characters have same stats but different sheet
// make abstract -> call new players/enemeys as needed
public abstract class character {
  private int hp = 0;
  private name = "";
}

// Ecapsulation. Make inner workings private
public void setHP(int hp){
  this.hp = hp;
}
public int getHP(){
  return hp;
}
public String setName(String name){
  this.name = name;
}
public String getName(){
  return name;
}
public void setStrength(int strength){
  this.srength = strength;
}
public int getStrength(){
  return strength;
}
public void setEvasion(int evasion){
  this.evasion = evasion;
}
public int getEvasion(){
  retrun evasion;
}
public void setVit(int vit){
  this.vit = vit;
}
public int getVit(){
  return vit;
}
