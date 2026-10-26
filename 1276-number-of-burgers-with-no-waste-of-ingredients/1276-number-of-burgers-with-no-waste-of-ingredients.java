class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        
         if (tomatoSlices % 2 != 0) {
            return new ArrayList<>();
        }

        int jumbo = (tomatoSlices - 2 * cheeseSlices) / 2;
        int small = cheeseSlices - jumbo;

        if (jumbo < 0 || small < 0 || 4 * jumbo + 2 * small != tomatoSlices) {
            return new ArrayList<>();
        }

        return Arrays.asList(jumbo, small);
    }
}