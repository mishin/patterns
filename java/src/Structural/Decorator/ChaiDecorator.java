package Structural.Decorator;


//ChaiDecorator.java - the decorator

import java.util.*;
import org.apache.commons.lang3.StringUtils;

public class ChaiDecorator extends Tea {
    private Tea teaToMakeChai;
    private ArrayList chaiIngredients = new ArrayList();
    
    public ChaiDecorator(Tea teaToMakeChai) {
        this.addTea(teaToMakeChai);
        chaiIngredients.add("bay leaf");
        chaiIngredients.add("cinnamon stick");
        chaiIngredients.add("ginger");
        chaiIngredients.add("honey");
        chaiIngredients.add("soy milk");
        chaiIngredients.add("vanilla bean");
    }

    private void addTea(Tea teaToMakeChaiIn) {
        this.teaToMakeChai = teaToMakeChaiIn;
    }
    
    public String steepTea() {
        return this.steepChai();
    }

    public String steepChai() {
        teaToMakeChai.steepTea();
        return this.steepChaiIngredients();
    }    
    
    public String steepChaiIngredients() {
        ListIterator listIterator = chaiIngredients.listIterator();
		 List<String> retval = new ArrayList<String>();
        while (listIterator.hasNext()) {
				retval.add(listIterator.next() + " is steeping");
        }
        return StringUtils.join(retval,", ");
    }      
}
