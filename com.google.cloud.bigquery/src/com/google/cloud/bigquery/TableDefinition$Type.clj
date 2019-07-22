(ns com.google.cloud.bigquery.TableDefinition$Type
  "The table type."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery TableDefinition$Type]))

(def *-table
  "Static Constant.

  A normal BigQuery table. Instances of TableDefinition for this type are implemented
   by StandardTableDefinition.

  type: com.google.cloud.bigquery.TableDefinition$Type"
  TableDefinition$Type/TABLE)

(def *-view
  "Static Constant.

  A virtual table defined by a SQL query. Instances of TableDefinition for this type
   are implemented by ViewDefinition.

  type: com.google.cloud.bigquery.TableDefinition$Type"
  TableDefinition$Type/VIEW)

(def *-external
  "Static Constant.

  A BigQuery table backed by external data. Instances of TableDefinition for this type
   are implemented by ExternalTableDefinition.

  type: com.google.cloud.bigquery.TableDefinition$Type"
  TableDefinition$Type/EXTERNAL)

(def *-model
  "Static Constant.

  A BigQuery table representing BigQuery ML Model.

  type: com.google.cloud.bigquery.TableDefinition$Type"
  TableDefinition$Type/MODEL)

(defn *value-of-strict
  "Get the Type for the given String constant, and throw an exception if the constant is not
   recognized.

  constant - `java.lang.String`

  returns: `com.google.cloud.bigquery.TableDefinition$Type`"
  (^com.google.cloud.bigquery.TableDefinition$Type [^java.lang.String constant]
    (TableDefinition$Type/valueOfStrict constant)))

(defn *value-of
  "Get the Type for the given String constant, and allow unrecognized values.

  constant - `java.lang.String`

  returns: `com.google.cloud.bigquery.TableDefinition$Type`"
  (^com.google.cloud.bigquery.TableDefinition$Type [^java.lang.String constant]
    (TableDefinition$Type/valueOf constant)))

(defn *values
  "Return the known values for Type.

  returns: `com.google.cloud.bigquery.TableDefinition$Type[]`"
  ([]
    (TableDefinition$Type/values )))

