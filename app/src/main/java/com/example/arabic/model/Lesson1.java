package com.example.arabic.model;

public class Lesson1 {
    private int Arabic;
    private String sound;
    private String Uzbek;

    public Lesson1(int arabic, String sound, String uzbek) {
        Arabic = arabic;
        this.sound = sound;
        Uzbek = uzbek;
    }

    public int getArabic() {
        return Arabic;
    }

    public void setArabic(int arabic) {
        Arabic = arabic;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getUzbek() {
        return Uzbek;
    }

    public void setUzbek(String uzbek) {
        Uzbek = uzbek;
    }
}
