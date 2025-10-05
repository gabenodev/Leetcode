class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        if (heights == null || heights.length == 0) return result;

        int m = heights.length;
        int n = heights[0].length;

        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        Queue<int[]> pacificQueue = new LinkedList<>();
        Queue<int[]> atlanticQueue = new LinkedList<>();

        int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};

        // Marginile Pacific (sus și stânga)
        for (int i = 0; i < m; i++) {
            pacific[i][0] = true;
            pacificQueue.offer(new int[]{i, 0});
        }
        for (int j = 0; j < n; j++) {
            pacific[0][j] = true;
            pacificQueue.offer(new int[]{0, j});
        }

        // Marginile Atlantic (jos și dreapta)
        for (int i = 0; i < m; i++) {
            atlantic[i][n - 1] = true;
            atlanticQueue.offer(new int[]{i, n - 1});
        }
        for (int j = 0; j < n; j++) {
            atlantic[m - 1][j] = true;
            atlanticQueue.offer(new int[]{m - 1, j});
        }

        // Rulează BFS pentru ambele oceane
        bfs(heights, pacificQueue, pacific, directions);
        bfs(heights, atlanticQueue, atlantic, directions);

        // Găsește intersecțiile
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }

        return result;
    }

    private void bfs(int[][] heights, Queue<int[]> queue, boolean[][] visited, int[][] directions) {
        int m = heights.length, n = heights[0].length;

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int r = cell[0], c = cell[1];

            for (int[] dir : directions) {
                int nr = r + dir[0];
                int nc = c + dir[1];
                if (nr >= 0 && nr < m && nc >= 0 && nc < n &&
                    !visited[nr][nc] &&
                    heights[nr][nc] >= heights[r][c]) {
                    visited[nr][nc] = true;
                    queue.offer(new int[]{nr, nc});
                }
            }
        }
    }
}