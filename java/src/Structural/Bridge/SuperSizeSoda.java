//SuperSizeSoda.java - two of two classes extending the Abstract


package Structural.Bridge;

import java.util.*;
import org.apache.commons.lang3.StringUtils;

public class SuperSizeSoda extends Soda {  
   public SuperSizeSoda() {
       setSodaImp();
   }
   
   public String pourSoda() {
       SodaImp sodaImp = this.getSodaImp();
		List retval = new ArrayList();
       for (int i = 0; i < 5; i++) {
           retval.add("...glug...");
           retval.add(sodaImp.pourSodaImp());
       }
       return StringUtils.join(retval, " ");
   }
}
