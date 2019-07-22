(ns com.google.cloud.bigquery.GoogleSheetsOptions$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery GoogleSheetsOptions$Builder]))

(defn set-skip-leading-rows
  "Sets the number of rows at the top of a sheet that BigQuery will skip when reading the data.
   The default value is 0. This property is useful if you have header rows that should be
   skipped.

  skip-leading-rows - `long`

  returns: `com.google.cloud.bigquery.GoogleSheetsOptions$Builder`"
  (^com.google.cloud.bigquery.GoogleSheetsOptions$Builder [^GoogleSheetsOptions$Builder this ^Long skip-leading-rows]
    (-> this (.setSkipLeadingRows skip-leading-rows))))

(defn build
  "Creates a GoogleSheetsOptions object.

  returns: `com.google.cloud.bigquery.GoogleSheetsOptions`"
  (^com.google.cloud.bigquery.GoogleSheetsOptions [^GoogleSheetsOptions$Builder this]
    (-> this (.build))))

