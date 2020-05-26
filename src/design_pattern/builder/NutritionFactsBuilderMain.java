package design_pattern.builder;

/**
 * Created by leboop on 2020/5/24.
 */
public class NutritionFactsBuilderMain {
    public static void main(String[] args) {
        NutritionFactsBuilder nutritionFacts = new NutritionFactsBuilder
                .Builder(20, 30)
                .builderFat(30)
                .builderSodium(20).builder();
    }
}
