package ca.ualberta.cs.lonelytwitter;

/**
 * Created by sajediba on 1/17/18.
 */

import java.util.Date;

/**
 *  Represents a normal tweet
 *  @see Tweet
 */
public class NormalTweet extends Tweet {
    /**
     * Constructs a normal tweet
     *
     * @param message
     */
    NormalTweet(String message){
        super(message);

    }

    /**
     * Constructs a normal tweet with date input
     * @param message
     * @param date
     */
    NormalTweet(String message, Date date){
        super(message,date);
    }

    /**
     * Normal tweets are described as not important
     *
     * @return false (boolean)
     */
    @Override
    public boolean isImportant(){
        return false;
    }
}
