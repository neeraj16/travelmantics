package dev.amr.travelmantics.data

import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class TravelsRepositoryTest {

    // Class under test
    private lateinit var travelsRepository: TravelsRepository


    private val travel_lasVegas = Travel(
        6573,
        "Las Vegas",
        150000,
        "Las Vegas Holiday Resort",
        "www.link.com"
    )

    private val travel_bananaResort = Travel(
        4345,
        "Banana Resort",
        500000,
        "Trip to Banana Resort",
        "www.another-link.com"
    )

    private val loadedTravels = listOf(travel_lasVegas, travel_bananaResort)
    private val error = Exception("Couldn't load data")


    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun getTravels_travelsAvailable() {

    }


    @Test
    fun getTravels_errorHappens() {

    }


    @Test
    fun getTravels_noTravelsAdded() {

    }
}