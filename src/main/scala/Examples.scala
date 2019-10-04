object Examples {

  /**
   * Fold the entries of a list with the help of the neutral element.
   *
   * @param entries The list of entries.
   * @return The result of adding the single integers together by +.
   */
  def sumFold(entries: List[Int]) : Int = {
    // 0 is the neutral element -> starting element
    // same as below: entries.fold(0)((e1, e2) => e1 + e2)
    entries.fold(0)(_ + _)
  }

}
