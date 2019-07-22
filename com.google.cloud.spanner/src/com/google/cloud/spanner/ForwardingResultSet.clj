(ns com.google.cloud.spanner.ForwardingResultSet
  "Forwarding implementation of ResultSet that forwards all calls to a delegate."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner ForwardingResultSet]))

(defn ->forwarding-result-set
  "Constructor.

  delegate - `com.google.cloud.spanner.ResultSet`"
  (^ForwardingResultSet [^com.google.cloud.spanner.ResultSet delegate]
    (new ForwardingResultSet delegate)))

(defn next
  "Description copied from interface: ResultSet

  returns: `boolean`

  throws: com.google.cloud.spanner.SpannerException"
  (^Boolean [^ForwardingResultSet this]
    (-> this (.next))))

(defn get-current-row-as-struct
  "Description copied from interface: ResultSet

  returns: `com.google.cloud.spanner.Struct`"
  (^com.google.cloud.spanner.Struct [^ForwardingResultSet this]
    (-> this (.getCurrentRowAsStruct))))

(defn close
  "Description copied from interface: ResultSet"
  ([^ForwardingResultSet this]
    (-> this (.close))))

(defn get-stats
  "Description copied from interface: ResultSet

  returns: `com.google.spanner.v1.ResultSetStats`"
  (^com.google.spanner.v1.ResultSetStats [^ForwardingResultSet this]
    (-> this (.getStats))))

