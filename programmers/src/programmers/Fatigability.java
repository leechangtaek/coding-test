package programmers.src.programmers;

public class Fatigability {
    static int answer = -1;
    public static void main(String[] args) {
        int k = 80;
        int dungeons [][] ={{80,20}, {50,40}, {30,10}};
        boolean [] visited = new boolean[dungeons.length];
        dfs(dungeons, k, visited,0);
        System.out.println(answer);
    }

    public static void dfs(int[][] dungeons, int k,  boolean[] visited, int count) {

        for(int q=0; q<dungeons.length; q++) {
            if(!visited[q] && k>= dungeons[q][0]) {
                visited[q] = true;
                dfs(dungeons, k-dungeons[q][1],visited,count+1);
                visited[q] = false;
            }
        }
        answer = Math.max(answer, count);
    }
}
