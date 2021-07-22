abstract public class Unit{
	public static final String ALIVE = "alive";
	public static final String DEAD = "dead";
	public static final String LONG_DEAD = "longdead";
	/* Следующие 4 параметра влияют на механику игры. Менять вдумчиво) */
	protected static final int MAX_VALUE_OF_HEALTH = 100; 
	protected static final int MAX_VALUE_OF_POWER = 70; 
	protected static final int MAX_VALUE_OF_SPEED = 100;
	protected static final int MAX_VALUE_OF_MANNA = 100;
	public static int count = 0;
	protected String name;
	protected int health;
	protected int attackPower;
	protected int speed;
	protected int attackRange;
	protected double damage;
	protected String status;
	abstract void createStats();
	abstract void checkStatus();
}