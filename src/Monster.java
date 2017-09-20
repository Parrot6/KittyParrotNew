
public interface Monster extends Cloneable {
	
	// only required function of those implementing monster
	public Monster makeCopy();
	
	public void Move(float x, float y, float z);
	
	public void TakeDamage(float D);
	
	public void Heal(float H);
	
	public void Create(float XLoc,
				       float YLoc,
				       float ZLoc,
				       float Life,
				       float Speed,
				       float Direction);
	
	default public void CreateDefault(float XLoc, float YLoc){
		
	}
	public void Execute();
	
	public float GetXLoc();
	public void SetXLoc(float X);
	
	public float GetYLoc();
	public void SetYLoc(float Y);
	
	public float GetZLoc();
	public void SetZLoc(float Z);
	
	public float GetSpeed();
	public void SetSpeed(float Speed);
}
