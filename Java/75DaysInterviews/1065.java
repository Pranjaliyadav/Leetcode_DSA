class Solution{

    public int[][] indexPairs(String text, String[] words){
        List<int[]> res = new ArrayList(); //will store the answer in this
        Set<String> set = Arrays.stream(words).collect(Collectors.toSet()); //words array to set
        for(int i = 0 ; i < text.length(); i++){
            for(int j = i ; j < text.length() ; j++){
                String subString = text.subString(i, j+1); //j+1 as second index not inclusive and we need i and j both
                if(set.contains(subString)){
                    res.add(new int[]{i,j});
                }
            }
        }
        int[][] ans = new int[res.size()][];
        ans = res.toArray(ans);
        return ans;

    }

}

// //This code is written in Java and creates a Set of type String from an array of strings "words".

// The code makes use of the stream API from Java 8, which provides a functional way to process data collections. In this case, the Arrays.stream(words) method creates a stream from the "words" array.

// The collect method collects the elements of the stream into a Collection. In this case, the Collectors.toSet() method is used to convert the stream into a Set. The resulting set will contain unique elements of the "words" array.

// This code is useful when you want to remove duplicates from an array and store the unique elements in a set.