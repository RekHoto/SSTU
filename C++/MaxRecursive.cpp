#include <iostream>
#include <vector>

using namespace std;

int maxRecursive(vector<int> a, int max, int n) {
    if (a[n] > max) {
        max = a[n];
    }
    if (n == a.size() - 1) {
        return max;
    }
    return maxRecursive(a, max, n + 1);

}

int main() {
    vector<int> a = {1, 1, 2, 150, 10};
    int max = a[0];
    max = maxRecursive(a, max, 0);
    cout << max;

    return 0;
}