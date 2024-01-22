package module_4.lesson_4_6.project;

import java.util.Random;

public class Fish implements Runnable{
    private Random rand=SingletonRandom.getInstance();
    private int x;
    private int y;
    private long birthDate;
    private boolean isMale;
    private boolean isAdult;
    private long period;
    private boolean isDead;

    public Fish(){
        birthDate=System.currentTimeMillis();
        this.isMale=rand.nextBoolean();
        //TODO: period is random between 1000 and 5000
    }

    @Override
    public void run() {
        while(!isDead){
            //TODO: is birthdate+period>=current
            //TODO: sleep this thread: sleeping time is random between 100 and 200
            //TODO: set new x,y values they are also random
        }
    }

    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public long getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(long birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    public long getPeriod() {
        return period;
    }

    public void setPeriod(long period) {
        this.period = period;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }
}
