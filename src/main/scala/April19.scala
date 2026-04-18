import org.apache.spark.SparkConf
import org.apache.spark.sql.expressions.Window
import org.apache.spark.sql.functions.{abs, add_months, avg, base64, broadcast, ceil, coalesce, col, count, current_date, current_timestamp, date_add, date_format, date_sub, datediff, dayofmonth, dayofweek, dense_rank, desc, floor, format_string, instr, lag, lead, lit, lpad, ltrim, max, month, months_between, pow, rand, randn, rank, regexp_extract, round, row_number, rpad, rtrim, sqrt, substring, substring_index, sum, to_date, to_timestamp, translate, trim, trunc, unbase64, upper, weekofyear, when, year}
import org.apache.spark.sql.{DataFrame, SaveMode, SparkSession, functions}
import org.apache.spark.sql.types.{IntegerType, StringType, StructField, StructType}

object April19 {

  def main(args: Array[String]): Unit = {



    //    1stway

    val spark = SparkSession.builder()
      .appName("spark-program")
      .master("local[1]")
      .getOrCreate()


    //    val ddlschema="id Int,name String,salary Int,city String"


    val df=spark.read
      .format("csv")
      .option("header",true)
      .option("path","C:/Users/mitam c/Downloads/info.csv")
      .load()

df.show()


  }}