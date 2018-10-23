package cab_gav;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Turn {
    private IntegerProperty turnNr = new SimpleIntegerProperty();
    private IntegerProperty guess = new SimpleIntegerProperty();
    private IntegerProperty bulls = new SimpleIntegerProperty();
    private IntegerProperty cows = new SimpleIntegerProperty();

    public int getTurnNr() {
        return turnNr.get();
    }

    public IntegerProperty turnNrProperty() {
        return turnNr;
    }

    public void setTurnNr(int turnNr) {
        this.turnNr.set(turnNr);
    }

    public int getGuess() {
        return guess.get();
    }

    public IntegerProperty guessProperty() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess.set(guess);
    }

    public int getBulls() {
        return bulls.get();
    }

    public IntegerProperty bullsProperty() {
        return bulls;
    }

    public void setBulls(int bulls) {
        this.bulls.set(bulls);
    }

    public int getCows() {
        return cows.get();
    }

    public IntegerProperty cowsProperty() {
        return cows;
    }

    public void setCows(int cows) {
        this.cows.set(cows);
    }



}
