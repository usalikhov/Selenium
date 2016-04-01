package Student1732MD;

import java.util.*;

public class JavaClass {

    List<String> _cityOfRussia = new ArrayList<String>();
    List<String> _cityOfCanada = new ArrayList<String>();
    List<String> _cityOfChina = new ArrayList<String>();
    Map<String, List<String>> _map = new LinkedHashMap<String, List<String>>();

    public JavaClass() {
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

        for(Map.Entry<String, List<String>> n : _map.entrySet()){
            System.out.println(n.getKey()+" "+n.getValue());
        }
    }

}
