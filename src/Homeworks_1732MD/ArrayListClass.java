package Homeworks_1732MD;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Lenovo-Yoga2
 */
public class ArrayListClass {

    private ArrayList _list;
    private Random _random;

    public ArrayListClass() {
        this._list = new ArrayList<>();
        this._random = new Random();
    }

    public void Init() {

        for (int i = 0; i < 20; i++) {
            _list.add(_random.nextInt());
        }
    }
    
    public void ShowTheList(){
        for (int i = 0; i < _list.size(); i++) {
            System.out.println(_list.get(i));
        }
    }

}
