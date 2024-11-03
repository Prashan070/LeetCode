class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
//Look into this and do again "hmap.put(i,hmap.getOrDefault(i,0)+1);"
        for (int num : arr) {
            if (freqMap.containsKey(num)) {
                freqMap.put(num, freqMap.get(num) + 1);
            } else {
                freqMap.put(num, 1);
            }
        }

        HashSet<Integer> unique = new HashSet<>();
        for (int frequency : freqMap.values()) {
            if (unique.contains(frequency)) {
                return false;
            } else {
                unique.add(frequency);
            }

        }

        return true;

    }
}
