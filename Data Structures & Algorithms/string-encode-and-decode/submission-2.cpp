class Solution {
public:

    string encode(vector<string>& strs) {
        string encode = "";
        for(string str:strs) {
            encode+=to_string(str.size()) + "#" + str;
        }
        return encode;
    }

    vector<string> decode(string s) {
        vector<string> decode;
        int i = 0;
        while(i < s.size()) {
            int j = i;
            while(s[j] != '#') {
                j++;
            }
            int length = stoi(s.substr(i, j-i));
            string str = s.substr(j+1, length);
            decode.push_back(str);
            i = j+1+length;
        }
        return decode;
    }
};
