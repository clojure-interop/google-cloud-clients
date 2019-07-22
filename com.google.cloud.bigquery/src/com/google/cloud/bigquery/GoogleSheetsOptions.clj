(ns com.google.cloud.bigquery.GoogleSheetsOptions
  "Google BigQuery options for the Google Sheets format."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery GoogleSheetsOptions]))

(defn *new-builder
  "Returns a builder for a GoogleSheetsOptions object.

  returns: `com.google.cloud.bigquery.GoogleSheetsOptions$Builder`"
  (^com.google.cloud.bigquery.GoogleSheetsOptions$Builder []
    (GoogleSheetsOptions/newBuilder )))

(defn get-skip-leading-rows
  "Returns the number of rows at the top of a sheet that BigQuery will skip when reading the data.

  returns: `java.lang.Long`"
  (^java.lang.Long [^GoogleSheetsOptions this]
    (-> this (.getSkipLeadingRows))))

(defn to-builder
  "Returns a builder for the GoogleSheetsOptions object.

  returns: `com.google.cloud.bigquery.GoogleSheetsOptions$Builder`"
  (^com.google.cloud.bigquery.GoogleSheetsOptions$Builder [^GoogleSheetsOptions this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^GoogleSheetsOptions this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^GoogleSheetsOptions this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^GoogleSheetsOptions this ^java.lang.Object obj]
    (-> this (.equals obj))))

