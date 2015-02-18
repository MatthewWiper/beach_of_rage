/*

class with item sheets
2-d arrays
random 2 ints from enemey kill = array index

*/
package assignment_3;

import java.util.Random;

public class item{

public String[][] weaponSheet = new int[][];
public String[][] headSheet = new int[][];
public String[][] chestSheet = new int[][];
public String[][] legsSheet = new int[][];

public void initWeapons(){
  "weap0" = weaponSheet[0][0];
  "weap1" = weaponSheet[1][0];
  "weap2" = weaponSheet[2][0];
  "weap3" = weaponSheet[3][0];
  "weap4" = weaponSheet[0][1];
  "weap5" = weaponSheet[1][1];
  "weap6" = weaponSheet[2][1];
  "weap7" = weaponSheet[3][1];
  "weap8" = weaponSheet[0][2];
  "weap9" = weaponSheet[1][2];
  "weap10" = weaponSheet[2][2];
  "weap11" = weaponSheet[3][2];
  "weap12" = weaponSheet[0][3];
  "weap13" = weaponSheet[1][3];
  "weap14" = weaponSheet[2][3];
  "weap15" = weaponSheet[3][3];
}
public void initHead(){
  "head1" = headSheet[0][0];
  "head1" = headSheet[1][0];
  "head1" = headSheet[2][0];
  "head1" = headSheet[3][0];
  "head1" = headSheet[4][0];
  "head1" = headSheet[0][1];
  "head1" = headSheet[1][1];
  "head1" = headSheet[2][1];
  "head1" = headSheet[3][1];
  "head1" = headSheet[4][1];
}
public void initChest(){
  "chest1" = chestSheet[0][0];
  "chest1" = chestSheet[1][0];
  "chest1" = chestSheet[2][0];
  "chest1" = chestSheet[3][0];
  "chest1" = chestSheet[4][0];
  "chest1" = chestSheet[0][1];
  "chest1" = chestSheet[1][1];
  "chest1" = chestSheet[2][1];
  "chest1" = chestSheet[3][1];
  "chest1" = chestSheet[4][1];
}
public void initLegs(){
  "leg1" = legSheet[0][0];
  "leg1" = legSheet[1][0];
  "leg1" = legSheet[2][0];
  "leg1" = legSheet[3][0];
  "leg1" = legSheet[4][0];
  "leg1" = legSheet[0][1];
  "leg1" = legSheet[1][1];
  "leg1" = legSheet[2][1];
  "leg1" = legSheet[3][1];
  "leg1" = legSheet[4][1];
}
public String randWeapon(){
  int x = 0;
  int y = 0;

  Random rnWeap = new Random();
  x = rnWeap.nextInt(4);
  y = rnWeap.nextInt(4);

  return weaponSheet[x][y];

}
public String randHead(){
  int x = 0;
  int y = 0;

  Random rnHead = new Random();
  x = rnHead.nextInt(5);
  y = rnHead.nextInt(2);

  return headSheet[x][y];
}
public String randLegs(){
  int x = 0;
  int y = 0;

  Random rnLegs = new Random();
  x = rnLegs.nextInt(5);
  y = rnLegs.nextInt(2);

  return legSheet[x][y];
}
public String randChest(){
  int x = 0;
  int y = 0;

  Random rnChest = new Random();
  x = rnChest.nextInt(5);
  y = rnChest.nextInt(2);

  return chestSheet[x][y];
}
public void weapData(){

  // ititalize weapon stats/data/name/price
  // [name][0 - damage][1 - price]
  String[16][2] weaponStats = new int [16][2];
  
   = weaponStats[0][0]
   = weaponStats[0][1]
   = weaponStats[1][0]
   = weaponStats[1][1]
   = weaponStats[2][0]
   = weaponStats[2][1]
   = weaponStats[3][0]
   = weaponStats[3][1]
   = weaponStats[4][0]
   = weaponStats[4][1]
   = weaponStats[5][0]
   = weaponStats[5][1]
   = weaponStats[6][0]
   = weaponStats[6][1]
   = weaponStats[7][0]
   = weaponStats[7][1]

}
}
