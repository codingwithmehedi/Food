package developers.world.food.util

object Constants {

    const val BASE_URL = "https://api.spoonacular.com"
    const val API_KEY = "7eb49ed5863546b7b1581c8f207046c6"

    //API Query Keys
    const val QUERY_SEARCH = "query"
    const val QUERY_NUMBER = "number"
    const val QUERY_API_KEY = "apiKey"
    const val QUERY_TYPE = "type"
    const val QUERY_DIET = "diet"
    const val QUERY_ADD_RECIPE_INFORMATION = "addRecipeInformation"
    const val QUERY_FILL_INGREDIENTS = "fillIngredients"


    //Room Database
    const val DATABASE_NAME = "recipes_database"
    const val RECIPES_TABLE = "recipes_table"


    //bottom sheet and preferences
    const val DEFAULT_RECIPES_NUMBER = "50"
    const val DEFAULT_MEAL_TYPE ="main course"
    const val DEFAULT_DIET_TYPE ="gluten free"

    const val PREFERENCES_NAME = "food_preferences"
    const val PREFERENCES_MEAL_TYPE = "mealType"
    const val PREFERENCES_MEAL_TYPE_ID = "mealTypeId"
    const val PREFERENCES_DIET_TYPE = "dietType"
    const val PREFERENCES_DIET_TYPE_ID = "dietTypeId"
    const val PREFERENCES_BACK_ONLINE = "backOnline"
}