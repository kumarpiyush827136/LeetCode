class Solution {
    public String convertDateToBinary(String date) {
        int year = Integer.parseInt(date.substring(0,4));
        int mon = Integer.parseInt(date.substring(5,7));
        int dat = Integer.parseInt(date.substring(8,10));
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toBinaryString(year)).append("-");
        sb.append(Integer.toBinaryString(mon)).append("-");
        sb.append(Integer.toBinaryString(dat));
        return sb.toString();
    }
}