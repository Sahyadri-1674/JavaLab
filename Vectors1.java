import java.util.*;

public class Vectors1 {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<Integer>(5,10);
        System.out.println("Initial capacity of the Vector is "+vec.capacity());
        System.out.println("Initial size of the Vector is "+vec.size());
        vec.add(12);
        vec.add(1);
        vec.add(12);
        vec.addElement(10);
        vec.add(120);
        vec.add(0);
        System.out.println("Size after adding 6 elements to vector = "+vec.size());
        System.out.println("Vector capacity increased by 10(as specified) after surpassing the initial capacity"+vec.capacity());
        System.out.println("Elements are "+vec);
        System.out.println("*************************************");

        Vector<String> v = new Vector<String>(4);
        System.out.println("Initial capacity of the Vector v is "+v.capacity());
        System.out.println("Initial size of the Vector v is "+vec.size());
        System.out.println("Elements are "+ v);
        v.add("Horse");
        v.add("Cat");
        v.add("Dog");
        System.out.println("Elements are "+ v);
        System.out.println("vector size after adding 3 elements is "+v.size());//Shrinked size to 3 from 4
        v.add("Tiger");
        v.add("Lion");
        v.add("Monkey");
        v.add("Giraffe");
        System.out.println("Elements are "+ v);
        //Capacity becomes double the Initial Capacity after adding elements more than it's Initial Capacity
        System.out.println("Capacity of the vector after adding elements more than it's initial capacity is "+v.capacity());
        v.add("Cheetah");
        v.add("Fish");
        System.out.println("Elements are "+ v);
        //Capacity Increases 2*8 after exceding the previously Increased Capacity
        System.out.println("Capacity of the vector after adding elements more than it's 2nd capacity is "+v.capacity());
        System.out.println("Vector size = "+v.size());
        System.out.println("First Element of the list "+v.firstElement());
        System.out.println("Last Element of the list "+v.lastElement());
        if(v.contains("Tiger")){
            System.out.println("Tiger is present at index "+v.indexOf("Tiger"));
        }
        else{
            System.out.println("Element not present in the list");
        }
        v.remove("Monkey");
        System.out.println("after removing monkey "+v);
//        v.clear();
//        System.out.println(v);
        System.out.println(v.elementAt(1));
        System.out.println(v.get(2));
        System.out.println(v.hashCode());
        v.insertElementAt("Monkey",5);
        System.out.println(v);
        System.out.println("Vector Size = "+v.size());
        v.set(8,"Bibtya");
        System.out.println(v);
    }
}
