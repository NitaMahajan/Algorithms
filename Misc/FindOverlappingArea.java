
/* There are 2 overlapping rectangles on a plane. For each rectangle, given the bottom-left and the top-right coordinates,
* find the overlapping area between the two rectangles
*/


public class FindOverlappingArea {
    public static void main(String args[]) {
        int[][] coordinates_rect1 = {{0,0},{10,7}};
        int[][] coordinates_rect2 = {{3,-8},{15,5}};
        
        int area = findOverlappingArea(coordinates_rect1,coordinates_rect2);
        System.out.println(area);
    }
    static int findOverlappingArea(int a[][], int b[][]){
        
        /*Find maximum X and Y values from the bottom coordinates */
        int startX,startY,endX,endY;
        if(a[0][0]>b[0][0]){
            startX = a[0][0];
        }else{
            startX = b[0][0];
        }
        
        if(a[0][1] > b[0][1]){
            startY = a[0][1];
        }else{
            startY = b[0][1];
        }
        
        /*Find minimum X and Y values from the top coordinates */
        
        if(a[1][0] < b[1][0]){
            endX = a[1][0];
        }else{
            endX = b[1][0];
        }
        
        if(a[1][1] < b[1][1]){
            endY = a[1][1];
        }else{
            endY = b[1][1];
        }
        
        return (endX-startX)*(endY-startY);
    }
    
}
