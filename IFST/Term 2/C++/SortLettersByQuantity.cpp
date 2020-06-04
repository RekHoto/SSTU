#include <vector>
#include <stdio.h>

using namespace std;
vector <char> a;
vector <pair<int, char>> p;
vector <int> q;
vector <char> c;

void count() {
    for (int i = 0; i < a.size(); i++) {
        q[(int)a[i]]++;
    }
}

void merge(int l, int m, int r) {
    vector <pair<int, char>> b(r - l + 1);
    int it1 = l, it2 = m + 1, itg = 0;
    while (it1 <= m || it2 <= r) {
        if (it1 > m) {
            b[itg] = p[it2];
            it2++;
        } else {
            if (it2 > r) {
                b[itg] = p[it1];
                it1++;
            } else {
                if (p[it1].first < p[it2].first) {
                    b[itg] = p[it1];
                    it1++;
                } else {
                    b[itg] = p[it2];
                    it2++;
                }
            }
        }
        itg++;
    }
    for (int i = 0, j = l; j <= r; j++, i++) {
        p[j] = b[i];
    }
}

void merge_sort(int l, int r) {
    if (r - l < 1) {
        return;
    }
    int m = (l + r) / 2;
    merge_sort(l, m);
    merge_sort(m + 1, r);
    merge(l, m, r);
}

int main() {
    int n;
    scanf("%d", &n);
    a.resize(n);
    c.resize(256); q.resize(256); p.resize(256);
    for (int i = 0; i < 256; i++) c[i] = (char) i;

    for (int i = 0; i < n; i++) scanf("%d", &a[i]);

    count();

    for (int i = 0; i < 256; i++) p[i] = make_pair(q[i], c[i]);
    merge_sort(0, 255);

    int j = 255;
    while (p[j].first > 0) {
        for (int i = 0; i < p[j].first; i++) printf("%d", p[j]).second; j--; 
    }

    return 0;
}
