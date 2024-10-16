class Solution {
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        if (a > 0) pq.offer(new Pair(a, 'a'));
        if (b > 0) pq.offer(new Pair(b, 'b'));
        if (c > 0) pq.offer(new Pair(c, 'c'));

        StringBuilder res = new StringBuilder();

        while (!pq.isEmpty()) {
            Pair node = pq.poll();
            char ch = node.ch;
            int n = res.length();

            // If we have more than two consecutive characters
            if (n >= 2 && res.charAt(n - 1) == ch && res.charAt(n - 2) == ch) {
                // Get the second character
                if (pq.isEmpty()) break; // No other character to use, exit loop

                Pair sec = pq.poll();
                res.append(sec.ch); // Append the secondary character
                sec.count--; // Decrease its count

                if (sec.count > 0) {
                    pq.offer(sec); // Re-add if more instances of sec.ch left
                }

                pq.offer(node); // Re-add the primary character (node) to the queue

            } else {
                // Append the main character normally
                res.append(ch);
                node.count--;

                if (node.count > 0) {
                    pq.offer(node); // Re-add if more instances of node.ch left
                }
            }
        }

        return res.toString();
    }
}

class Pair implements Comparable<Pair> {
    int count;
    char ch;

    Pair(int count, char ch) {
        this.ch = ch;
        this.count = count;
    }

    @Override
    public int compareTo(Pair other) {
        return other.count - this.count; // Max-heap behavior based on count
    }
}
