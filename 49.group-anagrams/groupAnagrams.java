class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> res=new HashMap<>();
        for(String str : strs){
            char[] chArray= str.toCharArray();
            Arrays.sort(chArray);
        String sortedString= new String(chArray);
        if(!res.containsKey(sortedString)){
            res.put(sortedString,new ArrayList<>());
        }
        res.get(sortedString).add(str);

        }
        return new ArrayList<>(res.values());

    }
}
// time comp - O(n)
// space comp - O(n)

// eat - 
// tea - aet
// ate- aet

// tan - ant
// nat -ant

// bat - abt
// hash map key -- sorted value 
// hashmap value - list of string 
