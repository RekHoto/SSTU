#include <vector>
#include <iostream>

using namespace std;

vector<vector<int>> oneList(vector<vector<int>> a, int i, int j, int col, int row) {
    a[i][j] = 2;
    if (((i - 1) >= 0) && (a[i - 1][j] == 0))
        a = oneList(a, i - 1, j, col, row);
    if (((i + 1) < col) && (a[i + 1][j] == 0))
        a = oneList(a, i + 1, j, col, row);
    if (((j - 1) >= 0) && (a[i][j - 1] == 0))
        a = oneList(a, i, j - 1, col, row);
    if (((j + 1) < row) && (a[i][j + 1] == 0))
        a = oneList(a, i, j + 1, col, row);
    return a;
}

int numOfLists(vector<vector<int>> a) {
    int cnt = 0;
    int col = a.size();
    int row = a[0].size();
    for (int i = 0; i < col; i++) {
        for (int j = 0; j < row; j++) {
            if (a[i][j] == 0) {
                cnt++;
                a = oneList(a, i, j, col, row);
            }
        }
    }
    return cnt;
}

int main() {
    vector<vector<int>> a = { { 1, 0, 1},
                              { 0, 1, 0},
                              { 0, 0, 1},
                              { 0, 1, 0},
                              { 1, 0, 0},
                              { 1, 0, 1},
                              { 1, 0, 0},
                              { 1, 1, 1},
                              { 1, 0, 1},};
    cout << numOfLists(a);
    return 0;
}

