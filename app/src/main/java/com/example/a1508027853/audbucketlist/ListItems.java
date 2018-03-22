package com.example.a1508027853.audbucketlist;

/**
 * Created by 1508027853 on 3/21/2018.
 */

public class ListItems {

    // Initialize the boolean and the strings
    private boolean Completion;
    private String Date;
    private String Title;

    // define the List Items
    public ListItems(boolean completion, String date, String title) {
        Completion = completion;
        Date = date;
        Title = title;
    }

    // Get ListItem attributes methods
    public boolean isCompleted() {
        return Completion;
    }
    public String getDate() {
        return Date;
    }
    public String getTitle() { return Title; }

    // Set ListItem attributes methods
    public void setTitle(String title) { Title = title; }
    public void setCompletion(Boolean isCompleted) { this.Completion = isCompleted; }
    public void setCompletedDate(String date) { this.Date = date; }
}
