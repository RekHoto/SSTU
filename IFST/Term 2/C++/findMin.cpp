#include <vector>
#include <iostream>

int findMin(std::vector<int> a, int n) {
    int min = a[0];
    for (int i = 0; i < n; i++) {
        if (a[i] < min) {
            min = a[i];
        }
    }
    return min;
}

int main() {
    int n;
    std::cin >> n;
    std::vector<int> nums;
    nums.resize(n);
    for (int i = 0; i < n; i++) {
        std::cin >> nums[i];
    }
    std::cout << findMin(nums, nums.size());

    return 0;
}

