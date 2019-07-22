(ns com.google.cloud.storage.BucketInfo$LifecycleRule
  "Lifecycle rule for a bucket. Allows supported Actions, such as deleting and changing storage
  class, to be executed when certain Conditions are met."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage BucketInfo$LifecycleRule]))

(defn ->lifecycle-rule
  "Constructor.

  action - `com.google.cloud.storage.BucketInfo$LifecycleRule$LifecycleAction`
  condition - `com.google.cloud.storage.BucketInfo$LifecycleRule$LifecycleCondition`"
  (^BucketInfo$LifecycleRule [^com.google.cloud.storage.BucketInfo$LifecycleRule$LifecycleAction action ^com.google.cloud.storage.BucketInfo$LifecycleRule$LifecycleCondition condition]
    (new BucketInfo$LifecycleRule action condition)))

(defn get-action
  "returns: `com.google.cloud.storage.BucketInfo$LifecycleRule$LifecycleAction`"
  (^com.google.cloud.storage.BucketInfo$LifecycleRule$LifecycleAction [^BucketInfo$LifecycleRule this]
    (-> this (.getAction))))

(defn get-condition
  "returns: `com.google.cloud.storage.BucketInfo$LifecycleRule$LifecycleCondition`"
  (^com.google.cloud.storage.BucketInfo$LifecycleRule$LifecycleCondition [^BucketInfo$LifecycleRule this]
    (-> this (.getCondition))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BucketInfo$LifecycleRule this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BucketInfo$LifecycleRule this ^java.lang.Object obj]
    (-> this (.equals obj))))

