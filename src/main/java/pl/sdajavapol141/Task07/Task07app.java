package pl.sdajavapol141.Task07;

import java.util.ArrayList;
import java.util.List;

public class Task07app {
    public static void main(String[] args) {

        CartidgeBox box = new CartidgeBox(1);
        box.loadBullet("Load bullets");
        System.out.println(box);
        boolean loaded = box.isLoaded();
        System.out.println("Box is loaded ? " + loaded);
        box.shot();
    }
}
