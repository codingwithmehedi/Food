package developers.world.food.data

import developers.world.food.data.api.FoodRecipesApi
import developers.world.food.data.remote.dto.recipes.FoodRecipesDto
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val api: FoodRecipesApi,
) {

    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipesDto> {
        return api.getRecipes(queries)
    }
    suspend fun searchRecipes(searchQueries: Map<String, String>): Response<FoodRecipesDto> {
        return api.searchRecipes(searchQueries)
    }
}