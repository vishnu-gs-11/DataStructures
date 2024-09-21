#include <bits/stdc++.h>
using namespace std;

int main () {
    
    int n; 
    cout << "Enter the size of the array : " << endl;
    cin >> n ;
    cout << "Enter the elements of the array : " << endl;
    int arr [n];
    
    for (int i = 0 ; i < n ; i ++ ) {
        cin >> arr [i];
    }
    
    for (int i = 0 ; i < n -1; i ++ ) {
        int min_index = i;
        for (int j = i +1; j < n ; j ++ ) {
            if (arr[j] < arr[min_index]) {
                min_index = j;
            }
        }
        
        int temp = arr[i];
        arr[i] = arr[min_index];
        arr[min_index] = temp;
        
    }
    
    cout << "The array after sorting : " << endl;
    for (int i = 0 ; i < n ; i ++ ) {
        cout << arr [i] << " ";
    }
    
    return 0;
}

/*
    sample input :
    5
    2 5 4 3 1 
    
    sample output :
    1 2 3 4 5
*/
