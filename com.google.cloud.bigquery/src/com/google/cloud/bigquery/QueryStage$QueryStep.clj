(ns com.google.cloud.bigquery.QueryStage$QueryStep
  "Each query stage is made of a number of steps. This class contains information on a query step."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery QueryStage$QueryStep]))

(defn get-name
  "Returns a machine-readable name for the operation.

  returns: `java.lang.String`"
  (^java.lang.String [^QueryStage$QueryStep this]
    (-> this (.getName))))

(defn get-substeps
  "Returns a list of human-readable stage descriptions.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^QueryStage$QueryStep this]
    (-> this (.getSubsteps))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^QueryStage$QueryStep this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^QueryStage$QueryStep this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^QueryStage$QueryStep this ^java.lang.Object obj]
    (-> this (.equals obj))))

