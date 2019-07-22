(ns com.google.cloud.storage.BucketInfo$DeleteRule
  "Deprecated.
 Use a LifecycleRule with a DeleteLifecycleAction and a LifecycleCondition which is equivalent to a subclass of DeleteRule instead."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage BucketInfo$DeleteRule]))

(defn get-type
  "Deprecated.

  returns: `com.google.cloud.storage.BucketInfo$DeleteRule$Type`"
  (^com.google.cloud.storage.BucketInfo$DeleteRule$Type [^BucketInfo$DeleteRule this]
    (-> this (.getType))))

(defn hash-code
  "Deprecated.

  returns: `int`"
  (^Integer [^BucketInfo$DeleteRule this]
    (-> this (.hashCode))))

(defn equals
  "Deprecated.

  obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BucketInfo$DeleteRule this ^java.lang.Object obj]
    (-> this (.equals obj))))

