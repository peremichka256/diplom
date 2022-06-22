/*
 * geom_maker.java
 */

import com.comsol.model.*;
import com.comsol.model.util.*;

/** Model exported on Jun 22 2022, 15:46 by COMSOL 5.6.0.280. */
public class geom_maker {

  public static Model run() {
    Model model = ModelUtil.create("Model");

    model.modelPath("C:\\Users\\perem\\source\\repos\\diplom\\\u041a\u043e\u0434");

    model.component().create("comp1", true);

    model.component("comp1").geom().create("geom1", 2);

    model.component("comp1").mesh().create("mesh1");

    model.component("comp1").physics().create("solid", "SolidMechanics", "geom1");

    model.study().create("std1");
    model.study("std1").create("stat", "Stationary");
    model.study("std1").feature("stat").activate("solid", true);

    model.label("\u0440\u0430\u0437\u0431\u0438\u0440\u0430\u044e\u0441\u044c \u0441 AB.mph");
    model
         .label("\u0437\u0430\u0434\u0430\u043d\u0438\u0435 \u0441\u0442\u0440\u0443\u043a\u0442\u0443\u0440\u044b \u043e\u0431\u0440\u0430\u0437\u0446\u0430.mph");
    model
         .label("\u0437\u0430\u0434\u0430\u043d\u0438\u0435 \u0441\u0442\u0440\u0443\u043a\u0442\u0443\u0440\u044b \u043e\u0431\u0440\u0430\u0437\u0446\u0430.mph");
    model
         .label("\u0437\u0430\u0434\u0430\u043d\u0438\u0435 \u0441\u0442\u0440\u0443\u043a\u0442\u0443\u0440\u044b \u043e\u0431\u0440\u0430\u0437\u0446\u0430.mph");
    model
         .label("\u0437\u0430\u0434\u0430\u043d\u0438\u0435 \u0441\u0442\u0440\u0443\u043a\u0442\u0443\u0440\u044b \u043e\u0431\u0440\u0430\u0437\u0446\u0430.mph");
    model
         .label("\u0437\u0430\u0434\u0430\u043d\u0438\u0435 \u0441\u0442\u0440\u0443\u043a\u0442\u0443\u0440\u044b \u043e\u0431\u0440\u0430\u0437\u0446\u0430.mph");
    model
         .label("\u0437\u0430\u0434\u0430\u043d\u0438\u0435 \u0441\u0442\u0440\u0443\u043a\u0442\u0443\u0440\u044b \u043e\u0431\u0440\u0430\u0437\u0446\u0430.mph");

    return model;
  }

  public static void main(String[] args) {
    run();
  }

}
