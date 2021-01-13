package com.moose.micompose.data

data class City(val name: String, val lat: Double, val lng: Double, val images: List<String>)
object Data {
    val cities = listOf(
        City("New York", 40.7128, -74.0060, listOf(
            "https://images.pexels.com/photos/290386/pexels-photo-290386.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
            "https://images.pexels.com/photos/3546426/pexels-photo-3546426.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
            "https://images.pexels.com/photos/3583571/pexels-photo-3583571.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
            "https://images.pexels.com/photos/2570208/pexels-photo-2570208.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
            "https://images.pexels.com/photos/3052361/pexels-photo-3052361.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"
        )),

        City("London", 51.5074, - 0.1278, listOf(
            "https://images.pexels.com/photos/726484/pexels-photo-726484.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
            "https://images.pexels.com/photos/672532/pexels-photo-672532.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
            "https://images.pexels.com/photos/269128/pexels-photo-269128.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
            "https://images.pexels.com/photos/230793/pexels-photo-230793.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
            "https://images.pexels.com/photos/1560101/pexels-photo-1560101.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"
        )),

        City("Nairobi", -1.2921, 36.8219, listOf(
            "https://cdn.pixabay.com/photo/2017/09/08/21/32/nairobi-2730268__340.jpg",
            "https://images.pexels.com/photos/4242550/pexels-photo-4242550.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
            "https://cdn.pixabay.com/photo/2019/08/22/06/59/rhino-4422728__340.jpg",
            "https://cdn.pixabay.com/photo/2018/02/10/13/07/city-3143632__340.jpg",
            "https://cdn.pixabay.com/photo/2014/05/26/09/05/nairobi-354282__340.jpg"
        )),

        City("Tokyo", 35.6804, 139.7690, listOf(
            "https://images.pexels.com/photos/2614818/pexels-photo-2614818.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
            "https://images.pexels.com/photos/2506923/pexels-photo-2506923.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
            "https://images.pexels.com/photos/590478/pexels-photo-590478.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
            "https://images.pexels.com/photos/427747/pexels-photo-427747.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
            "https://images.pexels.com/photos/96422/pexels-photo-96422.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"
        )),

        City("Los Angeles", 34.0522, -118.2437, listOf(
            "https://images.pexels.com/photos/2695679/pexels-photo-2695679.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
            "https://images.pexels.com/photos/3166785/pexels-photo-3166785.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
            "https://images.pexels.com/photos/1412235/pexels-photo-1412235.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
            "https://images.pexels.com/photos/2816168/pexels-photo-2816168.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
            "https://images.pexels.com/photos/672915/pexels-photo-672915.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"
        )),

        City("Berlin", 52.5200, 13.4050, listOf(
            "https://images.pexels.com/photos/109630/pexels-photo-109630.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
            "https://images.pexels.com/photos/248216/pexels-photo-248216.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
            "https://images.pexels.com/photos/65567/pexels-photo-65567.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
            "https://images.pexels.com/photos/2817497/pexels-photo-2817497.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
            "https://images.pexels.com/photos/109628/pexels-photo-109628.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"
        )),

        City("Cape Town", -33.9249, 18.4241, listOf(
            "https://images.pexels.com/photos/4253928/pexels-photo-4253928.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
            "https://images.pexels.com/photos/5025774/pexels-photo-5025774.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
            "https://images.pexels.com/photos/3720715/pexels-photo-3720715.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
            "https://images.pexels.com/photos/4873260/pexels-photo-4873260.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
            "https://images.pexels.com/photos/4064212/pexels-photo-4064212.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"
        )),

        City("Paris", 48.8566, 2.3522, listOf(
            "https://images.pexels.com/photos/338515/pexels-photo-338515.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
            "https://images.pexels.com/photos/1460145/pexels-photo-1460145.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
            "https://images.pexels.com/photos/2130611/pexels-photo-2130611.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
            "https://images.pexels.com/photos/2130610/pexels-photo-2130610.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
            "https://images.pexels.com/photos/705764/pexels-photo-705764.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"
        )),
    )
}