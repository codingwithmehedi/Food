package developers.world.food.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import developers.world.food.data.remote.dto.recipes.Recipe
import developers.world.food.databinding.ItemLayoutRecipesBinding
import javax.inject.Inject

class RecipeAdapter @Inject constructor() : RecyclerView.Adapter<RecipeAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemLayoutRecipesBinding) :
        RecyclerView.ViewHolder(binding.root)


    val differCallBack = object : DiffUtil.ItemCallback<Recipe>() {
        override fun areContentsTheSame(oldItem: Recipe, newItem: Recipe): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areItemsTheSame(oldItem: Recipe, newItem: Recipe): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differCallBack)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemLayoutRecipesBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount() = differ.currentList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val currentItem = differ.currentList[position]

        holder.binding.apply {
            Glide.with(holder.binding.recipesImageView)
                .load(currentItem.image)
                .into(recipesImageView)

            recipesTitle.text = currentItem.title
            recipesDescription.text = currentItem.summary
        }
    }


}