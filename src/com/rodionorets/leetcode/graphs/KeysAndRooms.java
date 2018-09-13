package com.rodionorets.leetcode.graphs;

import java.util.List;

public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];

        visited[0] = true;

        dfs(rooms, visited, 0);

        for (boolean visit : visited) {
            if (!visit) {
                return false;
            }
        }

        return true;
    }

    private void dfs(List<List<Integer>> rooms, boolean[] visited, int room) {
        List<Integer> keys = rooms.get(room);
        for (Integer key : keys) {
            if (!visited[key]) {
                visited[key] = true;
                dfs(rooms, visited, key);
            }
        }
    }
}
