int maximumLengthSubstring(char* s) {
    int frequency[26] = {0};
    int left = 0;
    int maxLength = 0;

    for (int right = 0; s[right] != '\0'; right++) {
        int index = s[right] - 'a';
        frequency[index]++;

        while (frequency[index] > 2) {
            frequency[s[left] - 'a']--;
            left++;
        }

        int length = right - left + 1;
        if (length > maxLength) {
            maxLength = length;
        }
    }

    return maxLength;
}