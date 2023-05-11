
import java.util.ArrayList;
import java.util.Iterator;

public class Skilllist<T extends Skill> implements Iterable<T> {
    private ArrayList<Skill> skill_list;

    @Override
    public Iterator<T> iterator() {
        return new SkilllistIterator(skill_list);
    }

}
