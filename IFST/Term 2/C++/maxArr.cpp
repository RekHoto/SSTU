#include <iostream>
#include <vector>

using namespace std;

int findMax(vector<int> a, int m, int s) {
    int max = a[s];

    for (int i = s; i < s + m; i++) {
        if (a[i] > max) {
            max = a[i];
        }
    }

    return max;
}

vector<int> maxArray(vector<int> a, int m) {
    if (m == 1) return a;
    vector<int> maxArr;
    int max, cnt = 1, j = 0;
    maxArr.resize(a.size() - m + 1);
    max = findMax(a, m, 0);
    maxArr[j++] = max;

    for (int i = m; i < a.size(); i++) {
        if (cnt == m) {
            max = findMax(a, m, i - m + 1);
            maxArr[j++] = max;
            i += m - 1;
            cnt = 1;
        }
        if (a[i] > max) {
            max = a[i];
            maxArr[j++] = max;
            cnt = 1;
        } else {
            maxArr[j++] = max;
            cnt++;
        }
    }

    return maxArr;
}

int main() {
	vector<int> a;
    int n;
    cin >> n;
    a.resize(n);
    for (int i = 0; i < n; i++) {cin >> a[i];}
    vector<int> maxArr = maxArray(a, 2);
    for (int i = 0; i < maxArr.size(); i++) {
        cout << maxArr[i] << ' ';
    }

    return 0;
}
