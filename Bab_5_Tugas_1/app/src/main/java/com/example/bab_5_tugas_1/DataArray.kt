import com.example.bab_5_tugas_1.R

object DataArray {

    private val languages = listOf("Kotlin", "Ruby", "Python", "JavaScript", "PHP")

    val desk = listOf(
        "Ruby is an open-source and fully object-oriented programming, languages",
        "Ruby on Ralls is a server-side web application development framework written in ruby languages",
        "Python is interpreted scripting and object-oriented programming languages",
        "JavaScript is an objected-based scripting language",
        "PHP is an interepted language, Le., there is no need for compilation"
    )

    private val pictDat = intArrayOf(
        R.drawable.rubby,
        R.drawable.rails,
        R.drawable.python,
        R.drawable.java,
        R.drawable.php
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