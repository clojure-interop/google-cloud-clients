(ns com.google.cloud.storage.BucketInfo$LifecycleRule$LifecycleCondition
  "Condition for a Lifecycle rule, specifies under what criteria an Action should be executed."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage BucketInfo$LifecycleRule$LifecycleCondition]))

(defn *new-builder
  "returns: `com.google.cloud.storage.BucketInfo$LifecycleRule$LifecycleCondition$Builder`"
  (^com.google.cloud.storage.BucketInfo$LifecycleRule$LifecycleCondition$Builder []
    (BucketInfo$LifecycleRule$LifecycleCondition/newBuilder )))

(defn to-builder
  "returns: `com.google.cloud.storage.BucketInfo$LifecycleRule$LifecycleCondition$Builder`"
  (^com.google.cloud.storage.BucketInfo$LifecycleRule$LifecycleCondition$Builder [^BucketInfo$LifecycleRule$LifecycleCondition this]
    (-> this (.toBuilder))))

(defn get-age
  "returns: `java.lang.Integer`"
  (^java.lang.Integer [^BucketInfo$LifecycleRule$LifecycleCondition this]
    (-> this (.getAge))))

(defn get-created-before
  "returns: `com.google.api.client.util.DateTime`"
  (^com.google.api.client.util.DateTime [^BucketInfo$LifecycleRule$LifecycleCondition this]
    (-> this (.getCreatedBefore))))

(defn get-number-of-newer-versions
  "returns: `java.lang.Integer`"
  (^java.lang.Integer [^BucketInfo$LifecycleRule$LifecycleCondition this]
    (-> this (.getNumberOfNewerVersions))))

(defn get-is-live?
  "returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^BucketInfo$LifecycleRule$LifecycleCondition this]
    (-> this (.getIsLive))))

(defn get-matches-storage-class
  "returns: `java.util.List<com.google.cloud.storage.StorageClass>`"
  (^java.util.List [^BucketInfo$LifecycleRule$LifecycleCondition this]
    (-> this (.getMatchesStorageClass))))

