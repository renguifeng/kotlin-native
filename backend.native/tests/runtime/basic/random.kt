package runtime.basic.random

import kotlin.test.*
import kotlin.math.*

@Test
fun runTest() {
    println(random())
    srandom((kotlin.system.getTimeMillis() shr 32).toInt())
    println(random())
}