package developers.world.food.ui.adapter

import androidx.recyclerview.widget.DiffUtil
import developers.world.food.data.remote.dto.recipes.Recipe

class RecipesDiffUtil(
    private val oldList: List<Recipe>,
    private val newList: List<Recipe>,
): DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] === newList[newItemPosition]
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
      return oldList[oldItemPosition] == newList[newItemPosition]
    }
}