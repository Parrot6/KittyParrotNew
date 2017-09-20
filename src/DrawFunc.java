import org.lwjgl.*;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class DrawFunc {

	public DrawFunc(){
		
	}
	
	public void DrawSquare(){
		glBegin(GL_QUADS);
			glColor4f(1,0,0,0);
			glVertex2f(-0.5f, 0.5f);
			glColor4f(1,1,0,0);
			glVertex2f(0.5f, 0.5f);
			glColor4f(1,0,1,0);
			glVertex2f(0.5f, -0.5f);
			glColor4f(1,0,0,1);
			glVertex2f(-0.5f, -0.5f);
		glEnd();
	}
	
	public boolean Draw(){
		
		return false;
	}
}
