public static boolean isUnique(String s) {

    HashSet<Character> map = new HashSet<>();

    int i = 0;
    while(i<s.length()) {
        if(map.contains(s.charAt(i))) return false;
        else {
            map.add(s.charAt(i));
        }
        i++;
    }
    return true;


    }