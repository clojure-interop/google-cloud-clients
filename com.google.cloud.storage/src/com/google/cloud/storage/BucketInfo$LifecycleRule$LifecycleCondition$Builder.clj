(ns com.google.cloud.storage.BucketInfo$LifecycleRule$LifecycleCondition$Builder
  "Builder for LifecycleCondition."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage BucketInfo$LifecycleRule$LifecycleCondition$Builder]))

(defn set-age
  "Sets the age in days. This condition is satisfied when a Blob reaches the specified age
   (in days). When you specify the Age condition, you are specifying a Time to Live (TTL)
   for objects in a bucket with lifecycle management configured. The time when the Age
   condition is considered to be satisfied is calculated by adding the specified value to
   the object creation time.

  age - `java.lang.Integer`

  returns: `com.google.cloud.storage.BucketInfo$LifecycleRule$LifecycleCondition$Builder`"
  (^com.google.cloud.storage.BucketInfo$LifecycleRule$LifecycleCondition$Builder [^BucketInfo$LifecycleRule$LifecycleCondition$Builder this ^java.lang.Integer age]
    (-> this (.setAge age))))

(defn set-created-before
  "Sets the date a Blob should be created before for an Action to be executed. Note that
   only the date will be considered, if the time is specified it will be truncated. This
   condition is satisfied when an object is created before midnight of the specified date in
   UTC. *

  created-before - `com.google.api.client.util.DateTime`

  returns: `com.google.cloud.storage.BucketInfo$LifecycleRule$LifecycleCondition$Builder`"
  (^com.google.cloud.storage.BucketInfo$LifecycleRule$LifecycleCondition$Builder [^BucketInfo$LifecycleRule$LifecycleCondition$Builder this ^com.google.api.client.util.DateTime created-before]
    (-> this (.setCreatedBefore created-before))))

(defn set-number-of-newer-versions
  "Sets the number of newer versions a Blob should have for an Action to be executed.
   Relevant only when versioning is enabled on a bucket. *

  number-of-newer-versions - `java.lang.Integer`

  returns: `com.google.cloud.storage.BucketInfo$LifecycleRule$LifecycleCondition$Builder`"
  (^com.google.cloud.storage.BucketInfo$LifecycleRule$LifecycleCondition$Builder [^BucketInfo$LifecycleRule$LifecycleCondition$Builder this ^java.lang.Integer number-of-newer-versions]
    (-> this (.setNumberOfNewerVersions number-of-newer-versions))))

(defn set-is-live
  "Sets an isLive Boolean condition. If the value is true, this lifecycle condition matches
   only live Blobs; if the value is false, it matches only archived objects. For the
   purposes of this condition, Blobs in non-versioned buckets are considered live.

  live - `java.lang.Boolean`

  returns: `com.google.cloud.storage.BucketInfo$LifecycleRule$LifecycleCondition$Builder`"
  (^com.google.cloud.storage.BucketInfo$LifecycleRule$LifecycleCondition$Builder [^BucketInfo$LifecycleRule$LifecycleCondition$Builder this ^java.lang.Boolean live]
    (-> this (.setIsLive live))))

(defn set-matches-storage-class
  "Sets a list of Storage Classes for a objects that satisfy the condition to execute the
   Action. *

  matches-storage-class - `java.util.List`

  returns: `com.google.cloud.storage.BucketInfo$LifecycleRule$LifecycleCondition$Builder`"
  (^com.google.cloud.storage.BucketInfo$LifecycleRule$LifecycleCondition$Builder [^BucketInfo$LifecycleRule$LifecycleCondition$Builder this ^java.util.List matches-storage-class]
    (-> this (.setMatchesStorageClass matches-storage-class))))

(defn build
  "Builds a LifecycleCondition object. *

  returns: `com.google.cloud.storage.BucketInfo$LifecycleRule$LifecycleCondition`"
  (^com.google.cloud.storage.BucketInfo$LifecycleRule$LifecycleCondition [^BucketInfo$LifecycleRule$LifecycleCondition$Builder this]
    (-> this (.build))))

