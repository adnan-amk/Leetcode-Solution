class MyCalendarTwo {
    List<int[]> bookings;
    TreeMap<Integer,Integer> overlapMap;
    public MyCalendarTwo() {
        bookings=new ArrayList<>();
        overlapMap=new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        Integer prevVal= overlapMap.lowerKey(end);
        if(prevVal!=null && start <=overlapMap.get(prevVal)-1)
            return false;
        for(int booking[]:bookings){
            int comStart=Math.max(booking[0],start);
            int comEnd=Math.min(booking[1],end);
            if(comStart<comEnd){
                overlapMap.put(comStart,comEnd);
            }
        }
        bookings.add(new int[]{start,end});
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */