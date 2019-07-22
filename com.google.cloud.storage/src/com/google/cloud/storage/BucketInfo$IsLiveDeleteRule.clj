(ns com.google.cloud.storage.BucketInfo$IsLiveDeleteRule
  "Deprecated.
 Use a LifecycleRule with a DeleteLifecycleAction and a condition
      LifecycleCondition.Builder.setIsLive instead."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage BucketInfo$IsLiveDeleteRule]))

(defn ->is-live-delete-rule
  "Constructor.

  Deprecated.

  is-live - if set to true live blobs meet the delete condition. If set to false delete condition is met by archived blobs. - `boolean`"
  (^BucketInfo$IsLiveDeleteRule [^Boolean is-live]
    (new BucketInfo$IsLiveDeleteRule is-live)))

(defn live?
  "Deprecated.

  returns: `boolean`"
  (^Boolean [^BucketInfo$IsLiveDeleteRule this]
    (-> this (.isLive))))

