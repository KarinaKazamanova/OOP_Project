package OOP_Prodject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Party<T extends Character> implements Iterable<T> {
    private ArrayList<T> party;

    public Party() {
        party = new ArrayList<>();
    }

    @Override
    public String toString() {

        return super.toString();
    }

    @Override
    public Iterator<T> iterator() {

        return new PartyIterator<>(party);
    }

    public void addCharacter(T character) {
        party.add(character);
    }

    public List<T> getParty() {
        return party;
    }

    public int size() {
        return party.size();
    }

}
