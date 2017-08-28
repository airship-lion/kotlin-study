package com.zfy.kotlin.day4

/**
 * Created by bahamut on 2017/8/27.
 * Desc  加上关键字tailrec会自动把尾递归优化为迭代
 */

tailrec fun findListNode(head: ListNode?, value: Int): ListNode? {
    head ?: return null
    if (head.value == value) {
        return head
    }
    return findListNode(head.next, value)
}

data class ListNode(val value: Int, var next: ListNode? = null)

fun main(args: Array<String>) {
    val MAX_COUNT = 100000
    val head = ListNode(0)
    var p=head
    for (i in 1..MAX_COUNT) {
        p.next = ListNode(i)
        p = p.next!!
    }
    println(findListNode(head, MAX_COUNT - 2))
}