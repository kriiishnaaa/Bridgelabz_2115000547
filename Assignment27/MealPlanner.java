public class MealPlanner{
public static void main(String[] args){
Meal<VegetarianMeal> vegetarianMeal = new Meal<>(new VegetarianMeal());
Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());
Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal());
Meal<HighProteinMeal> highProteinMeal = new Meal<>(new HighProteinMeal());
System.out.println("Vegetarian Meal Plan: " + vegetarianMeal.validateMealPlan());
System.out.println("Vegan Meal Plan: " + veganMeal.validateMealPlan());
System.out.println("Keto Meal Plan: " + ketoMeal.validateMealPlan());
System.out.println("High-Protein Meal Plan: " + highProteinMeal.validateMealPlan());
}
}
interface MealPlan{
String getMealType();
}
class VegetarianMeal implements MealPlan{
public String getMealType(){
return "Vegetarian";
}
}
class VeganMeal implements MealPlan{
public String getMealType(){
return "Vegan";
}
}
class KetoMeal implements MealPlan{
public String getMealType(){
return "Keto";
}
}
class HighProteinMeal implements MealPlan{
public String getMealType(){
return "High-Protein";
}
}
class Meal<T extends MealPlan>{
private T mealPlan;
public Meal(T mealPlan){
this.mealPlan = mealPlan;
}
public T getMealPlan(){
return mealPlan;
}
public boolean validateMealPlan(){
String type = mealPlan.getMealType();
return type.equals("Vegetarian") || type.equals("Vegan") || type.equals("Keto") || type.equals("High-Protein");
}
}
