package assignment_3;

public class map{

  // create map with 2-d array
  // make public?
  public int[*][*] map = new int [*][*];
  public int x = 0;
  public int y = 0;
  public void getCurrentPosition(){


  }

  // logic for movement

  public void movement(String move){

      switch (moveInput){
        case "north":
          y++;
        case "east":
          x++;
        case "south":
          v--;
        case "west":
          x--;
      }
  }
}
