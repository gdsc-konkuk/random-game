package kr.ac.konkuk

import kotlinx.coroutines.*
import kotlinx.datetime.Clock
import kotlin.random.Random

val CORE_MEMBER = listOf(
    "이현우", "김현재", "백혜선", "최상", "이수지", "선정민", "김지우", "윤병욱", "신은빈"
)
const val CURRENT_MEMBER = "선정민"

fun main() {
    runBlocking {
        val shuffled = CORE_MEMBER
            .filter { it != CURRENT_MEMBER }
            .shuffled(Random(Clock.System.now().toEpochMilliseconds()))
        println("다음 코어 회의 총괄은")
        delay(1500L)
        println("두구두구두구두구")
        delay(3000L)
        println("${shuffled.first()}입니다!!!!! 와아아아ㅏㅏㅏㅏ")
    }
}
