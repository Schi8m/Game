/**
* Это класс с отдельно вынесеными литералами. Сделан он для того, чтобы при желании
* перевести игру на другой язык или поменять текст не приходилось искать его в коде.
*/


public class Literals{
	public static final String INFO = "Привет. Это игра на выживание. \nЕсть 4 класса персонажей:"+
	"Воин, Маг, Икар и Птицы. Ты можешь указать кол-во создаваемых персонажей. Характеристики персонажей"+
	" генерируютя случайным образом. Вот пара правил, которые тебе стоит знать: \n"+
	"1. У магов повышенный урон, зависящий от их манны; \n2.Если наземный атакует летающего, он наносит"+
	" в 2 раза меньше урона. \nКаждый персонаж может атаковать сразу нескольких за один ход. "+
	"Эта харрактеристика так же зависит от рандома. В конце каждого хода ты можешь увидеть его результаты и тех кто остался жив.\n\n";

	public static final String START_TEXT = "Введи следующее действие: \n 1. Начать игру.\n 2. Инфорамация об игре.\n 3. Выход.";
	public static final String CREATE_INFO = "Сейчас тебе предстоит создать персонажей. Все просто, основная работа на генераторе"+
	" случайных чисел. Тебе надо только указать сколько персонажей каждого класса будет в игре.\n";

	public static final String NUMBER_OF_WARRIORS = "Сколько воинов ты хочешь создать?";
	public static final String NUMBER_OF_WIZZARDS = "Сколько магов ты хочешь создать?";
	public static final String NUMBER_OF_BIRDS = "Сколько птиц ты хочешь создать?";
	public static final String NUMBER_OF_IKARS = "Сколько Икаров ты хочешь создать?";
	public static final String NUMBER_OF_MOVES = "В случае, если персонажи не переубивают друг-друга в первый же ход, "+
	"в игре предусмотрена система нескольких ходов. Какое максимальное кол-во ходов ты хочешь?";

	public static final String INCORRECT_INPUT = "Ты ввел не верное значение, попробуй еще раз.";

	/**
	* Далее литералы отвечающие за имена песонажей.
	* Генерируются они по типу Литерал + номер по порядку.
	* Пример: warrior1 или bird23.
	*/
	public static final String WARRIOR = "Warrior";
	public static final String WIZZARD = "Wizzard";
	public static final String BIRD = "Bird";
	public static final String IKAR = "Ikar";



	public static final String MOVE_NAME = "\nХод №";
	public static final String LAST_ALIVE = "\n\nПоследний выживший - ";
	public static final String UNITS_STATUS = "\n\nИнформация о персонажах:";
	
	/* Метод вывода лога ходов */

	public static String getAttackLogString(
		String unitName, 
		double damage, 
		String targetName, 
		int damageDevisor, 
		int healthPoint,
		String status
	){
		if (status == Unit.ALIVE){
			return(unitName + " нанёс " + (damage/damageDevisor) + " урона " + targetName + " оставив ему " + healthPoint + " хп.");
		} else{
			return(unitName + " нанёс " + (damage/damageDevisor) + " урона " + targetName +" и убил его.");
		}
	}


	public static String getUnitInfoString(
		String name, 
		int health, 
		double damage, 
		int attackRange, 
		String status
	){
		if (status == Unit.ALIVE){
			return ("Имя - " + name + ", ХП - " + health + ", Урон - " + damage + ", Аттакует за ход - " + attackRange + " раз.");
		} else{
			return (name + " мёртв");
		}
	}
}