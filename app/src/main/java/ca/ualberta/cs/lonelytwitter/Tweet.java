/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package ca.ualberta.cs.lonelytwitter;

/**
 * Created by sajediba on 1/17/18.
 */

import java.util.Date;

/**
 * Represents a tweet.
 *
 * @author hailan (original owner sajediba)
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 *
 */

public abstract class Tweet implements Tweetable{

    private String message;
    private Date date;

    Tweet(){

    }

    /**
     * Constructs a tweet object (no date input)
     *
     * @param message
     */
    public Tweet(String message){
        this.message = message;
    }

    /**
     * Constructs a tweet object.
     *
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    /**
     * A getter method
     *
     * @return tweet date
     */
    public Date getDate(){
        return date;

    }

    /**
     * A getter method
     *
     * @return tweet message
     */
    public String getMessage(){
        return message;
    }

    /**
     * Sets tweet message.
     *
     * @param message tweet message
     * @throws TweetTooLongException thrown if tweet exceeds 140 characters
     */

    public void setMessage(String message) throws TweetTooLongException{
        if(message.length() > 160){
            // throw an error
            throw new TweetTooLongException();
        }

        this.message = message;
    }

    /**
     * A setter method for tweet date
     *
     * @param date
     */
    public void setDate(Date date){
        this.date = date;
    }

    public abstract boolean isImportant();

    /**
     *
     * @return tweet message
     */
    @Override
    public String toString(){
        return message;
    }
}
