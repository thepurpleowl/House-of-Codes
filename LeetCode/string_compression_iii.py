class Solution:
    def compressedString(self, word: str) -> str:
        comp = ""
        prev = word[0]
        i, current_count = 0, 0
        while i < len(word):
            if current_count == 9 or word[i] != prev:
                comp += f"{current_count}{prev}"
                prev = word[i]
                current_count = 0
                continue

            if word[i] == prev:
                current_count += 1
                i += 1

        if current_count:
            comp += f"{current_count}{prev}"

        return comp