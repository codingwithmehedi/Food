package developers.world.food.ui.details


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.navArgs
import developers.world.food.R
import developers.world.food.databinding.ActivityDetailsBinding
import developers.world.food.ui.details.fragments.ingredient.IngredientFragment
import developers.world.food.ui.details.fragments.instruction.InstructionFragment
import developers.world.food.ui.details.fragments.overview.OverviewFragment

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding
    private val args by navArgs<DetailsActivityArgs>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarRecipeDetails)
        binding.toolbarRecipeDetails.setTitleTextColor(ContextCompat.getColor(this, R.color.white))
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        //list of fragments
        val fragments = ArrayList<Fragment>()
        fragments.add(OverviewFragment())
        fragments.add(IngredientFragment())
        fragments.add(InstructionFragment())

        //list of title
        val titles = ArrayList<String>()
        titles.add("Overview")
        titles.add("Ingredients")
        titles.add("Instructions")

        val recipeBundle = Bundle()
        recipeBundle.putParcelable("recipeBundle", args.recipe)

        val detailsAdapter = DetailsPagerAdapter(
            recipeBundle,
            fragments,
            titles,
            supportFragmentManager
        )

        binding.viewPagerRecipeDetails.adapter = detailsAdapter
        binding.tabLayoutRecipeDetails.setupWithViewPager(binding.viewPagerRecipeDetails)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        if (item.itemId = android.R.id.home){
//            finish()
//        }
        onBackPressed()
        return super.onOptionsItemSelected(item)

    }

}