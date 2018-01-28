/**
  * Пример "пузырьковая сортировка".
  */
class BubbleSort {

  /**
    * Сортировка.
    */
  def _BubbleSort(arr: Array[Int]): Array[Int] = {

    val size = arr.length - 1

    for (a <- 1 to size) {
      for(b <- size to a by - 1) {
        if (arr(b) > arr(b + 1)) {
          val tmp = arr(b + 1)
          arr(b + 1) = arr(b)
          arr(b) = tmp
        }
      }
    }
    arr
  }
}
