package design_pattern.builder;

/**
 * Created by leboop on 2020/5/24.
 */
public class NutritionFactsBuilder {
    // 必须属性
    private int servingSize;
    private int calories;

    // 可选属性(超过20个，为了方便使用2个)
    private int fat;
    private int sodium;

    // 无参构造器
    public NutritionFactsBuilder(Builder builder) {
        this.servingSize = builder.servingSize;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
    }

    public static class Builder {
        // 必须属性
        private int servingSize;
        private int calories;

        // 可选属性(超过20个，为了方便使用2个)
        private int fat;
        private int sodium;

        public Builder(int servingSize, int calories) {
            this.servingSize = servingSize;
            this.calories = calories;
        }

        public Builder builderFat(int fat) {
            this.fat = fat;
            return this;
        }

        public Builder builderSodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public NutritionFactsBuilder builder() {
            return new NutritionFactsBuilder(this);
        }

    }
}
