package de.tum.cit.fop;

import java.util.ArrayList;
import java.util.List;

public class Wardrobe {
    private List<String> stack;

    public Wardrobe() {
        this.stack = new ArrayList<>();
    }

    public List<String> getStack() {
        return stack;
    }

    public void setStack(List<String> stack) {
        this.stack = stack;
    }

    public void addItemToStack(String item) {
        stack.add(item);
    }

    public void takeItemFromStack() {
        if (!stack.isEmpty()) {
            String item = stack.remove(stack.size() - 1);
            System.out.println(item + " is hanging");
        }
    }
}

