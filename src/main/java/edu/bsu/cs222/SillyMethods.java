package edu.bsu.cs222;

public class SillyMethods {
    public boolean didGuess42(int inputNumber) {
        if (inputNumber == 42) {return true;}
        else {return false;}
    }
    public String countTo(int inputNumber) {
        StringBuilder returnString = new StringBuilder();
        for (int number = 0; number <= inputNumber; number++) {returnString.append(number).append(" ");}
        return returnString.toString().trim();}
}