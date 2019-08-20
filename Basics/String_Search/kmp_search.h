using namespace std;

void calculate_lps(char pattern[],int just_len, int lps[]);

void kmp_search(char text[], char pattern[], int t_len, int p_len){
	int lps[p_len], index = -1;
	calculate_lps(pattern, p_len, lps);
	// for(int j=0;j<p_len;j++){
	// 	cout<<pattern[j]<< " "<<lps[j]<<endl;
	// }
	int i=0,j=0;
	while(i<t_len){
		if(text[i]==pattern[j]){
			i++;
			j++;
			if(j==p_len){
				index = i-p_len;
				printf("KMP : found at %d \n", index);
				j = lps[j-1];
			}
		}else{
			if(j!=0){
				j = lps[j-1];
			}else{
				i++;
			}			
		}
	}
	// for(int j=0, i=0;i<=t_len-p_len+1;i++){
	// 	int temp = i;
	// 	for(;j<p_len;j++){
	// 		if(text[temp]==pattern[j]){
	// 			if(j==p_len-1){
	// 				index = i-p_len+1;
	// 				printf("KMP : found at %d \n", index);
	// 			}
	// 			temp++;
	// 			continue;
	// 		}else{
	// 			int increment = lps[j-1];
	// 			i += lps[j-1];
	// 			j = increment;
	// 		}
	// 	}
	// }
}

void calculate_lps(char pattern[],int just_len, int lps[]){
	lps[0] = 0;
	int i = 1, len = 0;
	while(i<just_len){
		if(pattern[i]==pattern[len]){
			len++;
			lps[i] = len;
			i++;
		}
		else{
			if(len!=0){
				len = lps[len-1];
			}
			else{
				lps[i]=0;
				i++;
			}
		}
	}
}
