class Solution {
    public List<String> commonChars(String[] words) {
        int n=words.length;
        int arr[][] = new int[n][26];
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[0].length();j++){
                char ch =words[i].charAt(j);
                arr[i][ch-'a']++;
            }
        }
        List<String> res= new ArrayList<>();
        for(int i=0;i<26;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                min=Math.min(min,arr[j][i]);
            }
            while(min-->0){
                res.add(""+((char)('a'+i)));
            }
        }
        return res;
    }
}