package Main;
import Calculation.Book_Rental;
import java.util.Scanner;
/**
 * main 메소드문
 * 
 * @author (2018315005 유제훈, 2018315033 태영준, 2017190038 키타야마요시아키) 
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
        System.out.println(br.discount_book(age, money, old));
    }
}