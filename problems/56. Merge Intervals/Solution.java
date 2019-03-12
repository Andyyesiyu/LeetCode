/**
 * Definition for an interval. public class Interval { int start; int end;
 * Interval() { start = 0; end = 0; } Interval(int s, int e) { start = s; end =
 * e; } }
 */
class Solution {

    private class IntervalComparator implements Comparator<Interval> {
        @Override
        public int compare(Interval a, Interval b) {
            if (a.start == b.start) {
                return 0;
            } else if (a.start > b.start) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    public List<Interval> merge(List<Interval> intervals) {
        if (intervals == null) {
            return null;
        }
        List<Interval> result = new LinkedList<>();
        if (intervals.size() == 0) {
            return result;
        }
        Collections.sort(intervals, new IntervalComparator());

        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        for (Interval interval : intervals) {
            if (interval.start <= end) {
                end = Math.max(end, interval.end);
            } else {
                result.add(new Interval(start, end));
                start = interval.start;
                end = interval.end;
            }
        }
        result.add(new Interval(start, end));
        return result;
    }
}