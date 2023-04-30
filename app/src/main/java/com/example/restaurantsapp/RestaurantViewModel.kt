package com.example.restaurantsapp

import androidx.lifecycle.ViewModel


/* Aware of the lifecycle of the components that instantiated it*/
class RestaurantViewModel(): ViewModel() {
    fun getRestaurants() = dummyRestaurants
}