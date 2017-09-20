
public class AIPlayer implements Actor{
	float XLoc;
	float YLoc;
	float ZLoc;
	float Life;
	float Speed;
	float Direction;
	
	@Override
	public void Move(float x, float y, float z) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TakeDamage(float D) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Heal(float H) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Execute() {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}
}
