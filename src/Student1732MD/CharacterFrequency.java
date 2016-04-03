/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student1732MD;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Lenovo-Yoga2
 */
public class CharacterFrequency {

    String st = "Space is interesting domain that we should explore";

    List<Character> _list = new ArrayList<Character>();
    Map<Character, Integer> _map = new LinkedHashMap<Character, Integer>();
    int _counter = 0;

    public CharacterFrequency() {

        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) != ' ') {
                _list.add(Character.toLowerCase(st.charAt(i)));
            }
        }

        for (int m = 0; m < _list.size(); m++) {
            for (int j = 1; j < _list.size(); j++) {

                if (_list.get(m).equals(_list.get(j))) {
                    _counter++;
                    _map.put(_list.get(m), _counter);
                    _list.remove(j);

                }

            }
            _counter = 0;
        }

        for (Map.Entry<Character, Integer> n : _map.entrySet()) {
            System.out.println(n.getKey() + " " + n.getValue());
        }
    }

}
