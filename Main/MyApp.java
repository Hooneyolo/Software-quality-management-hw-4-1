package Main;
import Calculation.Book_Rental;

/**
 * 여기에 MyApp 클래스 설명을 작성하십시오.
 * 
 * @author (2018315005 유제훈, 2017190038 키타야마요시아키) 
 * @version (2020. 06. 12)
 */
public class MyApp 
{
    public static void main(String[] args){
        Book_Rental br = new Book_Rental();
        
        System.out.println(br.discount_book(66, 10000, false));
    }
}
