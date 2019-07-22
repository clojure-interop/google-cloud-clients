(ns com.google.cloud.bigquery.TimelineSample
  "A specific timeline sample. This instruments work progress at a given point in time, providing
  information about work units active/pending/completed as well as cumulative slot-milliseconds."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery TimelineSample]))

(defn ->timeline-sample
  "Constructor."
  (^TimelineSample []
    (new TimelineSample )))

(defn get-elapsed-ms
  "Returns the sample time as milliseconds elapsed since the start of query execution.

  returns: `java.lang.Long`"
  (^java.lang.Long [^TimelineSample this]
    (-> this (.getElapsedMs))))

(defn get-active-units
  "Returns the total number of work units currently being processed.

  returns: `java.lang.Long`"
  (^java.lang.Long [^TimelineSample this]
    (-> this (.getActiveUnits))))

(defn get-completed-units
  "Returns the total number of work units completed by this query.

  returns: `java.lang.Long`"
  (^java.lang.Long [^TimelineSample this]
    (-> this (.getCompletedUnits))))

(defn get-pending-units
  "Returns the number of work units remaining for the currently active stages.

  returns: `java.lang.Long`"
  (^java.lang.Long [^TimelineSample this]
    (-> this (.getPendingUnits))))

(defn get-slot-millis
  "Returns the cumulative slot-milliseconds consumed by the query.

  returns: `java.lang.Long`"
  (^java.lang.Long [^TimelineSample this]
    (-> this (.getSlotMillis))))

(defn to-builder
  "return a builder for the TimelineSample object.

  returns: `com.google.cloud.bigquery.TimelineSample$Builder`"
  (^com.google.cloud.bigquery.TimelineSample$Builder [^TimelineSample this]
    (-> this (.toBuilder))))

