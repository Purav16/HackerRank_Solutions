 static boolean isAnagram(String a, String b) {
        // Complete the function
        String str1 = a.toUpperCase();
        String str2 = b.toUpperCase();
        char[] x = str1.toCharArray();
        char[] y = str2.toCharArray();
        boolean b1 = false;
        Arrays.sort(x);
        Arrays.sort(y);
        String e = new String(x);
        String f = new String(y);
        if (e.equals(f)){
            b1 = true;
        }
        return b1;
    }