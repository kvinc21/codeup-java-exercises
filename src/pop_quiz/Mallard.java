package pop_quiz;

import java.lang.reflect.Field;

public class Mallard extends Duck implements Quackable{

//    comment: flySpeed is a Field(object variable)
    private int flySpeed;

    public Mallard(String name, int age) {
        super(name, age);
        flySpeed = 20;

    }

    public int getFlySpeed() {
        return flySpeed;
    }

    public void setFlySpeed(int flySpeed) {
        this.flySpeed = flySpeed;
    }


    @Override
    public void quack() {
        System.out.println("Quack, Quack");
    }

    public void getDetails(){
        System.out.println("name " + getName() + "\nage " + getAge() + "\nflySpeed " + getFlySpeed());
    }
}
