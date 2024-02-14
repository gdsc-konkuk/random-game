package kr.ac.konkuk

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.datetime.Clock
import kotlin.random.Random

val MEMBER = listOf(
    "백혜선", "최상", "선정민", "김지우", "윤병욱", "신은빈",
    "우이산", "고건호", "김여원", "강조은", "이병직", "주용한", "이지민", "정원준",
    "박성근", "주성천", "김한주", "신성준", "홍승택", "정소은", "문다훈", "고나은", "윤수혁",
    "구서정", "박지원", "김윤진", "김수연", "유가은", "이하윤", "이승범", "김채원", "김채린"
)

fun main() {
    runBlocking {
        val shuffled = MEMBER
            .shuffled(Random(Clock.System.now().toEpochMilliseconds()))
            .take(2)
        println("다음 세션 발표자는")
        delay(1500L)
        println("두구두구두구두구")
        delay(3000L)
        println("${shuffled}입니다!!!!! 와아아아ㅏㅏㅏㅏ")
    }
}
