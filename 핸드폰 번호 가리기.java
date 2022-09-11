class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        int i = 0;

		int a = phone_number.length();
		int b = 4;

		for (; i < a - 4; i++) {
			answer += "*";
		}
		
		for (i = 0; i < 4; i++) {
			answer += phone_number.charAt(a - b);
			b--;
		}
        
        
        
        return answer;
    }
}