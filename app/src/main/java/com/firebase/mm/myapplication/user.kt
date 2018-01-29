package com.firebase.mm.myapplication

/**
 * Created by MM on 29.01.2018.
 */
data class user(var name: String,
           var lastName: String,
           var age: Int,
           var id: String,
           var email: String,
           var phone: String,
           var countTrip: Int,
           var flightHours: Long,
//           var cityFromLatLng: GeoPoint,
//           var cityToLatLng: GeoPoint,
           var countries: Long,
           var kilometers: Long,
           var route: String,
           var cities: HashMap<String, String>,
           var method: HashMap<String, Boolean>,
           var dates: HashMap<String, Long>,
           var budget: Long,
           var budgetPosition: Int,
           var city: String,
           var percentsSimilarTravel: Int,
           var addInformation: String,
           var sex: Int,
           var socialNetwork: HashMap<String, String>,
           var data: Long,
           var urlPhoto: String) {
}