package FB_practice;
/* Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

*/
public class mergeIntervals {
    public int [][] merge(int [][] intervals){
        int n = intervals.length; 
        //sort
        Arrays.sort(intervals, (a,b)-> (a[0]-b[0]));
        List<int[]> result = new ArrayList<>(); 
        int start = intervals[0][0]; 
        int end = intervals[0][1];
        for(int i =0; i<n; i++){
            if(intervals[i][0]<= end){
                end = Math.max(end, intervals[i][1]);
            }else{
                result.add(new int[]{start, end}); 
                start= intervals[i][0]; 
                end = intervals[i][1]; 
            }
        }
        result.add(new int[] {start, end}); 
        return result.toArray(new int[result.size()][2]);
    }
}
