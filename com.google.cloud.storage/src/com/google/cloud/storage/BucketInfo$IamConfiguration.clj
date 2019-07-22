(ns com.google.cloud.storage.BucketInfo$IamConfiguration
  "The Bucket's IAM Configuration."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage BucketInfo$IamConfiguration]))

(defn *new-builder
  "returns: `com.google.cloud.storage.BucketInfo$IamConfiguration$Builder`"
  (^com.google.cloud.storage.BucketInfo$IamConfiguration$Builder []
    (BucketInfo$IamConfiguration/newBuilder )))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BucketInfo$IamConfiguration this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BucketInfo$IamConfiguration this]
    (-> this (.hashCode))))

(defn to-builder
  "returns: `com.google.cloud.storage.BucketInfo$IamConfiguration$Builder`"
  (^com.google.cloud.storage.BucketInfo$IamConfiguration$Builder [^BucketInfo$IamConfiguration this]
    (-> this (.toBuilder))))

(defn bucket-policy-only-enabled?
  "returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^BucketInfo$IamConfiguration this]
    (-> this (.isBucketPolicyOnlyEnabled))))

(defn get-bucket-policy-only-locked-time
  "returns: `java.lang.Long`"
  (^java.lang.Long [^BucketInfo$IamConfiguration this]
    (-> this (.getBucketPolicyOnlyLockedTime))))

