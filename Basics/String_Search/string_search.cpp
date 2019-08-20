#include<iostream>
#include<stdio.h>
#include "brute_search.h"
#include "rabin_karp_search.h"
#include "kmp_search.h"
#include "z_search.h"
using namespace std;

int main(){
	char text[] = "AAABAAAAB";
	char pattern[] = "AAB";
	int t_len = sizeof(text)/sizeof(text[0])-1;
	int p_len = sizeof(pattern)/sizeof(pattern[0])-1;
	brute_force(text, pattern, t_len, p_len);
	int prime = 3;
	rabin_karp_search(text, pattern, t_len, p_len,prime);
	kmp_search(text, pattern, t_len, p_len);
	char aug_text[] = "AAB$AAABAAAAB";
	z_search(aug_text, text, pattern, t_len, p_len);
	return 0;
}
