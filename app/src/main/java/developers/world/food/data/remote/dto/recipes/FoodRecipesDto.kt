package developers.world.food.data.remote.dto.recipes


import com.google.gson.annotations.SerializedName

data class FoodRecipesDto(
    @SerializedName("results")
    val results: List<Recipe>,
)