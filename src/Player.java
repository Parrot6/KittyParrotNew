import static org.lwjgl.opengl.GL11.GL_QUADS;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glColor4f;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glVertex2f;

public class Player implements Actor{
	float XLoc;
	float YLoc;
	float ZLoc;
	float Life;
	float Speed;
	float Direction;
	
	@Override
	public void Move(float x, float y, float z) {
		XLoc += x;
		YLoc += y;
		ZLoc += z;
	}

	@Override
	public void TakeDamage(float D) {
		Life -= D;
		if(Life <= 0) Execute();
	}

	@Override
	public void Heal(float H) {
		Life += H;
	}

	@Override
	public void Execute() {
		// TODO Auto-generated method stub
		//LOOT Drops
		//EXP Rewards etc
	}

	@Override
	public float GetXLoc() {
		return XLoc;
	}

	@Override
	public float GetYLoc() {
		return YLoc;
	}

	@Override
	public float GetZLoc() {
		return ZLoc;
	}

	@Override
	public float GetSpeed() {
		return Speed;
	}

	@Override
	public void SetXLoc(float X) {
		this.XLoc = X;
	}

	@Override
	public void SetYLoc(float Y) {
		this.YLoc = Y;		
	}

	@Override
	public void SetZLoc(float Z) {
		this.ZLoc = Z;
	}

	@Override
	public void SetSpeed(float Speed) {
		this.Speed = Speed;
	}
	@Override
	public void Create(float XLoc, float YLoc, float ZLoc, float Life, float Speed, float Direction) {
		this.XLoc = XLoc;
		this.YLoc = YLoc;
		this.ZLoc = ZLoc;
		this.Life = Life;
		this.Speed = Speed;
		this.Direction = Direction;
	}

	@Override
	public void Draw() {
		//TEST CODE
		glBegin(GL_QUADS);
		glColor4f(1,0,0,0);
		glVertex2f(-0.1f, 0.1f);
		glColor4f(1,1,0,0);
		glVertex2f(0.1f, 0.1f);
		glColor4f(1,0,1,0);
		glVertex2f(0.1f, -0.1f);
		glColor4f(1,0,0,1);
		glVertex2f(-0.1f, -0.1f);
	glEnd();
	}
}
