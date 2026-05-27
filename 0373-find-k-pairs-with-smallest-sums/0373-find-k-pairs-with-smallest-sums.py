class Solution(object):
    def kSmallestPairs(self, nums1, nums2, k):
        def helper(nums1,nums2,k):
            heap=[]
            for i in range(len(nums2)):
                sum=nums1[0] + nums2[i]
                heapq.heappush(heap,(sum,0,i))

            res=[]
            while k>0:
                sum,i,j=heapq.heappop(heap)
                res.append([nums1[i],nums2[j]])
                if i+1<len(nums1):
                    heapq.heappush(heap,(nums1[i+1]+nums2[j],i+1,j))
                k-=1

            return res
        return helper(nums1,nums2,k)
        