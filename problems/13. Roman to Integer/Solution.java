class Solution {
    public int romanToInt(String s) {
        if (s == null) {
            return 0;
        }

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            switch (c) {
            case 'M':
                result += 1000;
                break;
            case 'D':
                result += 500;
                break;
            case 'C':
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'D') {
                        result += 400;
                        i++;
                    } else if (s.charAt(i + 1) == 'M') {
                        result += 900;
                        i++;
                    } else {
                        result += 100;
                    }
                } else {
                    result += 100;
                }
                break;
            case 'L':
                result += 50;
                break;
            case 'X':
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'L') {
                        result += 40;
                        i++;
                    } else if (s.charAt(i + 1) == 'C') {
                        result += 90;
                        i++;
                    } else {
                        result += 10;
                    }
                } else {
                    result += 10;
                }
                break;
            case 'V':
                result += 5;
                break;
            case 'I':
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'V') {
                        result += 4;
                        i++;
                    } else if (s.charAt(i + 1) == 'X') {
                        result += 9;
                        i++;
                    } else {
                        result += 1;
                    }
                } else {
                    result += 1;
                }
                break;
            }
        }

        return result;
    }
}