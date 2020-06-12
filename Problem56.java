/*
Given a collection of intervals, merge all overlapping intervals.

For example,
Given [1,3],[2,6],[8,10],[15,18],
return [1,6],[8,10],[15,18].
*/

public List<Interval> merge(List<Interval> intervals) {
    if(intervals == null || intervals.size()<=1){
        return intervals;
    }
 
    Collections.sort(intervals, Comparator.comparing((Interval itl)->itl.start));
 
    List<Interval> result = new ArrayList<>();
    Interval t = intervals.get(0);
 
    for(int i=1; i<intervals.size(); i++){
        Interval c = intervals.get(i);
        if(c.start <= t.end){
            t.end = Math.max(t.end, c.end);
        }else{
            result.add(t);
            t = c;
        }
    }
 
    result.add(t);
 
    return result;
}
