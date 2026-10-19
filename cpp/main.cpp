// C++ 示例：读取 n 个整数，求最大值与和
// 编译：g++ main.cpp -o main
#include <iostream>
#include <vector>
#include <numeric>

int main() {
    int n;
    std::cout << "输入整数个数 n: ";
    if (!(std::cin >> n)) {
        std::cerr << "输入无效" << std::endl;
        return 1;
    }

    std::vector<long long> nums(n);
    std::cout << "输入 " << n << " 个整数: ";
    for (int i = 0; i < n; ++i) {
        std::cin >> nums[i];
    }

    long long sum = std::accumulate(nums.begin(), nums.end(), 0LL);
    long long max_val = *std::max_element(nums.begin(), nums.end());

    std::cout << "最大值: " << max_val << std::endl;
    std::cout << "总和: " << sum << std::endl;
    return 0;
}
