package com.danielillu;

import processing.core.PApplet;

import java.util.concurrent.TimeUnit;

public class BouncingBall extends PApplet {
    private int xPos;
    private int yPos;

    private int radius;

    private int speedX;
    private int speedY;

    public void settings() {
        size(500,500);
    }

    public void setup(){
        xPos= width/2;
        yPos= height/2;

        radius= 20;

        speedX= 5;
        speedY= 6;

        fill(255, 0, 0);
    }

    public void draw(){
        background(255);
        noStroke();
        xPos+= speedX;
        yPos+= speedY;
        ellipse(xPos, yPos, radius, radius);

        if(xPos> width){
            speedX*= -1;
            fill(0, 255, 0);
            println("The speed is :");
            println(speedX);
        }else if (xPos< 0){
            speedX*= -1;
            fill(0, 0, 255);
            println("The speed is :");
            println(speedX);
        }else if(yPos> height){
            speedY*= -1;
            fill(255, 255, 0);
            println("The speed is :");
            println(speedY);
        }else if(yPos< 0){
            speedY*= -1;
            fill(255, 0, 0);
            println("The speed is :");
            println(speedY);
        }
    }

    public static void main(String... args) {
        PApplet.main("com.danielillu.BouncingBall");
    }

}

