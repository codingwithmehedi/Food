package developers.world.food.data.database

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import developers.world.food.data.remote.dto.recipes.FoodRecipesDto

class RecipesTypeConverter {

    var gson = Gson()

    @TypeConverter
    fun foodRecipeToString(foodRecipe: FoodRecipesDto): String{
        return gson.toJson(foodRecipe)
    }

    @TypeConverter
    fun stringToFoodRecipe(data: String): FoodRecipesDto{

        val listType = object : TypeToken<FoodRecipesDto>() {}.type

        return gson.fromJson(data,listType)
    }
}