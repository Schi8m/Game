public class Bird extends Unit implements FlyingUnit{

	/**
	* Генерирует рандомные хар-ки.
	*/
	public void createStats(){
		health = 1 + (int) (Math.random()*MAX_VALUE_OF_HEALTH);
		attackPower = 1 + (int) (Math.random()*MAX_VALUE_OF_POWER);
		speed = 1 + (int) (Math.random()*MAX_VALUE_OF_SPEED);
		status = ALIVE;
	}


	/**
	*Меняет статут юнита после получения урона.
	*/
	public void checkStatus(){
		if (health == 0){
			status = LONG_DEAD;
		} else if (health<0){
			health = 0;
			damage = 0;
			status = DEAD;
		}else{
			status = ALIVE;
		}
	}



	/**
	* Выводит инфу о юните.
	*/
	@Override
	public String toString(){
		return Literals.getUnitInfoString(name, health, damage, attackRange, status);
	}
}