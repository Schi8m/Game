import java.util.Scanner;
import java.util.InputMismatchException;


/**
*@author schi8m
*@version MyGame  2.4
*@since MyGame  2.3
* Класс - интерфейс взаимодействия с пользователем.
*/

public class Game{

static int numbersOfUnits[] = new int[4];
static int numberOfMoves;

	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		boolean isContinue = true;
		while (isContinue){
			System.out.println(Literals.START_TEXT);
			int x = fetchIntFromConsole();
			
			switch (x) {
				case (1): startGame();
				isContinue = false;
				break;
				case (2): System.out.println(Literals.INFO);
				break;
				case (3): isContinue = false;
				break;
				default: System.out.println(Literals.INCORRECT_INPUT);
			}
		}
	}
	
	/**
	*Принимает какое кол-во юнитов каждого типа нужно создать.
	*/
	private static void startGame(){
		Scanner scan = new Scanner(System.in);
		System.out.println(Literals.CREATE_INFO);
		System.out.println(Literals.NUMBER_OF_WARRIORS);
		numbersOfUnits[0] = fetchIntFromConsole();
		System.out.println(Literals.NUMBER_OF_WIZZARDS);
		numbersOfUnits[1] = fetchIntFromConsole();
		System.out.println(Literals.NUMBER_OF_BIRDS);
		numbersOfUnits[2] = fetchIntFromConsole();
		System.out.println(Literals.NUMBER_OF_IKARS);
		numbersOfUnits[3] = fetchIntFromConsole();
		System.out.println(Literals.NUMBER_OF_MOVES);
		numberOfMoves = fetchIntFromConsole();
		Engine.createHeroes(numbersOfUnits, numberOfMoves);
	}


	public static int fetchIntFromConsole(){
		Scanner scan = new Scanner(System.in);
		int number = 0;
		boolean incorrectInput = true;
		while (incorrectInput){
			try{
				number = scan.nextInt();
				incorrectInput = false;
			}
			catch(InputMismatchException e){
				System.out.println(Literals.INCORRECT_INPUT);
				scan.next();
			}
		}
		return number;
	}
}

