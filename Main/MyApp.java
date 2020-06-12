package Main;
import Calculation.Book_Rental;
import java.util.Scanner;
/**
 * 여기에 MyApp 클래스 설명을 작성하십시오.
 * 
<<<<<<< HEAD
 * @author (2018315005 유제훈, 2018315033 태영준) 
=======
 * @author (2018315005 유제훈, 2017190038 키타야마요시아키) 
>>>>>>> b24b01c7f2c52f94b834315190602e7cd9d41603
 * @version (2020. 06. 12)
 */
public class MyApp
{
    public static void main(String[] args){
        Book_Rental br = new Book_Rental();
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        int money = scanner.nextInt();
        boolean old = scanner.nextBoolean();
        System.out.println(br.Book_Rental(age, money, old));
    }
}
