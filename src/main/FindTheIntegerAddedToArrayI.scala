class FindTheIntegerAddedToArrayI {
  def addedInteger(nums1: Array[Int], nums2: Array[Int]): Int = {
    val myNums1 = nums1.sorted
    val myNums2 = nums2.sorted
    val list = for{
      i <- 0 to myNums1.size-1
    } yield myNums2(i)-myNums1(i)
    if(list.forall(_==list(0)))
      return (list(0))
    return -1
  }
}
