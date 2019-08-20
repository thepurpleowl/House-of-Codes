// using namespace std;

int brute_force(char text[], char pattern[], int t_len, int p_len){
	bool found = false;
	int index = -1;
	for(int i=0;i<=t_len-p_len+1;i++){
		int temp = i;
		for(int j=0;j<p_len;j++){
			if(text[temp]==pattern[j]){
				if(j==p_len-1){
					index = temp-p_len+1;
					printf("Brute force : found at %d \n", index);
				}
				temp++;
				continue;
			}else{
				break;
			}
		}
	}
	return 0;
}