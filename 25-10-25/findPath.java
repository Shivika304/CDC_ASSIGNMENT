
import java.util.ArrayList;
import java.util.List;
public class findPath{
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        if (source == destination) return true;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        for (int[] e : edges) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        boolean[] visited = new boolean[n];
        visited[source] = true;
        boolean changed = true;
        while (changed) {
            changed = false;

            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    for (int neigh : graph.get(i)) {
                        if (!visited[neigh]) {
                            visited[neigh] = true;
                            changed = true;
                        }
                    }
                }
            }
            if (visited[destination]) return true;
        }
        return false;
    }
}
