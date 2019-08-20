void calculate_z(char aug_text[],int just_len, int z[]);

void z_search(char aug_text[], char text[], char pattern[], int t_len, int p_len){
	int z[p_len+t_len+1];
	calculate_z(aug_text, p_len+t_len+1, z);
	for(int j=0;j<p_len+t_len+1;j++){
		// printf("%d \t", z[j]);
		if(z[j]==p_len){
			printf("Z search : found at %d \n", j-p_len-1);
		}
	}
}

void calculate_z(char aug_text[],int just_len, int z[]){
	z[0] = -1;
	int i = 1, l = 0, r = 0;
	while(i<just_len){
		if(i>r){
			r = i, l = i;
			while(r<just_len && aug_text[r-l]==aug_text[r]){
				r++;
			}
			z[i] = r-l;
			r--;
		}
		else{
			if(z[i-l]>=r-i+1){
				l = i;
				while(r<just_len && aug_text[r]==aug_text[r-l]){
					r++;
				}
				z[i] = r-l;
				r--;
			}
			else{
				z[i] = z[i-l];
			}
		}
		i++;
	}
}
