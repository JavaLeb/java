package design_pattern.builder;

/**
 * Created by leboop on 2020/5/24.
 */
public class NutritionFactsConstructor {
    // 必须属性
    private int servingSize;
    private int calories;

    // 可选属性(超过20个，为了方便使用2个)
    private int fat;
    private int sodium;

    // 无参构造器
    public NutritionFactsConstructor() {
    }

    // 必要参数构造器
    public NutritionFactsConstructor(int servingSize, int calories) {
        this.servingSize = servingSize;
        this.calories = calories;
    }

    public NutritionFactsConstructor(int servingSize, int calories, int fat) {
        this(servingSize, calories,fat,0);
    }

    // 全部参数构造器
    public NutritionFactsConstructor(int servingSize, int calories, int fat, int sodium) {
        this.servingSize = servingSize;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
    }
}
