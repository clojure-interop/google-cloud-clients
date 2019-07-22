(ns com.google.cloud.bigquery.Acl$Role
  "Dataset roles supported by BigQuery."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery Acl$Role]))

(def *-reader
  "Static Constant.

  Can read, query, copy or export tables in the dataset.

  type: com.google.cloud.bigquery.Acl$Role"
  Acl$Role/READER)

(def *-writer
  "Static Constant.

  Same as READER plus can edit or append data in the dataset.

  type: com.google.cloud.bigquery.Acl$Role"
  Acl$Role/WRITER)

(def *-owner
  "Static Constant.

  Same as WRITER plus can update and delete the dataset.

  type: com.google.cloud.bigquery.Acl$Role"
  Acl$Role/OWNER)

(defn *value-of-strict
  "Get the Role for the given String constant, and throw an exception if the constant is not
   recognized.

  constant - `java.lang.String`

  returns: `com.google.cloud.bigquery.Acl$Role`"
  (^com.google.cloud.bigquery.Acl$Role [^java.lang.String constant]
    (Acl$Role/valueOfStrict constant)))

(defn *value-of
  "Get the Role for the given String constant, and allow unrecognized values.

  constant - `java.lang.String`

  returns: `com.google.cloud.bigquery.Acl$Role`"
  (^com.google.cloud.bigquery.Acl$Role [^java.lang.String constant]
    (Acl$Role/valueOf constant)))

(defn *values
  "Return the known values for Role.

  returns: `com.google.cloud.bigquery.Acl$Role[]`"
  ([]
    (Acl$Role/values )))

