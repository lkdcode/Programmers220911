class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int arrylength = arr.length;

		if (arrylength == 1) {
			answer = new int[1];
			answer[0] = -1;
            return answer;
		}

		answer = new int[arrylength - 1];

		int min = arr[0];

		for (int i = 0; i < arrylength; i++) {
			min = Math.min(min, arr[i]);
		}

		for (int i = 0, j = 0; i < arrylength; i++) {
			if (min == arr[i]) {
				continue;
			}
			answer[j++] = arr[i];
		}
        
        
        
        return answer;
    }
}