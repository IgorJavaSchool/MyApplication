package com.firebase.mm.myapplication

import android.os.Parcel
import android.os.Parcelable
import com.google.firebase.firestore.GeoPoint
import java.lang.reflect.Method
import java.util.HashMap

/**
 * Created by MM on 29.01.2018.
 */


enum class Metho(var link: String) {
    TRAIN("train"),
    BUS("bus"),
    CAR("car"),
    PLANE("plane"),
    HITCHHIKING("hitchhiking")
    //BOAT("boat")
}
enum class SocialNetwork(var link: String) {
    VK("VK"),
    WHATSAPP("WHATSAPP"),
    CS("CS"),
    FB("FB"),
    TG("TG")
}
data class User(var name: String = "",
                var lastName: String = "",
                var age: Int = 0,
                var id: String = "0",
                var email: String = "",
                var phone: String = "",
                var countTrip: Int = 0,
                var flightHours: Long = 0,
                var cityFromLatLng: GeoPoint = GeoPoint(0.0, 0.0),
                var cityToLatLng: GeoPoint = GeoPoint(0.0, 0.0),
                var countries: Long = 0,
                var kilometers: Long = 0,
                var route: String = "",
                var cities: HashMap<String, String> = hashMapOf<String, String>(),
                var method: HashMap<String, Boolean> = hashMapOf(Metho.BUS.link to false,
                        Metho.TRAIN.link to false,
                        Metho.PLANE.link to false,
                        Metho.CAR.link to false,
                        Metho.HITCHHIKING.link to false),
                var dates: HashMap<String, Long> = hashMapOf<String, Long>(),
                var budget: Long = 0,
                var budgetPosition: Int = 0,
                var city: String = "",
                var percentsSimilarTravel: Int = 0,
                var addInformation: String = "",
                var sex: Int = 0,
                var socialNetwork: HashMap<String, String> = hashMapOf<String, String>(),
                var data: Long = 0,
                var urlPhoto: String = "https://www.ischool.berkeley.edu/sites/default/files/default_images/avatar.jpeg") : Parcelable {
    override fun describeContents(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}