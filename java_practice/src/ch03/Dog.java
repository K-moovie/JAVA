
package ch03;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void bark(){
        System.out.println(name + "이(가) 왈!하고 짖습니다.");
    }
    
}
