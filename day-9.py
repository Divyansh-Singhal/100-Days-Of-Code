class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        while nums.__contains__(val):
            nums.remove(val)
        return len(nums)