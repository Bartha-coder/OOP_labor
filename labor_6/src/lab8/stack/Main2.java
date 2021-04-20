package lab8.stack;

import lab8.elolenyek.Eloleny;

import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {


   StackAggregation stack1 = new StackAggregation(10);

        //stack1.push("szia");


        for (int i = 0; i < 10; ++i) {
            // boxing: int --> Integer
            stack1.push(i);

        }
        System.out.println("StackAggregation : ");
        while (!stack1.isEmpty()) {
            System.out.print(stack1.top() + " ");
            stack1.pop();
        }
        System.out.println();
   StackInheritance stack2 = new StackInheritance(10);
        for (int i = 0; i < 10; ++i) {
            stack2.push(i);
        }
        stack2.remove(1);
        System.out.print("StackInheritance : ");
        System.out.println();
        while (!stack2.isEmpty()) {
            System.out.print(stack2.top() + " ");
            stack2.pop();
        }


    }
}