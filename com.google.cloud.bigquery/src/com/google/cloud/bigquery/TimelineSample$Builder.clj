(ns com.google.cloud.bigquery.TimelineSample$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery TimelineSample$Builder]))

(defn ->builder
  "Constructor."
  (^TimelineSample$Builder []
    (new TimelineSample$Builder )))

(defn set-elapsed-ms
  "elapsed-ms - `java.lang.Long`

  returns: `com.google.cloud.bigquery.TimelineSample$Builder`"
  (^com.google.cloud.bigquery.TimelineSample$Builder [^TimelineSample$Builder this ^java.lang.Long elapsed-ms]
    (-> this (.setElapsedMs elapsed-ms))))

(defn set-active-units
  "active-units - `java.lang.Long`

  returns: `com.google.cloud.bigquery.TimelineSample$Builder`"
  (^com.google.cloud.bigquery.TimelineSample$Builder [^TimelineSample$Builder this ^java.lang.Long active-units]
    (-> this (.setActiveUnits active-units))))

(defn set-completed-units
  "completed-units - `java.lang.Long`

  returns: `com.google.cloud.bigquery.TimelineSample$Builder`"
  (^com.google.cloud.bigquery.TimelineSample$Builder [^TimelineSample$Builder this ^java.lang.Long completed-units]
    (-> this (.setCompletedUnits completed-units))))

(defn set-pending-units
  "pending-units - `java.lang.Long`

  returns: `com.google.cloud.bigquery.TimelineSample$Builder`"
  (^com.google.cloud.bigquery.TimelineSample$Builder [^TimelineSample$Builder this ^java.lang.Long pending-units]
    (-> this (.setPendingUnits pending-units))))

(defn set-slot-millis
  "slot-millis - `java.lang.Long`

  returns: `com.google.cloud.bigquery.TimelineSample$Builder`"
  (^com.google.cloud.bigquery.TimelineSample$Builder [^TimelineSample$Builder this ^java.lang.Long slot-millis]
    (-> this (.setSlotMillis slot-millis))))

(defn build
  "returns: `com.google.cloud.bigquery.TimelineSample`"
  (^com.google.cloud.bigquery.TimelineSample [^TimelineSample$Builder this]
    (-> this (.build))))

