(ns com.google.cloud.storage.BucketInfo$CreatedBeforeDeleteRule
  "Deprecated.
 Use a LifecycleRule with an action DeleteLifecycleAction and a
      condition LifecycleCondition.Builder.setCreatedBefore instead."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage BucketInfo$CreatedBeforeDeleteRule]))

(defn ->created-before-delete-rule
  "Constructor.

  Deprecated.

  time-millis - a date in UTC. Blobs that have been created before midnight of the provided date meet the delete condition - `long`"
  (^BucketInfo$CreatedBeforeDeleteRule [^Long time-millis]
    (new BucketInfo$CreatedBeforeDeleteRule time-millis)))

(defn get-time-millis
  "Deprecated.

  returns: `long`"
  (^Long [^BucketInfo$CreatedBeforeDeleteRule this]
    (-> this (.getTimeMillis))))

