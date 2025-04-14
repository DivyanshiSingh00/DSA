#include <iostream>
#include <map>
using namespace std;
int main() {
    // Write C++ code here
    int n;
    cout<<"enter size"<<endl;
    cin>>n;
    cout<<"enter the elements"<<endl;
    int arr[n];
    map<int, int> mpp;
    for(int i=0;i<n;i++){
        cin>>arr[i];
        mpp[arr[i]]++;
    }
    
    int min=n+1,max=0;
    int nomin = -1, nomax = -1;
    for(auto it:mpp){
        if(it.second<min){
            nomin=it.first;
            min=it.second;
        }
        if(it.second>max){
            nomax=it.first;
            max=it.second;
        }
    }
    cout<<"max is: "<<nomax<<endl;
    cout<<"min is: "<<nomin<<endl;
}
