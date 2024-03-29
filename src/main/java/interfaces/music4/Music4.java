package interfaces.music4;

import polymorphism.music.Note;

import static net.mindview.util.Print.print;

abstract class Instrument {
    // Storage allocated for each
    private int i;

    public abstract void play(Note n);

    public String what() {
        return "Instrument";
    }

    public abstract void adjust();
}

class Wind extends Instrument {
    @Override
    public void play(Note n) {
        print("Wind.play() " + n);
    }

    @Override
    public String what() {
        return "Wind";
    }

    @Override
    public void adjust() {

    }
}

class Percussion extends Instrument {
    @Override
    public void play(Note n) {
        print("Percussion.play() " + n);
    }

    @Override
    public String what() {
        return "Percussion";
    }

    @Override
    public void adjust() {

    }
}

class Stringed extends Instrument {
    @Override
    public void play(Note n) {
        print("Stringed.play() " + n);
    }

    @Override
    public String what() {
        return "Stringed";
    }

    @Override
    public void adjust() {

    }
}

class Brass extends Wind {
    @Override
    public void play(Note n) {
        print("Brass.play() " + n);
    }

    @Override
    public String what() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    @Override
    public void play(Note n) {
        print("Woodwind.play() " + n);
    }

    @Override
    public String what() {
        return "Woodwind";
    }
}

public class Music4 {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
/**
 * 创建抽象类,使得抽象性明确起来. 容易重构
 **/