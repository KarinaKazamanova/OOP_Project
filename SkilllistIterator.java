
import java.util.Iterator;
import java.util.List;

public class SkilllistIterator<T extends Skill> implements Iterator<T> {
    List<T> skill_list;
    private int index;

    @Override
    public boolean hasNext() {
        return index < skill_list.size();
    }

    @Override
    public T next() {
        return skill_list.get(index++);
    }

    public SkilllistIterator(List<T> skill_list) {
        this.skill_list = skill_list;
    }

}
