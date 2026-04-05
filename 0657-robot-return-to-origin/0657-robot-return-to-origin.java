class Solution {
    public boolean judgeCircle(String moves) {
        int y_axis=0;
        int x_axis=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                y_axis++;
            }else if(moves.charAt(i)=='D'){
                y_axis--;
            }else if(moves.charAt(i)=='R'){
                x_axis++;
            }else if(moves.charAt(i)=='L'){
                x_axis--;
            }
        }
        return y_axis == 0 && x_axis == 0;
    }
}