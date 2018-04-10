package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String input = " "; //other
        int i = 0; //menu
        boolean done = false;
        Event aEvent;
        Speaker aSpeaker;

        //Array
        ArrayList<Event> events = new ArrayList<>();

        //set Event

        Event bootcamp = new Event("Bootcamp","2/13/18");
        Event sports = new Event ("Sports","2/24/18");



        System.out.println("Use this prompt to create an event");

        do {

            aEvent = new Event();
            aSpeaker = new Speaker();
            System.out.print("Enter the name of the event: ");
            aEvent.setTitle(keyboard.nextLine());
            System.out.print("Add speaker: ");
            aSpeaker.setSpeakerName(keyboard.nextLine());

            System.out.println("Your event: " + aEvent.getTitle());
            System.out.println("Event speaker: " + aSpeaker.getSpeakerName());
            events.add(aEvent);


            System.out.println("Do you want to enter another speaker? (Y/N))");
            input = keyboard.nextLine();

            if(input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("Yes")){
                done = false;
            } else {
                done = true;
            }
        }while (done != true);

       for(Event eachEvents : events){
       System.out.println("Get an event and a speaker"+ eachEvents.getTitle() );
            for(Speaker eachSpeaker: eachEvents.getSpeaker()){
                System.out.println(eachSpeaker.getSpeakerName());
            }

        }
    }
}
