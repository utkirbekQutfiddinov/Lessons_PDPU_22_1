package module_4.lesson_4_6.project;

import java.util.Random;

public class Fish implements Runnable {
    private Random rand = SingletonRandom.getInstance();
    private Integer x;
    private Integer y;
    private long birthDate;
    private boolean isMale;
    private boolean isAdult;
    private long period;
    private boolean isDead;
    private boolean canBreed=true;
    private long lastBreedTime;

    public Fish() {
        birthDate = System.currentTimeMillis();
        this.isMale = Math.random()*2>=1;
        this.period = rand.nextInt(10000, 50000);
    }

    @Override
    public void run() {
        while (!isDead) {
            if (System.currentTimeMillis() > (birthDate + period / 5)) {
                isAdult = true;
            }
            if (System.currentTimeMillis() >= birthDate + period) {
                isDead = true;
                break;
            }
            if (isAdult && System.currentTimeMillis() > (lastBreedTime + period / 5)) {
                canBreed = true;
            }

            try {
                Thread.sleep(rand.nextInt(10, 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int x=rand.nextInt(1,10);
            int y=rand.nextInt(1,10);
            this.setX(1);
            this.setY(1);
        }
    }

    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }

    public boolean isCanBreed() {
        return canBreed;
    }

    public void setCanBreed(boolean canBreed) {
        this.canBreed = canBreed;
    }

    public long getLastBreedTime() {
        return lastBreedTime;
    }

    public void setLastBreedTime(long lastBreedTime) {
        this.lastBreedTime = lastBreedTime;
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

    @Override
    public String toString() {
        return "Fish{" +
                "x=" + x +
                ", y=" + y +
                ", isMale=" + isMale +
                ", isAdult=" + isAdult +
                ", isDead=" + isDead +
                '}';
    }
}
