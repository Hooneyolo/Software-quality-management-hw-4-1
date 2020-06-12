package Calculation;


/**
 * Book_Rental ?´?ž˜?Š¤
 * 
 * @author (2020.06.10) 
 * @version (2014671038 ê¹?ì§„ìˆ˜,2018315030 ?´ê°??˜, 2018315053 ?…Œ?¼?˜¤ì¹´ìœ ?´ì¹?)
 */
public class Book_Rental
{

    /**
     * ? Œ?ƒˆDVD?• ?¸ ?š”ê¸? ê³„ì‚° ë©”ì†Œ?“œ. 
     * 
     * @param  age         ?‚˜?´ë¥? ?ž…? ¥?•˜?Š” ë§¤ê°œë³??ˆ˜
     * @param  money       ?š”ê¸ˆì„ ?ž…? ¥?•˜?Š” ë§¤ê°œë³??ˆ˜
     * @param  old_book    êµ¬ìž‘(true),?‹ ?ž‘(false) ?¸ì§? ?Œ?‹¨?•´ì£¼ëŠ” ë§¤ê°œë³??ˆ˜
     * @return money       ?š”ê¸ˆì„ return ?•œ?‹¤.  
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
