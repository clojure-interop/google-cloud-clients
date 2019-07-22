(ns com.google.cloud.storage.BucketInfo$AgeDeleteRule
  "Deprecated.
 Use a LifecycleRule with a DeleteLifecycleAction and use LifecycleCondition.Builder.setAge instead.
      For example, new DeleteLifecycleAction(1) is equivalent to new
      LifecycleRule( LifecycleAction.newDeleteAction(),
      LifecycleCondition.newBuilder().setAge(1).build()))"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage BucketInfo$AgeDeleteRule]))

(defn ->age-delete-rule
  "Constructor.

  Deprecated.

  days-to-live - blobs' Time To Live expressed in days. The time when the age condition is considered to be satisfied is computed by adding daysToLive days to the midnight following blob's creation time in UTC. - `int`"
  (^BucketInfo$AgeDeleteRule [^Integer days-to-live]
    (new BucketInfo$AgeDeleteRule days-to-live)))

(defn get-days-to-live
  "Deprecated.

  returns: `int`"
  (^Integer [^BucketInfo$AgeDeleteRule this]
    (-> this (.getDaysToLive))))

