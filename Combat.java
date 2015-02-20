/* if combat roll = success then call this class to initiate combat */
package assignment_3;
import java.util.random;
public class Combat extends Enemy
{
int areaSeed = 0;
int hp = 0;
int armour = 0;
double evasion = 0; 
Random rnd = new Random();
// set seed value
Enemy enemy = new Enemy();

public int randHP(areaSeed)
{
	int hp = rnd.nextInt(100);
	return hp;
}
public int randArmour(areaSeed)
{
	int armour = rnd.nextInt(100);
	return armour;
}
public double randEvasion(areaSeed)
{
	double evasion = rnd.nextInt(100);
	return evasion;
}
/* if combat roll = success then call this class to initiate combat */
}


