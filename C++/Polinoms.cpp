#include <stdio.h>
#include <stdio.h>
#include <vector>

using namespace std;

void whichX(int i){
    if (i != 1) {
        printf("x^%d", i);
    } else {
        printf("x");
    }
}

void printPolinom(vector<int> c) {
    for (int i = c.size() - 1; i >= 0; i--) {

        if (c[i] == 0) continue;

        if (i == c.size() - 1) {
            if (c[i] != -1) {
                printf("%d", c[i]); 
            } else {
                printf("-");
            }
            whichX(i);
            continue;
        }

        if (i == 0) {
            if (c[i] > 0) {
                printf("+");
            }
            printf("%d", c[i]);
            continue;
        }

        if (c[i] > 0) {
            printf("+");
            if (c[i] != 1) {
                printf("%d", c[i]);
            }
        }

        if (c[i] < 0) {
            if (c[i] != -1) {
                printf("%d", c[i]);
            } else {
                printf("-");
            }
        }
        whichX(i);

    }
    printf("\n");
}

vector<int> add(vector<int> c1, vector<int> c2) {
    int n1 = c1.size(), n2 = c2.size();
    vector<int> newc;
    newc.resize((n1 < n2) ? n2 : n1);
    if (n1 < n2) {
        c1.resize(n2);
        n1 = n2;
    } else {
        c2.resize(n1);
    }
    for (int i = n1 - 1; i >= 0; i--) {
        newc[i] = c1[i] + c2[i];
    }
    return newc;
}

vector<int> multiply(vector<int> c1, vector<int> c2) {
    int n1 = c1.size(), n2 = c2.size();
    vector<int> newc;
    newc.resize((n1 - 1) + (n2 - 1) + 1);
    for (int i = n1 - 1; i >= 0; i--) {
        for (int j = n2 - 1; j >= 0; j--) {
            newc[i + j] += c1[i] * c2[j];
        }
    }
    return newc;
}

int main() {
    vector<int> c1 = {-2, -1, 1, 2};
    vector<int> c2 = {3, 1, 4};

    printPolinom(multiply(c1, c2));
    printPolinom(add(c1, c2));

    return 0;
}
