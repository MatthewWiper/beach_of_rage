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
  "head0" = headSheet[0][0];
  "head1" = headSheet[1][0];
  "head2" = headSheet[2][0];
  "head3" = headSheet[3][0];
  "head4" = headSheet[4][0];
  "head5" = headSheet[0][1];
  "head6" = headSheet[1][1];
  "head7" = headSheet[2][1];
  "head8" = headSheet[3][1];
  "head9" = headSheet[4][1];
}
public void initChest(){
  "chest0" = chestSheet[0][0];
  "chest1" = chestSheet[1][0];
  "chest2" = chestSheet[2][0];
  "chest3" = chestSheet[3][0];
  "chest4" = chestSheet[4][0];
  "chest5" = chestSheet[0][1];
  "chest6" = chestSheet[1][1];
  "chest7" = chestSheet[2][1];
  "chest8" = chestSheet[3][1];
  "chest9" = chestSheet[4][1];
}
public void initLegs(){
  "leg0" = legSheet[0][0];
  "leg1" = legSheet[1][0];
  "leg2" = legSheet[2][0];
  "leg3" = legSheet[3][0];
  "leg4" = legSheet[4][0];
  "leg5" = legSheet[0][1];
  "leg6" = legSheet[1][1];
  "leg7" = legSheet[2][1];
  "leg8" = legSheet[3][1];
  "leg9" = legSheet[4][1];
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
public int[] weapData(String weapName){
  int weapStats[] = new int[3];
  switch(weapName){
    case "weap0":
      weapStats[0] = 0;
      weapStats[1] = 0;
      weapStats[2] = 0;
      weapStats[3] = 0;
    case "weap1":
      weapStats[0] = 0;
      weapStats[1] = 0;
      weapStats[2] = 0;
      weapStats[3] = 0;
    case "weap2":
      weapStats[0] = 0;
      weapStats[1] = 0;
      weapStats[2] = 0;
      weapStats[3] = 0;
    case "weap3":
      weapStats[0] = 0;
      weapStats[1] = 0;
      weapStats[2] = 0;
      weapStats[3] = 0;
    case "weap4":
      weapStats[0] = 0;
      weapStats[1] = 0;
      weapStats[2] = 0;
      weapStats[3] = 0;
    case "weap5":
      weapStats[0] = 0;
      weapStats[1] = 0;
      weapStats[2] = 0;
      weapStats[3] = 0;
    case "weap6":
      weapStats[0] = 0;
      weapStats[1] = 0;
      weapStats[2] = 0;
      weapStats[3] = 0;
    case "weap7":
      weapStats[0] = 0;
      weapStats[1] = 0;
      weapStats[2] = 0;
      weapStats[3] = 0;
    case "weap8":
      weapStats[0] = 0;
      weapStats[1] = 0;
      weapStats[2] = 0;
      weapStats[3] = 0;
    case "weap9":
      weapStats[0] = 0;
      weapStats[1] = 0;
      weapStats[2] = 0;
      weapStats[3] = 0;             
    }
   return weapStats;
}

public int[] headStats(String headName){
  int headStats[] = new int[3];
  switch(headName){
    case "head0":
      headStats[0] = 0;
      headStats[1] = 0;
      headStats[2] = 0;
      headStats[3] = 0;
    case "head1":
      headStats[0] = 0;
      headStats[1] = 0;
      headStats[2] = 0;
      headStats[3] = 0;
    case "head2":
      headStats[0] = 0;
      headStats[1] = 0;
      headStats[2] = 0;
      headStats[3] = 0;
    case "head3":
      headStats[0] = 0;
      headStats[1] = 0;
      headStats[2] = 0;
      headStats[3] = 0;
    case "head4":
      headStats[0] = 0;
      headStats[1] = 0;
      headStats[2] = 0;
      headStats[3] = 0;
    case "head5":
      headStats[0] = 0;
      headStats[1] = 0;
      headStats[2] = 0;
      headStats[3] = 0;
    case "head6":
      headStats[0] = 0;
      headStats[1] = 0;
      headStats[2] = 0;
      headStats[3] = 0;
    case "head7":
      headStats[0] = 0;
      headStats[1] = 0;
      headStats[2] = 0;
      headStats[3] = 0;
    case "head8":
      headStats[0] = 0;
      headStats[1] = 0;
      headStats[2] = 0;
      headStats[3] = 0;
    case "head9":
      headStats[0] = 0;
      headStats[2] = 0;
      headStats[1] = 0;
      headStats[3] = 0;
  }
  return headStats;
}

public int[] chestStats(name chestName){
  int chestStats[] = new int[3];
  switch(chestName){
    case "chest0":
      chestStats[0] = 0;
      chestStats[1] = 0;
      chestStats[2] = 0;
      chestStats[3] = 0;
    case "chest1":
      chestStats[0] = 0;
      chestStats[1] = 0;
      chestStats[2] = 0;
      chestStats[3] = 0;
    case "chest2":
      chestStats[0] = 0;
      chestStats[1] = 0;
      chestStats[2] = 0;
      chestStats[3] = 0;
    case "chest3":
      chestStats[0] = 0;
      chestStats[1] = 0;
      chestStats[2] = 0;
      chestStats[3] = 0;
    case "chest4":
      chestStats[0] = 0;
      chestStats[1] = 0;
      chestStats[2] = 0;
      chestStats[3] = 0;
    case "chest5":
      chestStats[0] = 0;
      chestStats[1] = 0;
      chestStats[2] = 0;
      chestStats[3] = 0;
    case "chest6":
      chestStats[0] = 0;
      chestStats[1] = 0;
      chestStats[2] = 0;
      chestStats[3] = 0;
    case "chest7":
      chestStats[0] = 0;
      chestStats[1] = 0;
      chestStats[2] = 0;
      chestStats[3] = 0;
    case "chest8":
      chestStats[0] = 0;
      chestStats[1] = 0;
      chestStats[2] = 0;
      chestStats[3] = 0;
    case "chest9":
      chestStats[0] = 0;
      chestStats[2] = 0;
      chestStats[1] = 0;
      chestStats[3] = 0;
  }
  return chestStats;
}
public int[] legStats(name legName){
  int legStats[] = new int[3];
  switch(legName){
    case "leg0":
      legStats[0] = 0;
      legStats[1] = 0;
      legStats[2] = 0;
      legStats[3] = 0;
    case "leg1":
      legStats[0] = 0;
      legtStats[1] = 0;
      legStats[2] = 0;
      legStats[3] = 0;
    case "leg2":
      legStats[0] = 0;
      legStats[1] = 0;
      legStats[2] = 0;
      legStats[3] = 0;
    case "leg3":
      legStats[0] = 0;
      legStats[1] = 0;
      legStats[2] = 0;
      legStats[3] = 0;
    case "chest4":
      legStats[0] = 0;
      legStats[1] = 0;
      legStats[2] = 0;
      legStats[3] = 0;
    case "chest5":
      legStats[0] = 0;
      legStats[1] = 0;
      legStats[2] = 0;
      legStats[3] = 0;
    case "chest6":
      legStats[0] = 0;
      legStats[1] = 0;
      legStats[2] = 0;
      legStats[3] = 0;
    case "chest7":
      legStats[0] = 0;
      legStats[1] = 0;
      legStats[2] = 0;
      legStats[3] = 0;
    case "leg8":
      legStats[0] = 0;
      legStats[1] = 0;
      legStats[2] = 0;
      legStats[3] = 0;
    case "leg9":
      legStats[0] = 0;
      legStats[2] = 0;
      legStats[1] = 0;
      legStats[3] = 0;
  }
  return legStats;
}
}
