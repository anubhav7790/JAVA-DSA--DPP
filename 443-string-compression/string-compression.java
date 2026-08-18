class Solution {
    public int compress(char[] chars) {

        if (chars.length == 1) return 1;

        ArrayList<Character> list = new ArrayList<>();

        int i = 0;
        int count = 1;

        while (i < chars.length - 1) {

            char curr = chars[i];

            if (curr == chars[i + 1]) {
                count++;
            }
            else {

                list.add(curr);

                if (count > 1) {
                    String str = String.valueOf(count);

                    for (char c : str.toCharArray()) {
                        list.add(c);
                    }
                }

                count = 1;
            }

            i++;
        }

        // Process the last group
        list.add(chars[i]);

        if (count > 1) {
            String str = String.valueOf(count);

            for (char c : str.toCharArray()) {
                list.add(c);
            }
        }
        
        for(int j = 0 ; j<list.size(); j++){
            chars[j] = list.get(j); 
        }
        return list.size();
    }
}