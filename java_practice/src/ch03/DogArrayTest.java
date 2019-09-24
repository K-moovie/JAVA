
package ch03;

public class DogArrayTest {
    public void test(){
        Dog[] myDogs = new Dog[3];
        
        myDogs[0] = new Dog("Fred");
        myDogs[1] = new Dog("Marge");
        myDogs[2] = new Dog("Bart");
        
        System.out.print("마지막 개의 이름 : ");
        System.out.println(myDogs[myDogs.length-1].getName());
        System.out.println("------------");
        
        int x = 0;
        while(x < myDogs.length){
            myDogs[x].bark();
            x = x+1;
        }
        System.out.println("------------");
        java.util.Arrays.stream(myDogs).forEach(d->d.bark());
    }
}
