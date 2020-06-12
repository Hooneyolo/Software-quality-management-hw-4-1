package Main;
import Calculation.Book_Rental;
import java.util.Scanner;
/**
 * MyApp 클래스
 * 
 * @author (2018315005 유제훈, 2018315033 태영준, 2017190038 키타야마요시아키) 
 * @version (2020. 06. 12)
 */
public class MyApp
{
    public static void main(String[] args){   
        Book_Rental br = new Book_Rental();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();
        
        System.out.print("금액을 입력하세요: ");
        int money = scanner.nextInt();
        
        System.out.print("구작 여부를 입력하세요: ");
        boolean old = scanner.nextBoolean();
               
        System.out.println("요금은 " + br.discount_book(age, money, old) + "원 입니다.");
    }
}
