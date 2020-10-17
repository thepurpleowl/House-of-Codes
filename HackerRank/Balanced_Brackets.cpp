// Problem Statement - 

// A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].

// Two brackets are considered to be a matched pair if the an opening bracket (i.e., (, [, or {) occurs to the left of a closing bracket (i.e., ), ], or }) of the exact same type. There are three types of matched pairs of brackets: [], {}, and ().

// A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. For example, {[(])} is not balanced because the contents in between { and } are not balanced. The pair of square brackets encloses a single, unbalanced opening bracket, (, and the pair of parentheses encloses a single, unbalanced closing square bracket, ].

// By this logic, we say a sequence of brackets is balanced if the following conditions are met:

// It contains no unmatched brackets.
// The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.
// Given  strings of brackets, determine whether each sequence of brackets is balanced. If a string is balanced, return YES. Otherwise, return NO.

#include <bits/stdc++.h>

using namespace std;

bool matchingPair(char c,char d){
    if(c=='(' && d==')')
    return true;
    else if(c=='{' && d=='}')
    return true;
    else if(c=='[' && d==']')
    return true;
    return false;
}

// Complete the isBalanced function below.
string isBalanced(string s) {

std::stack<char> st;

for(size_t j=0;j<s.size();j++){
    if(s[j]=='('||s[j]=='{'||s[j]=='['){ //opening bracket is pushed in
        st.push(s[j]);
    }
    else{
       
        if(st.empty()==true)
        return "NO";
        char x = st.top();
        st.pop();
        if(matchingPair(x,s[j])==false)//closing bracket is compared with the top element
        return "NO";
    }
}
if(st.empty())//empty = balanced
return "YES";
else
return "NO";
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    int t;
    cin >> t;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    for (int t_itr = 0; t_itr < t; t_itr++) {
        string s;
        getline(cin, s);

        string result = isBalanced(s);

        fout << result << "\n";
    }

    fout.close();

    return 0;
}
