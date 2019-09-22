package ch02.game2.newpackage;

public class Player {
    private String name;
    private int number;
    public Player(String name){
    }
    
    public String getName() {return this.name;}
    public int guessNumber(){
        this.number = (int)(Math.random()*100); //0-9까지 int형 랜덤숫자 생성
        return this.number;
    }
}
