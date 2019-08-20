#include<cmath>
// using namespace std;

int search(char array[], int arr_len, char element);

int rabin_karp_search(char text[], char pattern[], int t_len, int p_len, int prime){
	bool found = false;
	int index = -1;
	int hash_value = 0, test_hash_value = 0;
	char arr[] = {'A','B'};
	int arr_len = 2;
	int arr_val[] = {0,1};

	for(int j=0;j<p_len;j++){
		int n_ary = static_cast<int>(pow(prime, j));
		hash_value += arr_val[search(arr, arr_len, pattern[j])]*n_ary;
		test_hash_value += arr_val[search(arr, arr_len, text[j])]*n_ary;
	}
	if(hash_value==test_hash_value){
		printf("Rabin Carp : found at %d \n", 0);
	}
	int big_n_ary = static_cast<int>(pow(prime,p_len-1));
	for(int i=p_len;i<t_len;i++){
		test_hash_value -= arr_val[search(arr, arr_len, text[i-p_len])];
		test_hash_value /= prime;
		test_hash_value += arr_val[search(arr, arr_len, text[i])]*big_n_ary;
		if(hash_value==test_hash_value){
			printf("Rabin Carp : found at %d \n", i-p_len+1);
		}
	}
	return 0;
}

int search(char array[], int arr_len, char element){
	int index = -1;
	for(int j=0;j<arr_len;j++){
		if(array[j]==element){
			index = j;
			break;
		}
	}
	return index;
}