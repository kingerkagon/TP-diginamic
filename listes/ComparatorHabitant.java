import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {

    @Override
    public int compare(Ville o1, Ville o2) {
        if (o1.getHabitants() > o2.getHabitants() ){
            return -1;
        }
        if(o1.getHabitants() < o2.getHabitants()){
            return 1;
        }
        else{
            return 0;
        }
    }
}
