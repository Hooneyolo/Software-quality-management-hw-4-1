package Main;
import Calculation.Book_Rental;
import java.util.Scanner;
/**
 * 여기에 MyApp 클래스 설명을 작성하십시오.
 * 
 * @author (2018315005 유제훈, 2018315033 태영준) 
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
