import kotlin.math.abs

/**
 *  정수 n 과 가까운순으로 정렬
 */

class Solution {
    fun solution(numlist: IntArray, n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        numlist.sortDescending()
        val result = numlist.sortedBy{abs(it-n)}
        answer = result.toIntArray()
        return answer
    }
}

fun main() {
    val s = Solution()
    s.solution(intArrayOf(1, 2, 3, 4, 5, 6), 4)    //[4, 5, 3, 6, 2, 1]
    s.solution(intArrayOf(10000, 20, 36, 47, 40, 6, 10, 7000), 30)    //[36, 40, 20, 47, 10, 6, 7000, 10000]
}