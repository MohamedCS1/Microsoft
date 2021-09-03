fun main() {
    val list = arrayListOf<String>()
    list.add("app/src/root/game/file1.cpp")
    list.add("app/src/root/game/file2.cpp")
    list.add("app/src/root/tool/file3.cpp")
    list.add("app/src/root/file4.cpp")
    list.add("app/data/file5.cpp")
    list.add("pom.xml")

    print(list)
}

fun print(list:ArrayList<String>)
{

    var str:String = ""
    for (i in list)
    {
        str = str.plus("$i  ")
    }

    println()

    val nList = str.split("/"," ")

    println(nList)

    val map = arrayListOf<String>()

    for (i in nList)
    {
        if (i == "")
        {
            println()
            continue
        }
        if (map.contains(i))
        {
            print("    ")
            for (d in i) print(" ")
            continue
        }
        else
        {
            print("--->")
            map.add(i)
            print(i)
        }
    }
}

