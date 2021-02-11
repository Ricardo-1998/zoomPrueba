package sv.enfantsdumonde.mibebyyo.utils

import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import sv.enfantsdumonde.mibebyyo.R
import sv.enfantsdumonde.mibebyyo.ui.main.home.HomeFragment
import sv.enfantsdumonde.mibebyyo.ui.main.home.HomeFragmentDirections

fun Fragment.navigateToDestination(destination: NavDirections) {
    this.findNavController().navigate(
        destination
    )
}

fun Fragment.goToHome() {
    this.findNavController().popBackStack(R.id.homeFragment, true)
}

fun HomeFragment.navigateToModule(id: Int) {
    when(id) {
        1 -> navigateToDestination(
            HomeFragmentDirections.openM1Container()
        )
        2 -> navigateToDestination(
            HomeFragmentDirections.openM2Container()
        )
        3 -> navigateToDestination(
            HomeFragmentDirections.openM3Container()
        )
        4 -> navigateToDestination(
            HomeFragmentDirections.openM4ContainerAction()
        )
        5 -> navigateToDestination(
            HomeFragmentDirections.openM5Container()
        )
        6 -> navigateToDestination(
            HomeFragmentDirections.openM6Container()
        )
        7 -> navigateToDestination(
            HomeFragmentDirections.openM7Container()
        )
    }
}