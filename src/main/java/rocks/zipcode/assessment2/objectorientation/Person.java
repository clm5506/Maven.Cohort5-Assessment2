package rocks.zipcode.assessment2.objectorientation;

import java.util.Objects;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */

    Long id;
    String name = "";
    Address personsAddress;

    public Person(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.personsAddress = address;
    }

    public Person() {
        this.id = Long.MIN_VALUE;
        this.personsAddress = new Address();
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return this.personsAddress;
    }

    public void setAddress(Address address) {
        this.personsAddress = address;
    }

    @Override
    public boolean equals(Object o) {
        Person comparisonPerson = (Person) o;
//        if(comparisonPerson.getName().equals(this.name)){
//            return true;
//        } else
        if(Objects.equals(comparisonPerson.getName(),this.name)){
            return true;
        }
        return false;
    }


    @Override
    public String toString(){
        String answer = "Person{id="+id+", "+ "name='"+name + "', "+
                "address="+ personsAddress.toString()+"}";

        return answer;
    }
}