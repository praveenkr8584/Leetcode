class Solution(object):
    def thirdMax(self, nums):
        s=sorted(list(set(nums)),reverse=True)
        if len(s)<3:
            return max(s)
        return s[2]