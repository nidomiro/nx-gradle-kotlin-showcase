package gradleappinit.app

import de.nidomiro.nxgradlekotlinshowcase.Library1
import de.nidomiro.nxgradlekotlinshowcase.Library2

fun main() {
    val testLib1 = Library1()
    val testLib2 = Library2()

    println(testLib1.someLibraryMethod())
    println(testLib2.someLibraryMethod())
}
