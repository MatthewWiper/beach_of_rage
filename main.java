package assignment_3;

import javax.swing.*;
public class start{
  Player player = new Player();
  public static void main(String[] args){
    start driver = new start();
    driver.start();
  }

  public void start(){
    // initalize playable character


  }
  // method to allow player to input player stats from gui
  public void setInitalStats(){
    player.setHp(100);
    player.setName(name);
    player.setVit(5);
    player.setStrngth(5);
    player.setEvasion(5);
  }

  public void setPlayerStats(){

  }
}
