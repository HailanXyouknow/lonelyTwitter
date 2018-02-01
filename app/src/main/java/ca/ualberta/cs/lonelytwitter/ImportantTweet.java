package ca.ualberta.cs.lonelytwitter;

/**
 * Created by sajediba on 1/17/18.
 */

import java.util.Date;

/**
 * @author hailan
 * @see Tweet
 */
public class ImportantTweet extends Tweet{
    /**
     * Constructs an Important Tweet
     * @param message
     */
    ImportantTweet(String message){
        super(message);
    }

    /**
     * Constructs an Important Tweet with date
     * @param message
     * @param date
     */
    ImportantTweet(String message, Date date){
       super(message,date);
    }

    /**
     * Important Tweet is Important
     *
     * @return true (boolean)
     */
    @Override
    public boolean isImportant(){
        return true;
    }
}
