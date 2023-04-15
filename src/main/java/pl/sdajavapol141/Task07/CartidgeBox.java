package pl.sdajavapol141.Task07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CartidgeBox {
    private int capacity = 50;
    public List<String> bullets = new ArrayList<>();

    public CartidgeBox(int capacity) {
        this.capacity = capacity;
        this.bullets = new ArrayList<>(capacity);
    }

    void loadBullet(String bullet) {
        if (bullets.size() < capacity) {
            bullets.add(bullet);
        } else {
            System.out.println("No more space for bullets");
        }
    }

    public boolean isLoaded() {
        return !bullets.isEmpty();
        }

        public void shot () {
            if (isLoaded()) {
                bullets.remove(0);
                System.out.println("Pozostało " + bullets.size() + " kul");
            } else {
                System.out.println("No bullets loaded");
            }
        }
    }
