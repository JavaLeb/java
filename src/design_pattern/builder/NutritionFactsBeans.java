package design_pattern.builder;

/**
 * Created by leboop on 2020/5/24.
 */
public class NutritionFactsBeans {
    // 必须属性
    private int servingSize;
    private int calories;

    // 可选属性(超过20个，为了方便使用2个)
    private int fat;
    private int sodium;

    // 无参构造器
    public NutritionFactsBeans() {
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }
}
