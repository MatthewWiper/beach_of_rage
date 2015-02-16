package assignment_3;

import javax.swing.*;
public class InitGame{
  Player player = new Player();
  public static void main(String[] args){
    InitGame driver = new InitGame();
    driver.start();
  }

  public void start(){
    // initalize game -> GUI
    //                   Player character
    // After intial character creation -> intiialize map 


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
