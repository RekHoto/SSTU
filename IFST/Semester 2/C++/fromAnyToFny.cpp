#include <vector>
#include <iostream>

using namespace std;

int pow (int n, int p) {
    int pow = 1;
    for (int i = 0; i < p; i++) {
        pow *= n;
    }
    return pow;
}

int toNum(char c) {
    if (c > '9') {
        return c - '7';
    } else {
        return c - '0';
    }
}

char toChar(int d) {
    if (d > 9) {
        return d + '7';
    } else {
        return d + '0';
    }
}

int toDec(vector<char> n, int from) {
    int decN;
    int p = n.size() - 1;
    char c;
    for (int i = 0; i < n.size(); i++) {
        decN += toNum(n[i]) * pow(from, p--);
    }
    return decN;
}

vector<char> fromAnyToAny(vector<char> n, int from, int to) {
    int decN = toDec(n, from);
    vector<char> newN;
    while (decN != 0) {
        newN.push_back(toChar(decN % to));
        decN /= to;
    }
    return newN;
}

int main() {

    vector<char> n;
    char in;
    while ((cin >> in) && (in != '*')) {
        n.push_back(in);
    }
    for (int i = 0; i < n.size(); i++) {
        cout << n[i];
    }

    int from, to;
    cin >> from >> to;
    n = fromAnyToAny(n, from, to);
    cout << " from " << from << " to " << to << " == ";
    for (int i = n.size() - 1; i >= 0; i--) {
        cout << n[i];
    }

    return 0;
}

