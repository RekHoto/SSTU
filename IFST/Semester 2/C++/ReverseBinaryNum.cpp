#include <iostream>
#include <vector>
std::vector<int> toBinary(int n) {
    std::vector<int> num;
    std::cout << n << " = ";
    int copyN = n;
    int logn = 0;
    while (copyN != 0) {
        copyN /= 2;
        logn++;
    }
    num.resize(logn);

    for (int i = 0; i < logn; i++) {
        num[i] = n % 2;
        n /= 2;
    }

    for (int i = num.size() - 1; i >=0; i--) {
        std::cout << num[i];
    }
    std::cout << std::endl;

    return num;
}

int toDecReverse(std::vector<int> num) {
    int p = 1;
    int n = 0;

    for (int i = num.size() - 1; i >= 0; i--){
        n += num[i] * p;
        p *= 2;
    }

    return n;
}

int reverseNumber(int n) {
    return toDecReverse(toBinary(n));
}

int main() {
    for (int i = 512; i < 1025; i++) {
        std::cout << reverseNumber(i) << std::endl;
    }
};