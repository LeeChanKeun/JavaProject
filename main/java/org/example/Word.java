package org.example;

public class Word {
    private int id;
    private int level;
    private String meaning;
    private String word;
    Word(){}
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
    public String getWord() { return word; }
    public void setMeaning(String meaning){ this.meaning = meaning; }
    @Override
    public String toString(){
        String slevel = "";
        for(int i=0; i<level; i++){
            slevel+="*";
        }
        String str = String.format("%-3s", slevel)
                + String.format("%15s", word) + "  " +meaning;
        return str;
    }

}
