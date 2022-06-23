package lab03.src.lab03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {
    private final String name;
    private String address;

    Person() {
        this.name = "name";
        this.address = "address";
    }


    public Integer[] add_to_array(Integer[] arr, int x)
    {

        List<Integer> arrlist = new ArrayList<>(Arrays.asList(arr));
        arrlist.add(x);
        arr = arrlist.toArray(arr);

        return arr;
    }
    public String[] add_to_array(String[] arr, String x)
    {

        List<String> arrlist = new ArrayList<>(Arrays.asList(arr));
        arrlist.add(x);
        arr = arrlist.toArray(arr);

        return arr;
    }

    public boolean isExistedIn(String[] arr, String x) {
        if (arr == null) {
            return false;
        }
        List<String> arrlist = new ArrayList<>(Arrays.asList(arr));
        return arrlist.contains(x);
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name ;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.address + ")";
    }
}
