package design_pattern.builder;

/**
 * Created by leboop on 2020/5/24.
 */
public class NutritionFactsBeansMain {
    public static void main(String[] args) {
        NutritionFactsBeans bean=new NutritionFactsBeans();
        bean.setServingSize(20);
        bean.setCalories(30);
        bean.setFat(30);
    }
}
