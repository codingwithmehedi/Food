package developers.world.food.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import developers.world.food.data.remote.dto.recipes.FoodRecipesDto
import developers.world.food.util.Constants.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipesDto,
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0

}