class Solution(object):
    def kClosest(self, points, k):
       def helper(points,k):
        heap=[]
        for (x,y) in points:
            ios=x*x + y*y
            heapq.heappush(heap,(ios,[x,y]))
        res=[]
        for _ in range(k):
            res.append(heapq.heappop(heap)[1])
        return res
       return helper(points,k)

        