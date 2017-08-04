package com.danielillu;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class TheOfficeGame extends PApplet {

    //THE OFFICE text Adventure
// by Carla Molins

//import processing.sound.*;

    int state;
    int counter;
    PImage sleeping; //variable to load images
    //boolean holder = false ; // test output value
//boolean holder2 = true ; // test output value
//String answer1="";
    PImage clock;
    PImage coffee;
    PImage win1;
    PImage sleepy;
    PImage stain;
    PImage promotion;
    PImage train;
    PImage today;
    PImage superlate;
    PImage cab;
    PImage alarmclock;
    PImage win2;
    PImage jam;
    PImage boss;

    PImage gameover;

    PFont font;


    public static void main(String... args) {
        PApplet.main("com.danielillu.TheOfficeGame");
    }

    public void settings() {
        size(500,500); // define canvas
    }

    public void setup(){
        background (255); //white bg
        sleeping= loadImage("funny-sleeping.jpg");
        clock= loadImage("clock.jpg");
        coffee = loadImage("coffee.jpg");
        win1= loadImage("win1.jpg");
        gameover=loadImage("gameover.gif");
        sleepy=loadImage("sleepy.png");
        stain= loadImage("stain.jpg");
        promotion=loadImage("promotion.jpg");
        train=loadImage("train.jpg");
        today=loadImage("today.jpg");
        superlate=loadImage("superlate.gif");
        cab=loadImage ("cab.jpg");
        alarmclock=loadImage ("alarmclock.jpg");
        win2= loadImage("win2.jpg");
        jam=loadImage("jam.jpg");
        boss=loadImage("boss.jpg");

        font= createFont ("BetterTogetherScript.TTF", 80);

        println("This is the fucking awesome g  ame of: Are you on time?");
        println("Do you want to start your day?");
        println("Answer y/n to continue.");

        state = 0;
        counter = 0;

    }

    public void draw (){

        if (state==0){

            image(sleeping, 0, 0, 500, 500);
            textSize(40);
            textFont(font);
            text("Good morning",50,100);
        }

        if (state==10){

            image(gameover, 0, 0, 500, 500);
            println("Do you want to play again?");

            state=0;

        }


    }


    public void keyPressed(){ // start game

        if (key== 'y' && state==0) { // play & set alarm
            println ("Did you set de alarm?");
            image(clock, 0, 0, 500, 500);
            state=1;
        } // if

        else if (key == 'n'&& state == 0 ) { // Don't want to play?
            // message
            println ("Do you want to play?");
            println ("Cmon is it going to be fun!");

            state=0;

        } // else

        else if (key== 'y'&& state==1) { // set alarm & drinking coffee
            println ("Did you drink coffee?");
            image(coffee, 0, 0, 500, 500);
            state=2;
        } // if

        else if (key == 'n'&& state == 1 ) { // don't set alarm & sleep missing train
            // message
            println ("you keep sleeping a little bit more.");
            println ("Do you get up in 30 minutes?");
            image(sleepy, 0, 0, 500, 500);
            state=7;
        } // else

        else if (key == 'y'&& state == 2 ) { // Waiting train or no
            // message
            println ("You have been so much time having breakfast because you got a stain in your jumper");
            println ("When you arrive to the station you see your train go");
            println ("Do you wait for the next one?");
            image(stain, 0, 0, 500, 500);
            state=3;
        } // else

        else if (key == 'n'&& state == 2 ) { // You arrive, you win!
            // message
            println ("You take your train, and arrive earlier, and you see your boss with pastries!");
            println (" You celebrate your promotion.");
            println ("YOU WIN!");
            image(promotion, 0, 0, 500, 500);
        } // else

        else if (key == 'y'&& state == 3 ) { // Wait the train
            // message
            println ("You see another train coming.");
            println ("Do you try to go with the other one?");
            image(train, 0, 0, 500, 500);
            state=4;

        } // else

        else if (key == 'n'&& state == 3 ) { // You arrive, you win!
            // message
            println ("You see a cab just leaving another person, you get it.");
            println (" You arrive on time!");
            println ("YOU WIN!");
            image(win2,0,0,500,500);

        } // else

        else if (key == 'y'&& state == 4 ) { // You c
            // message
            println ("It is an express train and you end up far away of where you wanted.");
            println ("You arrive so late than the meeting just ended.");
            println ("GAME OVER");
            image(today, 0, 0, 500, 500);
            //state=10;

        } // else

        else if (key == 'n'&& state == 4 ) { // You arrive, you win!
            // message
            println ("Just 3 minutes later arrive your train");
            println ("When you arrive the meeting was just about to begin");
            println ("YOU WIN!");
            image(win1, 0, 0, 500, 500);

        } // else


        else if (key == 'y'&& state == 7 ) { // Alarm, Win!
            // message
            println ("Yay! You listen to the alarm of your neighbour and you call your boss to drive you by");
            println ("YOU WIN!");
            state=8;
            image(alarmclock, 0,0,500,500);

        } // else

        else if (key == 'n'&& state == 7 ) { // Take a cab
            // message
            println ("You wake up 1h later and notice that you have a meeting in half an hour.");
            println ("Do you take a cab?");
            image(cab, 0,0,500,500);

            state=8;
        } // else


        else if (key == 'y'&& state == 8 ) { // Turn right
            // message
            println ("You go through the main street and suddenly you see a lots of cars.");
            println ("Do you ask the taxi driver to turn to the right?");
            image(superlate, 0,0,500,500);
            state=9;

        }

        else if (key == 'y'&& state == 9 ) { // Save time
            // message
            println ("You saved a lot of time because the main street was crowded");
            println ("You arrive at the same time than your boss and you keep talking on the way up");
            println ("YOU WIN!");

            image(boss, 0,0,500,500);

        } // else

        else if (key == 'n'&& state == 9 ) { // Worng decision
            // message
            println ("You got stuck in a traffic jam.");
            println ("You have to pay, and go by foot the last part of the journey.");
            println ("You arrive late, and your boss is really mad at you.");
            println ("GAME OVER.");

            image(jam, 0,0,500,500);

            //state=10

        } // else




        else if (key == 'n'&& state == 8 ) { // Get up
            // message
            println ("You end going by foot.");
            println ("You arrive all sweedy and your boss warns you to fire you!");
            println("GAME OVER");
            image(gameover, 0, 0, 500, 500);
            //state=10;
        } // else


    }



    //ask if you set the alarm
    //if(state == 0 && holder2 == true) {
    // println("Did you set de alarm?");
    //holder2 = false ;
    //clock= loadImage("clock");

    //}

    // if(fillInTheBlank[1] == "yes") {
    //println("Did you set de alarm?") ;
    // }else if(fillInTheBlank[1] == "no") {
    //  println("Did you set de alarm?") ;
    // }
//}

//void keyPressed(yes) {
    // answer1=yes;
    //println (text1);


}
