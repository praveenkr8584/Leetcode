class Solution {
    class DSU {
        int[] parent;
        int[] rank;

        DSU(int V) {
            parent = new int[V];
            rank = new int[V];
            for (int i = 0; i < V; i++) {
                parent[i] = i;
            }
        }

        int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]); // path compression
            }
            return parent[x];
        }

        boolean union(int u, int v) {
            int pu = find(u);
            int pv = find(v);
            if (pu == pv) return false;

            if (rank[pu] < rank[pv]) {
                parent[pu] = pv;
            } else if (rank[pu] > rank[pv]) {
                parent[pv] = pu;
            } else {
                parent[pv] = pu;
                rank[pu]++;
            }
            return true;
        }
    }

    public int makeConnected(int n, int[][] connections) {
        DSU dsu = new DSU(n);
        int components = n;

        if (connections.length < n - 1) return -1;

        for (int[] edge : connections) {
            if (dsu.union(edge[0], edge[1])) {
                components--;
            }
        }
        return components - 1;
    }
}