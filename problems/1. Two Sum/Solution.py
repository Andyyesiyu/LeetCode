class Solution:
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        if len(nums) <= 1:
            return False
        buff_dict = {}
        for i in range(len(nums)):
            com = target - nums[i]
            if com in buff_dict:
                return [i, buff_dict[com]]
            else:
                buff_dict[nums[i]] = i
