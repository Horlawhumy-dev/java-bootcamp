package com.haroffcode;

import com.haroffcode.Exercises.Circle;
import com.haroffcode.Exercises.ShapeInterface;
import com.haroffcode.Exercises.Shapes;
import com.haroffcode.Exercises.Square;
import com.haroffcode.list.LL;
import com.haroffcode.list.DLL;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        LL ll = new LL();
//
//        ll.insertFirst(3);
//        ll.insertFirst(2);
//        ll.insertFirst(8);
//        ll.insertFirst(17);
//        ll.insertFirst(9);
//        ll.insertLast(99);
//        ll.insert(100, 3);
//
//        ll.displayList();
//        System.out.println(ll.find(2));
//        System.out.println(ll.delete(2));
//
//        ll.displayList();
//        Main m = new Main();
        // m.getArray();

        DLL ll = new DLL();

        ll.insertFirst(3);
        ll.insertFirst(2);
        ll.insertFirst(8);
        ll.insertFirst(17);

        ll.display();
//
////        ShapeInterface shape = new Shapes();
//        Circle circle = new Circle();
////        shape.toStringShape();
//        circle.setRadius(5);
//        double area = circle.Area();
//        System.out.println("Area of circle is " + area);
//
//        Square square = new Square();
//        square.setLength(8);
//        double areaOfSquare = square.Area();
//        System.out.println("Area of square is " + areaOfSquare);
//
//
//        List<String> list = new ArrayList<>();
//        list.add("California");
//        list.add("Alaska");
//        list.add("Oregon");
//
//        Iterator<String> itr = list.iterator();
//        while (itr.hasNext()){
//            String value = itr.next();
//            System.out.println(value);
//        }
//        System.out.println(list);
//    }
//
//    public void getArray(){
//        int[] sized = new int[10];
//        int[] copied = new int[5];
//        System.out.println("Sized Arrays");
//        for (int i = 0; i < sized.length; i++) {
//            sized[i] = i * 100;
//        }
//        for(int value: sized){
//            System.out.println(value);
//        }
//        System.out.println("Copied Arrays");
//        System.arraycopy(sized, 4, copied, 0, 4);
//        for (int value: copied){
//            System.out.println(value);
//        }
//    }
    }
}
