Problem: Given a text string T (|T| = n) and a pattern string P (|P| = m). You have to report all the
occurrences pattern P in the text string T.
1. [stringMatchingNaive.java](https://github.com/Md-Atik-Enam/House-of-Codes/blob/master/Basics/String_Search/stringMatchingNaive.java "stringMatchingNaive.java"): Try all the possbilities of P  [O(m*n)]
2. [rabinKarpStringMatch.java](https://github.com/Md-Atik-Enam/House-of-Codes/blob/master/Basics/String_Search/rabinKarpStringMatch.java "rabinKarpStringMatch.java"): Rabin karp string matching algorithm [average case complexity O(m+n)]
3. [KMPstringMatch.java](https://github.com/Md-Atik-Enam/House-of-Codes/blob/master/Basics/String_Search/KMPstringMatch.java "KMPstringMatch.java"): Knuth–Morris–Pratt algorithm for string matching. [Worst case O(n)]

Problem: Given a string T (|T| = n). Find the number of distinct substring of the given string.
1.  [distinctSubStringNaive.java](https://github.com/Md-Atik-Enam/House-of-Codes/blob/master/Basics/String_Search/distinctSubStringNaive.java "distinctSubStringNaive.java"): Distinct substring finding in a string 
2. [distSubStringLCP.java](https://github.com/Md-Atik-Enam/House-of-Codes/blob/master/Basics/String_Search/distSubStringLCP.java "distSubStringLCP.java"): Distinct sub string array finding using suffix array and LCP [O(n logn)] 

Supporting Implementations:
1. [radix_Sort.java](https://github.com/Md-Atik-Enam/House-of-Codes/blob/master/Basics/String_Search/radix_Sort.java "radix_Sort.java"): Radix sort for distinct substring finding using LCP and suffix array
2. [suffix.java](https://github.com/Md-Atik-Enam/House-of-Codes/blob/master/Basics/String_Search/suffix.java "suffix.java"): Suffix array supporting file
