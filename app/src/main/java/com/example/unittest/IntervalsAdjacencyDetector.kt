package com.example.unittest

class IntervalsAdjacencyDetector {

    fun isAdjacent(interval1: Interval, interval2: Interval): Boolean {
        return interval1.end == interval2.start
                || interval1.start == interval2.end
    }
}