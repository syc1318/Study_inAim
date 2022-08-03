#include<iostream>
using namespace std;
int sumtoN(int N) {
	int result = N;
	int i;
	for (i = 1;; i++) {
		result -= i;
		if (result <= 0) {
			break;
		}
	}
	return i-1;
}
int sum(int N) {
	int result = 0;
	int i;
	for (i = 1;i<N+1; i++) {
		result += i;
	}
	return result;
}
int main() {
	int T;
	cin >> T;
	int x, y;
	int dist = 0;
	int* result = new int[T];
	for (int i = 0; i < T; i++) {
		cin >> x >> y;
		int tmp=0;
		int tmp2 = 0;
		dist = y - x;
		if (dist == 3) {
			result[i] = 3;
			continue;
		}
		tmp = sumtoN(dist/2);
		tmp2 = dist - sum(tmp) * 2;
		if (tmp2 > tmp + 1) {
			result[i] = tmp * 2 + 2;
		}
		else {
			result[i] = tmp * 2 + 1;
		}
		
		
	}
	for (int i = 0; i < T; i++) {
		cout << result[i] << endl;
	}
	return 0;
}