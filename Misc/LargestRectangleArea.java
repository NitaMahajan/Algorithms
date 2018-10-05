import java.util.*;
public class LargestRectangleArea {
    public static void main(String args[]) {
        int histogram[]={1,2,3,4,5,3,3,2};
        int area = largestAreaUnderHistogram(histogram);
        System.out.println("The maximum possible area is: "+area);
    }
    static int largestAreaUnderHistogram(int a[]){
        
        /*Create a hashmap to store the number of occurances of each height*/
        HashMap<Integer,Integer> count=new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(count.containsKey(a[i])){
                count.put(a[i],count.get(a[i])+1);
            }
            else{
                count.put(a[i],1);
            }
        }
        
        /*Initialize the area array with the size being equal to the number of distinct heights*/
        int area[]=new int[count.keySet().size()];
        
        /*Sort the keyset of the hashmap in descending order of height*/
        List list = new LinkedList(count.keySet());
        Collections.sort(list,new Comparator(){
            public int compare(Object o1,Object o2){
                return ((Integer)o2-(Integer)o1);
            } 
        });
        
        /*Calculating the area at each height row and storing in area*/
        int number=0;
        int c=0;
        for(Object i:list){
            if(c<count.keySet().size()){
                number = number+count.get((Integer)i);
                area[c]=number;
                c++;
            }else{
                break;
            }
        }
        
        /*Multiplying each area value with a multiplication factor,that increases as the height increases*/
        int max=Integer.MIN_VALUE;
        int multiplicationFactor=1;
        for(int i=area.length-1;i>=0;i--){
            if((multiplicationFactor*area[i])>max){
                max=(multiplicationFactor*area[i]);
            }
            multiplicationFactor++;
        }
        return max;
    }
}
