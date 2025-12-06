package com.geracode.javaupskillinginterviewroadmap.javastudy.leetcode;

public class CodeBFS547 {


    public int findCircleNum(int[][] isConnected) { //[[1,1,0],[1,1,0],[0,0,1]]

        int n = isConnected.length;   // 3
        boolean[] visited = new boolean[n];  // [false,false,false]
        int provinces = 0;


        for (int i = 0; i < n; i++) { // 0 -2 // city 0.
            if (!visited[i]) {
                provinces++;
                dfs(isConnected, visited, i);
            }
        }
        return provinces;
    }

    void dfs(int[][] isConnected, boolean[] visited, int city) {
        visited[city] = true;
        for (int j = 0; j < isConnected.length; j++) { // 0 - 2
            if (isConnected[city][j] == 1 && !visited[j]) {
                dfs(isConnected, visited, j);
            }
        }
    }


    //city[0]
    //   true, true, false
    //city[1]
    //
    //city[2]
    //   true, true, true


}
