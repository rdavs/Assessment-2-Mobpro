package org.d3if3008.mobpro1.navigation

import org.d3if3008.mobpro1.ui.screen.KEY_ID_TRAVEL

sealed class Screen(val route: String) {
    data object Home : Screen("mainScreen")
    data object About : Screen("aboutScreen")
    data object FormTravel : Screen("travelScreen")
    data object FormUbah : Screen("travelScreen/{$KEY_ID_TRAVEL}") {
        fun withId(id: Long) = "TravelScreen/$id"
    }
}