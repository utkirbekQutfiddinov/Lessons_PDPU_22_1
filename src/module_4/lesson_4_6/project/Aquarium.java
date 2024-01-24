package module_4.lesson_4_6.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Aquarium implements Runnable {
    private List<Fish> fishlar = new ArrayList<>();
    private List<Fish> fish= Collections.synchronizedList(fishlar);
    private final int MAX_SIZE = 10_000;
    private final int MIN_SIZE = 0;
    private Random rand = SingletonRandom.getInstance();


    @Override
    public void run() {
        birthOfNewFishes(rand.nextInt(1000, 10000));

        while (fish.size() <= MAX_SIZE && fish.size() > MIN_SIZE) {
            reportFishSize();
            for (int i = 0; i < fish.size(); i++) {
                Fish f1 = fish.get(i);

                if (f1.isDead()) {
                    fish.remove(f1);
                    i--;
                    continue;
                }

                for (int j = 0; j < fish.size(); j++) {
                    Fish f2 = fish.get(i);

                    if (f2.isDead()) {
                        fish.remove(f2);
                        j--;
                        continue;
                    }


                    if (i!=j&&f1.isAdult() && f2.isAdult()
//                            && f1.isMale() != f2.isMale()
                            && f1.getX() == f2.getX()
                            && f1.getY() == f2.getY()
                            && f1.isCanBreed()&&f2.isCanBreed()
                            && f1.hashCode()!=f2.hashCode()
                    ) {
                        System.out.println(f1.hashCode() + " fish met " + f2.hashCode() + " fish");
                        f1.setCanBreed(false);
                        f2.setCanBreed(false);
                        if(f1.isMale()!=f2.isMale())
                        birthOfNewFishes(rand.nextInt(10, 20));
                    }
                }
            }
            try {
                Thread.sleep(rand.nextInt(100, 200));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void birthOfNewFishes(int count) {
        for (int i = 0; i < count; i++) {
            Fish newFish = new Fish();
            new Thread(newFish).start();
            fish.add(newFish);
        }
        System.out.println("New fishes count: " + count);
    }

    private void reportFishSize() {
        int maleCount = 0;
        int adultCount = 0;
        int deadCount = 0;

        for (int i = 0; i < fish.size(); i++) {
            Fish fish1 = fish.get(i);
            if (fish1.isDead()) {
                deadCount++;
            }
            if (fish1.isMale()) {
                maleCount++;
            }
            if (fish1.isAdult()) {
                adultCount++;
            }
        }

        System.out.println("Total count: " + fish.size() +
                ",\n" + "Male count: " + maleCount +
                "\nFemale count: " + (fish.size() - maleCount) +
                "\nAdult count: " + adultCount + "\nDead count: " + deadCount);
    }
}
