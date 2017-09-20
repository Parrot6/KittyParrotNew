import java.lang.reflect.Array;
import java.util.ArrayList;

public class GameWorld {
	Player MainPlayer;
	public GameWorld(String Filename){
		//load in save here 
	}
	public GameWorld(){
		//New Game
		MainPlayer = new Player();
		MainPlayer.Create(20.0f, 20.0f, 0.0f, 20.0f, 20.0f, 15.1f);
	}
	public void DrawEntities(){
		MainPlayer.Draw();
	}
}
