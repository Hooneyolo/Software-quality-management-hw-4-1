package Calculation;


/**
 * Book_Rental ?��?��?��
 * 
 * @author (2020.06.10) 
 * @version (2014671038 �?진수,2018315030 ?���??��, 2018315053 ?��?��?��카유?���?)
 */
public class Book_Rental
{

    /**
     * ?��?��DVD?��?�� ?���? 계산 메소?��. 
     * 
     * @param  age         ?��?���? ?��?��?��?�� 매개�??��
     * @param  money       ?��금을 ?��?��?��?�� 매개�??��
     * @param  old_book    구작(true),?��?��(false) ?���? ?��?��?��주는 매개�??��
     * @return money       ?��금을 return ?��?��.  
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
