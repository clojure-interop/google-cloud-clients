(ns com.google.cloud.bigquery.UserDefinedFunction
  "Google BigQuery User Defined Function. BigQuery supports user-defined functions (UDFs) written in
  JavaScript. A UDF is similar to the \"Map\" function in a MapReduce: it takes a single row as input
  and produces zero or more rows as output. The output can potentially have a different schema than
  the input."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery UserDefinedFunction]))

(defn *inline
  "Creates a Google Cloud BigQuery user-defined function given a code blob.

  function-definition - `java.lang.String`

  returns: `com.google.cloud.bigquery.UserDefinedFunction`"
  (^com.google.cloud.bigquery.UserDefinedFunction [^java.lang.String function-definition]
    (UserDefinedFunction/inline function-definition)))

(defn *from-uri
  "Creates a Google Cloud BigQuery user-defined function given a Google Cloud Storage URI (e.g.
   gs://bucket/path).

  function-definition - `java.lang.String`

  returns: `com.google.cloud.bigquery.UserDefinedFunction`"
  (^com.google.cloud.bigquery.UserDefinedFunction [^java.lang.String function-definition]
    (UserDefinedFunction/fromUri function-definition)))

(defn get-type
  "Returns the type of user defined function.

  returns: `com.google.cloud.bigquery.UserDefinedFunction$Type`"
  (^com.google.cloud.bigquery.UserDefinedFunction$Type [^UserDefinedFunction this]
    (-> this (.getType))))

(defn get-content
  "If getType() is UserDefinedFunction.Type.INLINE this method returns a code blob. If getType() is UserDefinedFunction.Type.FROM_URI the method returns a Google Cloud Storage URI (e.g.
   gs://bucket/path).

  returns: `java.lang.String`"
  (^java.lang.String [^UserDefinedFunction this]
    (-> this (.getContent))))

(defn hash-code
  "returns: `int`"
  (^Integer [^UserDefinedFunction this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^UserDefinedFunction this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-pb
  "returns: `com.google.api.services.bigquery.model.UserDefinedFunctionResource`"
  (^com.google.api.services.bigquery.model.UserDefinedFunctionResource [^UserDefinedFunction this]
    (-> this (.toPb))))

