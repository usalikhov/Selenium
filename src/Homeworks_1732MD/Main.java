package Homeworks_1732MD;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author 1732MD
 */
public class Main {

    public static void main(String[] args) {
        ArrayListClass _arrayList = new ArrayListClass();

        _arrayList.Init();
        _arrayList.ShowTheList();

        List<String> _cityOfRussia = new ArrayList<String>();
        List<String> _cityOfCanada = new ArrayList<String>();
        List<String> _cityOfChina = new ArrayList<String>();
        Map<String, List<String>> _map = new LinkedHashMap<String, List<String>>();

        _cityOfRussia.add("Moscow");
        _cityOfRussia.add("Ufa");
        _cityOfRussia.add("Piter");

        _cityOfCanada.add("Toronto");
        _cityOfCanada.add("Montreal");
        _cityOfCanada.add("vancouver");

        _cityOfChina.add("Beijing");
        _cityOfChina.add("Shanghai");
        _cityOfChina.add("Hong Kong");

        _map.put("Russia", _cityOfRussia);
        _map.put("Canada", _cityOfCanada);
        _map.put("China", _cityOfChina);

        for (Map.Entry<String, List<String>> n : _map.entrySet()) {
            System.out.println(n.getKey() + " " + n.getValue());
        }

    }
}
