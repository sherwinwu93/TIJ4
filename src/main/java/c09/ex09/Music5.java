package c09.ex09;

import polymorphism.music.Note;

import static net.mindview.util.Print.print;

abstract class Instrument {
    abstract void play(Note n); // Automatically public

    abstract void adjust();
}

class Wind extends Instrument {
    public void play(Note n) {
        print(this + ".play() " + n);
    }

    public String toString() {
        return "Wind";
    }

    public void adjust() {
        print(this + ".adjust() ");
    }
}

class Percussion extends Instrument {
    public void play(Note n) {
        print(this + ".play() " + n);
    }

    public String toString() {
        return "Percussion";
    }

    public void adjust() {
        print(this + ".adjust() ");
    }
}

class Stringed extends Instrument {
    public void play(Note n) {
        print(this + ".play() " + n);
    }

    public String toString() {
        return "Stringed";
    }

    public void adjust() {
        print(this + ".adjust() ");
    }
}

class Brass extends Wind {
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    public String toString() {
        return "Woodwind";
    }
}

public class Music5 {
    static void tune(Instrument i) {
        // 不知道Instrument到底是什么
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i : e)
            tune(i);
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
