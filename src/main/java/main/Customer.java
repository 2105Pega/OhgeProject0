package main;

import java.util.Objects;


public class Customer {

    private String firstName;
    private String lastName;


    Customer(String first, String last){
        this.firstName = first;
        this.lastName = last;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(firstName, customer.firstName) &&
                Objects.equals(lastName, customer.lastName);
    }

}



