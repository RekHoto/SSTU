#include <stdio.h>

int DC = 3;

int strToNum(FILE *f1, int p) {
    int bufLength = DC + 1;
    char buf[bufLength];
    fseek(f1, p, SEEK_SET);
    fread(buf, sizeof(char), bufLength, f1);
    int num = 0;
    int temp;
    for (int i = 0; i < DC; i++) {
        temp = buf[i] - '0';
        num = num * 10 + temp;
    }
    return num;
}

void findN(FILE *f1, int n) {
    int l, r, m, ln, rn, mn;

    fseek(f1, -DC, SEEK_END);
    l = 0; r = ftell(f1);
    ln = strToNum(f1, l);
    rn = strToNum(f1, r);

    if ((ln > n) || (rn < n)) {
        printf("N not found");
        return;
    }
    while (1) {
        if ((r - l) == (DC + 1)) {
            if ((ln == n) || (rn == n)) {
                printf("N found");
                return;
            }
            printf("N not found");
            return;
        }
        m = (l + r) / 2;
        m = m / (DC + 1); // dlya nechetnyh, +1 dlya probelov mezhdu chislami
        m = m * (DC + 1);
        mn = strToNum(f1, m);
        if (mn == n) {
            printf("N found");
            return;
        }
        if (mn < n) {
            l = m; ln = mn;
        } else {
            r = m; rn = mn;
        }
    }
}


int main() {
    FILE *f1;
    int n;
    f1 = fopen("f1.txt", "r");
    if (f1 == NULL) return 1;
    scanf("%d", &n);

    findN(f1, n);

    return 0;
}