package com.firebase.mm.myapplication

import java.util.*

/**
 * Created by MM on 30.01.2018.
 */
class Controller(/*
    User's data base.
     */
        internal var userDao: UserDao) {

    /**
     * Finds users who have not active after the set date.
     * @param date The set date
     * @return
     */
    fun notActiveUsersByTime(date: Long): Map<User, String> {
        val emailsUsers = HashMap<User, String>()
        for (user in userDao.users) {
            if (user.data < date) {
//                if (validEmail(user.email)) {
                emailsUsers.put(user, user.email)
            }
        }
        return emailsUsers
    }

    /**
     * Returns rating first cities.
     * @return
     */
    fun mostPopularCity(): Map<String, Int> {
        val cities = HashMap<String, Int>()
        var keyFirstCity: String
        for (user in userDao.users) {
            keyFirstCity = user.cities["first_city"].toString()
            if (cities.containsKey(keyFirstCity)) {
                cities.put(keyFirstCity, cities.values.size + 1)
            } else {
                cities.put(keyFirstCity, 1)
            }
        }


        val list = ArrayList(cities.entries)

        Collections.sort(list) { a, b -> a.value - b.value }

        return cities
    }
}