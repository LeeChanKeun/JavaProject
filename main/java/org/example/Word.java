package org.example;

public class Word {
    private int id;
    private int level;
    private String meaning;
    private String word;
    Word(int id, int level, String word, String meaning){
        this.id = id;
        this.level = level;
        this.word = word;
        this.meaning = meaning;
    }



    public String getName() {
        return word;
    }
    public void setName(String name) {
        this.word = name;
    }
}
