import java.util.*;

interface MealPlan {
    void generateMeal();
}

class VegetarianMeal implements MealPlan {
    @Override
    public void generateMeal() {
        System.out.println("Generating Vegetarian Meal Plan...");
    }
}

class VeganMeal implements MealPlan {
    @Override
    public void generateMeal() {
        System.out.println("Generating Vegan Meal Plan...");
    }
}

class KetoMeal implements MealPlan {
    @Override
    public void generateMeal() {
        System.out.println("Generating Keto Meal Plan...");
    }
}

class HighProteinMeal implements MealPlan {
    @Override
    public void generateMeal() {
        System.out.println("Generating High-Protein Meal Plan...");
    }
}

class Meal<T extends MealPlan> {
    private String userName;
    private T mealPlanType;

    public Meal(String userName, T mealPlanType) {
        this.userName = userName;
        this.mealPlanType = mealPlanType;
    }

    public void generatePersonalizedMeal() {
        System.out.println("Generating personalized meal plan for: " + userName);
        mealPlanType.generateMeal();
    }

    public T getMealPlanType() {
        return mealPlanType;
    }
}

class MealPlanValidator {
    public static boolean validateMealPlan(MealPlan mealPlan) {
        return mealPlan != null;
    }
}

public class PersonalizedMealPlanGenerator {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegetarianMeal = new Meal<>("ASD", new VegetarianMeal());
        Meal<VeganMeal> veganMeal = new Meal<>("AFD", new VeganMeal());
        Meal<KetoMeal> ketoMeal = new Meal<>("GFds", new KetoMeal());
        Meal<HighProteinMeal> highProteinMeal = new Meal<>("Eve", new HighProteinMeal());

        List<Meal<? extends MealPlan>> allMeals = List.of(vegetarianMeal, veganMeal, ketoMeal, highProteinMeal);

        for (Meal<? extends MealPlan> meal : allMeals) {
            if (MealPlanValidator.validateMealPlan(meal.getMealPlanType())) {
                meal.generatePersonalizedMeal();
            } else {
                System.out.println("Invalid meal plan.");
            }
        }
    }
}
 
