package com.example.countrylist.data

enum class CountryEnum(
    val url: String,
    val countryName: String,
    val capital: String,
    val independenceDay: String,
    val countryInform: String? = null

) {
    ARMNEIA(
        "https://cdn.pixabay.com/photo/2013/07/13/14/14/armenia-162230_960_720.png",
        "Armenia",
        "Erevan",
        "September 21, 1991"
    ),
    RUSSIA(
        "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/640px-Flag_of_Russia.svg.png",
        "Russia",
        "Moscov",
        "June 12, 1992"
    ),

    GERMANY(
        "https://cdn.pixabay.com/photo/2012/04/12/23/52/germany-31017_960_720.png",
        "Germany",
        "Berlin",
        "October 3, 1990"
    ),

    JAPAN(
        "https://upload.wikimedia.org/wikipedia/en/thumb/9/9e/Flag_of_Japan.svg/1200px-Flag_of_Japan.svg.png",
        "Japan",
        "Tokyo",
        "August 15, 1945"
    ),
    AUSTRALIA(
        "https://cdn.pixabay.com/photo/2013/07/13/14/14/australia-162232_960_720.png",
        "Australia",
        "Canberra",
        "January 26, 1788"
    ),
    SWEDEN(
        "https://upload.wikimedia.org/wikipedia/en/thumb/4/4c/Flag_of_Sweden.svg/1200px-Flag_of_Sweden.svg.png",
        "Sweden",
        "Stockholm",
        "June 6, 1809"
    ),
    FRANCE(
        "https://upload.wikimedia.org/wikipedia/en/thumb/c/c3/Flag_of_France.svg/1200px-Flag_of_France.svg.png",
        "France",
        "Paris",
        "July 14, 1789"
    ),
    USA(
        "https://cdn.pixabay.com/photo/2017/02/06/15/09/american-flag-2043285_960_720.png",
        "USA",
        "Washington",
        "July 4, 1766"
    ),
    UKRAINE(
        "https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/Flag_of_Ukraine.svg/800px-Flag_of_Ukraine.svg.png",
        "Ukraine",
        "Kiev",
        "August 24, 1991"
    ),
    BRAZIL(
        "https://upload.wikimedia.org/wikipedia/en/thumb/0/05/Flag_of_Brazil.svg/640px-Flag_of_Brazil.svg.png",
        "Brazil",
        "Portuguese",
        "September 7, 1822"
    ),
    CHINA(
        "https://cdn.britannica.com/90/7490-004-BAD4AA72/Flag-China.jpg",
        "China",
        "Pekin",
        "December 3, 1949"
    ),
    INDIA(
        "https://upload.wikimedia.org/wikipedia/en/thumb/4/41/Flag_of_India.svg/1200px-Flag_of_India.svg.png",
        "India",
        "New Delhi",
        "August 15, 1947"
    )


}