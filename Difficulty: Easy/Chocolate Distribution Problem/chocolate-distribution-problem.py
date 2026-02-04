
class Solution:

    def findMinDiff(self, arr,M):
        if M==0 or len(arr)<M:
            return -1
            
        arr.sort()
        min_difference=float('inf')
        
        for i in range(len(arr)-M+1):
            min_difference=min(min_difference,arr[i+M-1]-arr[i])
        return min_difference