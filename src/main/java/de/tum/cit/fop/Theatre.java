package de.tum.cit.fop;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    private Hall hall;
    private Wardrobe wardrobe;
    private List<Customer> queue;

    public Theatre(Hall hall, Wardrobe wardrobe) {
        this.hall = hall;
        this.wardrobe = wardrobe;
        this.queue = new ArrayList<>();
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public void setWardrobe(Wardrobe wardrobe) {
        this.wardrobe = wardrobe;
    }

    public List<Customer> getQueue() {
        return queue;
    }

    public void setQueue(List<Customer> queue) {
        this.queue = queue;
    }

    public void processQueue() {
        int attempts = queue.size();
            Customer customer = queue.remove(0);
            if (hall.enteredHall(customer)) {
                customer.successfullyEnteredHall(wardrobe);
            } else {
                customer.failedToEnterHall();
                queue.add(customer);
            }

    }


}

