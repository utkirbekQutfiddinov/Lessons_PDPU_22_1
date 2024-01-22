package module_4.lesson_4_6.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Aquarium implements Runnable{
    private List<Fish> fish=new ArrayList<>();
    private final int MAX_SIZE=10_000;
    private final int MIN_SIZE=0;
    private Random rand=SingletonRandom.getInstance();


    @Override
    public void run() {
        while(fish.size()<=MAX_SIZE && fish.size()>MIN_SIZE){
            //TODO: report fish size
            for (int i = 0; i < fish.size(); i++) {
                //TODO: check if fish is dead, if so remove it from the list


                for (int j = 0; j < fish.size(); j++) {


                    if(i!=j && fish.get(i).isAdult()&&fish.get(j).isAdult()
                            &&fish.get(i).isMale()!=fish.get(j).isMale()
                            && fish.get(i).getX()==fish.get(j).getX()
                            &&fish.get(i).getY()==fish.get(j).getY()
                    ){
                        //TODO: print message: which fishes met and how many fish were born
                        //TODO: implement birth of new fish
                    }
                }
            }
            //TODO: sleep
        }
    }
}
