package Calculation;


/**
 * Book_Rental ?΄??€
 * 
 * @author (2020.06.10) 
 * @version (2014671038 κΉ?μ§μ,2018315030 ?΄κ°??, 2018315053 ??Ό?€μΉ΄μ ?΄μΉ?)
 */
public class Book_Rental
{

    /**
     * ? ?DVD? ?Έ ?κΈ? κ³μ° λ©μ?. 
     * 
     * @param  age         ??΄λ₯? ?? ₯?? λ§€κ°λ³??
     * @param  money       ?κΈμ ?? ₯?? λ§€κ°λ³??
     * @param  old_book    κ΅¬μ(true),? ?(false) ?Έμ§? ??¨?΄μ£Όλ λ§€κ°λ³??
     * @return money       ?κΈμ return ??€.  
     */
    public int discount_book(int age,int money,boolean old_book)
    {        
        if(old_book == true){
            money = money/2;
        }
        else if(age >=65){
            money = money / 10 * 8;
        }
        else if(age <= 18){
            money = money / 10 * 9;
        }        
        return money;
    }
}
