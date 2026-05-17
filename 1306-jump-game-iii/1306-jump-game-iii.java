class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean[] visited = new boolean[arr.length];
        return dfs(arr, start, visited);
    }
    
    private boolean dfs(int[] arr, int index, boolean[] visited) {
        // Out of bounds
        if (index < 0 || index >= arr.length) return false;
        
        // Already visited — avoid infinite loop
        if (visited[index]) return false;
        
        // Found a zero
        if (arr[index] == 0) return true;
        
        // Mark as visited BEFORE recursing
        visited[index] = true;
        
        int left  = index - arr[index];
        int right = index + arr[index];
        
        return dfs(arr, left, visited) || dfs(arr, right, visited);
    }
}