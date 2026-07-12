class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String s1 = words[(startIndex - i + n) % n];
            String s2 = words[(startIndex + i) % n];

            if (Objects.equals(s1, target) || Objects.equals(s2, target)) {
                list.add(i);
            }

        }
        if (list.size() == 0) {
            return -1;
        }
        int min = list.stream().mapToInt(Integer::intValue).min().getAsInt();
        
        return min;

    }
}