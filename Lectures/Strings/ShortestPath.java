public class ShortestPath {
    public static float shortPath(String str){
        int x=0, y=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'E'){     //East
                x++;
            }else if(str.charAt(i) == 'W'){     //West
                x--;
            }else if(str.charAt(i) == 'N'){     //North
                y++;
            }else{     //South
                y--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }
    public static void main(String args[]){
        String str = "WNEENESENNN";
        System.out.println(shortPath(str));
    }
}
