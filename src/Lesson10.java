import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class Lesson10 
{
	public static void main(String[] args) 
	{
		MonsterTwo.buildBattleBoard();
		
		MonsterTwo[] Monsters = new MonsterTwo[4];
		
		Monsters[0] = new MonsterTwo(1000, 20, 1, "Frank");
		Monsters[1] = new MonsterTwo(500, 40, 2, "Drac");
		Monsters[2] = new MonsterTwo(1500, 15, 1, "Paul");
		Monsters[3] = new MonsterTwo(300, 50, 4, "George");
		
		MonsterTwo.redrowBoard();
	
		for (MonsterTwo m : Monsters)
		{
			if(m.getAlive())
			{
				int arrayItemIndex = ArrayUtils.indexOf(Monsters, m);
				m.moveMonster(Monsters, arrayItemIndex);
			}
		
		}
	
		MonsterTwo.redrowBoard();
	} //END of main()
	
}//END of LessonTen
