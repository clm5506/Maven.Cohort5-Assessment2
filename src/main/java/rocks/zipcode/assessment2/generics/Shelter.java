package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<T> extends Ageable implements Iterable<T>{
    ArrayList<T> shelter; //= new ArrayList<>();

    public Shelter() {
        shelter = new ArrayList<>();

    }


    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return shelter.size();
    }

    public void add(Object object) {
        shelter.add((T) object);

    }

    public Boolean contains(Object object) {
        return shelter.contains(object);
    }

    public void remove(Object object) {
        shelter.remove(object);

    }

    public Object get(Integer index) {
        return shelter.get(index);
    }

    public Integer getIndexOf(Object ageable) {
        return shelter.indexOf(ageable);
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}