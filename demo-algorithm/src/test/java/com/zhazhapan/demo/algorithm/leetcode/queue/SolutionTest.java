package com.zhazhapan.demo.algorithm.leetcode.queue;

import org.junit.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void numIslands() {
        assert solution.numIslands(new char[][]{{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0',
                '0', '0'}, {'0', '0', '0', '0', '0'}}) == 1;
        assert solution.numIslands(new char[][]{{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '1',
                '0', '0'}, {'0', '0', '0', '1', '1'}}) == 3;
    }

    @Test
    public void openLock() {
        assert solution.openLock(new String[]{"0201", "0101", "0102", "1212", "2002"}, "0202") == 6;
        assert solution.openLock(new String[]{"8888"}, "0009") == 1;
        assert solution.openLock(new String[]{"8887", "8889", "8878", "8898", "8788", "8988", "7888", "9888"},
                "8888") == -1;
        assert solution.openLock(new String[]{"0000"}, "8888") == -1;
    }
}
