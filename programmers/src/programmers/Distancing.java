package programmers.src.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Distancing {
    static char[][] room;
    static List<int[]> people;
    static boolean[][] visited;
    static int [] dx = {-1,1,0,0};
    static int [] dy = {0,0,1,-1};
    static boolean flag;
    public static void main(String[] args) {
        String [][] places = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}
                            , {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}
                            , {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}
                            , {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}
                            , {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
        int answer[]= new int [5];
        room = new char[5][5];

        for(int i=0; i<5; i++){
            people = new ArrayList<>();
            visited = new boolean[5][5];
            flag = true;
            //P좌표 people에 저장
            for(int j=0; j<5; j++){
                char[] tmp = places[i][j].toCharArray();
                for(int k=0; k<5; k++){
                    room[j][k] = tmp[k];
                    if(room[j][k] == 'P'){
                        System.out.println(Arrays.toString(new int[]{j,k}));
                        people.add(new int[]{j,k});
                    }
                }
            }
            System.out.println(Arrays.deepToString(room));
            for(int j=0; j<people.size(); j++){
                int [] person = people.get(j);
                dfs(person[0],person[1],person[0],person[1]);
            }
            if(flag) answer[i] = 1;
            else answer[i] = 0;

            System.out.println(Arrays.toString(answer));

        }
    }
    static void dfs(int x, int y, int ax, int ay){
        visited[x][y] = true;

        for(int d=0; d<4; d++){
            int nx = x + dx[d];
            int ny = y + dy[d];

            //위치가 내부이고 방문을 안했을때
            if(!inBound(nx, ny)) continue;

            if(inDistance(ax,ay,nx,ny)){
                if(room[nx][ny] == 'P'||room[nx][ny] == 'O'){
                    dfs(nx,ny,ax,ay);

                    if(room[nx][ny] == 'P') flag = false;
                }
            }
        }
    }
    static boolean inDistance(int x1, int y1, int x2, int y2){
        int xd = Math.abs(x2-x1);
        int yd = Math.abs(y2-y1);

        return (xd + yd) <= 2 ? true : false;
    }
    // 탐색 위치가 내부에 있으며, 이전에 방문했는지 확인
    private static boolean inBound(int x, int y) {
        if (x >= 0 && y >= 0 && x < 5 && y < 5 && !visited[x][y]) return true;
        return false;
    }
}
