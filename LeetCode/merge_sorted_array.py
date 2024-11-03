class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        m_i, n_i, mn_i = (m - 1), (n - 1), (m+n-1)

        while m_i >= 0 or n_i >= 0:
            if n_i < 0 or (m_i >= 0 and nums1[m_i] >= nums2[n_i]):
                nums1[mn_i] = nums1[m_i]
                mn_i -= 1
                m_i -= 1
            else:
                nums1[mn_i] = nums2[n_i]
                mn_i -= 1
                n_i -= 1
