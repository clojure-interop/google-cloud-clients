(ns com.google.cloud.storage.BucketInfo$IamConfiguration$Builder
  "Builder for IamConfiguration"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage BucketInfo$IamConfiguration$Builder]))

(defn ->builder
  "Constructor."
  (^BucketInfo$IamConfiguration$Builder []
    (new BucketInfo$IamConfiguration$Builder )))

(defn set-is-bucket-policy-only-enabled
  "Sets whether BucketPolicyOnly is enabled for this bucket. When this is enabled, access to
   the bucket will be configured through IAM, and legacy ACL policies will not work. When this
   is first enabled, bucketPolicyOnly.lockedTime will be set by the API automatically.
   This field can then be disabled until the time specified, after which it will become
   immutable and calls to change it will fail. If this is enabled, calls to access legacy ACL
   information will fail.

  is-bucket-policy-only-enabled - `java.lang.Boolean`

  returns: `com.google.cloud.storage.BucketInfo$IamConfiguration$Builder`"
  (^com.google.cloud.storage.BucketInfo$IamConfiguration$Builder [^BucketInfo$IamConfiguration$Builder this ^java.lang.Boolean is-bucket-policy-only-enabled]
    (-> this (.setIsBucketPolicyOnlyEnabled is-bucket-policy-only-enabled))))

(defn build
  "Builds an IamConfiguration object

  returns: `com.google.cloud.storage.BucketInfo$IamConfiguration`"
  (^com.google.cloud.storage.BucketInfo$IamConfiguration [^BucketInfo$IamConfiguration$Builder this]
    (-> this (.build))))

