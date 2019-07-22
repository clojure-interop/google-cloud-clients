(ns com.google.cloud.storage.BucketInfo$NumNewerVersionsDeleteRule
  "Deprecated.
 Use a LifecycleRule with a DeleteLifecycleAction and a condition
      LifecycleCondition.Builder.setNumberOfNewerVersions instead."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage BucketInfo$NumNewerVersionsDeleteRule]))

(defn ->num-newer-versions-delete-rule
  "Constructor.

  Deprecated.

  num-newer-versions - the number of newer versions. A blob's version meets the delete condition when numNewerVersions newer versions are available. - `int`"
  (^BucketInfo$NumNewerVersionsDeleteRule [^Integer num-newer-versions]
    (new BucketInfo$NumNewerVersionsDeleteRule num-newer-versions)))

(defn get-num-newer-versions
  "Deprecated.

  returns: `int`"
  (^Integer [^BucketInfo$NumNewerVersionsDeleteRule this]
    (-> this (.getNumNewerVersions))))

