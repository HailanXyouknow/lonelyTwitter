package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Hailan on 2018-01-17.
 */

import java.util.Date;

public abstract class Tweet implements Tweetable{

    private String message;
    private Date date;

    Tweet(){

    }
    // Constructors
    public Tweet(String message){
        this.message = message;
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    // Getters
    public Date getDate(){
        return date;
    }

    public String getMessage(){
        return message;
    }

    // Setters
    public void setMessage(String message) throws TweetTooLongException{
        if(message.length() >160){
            // throw an error
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public abstract boolean isImportant();
}
