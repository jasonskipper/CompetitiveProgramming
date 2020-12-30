class Solution {
    public int maximumWealth(int[][] accounts) {
        ArrayList<Integer> auxilary = new ArrayList<Integer>();
        for(int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for(int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            auxilary.add(sum);
        }
        auxilary.sort(Comparator.naturalOrder());
        return auxilary.get(auxilary.size()-1);
    }
}
