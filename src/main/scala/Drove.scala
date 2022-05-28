object Drove extends App with Context
{
  val dfTags = sparkSession
    .read
    .option("header", "true")
    .option("inferSchema", "true")
    .csv("D:\\data-text.csv")

  dfTags.show()
}

