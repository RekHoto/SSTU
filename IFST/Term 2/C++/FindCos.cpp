#include <iostream>

using namespace std;

double findCos(double eps, double x, double n, double el, double cos) {
    el *= -(x * x)/((n + 1) * (n + 2));
    cos += el;

    if (abs(el) <= eps) {
        return cos;
    }
    return findCos(eps, x, n + 2, el, cos);
}

int main() {
    double cos = findCos(0.0000000001, 3.14, 0.0, 1.0, 1.0);
    cout << cos;

    return 0;
}