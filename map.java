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
public void getMovement(){
  String move = "";

  // this will read input from gui class. validate -> call movment method

  while(move != "north" || move!= "south" || move != "west" || move != "east"){
    // send prompt to dialog area prompting player to enter a valid movement
  }

  movement(move);
}
  public void movement(String move){

      switch (move){
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
