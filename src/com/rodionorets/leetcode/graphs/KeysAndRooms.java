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
        for (int i = 0; i < keys.size(); i++) {
            int nextRoom = keys.get(i);
            if (!visited[nextRoom]) {
                visited[nextRoom] = true;
                dfs(rooms, visited, nextRoom);
            }
        }
    }
}
