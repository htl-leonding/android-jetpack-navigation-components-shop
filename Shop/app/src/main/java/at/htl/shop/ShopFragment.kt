package at.htl.shop

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_shop.*
import kotlin.random.Random

class ShopFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shop, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_about.setOnClickListener {
            // Navigation.findNavController(it).navigate(R.id.about_destination)

            //Navigation.findNavController(it).navigate(R.id.next_action)

            val nextAction = ShopFragmentDirections.nextAction(Random.nextInt(200))
            Navigation.findNavController(it).navigate(nextAction)
        }
    }
}

