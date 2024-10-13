class Solution {
public:
    vector<int> findXSum(vector<int>& nums, int k, int x) {
         
    int n = nums.size();
    vector<int> ans;
    for (int i = 0; i <= n - k; ++i) {
        unordered_map<int, int> fmap;
        for (int j = i; j < i + k; ++j) {
            fmap[nums[j]]++;
        }

        vector<pair<int, int>> fvec;
        for (auto& p : fmap) {
            fvec.push_back({p.second, p.first});
        }

        sort(fvec.begin(), fvec.end(), [](pair<int, int>& a, pair<int, int>& b) {
            if (a.first == b.first)
                return a.second > b.second;
            return a.first > b.first;
        });

       int s = 0;
        int took = 0;
        for (auto& p : fvec) {
            if (took >= x) break;
            s += p.first * p.second;
            took++;
        }
        ans.push_back(s);
    }
    return ans;
}

};