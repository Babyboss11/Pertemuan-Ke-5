import com.example.bab_5_tugas_2.R

object DataArray {

    private val languages = listOf("Ir.Soekarno", "Soeharto", "BJ Habbie", "Abdurrahman Wahid", "Megwati Soekarno P",
        "Susilo Bambang Yudhoyono", "Joko Widodo")

    val desk = listOf(
        "Bung Karno(1945-1966) lahir di blitar 6 juni 1901 merupakan presiden ke-1 indonesia",
        "Soeharto(1966-1998) lahir di kemusuk 8 juni 1921 merupakan presiden ke-2 indonesia",
        "BJ Habibie(1998-1999) lahir di pare-pare 25 juni 1936 merupakan presiden ke-3 indonesia",
        "Abdurrahman Wahid(1999-2001) lahir di jombang 4 agustus 1940 merupakan presiden ke-4 indonesia",
        "Megawati(2001-2004) lahir di yogyakarta 23 januari 1947 merupakan presiden ke-5 indonesia",
        "SBY(2004-2014) lahir di pacitan 9 september 1949 merupakan presiden ke-6 indonesia",
        "Joko Widodo(2015-2014) lahir di surakarta 21 juni 1961 merupakan presiden ke-7 dan ke-8 indoneisa"
    )

    private val pictDat = intArrayOf(
        R.drawable.soekarno,
        R.drawable.harto,
        R.drawable.habibie,
        R.drawable.gusdur,
        R.drawable.mega,
        R.drawable.sby,
        R.drawable.joko
    )

    val listData: ArrayList<GetSetArray>
        get() {
            val list = arrayListOf<GetSetArray>()
            for (position in languages.indices) {
                val listDat = GetSetArray()
                listDat.name = languages[position]
                listDat.detail = desk[position]
                listDat.pict = pictDat[position]
                list.add(listDat)
            }
            return list
        }
}